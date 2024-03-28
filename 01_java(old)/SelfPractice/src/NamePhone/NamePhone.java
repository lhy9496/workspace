package NamePhone;
public class NamePhone {
	
	// 필드 영역
	private String name;
	private String area;
	private String agency;
	private String number;
	
	// 생성자 영역
	public NamePhone(String name, String area, String agency, String number) {
		this.name = name;
		this.area = area;
		this.agency = agency;
		this.number = number;
	}

	// 메소드 영역
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void print() {
		
	}

	@Override
	public String toString() {
		return "[이름 = " + name + ", 지역 = " + area + ", 통신사 = " + agency + ", 핸드폰 번호 = " + number + "]";
	}	
}
