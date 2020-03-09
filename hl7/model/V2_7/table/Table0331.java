package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0331 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0331();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String M = "M";
	public static final String U = "U";

	private Table0331(){
		setTableName("Facility Type");
		setOID("");

		putMap("A", "Agent for a foreign manufacturer");
		putMap("D", "Distributor");
		putMap("M", "Manufacturer");
		putMap("U", "User");

	}

}
