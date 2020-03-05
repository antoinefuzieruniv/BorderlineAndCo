package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class ConnectionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private ExpertEntity expertEntity;

    /**
     * port 
     */
    @NotNull
    ManyToOne
    private PortEntity portIn;

    @NotNull
    private  PortEntity portOut;

    @ManyToMany
    @JoinTable(
            name = "assembly_connection",
            joinColumns = @JoinColumn(name = "connection_id"),
            inverseJoinColumns = @JoinColumn(name = "assembly_id"))
    private List<AssemblyEntity> assemblyEntityList;

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
