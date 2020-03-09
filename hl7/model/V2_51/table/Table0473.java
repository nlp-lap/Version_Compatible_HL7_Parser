package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0473 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0473();
		return table;
	}

	public static final String G = "G";
	public static final String N = "N";
	public static final String R = "R";
	public static final String Y = "Y";

	private Table0473(){
		setTableName("Formulary Status");
		setOID("2.16.840.1.113883.12.473");

		putMap("G", "This observation/service is on the formulary, and has guidelines");
		putMap("N", "This observation/service is not on the formulary");
		putMap("R", "This observation/service is on the formulary, but is restricted");
		putMap("Y", "This observation/service is on the formulary");

	}

}
