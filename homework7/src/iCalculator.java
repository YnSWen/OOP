public interface iCalculator {
    /**
     * Интерфейс калькулятора со всеми методами
     */

    iCalculator sum(double real, double im);

    iCalculator multiply(double real, double im);

    iCalculator devide(double real, double im);

    double getReal();

    double getIm(); 

    
}
