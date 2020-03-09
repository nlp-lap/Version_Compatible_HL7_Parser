package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0019 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0019();
		return table;
	}


	private Table0019(){
		setTableName("ANESTHESIA CODE");
		setOID("2.16.840.1.113883.12.19");


	}

}
