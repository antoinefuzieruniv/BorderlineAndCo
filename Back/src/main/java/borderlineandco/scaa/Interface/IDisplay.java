package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;

public interface IDisplay {

    void displayAssembly(AssemblyEntity assemblyToDisplay);

    void restart();
}
