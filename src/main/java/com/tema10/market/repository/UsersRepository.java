package com.tema10.market.repository;

import com.tema10.market.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
    public Users getById(Integer id);

    public Users getAll();

    public void removeUsersById(Integer id);


}
