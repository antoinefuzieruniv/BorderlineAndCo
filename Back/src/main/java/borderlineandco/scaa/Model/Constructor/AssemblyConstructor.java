package borderlineandco.scaa.Model.Constructor;

import MASInfrastructure.Agent.InfraAgent;
import MASInfrastructure.Infrastructure;
import MASInfrastructure.exemple.CommunicationParMessage;
import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.ICreateMAS;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Agent.MyAgent;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Entities.PortEntity;
import borderlineandco.scaa.Model.Domain.Services.ComponentService;
import borderlineandco.scaa.Model.Domain.Services.ConnectionService;
import ch.qos.logback.core.spi.LifeCycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;
@Service
public class AssemblyConstructor implements ICreateMAS, ISelect, IChooseConnection {
    @Autowired
    ComponentService componentService;
    @Autowired
    ConnectionService connectionService;

    @Override
    public MyAgent createAgentByComponent(ComponentEntity c) {
        //TODO
        return null;
    }

    @Override
    public void launchMAS() {
        //TODO
    }

    @Override
    public AssemblyEntity chooseComponent(ComponentEntity chosenComponent) {
        List<ComponentEntity> componentsLeft = new ArrayList<ComponentEntity>(componentService.provideFirstListComponents());
        componentsLeft.remove(chosenComponent);
        return assemblyConstruction(chosenComponent, componentsLeft);
    }


    private AssemblyEntity assemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {
        //TODO for now it's just a mock, use infra in the future
        PortEntity p1 = new PortEntity("port1","type1");
        PortEntity p2 = new PortEntity("port2","type1");
        List<PortEntity> portsIn = new ArrayList<PortEntity>();
        portsIn.add(p1);
        List<PortEntity> portsOut = new ArrayList<PortEntity>();
        portsOut.add(p2);
        ComponentEntity c1 = new ComponentEntity("component1",portsIn,null);
        ComponentEntity c2 = new ComponentEntity("component2",null,portsOut);
        ConnectionEntity connectionEntity1 = new ConnectionEntity(p1,p2);
        List<ComponentEntity> componentEntityList = new ArrayList<>();
        componentEntityList.add(c1);
        componentEntityList.add(c2);
        List<ConnectionEntity> connectionEntityList = new ArrayList<>();
        connectionEntityList.add(connectionEntity1);
        return new AssemblyEntity(componentEntityList,connectionEntityList);
    }

    @Override
    public List<ConnectionEntity> provideConnections() {
        //TODO should be used in case if there is a multiple choice during construction, for now it's just a mock
        return connectionService.getAllConnections();
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        //TODO treat value for construction
    }
}
