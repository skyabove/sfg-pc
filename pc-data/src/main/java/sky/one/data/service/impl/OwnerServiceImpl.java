package sky.one.data.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import sky.one.data.model.entities.Owner;
import sky.one.data.service.api.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {

  @Override
  public Owner findById(Integer id) {
    return null;
  }

  @Override
  public Owner save(Owner owner) {
    return null;
  }

  @Override
  public List<Owner> findAll() {
    return null;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
