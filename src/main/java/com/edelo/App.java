package com.edelo;

import java.util.Scanner;

/**
 * Transform Name
 * Receive arguments once at runtime
 */
public class App 
{	
    public static void main(String[] args)
    {
    		System.out.print("NAME\t: ");
    		Scanner in = new Scanner(System.in);
    		String name = in.nextLine();
    		StringTransformer stringTransformer = StringTransformer.getInstance();
    		String result = stringTransformer.getTransformedString(name);
    		System.out.println("RESULT\t: " + result);
		
    		in.close();
    }
}
