package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0364 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0364();
		return table;
	}

	public static final String _1R = "1R";
	public static final String _2R = "2R";
	public static final String AI = "AI";
	public static final String DR = "DR";
	public static final String GI = "GI";
	public static final String GR = "GR";
	public static final String PI = "PI";
	public static final String RE = "RE";

	private Table0364(){
		setTableName("Comment type");
		setOID("2.16.840.1.113883.12.364");

		putMap("1R", "Primary Reason");
		putMap("2R", "Secondary Reason");
		putMap("AI", "Ancillary Instructions");
		putMap("DR", "Duplicate/Interaction Reason");
		putMap("GI", "General Instructions");
		putMap("GR", "General Reason");
		putMap("PI", "Patient Instructions");
		putMap("RE", "Remark");

	}

}
