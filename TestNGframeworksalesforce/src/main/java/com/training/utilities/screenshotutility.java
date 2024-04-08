package com.training.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotutility {
	public void	takescreenshot(WebDriver driver) {
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		Date current =new Date();
		String timestamp=new SimpleDateFormat("mm-dd-yyyy  HH-mm-ss").format(current);
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		String userdir= System.getProperty("user.dir");
		 String fileseparator=System.getProperty("file.separator");
		String filepath=userdir+ fileseparator+"screenshot"+fileseparator+"salesforece"+timestamp+".jpeg";
		File destfile=new File(filepath);
		try {
			FileUtils.copyFile(srcFile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
