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

    @OneToMany(mappedBy = "composant")
    List<PortEntity> listPort;

    @ManyToMany
    @JoinTable(
            name = "assembly_composant",
            joinColumns = @JoinColumn(name = "composant_id"),
            inverseJoinColumns = @JoinColumn(name = "assembly_id"))
    List<AssemblyEntity> assemblys;

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
}
