public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[]=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++)
                if(numbers[j]>target-numbers[i])
                    break;
                else if(target==numbers[i]+numbers[j]){
                    result[0]=i+1;
                    result[1]=j+1;
                    break;
                }
        }    
         return result;
    }
}