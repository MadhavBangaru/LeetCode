package Day 1: Basic Data Types;
//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 != 0) low--;
        if(high % 2 != 0) high++;
        return (high-low)/2;
    }
}
