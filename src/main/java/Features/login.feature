Feature: MyStore ContactUs Page Feature

  Scenario: ContactUs Page Test Scenario

    Given user is already on Home Page
    When title of ContactUs page is My Store
    Then user clicks on ContactUs link and ContactUs Page displays
    Then user clicks on Subject Handling drop down button and selects Customer service
    Then user enters Email address and Order Number
    Then user clicks on Attach file and selects a file to upload
    Then user navigates to message section and enters Message and click send button

