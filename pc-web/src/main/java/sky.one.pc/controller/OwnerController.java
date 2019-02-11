package sky.one.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sky.one.data.service.api.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping(value = {"", "/"})
  public String ownersList(Model model) {
    model.addAttribute("owners", ownerService.findAll());
    return "owner/owner-list";
  }

}
