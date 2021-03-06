package students.repository;

import java.util.List;

import students.domain.Student;

public interface StudentDao {
	
	public void insertStudent(Student student);
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> getStudents();
	
}
