package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0005 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0005();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String H = "H";
	public static final String R = "R";

	private Table0005(){
		setTableName("ETHNIC GROUP");
		setOID("2.16.840.1.113883.12.5");

		putMap("B", "Black");
		putMap("C", "Caucasian");
		putMap("H", "Hispanic");
		putMap("R", "Oriental");

	}

}
