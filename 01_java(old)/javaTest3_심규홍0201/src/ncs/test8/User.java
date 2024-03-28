package ncs.test8;

import java.util.Arrays;
import java.util.Objects;

// implements Cloneable을 호출하여 clone메소드에 사용
public class User implements Cloneable {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender
				+ " " + phone;
	}
	
	// 생성한 배열과 카피한 배열을 비교하는 메소드
	public boolean equals(Object obj) {
	    // 1. 주소값 비교
	    if (this == obj) return true;

	    // 2. null 체크 및 클래스 타입 비교
	    if (obj == null || getClass() != obj.getClass()) return false;

	    // 3. 필드값들이 일치하는지 확인
	    User otherUser = (User) obj;
	    return age == otherUser.age &&
	            gender == otherUser.gender &&
	            Objects.equals(id, otherUser.id) &&
	            Objects.equals(password, otherUser.password) &&
	            Objects.equals(name, otherUser.name) &&
	            Objects.equals(phone, otherUser.phone);
	    /*
	    boolean isEquals = false;
	    if(obj instanceof User) {
	    	User tmpUser = ((User)obj);
	    	if(this.getName().equals(tmpUser.getName()) &&
	    	   this.getId().equals(tmpUser.getId()) &&
	    	   this.getPassword().equals(tmpUser.getPassword()) &&
	    	   this.getAge() == tmpUser.getAge() &&
	    	   this.getGender() == tmpUser.getGender() &&
	    	   this.getPhone().equals(tmpUser.getPhone())) {
	    		is Equals = true;
	    	}
	    }
	    return isEquals;
	    */
	}
	
	// 호출한 Cloneable 클래스에 들어있는 메소드인 .clone() 메소드를 사용하여
	// UserTest 클래스에서 생성한 users 배열 인덱스에 입력된 정보를 복사한다.
	public Object clone() {
	    try {
	        User clonedUser = (User) super.clone();
	        // 만약 참조형 필드가 있다면, 그에 맞게 복사를 수행
	        // clonedUser.setSomeField((SomeType) someField.clone());
	        return clonedUser;
	    }
	    // CloneNotSupportedException 예외를 처리하기 위한 코드
	    // 복제가 허용되지 않은 객체를 복제하려고 시도할 때 이 예외가 발생.
	    // Cloneable 인터페이스를 구현하고 clone 메서드를 오버라이드하여 복제 로직을 구현해야 합니다.
	    catch (CloneNotSupportedException e) {
	        return null;
	    }
	    /*
	    User newUser = new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
	    return newUser;
	    */
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
