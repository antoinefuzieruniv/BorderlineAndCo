package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public interface ISelect {

    void chooseComponent(ComponentEntity chosenComponent);

    AssemblyEntity assemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft);
}
