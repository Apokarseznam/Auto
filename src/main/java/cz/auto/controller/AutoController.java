package cz.auto.controller;

import cz.auto.service.AutoService;
import cz.auto.entity.Auto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AutoController {

    @Autowired
    private AutoService autoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        List<Auto> auto = autoService.getAutoList();

        model.addAttribute("modelAuto", auto);

        return "list";
    }

   @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {

        return "add";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete() {

        return "delete";
    }

    @RequestMapping(value = "/addAuto", method = RequestMethod.GET)
    public String addAuto(HttpServletRequest getAuto) {

        Auto auto = new Auto(getAuto.getParameter("make"), getAuto.getParameter("model"),
                getAuto.getParameter("colour"), getAuto.getParameter("power"),
                Integer.parseInt(getAuto.getParameter("id")));

        autoService.saveAuto(auto);

        return "redirect:/list";
    }
    
    @RequestMapping(value = "/updateAuto", method = RequestMethod.GET)
    public String updateAuto(HttpServletRequest getId, Model model) {

        Auto auto = autoService.getAuto(Integer.parseInt(getId.getParameter("id")));

        model.addAttribute("modelAuto", auto);

        return "update";
    }

    @RequestMapping(value = "/deleteAuto", method = RequestMethod.GET)
    public String deleteAuto(HttpServletRequest getId, Model model) {

        Auto auto = autoService.getAuto(Integer.parseInt(getId.getParameter("id")));

        model.addAttribute("modelAuto", auto);

        return "delete";
    }
    
   @RequestMapping(value = "/deleteConfirmed", method = RequestMethod.GET)
    public String deleteConfirmed(HttpServletRequest getId) {

        autoService.deleteAuto(Integer.parseInt(getId.getParameter("id")));

        return "redirect:/list";
    }

}
