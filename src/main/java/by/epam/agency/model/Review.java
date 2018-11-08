package by.epam.agency.model;

import java.time.LocalDateTime;

public class Review extends Entity {
	
	private LocalDateTime date;
	private String text;
	private int userId;
	private int tourId;
	
	public Review() {}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getTourId() {
		return tourId;
	}
	
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) { return false; }
		Review review = (Review) obj;
		if (review.getId() != getId()) { return false; }
		if (review.userId != userId) { return false; }
		if (review.tourId != tourId) { return false; }
		if (date == null) {
			if (review.date != null) {
				return false;
			}
		} else if (!date.equals(review.date)) {
			return false;
		}
		if (text == null) {
			if (review.text != null) {
				return false;
			}
		} else if (!text.equals(review.text)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		int prime = 31;
		hashCode += (getId() + userId + tourId) * prime;  
		hashCode += date == null ? 0 : date.hashCode() * prime;
		hashCode += text == null ? 0 : text.hashCode() * prime;
		return hashCode;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [id=" + getId() +
				", date=" + date +
				", userId=" + userId +
				", tourId=" + tourId + "]";
	}

}
