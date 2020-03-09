package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0523 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0523();
		return table;
	}

	public static final String PERCENT = "%";
	public static final String a = "a";

	private Table0523(){
		setTableName("Computation type");
		setOID("2.16.840.1.113883.12.523");

		putMap("%", "Indicates a percent change");
		putMap("a", "Absolute Change");

	}

}
