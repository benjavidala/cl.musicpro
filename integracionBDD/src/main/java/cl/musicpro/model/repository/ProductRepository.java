package cl.musicpro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.musicpro.model.Entities.ProductEntities;

public interface ProductRepository extends JpaRepository<ProductEntities,Integer>{

}
    
