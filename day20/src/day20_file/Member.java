package day20_file;

public class Member {

	private String name;
	private String gender;
	private String phoneNumber;
	
	public Member(String name, String gender, String phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret += name + "\t";
		ret += gender + "\t";
		ret += phoneNumber + "\t";
		return ret;
	}
}
