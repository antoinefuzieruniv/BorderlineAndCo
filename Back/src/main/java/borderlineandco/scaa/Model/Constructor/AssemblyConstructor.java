package borderlineandco.scaa.Model.Constructor;

import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssemblyConstructor implements ICreateMAS, ISelect {

    @Override
    public MyAgent createAgentByComponent(ComponentEntity c) {
        Infrastructure i = new Infrastructure();  // un scheduler et un annuaire
        CommunicationParMessage maCom= new CommunicationParMessage(i);
        // creation d'un agent de l'application et lien avec infra
        MyAgent a1=new MyAgent(c.getName());

        InfraAgent infraA1=i.createInfrastructureAgent(new LifeCycle(a1.getPerception()), maCom);
        // la création ajoute l'agent dans l'infrastructure

        a1.setInfraAgent(infraA1);
        a1.getPerception().setInfraAgent(infraA1);
        a1.getDecision().setInfraAgent(infraA1);
        a1.getDecision().setCommunication(i);

        return null;
    }

    @Override
    public void launchSMA() {

    }

    @Override
    public void chooseComponent(ComponentEntity chosenComponent) {

    }

    @Override
    public AssemblyEntity assemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {
        return null;
    }
}
