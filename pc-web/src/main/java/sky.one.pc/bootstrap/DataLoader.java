package sky.one.pc.bootstrap;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sky.one.data.model.entities.Owner;
import sky.one.data.model.entities.Pet;
import sky.one.data.model.entities.PetType;
import sky.one.data.model.entities.Vet;
import sky.one.data.service.api.OwnerService;
import sky.one.data.service.api.PetTypeService;
import sky.one.data.service.api.VetService;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    PetType dog = new PetType();
    dog.setName("Dog");

    PetType cat = new PetType();
    cat.setName("Cat");

    Owner firstOwner = new Owner();
    firstOwner.setFirstName("Vasya");
    firstOwner.setLastName("Pupkin");
    firstOwner.setAddress("Jopa street, 777");
    firstOwner.setCity("Minsk");
    firstOwner.setTelephone("888-88-88");

    Pet sparky = new Pet();
    sparky.setName("Sparky");
    sparky.setBirthDate(LocalDate.now().minusYears(3));
    sparky.setOwner(firstOwner);
    sparky.setPetType(dog);
    firstOwner.getPets().add(sparky);

    ownerService.save(firstOwner);

    Owner secondOwner = new Owner();
    secondOwner.setFirstName("Petya");
    secondOwner.setLastName("Pipkin");
    secondOwner.setAddress("Ivan street, 898");
    secondOwner.setCity("Bobruisk");
    secondOwner.setTelephone("999-99-99");

    Pet marta = new Pet();
    sparky.setName("Marta");
    sparky.setBirthDate(LocalDate.now().minusYears(5));
    sparky.setOwner(secondOwner);
    sparky.setPetType(cat);
    secondOwner.getPets().add(marta);

    ownerService.save(secondOwner);

    Vet firstVet = new Vet();
    firstVet.setFirstName("Kostya");
    firstVet.setLastName("Vasechkin");
    vetService.save(firstVet);

    Vet secondVet = new Vet();
    secondVet.setFirstName("Dima");
    secondVet.setLastName("Ivanov");
    vetService.save(secondVet);

    System.out.println("Data loading complete");
  }
}
