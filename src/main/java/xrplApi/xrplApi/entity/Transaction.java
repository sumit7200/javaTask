package xrplApi.xrplApi.entity;

import java.math.BigDecimal;

public class Transaction {

    private String transactionId;
    private BigDecimal amount;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
