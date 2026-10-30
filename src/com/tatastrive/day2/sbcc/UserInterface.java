package com.tatastrive.day2.sbcc;

import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		
		Player player = null;
		Scanner scanner = new Scanner(System.in);
		SBCCUtility sbccUtility = new SBCCUtility();
		int choice=0;
		while(true)
		{
			System.out.println("1. Validate player details");
			System.out.println("2. Create Batsman or Bowler");
			System.out.println("3. Exit ");
			System.out.println("Enter your choice");
			
			choice=scanner.nextInt();
			scanner.nextLine();
			
			
			
			 if(choice==1 || choice==2)
			{
				System.out.println("Enter the player details ");
				String playerDetails = scanner.nextLine();
				player = sbccUtility.parsePlayerDetails(playerDetails);
				
				if(player==null)
				{
					System.out.println("Please provide a valid record");
					return;
				}
				
			 System.out.printf("Player Id: %s\n",player.getPlayerId());
			 System.out.printf("layer Name: %s\n",player.getPlayerName());
			 System.out.printf("Matches played: %d\n",player.getMatchesPlayed());
			 System.out.printf("Total runs scored: %d\n",player.getRunScored());
			 System.out.printf("Playing zone: %s\n",player.getPlayingZone());
			 
			 if(player instanceof Batsman)
			 {
				 Batsman batsman= (Batsman) player;
				 System.out.printf("Number of Hundreds: %d\n",batsman.getNoOfHundreds());
				 System.out.printf("Number of Fifties: %d\n",batsman.getNoOfFifties());
				 System.out.printf("Star Rating: %.1f\n",batsman.getStarRating());
			 }
			 
			 else if(player instanceof Bowler)
			 {
				 Bowler bowler= (Bowler) player;
				 System.out.printf("Number of Maiden: %d\n",bowler.getNoOfMaiden());
				 System.out.printf("Number of Hattrick: %d\n",bowler.getNoOfHattrick());
				 System.out.printf("Star Rating: %.1f\n",bowler.getStarRating());
			 }
							
			}
			else if(choice==3)
			{
				System.out.println("Thank you for using SBCC application");
				return;
			}
		}
		
		
	}

}
