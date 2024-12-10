import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

public class Main {
    public static void main(String[] args){
        //Configura JADE
        Runtime runtime = Runtime.instance();
        Profile profile = new ProfileImpl();
        ContainerController container = runtime.createMainContainer(profile);

        try{
            //Crea el agente y lo ejecuta
            AgentController mathAgent = container.createNewAgent("MathAgents", "MathAgent", null);
            mathAgent.start();
        } catch (StaleProxyException e){
            e.printStackTrace();
        }
    }
}