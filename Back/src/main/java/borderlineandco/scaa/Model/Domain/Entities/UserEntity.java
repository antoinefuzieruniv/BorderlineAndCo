package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id")
    Long id;

    String name;

    @OneToMany
    List<ConnectionEntity> preferedConnections;

    public UserEntity() {
    }

    public UserEntity(String name, List<ConnectionEntity> preferedConnections) {
        this.name = name;
        this.preferedConnections = preferedConnections;
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

    public List<ConnectionEntity> getPreferedConnections() {
        return preferedConnections;
    }

    public void setPreferedConnections(List<ConnectionEntity> preferedConnections) {
        this.preferedConnections = preferedConnections;
    }
}
