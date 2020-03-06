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
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class UserController implements ISelect, IProvide, IDisplay {
    @Autowired
    AssemblyConstructor assemblyConstructor;
    @Autowired
    ComponentService componentService;


    @GetMapping("/UserController/getAllComponents")
    @Override
    public @ResponseBody
    List<ComponentEntity> provideFirstListComponents() {
        return componentService.provideFirstListComponents();
    }


    @Override
    public AssemblyEntity chooseComponent(ComponentEntity chosenComponent) {
        return assemblyConstructor.chooseComponent(chosenComponent);
    }


    @GetMapping("/UserController/chooseComponent")
    public  @ResponseBody AssemblyEntity chosenComponent(@RequestParam(value = "chosenComponent") int chosenComponent) {
        return chooseComponent(componentService.getComponentById((long) chosenComponent));
    }
}
