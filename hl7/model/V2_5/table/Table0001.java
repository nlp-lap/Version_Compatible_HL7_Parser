package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0001 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0001();
		return table;
	}

	public static final String A = "A";
	public static final String F = "F";
	public static final String M = "M";
	public static final String N = "N";
	public static final String O = "O";
	public static final String U = "U";

	private Table0001(){
		setTableName("Administrative Sex");
		setOID("2.16.840.1.113883.12.1");

		putMap("A", "Ambiguous");
		putMap("F", "Female");
		putMap("M", "Male");
		putMap("N", "Not applicable");
		putMap("O", "Other");
		putMap("U", "Unknown");

	}

}
