package sky.one.data.service.api;

import sky.one.data.model.entities.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {

  Owner findByLastName(String lastName);
}
