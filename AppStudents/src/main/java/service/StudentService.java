package service;
import model.Student;
import service.IService.IStudentService;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService<Student> {
    private List<Student> students = new ArrayList<>();

    public StudentService() {
        this.students.add(new Student(1, 20, "Linh", "https://taimienphi.vn/tmp/cf/aut/anh-gai-xinh-1.jpg"));
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < this.students.size(); i++) {
            if(id == this.students.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Student student) {
        int index = this.findById(id);
        this.students.set(index, student);
    }

    @Override
    public void delete(int id) {
        int index = this.findById(id);
        this.students.remove(index);
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }
}
