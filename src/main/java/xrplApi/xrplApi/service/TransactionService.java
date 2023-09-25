package xrplApi.xrplApi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xrplApi.xrplApi.entity.Transaction;

import java.util.List;

@Service
public class TransactionService {

    @Value("${xrpl.node-url}")
    private String xrplNodeUrl;


    public String sendTransaction(Transaction transaction) {
        return null;
    }

    public String getBalance(String address) {
        return address;
    }

    public List<Transaction> getTransactionHistory(String address) {
        return null;
    }
}


