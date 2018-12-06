/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) throws IOException {
		class ViewStudents {
			public ViewStudents(){
				
			}
			
		}
		class ViewInstructors {
			public ViewInstructors(){
				
			}
			
		}
		class Presenter {
			public Presenter(){
			}
			public ArrayList<StudentModel> getSortedStudentsObjects(){
				Collections.sort(al);
			}
			public ArrayList<InstructorModel> getSortedInstructorsObjects(){
				Collections.sort(al);
			}
		}
		class Repository {
			public Repository(){
			}
			
			
			File file = new File("data.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);
		}
		class StudentModel {
			private String fullString;
			private String lastName;
			
			public StudentModel(String fullString, String lastName){
				this.fullString = fullString;
				this.lastName = lastName;
			}
			public String getFullString(){
				return fullString;
			}
			public String getLastName(){
				return fullString;
			}
		}
		class InstructorModel {
			private String fullString;
			private String lastName;
			
			public InstructorModel(String fullString, String lastName){
				this.fullString = fullString;
				this.lastName = lastName;
			}
			public String getFullString(){
				return fullString;
			}
			public String getLastName(){
				return fullString;
			}
		}
	}
}
*/