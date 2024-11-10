class Solution {
    public boolean increasingArr(int[] a){
        int k = a.length;
        for(int i = 0; i < k-1; i++){
            if(a[i]> a[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int [] a = new int[k];
        int [] b = new int[k];

        for(int i = 0; i < nums.size() - k; i++){
            for(int j = 0; j < k; j++){
                a[j] = nums.get(i+j);
                b[j] = nums.get(i+j+k);
            }
            if(increasingArr(a)&&increasingArr(b)){
                return true;
            }
        }
        return false;
    }
}
