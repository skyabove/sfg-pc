package sky.one.data.service.api;

import static java.util.stream.Collectors.toList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractMapService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  protected T findById(ID id) {
    return map.get(id);
  }

  protected T save(ID id, T entity) {
    map.put(id, entity);
    return entity;
  }

  protected List<T> findAll() {
    return map.entrySet().stream().map(Entry::getValue).collect(toList());
  }

  protected void deleteById(ID id) {
    map.remove(id);
  }

  protected void delete(T entity) {
    map.entrySet().removeIf(entry -> entity.equals(entry.getValue()));
  }

}
