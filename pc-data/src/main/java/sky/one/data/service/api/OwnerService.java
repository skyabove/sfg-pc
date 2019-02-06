package sky.one.data.service.api;

import java.util.List;
import sky.one.data.model.entities.Owner;

public interface OwnerService {

  Owner findById(Integer id);

  Owner save(Owner owner);

  List<Owner> findAll();

  Owner findByLastName(String lastName);
}
