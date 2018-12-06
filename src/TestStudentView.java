import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestStudentView {
	
	@Test
	public void givenStudentView_whenViewStudents_thenReturnStudents() throws IOException{
		StudentView sut = new StudentView(new PresenterImpl(new RepositoryImpl()));
		List<Student> expected = Arrays.asList(new Student("Fultz, Abby - Age 20","Fultz"), new Student("Smith Jr, Joe Alexander - Age 25","Smith"), new Student("Ware, Ethan Clay - Age 21","Ware"));
		
		List<Student> result = sut.viewStudents();
		
		for(int i = 0; i < expected.size(); i++) {
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
        }
	}
	
	/*
	@Test
	public void givenStudentViewWithMockedPresenter_whenViewStudents_thenReturnStudents(){
		
	}
	*/
}