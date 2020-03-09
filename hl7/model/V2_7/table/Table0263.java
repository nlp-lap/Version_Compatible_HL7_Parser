package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0263 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0263();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String E = "E";
	public static final String F = "F";
	public static final String N = "N";
	public static final String R = "R";
	public static final String S = "S";

	private Table0263(){
		setTableName("Level of Care");
		setOID("");

		putMap("A", "Ambulatory");
		putMap("C", "Critical care");
		putMap("E", "Emergency");
		putMap("F", "Isolation");
		putMap("N", "Intensive care");
		putMap("R", "Routine");
		putMap("S", "Surgery");

	}

}
