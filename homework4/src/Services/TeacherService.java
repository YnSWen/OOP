package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Student;
import Domen.Teacher;
import Domen.Person;
import Domen.PersonComparator;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    private String acadDegree;

    public TeacherService() {
        this.teachers = new ArrayList <Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, acadDegree);
        count++;
        teachers.add(per);
    }

    public void sortByFIOStdLst() {
        teachers.sort(new PersonComparator<Teacher>());

}
}
