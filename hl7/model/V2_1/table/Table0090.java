package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0090 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0090();
		return table;
	}


	private Table0090(){
		setTableName("PROCEDURE TYPE");
		setOID("2.16.840.1.113883.12.90");


	}

}
