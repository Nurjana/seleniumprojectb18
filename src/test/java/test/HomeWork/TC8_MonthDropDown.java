package test.HomeWork;

public class TC8_MonthDropDown {


}
/*
TC#8: Cybertek “month” dropdown list of default values verification
1. Do both verifications in the same test
2. Verify list of months are correct as expected.
o Expected: Options should contain all 12 months of the year.
Some hints: Try to combine your Java logic as much as you can.
o You need to do your setup in BeforeClass rather than doing it in BeforeMethod to be
able to continue in the same opened browser
o You need to use LocalDate class from Java for the first assertion
o You need to use Java Lists of Strings, WebElements etc.
Step by step solutions TC#7:
1. Create new class
2. Create new method named à setUp, annotate with BeforeClass
3. Do your setup: open browser, get the page
4. Create new method named à month_default_values_test , annotate with test
5. Locate month dropdown using Select class
6. You need to verify the actual month default value
7. Get the current month name as String using LocalDate and store it in expected as String
8. Get selectedOption and store its value in actual as String
9. Compare both values.
Step by step solutions TC#8:
1. Create a list of Strings and write all the months in the year. This will be our expected
values.
2. Get all the actual options from the select dropdown and store it in a list of web elements
3. You cannot compare a list of web elements with a list of strings.
4. Create a list of strings, ArrayList. This list will act as our container.
5. You need to store the values in the list of web elements, get their string values and add
those values into the previously created container list.
6. You can direcly assert.equals both lists.
7. If both lists contains same item, your assertion will pass.
 */
