package borderlineandco.scaa.Model.Domain.Services;

import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Interface.ISaveChoice;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Repositories.ComponentRepository;
import borderlineandco.scaa.Model.Domain.Repositories.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentService implements IProvide {
    @Autowired
    ComponentRepository componentRepository;


    @Override
    public List<ComponentEntity> provideFirstListComponents() {
        return componentRepository.findAll();
    }


}
