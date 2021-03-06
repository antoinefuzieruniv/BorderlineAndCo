package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class ConnectionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "connection_id")
    private Long id;

    /**
     * port 
     */
    @NotNull
    @OneToOne
    private PortEntity portIn;

    @NotNull
    @OneToOne
    private  PortEntity portOut;

    @ManyToMany
    @JoinTable(
            name = "assembly_connection",
            joinColumns = @JoinColumn(name = "connection_id"),
            inverseJoinColumns = @JoinColumn(name = "assembly_id"))
    private List<AssemblyEntity> assemblyEntityList;

    @ManyToOne
    UserEntity userThatPrefers;

    public ConnectionEntity() {
    }

    public ConnectionEntity(@NotNull PortEntity portIn, @NotNull PortEntity portOut) {
        this.portIn = portIn;
        this.portOut = portOut;
    }

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

    public List<AssemblyEntity> getAssemblyEntityList() {
        return assemblyEntityList;
    }

    public void setAssemblyEntityList(List<AssemblyEntity> assemblyEntityList) {
        this.assemblyEntityList = assemblyEntityList;
    }

    public UserEntity getUserThatPrefers() {
        return userThatPrefers;
    }

    public void setUserThatPrefers(UserEntity userThatPrefers) {
        this.userThatPrefers = userThatPrefers;
    }
}
