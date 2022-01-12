
# Rokomari.com Automation using using Page object Model
# [Live Allure Report](https://rokomari-report-arfoysal.netlify.app/)
## Link: https://rokomari-report-arfoysal.netlify.app/
## Technology used
  
- Test tool:  Selenium Webdriver 
- Language: Java  
- Architecture: POM
- Framework: TestNG
- IDE: Eclipse  
  
## Pre Requisites:
  
- Open/install Java JDK 16 version on your PC  
- Install Maven on your PC  
- Install TestNG on your IDE  
- Install Eclipse/STS or any other IDE  
- Setup Java, Maven environment on your PC  
- Chrome Browse  

## Requirements:
- Set Configure build path libraries with JRE System Library 1.8 or above 
- Create a .env file in home directory and write...  
```
    email = "Enter your G-suit gmail address"  
    pass = "Enter your email password"  
    name = "Enter your gmail name"  
    coustomer_name = "Enter Product recipients name"  
    number = "Enter Product recipients phone number"
```
## The Steps executed in these Automation are:

### TestCase 01: Test_001_HomePage

- Open the Opera browser
- Go to Rokomari Web Site
- Maximize the browser window
- Wait for complete Pageload
- Perform testng 
- Take a screenshot 

### TestCase 02: Test_002_SignUpWithGoogle

- Hover on Sign In button
- click on Sign up with Google button
- Perform testng
- Provide gmail credential and complete Sign up/ Sign IN
- Perform testng & highlights username 
- Take a screenshot 

### TestCase 03: Test_003_SelectProduct
- Hover on লেখক & click-on হুমায়ূন আহমেদ
- Wait for Complete Pageload
- Fileter Category by selecting সমকালীন উপন্যাস and রচনা সংকলন ও সমগ্র
- Scroll down and and click on next for move to nextpage 
- Wait for Complete Pageload
- Select the fourth book on the page to add-to-card
- Perform testng
- Take screenshot

### TestCase 04: Test_004_MyCartPage

- Click cart icon to go-to My-cart page 
- Wait for Complete Pageload
- Perform testng
- Take screenshot

### TestCase 05: Test_005_ShippingPage

- Click on Go to Shipping Page Button
- Wait for Complete Pageload
- Fill-up forms wih with name & phone number
- Select বান্দরবান from drop-down as a City
- Select রোয়াংছড়ি from drop-down as an Area
- Select নোয়াপতং ইউনিয়ন from drop-down as a Zone
- Provide address text in text field 
- Select COD as payment option
- Scroll-down & Highlights Confirm Order Button
- Perform testng
- Take Screenshot

### TestCase 06: Test_006_Logout

- Click on User Name Button
- Click on User sign Out Button from drop-down 
- Perform testng
- Take Screenshot
- Close browser


## Run the script:
- Right Click on testng.xml file
- Then select Run as TestNG
- Run the Cases
- Close the program


## Authors

- [@arfoysal](https://www.github.com/arfoysal)

