package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IDisplay;
import borderlineandco.scaa.Interface.IProvide;
import borderlineandco.scaa.Interface.ISelect;
import borderlineandco.scaa.Model.Constructor.AssemblyConstructor;
import borderlineandco.scaa.Model.Domain.Entities.AssemblyEntity;
import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Services.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController implements ISelect, IProvide, IDisplay {
    @Autowired
    AssemblyConstructor assemblyConstructor;
    @Autowired
    ComponentService componentService;

    @Override
    public void displayAssembly(AssemblyEntity assemblyToDisplay) {
        //TODO see how to send it to the front
    }

    @Override
    public void restart() {
        provideFirstListComponents();
    }


    @GetMapping("/getAllComponents")
    @Override
    public @ResponseBody
    List<ComponentEntity> provideFirstListComponents() {
        return componentService.provideFirstListComponents();
    }

    @Override
    public void chooseComponent(ComponentEntity chosenComponent) {
        List<ComponentEntity> componentsLeft = new ArrayList<ComponentEntity>(provideFirstListComponents());
        componentsLeft.remove(chosenComponent);
        assemblyConstruction(chosenComponent, componentsLeft);
    }

    @Override
    public AssemblyEntity assemblyConstruction(ComponentEntity chosenComponent, List<ComponentEntity> componentsLeft) {
        AssemblyEntity assemblyEntity = assemblyConstructor.assemblyConstruction(chosenComponent,componentsLeft);
        displayAssembly(assemblyEntity);
        return assemblyEntity;
    }
}
