import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("prezident",1001);
        iActorBehaviour p = new PensionerClient("Sergey Nikolay",1111);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);

        magnit.update();
    }
}
