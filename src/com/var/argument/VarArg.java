package com.var.argument;

public class VarArg
{
	public static void vararg(String ... str)
	{
		System.out.println("Number of arguments are:----"+str.length);
		
		System.out.println("The Arguments value are:");
		for(String s : str)
		{
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) 
	{
		vararg("apple","mango","1",null);
		vararg();
		vararg("magic");

	}

}
