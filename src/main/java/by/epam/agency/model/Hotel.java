package by.epam.agency.model;

import java.util.Set;

public class Hotel extends Entity {

	private String name;
	private byte stars;
	private String website;
	private double latitude;
	private double longitude;
	private Set<Feature> features;
	
	public Hotel() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStars() {
		return stars;
	}

	public void setStars(byte stars) {
		this.stars = stars;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Set<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(Set<Feature> features) {
		this.features = features;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) { return false; }
		Hotel hotel = (Hotel) obj;
		if (hotel.getId() != getId()) { return false; }
		if (hotel.stars != stars) { return false; }
		if (hotel.latitude != latitude) { return false; }
		if (hotel.longitude != longitude) { return false; }
		if (name == null) {
			if (hotel.name != null) {
				return false;
			}
		} else if (!name.equals(hotel.name)) {
			return false;
		}
		if (website == null) {
			if (hotel.website != null) {
				return false;
			}
		} else if (!website.equals(hotel.website)) {
			return false;
		}
		if (features == null) {
			if (hotel.features != null) {
				return false;
			}
		} else if (!features.equals(hotel.features)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		int prime = 31;
		hashCode += getId() * prime;
		hashCode += stars * prime;
		hashCode += (int) (latitude * prime);
		hashCode += (int) (longitude * prime);
		hashCode += name == null ? 0 : name.hashCode() * prime;
		hashCode += website == null ? 0 : website.hashCode() * prime;
		for (Feature feature : features) {
			hashCode += feature == null ? 0 : feature.hashCode() * prime;
		}
		return hashCode;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + 
				" [id" + getId() +
				", name=" + name +
				", stars=" + stars +
				", website=" + website +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", features=" + features + "]";
	}

	public enum Feature {
		SWIMMINGPOOL, BAR, CONDITIONER
	}
	
}
