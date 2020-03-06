package borderlineandco.scaa.Model.Domain.AdaptorProviderComponent;

import borderlineandco.scaa.Interface.IProvideComponents;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Services.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class APComponent implements IProvideComponents {
    @Autowired
    ComponentService componentService;

    @Override
    public List<ComponentEntity> adaptToComponentEntitiesFromComponentPlateform(List<Object> components) {
        //TODO adapt from component plateform to DataBase
        return null;
    }
}
