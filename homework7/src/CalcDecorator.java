public class CalcDecorator implements iCalculator{
    /**
     * Паттерн Декоратор, используется для добавления логирования в интерфейс
     * iCalculator, не меняя его исходный код
     */
    private iCalculator oldCalculator;
    private Logger logger;
    /**
     * 
     * @param oldCalculator Старый калькулятор, в который вносим поправки
     * @param logger 
     */

    /**
     * Конструктор
     */
    public CalcDecorator(iCalculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    /**
     * Переопределение метода sum для того, чтобы добавить логирование 
     */
    @Override
    public iCalculator sum(double real, double im) {
        double firstArg = oldCalculator.getReal();
        double secondArg = oldCalculator.getIm();
        iCalculator result = oldCalculator.sum(firstArg, secondArg);
        logger.log("Вызов метода sum произошел");
        return result;
    }
        
    /**
     * Переопределение метода multiply для того, чтобы добавить логирование 
     */
    @Override
    public iCalculator multiply(double real, double im) {
        double firstArg = oldCalculator.getReal();
        double secondArg = oldCalculator.getIm();
        iCalculator result = oldCalculator.multiply(firstArg, secondArg);
        logger.log("Вызов метода mulitply произошел");
        return result;
        
    }

    /**
     * Переопределение метода devide для того, чтобы добавить логирование 
     */
    @Override
    public iCalculator devide(double real, double im) {
        double firstArg = oldCalculator.getReal();
        double secondArg = oldCalculator.getIm();
        iCalculator result = oldCalculator.devide(firstArg, secondArg);
        logger.log("Вызов метода devide произошел");
        return result;
    }

    @Override
    public double getReal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReal'");
    }

    @Override
    public double getIm() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIm'");
    }
}

  