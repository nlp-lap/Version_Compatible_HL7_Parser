package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0571 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0571();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ADJ = "ADJ";
	public static final String ADJSUB = "ADJSUB";
	public static final String ADJZER = "ADJZER";
	public static final String PAID = "PAID";
	public static final String PEND = "PEND";
	public static final String PRED = "PRED";
	public static final String REJECT = "REJECT";

	private Table0571(){
		setTableName("Invoice Processing Results Status");
		setOID("2.16.840.1.113883.12.571");

		putMap("ACK", "Acknowledge");
		putMap("ADJ", "Adjudicated with Adjustments");
		putMap("ADJSUB", "Adjudicated as Submitted");
		putMap("ADJZER", "Adjudicated to Zero");
		putMap("PAID", "Paid");
		putMap("PEND", "Pending");
		putMap("PRED", "Pre-Determination");
		putMap("REJECT", "Reject");

	}

}
