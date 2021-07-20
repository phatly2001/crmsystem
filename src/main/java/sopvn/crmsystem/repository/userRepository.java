package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.user;

public interface userRepository extends JpaRepository<user, Integer> {
	
}
