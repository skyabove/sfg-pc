package sky.one.data.service.api;

import java.util.List;
import sky.one.data.model.entities.Pet;

public interface PetService {

  Pet findById(Integer id);

  Pet save(Pet owner);

  List<Pet> findAll();

}
