package borderlineandco.scaa.Model.Domain.Repositories;

import borderlineandco.scaa.Model.Domain.Entities.ComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentEntity, Long> {

}
