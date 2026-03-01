



import java.util.Scanner;

public class FastFoods {
    public void FastFoods() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the fast-foods");
            System.out.println("Our Fast Foods are:");
            System.out.println("Burger 4$ ");
            System.out.println("Potato free 3$");
            System.out.println("Nagets 3$");
            System.out.println("Exit");
            System.out.println("Please choose an option");
            String option = scanner.nextLine();
            try {
                switch (option) {
                    case "Exit":
                        System.out.println("Going to the previous section");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        flag = false;
                        break;
                    case "Burger":
                        try {
                            System.out.println("How many burger do you want to add?(1,2,3 or 4)");
                            int number1 = scanner.nextInt();
                            scanner.nextLine();
                            if (number1 > 4 || number1 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }

                            System.out.println("Do you want to add burger to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to the orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number1 + "  Burger added to orders");
                                Main.addOrder(option, number1);
                                int money = number1 * 4;
                                Main.ordersBill(money);
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Moving to the next page");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    ExtraThings extraThings = new ExtraThings();
                                    extraThings.ExtraThings();
                                }

                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Potato free":
                        try {
                            System.out.println("How many Potato free do you want? to add?(1,2,3,4)");
                            int number2 = scanner.nextInt();
                            scanner.nextLine();
                            if (number2 > 4 || number2 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 6");
                            }
                            System.out.println("Do you want to add Potato free to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to the orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " plates Potato free added to orders");
                                Main.addOrder(option, number2);
                                int money = number2 * 3;
                                Main.ordersBill(money);
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Moving to the next page");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    ExtraThings extraThings = new ExtraThings();
                                    extraThings.ExtraThings();
                                }
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Nagets":
                        try {
                            System.out.println("How many plates Nagets do you want? to add?(1,2,3,4)");
                            int number3 = scanner.nextInt();
                            scanner.nextLine();
                            if (number3 > 4 || number3 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }
                            System.out.println("Do you want to add Nagets to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to the orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number3 + " plates Nagets added to orders");
                                Main.addOrder(option, number3);
                                int money = number3 * 3;
                                Main.ordersBill(money);
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Moving to the next page");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    ExtraThings extraThings = new ExtraThings();
                                    extraThings.ExtraThings();
                                }
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        throw new MealsException("Invalid input");
                }
            }
            catch (MealsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
