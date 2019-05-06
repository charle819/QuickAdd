package org.toolbox.TaskForMe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.toolbox.TaskForMe.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	@Query("From User u WHERE u.t_user_id = :userId")
	public User findByUserId(@Param("userId") int userId);
	
	public User findByUserNameIgnoreCase(String userName);
	
	public User findByEmailIgnoreCase(String email);
}
