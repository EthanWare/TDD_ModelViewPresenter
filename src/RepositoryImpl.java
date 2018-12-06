import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository {
	public RepositoryImpl(){
	}
	
	@Override
	public List<Student> getStudents() throws IOException{
		File file = new File("data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		List<Student> students = new ArrayList<>();
		String str;
		while ((str = br.readLine()) != null){
			if(str.indexOf("-") != -1)
				students.add(new Student(str,str.substring(0,str.indexOf(" "))));
		}
		
		br.close();
		return students;
	}
	@Override
	public List<Instructor> getInstructors() throws IOException{
		File file = new File("data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		List<Instructor> instructors = new ArrayList<>();
		String str;
		while ((str = br.readLine()) != null){
			if(str.indexOf("-") == -1)
				instructors.add(new Instructor(str, str.substring(str.indexOf(" ") + 1,str.indexOf(","))));
		}
		
		br.close();
		return instructors;
	}
}
