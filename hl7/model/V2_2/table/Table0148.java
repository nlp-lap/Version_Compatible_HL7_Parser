package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0148 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0148();
		return table;
	}

	public static final String AT = "AT";
	public static final String PC = "PC";

	private Table0148(){
		setTableName("PENALTY TYPE");
		setOID("2.16.840.1.113883.12.148");

		putMap("AT", "Currency Amount");
		putMap("PC", "Percentage");

	}

}
