package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0042 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0042();
		return table;
	}


	private Table0042(){
		setTableName("Company Plan Code");
		setOID("");


	}

}
