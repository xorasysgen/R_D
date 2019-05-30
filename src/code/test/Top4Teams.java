package code.test;

public class Top4Teams {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Top4Teams [year=");
		builder.append(year);
		builder.append(", team=");
		builder.append(team);
		builder.append(", count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}
	private String year;
	private String team;
	private Integer count;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	

}
