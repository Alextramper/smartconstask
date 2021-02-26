package ru.smartconstask.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.smartconstask.beans.Account;
import ru.smartconstask.beans.Client;
import ru.smartconstask.beans.TransactionData;
import ru.smartconstask.services.Services;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private Services<Client> clientServices;

    @Autowired
    private Services<Account> accountServices;

    @Autowired
    private Services<TransactionData> transactionDataServices;


    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value="clients", method = RequestMethod.GET)
    public ModelAndView getAllClient() {
        ModelAndView mav = new ModelAndView("clients");
        List<Client> clientList = clientServices.getAll();
        mav.addObject("clientList",clientList);
        mav.setViewName("clients");
        return mav;
    }

    @RequestMapping(value="accounts", method = RequestMethod.GET)
    public ModelAndView getAllAccount() {
        ModelAndView mav = new ModelAndView("accounts");
        List<Account> accountList = accountServices.getAll();
        mav.addObject("accountList",accountList);
        mav.setViewName("accounts");
        return mav;
    }

    @RequestMapping(value="transactions", method = RequestMethod.GET)
    public ModelAndView getAllTransactions() {
        ModelAndView mav = new ModelAndView("/transactions");
        List<TransactionData> transactionList = transactionDataServices.getAll();
        mav.addObject("transactiontList", transactionList);
        mav.setViewName("transactions");
        return mav;
    }

}
