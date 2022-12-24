package com.s1;

public class MaxNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     String name="siddu";
     int leng=name.length();
     String rev="";
     for(int i=0;i<name.length();i++)
     {
    	 rev=name.charAt(i)+rev;
     }
     System.out.println(rev);
	}

}
