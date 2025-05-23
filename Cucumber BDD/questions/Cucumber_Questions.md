# Questions

## 1. What is Cucumber?  
Cucumber is a testing framework that supports Behavior-Driven Development (BDD). It allows you to write test cases in a natural language format, known as Gherkin, which is easily understandable by non-technical stakeholders.

## 2. What are the key components of Cucumber?  
The key components of Cucumber are:  
1. Feature files written in Gherkin syntax  
2. Step definitions written in programming languages such as Java, Ruby, or JavaScript  
3. Runner classes to execute the feature files  
4. Hooks for setup and teardown operations  
5. Tags to organize and run specific scenarios or features  

## 3. What is Gherkin syntax?  
Gherkin is a business-readable, domain-specific language used to describe the behavior of a software application in a structured format. It consists of predefined keywords such as `Given`, `When`, `Then`, `And`, and `But`, which help in writing scenarios in a human-readable format.

## 4. What are the advantages of using Cucumber for testing?  
Some advantages of using Cucumber for testing include:  
1. Improved collaboration between technical and non-technical stakeholders  
2. Easy-to-understand feature files facilitate clear communication and documentation  
3. Reusability of step definitions across different scenarios  
4. Integration with various programming languages and testing frameworks  
5. Ability to generate reports for test results and coverage analysis  

## 5. How do you write a scenario in a feature file?  
Scenarios in feature files are written using Gherkin syntax. Each scenario typically consists of a title, followed by steps using `Given`, `When`, `Then`, `And`, or `But` keywords to describe the behavior being tested.

## 6. Explain the concept of tags in Cucumber.  
Tags are annotations used to organize and filter scenarios or features. They can be added to feature files, scenarios, or individual steps. Tags are prefixed with the `@` symbol and can be used to mark scenarios for different purposes such as smoke testing, regression testing, or to specify the environment.

## 7. What are step definitions?  
Step definitions are the implementation of the steps described in feature files. They are written in programming languages like Java, Ruby, or JavaScript and are responsible for executing the corresponding actions or validations when a step is matched during test execution.

## 8. How do you parameterize steps in Cucumber?  
Steps can be parameterized by using placeholders in Gherkin syntax, typically enclosed within angle brackets. These placeholders can then be passed as arguments to step definition methods. For example:  
```gherkin
Given I have <number> cucumbers
```  
can be matched with:  
```java
@Given("I have {int} cucumbers")
```

## 9. Explain the concept of background in Cucumber.  
Background is a feature in Cucumber that allows you to specify steps that are common to all scenarios in a feature file. These steps are executed before each scenario in the feature file, reducing duplication and improving readability.

## 10. How do you handle data tables and scenario outlines in Cucumber?  
Data tables and scenario outlines are used for parameterization and data-driven testing in Cucumber.  
- **Data tables** are used to pass tabular data to steps.  
- **Scenario outlines** allow you to define a scenario template that can be executed with different sets of data.  


11. What are the keywords used in Gherkin syntax?
Common keywords include:
1. Feature: Defines a high-level application feature.
2. Scenario: Describes a specific user behavior within a feature.
3. Given: Defines preconditions before the scenario starts.
4. When: Describes the action taken by the user.
5. Then: Describes the expected outcome after the action.
6. And: Combines multiple steps within a scenario.
7. But: Combines multiple steps within a scenario but represents negative statements.
8. Scenario Outline: Describes a specific user behavior within a feature with data driven testing
9. * : Wild card keyword used in place of Given, When and Then
Optional:
10. Description: Description about the scenario
11. #comment: To provide the comments about the code


12. How do you handle data-driven testing with Cucumber?
Cucumber supports data tables in feature files to provide multiple sets of data for a scenario. Step
definitions can access this data using libraries like DataTable.

13. How do you handle errors and exceptions in Cucumber tests?
Java exception handling mechanisms can be used within step definitions. Assertions from libraries like
JUnit can verify expected behavior.

14. What are hooks in Cucumber, and how are they used?
Hooks in Cucumber are special methods or blocks of code that run before or after certain events in the
execution of Cucumber scenarios. They allow you to perform setup and teardown tasks, such as initializing
data or closing resources.

1. Hooks are methods that run before or after scenarios (or entire features) for setup/teardown or logging
purposes.
2. Not part of the feature file.
3. Can be written in step definition class or can be written in a separate configuration file.

15. How many types of hooks are there in Cucumber?
There are four types of hooks in Cucumber:
1. @Before - Before each scenario
2. @After - After each scenario
3. @BeforeStep - Before each step of the scenario
4. @AfterStep - After each step of the scenario

16. What is the purpose of using @BeforeStep and @AfterStep hooks?
@BeforeStep and @AfterStep hooks allow you to execute setup and teardown tasks before and after each step
in a scenario. This can be useful for actions such as logging, capturing screenshots, or setting up context
for individual steps.

