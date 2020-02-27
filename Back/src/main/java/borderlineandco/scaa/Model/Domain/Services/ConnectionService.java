package borderlineandco.scaa.Model.Domain.Services;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService implements IChooseConnection, IPreferentialConnection {
    @Override
    public List<ConnectionEntity> provideConnections() {
        return null;
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        return null;
    }

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {

    }
}
