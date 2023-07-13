package com.Javaprograms;

public class FindLengthOfMaxString
{
public static void main(String[] args) 
{
		
		String[] s= {"hello","all","welcome","to","java","jhsyuil","iolwjri"};
		String maxlength=s[0];
		//System.out.println(s.length);7
		//System.out.println(maxlength.length());5
		
		for (int i = 0; i < s.length; i++) 
		{
			if(maxlength.length()<s[i].length())
			{
				maxlength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(maxlength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		
}
}