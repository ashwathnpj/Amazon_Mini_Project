package com.amazon.Amazon_Mini_Project;
//checking if products can be sorted by relevance, price, rating, newest arrivals 

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amazon_ProductsSort extends LaunchQuit {
	@Test(retryAnalyzer=com.amazon.Amazon_Mini_Project.Retry_Logic.class)
	public void products_Sort() throws EncryptedDocumentException, IOException {
		Amazon_HomePage homepage = new Amazon_HomePage(driver);

		homepage.enter_mobiles_in_search_field(driver);

		Amazon_SearchedPage searched = new Amazon_SearchedPage(driver);
		searched.click_low_to_high_feature_option(driver);
		searched.click_high_to_low__feature_option(driver);
		searched.click_average_customer_rating_option(driver);
		searched.click_newest_arrivals_option(driver);
		searched.click_best_sellers_option(driver);
	}

}
