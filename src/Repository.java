import java.io.IOException;
import java.util.List;

public interface Repository {
	List<Student> getStudents() throws IOException;
	List<Instructor> getInstructors() throws IOException;
}