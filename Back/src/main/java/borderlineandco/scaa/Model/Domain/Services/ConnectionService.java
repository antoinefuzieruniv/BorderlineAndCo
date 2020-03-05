package borderlineandco.scaa.Model.Domain.Services;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Repositories.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService implements IChooseConnection, IPreferentialConnection, IGetPreferences, ISaveChoice {
    @Autowired
    ConnectionRepository connectionRepository;

    @Override
    public List<ConnectionEntity> provideConnections() {
        //SHOULD NOT BE USED, USE THE ONE IN ASSEMBLY CONSTRUCTOR
        return null;
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        storePreferentialConnection(chosenConnection);
    }

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {
        //TODO see how to manage preferential connection
        connectionRepository.save(chosenConnection);
    }

    @Override
    public List<ConnectionEntity> getPreferedConnections() {
        //TODO see how to manage preferential connection
        return connectionRepository.findAll();
    }

    @Override
    public void saveChoice(ConnectionEntity connectionEntity) {
        connectionRepository.save(connectionEntity);
    }
}
