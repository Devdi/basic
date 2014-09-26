package com.devdi.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by devdi on 9/19/14.
 */
@Controller
@RequestMapping("/")
public class HomeController {

   @RequestMapping("/index")
   public String index(Model model, String page) {
      model.addAttribute("page", page);
      return "index";
   }

   @RequestMapping("/index/{page}")
   public String indexWithPage(Model model, @PathVariable String page) {
      model.addAttribute("page", page);
      return  "index";
   }

   @RequestMapping(value = "/form", method = RequestMethod.GET)
   public String formView(Model model) {
      model.addAttribute("fillform", new Form());
      return "form";
   }

   @RequestMapping(value = "/form", method = RequestMethod.POST)
   public String formSubmit(Model model, @Valid Form form, BindingResult bindingResult) {
      if (bindingResult.hasErrors()) {
         model.addAttribute("errormessage", bindingResult.getFieldError("page").getDefaultMessage());
         return "form";
      }
      return "redirect:/index/" + form.getPage();
   }
}
