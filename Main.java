import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double bill = 0;
    public static ArrayList<String> allOrders = new ArrayList<>();
    public static ArrayList<Integer> orderedTablesforRegular = new ArrayList<>();
    public static ArrayList<Integer> orderedTablesforOffice = new ArrayList<>();
    public static String chooice4;
    public static int chairnumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running) {
            System.out.println("Welcome to our Restourant");
            System.out.println("Exit from proqram");
            System.out.println("Continue");
            String choice = scanner.nextLine();
            try {
                switch (choice) {
                    case "Exit":
                        System.out.println("Exiting from program.Goodbye");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        running = false;
                        break;
                    case "Continue":
                        System.out.println("Do you want to delete table from ordered tables?(yes.no)");
                        String choice2 = scanner.nextLine();
                        if (choice2.equals("yes")) {
                            while (true) {
                                try {
                                    System.out.println("Do you want to quite in this section?(yes/no)");
                                    String choice3 = scanner.nextLine();
                                    if (choice3.equals("yes")) {
                                        break;
                                    } else if (choice3.equals("no")) {
                                        System.out.println("Which list do you want to delete the table from?(regular, office)");
                                        String choice4 = scanner.nextLine();
                                        if (choice4.equals("regular")) {
                                            System.out.println("Which number do you want to delete?");
                                            int number = scanner.nextInt();
                                            scanner.nextLine();
                                            try {
                                                if (orderedTablesforRegular.contains(number)) {
                                                    int index = orderedTablesforRegular.indexOf(number);
                                                    System.out.println(number + " is deleting from ordered table");
                                                    orderedTablesforRegular.remove(index);
                                                } else {
                                                    throw new FalseDeletedTable("This table is empty anyway");
                                                }
                                            } catch (FalseDeletedTable e) {
                                                System.out.println(e.getMessage());
                                            }
                                        }
                                        else if (choice4.equals("office")) {
                                            System.out.println("Which number do you want to delete?");
                                            int number = scanner.nextInt();
                                            scanner.nextLine();
                                            try {
                                                if (orderedTablesforOffice.contains(number)) {
                                                    int index = orderedTablesforOffice.indexOf(number);
                                                    System.out.println(number + " is deleting from ordered table");
                                                    orderedTablesforOffice.remove(index);
                                                } else {
                                                    throw new FalseDeletedTable("This table is empty anyway");
                                                }
                                            } catch (FalseDeletedTable e) {
                                                System.out.println(e.getMessage());
                                            }
                                        }
                                        else {
                                            throw new FalseChooice("False Input");
                                        }
                                    } else {
                                        throw new FalseChooice("False Chooice");
                                    }
                                }
                                catch (FalseChooice e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                        Menu menu = new Menu();
                        System.out.println("Where would you like to sit?(in the office or on regular chairs)");
                        String choice4 = scanner.nextLine();
                        chooice4 = choice4;
                        if (choice4.equals("office")) {
                            int tableNumbers1[] = {1, 2, 3, 4, 5};
                            System.out.println("Enter the number of tables you want to enter(between 0,6): ");
                            int tableNumber1 = scanner.nextInt();
                            scanner.nextLine();
                            chairnumber = tableNumber1;
                            try {
                                if (tableNumber1 < 1 || tableNumber1 > tableNumbers1.length) {
                                    throw new InvalidTableNumber("Invalid table number");
                                } else if (orderedTablesforOffice.contains(tableNumber1)) {
                                    throw new FullTableException("Table already cought");
                                } else {
                                    orderedTablesforOffice.add(tableNumber1);
                                    System.out.println("Moving to the next section");
                                    Thread.sleep(2000);
                                    menu.MainMenu();
                                }
                            } catch (InvalidTableNumber e) {
                                System.out.println(e.getMessage());
                            } catch (FullTableException e) {
                                System.out.println(e.getMessage());
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        else if (choice4.equals("regular")) {
                            int tableNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                            System.out.println("Enter the number of tables you want to enter(between 0,11): ");
                            int tableNumber = scanner.nextInt();
                            scanner.nextLine();
                            chairnumber = tableNumber;
                            try {
                                if (tableNumber < 1 || tableNumber > tableNumbers.length) {
                                    throw new InvalidTableNumber("Invalid table number");
                                } else if (orderedTablesforRegular.contains(tableNumber)) {
                                    throw new FullTableException("Table already cought");
                                } else {
                                    orderedTablesforRegular.add(tableNumber);
                                    System.out.println("Moving to the next section");
                                    Thread.sleep(2000);
                                    menu.MainMenu();
                                }
                            } catch (InvalidTableNumber e) {
                                System.out.println(e.getMessage());
                            } catch (FullTableException e) {
                                System.out.println(e.getMessage());
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            break;
                        }
                }
            }
            catch (IncorrectChooiceInBeginning e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public static void addOrder(String order, int numberOfPeople) {
        allOrders.add(order + " (" + numberOfPeople + " portion)");
    }

    public static void addOrderOnlyForDrink(String order, int numberOfPeople, double liters) {
        allOrders.add(order + " [" + liters + "L] (" + numberOfPeople + " peaces)");
    }

    public static void ordersBill(double money) {
        bill += money;
    }
    public static void addOrder1(String order, int numberOfPeople) {
        allOrders.add(order + " (" + numberOfPeople + " peaces)");
    }

}