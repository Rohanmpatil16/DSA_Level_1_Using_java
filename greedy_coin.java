public class greedy_coin {

    public static void main(String[] args) {
        int[] coins = {10, 5, 2, 1};
        int amount = 27;

        for (int coin : coins) {
            while (amount >= coin) {
                System.out.println("Coin used: " + coin);
                amount -= coin;
            }
        }
    }
    
}