17. How do you prioritize hooks in Cucumber?
Hooks can be prioritized using the order attribute. By default, hooks are executed in the order they are
defined, but you can specify a numerical value to control the execution order.

18. What are the benefits of using Hooks?
1. Improved Code Readability: Separating setup and cleanup logic from test steps makes the code cleaner and
easier to understand.
2. Reduced Redundancy: Common setup and cleanup tasks can be defined in hooks, avoiding repetitive code across
scenarios.
3. Better Test Organization: Hooks help structure your tests by separating concerns and promoting modularity.

19. What the are 2 types of expressions supported in Cucumber?
1. Regular Expression
2. Cucumber Expression

Rules for using Expressions:
============================
1. Step def file will be generating the Cucumber Expression by default.
2. We can also use Regular Expression in Step def file.
3. Both Cucumber and Regular Expressions can't be used in single method of Step def file.

20. Regular Expression Quantifiers and examples?
([0-9]) -> Digits between 0 to 9
Quantifiers - It defines how many times a character should appear.
===========
+
*
?
{n}

([0-9]+)   -> 0 to 9 digits (One or more)
([0-9]{4}) -> 0000, 9999, 1212, 1234, 5678
([0-9]*)   -> 0 to 9 digits (Zero or more)
([0-9]?)   -> 0 to 9 digits (Zero or once)

21. How do you access DataTable values in step definitions?
In Java, DataTable values are accessed using the DataTable class. You can retrieve the data as a
list of lists or as a list of maps, depending on your preference.

22. What is the difference between a list of lists and a list of maps when accessing DataTable values?
A list of lists represents the DataTable as rows and columns, where each row is represented as a list
of strings. A list of maps represents the DataTable as a list of dictionaries, where each row is
represented as a map with column names as keys and cell values as values.

23. How do you convert a DataTable into a list of lists in Cucumber?
In Java, you can convert a DataTable into a list of lists using the asList() method:
List<List<String>> data = dataTable.asLists();

24. When would you use DataTables in Cucumber scenarios?
DataTables are useful when you need to test scenarios with multiple input combinations or when you
want to provide structured input data directly within the feature files. They are commonly used in
scenarios involving data-driven testing or parameterization.

25. Can you provide an example of using DataTables for parameterization in Cucumber?
Scenario Outline: Login with different credentials
  Given I am on the login page
  When I enter the following username and password
    | Username | Password |
    | <username> | <password> |
  And I click the login button
  Then I should be logged in successfully

  Examples:
    | username | password |
    | user1    | pass1    |
    | user2    | pass2    |

26. How do you handle dynamic DataTables with varying column lengths in Cucumber?
You can use scenario outlines with Examples tables to handle dynamic DataTables with varying column
lengths. Each row in the Examples table represents a different set of data, allowing you to handle
different DataTable structures dynamically.

27. Are DataTables mutable in Cucumber?
No, DataTables are immutable by default in Cucumber. Once created, the data in a DataTable cannot be
modified.

28. What is BDD Approach?
Software Example
================
Imagine you're creating a shopping cart system on a website. Traditionally, developers might just code
based on a vague description. But with BDD:

Story time: Everyone involved gets together (developers, designers, someone representing the customers).
They discuss a user story, like "As a customer, I want to add items to my cart so I can buy them later."

Examples speak louder: They break down the story into specific examples. "If I add a shirt to my cart,
the quantity should be 1. If I add another shirt, the quantity should be 2." These examples become like
mini-tests for the developers.

Shared language: They use plain language to describe these examples, focusing on what the user sees and
does ("When I click 'Add to Cart'...", "Then I should see '1 item in your cart'").

Building with a guide: Developers use these clear examples as a guide to write the code. They can even
automate these examples as tests, so they know if the code works as expected.

Here's the key: BDD focuses on the behavior the system should have, from the user's perspective. It's
about clear communication and making sure everyone is on the same page before any coding starts. This
helps avoid building features that miss the mark.

Food Example
============
Imagine you're baking a cake. Before you start mixing ingredients or preheating the oven, you think
about how you want the cake to taste and look. You might want it to be moist, chocolatey, and have a
nice, fluffy texture. You also want it to look beautiful when it comes out of the oven, with smooth
frosting and maybe some decorations on top.

Now, think of BDD as a similar process, but for building software instead of baking a cake. Before
writing any code, you think about how you want your software to behave. You describe its behavior in
simple terms, just like you'd describe the taste and appearance of your cake.

For example, if you're building a website, you might say, "When a user clicks on the 'Sign Up' button,
they should be taken to a registration page." That's like describing how you want a certain part of
your software to work.

