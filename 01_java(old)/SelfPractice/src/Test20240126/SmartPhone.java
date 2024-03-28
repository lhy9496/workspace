package Test20240126;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	private String maker;
	
	public SmartPhone() {
		this.maker = "";
	}
	
	public abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
}
