package xrplApi.xrplApi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xrplApi.xrplApi.entity.Transaction;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xrplApi.xrplApi.entity.Transaction;

import java.util.List;

@Service
public class TransactionService {


    @Autowired
        private final Transaction transaction;

        @Autowired
        public TransactionService(Transaction transaction) {
            this.transaction = transaction;
        }

        public String getBalance(String address) {

            return "100 XRP";
        }

        public String sendTransaction(Transaction transaction) {

            return "Transaction ID";
        }

        public List<Transaction> getTransactionHistory(String address) {

            return List.of(new Transaction("Transaction 1"));
        }
    }




