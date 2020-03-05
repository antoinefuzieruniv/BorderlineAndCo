package borderlineandco.scaa.Model.Domain.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class PortEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @OneToOne
    private ConnectionEntity connectionEntity;

    @NotNull
    @NotEmpty
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConnectionEntity getConnectionEntity() {
        return connectionEntity;
    }

    public void setConnectionEntity(ConnectionEntity connectionEntity) {
        this.connectionEntity = connectionEntity;
    }
}
