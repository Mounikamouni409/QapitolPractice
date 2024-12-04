package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.DeleteCustomerForm;

public class DeleteCustomerFormTest extends BaseClass{
	
	@Test
	public void customerDelete() {
		DeleteCustomerForm d = new DeleteCustomerForm(driver);
		d.seleniumDropdown();
		d.deleteCustomerForm();
	}
	
	

}
