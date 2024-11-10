class Solution {
    public boolean isIncreasing(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        
        while(nums.size() >= (k*2)){
            int [] a = new int[k];
            int [] b = new int[k];
            for(int i = 0; i < k; i++){
                a[i] = nums.get(i);
                b[i] = nums.get((i+k));
            }
            if(isIncreasing(a) && isIncreasing(b)){
                return true;
            } else {
                nums.remove(0);
            }
        }
        return false;
    }
}
