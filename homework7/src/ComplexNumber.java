
public class ComplexNumber {
    /** 
     * Класс комплесного числа, содержит конструктор для создания нового
     * комплесного числа и методы для выполнения мат. операций, в данном
     * случае для сложения, умножения и деления 
     * @param real вещественная часть числа
     * @param im мнимая часть чиста
     */
    private double real;
    private double im;

    /**
     * Конструтор 
     */
    public ComplexNumber(double real, double im) {
        this.real = real;
        this.im = im;
    }

    /**
     * Геттеры
     */

    public double getReal() {
        return real;
    }


    public double getIm() {
        return im;
    }

    /**
     * Метод для суммирования комплексных чисел
     */
    public ComplexNumber sum(ComplexNumber c) {
        double sumReal = this.real + c.real;
        double sumIm = this.im + c.im;
        return new ComplexNumber(sumReal, sumIm);

    }
        
    /**
     * Метод для умножения комплексных чисел
     */
    public ComplexNumber multiply(ComplexNumber c) {
        double resultReal = (this.real * c.real) - (this.im * c.im);
        double resultIm = (this.real * c.im) + (this.im * c.real);
        return new ComplexNumber(resultReal, resultIm);
        
    }

    /**
     * Метод для деления комплексных чисел
     */
    public ComplexNumber devide(ComplexNumber c) {
        double divisor = (c.real * c.real) + (c.im * c.im);
        double resultReal = (this.real * c.real + this.im * c.im) / divisor;
        double resultIm = (this.im * c.real - this.real * c.im) / divisor;
        return new ComplexNumber(resultReal, resultIm);    
    }
    
}
