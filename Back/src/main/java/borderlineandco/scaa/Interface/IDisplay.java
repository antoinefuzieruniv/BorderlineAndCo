package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public interface IDisplay {

    AssemblyEntity displayAssembly();

    List<ComponentEntity> displayFirstComponentList();

    void restart();
}
