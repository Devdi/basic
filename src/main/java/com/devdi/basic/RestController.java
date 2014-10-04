package com.devdi.basic;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by devdi on 10/2/14.
 */
@Controller
@RequestMapping("/")
public class RestController {

    private static List<User> users = new ArrayList<>();

    @RequestMapping(value = "/rest/names", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(User user) {
        users.add(user);
    }

    @RequestMapping(value = "/names", method = RequestMethod.GET)
    public void list(Model model) {
        model.addAttribute("users", users);
        model.addAttribute("user", new User());
    }

    @RequestMapping(value = "/rest/names", method = RequestMethod.GET)
    public @ResponseBody List restList(Model model) {
        return users;
    }

    @RequestMapping(value = "/rest/notmodified", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NOT_MODIFIED)
    public @ResponseBody User notModified() {
        return null;
    }
}
