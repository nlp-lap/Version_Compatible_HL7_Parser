package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0414 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0414();
		return table;
	}


	private Table0414(){
		setTableName("Units of Time");
		setOID("");


	}

}
