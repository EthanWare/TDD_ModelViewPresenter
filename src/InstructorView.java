import java.io.IOException;
import java.util.List;

public class InstructorView {
	private Presenter presenter;
	
	public InstructorView(Presenter presenter){
		this.presenter = presenter;
	}
	
	public List<Instructor> viewInstructors() throws IOException{
		return presenter.getSortedInstructors();
	}
}