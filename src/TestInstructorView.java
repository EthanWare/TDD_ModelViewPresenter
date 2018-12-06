import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestInstructorView {
	
	@Test
	public void givenInstructorView_whenViewInstructors_thenReturnInstructors() throws IOException{
		InstructorView sut = new InstructorView(new PresenterImpl(new RepositoryImpl()));
		List<Instructor> expected = Arrays.asList(new Instructor("Professor Clark, Adjunct, CSC 439","Clark"), new Instructor("Doctor Little, Do, Lecturer, CIT433","Little"));
		
		List<Instructor> result = sut.viewInstructors();
		
		for(int i = 0; i < expected.size(); i++) {
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
        }
	}
	
	/*
	@Test
	public void givenInstructorViewWithMockedPresenter_whenViewInstructors_thenReturnInstructors(){
		
	}
	*/
}