# ATDD-GraduateSchool
Test automation framewok code for Graduateschool website

#Technologies included in the framework

1. Gherkin (Business readable, domain specific language)
2. Cucumber (framework for acceptance test case automation)
3. JUnit (unit test framework for Test Driver Development)
4. Selenium Webdriver (browser based framework to test the UI functionalities in web applications)
5. Maven Plugin (Plugin for supporting Maven project functionalities)

#Pre-Requisites

1. JAVA runtime (preferably version 8)
2. Eclipse Cucumber Plugin
3. Browser installation according to requirements (such as Chrome, Firefox)
4. Chrome, Firefox web drivers to be installed

#Configurations

Configure details as per your requirements such as browser, web driver, testing URLs in config.properties file in the framework structure

#Running the tests in Maven

1. Clone the framework from this repo: https://github.com/GraduateSchoolUSA/ATDD-GraduateSchool.git
2. Once the code structure is ready in your IDE, go to the workspace path in command line and then
3. > mvn test

#Verifying the results
You can finally get build results for the number of test cases that you were running as part of build (a sample below)

Results :

Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 11.140 s
[INFO] Finished at: 2015-11-03T22:00:33-05:00
[INFO] Final Memory: 12M/224M
[INFO] ------------------------------------------------------------------------














