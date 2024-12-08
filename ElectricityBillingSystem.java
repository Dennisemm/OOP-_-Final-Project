import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Billable {
    double calculateBill();
    void displayBill();
}

abstract class Account implements Billable {
    private String customerName;
    private String accountNumber;

    public Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class ResidentialAccount extends Account {
    private double unitsConsumed;

    public ResidentialAccount(String customerName, String accountNumber, double unitsConsumed) {
        super(customerName, accountNumber);
        this.unitsConsumed = unitsConsumed;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    @Override
    public double calculateBill() {
        return unitsConsumed * 20;
    }

    @Override
    public void displayBill() {
        System.out.println("Residential Account Bill for " + getCustomerName() + ": " + calculateBill() + " pesos");
    }
}

class CommercialAccount extends Account {
    private double unitsConsumed;

    public CommercialAccount(String customerName, String accountNumber, double unitsConsumed) {
        super(customerName, accountNumber);
        this.unitsConsumed = unitsConsumed;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    @Override
    public double calculateBill() {
        return unitsConsumed * 20;
    }

    @Override
    public void displayBill() {
        System.out.println("Commercial Account Bill for " + getCustomerName() + ": " + calculateBill() + " pesos");
    }
}

public class ElectricityBillingSystem {
    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nElectricity Billing System");
            System.out.println("1. Register Residential Account");
            System.out.println("2. Register Commercial Account");
            System.out.println("3. Update Account");
            System.out.println("4. Input Electricity Usage");
            System.out.println("5. Display Bills");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerResidentialAccount();
                    break;
                case 2:
                    registerCommercialAccount();
                    break;
                case 3:
                    updateAccount();
                    break;
                case 4:
                    inputElectricityUsage();
                    break;
                case 5:
                    displayBills();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void registerResidentialAccount() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        accounts.add(new ResidentialAccount(name, accountNumber, 0));
        System.out.println("Residential account registered successfully.");
    }

    private static void registerCommercialAccount() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        accounts.add(new CommercialAccount(name, accountNumber, 0));
        System.out.println("Commercial account registered successfully.");
    }

    private static void updateAccount() {
        System.out.print("Enter account number to update: ");
        String accountNumber = scanner.nextLine();
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.print("Enter new customer name: ");
                String newCustomerName = scanner.nextLine();
                account.setCustomerName(newCustomerName);
                System.out.println("Account updated successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void inputElectricityUsage() {
        System.out.print("Enter account number to input usage: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();
        scanner.nextLine();
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                if (account instanceof ResidentialAccount) {
                    ((ResidentialAccount) account).setUnitsConsumed(units);
                } else if (account instanceof CommercialAccount) {
                    ((CommercialAccount) account).setUnitsConsumed(units);
                }
                System.out.println("Electricity usage updated successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void displayBills() {
        for (Account account : accounts) {
            account.displayBill();
        }
    }
}