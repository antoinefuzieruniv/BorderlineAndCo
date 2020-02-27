package borderlineandco.scaa.Model.Constructor;

import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;

import java.util.List;

public class AssemblyConstructor implements ICreateMAS, IGetPreferences, ISaveChoice {

    @Override
    public void createAgentByComponent(ComponentEntity c) {

    }

    @Override
    public void launchMAS() {

    }

    @Override
    public List<ConnectionEntity> getPreferedConnections() {
        return null;
    }

    @Override
    public void saveChoice(ConnectionEntity connectionEntity) {

    }
}
