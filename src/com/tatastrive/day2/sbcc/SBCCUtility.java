package com.tatastrive.day2.sbcc;

import java.util.regex.Pattern;

public class SBCCUtility {

	//HXCB1234D:Dhoni:5:50:130:55:102:100:North:Batsman:3:2 
	public Player parsePlayerDetails( String playerDetails) throws InvalidPlayerIdException 
	{
		Player player = null;
		
		String[] playerArr = playerDetails.split(":");
		int index=0;
		String playerId = playerArr[index++];
		
		if(!validatePlayerId(playerId))
		{
			return player;
		}
		
		String playerName=playerArr[index++];
		int matchPlayed= Integer.parseInt(playerArr[index++]);
		
		String[] runScored= new String[matchPlayed];
		
		for(int i=0;i<matchPlayed;i++)
		{
			runScored[i]=playerArr[index++];
		}
		
		String playingZone=playerArr[index++];
		
		String playerType = playerArr[index++];
		
		
		if(playerType.equals("Batsman"))
		{
			int noOfHundreds = Integer.parseInt(playerArr[index++]);
			int noOfFifties =Integer.parseInt(playerArr[index++]);
			
			player= new Batsman(playerId, playerName, matchPlayed, 0, playingZone, noOfHundreds, noOfFifties);
		}
		
		else if(playerType.equals("Bowler"))
		{
			int noOfMaiden= Integer.parseInt(playerArr[index++]);
			int noOfHattrick =Integer.parseInt(playerArr[index++]);
			player = new Bowler(playerId, playerName, matchPlayed, 0, playingZone, noOfMaiden, noOfHattrick);
		}
		
		
		
		int totalRun=player.calculateTotalRuns(runScored);
		player.findStarRating();
		player.setRunScored(totalRun);
		
		return player;
	}


	public boolean 	validatePlayerId(String playerId) throws InvalidPlayerIdException
	{
		boolean isValid=false;
		
		isValid= Pattern.matches("[A-Z]{4}[0-9]{4}[A-Z]", playerId);
		if(isValid)
		{
			return true;
		}
		else
		{
			throw new InvalidPlayerIdException("Player with Id "+playerId+" is not valid");
		}
	}

}
