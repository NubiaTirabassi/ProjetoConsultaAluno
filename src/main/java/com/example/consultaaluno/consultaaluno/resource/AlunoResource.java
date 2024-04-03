package com.example.consultaaluno.consultaaluno.resource;

import com.example.consultaaluno.consultaaluno.interfaces.IResource;
import com.example.consultaaluno.consultaaluno.model.Aluno;
import com.example.consultaaluno.consultaaluno.service.AlunoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/aluno") //endereço de acesso: http://localhost:8080/api/v1/aluno
public class AlunoResource implements IResource<Aluno, Integer> {

    @Autowired//Injeção de dependência
    public AlunoService alunoService;

    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Aluno post(@RequestBody Aluno entity) {
        log.info("Camada de resource recebendo os dados do aluno.");
        log.debug("Valores recebidos do JSON: {}", entity);
        return alunoService.create(entity);
    }

    @Override
    public List<Aluno> get() {

        return null;
    }

    @Override
    public Aluno getById(Integer id) {

        return null;
    }

    @Override
    public Aluno update(Integer id, Aluno entity) {

        return null;
    }

    @Override
    public void delete(Integer id) {
    }
}


