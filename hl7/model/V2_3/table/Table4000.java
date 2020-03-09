package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table4000 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table4000();
		return table;
	}


	private Table4000(){
		setTableName("Name Representation");
		setOID("2.16.840.1.113883.12.4000");


	}

}
