package com.devdi.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by devdi on 9/28/14.
 */
@Controller
public class AdminControl {

   @RequestMapping("/login")
   public String login(@RequestParam(required = false) String error, Model model) {
      if (error != null && error.equals("t")) {
         model.addAttribute("error", "Wrong username or password");
      }
      return "login";
   }

   @RequestMapping("/admin/control")
   public String showControl() {
      return "admin_page";
   }
}
