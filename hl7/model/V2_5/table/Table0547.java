package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0547 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0547();
		return table;
	}

	public static final String C = "C";
	public static final String N = "N";
	public static final String S = "S";

	private Table0547(){
		setTableName("Jurisdictional Breadth");
		setOID("2.16.840.1.113883.12.547");

		putMap("C", "County/Parish");
		putMap("N", "Country");
		putMap("S", "State/Province");

	}

}
