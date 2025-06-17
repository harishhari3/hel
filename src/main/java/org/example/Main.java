package org.example;

/* customer,account,transcation and bank.all data is managed in runtime memmory
 *customer represnts a client of the bank
 * account represents a bank account which can be savings or checking
 * transcation reprsents a single transcation deposit or withdraw
 * bank the main class
 */
// Represents a single bank customer
class Customer {
    enum ac{
        transcation,
        deposit1

    }
    String name;

    Customer(String name) {
        this.name = name;
    }

    public void showAccountType(String acc) {
        if (acc.equals("saving")) {
            System.out.println("Account Type: Saving");
        } else {
            System.out.println("Account Type: Checking");
        }
    }

    public void performTransaction(String type, int amount) {
        int totalAmt=amount;
        if (type.equals("deposit")) {
            System.out.println("Deposited: " + amount);
        } else if (type.equals("withdraw")) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
        if(type.equals("deposit")){
            totalAmt+=amount;

        }
    }
}

// Main class representing the bank
public class Main{
    enum trans{
        savings,
        checking
    }
    public static void main(String[] args) {
        Customer obj = new Customer("Hari");
        obj.showAccountType("saving");
        obj.performTransaction("deposit", 1000);
       // Customer.ac no= Customer.ac.deposit1;
        //System.out.println(no);
        Customer.ac ob=Customer.ac.transcation;//enum object creation for outside thge class
        System.out.println(ob);
        trans ob1=trans.checking;//object creation for enum inside the class
        System.out.println(ob1);

    }
}
