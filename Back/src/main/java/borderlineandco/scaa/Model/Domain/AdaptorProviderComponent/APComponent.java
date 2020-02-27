package borderlineandco.scaa.Model.Domain.AdaptorProviderComponent;

import borderlineandco.scaa.Interface.IProvideComponents;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public class APComponent implements IProvideComponents {
    @Override
    public List<ComponentEntity> adaptToComponentEntitiesFromComponentPlateform(List<Object> components) {
        return null;
    }
}
