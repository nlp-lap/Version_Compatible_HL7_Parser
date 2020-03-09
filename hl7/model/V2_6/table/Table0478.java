package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0478 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0478();
		return table;
	}

	public static final String G = "G";
	public static final String N = "N";
	public static final String R = "R";
	public static final String Y = "Y";

	private Table0478(){
		setTableName("Formulary Status");
		setOID("2.16.840.1.113883.12.478");

		putMap("G", "Pharmaceutical substance is in the formulary, but guidelines apply");
		putMap("N", "Pharmaceutical substance is NOT in the formulary");
		putMap("R", "Pharmaceutical substance is in the formulary, but restrictions apply");
		putMap("Y", "Pharmaceutical substance is in the formulary");

	}

}
