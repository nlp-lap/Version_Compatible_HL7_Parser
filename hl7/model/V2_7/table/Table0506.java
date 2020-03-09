package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0506 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0506();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";
	public static final String N = "N";
	public static final String S = "S";
	public static final String T = "T";

	private Table0506(){
		setTableName("Service Request Relationship");
		setOID("");

		putMap("C", "Compound");
		putMap("E", "Exclusive");
		putMap("N", "Nurse prerogative");
		putMap("S", "Simultaneous");
		putMap("T", "Tapering");

	}

}
