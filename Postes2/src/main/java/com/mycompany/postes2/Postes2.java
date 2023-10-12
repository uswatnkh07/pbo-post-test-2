package com.mycompany.postes2;

import data.PersonalFinance;
import data.Transaction;
import java.util.List;
import java.util.Scanner;

public class Postes2 {
    public static void main(String[] args) {
        PersonalFinance personalFinance = new PersonalFinance();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menampilkan menu pilihan kepada pengguna
            System.out.println("==============================================");
            System.out.println("=== SELAMAT DATANG DI SISTEM KEUANGAN USWA ===");
            System.out.println("==============================================");
            System.out.println("Personal Finance Management Of Me");
            System.out.println("1. Add Your Transaction");
            System.out.println("2. Remove Your Transaction");
            System.out.println("3. View Your Transactions");
            System.out.println("4. Edit Your Transaction");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice My Bos (1/2/3/4/0): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter transaction type (Income/Expense): ");
                    String type = scanner.next();
                    System.out.print("Enter transaction amount: ");
                    double amount = scanner.nextDouble();
                    personalFinance.addTransaction(new Transaction(type, amount));
                    System.out.println("");
                    System.out.println("=== Transaction added successfully! ===");
                }
                case 2 -> {
                    System.out.print("Enter transaction index to remove: ");
                    int index = scanner.nextInt();
                    personalFinance.removeTransaction(index);
                    System.out.println("");
                    System.out.println("=== Transaction removed successfully! ===");
                }
                case 3 -> {
                    List<Transaction> transactions = personalFinance.getTransactions();
                    System.out.println("Transactions:");
                    for (int i = 0; i < transactions.size(); i++) {
                        Transaction transaction = transactions.get(i);
                        System.out.println((i + 1) + ". " + transaction.getType() + ": " + transaction.getAmount());
                    }
                }
//                case 4 -> {
//                    System.out.print("Enter transaction index to edit: ");
//                    int editIndex = scanner.nextInt();
//                    Transaction editTransaction = personalFinance.getTransactions().get(editIndex);
//                    System.out.print("Enter new transaction type (Income/Expense): ");
//                    String newType = scanner.next();
//                    System.out.print("Enter new transaction amount: ");
//                    double newAmount = scanner.nextDouble();
//                    editTransaction.settype(newType);
//                    editTransaction.setamount(newAmount);
//                    System.out.println("");
//                    System.out.println("=== Transaction edited successfully! ===");
//                }
                case 4 -> {
                    System.out.print("Enter transaction index to edit: ");
                    int editIndex = scanner.nextInt();
                    Transaction editTransaction = personalFinance.getTransactions().get(editIndex);
                    System.out.print("Enter new transaction type (Income/Expense): ");
                    String newType = scanner.next();
                    System.out.print("Enter new transaction amount: ");
                    double newAmount = scanner.nextDouble();
                    editTransaction.setType(newType); // Gunakan setType untuk mengubah jenis transaksi
                    editTransaction.setAmount(newAmount); // Gunakan setAmount untuk mengubah jumlah transaksi
                    System.out.println("");
                    System.out.println("=== Transaction edited successfully! ===");
                }

                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }
}