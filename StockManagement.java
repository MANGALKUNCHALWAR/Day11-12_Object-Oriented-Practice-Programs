package assignment11and12.ObjectOrientedPracticePrograms;

import java.util.ArrayList;
import java.util.Scanner;

//1. Stock Account Management
//a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
//Print a Stock Report with the total value of each Stock and the total value of Stock.
//b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
//c. Logic -> Calculate the value of each stock and the total value
//d. O/P -> Print the Stock Report.
//e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
//from the input file. Have functions in the Class to calculate the value of each
//stock and the value of total stocks.

class Stock {
    ArrayList<String> stockName = new ArrayList<>();  //storing user input in arraylist
    ArrayList<Integer> numberOfShares = new ArrayList<>();
    ArrayList<Integer> sharesPrice = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStocks() {
        System.out.println("Enter the Stock name : ");  //stock name in String
        stockName.add((scanner.next()));

        System.out.println("Enter number of shares :");
        numberOfShares.add(scanner.nextInt());

        System.out.println("Enter price of stock :");
        sharesPrice.add(scanner.nextInt());

    }
}

class StockReport extends Stock {
    public void stockReport() {
        System.out.println("\t\t Stock Report ");
        for (int i = 0; i < stockName.size(); i++) {
            int total = (numberOfShares.get(i) * sharesPrice.get(i));
            System.out.println("Stock name : " + stockName.get(i) + "\nValue of each share : "  + sharesPrice.get(i)
                    + "\nTotal value of share : " + total);
            System.out.println("");

        }
    }
}

public class StockManagement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StockReport obj = new StockReport();

        while (true) {
            System.out.println("1. Enter new Stock \n2-Display Stock Report \n3- Exit");
            System.out.println("Enter your choice :");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    obj.addStocks();
                    break;
                case 2:
                    obj.stockReport();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid choice");
            }
            if(choice==3)
            {
                break;
            }
        }
    }
}
