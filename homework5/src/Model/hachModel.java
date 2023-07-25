package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** Класс для структруирования данных студентов в хэш-таблицах */
public class hachModel implements iGetModel {

    private HashMap<Long, Student> students;

    /**
     * Конструктор
     * @param students Список студентов в виде хэш-таблицы
     */

    public hachModel(HashMap<Long, Student> students) {
        this.students = new HashMap<>();
    }

    public List<Student> getAllStudents(){
        List<Student> studList = new ArrayList<Student>();
        for (Student stud: students.values()){
            studList.add(stud);
        }
        return studList;
    }
    
}
