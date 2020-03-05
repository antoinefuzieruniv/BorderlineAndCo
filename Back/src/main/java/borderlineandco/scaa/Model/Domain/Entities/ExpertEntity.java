package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ExpertEntity {

    @Id
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "expert")
    private List<ConnectionEntity> connectionEntities;
}
