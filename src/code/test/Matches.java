package code.test;

public class Matches {

	private String match_id;
	private String season;
	private String city;
	private String date;
	private String team1;
	private String team2;
	private String tossWinner;
	private String tossDecision;
	private String result;
	private String winner;
	public String getMatch_id() {
		return match_id;
	}
	public void setMatch_id(String match_id) {
		this.match_id = match_id;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTossWinner() {
		return tossWinner;
	}
	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}
	public String getTossDecision() {
		return tossDecision;
	}
	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matches [match_id=");
		builder.append(match_id);
		builder.append(", season=");
		builder.append(season);
		builder.append(", city=");
		builder.append(city);
		builder.append(", date=");
		builder.append(date);
		builder.append(", team1=");
		builder.append(team1);
		builder.append(", team2=");
		builder.append(team2);
		builder.append(", tossWinner=");
		builder.append(tossWinner);
		builder.append(", tossDecision=");
		builder.append(tossDecision);
		builder.append(", result=");
		builder.append(result);
		builder.append(", winner=");
		builder.append(winner);
		builder.append("]");
		return builder.toString();
	}
	


	
}
