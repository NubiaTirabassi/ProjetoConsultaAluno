package com.example.consultaaluno.consultaaluno.service;

import com.example.consultaaluno.consultaaluno.interfaces.IService;
import com.example.consultaaluno.consultaaluno.model.Disciplina;
import com.example.consultaaluno.consultaaluno.repository.DisciplinaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DisciplinaService implements IService<Disciplina,Integer> {

    @Autowired
    public DisciplinaRepository disciplinaRepository;

    @Override
    @Transactional
    public Disciplina create(Disciplina entity) {
        log.info("Acessando método create na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Persistindo dados do disciplina: {}", entity);

        return disciplinaRepository.save(entity);
    }

    @Override
    public Disciplina readById(Integer id) throws Exception {

        log.info("Acessando método readById na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Valor recebido foi {}", id);

        Optional<Disciplina> disciplinaEncontrado = disciplinaRepository.findById(id);
        if (disciplinaEncontrado.isPresent()) {
            return disciplinaEncontrado.get();
        } else {
            log.warn("Identificador id: {} não foi encontrado.", id);
            return new Disciplina(); //se não achou o registro, devolve o objeto 'vazio' (new)
        }
    }

    @Override
    public List<Disciplina> read() throws Exception {
        log.info("Acessando método read na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Os valores obtidos na consulta foram....");

        return null;
    }

    @Override
    @Transactional

    public Disciplina update(Integer id, Disciplina entity) throws Exception {
        log.info("Acessando método update na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}, objeto: {}", id, entity);

        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        Disciplina disciplinaUpdate = null;
        if (disciplinaOptional.isPresent()) {
            disciplinaUpdate = disciplinaOptional.get();
            disciplinaUpdate.setNome(entity.getNome());

            return disciplinaRepository.save(disciplinaUpdate);
        } else {
            log.warn("identificador id: {} não encontrado.", id);
            throw new Exception("Disciplina não encontrada.");

        }
    }

    @Override
    @Transactional
    public Disciplina deleteById(Integer id) throws Exception {
        log.info("Acessando método deleteById na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}", id);
        log.debug("O objeto encontrato foi...: ");

        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        if (disciplinaOptional.isPresent()) {
            disciplinaRepository.deleteById(id);
            return disciplinaOptional.get();
        } else {
            log.warn("identificador id: {} não encontrado.", id);
            throw new Exception("Disciplina não encontrada.");
        }

    }

    @Override
    @Transactional
    public Disciplina delete(Disciplina entity) {
        log.info("Acessando método delete na classe {}", DisciplinaService.class.getSimpleName());
        log.debug("Os valores obtidos foram: objeto: {}", entity);
        log.debug("O objeto encontrato foi...: ");
        disciplinaRepository.delete(entity);
        return entity;

    }

}
