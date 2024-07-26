#Author: Salma
Feature: Xiaomi Homepage

  #Scenario Outline: Display the Product Page
  #  Given admin is on the homepage
  #  When admin hovers over the menu "<menu>"
  #  And admin clicks on the submenu "<submenu>"
  #  Then admin is directed to the page that contains the message "<verificationText>"
  # Examples:
  #    | menu         | submenu             | verificationText|
  #    | Smart Home   | Maison connectée    | Maison Connectée|
  #    | Smart Home   | Traitement de l'air | Traitement de L'air|
  #Scenario Outline: Display the Product Page
  #  Given admin is on the homepage
  #  When admin hovers over the menu "<menu>"
  #  And admin clicks on the submenu "<submenu>"
  #  Then admin is directed to the page that contains the message "<verificationText>"
  #  When admin clicks on product "<productName>"
  #  Then admin is directed to the page that contains the product name "<productName>"
  # Examples:
  #   | menu         | submenu             | verificationText|productName |
  #  | Smart Home   | Maison connectée    | Maison Connectée|Mi Camera 2K Magnetic Mount|
  
  Scenario Outline: Display the Product Page
    Given admin is on the homepage
    When admin hovers over the menu "<menu>"
    And admin clicks on the submenu "<submenu>"
    Then admin is directed to the page that contains the message "<verificationText>"
    When admin clicks on product "<productName>"
    Then admin is directed to the page that contains the product name "<productName>"
    When admin add the product to the shopping cart
    And admin clicks on cart button 
    And admin clicks on show cart button
    Then admin is directed to the page that contains the message "Shopping Cart" and the product name "<productName>" 

    Examples: 
      | menu       | submenu          | verificationText | productName                             |
      | Smart Home | Maison connectée | Maison Connectée | Mi Temperature and Humidity Monitor Pro |
