package borderlineandco.scaa.Model.Domain.Services;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Entities.UserEntity;
import borderlineandco.scaa.Model.Domain.Repositories.ConnectionRepository;
import borderlineandco.scaa.Model.Domain.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService implements IPreferentialConnection, IGetPreferences, ISaveChoice {
    @Autowired
    ConnectionRepository connectionRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {
        //TODO manage user authentication, just a mock for now
        UserEntity userEntity = userRepository.findById((long) 11).get();
        userEntity.getPreferedConnections().add(chosenConnection);
        userRepository.save(userEntity);
    }

    @Override
    public List<ConnectionEntity> getPreferedConnections() {
        //TODO manage user authentication, just a mock for now
        UserEntity userEntity = userRepository.findById((long) 11).get();
        return userEntity.getPreferedConnections();
    }

    @Override
    public void saveChoice(ConnectionEntity connectionEntity) {
        storePreferentialConnection(connectionEntity);
    }

    public ConnectionEntity getConnectionById (Long id){return connectionRepository.findById(id).get();}

    public List<ConnectionEntity> getAllConnections() {return connectionRepository.findAll();}
}
