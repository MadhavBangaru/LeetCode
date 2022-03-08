//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    public double average(int[] salary) {
        
        if(salary.length<=2) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        double sum=0;       
        
        for(int i=0;i<salary.length;i++){
            min = Math.min(salary[i],min);
            max = Math.max(salary[i],max);
            sum+=salary[i];
        }    
        
        return (sum-min-max)/(salary.length-2);               
    }
}