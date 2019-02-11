package sky.one.data.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import sky.one.data.model.entities.PetType;
import sky.one.data.service.api.AbstractMapService;
import sky.one.data.service.api.PetTypeService;
import sky.one.data.util.IdGenerator;

@Component
public class PetTypeServiceMap extends AbstractMapService<PetType, Integer> implements
    PetTypeService {

  private final IdGenerator generator;

  public PetTypeServiceMap(IdGenerator generator) {
    this.generator = generator;
  }

  @Override
  public PetType findById(Integer id) {
    return super.findById(id);
  }

  @Override
  public PetType save(PetType entity) {
    if (entity.getId() == null) {
      entity.setId(generator.generateNextIntId(super.map.keySet()));
    }
    return super.save(entity.getId(), entity);
  }

  @Override
  public List<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(PetType entity) {
    super.delete(entity);
  }

  @Override
  public void deleteById(Integer id) {
    super.deleteById(id);
  }
}
