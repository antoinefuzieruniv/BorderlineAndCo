package borderlineandco.scaa.Model.Domain.Services;

import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentService implements IProvide, IGetPreferences, ISaveChoice {
    @Override
    public List<ComponentEntity> provideComponents() {
        return null;
    }

    @Override
    public List<ConnectionEntity> getPreferedConnections() {
        return null;
    }

    @Override
    public void saveChoice(ConnectionEntity connectionEntity) {

    }
}
