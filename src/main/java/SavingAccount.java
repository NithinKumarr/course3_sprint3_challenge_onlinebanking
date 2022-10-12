public class SavingAccount {
    private String accountHolderName;
    private int age;
    private int accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private int availableBalance;
    private int totalBalance;
    private float interestRate;
    private String modeOfOperation;
    int remainingBalance;


    SavingAccount() {
        this.accountHolderName = "Nithin";
        this.accountNumber=1234567890;
        this.accountOpeningDate="19/10/2020";
        this.accountStatus="Active";
        this.totalBalance=6000;
        this.interestRate=10.5f;
        this.modeOfOperation="Self";
        this.age=23;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    long getAccountNumber(){
        return accountNumber;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    String getAccountOpeningDate(){
        return accountOpeningDate;
    }
    void setAccountOpeningDate(String accountOpeningDate){
        this.accountOpeningDate=accountOpeningDate;
    }
    String getAccountStatus(){
        return accountStatus;
    }
    void setAccountStatus(String accountStatus){
        this.accountStatus=accountStatus;
    }
    int getAvailableBalance(){
        return availableBalance;
    }
    void setAvailableBalance(int availableBalance){
        this.availableBalance=availableBalance;
    }
    float getInterestRate(){
        return  interestRate;
    }
    void setInterestRate(float interestRate){
        this.interestRate=interestRate;
    }
    String getModeOfOperation(){
        return modeOfOperation;
    }
    void  setModeOfOperation(String modeOfOperation){
        this.modeOfOperation=modeOfOperation;
    }
    int getTotalBalance(){
        return totalBalance;
    }
    void setTotalBalance(int totalBalance){
        this.totalBalance=totalBalance;
    }
    void eligiblityCheck() {
        if (age > 18) {
            System.out.println("Holder can Eligible");}
        else{
            System.out.println("Holder is not Eligible");
            System.exit(0);
        }

    }

    void retrieveBalance(){
        System.out.println("Balance is:- "+totalBalance);
    }
    void debitAmount(int debitAmount){

        if(getTotalBalance()>debitAmount)
            availableBalance =totalBalance-debitAmount;
        System.out.println("Withdraw Balance is:-  "+debitAmount);
        System.out.println(" Balance After Debit is:-  "+availableBalance);
    }
    void creditAmount(int creditAmount){
        availableBalance=availableBalance+creditAmount;
        System.out.println("Credit Balance is:-  "+creditAmount);
        System.out.println(" Balance After Credit is:-  "+availableBalance);
    }
    void transerferFund(int transferAmount){
        long min = 100000000000L;
        long max = 999999999999L;
        int accountNumberTransfer = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Fund Transfer to Account Number:- " + accountNumberTransfer);
        availableBalance=availableBalance-transferAmount;
        System.out.println("Transfer Amount:- " + transferAmount);
        System.out.println(" Balance After Transfer is :- "+availableBalance);
    }
    void display(){
        System.out.println("Account Holder Name:- "+getAccountHolderName());
        System.out.println("Account Holder Number:- "+getAccountNumber());
        System.out.println("Account Holder Age:- "+getAge());
        System.out.println("Account Opening Date :- "+getAccountOpeningDate());
        System.out.println("Account Status:- "+getAccountStatus());
        System.out.println("Account Total Balance:- "+getTotalBalance());
        System.out.println("Interest Rate:- "+getInterestRate());
        System.out.println("Mode Of Account :- "+getModeOfOperation());

    }
}
