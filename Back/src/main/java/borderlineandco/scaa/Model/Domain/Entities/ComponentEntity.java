package borderlineandco.scaa.Model.Domain.Entities;

import MASInfrastructure.Agent.InfraAgent;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class ComponentEntity {

    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    List<PortEntity> listPortIn;

    List<PortEntity> listPortOut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PortEntity> getListPortIn() {
        return listPortIn;
    }

    public void setListPortIn(List<PortEntity> listPortIn) {
        this.listPortIn = listPortIn;
    }

    public List<PortEntity> getListPortOut() {
        return listPortOut;
    }

    public void setListPortOut(List<PortEntity> listPortOut) {
        this.listPortOut = listPortOut;
    }
}
