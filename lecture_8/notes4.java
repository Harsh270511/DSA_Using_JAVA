public class notes4 {
  public static int BuyAndSell(int prices[]){

    int buyPrice = Integer.MAX_VALUE;
    int maxPrice =0;

    for(int i=0; i<prices.length; i++){

      if(buyPrice < prices[i]){// profit

        int profit =prices[i] - buyPrice;//today profit
        maxPrice = Math.max(maxPrice, profit);
      }
      else{
        buyPrice = prices[i];
      }
    }
    return maxPrice;

  }
  public static void main(String[] args) {
    int prices[]= {7,6,5,4,3,2,1 };
    System.out.println(BuyAndSell(prices));
  }
  
}