Once you have these descriptions, you use them as a guide for writing your code. You make sure your
code makes the software behave the way you described. And just like baking a cake, you keep refining
and testing until you get it just right.

So, BDD is all about starting with clear descriptions of how you want your software to behave, and
then building it to match those descriptions. It's a way to make sure your software does what it's
supposed to do, and it involves everyone in the process, not just the developers.

29. Is BDD is a test automation framework?
BDD is a process or approach rather than a specific test automation framework. BDD is a collaborative
approach to software development that emphasizes clear communication between developers, testers, and
stakeholders. It focuses on defining the desired behavior of the software from the user's perspective,
before any coding begins.

However, there are frameworks and tools that support the BDD process by providing features to write,
manage, and automate tests based on the behavior-driven principles.

One popular framework for implementing BDD is Cucumber, which allows you to write tests in a human-
readable format called Gherkin. Gherkin uses keywords like "Given," "When," and "Then" to describe the
behavior of the software in a structured way. These descriptions can then be automated using programming
languages like Java, Ruby, or JavaScript, depending on the specific implementation.

30. What is the purpose of the features attribute in @CucumberOptions?
The features attribute specifies the location of the feature files that contain the Gherkin syntax
defining the behavior of the application.

31. Explain the significance of the tags attribute in @CucumberOptions.
The tags attribute allows you to specify which scenarios to include or exclude during test execution
based on the tags assigned to them in the feature files. In this case, @hooksTagDemo specifies that
only scenarios tagged with @hooksTagDemo will be executed.

32. What does the glue attribute represent in @CucumberOptions?
The glue attribute specifies the package where the step definitions are located. Cucumber uses this
information to locate the step definitions corresponding to the steps defined in the feature files.

33. Describe the purpose of the plugin attribute in @CucumberOptions.
The plugin attribute allows you to specify the different types of reports or formats in which you want
to generate the test results. In this example, it includes the pretty format for console output, JSON
and JUnit formats for report files, and an extent report adapter for generating Extent reports.

34. What does the publish attribute do in @CucumberOptions?
The publish attribute specifies whether to publish the generated reports to a server or location
specified in the configuration. In this case, publish = true indicates that the reports will be
published.

35. Explain the significance of the monochrome attribute in @CucumberOptions.
The monochrome attribute determines whether the console output should be displayed in a monochrome
format (without colors) or in a colored format. Setting monochrome = true ensures that the console
output is easier to read by removing colors.

36. What is the purpose of the strict attribute in @CucumberOptions?
The strict attribute specifies whether to treat undefined and pending steps as errors. When
strict = true, any undefined or pending steps will cause the test execution to fail, ensuring
that all steps are properly implemented.

37. How can you rerun only the failed scenarios in Cucumber?
In Cucumber, you can rerun only the failed scenarios by using plugins like rerun or by implementing
a custom solution. The rerun plugin generates a .txt file containing the paths of the failed scenarios.
You can then run Cucumber again using this file to rerun only the failed scenarios.

38. Can you explain how the rerun plugin works in Cucumber?
The rerun plugin in Cucumber generates a .txt file that contains the paths of the failed scenarios.
After the initial test run, if there are any failed scenarios, the plugin creates this file. You can
then pass this file as input to another test run to rerun only the failed scenarios, thereby speeding
up the debugging process.

1. Configure your Cucumber runner to utilize the rerun plugin. This plugin generates a file named
rerun.txt in the target directory after test execution. This file contains information about
the failed scenarios, including their line numbers.
2. Create a separate runner class specifically for rerunning failed scenarios.
3. In this runner class, point the features property to the rerun.txt file using the @ symbol before
the path.
4. Run this separate runner class to execute only the scenarios listed in the rerun.txt file.

39. What are the ways to rerun failed scenarios in Cucumber?
When we use TestNG for execution, then we have 2 ways to run the Cucumber failed scenarios.
1. Use of rerun plugin from Cucumber
2. Use of testng-failed.xml file from TestNG

40. How would you skip scenarios using tags in Cucumber?
To skip scenarios using tags, you can tag the scenarios that you want to skip and then provide a tag
expression to exclude those tags during execution. For example, if you have scenarios tagged with @skip,
you can exclude them by providing the tag expression not @skip to the Cucumber runner.

41. Besides tags, are there other ways to skip scenarios in Cucumber?
Yes, you can also skip scenarios programmatically within your hooks. You can use conditional logic to
determine whether a scenario should be executed based on certain conditions, and if not, you can skip
it using Cucumber's Scenario object.

In Hook Steps File,
@Before(value = "@skipScenario", order = 0)
public void skipScenarioExecution(Scenario scenario){
    System.out.println("Skipped Scenario : " + scenario.getName());
    Assume.assumeTrue(false);
}
