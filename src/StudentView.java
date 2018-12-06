import java.io.IOException;
import java.util.List;

public class StudentView {
	private Presenter presenter;
	
	public StudentView(Presenter presenter){
		this.presenter = presenter;
	}
	
	public List<Student> viewStudents() throws IOException{
		return presenter.getSortedStudents();
	}
}