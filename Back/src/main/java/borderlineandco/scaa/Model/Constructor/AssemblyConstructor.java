package borderlineandco.scaa.Model.Constructor;

import MASInfrastructure.Agent.InfraAgent;
import MASInfrastructure.Infrastructure;
import MASInfrastructure.exemple.CommunicationParMessage;
import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Agent.MyAgent;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import ch.qos.logback.core.spi.LifeCycle;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssemblyConstructor implements ICreateMAS, ISelect, IChooseConnection {

    @Override
    public MyAgent createAgentByComponent(ComponentEntity c) {
        Infrastructure i = new Infrastructure();  // un scheduler et un annuaire
        CommunicationParMessage maCom= new CommunicationParMessage(i);
        // creation d'un agent de l'application et lien avec infra
        MyAgent a1=new MyAgent(c.getName());

        //TODO Antoine
        /*InfraAgent infraA1=i.createInfrastructureAgent(new LifeCycle(a1.getPerception()), maCom);
        // la cr�ation ajoute l'agent dans l'infrastructure

        a1.setInfraAgent(infraA1);
        a1.getPerception().setInfraAgent(infraA1);
        a1.getDecision().setInfraAgent(infraA1);
        a1.getDecision().setCommunication(i);
*/
        return null;
    }

    @Override
    public void launchMAS() {

    }

    @Override
    public void chooseComponent(ComponentEntity chosenComponent) {

    }

    @Override
    public AssemblyEntity assemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {
        return null;
    }

    @Override
    public List<ConnectionEntity> provideConnections() {
        return null;
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        //SHOULD NOT BE USED, USE THE ONE IN CONNECTION SERVICE

    }
}
