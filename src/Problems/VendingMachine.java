package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    HashMap<Enum<?>, Integer> coinInventoryMap;
    HashMap<Enum<?>, Integer> productInventoryMap;
    List<Integer> testMap;
    int currentAmount;

    public VendingMachine() {
        coinInventoryMap = new HashMap<Enum<?>, Integer>();
        coinInventoryMap.put(Coin.PENNY, 10);
        coinInventoryMap.put(Coin.NICKLE, 10);
        coinInventoryMap.put(Coin.DIME, 10);
        coinInventoryMap.put(Coin.QUARTER, 10);

        productInventoryMap = new HashMap<Enum<?>, Integer>();
        productInventoryMap.put(Product.COKE, 5);
        productInventoryMap.put(Product.PEPSI, 5);
        productInventoryMap.put(Product.SODA, 5);

        currentAmount = 0;
    }

    public void insertCoin(Coin coin) {
        int amount = coinInventoryMap.get(coin);
        coinInventoryMap.put(coin, amount + 1);
        currentAmount += amount;
    }

    public boolean purchase(Product product) {
        int productCost = product.getCost();

        if (currentAmount - productCost > 0) {
            currentAmount -= productCost;
            return true;
        }

        return false;
    }

    // incomplete
    public boolean canChange(int amount) {
        // HashMap<Enum<?>, Integer> tempCoinInventoryMap = new HashMap<Enum<?>,
        // Integer>(coinInventoryMap);

        // for (Coin coin : Coin.values()) {
        //     if (amount > coin.getValue()) {
        //         amount -= coin.getValue();
        //         var inventory = tempCoinInventoryMap.get(coin);
        //         if (inventory > 0) {
        //             inventory -= 1;
        //             tempCoinInventoryMap.put(coin, inventory);
        //         }
        //     }
        // }

        return false;
    }

    // public int[] purchase(Coin[] coins, Product product) {
    // int total = 0;

    // for (int i = 0; i < coins.length; i++) {
    // total = total + coins[i].getValue();
    // }

    // int productCount = total / product.getCost();
    // int change = total % productCost;

    // return new int[] { productCount, change };
    // }

    public enum Coin {
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

        private int denomination;

        private Coin(int denomination) {
            this.denomination = denomination;
        }

        public int getValue() {
            return denomination;
        }
    }

    public enum Product {
        COKE(25), PEPSI(35), SODA(45);

        private int cost;

        private Product(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }
    }
}