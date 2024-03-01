Feature: Getir E2E Test Automation Framework

    #Go to basket and verify that it is empty
  #go to items list and print all list and verify that size is 12
  #Go to second category and add two different items
  #Go back the home page
  #Go to basket again
  #Verify total amount

    Scenario: Getir Basket Test
        When The user opens Getir app and enters "hello@getir.com" and "hello"
        Then The user logins successfully
        When The user clicks basket button
        Then The user verifies that basket is empty and able to see "There is no result"
        When The user able to see all menu list in console and verifies that size is "12"
        And The user clicks category which is "Atıştırmalık"
        And The user scrolls down to items and adds 2 items
            |Ürün 9|
            |Ürün 13|
        And The user clicks basket button
        Then The user verifies that "Total Amount : 149 ₺"