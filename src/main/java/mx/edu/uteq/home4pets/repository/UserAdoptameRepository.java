package mx.edu.uteq.home4pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.uteq.home4pets.entity.UserAdoptame;

@Repository
public interface UserAdoptameRepository extends JpaRepository<UserAdoptame, Long> {

    UserAdoptame findUserByUsername(String username);
}
