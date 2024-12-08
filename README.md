ELECTRACK: ELECTRIC BILLING SYSTEM
CS211 – OBJECT ORIENTED PROGRAMMING
Submitted By: MENOR, DENNISE MARIE 
IT – 2102 




I. Project Overview
The ElecTrack: Electricity Billing System is a Java-based application designed to manage electricity accounts for both residential and commercial users. The system allows users to register accounts, update customer information, input electricity usage, and display calculated bills based on the units consumed. The billing rate is set at 20 pesos per unit of electricity consumed. This application serves as a practical tool for utility companies to streamline their billing processes and improve customer service.

Key Features:
•	Register residential and commercial accounts.
•	Update customer details.
•	Input electricity usage for accounts.
•	Calculate and display bills based on usage.
•	Show the customers records.
•	User-friendly console interface.
________________________________________
II. Explanation of How OOP Principles Were Applied

The project utilizes key Object-Oriented Programming (OOP) principles, which include:
1.	Encapsulation:
•	The attributes of the Account, ResidentialAccount, and CommercialAccount classes are kept private, ensuring that they can only be accessed and modified through public methods. This protects the integrity of the data.
2.	Inheritance:
•	The ResidentialAccount and CommercialAccount classes inherit from the abstract class Account. This allows for code reuse and a clear hierarchical relationship between the account types, enabling polymorphic behavior for billing calculations.
3.	Polymorphism:
•	The Billable interface defines methods (calculateBill and displayBill) that are implemented by both account classes. This allows for different behaviors (billing calculations) based on the account type while using a common interface.
4.	Abstraction:
•	The abstract class Account provides a base structure for account-related functionalities without specifying the details of billing calculations. This abstraction allows for a clear separation between the account's data and its operations.
________________________________________
III. Details of the Chosen SDG and Its Integration into the Project
The chosen Sustainable Development Goal (SDG) is Goal 7: Affordable and Clean Energy. This goal aims to ensure access to affordable, reliable, sustainable, and modern energy for all.


Integration into the Project:
•	Promoting Energy Efficiency: The billing system encourages users to monitor their electricity consumption, which can lead to more conscious 
usage of energy resources.
•	Awareness and Education: By providing a clear breakdown of electricity usage and costs, the system can help educate consumers about their energy consumption patterns and the importance of energy conservation.
•	Support for Utility Companies: By streamlining the billing process, the application supports utility companies in managing their resources efficiently, ultimately contributing to sustainable energy practices.
________________________________________
IV. Instructions for Running the Program
To run the Electricity Billing System program, follow these steps:

1.	Run the program.
Make sure that the program is working and doesn’t have any errors.

2.	Enter your command choice.
On the output, the console has many options; this includes:
•	Register Residential Account
When you choose this option, this will guide you to register a residential account. It will ask for your name and account number. After you fill up that information, the banner “Residential account registered successfully” will appear.
•	Register Commercial Account
On this option, just like the register residential account option, it will ask for your customer’s name and account number. After that, the banner “Commercial account registered successfully” will appear.
•	Update Account
On this option, the console will ask the account number and account name that you want to update, and a banner “Account updated successfully” will appear.
•	Input electricity usage
On this option, it will allow you to input your electricity usage, and it will be automatically multiplied by 20 because on this system, 1 kwh is equal to 20 pesos.
•	Display Bills
Lastly, this option will show all the information and data inside the system. All the bills and user information.
 
3.	Exit the console.
When you choose the exit option, this will automatically exit your console program and will send you to running it again.
