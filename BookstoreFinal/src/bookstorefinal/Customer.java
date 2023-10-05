/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorefinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Group 49
 */
public class Customer {
    

    static boolean verify(String user, String pw) {
        boolean verification = false;
        String username, password;
        int points;
        Customer c1, current;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("customers.txt"));

            String line = reader.readLine();
            while (line != null) {
                String info[] = line.split(", ");
                username = info[0];
                password = info[1];
                points = Integer.parseInt(info[2]);
                c1 = new Customer(username, password, points);
                if ((user.equals(username)) && (pw.equals(password))) {
                    verification = true;
                    current = c1;
                    System.out.println(current.getUsername());
                    System.out.println(current.getPassword());
                    System.out.println(current.getPoints());
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("User doesn't exist");
        }
        return verification;
    }

    private String username;
    private String password;
    private int points;
    protected status Status;

    final int rewardPoints = 10;
    final int payPoints = 100;

    public Customer(String username, String password, int points) {
        this.username = username;
        this.password = password;
        this.points = points;

    }

    public ObservableList<Books> selectedBooks(ObservableList<Books> books) {
        ObservableList<Books> selectBooks = FXCollections.observableArrayList();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getSelect().isSelected()) {
                selectBooks.add(books.get(i));
            }
        }
        return selectBooks;
    }

    public double payCash(ObservableList<Books> selectBooks) {
        double transactionCost = 0;

        System.out.println(selectBooks.size());
        for (int i = 0; i < selectBooks.size(); i++) {
            System.out.println(selectBooks.get(i).getBookPrice());
            transactionCost = transactionCost + selectBooks.get(i).getBookPrice();
        }
        points = points + (int) transactionCost * rewardPoints;
        return transactionCost;
    }

    public double payPoints(ObservableList<Books> selectBooks) {
        double transactionCost = 0;

        System.out.println(selectBooks.size());
        for (int i = 0; i < selectBooks.size(); i++) {
            System.out.println(selectBooks.get(i).getBookPrice());
            transactionCost = transactionCost + selectBooks.get(i).getBookPrice();
        }

        if (points >= (int) transactionCost * payPoints) {
            points = points - (int) transactionCost * payPoints;
            transactionCost = 0;

        } else {
            transactionCost = transactionCost - points / 100;
            points = points % 100;
            points = points + (int) transactionCost * rewardPoints;
        }

        return transactionCost;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStatus() {
        if (points < 1000) {
            Status = new silverRank();
            return "Silver";
        } else {
            Status = new goldRank();
        }
        return "Gold";
    }
}
