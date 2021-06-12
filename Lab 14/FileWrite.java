package com.company;
import java.io.*;
public class FileWrite {
    public static void main(String[] args) {
        writeObject();
        readObjects();

        searchObject("111111");

    }
    public static void writeObject() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("account"));
            Account atm = new Account();

            atm.accountNumber = "111111";
            atm.balance = 1234;

            objectOutputStream.writeObject(atm);

            Account atm2 = new Account();

            atm2.accountNumber = "111121";
            atm2.balance = 1234;

            objectOutputStream.writeObject(atm2);

            Account atm3 = new Account();

            atm3.accountNumber = "111122";
            atm3.balance = 1234;

            objectOutputStream.writeObject(atm3);

            Account atm4 = new Account();

            atm4.accountNumber = "111112";
            atm4.balance = 1234;

            objectOutputStream.writeObject(atm4);

            Account atm5 = new Account();

            atm5.accountNumber = "1111232";
            atm5.balance = 1234;

            objectOutputStream.writeObject(atm5);


            Account atm6 = new Account();

            atm6.accountNumber = "111121123";
            atm6.balance = 1234;

            objectOutputStream.writeObject(atm6);


            Account atm7 = new Account();

            atm7.accountNumber = "111123121232";
            atm7.balance = 1234;

            objectOutputStream.writeObject(atm7);

            Account atm8 = new Account();

            atm8.accountNumber = "111123124122";
            atm8.balance = 1234;

            objectOutputStream.writeObject(atm8);

            Account atm9 = new Account();

            atm9.accountNumber = "1124111232";
            atm9.balance = 1234;

            objectOutputStream.writeObject(atm9);

            Account atm10 = new Account();

            atm10.accountNumber = "1111231232";
            atm10.balance = 1234;

            objectOutputStream.writeObject(atm10);


        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void readObjects() {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("account"));
                while (true) {
                    Account account = (Account) objectInputStream.readObject();
                    System.out.println(account.accountNumber);
                    System.out.println(account.balance);
                }
            } catch (EOFException ex) {
                System.out.println("End of file reached.");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        public void searchObject(String account) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("account"));
                while (true) {
                    Account account = (Account) objectInputStream.readObject();
                    If(book.name.equals(account) {
                        System.out.println(account.accountNumber);
                        System.out.println(account.balance);
                        break;
                    }
                }
            } catch (EOFException ex) {
                System.out.println("End of file reached.");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
