package borderlineandco.scaa.Controller;

import borderlineandco.scaa.Interface.IChooseConnection;
import borderlineandco.scaa.Interface.IGetPreferences;
import borderlineandco.scaa.Interface.IPreferentialConnection;
import borderlineandco.scaa.Model.Constructor.AssemblyConstructor;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Services.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class ExpertController implements IChooseConnection, IPreferentialConnection, IGetPreferences {
    @Autowired
    ConnectionService connectionService;
    @Autowired
    AssemblyConstructor assemblyConstructor;

    @Override
    @GetMapping("/ExpertController/getConnections")
    public @ResponseBody List<ConnectionEntity> provideConnections() {
        return assemblyConstructor.provideConnections();
    }

    @Override
    public void selectConnection(ConnectionEntity chosenConnection) {
        //SHOULD NOT BE USED, USE THE ONE IN ASSEMBLY CONSTRUCTOR
    }


    @GetMapping("/ExpertController/SelectConnection")
    public void selectConnection(@RequestParam(value = "chosenConnection") int chosenConnection, @RequestParam(value = "saveChoice") boolean save) {
        ConnectionEntity connectionEntity = connectionService.getConnectionById((long) chosenConnection);
        assemblyConstructor.selectConnection(connectionEntity);
        if (save)
            storePreferentialConnection(connectionEntity);
    }

    @Override
    public void storePreferentialConnection(ConnectionEntity chosenConnection) {
        connectionService.storePreferentialConnection(chosenConnection);
    }

    @Override
    @GetMapping("/ExpertController/getPreferedConnections")
    public @ResponseBody List<ConnectionEntity> getPreferedConnections() {
        return connectionService.getPreferedConnections();
    }
}
