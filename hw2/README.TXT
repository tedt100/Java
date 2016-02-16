------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

It is tax collection time in the Kingdom of Ruritania. The kingdom taxes citizens based on the following rules:
•	Kingdom income tax is calculated based on the yearly income the citizen:
o	On the first 25,000 or part thereof citizens pay 10% of their income
o	On the next 50,000 or part thereof they pay 20% of their income
o	Income over 75,000 is taxed at 30%
Lower
Upper
Rate
0
25,000
10%
25,000.01
75,000
20%
75,000.01
-
30%
•	Citizens can claim deduction to reduce their income tax based on the number of their dependents
Dependents
Deduction
0
0
1
500
2
800
3 or more
1000
o	If deductions exceed tax due, then the tax is set to 0
•	In addition, citizens pay a flat social services state tax. The rate depends on the state of residence
o	Residents of Tokenia (TK) pay 7.5% of income
o	Residents of Rafina (RF) pay 6.5% of income
o	Residents of Xaboumi (XA) pay 6% of income
o	Residents of all other states pay 7%
•	Ruritanian expats pay Kingdom income tax and they are not eligible to claim any deductions. However, expats are exempted from paying social services state tax.
Ruritanian Revenue Services (RRS) determines the tax duty of each citizen and then deducts the tax automatically from the income.
As in the previous assignment, you start with an incomplete implementation. However, in this assignments you have more freedom in coding methods, constructors and attributes required to achieve the required results. There are two classes: Citizen which stores the demographics of Ruritanian citizens, and TaxCollector representing the logic of RRS. In the project there are two classes: Citizen which stores the demographics of Ruritanian citizens, and TaxCollector representing the logic of RRS.The included tester should work and produce the following results:
