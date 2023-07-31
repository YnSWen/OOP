import java.util.Scanner;

public class Controller {
    /**
     * Контроллер для калькулятора
     */

private iCalculator calculator;

    public Controller(iCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод для вывода нужного сообщения для пользователя
     */
    private String prompt(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    /**
     * Метод считывания с консоли
     */

    private int promptInt(String msg){
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return Integer.parseInt(in.nextLine());
    }


    /**
     * Метод для запуска работы меню
     */
    public void run(){
        while(true){
            int realArg = promptInt("Введите вещественную часть числа: ");
            int imArg = promptInt("Введите мнимую часть числа: ");
            while(true){
                String cmd = prompt("Введите команду(+, *, /)");
                if (cmd.equals("+")){
                    calculator.sum(realArg, imArg);                
                }
                
                if (cmd.equals("*")){
                    calculator.multiply(realArg, imArg);
                }
                if (cmd.equals("/")){
                    calculator.devide(realArg, imArg);
                }
            String cmd2 = prompt("Еще посчитать (Y/N)?");
            if (cmd2.equals("Y")){
                continue;
            }
            break;
        
                }
            }
            
        }
        
    }


