package org.Flows;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Flows123 extends BaseClass{




	@Test
	private void tc01() throws IOException, AWTException, InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://staging.flow.stax.run/#/login");
		maximize();
	}				

	@AfterClass			
	private void tc02() throws Exception {


		waits(2000);


		thread();
		WebElement user = driver.findElement(By.xpath("//*[@aria-label='Enter registered email']"));
		wait(10);

		user.click();
		Thread.sleep(1000);
		user.sendKeys("KBZPayCenter_staging@gmail.com");

		wait(50);

		try {
			java.awt.Robot r = new java.awt.Robot();
			for (int i = 0; i < 1; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(200); }
		} catch (Exception e) {
			e.printStackTrace();
		}



		wait(50);
		WebElement pass = driver.findElement(By.xpath("//flt-semantics[@aria-label='Enter Password']//input[@data-semantics-role='text-field']"));
		try {
			pass.sendKeys("2hChwQMQvdw$Jg03VSfS");
		} catch (StaleElementReferenceException e) {
		}


		wait(100);	

		WebElement loginbutn = driver.findElement(By.xpath("//*[text()='Login']"));
		wait(10);
		buttonClick(loginbutn);



		thread();
		
	
		thread();

		//ADD NEW
		
		thread();
		waitWithTimeout(driver, 20);

		WebElement element4 = driver.findElement(By.xpath("//*[text()='Add New']"));
		jsclick(driver, element4);


		thread();

		zoomOut(2);


		inputareasindex(driver, 1, "Flow1-kbzpay");

		threadhalf();

		radiobutton(driver, 1);

		threadhalf();

		clickCheckboxByIndex(1);

		clickCheckboxByIndex(3);

		clickCheckboxByIndex(4);

		clickCheckboxByIndex(5);

		threadone();

		inputareasindex(driver, 2, "689898DFG");

		threadhalf();

		inputareasindex(driver, 3, "Test@gmail.com");

		threadhalf();

		clickAutoCompleteByIndex(5);

		threadone();

		uploadFilepng();

		threadone();

		radiobutton(driver, 5);


		threadhalf();

		inputareasindex(driver, 6, "SSD488");

		threadhalf();

		clickAutoCompleteByIndex(7);

		threadhalf();

		uploadfilePdf();

		threadone();

		clickAutoCompleteByIndex(8);

		threadhalf();

		uploadfilePdf();

		threadone();


		NextButton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*

		driver.findElement(By.xpath("//*[text()='Add New']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]")).sendKeys("CUS NAME : KBZPAY-1");
		Thread.sleep(1500);

		try {
			java.awt.Robot r = new java.awt.Robot();
			for (int i = 0; i < 9; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(400); }
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//*[@tabindex='0'])[8]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[9]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[10]")).click();
		Thread.sleep(700);

		try {
			java.awt.Robot r = new java.awt.Robot();
			for (int i = 0; i < 4; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(200); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//*[@tabindex='0'])[12]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[13]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[14]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[15]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[16]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("CUS ID : 123");

		Thread.sleep(700);

		try {
			java.awt.Robot r = new java.awt.Robot();
			for (int i = 0; i < 4; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(200); }
		} catch (Exception e) {
			e.printStackTrace();
		}

		thread();
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[3]")).sendKeys("Stax1@gmail.com");

		Thread.sleep(700);
		
		try {
			java.awt.Robot r = new java.awt.Robot();
			for (int i = 0; i < 4; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(200); }
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[4]")).click();

		thread();
		java.awt.Robot r = new java.awt.Robot();
		r.setAutoDelay(500);

		StringSelection file = new StringSelection("C:\\Users\\jainu\\Downloads\\Test2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);



		thread();

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		thread();

		thread();

		Actions ac = new Actions(driver);
		for (int i = 0; i < 100; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		//SEND FOR CHECKER

		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Send for Checker')])[1]")).click();
		thread();

		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		Thread.sleep(800);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[5]")).click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Send for Checker ");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		thread();
		Actions s = new Actions(driver);
		for (int f = 0; f < 100; f++) {
			s.sendKeys(Keys.TAB).perform();
		}


		thread();


		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement logbt = driver.findElement(By.xpath("//*[@role='group']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", logbt);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement user1 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(user1);
		wait(100);
		user1.sendKeys("checker1@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement ps = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			ps.sendKeys("b27tBp22edB4vaE~upGq");
		} catch (StaleElementReferenceException e) {
		}



		WebElement loginbutn1 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(loginbutn1);

		//MARK FOR CORRECTION

		thread();


		driver.findElement(By.xpath("//*[text()='KBZPay Center KYC Change']")).click();
		thread();
		thread();


		Actions aa  = new Actions(driver);
		for (int l = 0; l < 200; l++) {
			aa.sendKeys(Keys.TAB).perform();
		}



		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Mark for Correction')])[1]")).click();

		thread();
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Mark for Correction ");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		driver.findElement(By.xpath("//*[text()='Submit']")).click();


		thread();
		thread();

		for (int l = 0; l < 200; l++) {
			aa.sendKeys(Keys.TAB).perform();
		}

		thread();


		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement logbt1 = driver.findElement(By.xpath("//*[@role='group']"));
		js.executeScript("arguments[0].click();", logbt1);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement user11 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(user11);
		wait(100);
		user11.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement ps1 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			ps1.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement loginbutn11 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(loginbutn11);


		//DONE


		thread();
		thread();
		thread();

		for (int l = 0; l < 200; l++) {
			aa.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Done')])[1]")).click();

		thread();	
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Done");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();
		thread();


		for (int i = 0; i < 100; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}

		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement logbt11 = driver.findElement(By.xpath("//*[@role='group']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", logbt11);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement user111 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(user111);
		wait(100);
		user111.sendKeys("checker1@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement ps11 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			ps11.sendKeys("b27tBp22edB4vaE~upGq");
		} catch (StaleElementReferenceException e) {
		}



		WebElement loginbutn111 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(loginbutn111);


		thread();


		driver.findElement(By.xpath("//*[text()='KBZPay Center KYC Change']")).click();

		thread();
		thread();

		for (int i = 0; i < 150; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		driver.findElement(By.xpath("(//*[@tabindex='0'])[14]")).click();

		thread();

		// DENY

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Deny')])[1]")).click();

		thread();


		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Deny");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		thread();


		thread();


		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement btn1 = driver.findElement(By.xpath("//*[@role='group']"));
		js.executeScript("arguments[0].click();", btn1);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement use = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(use);
		wait(100);
		use.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			pwd.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement lh = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(lh);

		thread();

		for (int i = 0; i < 100; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}




		//ADD NEW -- 2

		driver.findElement(By.xpath("//*[text()='Add New']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]")).sendKeys("CUS NAME : KBZPAY2");
		Thread.sleep(1000);

		for (int i = 0; i < 9; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		WebElement element1 = driver.findElement(By.xpath("(//*[@tabindex='0'])[8]"));


		thread();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[9]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[10]")).click();
		Thread.sleep(700);

		for (int i = 0; i < 6; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}
		driver.findElement(By.xpath("(//*[@tabindex='0'])[11]")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[12]")).click();

		Thread.sleep(700);


		driver.findElement(By.xpath("(//*[@tabindex='0'])[13]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[14]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[15]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[16]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("CUS ID : 567");

		Thread.sleep(700);

		for (int i = 0; i < 6; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[3]")).sendKeys("Stax2@gmail.com");

		Thread.sleep(1500);

		for (int i = 0; i < 6; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[4]")).click();

		thread();
		java.awt.Robot r1 = new java.awt.Robot();
		r1.setAutoDelay(500);

		StringSelection file1 = new StringSelection("C:\\Users\\jainu\\Downloads\\Test2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);

		r1.keyPress(KeyEvent.VK_CONTROL);

		r1.keyPress(KeyEvent.VK_V);

		r1.keyPress(KeyEvent.VK_ENTER);



		thread();

		for (int i = 0; i < 6; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//*[@tabindex='0'])[19]")).click();


		thread();

		driver.findElement(By.xpath("(//*[@spellcheck='false'])[6]")).sendKeys("PASSPORT NUM:5454 ");


		thread();
		//				try {
		//					java.awt.Robot r = new java.awt.Robot();
		//					for (int i = 0; i < 3; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(400); }
		//				} catch (Exception e) {
		//					e.printStackTrace();
		//				}
		//
		//				driver.findElement(By.xpath("(//*[@spellcheck='false'])[7]")).click();
		//
		//				thread();
		//				java.awt.Robot rrr = new java.awt.Robot();
		//				rrr.setAutoDelay(500);
		//
		//				StringSelection fii = new StringSelection("C:\\Users\\jainu\\Downloads\\Test2.png");
		//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fii, null);
		//
		//				rrr.keyPress(KeyEvent.VK_CONTROL);
		//
		//				rrr.keyPress(KeyEvent.VK_V);
		//
		//				rrr.keyPress(KeyEvent.VK_ENTER);
		//
		//				thread();


		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();




		Actions acc = new Actions(driver);
		for (int i = 0; i < 120; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		//SEND FOR CHECKER

		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Send for Checker')])[1]")).click();
		thread();

		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[5]")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Send for Checker ");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		thread();
		for (int f = 0; f < 100; f++) {
			acc.sendKeys(Keys.TAB).perform();
		}




		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement kjs = driver.findElement(By.xpath("//*[@role='group']"));
		JavascriptExecutor js11 = (JavascriptExecutor)driver;
		js11.executeScript("arguments[0].click();", kjs);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement ush3 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(ush3);
		wait(100);
		ush3.sendKeys("checker1@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement pwd3 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			pwd3.sendKeys("b27tBp22edB4vaE~upGq");
		} catch (StaleElementReferenceException e) {
		}



		WebElement bthj2 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(bthj2);

		//MARK FOR CORRECTION

		thread();


		driver.findElement(By.xpath("//*[text()='KBZPay Center KYC Change']")).click();
		thread();
		thread();


		for (int l = 0; l < 200; l++) {
			acc.sendKeys(Keys.TAB).perform();
		}



		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Mark for Correction')])[1]")).click();

		thread();
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Mark for Correction ");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("//*[text()='Submit']")).click();


		thread();





		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement lohj = driver.findElement(By.xpath("//*[@role='group']"));
		js11.executeScript("arguments[0].click();", lohj);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement usnjh = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(usnjh);
		wait(100);
		usnjh.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement PLJJK = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			PLJJK.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement BTNJJ = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(BTNJJ);


		//REQUEST FOR CLOSURE


		thread();
		thread();

		for (int l = 0; l < 200; l++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Request for closure')])[1]")).click();

		thread();	


		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		thread();
		driver.findElement(By.xpath("//*[text()='Customer refused']")).click();



		thread();
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Request for Closure");
		Thread.sleep(700);
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();
		thread();


		for (int i = 0; i < 100; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement logbt111 = driver.findElement(By.xpath("//*[@role='group']"));
		js11.executeScript("arguments[0].click();", logbt111);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement user1111 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(user1111);
		wait(100);
		user1111.sendKeys("admin_kbzpay_KYC@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement ps111 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			ps111.sendKeys("hcTvK$ulXWxQZOiSobWW");
		} catch (StaleElementReferenceException e) {
		}



		WebElement loginbutn1111 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(loginbutn1111);



		thread();
		thread();

		for (int i = 0; i < 250; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}



		thread();

		// DENY

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Deny')])[1]")).click();

		thread();


		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Deny");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		for (int i = 0; i < 100; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}




		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement lohj1 = driver.findElement(By.xpath("//*[@role='group']"));
		js11.executeScript("arguments[0].click();", lohj1);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement use1 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(use1);
		wait(100);
		use1.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement jsdh = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			jsdh.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement sss = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(sss);



		// REOPEN

		thread();

		for (int i = 0; i < 100; i++) {
			ac.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Re open')])[1]")).click();

		thread();


		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Reopen");
		Thread.sleep(700);
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();



		thread();
		for (int f = 0; f < 100; f++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		thread();


		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement kjs1 = driver.findElement(By.xpath("//*[@role='group']"));
		js11.executeScript("arguments[0].click();", kjs1);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement ush31 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(ush31);
		wait(100);
		ush31.sendKeys("checker1@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement pwd31 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			pwd31.sendKeys("b27tBp22edB4vaE~upGq");
		} catch (StaleElementReferenceException e) {
		}



		WebElement bthj21 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(bthj21);



		thread();


		driver.findElement(By.xpath("//*[text()='KBZPay Center KYC Change']")).click();
		thread();


		for (int f = 0; f < 100; f++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		//VERIFIED

		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Verified')])[1]")).click();
		thread();

		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[5]")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[7]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Verified ");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("//*[text()='Submit']")).click();


		thread();


		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement lohj11 = driver.findElement(By.xpath("//*[@role='group']"));
		js11.executeScript("arguments[0].click();", lohj11);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement use11 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(use11);
		wait(100);
		use11.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement jsdh1 = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			jsdh1.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement sss1 = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(sss1);


		thread();

		for (int i = 0; i < 100; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		thread();

		//ADD NEW -- 3

		driver.findElement(By.xpath("//*[text()='Add New']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]")).sendKeys("CUS NAME : KBZPAY3");
		Thread.sleep(2000);
		
		for (int i = 0; i < 9; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		WebElement jj = driver.findElement(By.xpath("(//*[@tabindex='0'])[8]"));

		
		thread();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", jj);
		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[9]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[10]")).click();
		Thread.sleep(700);

		for (int i = 0; i < 5; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}
		driver.findElement(By.xpath("(//*[@tabindex='0'])[11]")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[12]")).click();

		Thread.sleep(700);
		

		driver.findElement(By.xpath("(//*[@tabindex='0'])[13]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[14]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[15]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[16]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("CUS ID : 567");

		Thread.sleep(700);
		
		for (int i = 0; i < 8; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[3]")).sendKeys("Stax2@gmail.com");

		Thread.sleep(1500);
		
		for (int i = 0; i < 6; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//*[@autocomplete='off'])[4]")).click();

		thread();
		java.awt.Robot r5 = new java.awt.Robot();
		r5.setAutoDelay(500);

		StringSelection file11 = new StringSelection("C:\\Users\\jainu\\Downloads\\Test2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file11, null);

		r5.keyPress(KeyEvent.VK_CONTROL);

		r5.keyPress(KeyEvent.VK_V);

		r5.keyPress(KeyEvent.VK_ENTER);



		thread();
		
		for (int i = 0; i < 6; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		driver.findElement(By.xpath("(//*[@tabindex='0'])[19]")).click();


		thread();

		driver.findElement(By.xpath("(//*[@spellcheck='false'])[6]")).sendKeys("PASSPORT NUM:5454 ");

		
		thread();
//		try {
//			java.awt.Robot r = new java.awt.Robot();
//			for (int i = 0; i < 3; i++) { r.keyPress(KeyEvent.VK_TAB);  Thread.sleep(400); }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		driver.findElement(By.xpath("(//*[@spellcheck='false'])[7]")).click();
//
//		thread();
//		java.awt.Robot rrr = new java.awt.Robot();
//		rrr.setAutoDelay(500);
//
//		StringSelection fii = new StringSelection("C:\\Users\\jainu\\Downloads\\Test2.png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fii, null);
//
//		rrr.keyPress(KeyEvent.VK_CONTROL);
//
//		rrr.keyPress(KeyEvent.VK_V);
//
//		rrr.keyPress(KeyEvent.VK_ENTER);
//
//		thread();


		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();




		for (int i = 0; i < 120; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		//SEND FOR CHECKER

		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Send for Checker')])[1]")).click();
		thread();

		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("(//*[@tabindex='0'])[5]")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Send for Checker ");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();

		thread();
		for (int f = 0; f < 100; f++) {
			acc.sendKeys(Keys.TAB).perform();
		}




		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement oioik = driver.findElement(By.xpath("//*[@role='group']"));
		js.executeScript("arguments[0].click();", oioik);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement qwqw = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(qwqw);
		wait(100);
		qwqw.sendKeys("checker1@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement jhj = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			jhj.sendKeys("b27tBp22edB4vaE~upGq");
		} catch (StaleElementReferenceException e) {
		}



		WebElement oghg = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(oghg);

		//MARK FOR CORRECTION

		thread();


		driver.findElement(By.xpath("//*[text()='KBZPay Center KYC Change']")).click();
		thread();
		thread();


		for (int l = 0; l < 200; l++) {
			acc.sendKeys(Keys.TAB).perform();
		}



		thread();
		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Mark for Correction')])[1]")).click();

		thread();
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Mark for Correction ");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		Thread.sleep(700);

		driver.findElement(By.xpath("//*[text()='Submit']")).click();


		thread();





		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement jhjh = driver.findElement(By.xpath("//*[@role='group']"));
		js.executeScript("arguments[0].click();", jhjh);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement trr = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(trr);
		wait(100);
		trr.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement phhghg = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			phhghg.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement iiubbn = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(iiubbn);


		//REQUEST FOR CLOSURE


		thread();
		thread();

		for (int l = 0; l < 200; l++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Request for closure')])[1]")).click();

		thread();	


		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		thread();
		driver.findElement(By.xpath("//*[text()='Customer refused']")).click();



		thread();
		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Request for Closure");
		Thread.sleep(700);
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();
		thread();


		for (int i = 0; i < 100; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}

		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement oihh = driver.findElement(By.xpath("//*[@role='group']"));
		js1.executeScript("arguments[0].click();", oihh);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();




		//LOGIN 


		thread();
		WebElement popo = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(popo);
		wait(100);
		popo.sendKeys("admin_kbzpay_KYC@gmail.com");

		thread();
		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(800);
		WebElement pwds = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(800);



		try {
			pwds.sendKeys("hcTvK$ulXWxQZOiSobWW");
		} catch (StaleElementReferenceException e) {
		}



		WebElement iuiu = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(iuiu);



		thread();

		Actions lklk = new Actions(driver);
		for (int i = 0; i < 100; i++) {
			lklk.sendKeys(Keys.TAB).perform();
		}



		thread();

		// CLOSE APPLICATION

		driver.findElement(By.xpath("(//flt-semantics[@role='button' and contains(text(),'Close Application')])[1]")).click();

		thread();


		driver.findElement(By.xpath("//*[@autocorrect='off']")).sendKeys("Testing - Close Application");
		thread();
		wait(300);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		thread();
		
		for (int i = 0; i < 100; i++) {
			lklk.sendKeys(Keys.TAB).perform();
		}




		//Logout
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


		WebElement ttt = driver.findElement(By.xpath("//*[@role='group']"));
		js.executeScript("arguments[0].click();", ttt);

		thread();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();



		//LOGIN 


		thread();
		WebElement oioi = driver.findElement(By.xpath("(//*[@autocomplete='off'])[1]"));
		buttonClick(oioi);
		wait(100);
		oioi.sendKeys("KBZPayCenter@gmail.com");

		for (int i = 0; i < 1; i++) {
			acc.sendKeys(Keys.TAB).perform();
		}


		Thread.sleep(1000);
		WebElement hhh = driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]"));

		Thread.sleep(1000);

		try {
			hhh.sendKeys("9gU#1DJC5JFqxSRgPYVE");
		} catch (StaleElementReferenceException e) {
		}


		Thread.sleep(1000);

		WebElement kjkj = driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(700);
		buttonClick(kjkj);
*/





	}

}



