package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0434 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0434();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String O = "O";
	public static final String P = "P";
	public static final String S = "S";
	public static final String U = "U";

	private Table0434(){
		setTableName("Patient Condition Code");
		setOID("2.16.840.1.113883.12.434");

		putMap("A", "Satisfactory");
		putMap("C", "Critical");
		putMap("O", "Other");
		putMap("P", "Poor");
		putMap("S", "Stable");
		putMap("U", "Unknown");

	}

}
