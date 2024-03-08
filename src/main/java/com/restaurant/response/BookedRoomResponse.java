package com.restaurant.response;

import java.time.LocalDate;

import com.restaurant.Entities.Room;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class BookedRoomResponse {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	//@Column(name="check_in_date")
	private LocalDate checkInDate;
	
	//@Column(name="check_out_date")
	private LocalDate checkOutDate;
	
	//@Column(name="guest_fullname")
	private String guestFullName;
	
	//@Column(name="guest_email")
	private String guestEmail;
	
	//@Column(name="no_of_adult")
	private int NumOfAdults;
	
	//@Column(name="no_of_children")
	private int NumOfChildren;
	
	//@Column(name="total_no_guest")
	private int totalNumOfGuest;
	
	//@Column(name="confirmation_code")
	private String bookingConfirmationCode;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="room_id")
	private Room room;

	public BookedRoomResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
		super();
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public int getNumOfAdults() {
		return NumOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		NumOfAdults = numOfAdults;
	}

	public int getNumOfChildren() {
		return NumOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		NumOfChildren = numOfChildren;
	}

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public String getBookingConfirmationCode() {
		return bookingConfirmationCode;
	}

	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public BookedRoomResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String guestFullName,
			String guestEmail, int numOfAdults, int numOfChildren, int totalNumOfGuest, String bookingConfirmationCode,
			Room room) {
		super();
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.guestFullName = guestFullName;
		this.guestEmail = guestEmail;
		NumOfAdults = numOfAdults;
		NumOfChildren = numOfChildren;
		this.totalNumOfGuest = totalNumOfGuest;
		this.bookingConfirmationCode = bookingConfirmationCode;
		this.room = room;
	}

	public BookedRoomResponse() {
		super();
	}
	

}
