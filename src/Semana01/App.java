package Semana01;

public class App {
    public static class BanckAccount {
     //Atributos
     String accountNumber;
     String owner;
     double balance;

     //Metodos
     void deposit ( double amount){
        balance += amount;
        System.out.println("Deposito: " + amount + "| nuevo balance: " + balance);
     }
     void withraw (double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Retiro: "+ amount + "Ahora el balance es: " + balance);
        } else {
            System.out.println("No tiene fondos suficientes ");
        }
     }
     void showBalance() {
        System.out.println("Su balance es: " + balance);

     }
    }
    public static void main(String[] args) {
        BanckAccount account1 = new BanckAccount();
        account1.accountNumber = "777-777-777";
        account1.balance = 2000000;
        account1.owner = "John";
        
        account1.showBalance();
        account1.deposit(200000);
        account1.withraw(1000000);
    }
}
