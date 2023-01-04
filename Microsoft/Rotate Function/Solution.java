class Solution {
    public int maxRotateFunction(int[] nums) {
        int a= 0;
        int b = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            a+=(nums[i]*i);
            b=b+nums[i];
        }
        int m = a;
        for(int i=n-1;i>=1;i--){
            a+=b-n*nums[i];
            m = Math.max(m , a);
        }
      return m;
    }
}
