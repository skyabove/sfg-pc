package sky.one.data.service.api;

import java.util.List;
import sky.one.data.model.entities.Vet;

public interface VetService {

  Vet findById(Integer id);

  Vet save(Vet owner);

  List<Vet> findAll();

}
