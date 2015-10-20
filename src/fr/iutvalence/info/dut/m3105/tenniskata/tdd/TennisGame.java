package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private String scoreServer;
	private String scoreReciever;
	public final static String SEPARATION_SCORE = "-";
	
	
	public TennisGame(){
		this.scoreServer = "love";
		this.scoreReciever = "love";
	}
	
	
	
	public String getScore() {
		return this.buildScore();
	}
	
	private String buildScore(){
		String finalScore = "";
		if(this.compareEqualityScore()){
			finalScore = (this.scoreServer + this.SEPARATION_SCORE + "all");
		}else{
			finalScore = (this.scoreServer + this.SEPARATION_SCORE + this.scoreReciever);
		}
		
		return finalScore;
	}
	
	//private String correctScore(String theScore){
		
	//}
	
	private boolean compareEqualityScore() {
		boolean result = false;
		if(this.scoreReciever.equals(this.scoreServer)){
			result =  true;
		}
		return result;
	}



	public void serverWinThePoint(){
		this.scoreServer = returnUpScore(this.scoreServer);
	}
	
	public void recieverWinThePoint(){
		this.scoreReciever = returnUpScore(this.scoreReciever);
	}



	public static String returnUpScore(String score) {
		switch(score){
			case "love":
				score = "fifteen";
				break;
			case "fifteen":
				score = "thirty";
				break;
			case "thirty":
				score = "forty";
				break;
		}
		return score;
	}

}
