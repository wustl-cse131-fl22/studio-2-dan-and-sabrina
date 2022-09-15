package studio2;

import java.util.Scanner;

public class Studio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money would you like to begin with?");
		double startAmount=in.nextDouble();
		System.out.println("What would you like your chance of winning to be (as a number between 0 and 1)?");
		double winChance=in.nextDouble();
		System.out.println("What would you like your win limit to be?");
		double winLimit=in.nextDouble();
		System.out.println("How many simulations do you want to run? ");
		int totalSimulations =in.nextInt(); 
		int totalSimulationsRun=0;
		int plays = 0;
		double money=startAmount;
		
		while (totalSimulationsRun <= totalSimulations) {
			plays=0;
		
		while((money>0)||(money<winLimit)) {//actually playing the game
			boolean didYouWin=(double)Math.random()<=winChance;
			if(didYouWin==true) {
				money++;
			}
			else {
				money--;
			}
			//System.out.println("You won: "+didYouWin);
			System.out.println("Current money: $"+money);
			plays++;
			//totalSimulations++;
		}
		System.out.print(totalSimulationsRun + ":" + plays +" ");
		if(money<=0) {//if you lose
			System.out.println( "Lose"); 
		}
		else if(money>=winLimit) {//if you win
			System.out.println("Win");
		}
		else {
			System.out.println("xxx");
		}
		totalSimulationsRun++;
		}
		
		
	}
}
