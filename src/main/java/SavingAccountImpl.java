public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingaccount=new SavingAccount();
        savingaccount.setAccountNumber(779588236);
        savingaccount.setAccountHolderName("shilpa");
        savingaccount.setAge(23);
        savingaccount.setAccountStatus("Active");
        savingaccount.setAccountOpeningDate("18/10/2021");
        savingaccount.setInterestRate(10.55f);
        savingaccount.setTotalBalance(6000);
        savingaccount.setModeOfOperation("Joint");
        savingaccount.eligiblityCheck();
        savingaccount.display();
        savingaccount.retrieveBalance();
        savingaccount.debitAmount(1000);
        savingaccount.creditAmount(1000);
        savingaccount.transerferFund(1000);

    }
}
