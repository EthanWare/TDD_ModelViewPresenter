import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestPresenter {
	@Mock
    Repository repo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    
	
	@Test
	public void givenPresenter_whenGetSortedStudents_ThenReturnsSortedStudents() throws IOException{
		PresenterImpl sut = new PresenterImpl(new RepositoryImpl());
		List<Student> expected = Arrays.asList(new Student("Fultz, Abby - Age 20","Fultz"), new Student("Smith Jr, Joe Alexander - Age 25","Smith"), new Student("Ware, Ethan Clay - Age 21","Ware"));
		
		List<Student> result = sut.getSortedStudents();
		
		for(int i = 0; i < expected.size(); i++)
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
	}
	@Test
	public void givenPresenter_whenGetSortedInstructors_ThenReturnsSortedInstructors() throws IOException{
		PresenterImpl sut = new PresenterImpl(new RepositoryImpl());
		List<Instructor> expected = Arrays.asList(new Instructor("Professor Clark, Adjunct, CSC 439","Clark"), new Instructor("Doctor Little, Do, Lecturer, CIT433","Little"));
		
		List<Instructor> result = sut.getSortedInstructors();
		
		for(int i = 0; i < expected.size(); i++)
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
	}
	
	/*
	@Test
	public void givenPresenterWithMockedRepo_whenGetSortedStudents_ThenReturnsSortedStudents() throws IOException{
		List<Student> expected = Arrays.asList(new Student("Fultz, Abby - Age 20","Fultz"), new Student("Smith Jr, Joe Alexander - Age 25","Smith"), new Student("Ware, Ethan Clay - Age 21","Ware"));
		Mockito.when(repo.getStudents()).thenReturn(Arrays.asList(new Student("Smith Jr, Joe Alexander - Age 25","Smith"), new Student("Ware, Ethan Clay - Age 21","Ware"), new Student("Fultz, Abby - Age 20","Fultz")));
		Presenter sut = new PresenterImpl(repo);
		
		List<Student> result = sut.getSortedStudents();
		
		for(int i = 0; i < expected.size(); i++) 
            assertEquals(result.get(i).getFullString(), expected.get(i).getFullString());
	}
	@Test
	public void givenPresenterWithMockedRepo_whenGetSortedInstructors_ThenReturnsSortedInstructors(){
		
	}
	*/
}