package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0451 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0451();
		return table;
	}

	public static final String ALL = "ALL";

	private Table0451(){
		setTableName("Substance Identifier");
		setOID("");

		putMap("ALL", "Used for query of all inventory items");

	}

}
