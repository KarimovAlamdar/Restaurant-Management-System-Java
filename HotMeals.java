




import java.util.Scanner;

public class HotMeals implements AllergicItems{
    public void  hotMeals() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the hot-meals");
            System.out.println("Our Hot-Meals are:");
            System.out.println("Beef Stew 8$");
            System.out.println("Chicken soup 6$");
            System.out.println("Lentil Soup 7$");
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
                    case "Beef Stew":
                        try {
                            System.out.println("How many plates do you want to add?(1,2,3 or 4)");
                            int plates = scanner.nextInt();
                            scanner.nextLine();
                            if (plates > 4 || plates < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }
                            System.out.println("Do you want to add Beef Stew to order?");
                            String order = scanner.nextLine();
                            System.out.println("Do you have allergy?");
                            String order2 = scanner.nextLine();
                            try {
                                if (order2.equals("yes")) {
                                    allergicItems();
                                } else if (order2.equals("no")) {
                                    if (order.equals("yes")) {
                                        System.out.println("Your order is adding to order list");
                                        try {
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                        System.out.println(plates + " plates Beef Stew added to orders");
                                        Main.addOrder(option, plates);
                                        int money = plates * 8;
                                        Main.ordersBill(money);
                                        System.out.println("Do you want to add extra things?");
                                        String extra = scanner.nextLine();
                                        if (extra.equals("yes")) {
                                            System.out.println("Going to the next next section");
                                            try {
                                                Thread.sleep(2000);
                                            } catch (InterruptedException e) {
                                                throw new RuntimeException(e);
                                            }
                                            ExtraThings extraThings = new ExtraThings();
                                            extraThings.ExtraThings();
                                        }
                                    }
                                } else {
                                    throw new FalseChooice("Invalid choice");
                                }
                            }
                            catch (FalseChooice e) {
                                System.out.println(e.getMessage());
                            }
                        } catch (InvalidNumber e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Chicken soup":
                        try {
                            System.out.println("How many plates Chicken soup do you want? to add?(1,2,3,4,5,6)");
                            int plates = scanner.nextInt();
                            scanner.nextLine();
                            if (plates > 6 || plates < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 6");
                            }
                            System.out.println("Do you want to add Chicken soup to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to order list");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(plates + " plates Chicken soup added to orders");
                                Main.addOrder(option, plates);
                                int money = plates * 6;
                                Main.ordersBill(money);
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
                    case "Lentil Soup":
                        try {
                            System.out.println("How many plates Lentil Soupdo you want? to add?(1,2,3,4)");
                            int plates1 = scanner.nextInt();
                            scanner.nextLine();
                            if (plates1 > 4 || plates1 < 1) {
                                throw new InvalidNumber("Please enter a number between 1 and 4");
                            }
                            System.out.println("Do you want to add Lentil Soup to order?");
                            String order = scanner.nextLine();
                            if (order.equals("yes")) {
                                System.out.println("Your order is adding to order list");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println(plates1 + " plates Lentil Soup added to orders");
                                Main.addOrder(option, plates1);
                                int money = plates1 * 7;
                                Main.ordersBill(money);
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
            } catch (MealsException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void allergicItems() {
        System.out.println("In this meal has allergic items.That's why your order cancelled");
    }
}
