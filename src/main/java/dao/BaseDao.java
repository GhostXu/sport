package dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
    /*one parameter*/
    T find(Map<String,Object> map);
    List<T> findList();

    void update(Object param);

    void insert(T t);

    void delete(Object param);

}
