package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0895 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0895();
		return table;
	}

	public static final String E = "E";
	public static final String N = "N";
	public static final String U = "U";
	public static final String W = "W";
	public static final String Y = "Y";

	private Table0895(){
		setTableName("Present On Admission (POA) Indicator");
		setOID("2.16.840.1.113883.12.895");

		putMap("E", "Exempt");
		putMap("N", "No");
		putMap("U", "Unknown");
		putMap("W", "Not applicable");
		putMap("Y", "Yes");

	}

}
