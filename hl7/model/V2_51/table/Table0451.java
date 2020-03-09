package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0451 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0451();
		return table;
	}

	public static final String ALL = "ALL";

	private Table0451(){
		setTableName("Substance identifier");
		setOID("2.16.840.1.113883.12.451");

		putMap("ALL", "Used for query of all inventory items");

	}

}
