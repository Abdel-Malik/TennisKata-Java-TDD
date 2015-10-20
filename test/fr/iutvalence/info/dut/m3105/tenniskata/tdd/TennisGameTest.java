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

}
