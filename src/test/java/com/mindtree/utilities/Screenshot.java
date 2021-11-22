package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.reusableComponant.Base;

public class Screenshot extends Base {
	
	
	public static String getScreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+result+".png";
		
		FileUtils.copyFile(src,new File(path));
		return path;
	}

}
