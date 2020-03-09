package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0124 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0124();
		return table;
	}

	public static final String PORT = "PORT";
	public static final String WALK = "WALK";
	public static final String WHLC = "WHLC";

	private Table0124(){
		setTableName("TRANSPORTATION MODE");
		setOID("2.16.840.1.113883.12.124");

		putMap("PORT", "The examining device goes to Patient's Loc.");
		putMap("WALK", "Patient walks to diagnostic service");
		putMap("WHLC", "Wheelchair");

	}

}
