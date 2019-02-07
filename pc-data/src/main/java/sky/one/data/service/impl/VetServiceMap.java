package sky.one.data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sky.one.data.model.entities.Vet;
import sky.one.data.service.api.AbstractMapService;
import sky.one.data.service.api.VetService;
import sky.one.data.util.IdGenerator;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements
    VetService {

  @Autowired
  private final IdGenerator generator;

  public VetServiceMap(IdGenerator generator) {
    this.generator = generator;
  }

  @Override
  public Vet findById(Integer id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet entity) {
    if(entity.getId() == null) {
      entity.setId(generator.generateNextIntId(super.map.keySet()));
    }
    return super.save(entity.getId(), entity);
  }

  @Override
  public List<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(Vet entity) {
    super.delete(entity);
  }

  @Override
  public void deleteById(Integer id) {
    super.deleteById(id);
  }
}
