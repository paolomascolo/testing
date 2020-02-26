package it.contrader.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Users;

/**
 * Created by paolo mascolo e angelo tozza on 26/02/2020.
 */
@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

	
	Users findByUsernameAndPassword(String username, String password);
	
}
