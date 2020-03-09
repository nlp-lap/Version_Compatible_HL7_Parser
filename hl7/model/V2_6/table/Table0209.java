package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0209 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0209();
		return table;
	}

	public static final String CT = "CT";
	public static final String EQ = "EQ";
	public static final String GE = "GE";
	public static final String GN = "GN";
	public static final String GT = "GT";
	public static final String LE = "LE";
	public static final String LT = "LT";
	public static final String NE = "NE";

	private Table0209(){
		setTableName("Relational operator");
		setOID("2.16.840.1.113883.12.209");

		putMap("CT", "Contains");
		putMap("EQ", "Equal");
		putMap("GE", "Greater than or equal");
		putMap("GN", "Generic");
		putMap("GT", "Greater than");
		putMap("LE", "Less than or equal");
		putMap("LT", "Less than");
		putMap("NE", "Not Equal");

	}

}
