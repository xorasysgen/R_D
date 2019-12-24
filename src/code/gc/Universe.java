package code.gc;

import java.io.Serializable;

public class Universe  implements Serializable{

	private static final long serialVersionUID = 6088228047026709701L;
	private String planet;
	private static Integer  planateId;
	private Double  planateMass;
	
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public Integer getPlanateId() {
		return planateId;
	}
	public void setPlanateId(Integer planateId) {
		this.planateId = planateId;
	}
	public Double getPlanateMass() {
		return planateMass;
	}
	public void setPlanateMass(Double planateMass) {
		this.planateMass = planateMass;
	}
	
	
}
