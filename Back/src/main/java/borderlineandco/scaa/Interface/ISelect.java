package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public interface ISelect {

    void chooseComponent(ComponentEntity chosenComponent);

    void startAssemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft);
}
