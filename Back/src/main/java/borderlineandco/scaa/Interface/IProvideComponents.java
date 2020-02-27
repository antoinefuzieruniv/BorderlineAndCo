package borderlineandco.scaa.Interface;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;

import java.util.List;

public interface IProvideComponents {

    List<ComponentEntity> adaptToComponentEntitiesFromComponentPlateform(List<Object> components);
}
