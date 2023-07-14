package Interfaces;
/**
 * Интерфейс описывающий поведение при воврате товара
 */
import Classes.Actor;

public interface iReturnOrder{
    public boolean isWantReturnOrder();
    public void setReturnOrder(boolean isWantReturnOrder);
    Actor getActor();
    
}
    
