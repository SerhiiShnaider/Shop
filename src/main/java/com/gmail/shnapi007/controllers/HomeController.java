package com.gmail.shnapi007.controllers;

import com.gmail.shnapi007.entity.Client;
import com.gmail.shnapi007.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by elvis on 04.07.2016.
 */
@Controller
public class HomeController {

    @Autowired
    public ClientService clientService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("client", new Client());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signUp(@ModelAttribute Client client){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        clientService.add(client);
        return "redirect:/home";
    }

    private String productInfo(Model model, @PathVariable String id){
        return "header";
    }

}
