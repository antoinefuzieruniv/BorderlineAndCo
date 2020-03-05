package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Model.Constructor.AssemblyConstructor;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Services.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ExpertController implements IChooseConnection, IPreferentialConnection {
    @Autowired
    ConnectionService connectionService;
    @Autowired
    AssemblyConstructor assemblyConstructor;

    @Override
    public List<ConnectionEntity> provideConnections() {
        return assemblyConstructor.provideConnections();
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        connectionService.selectConnection(chosenConnection);
    }

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {
        //Probably never used since it is already in selectConnection
        connectionService.storePreferentialConnection(chosenConnection);
    }
}
