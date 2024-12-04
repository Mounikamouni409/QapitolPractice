package com.guru99demo.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.FileUpload;

public class FileUploadTest extends BaseClass{
	
	
	@Test
	public void file() throws AWTException {
		FileUpload f = new FileUpload(driver);
		f.seleniumDropdown();
		f.fileUpload();
	}
	
	

}
