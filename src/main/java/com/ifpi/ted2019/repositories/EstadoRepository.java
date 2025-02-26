package com.ifpi.ted2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifpi.ted2019.domain.Categoria;
import com.ifpi.ted2019.domain.Cidade;
import com.ifpi.ted2019.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
