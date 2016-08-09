package com.gmail.shnapi007.controllers;

import com.gmail.shnapi007.entity.Client;
import com.gmail.shnapi007.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/allClients", method = RequestMethod.GET)
    private String clientsAll(Model model) {
        List<Client> clientList = clientService.findAll();
        model.addAttribute("clients", clientList);
        return "allClients";
    }

   /* @RequestMapping(value = "/newClient", method = RequestMethod.GET)
    private String newClient(){
        return "newClient";
    }

    @RequestMapping(value = "createClient", method = RequestMethod.POST)
    private String createNewClient(@RequestParam("name")String name, @RequestParam("surname") String surname, @RequestParam("age") int age, @RequestParam("email") String email, @RequestParam("phone") String phone, @RequestParam("password") String password){
        clientService.add(name, surname, age, email, phone, password);
        return "redirect:/allClients";
    }*/
}
