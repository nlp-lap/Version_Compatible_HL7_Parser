package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0882 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0882();
		return table;
	}

	public static final String E = "E";
	public static final String SE = "SE";

	private Table0882(){
		setTableName("Medical Role Executing Physician");
		setOID("2.16.840.1.113883.12.882");

		putMap("E", "Employed");
		putMap("SE", "Self-employed");

	}

}
