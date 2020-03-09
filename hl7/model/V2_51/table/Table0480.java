package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0480 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0480();
		return table;
	}

	public static final String M = "M";
	public static final String O = "O";
	public static final String S = "S";

	private Table0480(){
		setTableName("Pharmacy Order Types");
		setOID("2.16.840.1.113883.12.480");

		putMap("M", "Medication");
		putMap("O", "Other solution as medication orders");
		putMap("S", "IV Large Volume Solutions");

	}

}
