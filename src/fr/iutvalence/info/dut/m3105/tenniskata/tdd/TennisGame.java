package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	String score;
	
	public TennisGame(String score){
		this.score = score;
	}
	
	public TennisGame(){
		this.score = "love-all";
	}
	
	public String getScore() {

		return score;
	}

}
