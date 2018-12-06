import java.io.IOException;
import java.util.List;

public interface Presenter {
	public List<Student> getSortedStudents() throws IOException;
	public List<Instructor> getSortedInstructors() throws IOException;
}