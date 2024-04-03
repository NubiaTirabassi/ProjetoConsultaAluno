package com.example.consultaaluno.consultaaluno.repository;


import com.example.consultaaluno.consultaaluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
