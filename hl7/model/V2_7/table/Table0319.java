package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0319 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0319();
		return table;
	}


	private Table0319(){
		setTableName("Department Cost Center");
		setOID("");


	}

}
