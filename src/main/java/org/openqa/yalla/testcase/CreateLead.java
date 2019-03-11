package org.openqa.yalla.testcase;

import org.testng.annotations.Test;

public class CreateLead extends Annotations{

	@Test(timeOut=15000)
	public void create() {
		click(locateElement("link", "Leads")); 
		click(locateElement("link", "Create Lead")); 
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "koushik");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "c");
		click(locateElement("class", "smallSubmit"));
	}
}




