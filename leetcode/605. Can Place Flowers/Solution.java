class Solution {
    public int countMaxPlots(int zeros){
        return (zeros-1)/2;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean adjacent = false;
        int k, plots, adjZeros;
        plots = 0;
        adjZeros = 0;

        k = 0;
        while( k < flowerbed.length) {
            
            if (flowerbed[k] == 0 && adjacent) {
                adjZeros++;
            } else if(flowerbed[k] == 0){
                adjacent = true;
                adjZeros = 1;
            }else{
                plots += countMaxPlots(adjZeros);
                adjacent = false;
                adjZeros = 0;
            }

            k++;
        }
        return n <= plots;
    }
}
