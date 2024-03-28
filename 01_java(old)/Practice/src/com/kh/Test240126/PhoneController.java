package com.kh.Test240126;
public class PhoneController {
	private String[] result;
	
	public PhoneController() {
		result = new String[2];
	}
	
	public String[] method() {
		Phone[] phone = new Phone[2];
		phone[0] = new GalaxyNote9("Samsung");
		phone[1] = new V40("LG");
		return result;
		
	}
	
}
