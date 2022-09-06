package com.generation.lojagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.models.CategoriaModel;
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	
}
