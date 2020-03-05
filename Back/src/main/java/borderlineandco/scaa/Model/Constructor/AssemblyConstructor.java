package borderlineandco.scaa.Model.Constructor;


import MASInfrastructure.Agent.InfraAgent;
import MASInfrastructure.Infrastructure;
import MASInfrastructure.State.LifeCycle;
import MASInfrastructure.exemple.CommunicationParMessage;
import MASInfrastructure.exemple.MonAgent;
import borderlineandco.scaa.Interface.ICreateSMA;
import borderlineandco.scaa.Interface.ISelect;import borderlineandco.scaa.Model.Agent.MyAgent;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;


public class AssemblyConstructor implements ICreateSMA, ISelect {


    @Override
    public MyAgent createAgentByComponent(ComponentEntity c) {
        Infrastructure i = new Infrastructure();  // un scheduler et un annuaire
        CommunicationParMessage maCom= new CommunicationParMessage(i);
        // creation d'un agent de l'application et lien avec infra
        MyAgent a1=new MyAgent(c.getName());

        InfraAgent infraA1=i.createInfrastructureAgent(new LifeCycle(a1.getPerception()), maCom);
        // la cr�ation ajoute l'agent dans l'infrastructure

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
    public ComponentEntity chooseComponent() {
        return null;
    }

    @Override
    public void startAssembly() {

    }
}
