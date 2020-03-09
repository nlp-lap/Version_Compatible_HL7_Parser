package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0044 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0044();
		return table;
	}


	private Table0044(){
		setTableName("Contract code");
		setOID("2.16.840.1.113883.12.44");


	}

}
