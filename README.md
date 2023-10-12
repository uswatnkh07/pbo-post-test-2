# pbo-post-test-2
Nama  : Uswatun Khasanah
NIM   : 2209116010
Kelas : SI A 2022
Tugas 2 praktikum mata kuliah PBO

# Sistem Keuangan Pribadi
## Daftar Isi
- [Studi Kasus]
- [Struktur Direktori Program]
- [Penjelasan Packege Utama Beserta Dengan Classnya]
- [Penjelasan Packege Kedua Beserta Dengan Classnya]
- [Penjelasan Program]
- [Output Program]
- [Kesimpulan]

## Studi Kasus
Baik disini saya membuat sebuah project bernama postes di java dengan dua packege. Yaitu package com.mycompany.postes sebagai package utama dengan satu file java class yang bernama Postes.java. Kemudian yaitu package baru yang saya buat atau dengan kata lain package kedua dengan nama data yang memiliki dua java class diantaranya yaitu java class PersonalFinance.java dan java class Transaction.java. Masing-masing java class yang berada di package masing-masing package memiliki fungsi yang berbeda. Maksudnya begini, di bagian package utama di dalam java class yang bernama Postes.java saya menjadikan ini sebagai tempat utama atau program yang menyangkut dengan inputan user atau pengguna termasuk tampilan fitur CRUD (Creat = Add, Read = View, Update = Edit, Delete=Remove). Kemudian yaitu, package kedua dengan nama data yang memiliki dua java class diantaranya yaitu java class PersonalFinance.java untuk menyimpan segala data-data pada project ini, dengan kata lain ini adalah tempat untuk database program. Kemudian yaitu java class Transaction.java yang saya gunakan sebagai setter dan getter program.

## Struktur Direktori Program
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/f13989da-286b-4bf0-af4b-2bb7ed87a703)
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/70f00d05-47e2-46f7-aca4-e2e171164e6d)


## Penjelasan Packege Utama Beserta Dengan Classnya
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/9c268405-475b-4e12-a8b6-d0ff3018a42c)
Ini adalah deklarasi package. Ini memberi tahu Java di mana kelas ini akan ditemukan di dalam package com.mycompany.postes2.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/0f7c9801-7b8e-496c-9766-d08be5b130f7)
Ini adalah pernyataan impor yang mengimpor kelas-kelas yang diperlukan untuk program ini. PersonalFinance dan Transaction adalah kelas yang digunakan dalam program ini. List digunakan untuk bekerja dengan daftar, dan Scanner digunakan untuk mendapatkan input dari pengguna.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/7db77091-7ce6-4421-9e50-ce4a7012d84a)
Ini adalah deklarasi kelas utama, yaitu Postes2. Program dimulai dari sini.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/43ce6700-de08-448a-8466-15c5df1dec5f)
Ini adalah metode utama (main method) dari program. Ini akan dijalankan saat program dimulai.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/da9e517b-6d74-4459-80b1-189f199e028b)
Di sini, objek personalFinance dan scanner diinisialisasi, dan variabel choice dideklarasikan untuk menyimpan pilihan pengguna.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/0bb1ba63-9b37-4fdf-a1f6-273164fb5f47)
Program memulai loop do-while di sini, yang berarti seluruh blok program dijalankan sekali dan kemudian pengguna memiliki opsi untuk mengulanginya.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/da5a6b6a-2fc5-4be9-8381-a13613c130cc)
Ini adalah bagian yang menampilkan menu pilihan kepada pengguna.

Setelah menampilkan menu, program menunggu input pengguna, dan pilihan pengguna disimpan dalam variabel choice. Kemudian, terdapat blok switch yang mengambil tindakan sesuai dengan pilihan pengguna.
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/d78dc4cd-7c35-4415-882a-c392ff953054)
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/8c5368de-8898-4291-babc-670e05481a00)


Ada beberapa kasus dalam switch yang menangani berbagai tindakan:
- Case 1: Menambahkan transaksi ke personal finance.
- Case 2: Menghapus transaksi dari personal finance.
- Case 3: Menampilkan transaksi yang ada.
- Case 4: Mengedit transaksi yang ada.
- Case 0: Keluar dari program.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/dd10e29a-945a-4520-af94-f54dd7f93895)
Dalam gambar di atas, program memeriksa apakah pilihan pengguna adalah 0 (Exit) atau tidak. Jika bukan, maka program akan kembali ke awal loop untuk menampilkan menu lagi. Pada akhirnya, program keluar dari loop dan menampilkan pesan "Exiting...". Kemudian, metode main dan kelas Postes2 ditutup.

## Penjelasan Packege Kedua Beserta Dengan Classnya
- [Java Class PersonalFinance]

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/eafe10f6-0e6a-4505-ad85-2a2d40fbef2a)

Ini adalah deklarasi package yang menunjukkan bahwa kelas PersonalFinance berada dalam package data.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/369a2e20-b1a7-4575-ad38-f5fb6f7a3472)

Ini adalah pernyataan impor yang mengimpor kelas-kelas yang diperlukan, yaitu ArrayList dan List dari pustaka Java.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/ad20c09e-f855-42f1-9f7e-66c07f73c869)

Ini adalah deklarasi kelas utama, yaitu PersonalFinance. Kelas ini bertanggung jawab untuk mengelola data transaksi keuangan pribadi.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/1e117d4c-c947-4cc2-812b-ea18a5b2e652)

Di sini, kita mendeklarasikan field (variabel anggota) transactions sebagai sebuah List yang berisi objek-objek Transaction. Field ini digunakan untuk menyimpan daftar transaksi keuangan pribadi.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/00d9d0f7-7c1c-43f7-8901-a70de3cc05bf)

