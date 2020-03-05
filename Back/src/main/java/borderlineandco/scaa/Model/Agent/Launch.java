package borderlineandco.scaa.Model.Agent;


// interface IMessage : getter et setter sans attribut

import MASInfrastructure.Agent.InfraAgent;
import MASInfrastructure.Infrastructure;
import MASInfrastructure.State.LifeCycle;

public class Launch {

  public void launchAgent(String agentName){
      Infrastructure i = new Infrastructure();  // un scheduler et un annuaire
      Communication maCom= new Communication(i);

      // creation d'un agent de l'application et lien avec infra
      MyAgent a1=new MyAgent(agentName);

      InfraAgent infraAgent = i.createInfrastructureAgent(new LifeCycle(a1.getPerception()), maCom);
      // la création ajoute l'agent dans l'infrastructure

      a1.setInfraAgent(infraAgent);
      a1.getPerception().setInfraAgent(infraAgent);
      a1.getDecision().setInfraAgent(infraAgent);
      a1.getDecision().setCommunication(i);

      i.startScheduling();
  }
}
