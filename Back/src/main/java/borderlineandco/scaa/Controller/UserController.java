package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IDisplay;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Services.ComponentService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController implements ISelect, IProvide, IDisplay {
    @Override
    public AssemblyEntity displayAssembly() {
        return null;
    }

    @Override
    public void restart() {

    }

    @Override
    public List<ComponentEntity> provideFirstListComponents() {
        return new ComponentService().provideFirstListComponents();
    }

    @Override
    public void chooseComponent(ComponentEntity chosenComponent) {
       // List<ComponentEntity> componentsLeft = provideFirstListComponents().remove(chosenComponent);
       // startAssemblyConstruction(chosenComponent, );
    }

    @Override
    public void startAssemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {

    }
}
