package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class ComponentEntity {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Long id;

    @NotNull
    private String name;

    @OneToMany
    List<PortEntity> listPortIn;

    @OneToMany
    List<PortEntity> listPortOut;

    @ManyToMany
    @JoinTable(
            name = "assembly_composant",
            joinColumns = @JoinColumn(name = "composant_id"),
            inverseJoinColumns = @JoinColumn(name = "assembly_id"))
    List<AssemblyEntity> assemblys;

    public ComponentEntity() {
    }

    public ComponentEntity(@NotNull String name, List<PortEntity> listPortIn, List<PortEntity> listPortOut) {
        this.name = name;
        this.listPortIn = listPortIn;
        this.listPortOut = listPortOut;
    }

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

    public List<AssemblyEntity> getAssemblys() {
        return assemblys;
    }

    public void setAssemblys(List<AssemblyEntity> assemblys) {
        this.assemblys = assemblys;
    }
}
