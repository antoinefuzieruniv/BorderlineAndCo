package borderlineandco.scaa.Model.Agent;

import MASInfrastructure.Agent.InfraAgent;
import MASInfrastructure.Communication.ICommunication;
import MASInfrastructure.State.IState;
import MASInfrastructure.State.LifeCycle;

import java.util.ArrayList;

public class DecisionState implements IState {

    private IState nextState;
    private ICommunication communication;
    private InfraAgent agt;
    private String name;

    public DecisionState(String name) {
        this.name = name;
    }

    public void setCommunication(ICommunication communication) {
        this.communication = communication;
    }

    public void setInfraAgent(InfraAgent agt) {
        this.agt = agt;
    }

    public void setNextState(IState nextState) {
        this.nextState = nextState;
    }

    @Override
    public void execute(LifeCycle c) {

        Message m = new Message(agt.getInfraAgentReference(), null);
        if (communication != null) {
            communication.sendMessageBroadcast(m);
        }
            System.out.println(name+ " : décision partage " + c.getSharedData("decision"));
            ArrayList<String> info = new ArrayList();
            info.add("broadcast");
            c.shareVariable("perception", info);
            c.setCurrentState(this.nextState);
        }



}