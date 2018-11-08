package by.epam.agency.model;

public class User extends Entity {

	private String login;
	private String password;
	
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
		return true;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode += getId() * 31;
		hashCode += login == null ? 0 : login.hashCode();
		hashCode += password == null ? 0 : password.hashCode();
		return hashCode;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [id=" + getId() +
				", login=" + login +
				", password=" + password + "]";
	}
	
}
