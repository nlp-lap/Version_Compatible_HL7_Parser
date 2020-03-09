package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0236 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0236();
		return table;
	}

	public static final String D = "D";
	public static final String L = "L";
	public static final String M = "M";
	public static final String R = "R";

	private Table0236(){
		setTableName("Event Reported To");
		setOID("");

		putMap("D", "Distributor");
		putMap("L", "Local facility/user facility");
		putMap("M", "Manufacturer");
		putMap("R", "Regulatory agency");

	}

}
