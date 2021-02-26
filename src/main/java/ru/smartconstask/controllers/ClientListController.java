package ru.smartconstask.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.smartconstask.beans.Client;
import ru.smartconstask.services.Services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/clients")
public class ClientListController {


    @Autowired
    public ClientListController(Services<Client> clientServices) {
        this.clientServices = clientServices;
    }

    private Services<Client> clientServices;


    @GetMapping(value="/clform")
    public String add() {
        return "/clform";

    }

    @PostMapping("/clsave")
    public ModelAndView insert(
                        @RequestParam("login") String login,
                        @RequestParam("psswd") String psswd,
                        @RequestParam("firstname") String firstname,
                        @RequestParam("surname") String surname)  {
        Client client = new Client();
        client.setLogin(login);
        client.setPsswd(psswd);
        client.setFirstname(firstname);
        client.setSurname(surname);
        clientServices.insert(client);

        return new ModelAndView("redirect:/clients");
    }


    @RequestMapping(value="{id}", method = RequestMethod.GET)
        public ModelAndView delete(@PathVariable("id") int id) {
            clientServices.delete(id);
            return new ModelAndView("redirect:/clients");
        }
    }