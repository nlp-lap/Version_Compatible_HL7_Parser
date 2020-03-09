package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0572 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0572();
		return table;
	}

	public static final String RVAT = "RVAT";
	public static final String UVAT = "UVAT";

	private Table0572(){
		setTableName("Tax status");
		setOID("");

		putMap("RVAT", "Registered in VAT register");
		putMap("UVAT", "Unregistered in VAT register");

	}

}
