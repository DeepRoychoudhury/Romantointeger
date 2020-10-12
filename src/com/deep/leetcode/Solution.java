package com.deep.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	//conversion method
	public static int romanToInt(String s) {       
        int result=0;
        Map<Character,Integer> mapper = new HashMap<Character,Integer>();
        mapper.put('I',1);
        mapper.put('V',5);
        mapper.put('X',10);
        mapper.put('L',50);
        mapper.put('C',100);
        mapper.put('D',500);
        mapper.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(i<(s.length()-1) && (mapper.get(s.charAt(i))<mapper.get(s.charAt(i+1)))){ //check a[n] and a[n+1]
               result = result+(mapper.get(s.charAt(i+1))-mapper.get(s.charAt(i)));     
               //increment the position by 1
               if(i<(s.length()-1)){
               i++;             
               }
            }
            else{
                result = result + mapper.get(s.charAt(i));
            }
        }
               return result;
    }
	
	//main method
	public static void main(String[] args) {
		int result = romanToInt("MCMXCIV");
		//int result = romanToInt("III");
		System.out.println(result);
	}

}
