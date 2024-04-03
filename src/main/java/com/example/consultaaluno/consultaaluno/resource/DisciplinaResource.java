package com.example.consultaaluno.consultaaluno.resource;

import com.example.consultaaluno.consultaaluno.interfaces.IResource;
import com.example.consultaaluno.consultaaluno.model.Disciplina;
import com.example.consultaaluno.consultaaluno.service.DisciplinaService;
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
@RequestMapping("api/v1/disciplina") // endereço de acesso: http://localhost:8080/api/v1/disciplina
public class DisciplinaResource implements IResource<Disciplina, Integer> {

    @Autowired // Injeção de dependência
    private DisciplinaService disciplinaService;

    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Disciplina post(@RequestBody Disciplina entity) {
        log.info("Camada de resource recebendo os dados da disciplina.");
        log.debug("Valores recebidos do JSON: {}", entity);
        return disciplinaService.create(entity);
    }

    @Override
    public List<Disciplina> get() {
        return null;
    }

    @Override
    public Disciplina getById(Integer id) {
        return null;
    }

    @Override
    public Disciplina update(Integer id, Disciplina entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}