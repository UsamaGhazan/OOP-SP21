package com.company;
import java.io.*;
import java.util.*;
public class Testing{

    public static void withdraw(Account[] Acc){
        Scanner input = new Scanner(System.in);
        System.out.println("Account Number :");
        int Acc_No = input.nextInt();

        System.out.println("Withdraw Amount :");
        double Amount = input.nextDouble();

        for (int i = 0; i<10; i++){
            if (Acc[i].getAccountNo() == Acc_No){
                Acc[i].withdraw(Amount);
                return;
            }
        }
        System.out.println("Invalid Account\n");
    }

    public static void deposit(Account[] Acc){
        Scanner input = new Scanner(System.in);
        System.out.println("Account Number :");
        int Acc_No = input.nextInt();

        System.out.println("Depositing Amount :");
        double Amount = input.nextDouble();

        for (int i = 0; i<10; i++){
            if (Acc[i].getAccountNo() == Acc_No){
                Acc[i].deposit(Amount);
                return;
            }
        }
        System.out.println("Invalid Account\n");
    }

    public static void transfer(Account[] Acc){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number to transfer from :");
        int Acc_No1 = input.nextInt();

        System.out.println("Enter the account number to transfer to :");
        int Acc_No2 = input.nextInt();

        System.out.println("Enter the amount to transfer:");
        double Amount = input.nextDouble();

        int to_index = -1;
        int from_index = -1;

        for (int i = 0; i<10; i++){
            if (Acc[i].getAccountNo() == Acc_No1){
                from_index = i;
            }
        }

        for (int j = 0; j<10; j++){
            if (Acc[j].getAccountNo() == Acc_No2){
                to_index = j;
            }
        }

        if (from_index == -1 && to_index != -1)
            System.out.println("1st Account Is Invalid\n");

        if (to_index == -1 && from_index != -1)
            System.out.println("2nd Account Is Invalid\\n");

        if (to_index == -1 && from_index == -1)
            System.out.println("Both Accounts Are Invalid\n");

        if (to_index != -1 && from_index != -1){

            if (Acc[from_index].getBalance() >= Amount){
                Acc[from_index].withdraw(Amount);
                Acc[from_index].deposit(Amount);
            }
        }
    }
    public static void balanceInquiry(Account[] Acc){
        Scanner input = new Scanner(System.in);
        System.out.println("Account Number :");
        int Acc_No1 = input.nextInt();

        for (int i = 0; i<10; i++){
            if (Acc[i].getAccountNo() == Acc_No1){
                System.out.println(Acc[i].getBalance());
                return;
            }
        }
        System.out.println("Invalid Account\n");
    }

    public static void main(String[] args){

        Account[] Acc = new Account[10];
        for (int i = 0; i<10; i++){
            Acc[i] = new Account(i*100);
            Acc[i].setAccountNo(i);
            Acc[i].setName("name" + String.valueOf(i));

        }

        FileOutputStream G1 = null;
        ObjectOutputStream G2 = null;
        FileInputStream G3 = null;
        ObjectInputStream G4 = null;

        try {
            G1 = new FileOutputStream("%temp.bin%");
            G2 = new ObjectOutputStream(G1);
            for (int i = 0; i<10; i++){
                G2.writeObject(Acc[i]);
            }

            G1.close();

            G3 = new FileInputStream("%temp.bin%");
            G4 = new ObjectInputStream(G3);
            for (int i = 0; i<10; i++) {
                Acc[i] = (Account)G4.readObject();
            }

            while (true){
                System.out.println("***ATM Services****\n\n");
                System.out.println("Withdrawl ");
                System.out.println("Deposit ");
                System.out.println("Transfer ");
                System.out.println("Balance Inquiry ");
                System.out.println("Quit ");
                System.out.println("Choose Anyone :");

                Scanner input = new Scanner(System.in);
                int Char = input.nextInt();
                if (Char <1 || Char > 5)
                    System.out.println("Invalid choice");
                if (Char == 5){
                    break;
                }
                if (Char == 1){
                    withdraw(Acc);
                }
                if (Char == 2){
                    deposit(Acc);
                }
                if (Char == 3){
                    transfer(Acc);
                }
                if (Char == 4){
                    balanceInquiry(Acc);
                }
            }
            G1 = new FileOutputStream("%temp.bin%");
            G2 = new ObjectOutputStream(G1);
            for (int i = 0; i<10; i++){
                G2.writeObject(Acc[i]);
            }


        } catch (Exception X1) {

            X1.printStackTrace();

        }
    }
}