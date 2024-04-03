package com.example.consultaaluno.consultaaluno.interfaces;

import java.util.List;

/**
 *  * HTTP:
 *  * Verbos: POST,GET,PUT,PATCH,DELETE,OPTION,HEAD
 * @param <T>
 * @param <N>
 */

public interface IResource <T,N> {

    T post(T entity);

    List<T> get();

    T getById(N id);

    /**
     * PUT,PATCH
     */
    T update(N id, T entity);

    void delete(N id);

}
