package sky.one.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sky.one.data.service.api.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {

  private final VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping(value = {"", "/", "/index"})
  public String vetsList(Model model) {
    model.addAttribute("vets", vetService.findAll());
    return "vet/index";
  }

}
