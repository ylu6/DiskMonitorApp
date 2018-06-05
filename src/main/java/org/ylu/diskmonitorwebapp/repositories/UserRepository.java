package org.ylu.diskmonitorwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.ylu.diskmonitorwebapp.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
