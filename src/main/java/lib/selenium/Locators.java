package lib.selenium;

/**
 * Used to provide locator with Enum value
 * @author TestLeaf
 * 
 */
public enum Locators {

	 /**
	   * @param xpathExpression The XPath to use.
	   * @return A By which locates elements via XPath.
	   */
	XPATH, 
	 /**
	   * Find elements based on the value of the "class" attribute. If an element has multiple classes, then
	   * this will match against each of them. For example, if the value is "one two onone", then the
	   * class names "one" and "two" will match.
	   *
	   * @param className The value of the "class" attribute to search for.
	   * @return A By which locates elements by the value of the "class" attribute.
	   */
	CLASSNAME,
	 /**
	   * @param id The value of the "id" attribute to search for.
	   * @return A By which locates elements by the value of the "id" attribute.
	   */
	ID,
	/**
	   * @param name The value of the "name" attribute to search for.
	   * @return A By which locates elements by the value of the "name" attribute.
	   */
	NAME, 
	/**
	   * Find elements via the driver's underlying W3C Selector engine. If the browser does not
	   * implement the Selector API, a best effort is made to emulate the API. In this case, we strive
	   * for at least CSS2 support, but offer no guarantees.
	   *
	   * @param cssSelector CSS expression.
	   * @return A By which locates elements by CSS.
	   */
	CSS, 
	 /**
	   * @param linkText The exact text to match against.
	   * @return A By which locates A elements by the exact text it displays.
	   */
	LINKTETXT,
	 /**
	   * @param partialLinkText The partial text to match against
	   * @return a By which locates elements that contain the given link text.
	   */
	PARTIALLINK,
	 /**
	   * @param tagName The element's tag name.
	   * @return A By which locates elements by their tag name.
	   */
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