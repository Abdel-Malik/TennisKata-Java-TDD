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
	
	private boolean compareEqualityScore() {
		boolean result = false;
		if(this.scoreReciever.equals(this.scoreServer)){
			result =  true;
		}
		return result;
	}



	public void ServerWinThePoint(){
		switch(this.scoreServer){
			case "love":
				this.scoreServer = "fifteen";
				break;
			case "fifteen":
				this.scoreServer = "thirty";
				break;
			case "thirty":
				this.scoreServer = "forty";
				break;
			case "forty":
				this.scoreServer = "win";
				break;
		}
		
	}

}
