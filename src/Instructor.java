public class Instructor {
	private String fullString;
	private String lastName;
	
	public Instructor(String fullString, String lastName){
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