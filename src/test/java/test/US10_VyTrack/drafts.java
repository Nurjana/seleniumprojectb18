package test.US10_VyTrack;

public class drafts {
}

//@Ignore
//    @Test(priority = 1)
//    public void TC_1_Cars_cost_information() throws Exception {
//        //1 - Verifuing that you are on the Vehicle page
//
////        Vehicle Costs ASSERTION
//        WebElement VehicleCosts = Driver.getDriver().findElement(By.xpath("//h1[.='Vehicle Costs']"));
//        Assert.assertTrue(VehicleCosts.isDisplayed());
//
//        //2 - Verify that actual page contains "Grid Settings" dropdown menu.
//        //    "Truck Driver" user must see the "Grid Settings" dropdown menu.
//        //3 - Click on "Grid Settings" dropdown and select there "All" options.
//        //    Then choose "Total price" and "Type" from check-box in drop-down menu.
//        //    Click on "close" button, or somewhere else.
//        //    "Truck Driver" user should be able: to see the "Grid Settings" dropdown menu,
//        //    click on it, and see result, such as selected "Total price" / "Type", and close menu.
//
//        //GridButton ASSERTION
//        WebElement griButton = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
//        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        Assert.assertTrue(griButton.isDisplayed());
//        griButton.click();
//
//        //Click ALL options
//        WebElement all = Driver.getDriver().findElement(By.xpath("//a[@data-role='column-manager-show-all']")); //a[@class='column-filter-renderable-tab active']
//        //System.out.println(all.getAttribute("class"));
//
//        //Allocate elements for selecting
//        WebElement typeCeck = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[2]//td[3]"));
//        WebElement priceCeck = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[3]//td[3]"));
//        WebElement dataCeck = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[4]//td[3]"));
//
//        //CHECK BOXES and RADIO BUTTONS;
//        //    .isSelected() - returns true if checkbox is selected
//        //    .isEnabled()  - returns true if checkbox is enabled(active).
//
//        if (!all.getAttribute("class").contains("active")) {
//            all.click();
//            if (typeCeck.isSelected()) {
//            } else {
//                typeCeck.click();
//            }
//            if (priceCeck.isSelected()) {
//            } else {
//                priceCeck.click();
//            }
//            if (dataCeck.isSelected()) {
//            } else {
//                dataCeck.click();
//            }
//        }
//        Driver.getDriver().findElement(By.xpath("//div[@class='dropdown-menu']//span[@class='close']")).click();
//
//
////      4 - Verify that actual page contains "View Per Page" dropdown menu.
////      "Truck Driver" user must see the "View Per Page" dropdown menu.
//        WebElement viewPerPage = Driver.getDriver().findElement(By.xpath("//div[@class='page-size pull-right form-horizontal']//div//label")); //div[@class='page-size pull-right form-horizontal']
//        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        //viewPerPAge.getText();
//        Assert.assertTrue(viewPerPage.isDisplayed());
//
////      2 - Verify that actual page contains "Type"list
////      "Truck Driver" user must see the "Total Price" list
//        WebElement typeList = Driver.getDriver().findElement(By.xpath("//span[@class='grid-header-cell__label'][1]"));
//        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        Assert.assertTrue(typeList.isDisplayed());
//
////      3 - Verify that actual page contains "Total Price" list
////      "Truck Driver" user must see the "Total Price" list
//        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("(//thead//th[@class='grid-cell grid-header-cell grid-header-cell-TotalPrice sortable renderable shortenable-label number-cell'])[1]"));
//        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        Assert.assertTrue(totalPrice.isDisplayed());
//
////      5 - Click on "View Per Page" dropdown menu and select there "100" option.
//        Driver.getDriver().findElement(By.xpath("(//div[@class='btn-group'])[3]")).click(); //div[@class='btn-group']//ul//li[4]
//
//        List<WebElement> listVehicles = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']//tr//td[1]"));
//        List<WebElement> listPrices = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']//tr//td[2]"));
//        List<WebElement> whole = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']//tr//td"));
//
//        int Vehicles = 0, match = 0, actualVehicles = 0;
//
//        for (int i = 0; i < listVehicles.size(); i++) { //1
//            Vehicles++; //14
//            if (!whole.get(i).getText().contains(listPrices.get(i).getText())) {
//                match++;
//            }
//            if (!listVehicles.get(i).getText().isEmpty()) {
//                actualVehicles++;
//            }
//        }
//        System.out.println("Vehicle list contains: " + Vehicles + " items" +
//                "\nActual vehicles: " + actualVehicles +
//                "\nVehicles that contains price: " + match);
//
//        Assert.assertEquals(match, Vehicles); // it fails
//    }
//
//@Ignore
//    @Test(priority = 2)
//    public void TC_2_Vehicle_cost_cancelation() throws Exception {
//        Faker faker = new Faker();
////  2.1 - Verify that actual page contains "Create Vehicle Costs" button and click on it.
////        Get the first actual vehicle name and price from list, for further verifuing.
////  "Truck Driver" user must see the "Create Vehicle Costs" button, must be able to click on it, and must be navigated on the next page.
//
//        WebElement createVehicleCostsButton = Driver.getDriver().findElement(By.partialLinkText("Create Vehicle Costs"));
//        Assert.assertTrue(createVehicleCostsButton.isDisplayed());
//        createVehicleCostsButton.click();
//
//        WebElement summerTiers = Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[1]"));
//        String summerTiersTXT = summerTiers.getText();
//        WebElement summerTiresPrice = Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[2]"));
//        String summerTiresPriceTXT = summerTiresPrice.getText();
//
////  2.2 - Verify that actual page contains "Create Vehicle Costs" name.
////  "Truck Driver" user must see "Create Vehicle Costs" name on the page.
//        WebElement createVehicleCostsTEXT = Driver.getDriver().findElement(By.partialLinkText("Create Vehicle Costs"));
//        Assert.assertTrue(createVehicleCostsTEXT.isDisplayed());
//
//
////  2.3 - Verify that actual page contains "Type" dropdown menu.
////  "Truck Driver" user must see the "Type" dropdown menu.
//        WebElement typeDropdown = Driver.getDriver().findElement(By.xpath("//span[@class='select2-chosen']"));
//        Assert.assertTrue(typeDropdown.isDisplayed());
//
////  2.4 - Verify that actual page contains "Total Price ($)" input box.
////  "Truck Driver" user must see the "Total Price ($)" input box.
//        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[TotalPrice]']")); //input[@id='custom_entity_type_TotalPrice-uid-5effd241288aa']
//        Assert.assertTrue(totalPrice.isDisplayed());
//
////  2.5 - Verify that actual page contains "Cancel" button.
////  "Truck Driver" user must see on the actual page "Cancel button".
//        WebElement cancel = Driver.getDriver().findElement(By.xpath("//a[@title='Cancel']"));
//        Assert.assertTrue(cancel.isDisplayed());
//
////  2.6 - Verify that actual page contains "Date" input box.
////  "Truck Driver" user must be able to see "Date" input box.
//        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Choose a date']"));
//        Assert.assertTrue(date.isDisplayed());
//
////  2.7 - Click on "Type" dropdown and select there any options.
////  "Truck Driver" user must be able to choose any option and see the selected option as default.
//        Select dropdownList = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='custom_entity_type[Type]']")));
////        //span[@class='select2-chosen']
//        dropdownList.selectByIndex(2);
//        Thread.sleep(3000);
//
////  2.8 - Click on "Total Price ($)" input box and add any price.
////  "Truck Driver" user must be able to add the price and see the price in input box.
//        totalPrice.sendKeys(faker.numerify("50000"));
//
////  3.0 - Click on "Cancel" button.
////  https://qa3.vytrack.com/entity/Extend_Entity_VehicleCosts
////"Truck Driver" user must be able to click on "Cancel button" and be navigated on the "Vehicle Costs" page.
//        cancel.click();
//
////  3.1 - Verify that actual page contains "Vehicle Cost" name.
////  "Truck Driver" user must see "Vehicle Costs" name on the page.
//        WebElement VehicleCosts = Driver.getDriver().findElement(By.xpath("//h1[.='Vehicle Costs']"));
//        Assert.assertTrue(VehicleCosts.isDisplayed());
//
//
////  3.3 - Check if the last added value of "Type" and "Total Price" are same as before.
////  "Truck Driver" user must see the same "Type", and "Total Price" after selecting name, price and canceling.
//        WebElement lastInput1 = Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[1]"));
//        WebElement lastInput2 = Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[2]"));
//        Assert.assertTrue(summerTiersTXT.equals(lastInput1.getText()));
//        Assert.assertTrue(summerTiresPriceTXT.equals(lastInput2.getText()));
//    }
//
//@Ignore
//    @Test(priority = 3)
//    public void TC_3_Edit_Delete_VehicleCosts() throws Exception {
//        Faker faker = new Faker();
////  2.1 - Verify that actual page contains "Create Vehicle Costs" button and click on it.
////        Get the first actual vehicle name and price from list, for further verifuing.
////  "Truck Driver" user must see the "Create Vehicle Costs" button, must be able to click on it, and must be navigated on the next page.
//
//        WebElement createVehicleCostsButton = Driver....