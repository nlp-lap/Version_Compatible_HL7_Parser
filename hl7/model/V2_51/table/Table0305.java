package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0305 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0305();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String H = "H";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String S = "S";

	private Table0305(){
		setTableName("Person location type");
		setOID("2.16.840.1.113883.12.305");

		putMap("C", "Clinic");
		putMap("D", "Department");
		putMap("H", "Home");
		putMap("N", "Nursing Unit");
		putMap("O", "Provider's Office");
		putMap("P", "Phone");
		putMap("S", "SNF");

	}

}
