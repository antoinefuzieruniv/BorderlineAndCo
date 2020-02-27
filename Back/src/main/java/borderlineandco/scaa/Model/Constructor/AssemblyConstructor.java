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
    public void createAgentByComponent(ComponentEntity c) {

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
}
