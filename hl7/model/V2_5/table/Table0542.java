package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0542 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0542();
		return table;
	}


	private Table0542(){
		setTableName("Specimen Source Type Modifier");
		setOID("2.16.840.1.113883.12.542");


	}

}
