import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;
import Domen.Teacher;
import Services.AverageAge;

public class App {
    public static void main(String[] args) throws Exception {

        // Создаем студентов
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 131);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
        Student s7 = new Student("Александр",  23, 154);
        Student s8 = new Student("Виктория",  21, 109);

        // Создаем два списка студентов
        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();

        // Добавляем студентов в List первой группы
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);

        // Добавляем студентов в List второй группы
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        
        // Образуем две группы, присваеваем id
        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group32 = new StudentGroup(listStud2, 32);

        // Создаем поток групп
        List<StudentGroup> stream1 = new ArrayList<StudentGroup>();
        
        // Добавляем группы в поток
        stream1.add(group4580);
        stream1.add(group32);


        // Вывод потока до сортировки
        for (StudentGroup group: stream1){
            System.out.println(group);
        }

        System.out.println("*********************");

        // // Вывод потока после сортировки
        // Collections.sort(stream1.getStreams());
        // for (StudentGroup group : stream1){
        //     System.out.println(group);
        // }

        AverageAge.getAverageAge(listStud1);

    }
}