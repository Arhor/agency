package by.epam.agency.model;

public class Country extends Entity {

	private String name;
	
	public Country() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) { return false; }
		Country country = (Country) obj;
		if (country.getId() != getId()) { return false; }
		if (name == null) {
			if (country.name != null) {
				return false;
			}
		} else if (!name.equals(country.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode += getId() * 31;
		hashCode += name == null ? 0 : name.hashCode();
		return hashCode;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [id=" + getId() +
				", name=" + name + "]";
	}
	
}
