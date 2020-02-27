package borderlineandco.scaa.Model.Constructor;

import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public class AssemblyConstructor implements ICreateMAS, ISelect {

    @Override
    public void createAgentByComponent(ComponentEntity c) {

    }

    @Override
    public void launchMAS() {

    }

    @Override
    public void chooseComponent(ComponentEntity chosenComponent) {

    }

    @Override
    public void startAssemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {

    }
}
