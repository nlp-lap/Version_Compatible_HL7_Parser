package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0547 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0547();
		return table;
	}

	public static final String C = "C";
	public static final String N = "N";
	public static final String S = "S";

	private Table0547(){
		setTableName("Jurisdictional Breadth");
		setOID("");

		putMap("C", "County/Parish");
		putMap("N", "Country");
		putMap("S", "State/Province");

	}

}
