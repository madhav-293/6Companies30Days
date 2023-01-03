class Solution {
    public String getHint(String secret, String guess) {
        int b=0, c=0;
        int[] arr1= new int[10];
        int[] arr2= new int[10];
        for(int i=0;i<secret.length();i++){
            int a= Character.getNumericValue(secret.charAt(i));
            int a1= Character.getNumericValue(guess.charAt(i));
            if(a==a1)
                b++;
            else{
                arr1[a]++;
                arr2[a1]++;
            }
        }
        for(int i=0;i<10;i++){
            c+= Math.min(arr1[i],arr2[i]);
        }
        return b + "A" + c + "B";
    }
}
