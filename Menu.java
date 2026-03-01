



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
    public void MainMenu() {
        Scanner scanner =  new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Menu");
            System.out.println("HotMeals");
            System.out.println("FastFoods");
            System.out.println("Drinks");
            System.out.println("Exit(Complete our orders)");
            System.out.println("Please choose an option");
            String option = scanner.nextLine();
            switch (option) {
                case "HotMeals":
                    System.out.println("Moving to the next section");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    new HotMeals().hotMeals();
                    break;
                case "FastFoods":
                    System.out.println("Moving to the next section");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    new FastFoods().FastFoods();
                    break;
                case "Drinks":
                    System.out.println("Moving to the next section");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    new Drinks().Drinks();
                    break;
                case "Exit":
                    running = false;
                    System.out.println("Your order has been recorded");
                    System.out.println("Your order is showing...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        System.out.println("\n============================");
        System.out.println("      YOUR FINAL ORDERS     ");
        System.out.println("============================");
        if (Main.allOrders.isEmpty()) {
            System.out.println("No orders placed.");
        } else {
            for (String item : Main.allOrders) {
                System.out.println("- " + item);

            }
        }
        if (Main.chooice4.equals("regular")) {
            System.out.println("----------------------------");
            System.out.printf("TOTAL BILL: %.2f  $\n", Main.bill);
            System.out.println("============================");
            Payment payment = new Payment();
            payment.Payment();
            try (PrintWriter writer = new PrintWriter(new FileWriter("receipt.txt", true))) {
                writer.println("\n-----------------------------------");
                writer.println("DATA/TIME: " + new java.util.Date());
                writer.println("TABLE NO: " + Main.chairnumber);
                writer.println("ORDERS");

                for (String item : Main.allOrders) {
                    writer.println("- " + item);
                }

                writer.println("COMMON BILL: " + Main.bill + " $");
                System.out.println("Receipt has been addded.");
                writer.println("--------------------------------\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (Main.chooice4.equals("office")) {
            double amount = Main.bill + 10;
            System.out.println("----------------------------");
            System.out.printf("TOTAL BILL: %.2f  $\n", amount);
            System.out.println("============================");
            Payment payment = new Payment();
            payment.Payment();
            try (PrintWriter writer = new PrintWriter(new FileWriter("receipt.txt", true))) {
                writer.println("\n-----------------------------------");
                writer.println("DATA/TIME: " + new java.util.Date());
                writer.println("TABLE NO: " + Main.chairnumber + "(This table is office table)");
                writer.println("ORDERS");

                for (String item : Main.allOrders) {
                    writer.println("- " + item);
                }

                writer.println("COMMON BILL: " + Main.bill + " $");
                System.out.println("Receipt has been addded.");
                writer.println("--------------------------------\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Thank you for choosing us!");
        Main.allOrders.clear();
        Main.bill = 0;

    }

}
