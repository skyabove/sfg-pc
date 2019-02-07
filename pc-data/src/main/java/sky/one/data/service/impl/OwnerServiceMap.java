package sky.one.data.service.impl;

import java.util.List;
import java.util.Map.Entry;
import org.springframework.stereotype.Service;
import sky.one.data.model.entities.Owner;
import sky.one.data.service.api.AbstractMapService;
import sky.one.data.service.api.OwnerService;
import sky.one.data.util.IdGenerator;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService {

  private final IdGenerator generator;

  public OwnerServiceMap(IdGenerator generator) {
    this.generator = generator;
  }

  @Override
  public Owner findById(Integer id) {
    return super.findById(id);
  }

  @Override
  public Owner save(Owner entity) {
    if(entity.getId() == null) {
      entity.setId(generator.generateNextIntId(super.map.keySet()));
    }
    return super.save(entity.getId(), entity);
  }

  @Override
  public List<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(Owner entity) {
    super.delete(entity);
  }

  @Override
  public void deleteById(Integer id) {
    super.deleteById(id);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return super.map.entrySet()
        .stream()
        .filter(entry -> lastName.equals(entry.getValue().getLastName()))
        .map(Entry::getValue)
        .findFirst()
        .orElse(null);
  }
}
