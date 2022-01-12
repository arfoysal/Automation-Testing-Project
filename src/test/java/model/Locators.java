package model;

import org.openqa.selenium.By;
import io.github.cdimascio.dotenv.Dotenv;

public class Locators {
	Dotenv dotenv = Dotenv.load();
	// HomePage
	public String homePageUrl = "https://www.rokomari.com/book";
	public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
	public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
	//public By home_welcomeMassage = By.cssSelector(".header-left .welcome-msg");
	
	
	//login/SingUp page
	public String googleSignInPage_Title = "প্রবেশ করুন - Google অ্যাকাউন্টস";
	public String googleSignInPage_MessageText = "rokomari.com";
	public String signInEmailText = dotenv.get("email");
	public String signInPasswordText = dotenv.get("pass");
	public String loginUserNameText = dotenv.get("name");
	
	public By signInButton = By.xpath("//a[normalize-space()='Sign in']");
	public By singUpWithGoogleButton = By.xpath("//span[normalize-space()='Google']");
	public By googleSingInPage_Message = By.cssSelector("button[type='button']");
	public By signInEmail = By.cssSelector("#identifierId");
	public By signInPassword = By.cssSelector("input[name='password']");
	public By signNext = By.xpath("//span[contains(text(),'পরবর্তী')]");
	public By loginUserName = By.cssSelector(".user-name");
	
	
    //Browsing for books 
	public String writingButtonText = "লেখক";
	public String writerNameAndBooksText = "হুমায়ূন আহমেদ এর বই সমূহ";
	public String productPageTitle = "Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com";
	
	public By writerButton = By.cssSelector("#js--authors");
	public By writerName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"); 
	//public By writerNameAndBooks = By.cssSelector("div[class='col-lg-12'] h1");
	
	// Filter Categories
	public String categorySomokalinText = "সমকালীন উপন্যাস";
	public String categoryStoryCollectionText = "রচনা সংকলন ও সমগ্র";
	public String categorychildandteen = "শিশু-কিশোর গল্প";
	public String checkSomokalinValue = "677";
	public String checkStoryCollectionValue = "1321";
	public String checkChildandteenValue = "692";
	
	public By filterCategoriesList = By.xpath("//ul[@id='categoryIds'] //li");
	public By checkfilterCatagoriesList = By.xpath("//*[@type='checkbox']");
	//Products Nest page 
	public String currentPagenumbeText = "2"; 
	public String addtocardFortThItemJs = "document.querySelectorAll(\".btn.cart-btn.js--add-to-cart\")[3]";
	
	public By nextPageButton= By.xpath("//a[normalize-space()='Next']");
	
	public By currentpageNumber = By.cssSelector(".current");
	public By bookName = By.xpath("(//p[1])[@class='book-title'][4]");
	//public By selectThirdtBook = By.xpath("//button[@class='btn cart-btn js--add-to-cart']");
	//public By bookTitle = By.xpath("(//h1)[1]");
	//public By addtoCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	
	// My Card page
	
	public String my_CartPageTitle = "My Cart | Rokomari.com";
	public String my_CartPageUrl = "https://www.rokomari.com/cart";
	
	public By clickCardButton = By.cssSelector(".js--cart-amount.amount");
	public By cardPageBookTitle = By.xpath("(//a)[27]");
	public By cardPageWriterName = By.xpath("(//p)[16]");
	public By clickGoToShippingPageBy = By.xpath("//span[normalize-space()='Go to Shipping Page']");
	
	//Shipping Address Page
	public String shippingPageTitle = "Shipping Address | Rokomari.com";
	public String customer_nameText = dotenv.get("customer_name");
	public String phoneNumberText = dotenv.get("number");
	public String countryName = "Bangladesh";
	public String countryNameNotSelectedOne = "Poland";
	public String cityName = "বান্দরবান";
	public String areaName = "রোয়াংছড়ি";
	public String zoneName = "নোয়াপতং ইউনিয়ন";
	public String addressText = "I just Write my address";
	
	public By customer_name = By.xpath("(//input[@id='name'])[1]");
	public By phoneNumber = By.xpath("//input[@id='phone']");
	public By selectCountry  = By.cssSelector("#js--country");
	public By selectCity  = By.cssSelector("#js--city");
	public By selectArea  = By.cssSelector("#js--area");
	public By selectZone  = By.cssSelector("#js--zone");
	public By address = By.xpath("//textarea[@id='address']");
	public By paymentCOD = By.xpath("//label[@for='cod']");
	public By confirm_Order = By.xpath("//span[normalize-space()='Confirm Order']");
	
	//Logout
	public By signout = By.xpath("//a[normalize-space()='Sign Out']");
	 
}
