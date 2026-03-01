



import java.util.Scanner;

public class ExtraThings {
    public void ExtraThings() {
        Scanner scanner =  new Scanner(System.in);
        boolean flaq = true;
        while(flaq) {
            System.out.println("Welcome to the ExtraThings Menu");
            System.out.println("They are extra things...");
            System.out.println("Ketchup 0.6$");
            System.out.println("Mayonnaise 0.6$");
            System.out.println("Ice 0.3$");
            System.out.println("Onion 0.6$");
            System.out.println("Vegetables 2$");
            System.out.println("Exit");
            System.out.println("Choose an option");
            String choice = scanner.nextLine();
            try {
                switch (choice) {
                    case "Exit":
                        System.out.println("Going to the previous section");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        flaq = false;
                        break;
                    case "Ketchup":
                        try {
                            System.out.println("Do you want to add ketchup to orders?");
                            String answer = scanner.nextLine();
                            if (answer.equals("yes")) {
                                System.out.println("How many do you want to add?(1,2,3 or 4)");
                                int number2 = scanner.nextInt();
                                if (number2 > 4 && number2 < 1) {
                                    throw new InvalidNumber("This number must be between 1 and 4");
                                }
                                System.out.println("Your order is adding to orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " package ketchup was added to orders");
                                Main.addOrder1(choice, number2);
                                double money = number2 * 0.6;
                                Main.ordersBill(money);
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Mayonnaise":
                        try {
                            System.out.println("Do you want to add mayonnaise to orders?");
                            String answer1 = scanner.nextLine();
                            if (answer1.equals("yes")) {
                                System.out.println("How many do you want to add?(1,2,3 or 4)");
                                int number2 = scanner.nextInt();
                                if (number2 > 4 && number2 < 1) {
                                    throw new InvalidNumber("This number must be between 1 and 4");
                                }

                                System.out.println("Your order is adding to orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " package mayonnaise was added to orders");
                                Main.addOrder1(choice, number2);
                                double money = number2 * 0.6;
                                Main.ordersBill(money);
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Ice":
                        try {
                            System.out.println("Do you want to add ice to orders?");
                            String answer2 = scanner.nextLine();
                            if (answer2.equals("yes")) {
                                System.out.println("How many do you want to add?(1,2,3 or 4)");
                                int number2 = scanner.nextInt();
                                if (number2 > 4 && number2 < 1) {
                                    throw new InvalidNumber("This number must be between 1 and 4");
                                }
                                System.out.println("Your order is adding to orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " piaces ice was added to orders");
                                Main.addOrder1(choice, number2);
                                double money = number2 * 0.3;
                                Main.ordersBill(money);
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Onion":
                        try {
                            System.out.println("Do you want to add onion to orders?");
                            String answer3 = scanner.nextLine();
                            if (answer3.equals("yes")) {
                                System.out.println("How many do you want to add?(1,2,3 or 4)");
                                int number2 = scanner.nextInt();
                                if (number2 > 4 && number2 < 1) {
                                    throw new InvalidNumber("This number must be between 1 and 4");
                                }
                                System.out.println("Your order is adding to orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " pieces onion was added to orders");
                                Main.addOrder1(choice, number2);
                                double money = number2 * 0.3;
                                Main.ordersBill(money);
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Vegetables":
                        try {
                            System.out.println("Do you want to add vegetables to orders?");
                            String answer4 = scanner.nextLine();
                            if (answer4.equals("yes")) {
                                System.out.println("How many do you want to add?(1,2,3 or 4)");
                                int number2 = scanner.nextInt();
                                if (number2 > 4 && number2 < 1) {
                                    throw new InvalidNumber("This number must be between 1 and 4");
                                }
                                System.out.println("Your order is adding to orders");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(number2 + " plates vegetables was added to orders");
                                Main.addOrder1(choice, number2);
                                double money = number2 * 2;
                                Main.ordersBill(money);
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        throw new MealsException("Invalid choice");
                }
            }
            catch (MealsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
