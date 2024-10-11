package com.amazon.Amazon_Mini_Project;
//testing, searching for products using its name like mobiles 


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


public class Amazon_SearchProduct extends LaunchQuit{
	@Test(retryAnalyzer=com.amazon.Amazon_Mini_Project.Retry_Logic.class)
	public void search_product() throws EncryptedDocumentException, IOException {
		Amazon_HomePage homepage=new Amazon_HomePage(driver);
		homepage.enter_mobiles_in_search_field(driver);	
	}

}
