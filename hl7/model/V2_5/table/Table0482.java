package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0482 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0482();
		return table;
	}

	public static final String I = "I";
	public static final String O = "O";

	private Table0482(){
		setTableName("Order Type");
		setOID("2.16.840.1.113883.12.482");

		putMap("I", "Inpatient Order");
		putMap("O", "Outpatient Order");

	}

}
