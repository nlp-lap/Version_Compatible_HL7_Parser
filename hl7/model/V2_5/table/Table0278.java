package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0278 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0278();
		return table;
	}

	public static final String Blocked = "Blocked";
	public static final String Booked = "Booked";
	public static final String Cancelled = "Cancelled";
	public static final String Complete = "Complete";
	public static final String Dc = "Dc";
	public static final String Deleted = "Deleted";
	public static final String Noshow = "Noshow";
	public static final String Overbook = "Overbook";
	public static final String Pending = "Pending";
	public static final String Started = "Started";
	public static final String Waitlist = "Waitlist";

	private Table0278(){
		setTableName("Filler status codes");
		setOID("2.16.840.1.113883.12.278");

		putMap("Blocked", "The indicated time slot(s) is(are) blocked");
		putMap("Booked", "The indicated appointment is booked");
		putMap("Cancelled", "The indicated appointment was stopped from occurring (canceled prior to starting)");
		putMap("Complete", "The indicated appointment has completed normally (was not discontinued, canceled, or deleted)");
		putMap("Dc", "The indicated appointment was discontinued (DC'ed while in progress, discontinued parent appointment, or discontinued child appointment)");
		putMap("Deleted", "The indicated appointment was deleted from the filler application");
		putMap("Noshow", "The patient did not show up for the appointment");
		putMap("Overbook", "The appointment has been confirmed; however it is confirmed in an overbooked state");
		putMap("Pending", "Appointment has not yet been confirmed");
		putMap("Started", "The indicated appointment has begun and is currently in progress");
		putMap("Waitlist", "Appointment has been placed on a waiting list for a particular slot, or set of slots");

	}

}
