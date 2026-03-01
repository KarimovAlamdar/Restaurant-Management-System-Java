




import java.util.Scanner;

public class Payment implements Cashable{
    public void Payment() {
        Scanner scanner = new Scanner(System.in);
        if(Main.chooice4.equals("regular")) {
            System.out.println("You must pay %.2f" + Main.bill + " manat");
            while (true) {
                System.out.println("How you want to pay(cash/credit card)");
                String amount = scanner.nextLine();
                try {
                    if (amount.equals("cash")) {
                        System.out.println("Paiying...");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("You paid succesfully!!!");
                        break;
                    } else if (amount.equals("credit card")) {
                        cash();
                        break;
                    } else {
                        throw new FalsePaymentMethod("You entered an invalid method");
                    }
                } catch (FalsePaymentMethod e) {
                    System.out.println("You entered an invalid method");
                }
            }
        }
        else if (Main.chooice4.equals("office")) {
            double money = Main.bill + 10;
            System.out.println("You must pay %.2f" + money + " manat(because the cabinet has a 10 manat deposit fee)");
            while (true) {
                System.out.println("How you want to pay(cash/credit card)");
                String amount = scanner.nextLine();
                try {
                    if (amount.equals("cash")) {
                        Main.bill = money;
                        System.out.println("Paiying...");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("You paid succesfully!!!");
                        break;
                    } else if (amount.equals("credit card")) {
                        cash();
                        break;
                    } else {
                        throw new FalsePaymentMethod("You entered an invalid method");
                    }
                } catch (FalsePaymentMethod e) {
                    System.out.println("You entered an invalid method");
                }
            }

        }
    }
    @Override
    public void cash() {
        if (Main.chooice4.equals("regular")) {
            System.out.println("You will get 10% cashback for paying with a credit card!!!");
            double amount = 0.0;
            amount = (Main.bill * 90) / 100;
            System.out.println("Paiying");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("You paid %.2f" + amount + " manat succesfully!!!");
        }
        else if (Main.chooice4.equals("office")) {
            System.out.println("You will get 10% cashback for paying with a credit card!!");
            double amount = 0.0;
            amount = (Main.bill * 90) / 100;
            amount +=10;
            Main.bill = amount;
            System.out.println("Paiying");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("You paid %.2f" + amount + " manat succesfully!!!");
        }
    }


}
