package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Agent.MyAgent;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

public interface ICreateSMA {

    MyAgent createAgentByComponent(ComponentEntity c);

    void launchSMA();
}
