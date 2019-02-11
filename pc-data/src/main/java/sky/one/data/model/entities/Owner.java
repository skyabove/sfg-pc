package sky.one.data.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Owner extends Person {

  private String address;
  private String city;
  private String telephone;
  private List<Pet> pets = new ArrayList<>();

  public List<Pet> getPets() {
    return pets;
  }

  public void setPets(List<Pet> pets) {
    this.pets = pets;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}
