



import java.util.Scanner;

public class Drinks {
    public void Drinks() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the Drinks");
            System.out.println("Our Drinks are:");
            System.out.println("Coca-Cola 0.5l-1$,1l-1.5$,1.5l-2$,2l-2.5$,2.5l-3$ ");
            System.out.println("Fanta 0.5l-1$,1l-1.5$,1.5l-2$,2l-2.5$,2.5l-3$");
            System.out.println("Sprite 0.5l-1$,1l-1.5$,1.5l-2$,2l-2.5$,2.5l-3$");
            System.out.println("Exit");
            System.out.println("Please choose an option:");
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
                    case "Coca-Cola":
                        try {
                            System.out.println("How many glasses Coca-Cola do you want to add?(1,2,3 or 4)");
                            int glasses1 = scanner.nextInt();
                            scanner.nextLine();
                            if (glasses1 > 4 || glasses1 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }
                            System.out.println("How many liters do you want to add?(0.5l,1l,1.5l,2l,2.5l)");
                            double liters1 = scanner.nextDouble();
                            scanner.nextLine();
                            if (liters1 < 0.5 || liters1 > 2.5) {
                                throw new InvalidNumber("Please enter a number between 0.5 and 2.5");
                            }
                            System.out.println("Do you want to add Coca-Cola to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to order list");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(glasses1 + " peaces " + liters1 + "l" + "  Coca-Cola added to orders");
                                Main.addOrderOnlyForDrink(option, glasses1, liters1);
                                double money;
                                if (liters1 == 0.5) {
                                    money = 1 * glasses1;
                                    Main.ordersBill(money);
                                } else if (liters1 == 1) {
                                    money = 1.5 * glasses1;
                                    Main.ordersBill(money);
                                } else if (liters1 == 1.5) {
                                    money = 2 * glasses1;
                                    Main.ordersBill(money);
                                } else if (liters1 == 2) {
                                    money = 2.5 * glasses1;
                                    Main.ordersBill(money);
                                } else if (liters1 == 2.5) {
                                    money = 3 * glasses1;
                                    Main.ordersBill(money);
                                }
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Going to the next section");
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
                    case "Fanta":
                        try {
                            System.out.println("How many glasses Fanta do you want? to add?(1,2,3,4)");
                            int glasses2 = scanner.nextInt();
                            scanner.nextLine();
                            if (glasses2 > 4 || glasses2 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 6");
                            }
                            System.out.println("How many liters do you want to add?(0.5l,1l,1.5l,2l,2.5l)");
                            double liters2 = scanner.nextDouble();
                            scanner.nextLine();
                            if (liters2 < 0.5 || liters2 > 2.5) {
                                throw new InvalidNumber("Please enter a number between 0.5 and 2.5");
                            }
                            System.out.println("Do you want to add Fanta to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to order list");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(glasses2 + " peaces " + liters2 + "l" + " Fanta added to orders");
                                Main.addOrderOnlyForDrink(option, glasses2, liters2);
                                double money;
                                if (liters2 == 0.5) {
                                    money = 1 * glasses2;
                                    Main.ordersBill(money);
                                } else if (liters2 == 1) {
                                    money = 1.5 * glasses2;
                                    Main.ordersBill(money);
                                } else if (liters2 == 1.5) {
                                    money = 2 * glasses2;
                                    Main.ordersBill(money);
                                } else if (liters2 == 2) {
                                    money = 2.5 * glasses2;
                                    Main.ordersBill(money);
                                } else if (liters2 == 2.5) {
                                    money = 3 * glasses2;
                                    Main.ordersBill(money);
                                }
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Going to the next section");
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
                    case "Sprite":
                        try {
                            System.out.println("How many glasses of Sprite do you want? to add?(1,2,3,4)");
                            int glasses3 = scanner.nextInt();
                            scanner.nextLine();
                            if (glasses3 > 4 || glasses3 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }
                            System.out.println("How many liters do you want to add?(0.5l,1l,1.5l,2l,2.5l)");
                            double liters3 = scanner.nextDouble();
                            scanner.nextLine();
                            if (liters3 < 0.5 || liters3 > 2.5) {
                                throw new InvalidNumber("Please enter a number between 0.5 and 2.5");
                            }
                            System.out.println("Do you want to add Sprite to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to order list");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(glasses3 + " peaces " + liters3 + "l" +  " Sprite added to orders");
                                Main.addOrderOnlyForDrink(option, glasses3, liters3);
                                double money;
                                if (liters3 == 0.5) {
                                    money = 1 * glasses3;
                                    Main.ordersBill(money);
                                } else if (liters3 == 1) {
                                    money = 1.5 * glasses3;
                                    Main.ordersBill(money);
                                } else if (liters3 == 1.5) {
                                    money = 2 * glasses3;
                                    Main.ordersBill(money);
                                } else if (liters3 == 2) {
                                    money = 2.5 * glasses3;
                                    Main.ordersBill(money);
                                } else if (liters3 == 2.5) {
                                    money = 3 * glasses3;
                                    Main.ordersBill(money);
                                }
                                System.out.println("Do you want to add extra things?");
                                String extra = scanner.nextLine();
                                if (extra.equals("yes")) {
                                    System.out.println("Going to the next section");
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
