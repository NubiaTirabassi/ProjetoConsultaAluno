package com.example.consultaaluno.consultaaluno.interfaces;

import java.util.List;

/**
 * T = Type (aluno, pessoa, carro, etc)
 * N = Number (integer, bigInt, BigDecimal,double)
 *  * C - create
 *  * R - readById
 *  * R - Read()
 *  * U - update
 *  * D - delete
 */
public interface IService <T,N> {

    /**
     * Cria uma entity
     * @param entity
     * @return
     */
    public T create(T entity);

    /**
     * Busca uma entity de acordo com um id especificado
     * @see <a href="https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html">...</a>
     * @param id
     * @return
     */
    public T readById(N id) throws Exception;

    /**
     * Retorna uma lista de List<T>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">...</a>
     * @return
     */
    public List<T> read() throws Exception;

    /**
     *
     * @param id para identificar o registro a ser atualizado
     * @param entity valores que serão atualizado durante a operação de persitência
     * @see <a href="https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html">...</a>
     * @return
     */
    public T update(N id, T entity) throws Exception;

    /**
     *
     * @param id - identificador do registro a ser deletado;
     */
    public T deleteById(N id) throws Exception;

    /**
     *
     * @param entity - entidade que será removida do sistema;
     * @return
     */
    public T delete(T entity);
}
