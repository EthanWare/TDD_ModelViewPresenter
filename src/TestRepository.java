import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestRepository {
	
	private RepositoryImpl sut = new RepositoryImpl();
	
	@Test
	public void givenRepository_whenGetStudents_ThenReturnsStudents() throws IOException{
		List<Student> expected = Arrays.asList(new Student("Smith Jr, Joe Alexander - Age 25","Smith"), new Student("Ware, Ethan Clay - Age 21","Ware"), new Student("Fultz, Abby - Age 20","Fultz"));
		
		List<Student> result = sut.getStudents();
		
		for(int i = 0; i < expected.size(); i++) {
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
        }
	}
	@Test
	public void givenRepository_whenGetInstructors_ThenReturnsInstructors() throws IOException{
		List<Instructor> expected = Arrays.asList(new Instructor("Doctor Little, Do, Lecturer, CIT433","Little"), new Instructor("Professor Clark, Adjunct, CSC 439","Clark"));
		
		List<Instructor> result = sut.getInstructors();
		
		for(int i = 0; i < expected.size(); i++) {
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
        }
	}
}
