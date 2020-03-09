package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0172 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0172();
		return table;
	}


	private Table0172(){
		setTableName("Veterans Military Status");
		setOID("2.16.840.1.113883.12.172");


	}

}
