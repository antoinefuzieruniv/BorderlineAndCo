package borderlineandco.scaa.Model;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import borderlineandco.scaa.Model.Domain.Entities.ConnectionEntity;
import borderlineandco.scaa.Model.Domain.Entities.PortEntity;
import borderlineandco.scaa.Model.Domain.Entities.UserEntity;
import borderlineandco.scaa.Model.Domain.Repositories.ComponentRepository;
import borderlineandco.scaa.Model.Domain.Repositories.ConnectionRepository;
import borderlineandco.scaa.Model.Domain.Repositories.PortRepository;
import borderlineandco.scaa.Model.Domain.Repositories.UserRepository;
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
    @Autowired
    UserRepository userRepository;

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

        PortEntity p3 = new PortEntity("port3","type2");
        PortEntity p4 = new PortEntity("port4","type2");
        portsIn = new ArrayList<PortEntity>();
        portsIn.add(p3);
        portsOut = new ArrayList<PortEntity>();
        portsOut.add(p4);
        ComponentEntity c3 = new ComponentEntity("component3",portsIn,null);
        ComponentEntity c4 = new ComponentEntity("component4",null,portsOut);
        ConnectionEntity connectionEntity2 = new ConnectionEntity(p3,p4);

        portRepository.save(p3);
        portRepository.save(p4);
        componentRepository.save(c3);
        componentRepository.save(c4);
        connectionRepository.save(connectionEntity2);

        List<ConnectionEntity> connectionEntityList = new ArrayList<>();
        connectionEntityList.add(connectionEntity1);
        connectionEntityList.add(connectionEntity2);
        UserEntity user1 = new UserEntity("Jacquie",connectionEntityList);

        userRepository.save(user1);

        PortEntity p5 = new PortEntity("port5","type2");
        portsOut = new ArrayList<PortEntity>();
        portsOut.add(p5);
        ComponentEntity c5 = new ComponentEntity("component4",null,portsOut);
        ConnectionEntity connectionEntity3 = new ConnectionEntity(p3,p5);

        portRepository.save(p5);
        componentRepository.save(c5);
        connectionRepository.save(connectionEntity3);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        fillDBWithExamples();
    }
}
