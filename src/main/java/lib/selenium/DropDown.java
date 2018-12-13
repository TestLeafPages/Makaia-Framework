package lib.selenium;
/**
 * Models a SELECT tag, providing helper methods to select and deselect options.
 */

public enum DropDown {
	/**
	 * Select all options that display text matching the argument. That is, when given "Bar" this
	 * would select an option like:
	 *
	 * &lt;option value="foo"&gt;Bar&lt;/option&gt;
	 *
	 * @param text The visible text to match against
	 * @throws NoSuchElementException If no matching option elements are found
	 */
	VISIBLETEXT, 
	/**
	 * Select the option at the given index. This is done by examining the "index" attribute of an
	 * element, and not merely by counting.
	 *
	 * @param index The option at this index will be selected
	 * @throws NoSuchElementException If no matching option elements are found
	 */
	INDEX, 
	/**
	 * Select all options that have a value matching the argument. That is, when given "foo" this
	 * would select an option like:
	 *
	 * &lt;option value="foo"&gt;Bar&lt;/option&gt;
	 *
	 * @param value The value to match against
	 * @throws NoSuchElementException If no matching option elements are found
	 */
	VALUE

}
