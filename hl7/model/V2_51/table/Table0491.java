package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0491 extends Table{
	private static final String VERSION = "2.5.1";
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
		setOID("2.16.840.1.113883.12.491");

		putMap("E", "Excellent");
		putMap("F", "Fair");
		putMap("G", "Good");
		putMap("P", "Poor");

	}

}
