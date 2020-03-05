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
public class ConnectionService implements IPreferentialConnection, IGetPreferences, ISaveChoice {
    @Autowired
    ConnectionRepository connectionRepository;

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {
        //TODO see how to manage preferential connection
        //connectionRepository.save(chosenConnection);
    }

    @Override
    public List<ConnectionEntity> getPreferedConnections() {
        //TODO see how to manage preferential connection
        //return connectionRepository.findAll();
        return null;
    }

    @Override
    public void saveChoice(ConnectionEntity connectionEntity) {
        storePreferentialConnection(connectionEntity);
    }

    public ConnectionEntity getConnectionById (Long id){return connectionRepository.findById(id).get();}

    public List<ConnectionEntity> getAllConnections() {return connectionRepository.findAll();}
}
