package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0519 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0519();
		return table;
	}


	private Table0519(){
		setTableName("Override reason");
		setOID("2.16.840.1.113883.12.519");


	}

}
