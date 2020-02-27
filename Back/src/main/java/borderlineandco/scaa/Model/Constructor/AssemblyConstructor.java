package borderlineandco.scaa.Model.Constructor;

import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;

import java.util.List;

public class AssemblyConstructor implements ICreateMAS, ISelect {

    @Override
    public void createAgentByComponent(ComponentEntity c) {

    }

    @Override
    public void launchMAS() {

    }

    @Override
    public ComponentEntity chooseComponent() {
        return null;
    }

    @Override
    public void startAssembly() {

    }
}
