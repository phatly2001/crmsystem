package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.product;

public interface productRepository extends JpaRepository<product, Integer> {
	
}
