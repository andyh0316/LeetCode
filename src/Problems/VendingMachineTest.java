package Problems;

import Problems.VendingMachine.Coin;
import Problems.VendingMachine.Product;

public class VendingMachineTest {
    // test
    public static void start() {
        VendingMachine vendingMachine = new VendingMachine();

        int[] coins; 
        int[] result;

        coins = new int[] { Coin.QUARTER.getValue(), Coin.QUARTER.getValue(), Coin.QUARTER.getValue(), Coin.QUARTER.getValue() };
        //result = vendingMachine.Purchase(coins, Product.PEPSI.getCost());
        //System.out.println(result[0] + " " + result[1]);
    }
}