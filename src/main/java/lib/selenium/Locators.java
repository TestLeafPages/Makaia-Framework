package lib.selenium;

/**
 * Used to provide locator with Enum value
 * @author TestLeaf
 * 
 */
public enum Locators {

	/**
	 * Xpath to find the element
	 */
	XPATH, CLASSNAME, ID, NAME, CSS, LINKTETXT, PARTIALLINK,
	TAGNAME, 
	/**
	 * Instead of writing Xpath for button - This can be used
	 * Eg: //button[text()='value']
	 */
	BUTTONTEXT, /**
	 * Instead of writing Xpath to find partial button - This can be used
	 * Eg: //button[contains(text(),'value')]
	 */
	PARTIALBUTTONTEXT

}