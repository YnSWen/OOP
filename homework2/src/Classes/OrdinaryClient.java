package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
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


}
