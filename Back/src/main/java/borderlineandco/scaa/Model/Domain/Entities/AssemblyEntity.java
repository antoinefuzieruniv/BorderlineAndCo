package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class AssemblyEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private List<ComponentEntity> listComponent;

    private List<ConnectionEntity> listConnection;


}
