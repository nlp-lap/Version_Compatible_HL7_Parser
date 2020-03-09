package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0430 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0430();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String F = "F";
	public static final String H = "H";
	public static final String O = "O";
	public static final String P = "P";
	public static final String U = "U";

	private Table0430(){
		setTableName("Mode of Arrival Code");
		setOID("");

		putMap("A", "Ambulance");
		putMap("C", "Car");
		putMap("F", "On foot");
		putMap("H", "Helicopter");
		putMap("O", "Other");
		putMap("P", "Public Transport");
		putMap("U", "Unknown");

	}

}
