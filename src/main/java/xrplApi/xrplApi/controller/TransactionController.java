package xrplApi.xrplApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xrplApi.xrplApi.entity.Transaction;
import xrplApi.xrplApi.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/xrpl")
public class TransactionController {


    private final TransactionService xrpService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.xrpService = transactionService;
    }

    @GetMapping("/balance/{address}")
    public ResponseEntity<String> getBalance(@PathVariable String address) {

        String balance = xrpService.getBalance(address);
        return ResponseEntity.ok(balance);
    }

    @PostMapping("/send-transaction")
    public ResponseEntity<String> sendTransaction(@RequestBody Transaction transaction) {

        String transactionId = xrpService.sendTransaction(transaction);
        return ResponseEntity.ok(transactionId);
    }

    @GetMapping("/transaction-history/{address}")
    public ResponseEntity<List<Transaction>> getTransactionHistory(@PathVariable String address) {

        List<Transaction> history = xrpService.getTransactionHistory(address);
        return ResponseEntity.ok(history);
    }
}





