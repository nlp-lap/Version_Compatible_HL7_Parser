package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0910 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0910();
		return table;
	}


	private Table0910(){
		setTableName("Acquisition Modality");
		setOID("");


	}

}
