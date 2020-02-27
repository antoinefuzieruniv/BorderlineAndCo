package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IDisplay;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
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
    public List<ComponentEntity> provideComponents() {
        return null;
    }

    @Override
    public ComponentEntity chooseComponent() {
        return null;
    }

    @Override
    public void startAssembly() {

    }
}
