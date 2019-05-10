
You are going to re-design and modify the software application for automating the parking and exit functions at a commercial parking garage from Unit 2.
Name this project: XXXXX-U4-ParkingApp

Most people are familiar with commercial parking facilities, but for those who aren�t, here�s how it works:

Many, but not all commercial parking garages, use two automated teller machines � one for checkin and one for checkout.  
The process begins when you drive your vehicle up to the automated checkin machine -- it issues a ticket which indicates your checkin time and date. This ticket is kept in the vehicle until you checkout.

When you are ready to leave the garage you drive your vehicle to the automated checkout machine and insert your ticket into the machine. 
The machine then reads the checkin time and date and based on this calculates (using a special formula) how long you parked your vehicle in the garage and how much you owe. 
These values are displayed on an electronic display on the automated checkout machine. You then must pay this fee by cash or credit card, which you insert in the machine. 
At that point a bill is provided and the system will assume you paid before you are allowed to exit the garage.

Those are the basics of how it works. Remember, this is an automated system, so there are no clerks or other people at the machines.

Design the software to be usable by ANY parking garage business. Assume you have one business customer now. You should be able to configure the software for other businesses in the future by simply 
changing your configuration information in the startup class. Put all configuration information in that class.

A key competency for creating good object-oriented software is proper domain modeling � finding the conceptual objects in the problem domain. 
Make a list of nouns that represent the terms used in commercial parking garage software (and these specifications) and use those for your class names. 
If you are not familiar with these terms it is up to you to do research, perhaps by using an Internet search engine to find out about commercial parking garage software. 

Another key competency is creating a conceptual plan. You need to figure out the data flow from object to object, and to decide object responsibilities.
Pay special attention to the Single Responsibility Principle and the Principle of Least Knowledge.

A key feature of this program is support for varying fee calculation strategies. Every commercial parking garage business has a different way of calculating fees for parked vehicles. 
And often an individual parking garage business will change its fee strategy, perhaps to increase the fees or better compete with other garages. The result is that these fee strategies change often. 
We don�t want to have to revise existing code every time a fee strategy changes. So the solution is to use the DIP/Strategy Pattern to create two or more interchangeable implementations. Then, in the future,
should new implementations be needed, a programmer can create them based on a common interface and add them to the program. But only the configuration info in the Startup class needs modification to change
fee strategies � no other part of the program should need source code changes. 

Here are three, interchangeable fee calculation strategies to get you started. Create all three:

Minimum Maximum Fee Calculator
The fee charged for parked vehicles is based on a $5.00 minimum fee to park for up to three hours. After that there is an additional $1.00 per hour charge for each hour or part of an hour parked. 
The maximum charge for any given 24-hour period is $15.00. Assume that no vehicle parks for longer than 24 hours.

Special Event Fee Calculator
This is a flat fee of $20.

Lost Ticket Fee Calculator
This is a flat fee of $25.

Input

SCREENS AND FILEIO is only thing in those 2 classes

BIG GUY: Garage
CheckIn
+NewTicket
+SpecialEvent

CheckOut
+SubmitTicket
+LostTicket
For input, create a class that emulates a machine that has two buttons:

Check/In
Special Events
 

 Best Value Parking Garage

 =========================

 1 � Check/In

 2 � Special Event

 3 � Close Garage

 =>_

 

 

And a second machine that you submit your ticket to.

 

 Best Value Parking Garage

 =========================

 1 � Check/Out

 2 � Lost Ticket

 =>_

 

 

For the Check/In, the start time should be created by a class that randomly creates a time between 7am and noon.  This class should easily be replaced with a class that would access the real time.  
(But that would be harder to test)

The second Machine should produce the bill.  If the ticket is checked/In, a check-out time between 1pm and 11pm should randomly be created.

Output

Once the ticket is submitted, a bill is produced.

 

 Best Value Parking Garage

 =========================

 Receipt for a vehicle id 105

 

 4 hours parked  11am � 3pm

 $6.00

 

 

 

 Best Value Parking Garage

 =========================

 Receipt for a vehicle id 106

 

 Special Event

 $20.00

 

 

 

 Best Value Parking Garage

 =========================

 Receipt for a vehicle id 107

 

 Lost Ticket

 $25.00

 

 

 Once �Close Garage� is selected, a summary of activity to date is produced.

 

 Best Value Parking Garage

 =========================

 Activity to Date

 

 $120 was collected from 13 Check Ins

 $60 was collected from 3 Special Events

 $50 was collected from 2 Lost Tickets

 

 $230 was collected overall

 

 

 