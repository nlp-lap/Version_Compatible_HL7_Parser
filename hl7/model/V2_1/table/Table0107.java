package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0107 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0107();
		return table;
	}

	public static final String L = "L";

	private Table0107(){
		setTableName("DEFERRED RESPONSE TYPE");
		setOID("2.16.840.1.113883.12.107");

		putMap("L", "Later than the DATE/TIME specified");

	}

}
