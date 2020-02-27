package borderlineandco.scaa.Model.Domain.Entities;

import MASInfrastructure.Agent.InfraAgent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class ComponentEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    List<PortEntity> listPortIn;

    List<PortEntity> listPortOut;

}
