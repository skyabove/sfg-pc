package sky.one.data.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import sky.one.data.model.entities.Pet;
import sky.one.data.service.api.AbstractMapService;
import sky.one.data.service.api.PetService;
import sky.one.data.util.IdGenerator;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Integer> implements
    PetService {

  private final IdGenerator generator;

  public PetServiceMap(IdGenerator generator) {
    this.generator = generator;
  }

  @Override
  public Pet findById(Integer id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet entity) {
    if (entity.getId() == null) {
      entity.setId(generator.generateNextIntId(super.map.keySet()));
    }
    return super.save(entity.getId(), entity);
  }

  @Override
  public List<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(Pet entity) {
    super.delete(entity);
  }

  @Override
  public void deleteById(Integer id) {
    super.deleteById(id);
  }
}
