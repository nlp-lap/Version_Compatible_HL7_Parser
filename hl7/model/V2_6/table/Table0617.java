package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0617 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0617();
		return table;
	}

	public static final String C = "C";
	public static final String M = "M";
	public static final String V = "V";

	private Table0617(){
		setTableName("Address Usage");
		setOID("2.16.840.1.113883.12.617");

		putMap("C", "Classification");
		putMap("M", "Mailing");
		putMap("V", "Visit");

	}

}
