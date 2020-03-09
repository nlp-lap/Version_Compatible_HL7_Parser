package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0438 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0438();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String E = "E";
	public static final String I = "I";
	public static final String P = "P";
	public static final String S = "S";
	public static final String U = "U";

	private Table0438(){
		setTableName("Allergy Clinical Status");
		setOID("");

		putMap("C", "Confirmed or verified");
		putMap("D", "Doubt raised");
		putMap("E", "Erroneous");
		putMap("I", "Confirmed but inactive");
		putMap("P", "Pending");
		putMap("S", "Suspect");
		putMap("U", "Unconfirmed");

	}

}
