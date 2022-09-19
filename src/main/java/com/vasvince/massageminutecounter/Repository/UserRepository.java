package com.vasvince.massageminutecounter.Repository;

import com.vasvince.massageminutecounter.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    boolean existsByUsername(String username);
}
