package db_objs;

import java.math.BigDecimal;
import java.sql.Date;

public class Transaction {
    private final int userId;
    private final String transactionType;
    private final BigDecimal transactionAmount;
    private final Date transactionDate;

    public Transaction(int userId, String getTransactionType, BigDecimal transactionAmount, Date transactionDate){
        this.userId = userId;
        this.transactionType = getTransactionType;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}
