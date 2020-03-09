package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0148 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0148();
		return table;
	}

	public static final String AT = "AT";
	public static final String PC = "PC";

	private Table0148(){
		setTableName("Money or Percentage Indicator");
		setOID("");

		putMap("AT", "Currency amount");
		putMap("PC", "Percentage");

	}

}
