# IT-Bootcamp-Reinforcement-Project
Manual and Automation testing with Maven, TestNG, Selenium, Apache poi, Page Object Model design pattern, plus simple sample of  JavaFaker's classes to generate fake data

website for testing : https://sandbox.2checkout.com/sandbox

Registration Page is redirected and not reachable on 16 may(today), and instead of that registration from inside is used.

Task:
➔ Test whether it is possible to log in if the user registration step has been skipped (whether it can log in using data that has never been saved in the user database).

➔ Test whether the registration form works by entering data for one user.

➔ Check in detail whether it is possible to register without entering all fields.

➔ Find how to automatically generate a data set, and create an xlsx or xls file that is populated with the data needed to register 30 users.

➔ Register 30 people, where the data about each person is read from the xlsx or xls file. For each person, check whether the registration was successful.

➔ Test user login if this has not been done in the previous steps.

➔ Test the addition of 5 products - only basic data needs to be filled in. (Load the necessary data from the xlsx or xls file, create products and check if their creation is successful).

➔ Increase the price of previously created products by 100 and check the success of changes.

➔ Write a Bug Report and fill it in using information found by automatic and manual testing.

◆ Create one test suite to run tests from all TestNG classes.
◆ Instead of a Java project, create a Maven project.
