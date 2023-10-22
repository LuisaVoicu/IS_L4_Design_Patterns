package behavioralPatterns.strategy.example;

import behavioralPatterns.strategy.example.order.Order;
import behavioralPatterns.strategy.example.strategies.PayByPayPal;
import behavioralPatterns.strategy.example.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static{
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException{
        while(!order.isClosed()){
            int cost;
            String continueChoice;
            do{
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(READER.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("count: ");
                int count = Integer.parseInt(READER.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Continue? Y/N: ");
                continueChoice = READER.readLine();
            }while(continueChoice.equals("Y"));

            if(strategy == null){
                System.out.println("select payment method:"+ "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");

                String paymentMethod = READER.readLine();
                if(paymentMethod.equals("1")){
                    strategy = new PayByPayPal();
                }else{
                    strategy = new PayByPayPal();
                }
            }

            order.processOrder(strategy);

            System.out.println("pay "+order.getTotalCost()+" or continue shopping? P/C:");
            String proceed = READER.readLine();
            if(proceed.equals("P")){
                if(strategy.pay(order.getTotalCost())){
                    System.out.println("payment has been successful");
                }else {
                    System.out.println("fail! please check your data");
                }
                order.setClosed();
            }
        }
    }
}