Ini adalah konstruktor kelas PersonalFinance. Ketika objek PersonalFinance dibuat, konstruktor ini akan dijalankan. Di dalam konstruktor, kita menginisialisasi transactions sebagai objek ArrayList kosong. Ini berarti saat objek PersonalFinance dibuat, daftar transaksi awalnya kosong.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/08e8c4cb-2824-45bc-8167-3c16130e8f12)

Ini adalah metode yang digunakan untuk menambahkan transaksi ke daftar transactions. Saat dipanggil, metode ini menambahkan objek Transaction yang diberikan sebagai argumen ke dalam daftar transaksi.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/e1cd89b6-c2e5-4c2a-9b93-8b242faade2b)

Metode ini digunakan untuk menghapus transaksi dari daftar berdasarkan indeksnya. Pengguna harus memberikan indeks transaksi yang ingin dihapus. Metode ini akan menghapus transaksi pada posisi indeks yang diberikan dari daftar.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/fd51a0f2-7eda-45c1-9ac8-75b636c0d63d)

Metode ini digunakan untuk mengembalikan daftar transaksi ke pengguna. Saat metode ini dipanggil, ia mengembalikan daftar transactions yang telah disimpan dalam objek PersonalFinance.

- [Java Class Transaction]

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/00f830ee-54ff-493c-bf98-2f17620ed6cf)

Ini adalah deklarasi package yang menunjukkan bahwa kelas Transaction berada dalam package data.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/b5a7dcbf-11c7-4eb6-af62-b96fb14a6d85)

Ini adalah deklarasi kelas utama, yaitu Transaction. Kelas ini bertanggung jawab untuk merepresentasikan sebuah transaksi keuangan.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/b02325c8-2076-43da-8e9b-166b88a253c0)

Di sini, kita mendeklarasikan dua field (variabel anggota) yang merupakan atribut dari transaksi:
-Type adalah jenis transaksi (misalnya, "Income" atau "Expense").
-Amount adalah jumlah transaksi (sebagai bilangan desimal).
Field ini dideklarasikan sebagai final, yang berarti mereka tidak dapat diubah setelah diinisialisasi dalam konstruktor.

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/d082d160-98c0-4175-b21d-3399dbe2c899)

Ini adalah konstruktor kelas Transaction. Ketika objek Transaction dibuat, konstruktor ini dijalankan. Konstruktor ini menerima dua argumen, yaitu type dan amount, yang digunakan untuk menginisialisasi Type dan Amount sesuai dengan nilai yang diberikan.


![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/a9b371bb-6794-48a7-985e-a80dd725c444)

Ini adalah metode getter yang digunakan untuk mengakses nilai dari field Type dan Amount. Metode getType() mengembalikan jenis transaksi, dan metode getAmount() mengembalikan jumlah transaksi.


![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/1916b8a2-0a8a-497a-ad63-c24f7cdc501a)

Di sini, ada dua metode setter yang sebenarnya hanya menghasilkan pengecualian (exception). Ini mungkin adalah implementasi sementara atau dummy, yang tidak mengizinkan perubahan nilai Type dan Amount setelah objek transaksi dibuat. Biasanya, Anda akan ingin mengganti implementasi ini untuk memungkinkan pengguna mengubah nilai Type dan Amount objek transaksi jika diperlukan.



## Source Code Program
- [package com.mycompany.postes sebagai package utama dengan satu file java class yang bernama Postes.java]

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
                case 4 -> {
                    System.out.print("Enter transaction index to edit: ");
                    int editIndex = scanner.nextInt();
                    Transaction editTransaction = personalFinance.getTransactions().get(editIndex);
                    System.out.print("Enter new transaction type (Income/Expense): ");
                    String newType = scanner.next();
                    System.out.print("Enter new transaction amount: ");
                    double newAmount = scanner.nextDouble();
                    editTransaction.settype(newType);
                    editTransaction.setamount(newAmount);
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

- [package kedua dengan nama data yang memiliki dua java class diantaranya yaitu java class PersonalFinance.]

//Kelas PersonalFinance
package data;

import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
    private final List<Transaction> transactions;

    public PersonalFinance() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(int index) {
        transactions.remove(index);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

//Kelas Transaction
package data;

public class Transaction {
    private final String Type;
    private final double Amount;

    public Transaction(String type, double amount) {
        this.Type = type;
        this.Amount = amount;
    }

    public String getType() {
        return Type;
    }

    public double getAmount() {
        return Amount;
    }

    public void settype(String newType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setamount(double newAmount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

## Output Program
1. Tampilan Awal
   
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/4bb08022-a176-4240-b857-0f96f9c15d1e)


3. Percoban Menu Creat
   
![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/81ab1c74-0fad-4afb-9b7c-48ab1aaee6b2)


Jika sukses maka:

![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/7d50cf3c-be09-437d-ab7e-b2bdc46f7053)


4. Percobaan Menu Read
   - Sebelum Data Di Add
     
     ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/9d84c9f6-a8db-4b61-b72b-66b73b8c2be5)


    - Setelah Data Di Add
      
      ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/c8644363-e817-4d4f-9a2f-9c9372b39f32)

   
6. Percobaan Menu Delete

   
   ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/4911d052-298f-4939-ae68-6df64bb74c03)


8. Percobaan Menu Update
   - Sebelum DiUpdate
     ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/aa5f205f-6042-4d5c-8540-c7ffaaf71b94)


   - Proses Atau Pilihan Update
     ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/ee809ff3-bcbc-484b-b1eb-ac05a67efcd6)

     
   - Setelah Di Update
     ![image](https://github.com/uswatnkh07/pbo-post-test-2/assets/115265157/11594981-1db3-42fd-b864-9ddd79594812)





   


## Kesimpulan


