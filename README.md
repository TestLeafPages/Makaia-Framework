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
*Earlier Usage:*
```
 WebElement eleUserName = locateElement("id", "username");
```
**Now Usage:**
```
WebElement eleUserName = locateElement(Locators.ID, "username");
```
### Browsers added as ENUM
*Earlier Usage:*
```
browserName = "chrome";
```
**Now Usage:**
```
browserName=Browser.Firefox;
```
### DropDown added as ENUM
*Earlier Usage:*
```
3 methods to select dropdown
```
**Now Usage:**
```
 selectDropDown(DropDown.INDEX, eleLogin, 1);
 selectDropDown(DropDown.VISIBLETEXT, eleLogin, "values");
```
  
**New Custom Locators:**
1) ButtonText
2) PartialButtonText 

### Data Provider Updates
```
String cellValue = "";
try{
	//	cellValue = row.getCell(j).getStringCellValue();
	CellType cellType = row.getCell(j).getCellTypeEnum();	
	if (cellType != CellType.STRING) {
		row.getCell(j).setCellType(CellType.STRING);
	}
	cellValue = row.getCell(j).getStringCellValue();
}catch(NullPointerException e){}
data[i-1][j]  = cellValue; // add to the data array
						
```
### Pending task
- [x] Existing issue fixed
- [ ] Word Reports need to be done yet
- [ ] TestNg listeners
- [ ] POM parallel execution sample
- [ ] BDD Reports