package com.org.model;

public class MemberVO {

	 private String membberId;
	 private String membeName;
	 private String membeContact;
	 private String bookingId;
	@Override
	public String toString() {
		return "MemberVO [membberId=" + membberId + ", membeName=" + membeName + ", membeContact=" + membeContact
				+ ", bookingId=" + bookingId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + ((membberId == null) ? 0 : membberId.hashCode());
		result = prime * result + ((membeContact == null) ? 0 : membeContact.hashCode());
		result = prime * result + ((membeName == null) ? 0 : membeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (membberId == null) {
			if (other.membberId != null)
				return false;
		} else if (!membberId.equals(other.membberId))
			return false;
		if (membeContact == null) {
			if (other.membeContact != null)
				return false;
		} else if (!membeContact.equals(other.membeContact))
			return false;
		if (membeName == null) {
			if (other.membeName != null)
				return false;
		} else if (!membeName.equals(other.membeName))
			return false;
		return true;
	}
	public String getMembberId() {
		return membberId;
	}
	public void setMembberId(String membberId) {
		this.membberId = membberId;
	}
	public String getMembeName() {
		return membeName;
	}
	public void setMembeName(String membeName) {
		this.membeName = membeName;
	}
	public String getMembeContact() {
		return membeContact;
	}
	public void setMembeContact(String membeContact) {
		this.membeContact = membeContact;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
}
