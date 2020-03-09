package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0278 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0278();
		return table;
	}

	public static final String BLOCKED = "BLOCKED";
	public static final String BOOKED = "BOOKED";
	public static final String CANCELLED = "CANCELLED";
	public static final String COMPLETE = "COMPLETE";
	public static final String DC = "DC";
	public static final String DELETED = "DELETED";
	public static final String OVERBOOK = "OVERBOOK";
	public static final String PENDING = "PENDING";
	public static final String STARTED = "STARTED";
	public static final String WAITLIST = "WAITLIST";

	private Table0278(){
		setTableName("Filler Status Codes");
		setOID("2.16.840.1.113883.12.278");

		putMap("BLOCKED", "The indicated time slot(s) is(are) blocked.  Not used in the AIS, AIG, AIL, AIP segments.");
		putMap("BOOKED", "The indicated appointment is booked");
		putMap("CANCELLED", "The indicated appointment was stopped from occurring (cancelled prior to starting)");
		putMap("COMPLETE", "The indicated appointment has completed normally (was not discontinued, canceled, or deleted)");
		putMap("DC", "The indicated appointment was discontinued (DC¡¯ed while in progress, discontinued parent appointment, or discontinued child appointment)");
		putMap("DELETED", "The indicated appointment was deleted from the filler application");
		putMap("OVERBOOK", "The appointment has been confirmed; however it is confirmed in an overbooked state");
		putMap("PENDING", "Appointment has not yet been confirmed");
		putMap("STARTED", "The indicated appointment has begun and is currently in progress");
		putMap("WAITLIST", "Appointment has been placed on a waiting list for a paricular slot, or set of slots");

	}

}
