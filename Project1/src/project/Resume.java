package project;

public class Resume {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String age;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	private String degree;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	private String branch;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private String contactNumber;
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	void data()
	{
		System.out.println("Name     :  "+getName());
		System.out.println("Age      :  "+getAge());
		System.out.println("Degree   :  "+getDegree());
		System.out.println("Branch   :  "+getBranch());
		System.out.println("Contact  :  "+getContactNumber());
	}
}


