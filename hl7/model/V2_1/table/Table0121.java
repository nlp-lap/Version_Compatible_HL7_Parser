package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0121 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0121();
		return table;
	}

	public static final String E = "E";
	public static final String F = "F";
	public static final String N = "N";

	private Table0121(){
		setTableName("RESPONSE FLAG");
		setOID("2.16.840.1.113883.12.121");

		putMap("E", "Report exceptions only.");
		putMap("F", "Same as D, plus confirmations explicitly.");
		putMap("N", "Only the MSA segment is returned.");

	}

}
