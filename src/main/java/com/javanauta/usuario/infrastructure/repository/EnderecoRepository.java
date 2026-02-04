package com.javanauta.usuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javanauta.usuario.infrastructure.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
