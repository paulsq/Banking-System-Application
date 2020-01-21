/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankin_system;

import java.util.Scanner;

/**
 *
 * @author paulsq
 */
public class mainbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount obj1 = new BankAccount("xyz","f05");
        obj1.showMenu();
    }
    
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    
    BankAccount(String userName, String userId){
       customerName = userName;
       customerId = userId;
    }
    
    void deposit(int amount)
    {
        if(amount != 0)
        {
         balance = balance + amount;
         previousTransaction = amount;
        }
    }
    void withdraw(int amount)
    {
      if(amount != 0)
      {
          balance = balance - amount;
          previousTransaction = -amount;
      }
    }
    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println("Deposited: "+Math.abs(previousTransaction));
        }
        else 
        {
            System.out.println("No transaction occurred");
        }
    }
    void showMenu() 
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("welcome "+customerName);
        System.out.println("User ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B.Deposite");
        System.out.println("C.Withdraw");
        System.out.println("D. previous transaction ");
        System.out.println("E.Exit");
        
        do
        {
            System.out.println("===============================");
            System.out.println("Enter an option");
            System.out.println("===============================");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            switch(option)
            {
                case 'A':
                    System.out.println("-------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------");
                    System.out.println("\n");
                    break;
                    
                case 'B':
                    System.out.println("--------------------------");
                    System.out.println("Enter deposited amount");
                    System.out.println("--------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount); 
                    System.out.println("\n");
                    break;
                        
                case 'C':
                    System.out.println("--------------------------");
                    System.out.println("Enter amount to withdraw");
                    System.out.println("--------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw (amount2); 
                    System.out.println("\n");
                    break;
                        
                 case 'D':
                    System.out.println("--------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------"); 
                    System.out.println("\n");
                    break;
                     
                 case 'E':
                     System.out.println("********************");
                     break;
                        
                    default:
                        System.out.println("Invalid option!.please select another option");
                        break;
            }
        }while(option != 'E');
        
        System.out.println("Thank you for using our services");
            
        }
        
          
      
}

