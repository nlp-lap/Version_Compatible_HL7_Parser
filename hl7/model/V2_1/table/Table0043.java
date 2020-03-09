package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0043 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0043();
		return table;
	}


	private Table0043(){
		setTableName("CONDITION");
		setOID("2.16.840.1.113883.12.43");


	}

}
