package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0050 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0050();
		return table;
	}


	private Table0050(){
		setTableName("Accident Code");
		setOID("2.16.840.1.113883.12.50");


	}

}
