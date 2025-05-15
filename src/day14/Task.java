package day14;

import java.util.Objects;

public class Task {
	private String time;
	private String description;
	public Task(String time ,String descripion) {
		this .time = time;
		this.description =descripion;
		
	}
	public String getTime() {
		return time;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description) && Objects.equals(time, other.time);
	}
	
	
}
