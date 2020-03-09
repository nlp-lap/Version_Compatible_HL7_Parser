package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0402 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0402();
		return table;
	}

	public static final String D = "D";
	public static final String G = "G";
	public static final String M = "M";
	public static final String U = "U";

	private Table0402(){
		setTableName("School type");
		setOID("2.16.840.1.113883.12.402");

		putMap("D", "Dental");
		putMap("G", "Graduate");
		putMap("M", "Medical");
		putMap("U", "Undergraduate");

	}

}
