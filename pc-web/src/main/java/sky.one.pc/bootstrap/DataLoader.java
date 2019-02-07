package sky.one.pc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sky.one.data.model.entities.Owner;
import sky.one.data.model.entities.Vet;
import sky.one.data.service.api.OwnerService;
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
    Owner firstOwner = new Owner();
    firstOwner.setFirstName("Vasya");
    firstOwner.setLastName("Pupkin");
    ownerService.save(firstOwner);

    Owner secondOwner = new Owner();
    secondOwner.setFirstName("Petya");
    secondOwner.setLastName("Pipkin");
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
