package com.tests;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.TestBase;

public class godady123  extends TestBase {
@BeforeTest
public void initialize() throws IOException
{
	driver = intializeDriver();
	driver.get(prop.getProperty("godaddyurl"));
}

	@Test
	public void basePageNavigation() throws IOException
	{
	
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}
		String Title = driver.getTitle();
		System.out.println("Title =" + Title);
//		Assert.assertEquals(Title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		Assert.assertTrue(Title.contains("Online Marketing Tools"));
		String Url = driver.getCurrentUrl();
		System.out.println("Current url =" + Url);
		Assert.assertEquals(Url, "https://in.godaddy.com/");
		String ps = driver.getPageSource();
		Assert.assertTrue(ps.contains("Online Marketing Tools"));
		System.out.println(Title);
		
		}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
}
