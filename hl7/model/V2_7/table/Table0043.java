package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0043 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0043();
		return table;
	}


	private Table0043(){
		setTableName("Condition Code");
		setOID("");


	}

}
