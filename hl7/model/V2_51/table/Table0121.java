package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0121 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0121();
		return table;
	}

	public static final String D = "D";
	public static final String E = "E";
	public static final String F = "F";
	public static final String N = "N";
	public static final String R = "R";

	private Table0121(){
		setTableName("Response flag");
		setOID("2.16.840.1.113883.12.121");

		putMap("D", "Same as R, also other associated segments");
		putMap("E", "Report exceptions only");
		putMap("F", "Same as D, plus confirmations explicitly");
		putMap("N", "Only the MSA segment is returned");
		putMap("R", "Same as E, also Replacement and Parent-Child");

	}

}
