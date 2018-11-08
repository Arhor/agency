package by.epam.agency.model;

import java.util.Set;

public class User extends Entity {

	private String login;
	private String password;
	private Set<Tour> tours;
	
	public User() {}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<Tour> getTours() {
		return tours;
	}
	
	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	} 
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) { return false; }
		User user = (User) obj;
		if (user.getId() != getId()) { return false; }
		if (login == null) {
			if (user.login != null) {
				return false;
			}
		} else if (!login.equals(user.login)) {
			return false;
		}
		if (password == null) {
			if (user.password != null) {
				return false;
			}
		} else if (!password.equals(user.password)) {
			return false;
		}
		if (tours == null) {
			if (user.tours != null) {
				return false;
			}
		} else if (!tours.equals(user.tours)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		int prime = 31;
		hashCode += getId() * prime;
		hashCode += login == null ? 0 : login.hashCode() * prime;
		hashCode += password == null ? 0 : password.hashCode() * prime;
		for (Tour tour : tours) {
			hashCode += tour == null ? 0 : tour.hashCode() * prime;
		}
		return hashCode;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [id=" + getId() +
				", login=" + login +
				", password=" + password +
				", tours=" + tours + "]";
	}
	
}
