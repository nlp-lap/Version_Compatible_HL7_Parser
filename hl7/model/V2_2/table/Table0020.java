package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0020 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0020();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0020(){
		setTableName("UNUSED TABLE");
		setOID("2.16.840.1.113883.12.20");

		putMap("1", "Moderate Manifestation");
		putMap("2", "Moderate Manifestation");
		putMap("3", "Major Manifestation");
		putMap("4", "Catastrophic Manifestation");

	}

}
