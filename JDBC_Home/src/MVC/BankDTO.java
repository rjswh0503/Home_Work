package MVC;

public class BankDTO {
    private int accountId;
    private int accountNumber;
    private String accountName;
    private double balance;
    private String branchName;
    private String lastTransactionDate;



    public  BankDTO(){
        //기본 생성자
    }

    //매개변수를 추가한 생성자
    public BankDTO(int accountId, int accountNumber, String accountName, double balance, String branchName,String lastTransactionDate){
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.branchName = branchName;
        this.lastTransactionDate = lastTransactionDate;

    }


    //Getter Setter 메서드 생성
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(String lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }









}
