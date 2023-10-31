class BankAccount{
    int acNO;
    String acName, acPhone, acEmail;
    double acBal;
    public BankAccount(int acNO,String acName,String acPhone,String acEmail,double acBal)
    {
        this.acNO=acNO;
        this.acName=acName;
        this.acPhone=acPhone;
        this.acEmail=acEmail;
        this.acBal=acBal;
    }
    public void accHolder()
    {
        System.out.println("Account Number: "+acNO);
        System.out.println("Account Holder Name: "+acName);
        System.out.println("Account Holder Phone Number: "+acPhone);
        System.out.println("Account Holder Email: "+acEmail);
        System.out.println("Account Balance: "+acBal);
    }
    public void deposit(double amount)
    {
        acBal += amount;
        System.out.println("Deposited: $"+ amount);
    }
    public void displayBal()
    {
        System.out.println("Account Number: "+acNO+"Balance: $"+acBal);
    }
} 

class CurrentAccount extends BankAccount{
     public CurrentAccount(int acNO, String acName, String acPhone, String acEmail, double acBal) {
        super(acNO, acName, acPhone, acEmail, acBal);
        //TODO Auto-generated constructor stub
     }
    }
     class CuAccount{
    public static void main(String[] Args){
    CurrentAccount cac=new CurrentAccount(1001, "Peter Smith","08100000","admin@gmail.com",0);
    cac .accHolder();
    cac .deposit(300);
    cac .displayBal();
}
     }
