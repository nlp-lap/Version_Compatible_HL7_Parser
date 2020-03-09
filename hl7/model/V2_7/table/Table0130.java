package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0130 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0130();
		return table;
	}

	public static final String HO = "HO";
	public static final String MO = "MO";
	public static final String PH = "PH";
	public static final String TE = "TE";

	private Table0130(){
		setTableName("Visit User Code");
		setOID("");

		putMap("HO", "Home");
		putMap("MO", "Mobile Unit");
		putMap("PH", "Phone");
		putMap("TE", "Teaching");

	}

}
