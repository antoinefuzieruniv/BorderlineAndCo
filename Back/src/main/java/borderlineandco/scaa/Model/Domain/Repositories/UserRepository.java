package borderlineandco.scaa.Model.Domain.Repositories;

import borderlineandco.scaa.Model.Domain.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
