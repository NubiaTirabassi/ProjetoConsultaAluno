package com.example.consultaaluno.consultaaluno.repository;

import com.example.consultaaluno.consultaaluno.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina,Integer> {
}
