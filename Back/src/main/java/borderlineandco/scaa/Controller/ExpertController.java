package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ExpertController implements IChooseConnection, IPreferentialConnection {
    @Override
    public List<ConnectionEntity> provideConnections() {
        return null;
    }

    @Override
    public ConnectionEntity selectConnection() {
        return null;
    }

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {

    }
}
