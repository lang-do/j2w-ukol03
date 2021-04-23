package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List<Vizitka> vizitky;
  public VizitkaController() {
    vizitky = List.of(
         new Vizitka("Dominika Langová", "Proton Therapy Center Czech", "Budínova 2437/1a", "Praha 8, 180 00", "Budínova 2437/1a, 180 00 Praha 8", "dominika.langova@ptc.cz", "222 999 000", "ptc.cz"),
         new Vizitka("Veronika Mlejnková", "Proton Therapy Center Czech", "Budínova 2437/1a", "Praha 8, 180 00", "Budínova 2437/1a, 180 00 Praha 8", "veronika.mlejnkova@ptc.cz", "222 999 000", "ptc.cz"),
         new Vizitka("zastupující kolega", "Proton Therapy Center Czech", "Budínova 2437/1a", "Praha 8, 180 00", "Budínova 2437/1a, 180 00 Praha 8", "", "222 999 000", "ptc.cz")
    );
  }


  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("Vizitka", vizitky);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("Vizitka", vizitky.get(id));
    return modelAndView;
  }
}
