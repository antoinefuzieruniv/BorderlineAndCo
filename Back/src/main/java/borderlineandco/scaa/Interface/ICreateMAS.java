package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

public interface ICreateMAS {

    void createAgentByComponent(ComponentEntity c);

    void launchMAS();
}
