package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class AssemblyEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToMany
    private List<ComponentEntity> listComponent;

    @ManyToMany()
    private List<ConnectionEntity> listConnection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ComponentEntity> getListComponent() {
        return listComponent;
    }

    public void setListComponent(List<ComponentEntity> listComponent) {
        this.listComponent = listComponent;
    }

    public List<ConnectionEntity> getListConnection() {
        return listConnection;
    }

    public void setListConnection(List<ConnectionEntity> listConnection) {
        this.listConnection = listConnection;
    }
}
