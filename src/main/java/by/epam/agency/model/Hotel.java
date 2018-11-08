package by.epam.agency.model;

import java.util.List;

public class Hotel extends Entity {

	private String name;
	private byte stars;
	private String website;
	private double latitude;
	private double longitude;
	private List<Feature> features;
	
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

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public enum Feature {
		SWIMMINGPOOL, BAR, CONDITIONER
	}
	
}
