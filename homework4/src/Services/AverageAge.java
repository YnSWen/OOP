package Services;

import java.util.List;

import Domen.Person;

public class AverageAge <T extends Person> {
/**
 * Метод для подсчета среднего возраста, применяется к экземплярам
 * класса-наследника Person
 */
    public static <T extends Person> void getAverageAge(List<T> list){
        int result = 0;
        for (T person : list) {
            result += person.getAge();
        }
        result = result / list.size();
        System.out.println("Средний возраст: " + result);
    }
    
}
