package com.qa.main.SingleResponsibility;

public class Mechanic {
	private boolean ChangTyre;
	private boolean spoiler;
	private boolean rideHeight;
	
	 public Mechanic(boolean CT, boolean S, boolean RH) {
	        this.ChangTyre = CT;
	        this.spoiler = S;
	        this.rideHeight = RH;
	 }
	 
	 public boolean ChangTyre() {
		 return ChangTyre;
	 }
	 
	 public boolean spoiler() {
		 return spoiler;
	 }
	 
	 public boolean rideHeight() {
		 return rideHeight;
	 }

	public boolean isChangTyre() {
		return ChangTyre;
	}

	public void setChangTyre(boolean changTyre) {
		ChangTyre = changTyre;
	}

	public boolean isSpoiler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}

	public boolean isRideHeight() {
		return rideHeight;
	}

	public void setRideHeight(boolean rideHeight) {
		this.rideHeight = rideHeight;
	}
	 
}
