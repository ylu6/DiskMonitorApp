package org.ylu.diskmonitorwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.ylu.diskmonitorwebapp.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT u.id FROM User u")
    List<String> findAllUserIds();
}
