package Services;

import java.util.List;

import Domen.Student;

public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, int age); 
}
