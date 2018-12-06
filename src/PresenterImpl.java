import java.io.IOException;
import java.util.List;

public class PresenterImpl implements Presenter{
	private Repository repo = new RepositoryImpl();
	
	public PresenterImpl(Repository repo){
		this.repo = repo;
	}
	@Override
	public List<Student> getSortedStudents() throws IOException {
		List<Student> students = repo.getStudents();
		
		//bubble sort
		for(int i = students.size() - 1; i >= 0; i--){
			for(int j = 1;j <= i;j++){
				if(students.get(j-1).getLastName().compareTo(students.get(j).getLastName()) > 0){
					Student temp = students.get(j-1);
					students.set(j-1, students.get(j));
					students.set(j,temp);
				}
			}
		}
		return students;
	}

	@Override
	public List<Instructor> getSortedInstructors() throws IOException {
List<Instructor> instructors = repo.getInstructors();
		
		//bubble sort
		for(int i = instructors.size() - 1; i >= 0; i--){
			for(int j = 1;j <= i;j++){
				if(instructors.get(j-1).getLastName().compareTo(instructors.get(j).getLastName()) > 0){
					Instructor temp = instructors.get(j-1);
					instructors.set(j-1, instructors.get(j));
					instructors.set(j,temp);
				}
			}
		}
		return instructors;
	}
	
}
