package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0214 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0214();
		return table;
	}


	private Table0214(){
		setTableName("Special Program Codes");
		setOID("2.16.840.1.113883.12.214");


	}

}
