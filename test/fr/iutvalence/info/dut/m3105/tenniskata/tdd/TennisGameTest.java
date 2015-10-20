package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void aTestWhenTheScoreIsNullForTheTwoPlayers(){
		TennisGame currentGame = new TennisGame();
		assertEquals(currentGame.getScore(),"love-all");
	}
	@Test
	public void ifServerHasWinAPointAndRecieverNot(){
		TennisGame currentGame = new TennisGame();
		currentGame.serverWinThePoint();
		assertEquals(currentGame.getScore(), "fifteen-love");
	}
	
	@Test
	public void ifRecieverHasWinAPointAndServerNot(){
		TennisGame currentGame = new TennisGame();
		currentGame.recieverWinThePoint();
		assertEquals(currentGame.getScore(), "love-fifteen");
	}
	
	
	
	@Test
	public void ifTheScoreOfTheGameIsEqualAndAtFifteen(){
		TennisGame currentGame = new TennisGame();
		currentGame.recieverWinThePoint();
		currentGame.serverWinThePoint();
		assertEquals(currentGame.getScore(), "fifteen-all");
	}
	@Test
	public void ifTheScoreOfTheGameIsEqualAndAtThirty(){
		TennisGame currentGame = new TennisGame();
		for(int nbIncrem = 0; nbIncrem < 2; nbIncrem++){
			currentGame.recieverWinThePoint();
			currentGame.serverWinThePoint();
		}
		assertEquals(currentGame.getScore(), "thirty-all");
	}
	@Test
	public void ifTheScoreOfTheGameIsEqualAndAtForty(){
		TennisGame currentGame = new TennisGame();
		for(int nbIncrem = 0; nbIncrem < 3; nbIncrem++){
			currentGame.recieverWinThePoint();
			currentGame.serverWinThePoint();
		}
		assertEquals(currentGame.getScore(), "forty-all");
	}
	
	

}
