package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0484 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0484();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String N = "N";
	public static final String P = "P";
	public static final String Q = "Q";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";
	public static final String Z = "Z";

	private Table0484(){
		setTableName("Dispense Type");
		setOID("");

		putMap("B", "Trial Quantity Balance");
		putMap("C", "Compassionate Fill");
		putMap("N", "New/Renew - Full Fill");
		putMap("P", "New/Renew - Part Fill");
		putMap("Q", "Refill - Part Fill");
		putMap("R", "Refill - Full Fill");
		putMap("S", "Manufacturer Sample");
		putMap("T", "Trial Quantity");
		putMap("Z", "Non-Prescription Fill");

	}

}
