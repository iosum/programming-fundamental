public class BankTransactionRecord {
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;

    public BankTransactionRecord() {

    }


    public boolean isCanadianFunds() {
        return canadianFunds;
    }

    public void setCanadianFunds(boolean canadianFunds) {
        this.canadianFunds = canadianFunds;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public long getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    public void setTransactionReferenceNumber(long transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    public BankTransactionRecord(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber) {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
    }
}
