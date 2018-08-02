package in.co.capgemini;

public class Movie_Details {
	
	

	private String mov_Name, lead_Actor, lead_Actress, genre;
	
	

	public Movie_Details(String mov_Name, String lead_Actor, String lead_Actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		this.genre = genre;
	}


	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_Actor() {
		return lead_Actor;
	}

	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}

	public String getLead_Actress() {
		return lead_Actress;
	}

	public void setLead_Actress(String lead_Actress) {
		this.lead_Actress = lead_Actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMov_Name() {
		// TODO Auto-generated method stub
		return mov_Name;
	}


	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + getMov_Name() + ", lead_Actor=" + getLead_Actor() + ", lead_Actress=" + getLead_Actress()
				+ ", genre=" + getGenre()  + "]";
	}
	
	
	
}
