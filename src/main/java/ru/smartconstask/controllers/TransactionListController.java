package ru.smartconstask.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.smartconstask.beans.TransactionData;
import ru.smartconstask.services.Services;

@Controller
@RequestMapping("/transactions")
public class TransactionListController {


    private Services<TransactionData> transService;

    @Autowired
    public TransactionListController(Services<TransactionData> transService) {
        this.transService = transService;
    }

    @GetMapping(value="trform")
    public String newMAV() {
        return "/trform";
    }

    @PostMapping("trsave")
    public ModelAndView insert(@RequestParam("fromAccount") int fromAccount,
                               @RequestParam("toAccount") int toAccount,
                               @RequestParam("sum") int sum ) {
        TransactionData transactionData = new TransactionData();
        transactionData.setFromAccount(fromAccount);
        transactionData.setTargetAccount(toAccount);
        transactionData.setSum(sum);
        transService.insert(transactionData);
        return new ModelAndView("redirect:/transactions");
    }

    @RequestMapping(value="/transactions/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        transService.delete(id);
        return new ModelAndView("redirect:/transactions");
    }


}
