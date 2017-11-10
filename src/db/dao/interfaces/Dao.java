package db.dao.interfaces;

import java.util.List;

public interface Dao<T> {
    boolean create(T item);

    T findById(int id);

    List<T> findAll();

    void delete(T item);

    void deleteAll();

    void update(T item);

}
