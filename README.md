Byteman Presentation presented to the Amsterdam Java User Group on 30 November 2023

bmunit-tutorial cli instructions:

* cd to top level eg. bmunit-tutorial-master
* mvn package to build project
* cd to app dir and run WebWriter to create html file eg. java -classpath target/bmunit-tutorial-app-1.0.0.jar org.my.app.WebWriter foo.html Nate
* mvn -P junit test to run first test (byteman + junit)
* mvn -P junit2 test to run second round of testing (byteman + junit + fault injection)

byteman-rulecheck-maven-plugin instructions:

* cd into top level eg. byteman-rulecheck-maven-plugin-example-master
* run mvn test in each example dir <- dir 1 is the working version; 2 introduces the error that is not caught; 3 error is caught by plugin