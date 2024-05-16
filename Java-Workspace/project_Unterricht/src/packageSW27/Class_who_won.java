package packageSW27;

public class Class_who_won {
	private String botString;
	private String playerString;
	private String messageString;
	
	
	

	public void setBotString(String botString) {
		this.botString = botString;
	}

	public void setPlayerString(String playerString) {
		this.playerString = playerString;
	}
	
	public String getmessage() {
		if(playerString=="Schere") {
			if(botString=="Schere") {
				messageString = "Tie";
			}
			else if(botString=="Stein") {
				messageString = "Lose";
			}
			else if(botString=="Papier") {
				messageString = "Win";
			}
		}
		else if(playerString=="Stein") {
			if(botString=="Schere") {
				messageString = "Win";
			}
			else if(botString=="Stein") {
				messageString = "Tie";
			}
			else if(botString=="Papier") {
				messageString = "Lose";
			}
		}
		else if(playerString=="Papier") {
			if(botString=="Schere") {
				messageString = "Lose";
			}
			else if(botString=="Stein") {
				messageString = "Win";
			}
			else if(botString=="Papier") {
				messageString = "Tie";
			}
		}
		else {
			messageString = "Error";
		}
		
		return messageString;
	}
	
}
