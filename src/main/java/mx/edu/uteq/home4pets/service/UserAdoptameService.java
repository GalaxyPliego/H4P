package mx.edu.uteq.home4pets.service;

import mx.edu.uteq.home4pets.entity.UserAdoptame;
import mx.edu.uteq.home4pets.model.request.user.UserInsertDto;

import java.util.Optional;


public interface UserAdoptameService {
    boolean saveUser(UserInsertDto user);

    Optional<UserAdoptame> findUserById(Long id);

    UserAdoptame findUserByUsername(String username);
}
