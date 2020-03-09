package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0491 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0491();
		return table;
	}

	public static final String E = "E";
	public static final String F = "F";
	public static final String G = "G";
	public static final String P = "P";

	private Table0491(){
		setTableName("Specimen Quality");
		setOID("");

		putMap("E", "Excellent");
		putMap("F", "Fair");
		putMap("G", "Good");
		putMap("P", "Poor");

	}

}
