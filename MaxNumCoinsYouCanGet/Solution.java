import java.util.Arrays;
class Solution {
    public int maxCoins(int[] piles) {
        if(piles.length <= 0){
            return 0;
        }
        Arrays.sort(piles);
        int sum = 0;
        for(int ii = piles.length-2; ii >= piles.length/3; ii-=2){
            sum += piles[ii];
        }
        return sum;
    }
}