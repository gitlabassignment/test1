 
package com.org.model;
import java.util.Date;
 
public class CarVO 
{
 
	protected String bookingId; 
    @Override
	public String toString() {
		return "CarVO [bookingId=" + bookingId + ", carName=" + carName + ", bookingPrice=" + bookingPrice
				+ ", carSeats=" + carSeats + ", pickupDate=" + pickupDate + ", returnDate=" + returnDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + Float.floatToIntBits(bookingPrice);
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + carSeats;
		result = prime * result + ((pickupDate == null) ? 0 : pickupDate.hashCode());
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
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
		CarVO other = (CarVO) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (Float.floatToIntBits(bookingPrice) != Float.floatToIntBits(other.bookingPrice))
			return false;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carSeats != other.carSeats)
			return false;
		if (pickupDate == null) {
			if (other.pickupDate != null)
				return false;
		} else if (!pickupDate.equals(other.pickupDate))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		return true;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getBookingPrice() {
		return bookingPrice;
	}

	public void setBookingPrice(float bookingPrice) {
		this.bookingPrice = bookingPrice;
	}

	public int getCarSeats() {
		return carSeats;
	}

	public void setCarSeats(int carSeats) {
		this.carSeats = carSeats;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	protected String carName;
     
    protected float bookingPrice;
     
    protected int carSeats;
        
    protected String pickupDate;
     
    protected String returnDate;
     
}