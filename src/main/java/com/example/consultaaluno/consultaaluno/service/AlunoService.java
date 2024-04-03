package com.example.consultaaluno.consultaaluno.service;

import com.example.consultaaluno.consultaaluno.interfaces.IService;
import com.example.consultaaluno.consultaaluno.model.Aluno;
import com.example.consultaaluno.consultaaluno.repository.AlunoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j //anotação responsável para habilitar a parte de logging do projeto.
@Service //layer service/camada de negócio.
public class AlunoService implements IService<Aluno, Integer> {

    @Autowired //injeção de dependência
    public AlunoRepository alunoRepository;

    @Override
    @Transactional
    public Aluno create(Aluno entity) {
        log.info("Acessando método create na classe {}", AlunoService.class.getSimpleName());
        log.debug("Persistindo dados do aluno: {}", entity);

        return alunoRepository.save(entity);
    }

    @Override
    public Aluno readById(Integer id) {
        log.info("Acessando método readById na classe {}", AlunoService.class.getSimpleName());
        log.debug("Valor recebido foi {}", id);

        Optional<Aluno> alunoEncontrado = alunoRepository.findById(id);
        if (alunoEncontrado.isPresent()) {
            return alunoEncontrado.get(); //se achou o aluno, retorna o objeto preenchido.
        } else {
            log.warn("Identificador id: {} não foi encontrado.", id);
            return new Aluno(); //se não achou o registro, devolve o objeto 'vazio' (new)
        }
    }

    @Override
    public List<Aluno> read() {
        log.info("Acessando método read na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos na consulta foram....");
        return null;
    }

    @Override
    @Transactional
    public Aluno update(Integer id, Aluno entity) {
        log.info("Acessando método update na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}, objeto: {}", id, entity);
        return null;
    }

    @Override
    @Transactional
    public Aluno deleteById(Integer id) {
        log.info("Acessando método deleteById na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}", id);
        log.debug("O objeto encontrato foi...: ");
        return null;
    }

    @Override
    @Transactional
    public Aluno delete(Aluno entity) {
        log.info("Acessando método delete na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: objeto: {}", entity);
        log.debug("O objeto encontrato foi...: ");
        return null;
    }
}
