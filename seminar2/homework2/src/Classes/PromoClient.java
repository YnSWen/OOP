package Classes;


public class PromoClient extends Actor {
    private String promoName; 
    private int promoClientID; 
    static int countPromoClients; 
/**
 * 
 * @param name Имя клиента
 * @param promoName Название акции
 * @param promoClientID id акционного клиента
 */

    public PromoClient(String name, String promoName, int promoClientID){
        super(name);
        this.promoName = promoName;
        this.promoClientID = promoClientID;
        countPromoClients++;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public boolean isWantReturnOrder(){
      return super.isWantReturnOrder;
    }

    public void setReturnOrder(boolean wantReturnOrder){
      super.isWantReturnOrder = wantReturnOrder;
    }

    public Actor getActor() {
      return this;
    }


    public void countPromoClients(){
        System.out.println(countPromoClients);
    }

    
}


