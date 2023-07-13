package com.Javaprograms;

public class FindLengthOfMinString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"hello","all","welcome","to","java","jhsyuil","iolwjri","kilos"};
		String minlength=s[0];
		for (int i = 0; i <s.length; i++)
		{
			if(minlength.length()>s[i].length())
			{
				minlength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++)
		{
			if(minlength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		

	}


}
