class Solution {
    public int countMaxPlots(int n){
        return (int) n-1/2;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean adjacent = false;
        int k, plots, adjZeros;
        int maxPlots =(int) n-1/2;
        plots = 0;
        adjZeros = 0;
        
        k = 0;
        while( k < flowerbed.length){
            //Si arr[k] es 0 entra al while para contar ceros adyacentes
            if(adjacent){
                if(flowerbed[k] == 0){
                    adjZeros += 1;
                } else{
                    adjacent = false;
                }
            } else if(flowerbed[k] == 0){
                adjacent = true;
                adjZeros = 1;
            } else{
                continue;
            }
            plots += countMaxPlots(adjZeros);

            k++;
        }
        return plots <= maxPlots;
        
    }
}
