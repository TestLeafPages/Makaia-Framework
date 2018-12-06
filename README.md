# Makaia-Framework
Selenium Suite - TESTLEAF
## Suite Contains
```
1) Webdriver Listeners
2) TestNG
3) Extent Reports
4) Apache POI
5) PDF Reports
6) Word Report
```
### Locators added as ENUM
```
To avoid NullPointerException in string function
Earlier Usage:
  WebElement eleUserName = locateElement("id", "username");
Now Usage: 
  WebElement eleUserName = locateElement(Locators.ID, "username");
  
New Locators
1) ButtonText
2) PartialButtonText 
```
### Pending task
- [x] Existing issue fixed
- [ ] Word Reports need to be done yet