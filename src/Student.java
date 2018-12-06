public class Student {
	private String fullString;
	private String lastName;
	
	public Student(String fullString, String lastName){
		this.fullString = fullString;
		this.lastName = lastName;
	}
	public String getFullString(){
		return fullString;
	}
	public String getLastName(){
		return lastName;
	}
}