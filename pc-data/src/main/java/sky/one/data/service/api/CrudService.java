package sky.one.data.service.api;

import java.util.List;

public interface CrudService<T, ID> {

  T findById(ID id);

  T save(T entity);

  List<T> findAll();

  void deleteById(ID id);

  void delete(T entity);
}
