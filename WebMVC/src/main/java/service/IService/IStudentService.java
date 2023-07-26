package service.IService;

import java.util.List;

public interface IStudentService<E>{
    void add(E e);
    int findById(int id);
    void delete(int id);
    List<E> findAll();
    void edit(int id, E e);
}
