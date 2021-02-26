package ru.smartconstask.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.smartconstask.beans.Account;
import ru.smartconstask.services.Services;

@Controller
@RequestMapping("/accounts")
public class AccountListController {


    private Services<Account> accountServices;

    @Autowired
    public AccountListController(Services<Account> accountServices) {
        this.accountServices = accountServices;
    }

    @GetMapping(value="/acform")
    public String add(Model model) {
        model.addAttribute("clentform");
        return "acform";
    }

    @PostMapping("acsave")
    public ModelAndView insert(
                        @RequestParam("clientId") int clientid,
                        @RequestParam("sum") int sum) {
        Account account = new Account();
        account.setClientId(clientid);
        account.setSum(sum);
        accountServices.insert(account);

        return new ModelAndView("redirect:/accounts");
    }

    @RequestMapping(value="/accounts/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        accountServices.delete(id);
        return new ModelAndView("redirect:/accounts");
    }
}
