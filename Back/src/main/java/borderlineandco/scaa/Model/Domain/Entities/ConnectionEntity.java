package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class ConnectionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private PortEntity portIn;

    @NotNull
    private  PortEntity portOut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PortEntity getPortIn() {
        return portIn;
    }

    public void setPortIn(PortEntity portIn) {
        this.portIn = portIn;
    }

    public PortEntity getPortOut() {
        return portOut;
    }

    public void setPortOut(PortEntity portOut) {
        this.portOut = portOut;
    }
}
