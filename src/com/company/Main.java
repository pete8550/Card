package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*String value[] = {"Ace","2","3","4","5","6","7","8","9","10","Knight","Queen","King"};
	String suit[] = {"Clubs","Diamonds","Hearts","Spades"};

	int random1 = (int) (Math.random()*13)%13;
	int random2 = (int) (Math.random()*4)%4;

        System.out.println("The card you picked is " + value[random1]+ " of " + suit[random2]);*/

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4");
		Scanner input = new Scanner(System.in);

		double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble();
	    double x3 = input.nextDouble();
	    double y3 = input.nextDouble();
	    double x4 = input.nextDouble();
	    double y4 = input.nextDouble();

	    double e=(y1-y2)*x1-(x1-x2)*y1;
	    double f=(y3-y4)*x3-(x3-x4)*x3;

	    

    }
}
