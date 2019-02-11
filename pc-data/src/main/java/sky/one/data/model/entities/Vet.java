package sky.one.data.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Vet extends Person {

  private List<VetSpecialty> specialties = new ArrayList<>();

  public List<VetSpecialty> getSpecialties() {
    return specialties;
  }

  public void setSpecialties(List<VetSpecialty> specialties) {
    this.specialties = specialties;
  }
}