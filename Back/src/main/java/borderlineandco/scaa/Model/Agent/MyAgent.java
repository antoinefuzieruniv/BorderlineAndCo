package borderlineandco.scaa.Model.Agent;

import MASInfrastructure.Agent.InfraAgent;

public class MyAgent {

    private InfraAgent infraAgent;

    private PerceptionState perception;
    private DecisionState decision;

    private String nom;

    public PerceptionState getPerception() {
        return perception;
    }

    public DecisionState getDecision() {
        return decision;
    }

    public MyAgent(String nom) {
        this.nom = nom;
        perception=new PerceptionState(nom);
        decision=new DecisionState(nom);
        perception.setNextState(decision);
        decision.setNextState(perception);

    }

    public InfraAgent getInfraAgent() {
        return infraAgent;
    }

    public void setInfraAgent(InfraAgent infraAgent) {
        this.infraAgent = infraAgent;
    }

    public String getNom() {
        return nom;
    }

}
