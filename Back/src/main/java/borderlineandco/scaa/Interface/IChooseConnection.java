package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;

import java.util.List;

public interface IChooseConnection {

    List<ConnectionEntity> provideConnections();

    void selectConnection(ConnectionEntity chosenConnection);
}
