package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0113 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0113();
		return table;
	}


	private Table0113(){
		setTableName("Discharged to location");
		setOID("2.16.840.1.113883.12.113");


	}

}
