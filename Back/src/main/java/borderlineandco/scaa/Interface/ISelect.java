package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public interface ISelect {

    AssemblyEntity chooseComponent(ComponentEntity chosenComponent);

}
