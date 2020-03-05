package borderlineandco.scaa.Model;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Entities.PortEntity;
import borderlineandco.scaa.Model.Domain.Repositories.ComponentRepository;
import borderlineandco.scaa.Model.Domain.Repositories.ConnectionRepository;
import borderlineandco.scaa.Model.Domain.Repositories.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class DataLoader implements ApplicationRunner {
    @Autowired
    ComponentRepository componentRepository;
    @Autowired
    PortRepository portRepository;
    @Autowired
    ConnectionRepository connectionRepository;

    public void fillDBWithExamples(){
        PortEntity p1 = new PortEntity("port1","type1");
        PortEntity p2 = new PortEntity("port2","type1");
        List<PortEntity> portsIn = new ArrayList<PortEntity>();
        portsIn.add(p1);
        List<PortEntity> portsOut = new ArrayList<PortEntity>();
        portsOut.add(p2);
        ComponentEntity c1 = new ComponentEntity("component1",portsIn,null);
        ComponentEntity c2 = new ComponentEntity("component2",null,portsOut);
        ConnectionEntity connectionEntity1 = new ConnectionEntity(p1,p2);


        portRepository.save(p1);
        portRepository.save(p2);
        componentRepository.save(c1);
        componentRepository.save(c2);
        connectionRepository.save(connectionEntity1);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        fillDBWithExamples();
    }
}