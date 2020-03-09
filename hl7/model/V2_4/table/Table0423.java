package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0423 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0423();
		return table;
	}

	public static final String D = "D";

	private Table0423(){
		setTableName("Case category code");
		setOID("2.16.840.1.113883.12.423");

		putMap("D", "Doctor's Office Closed");

	}

}
