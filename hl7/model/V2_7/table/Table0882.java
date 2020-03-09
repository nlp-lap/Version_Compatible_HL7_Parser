package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0882 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0882();
		return table;
	}

	public static final String E = "E";
	public static final String SE = "SE";

	private Table0882(){
		setTableName("Medical Role Executing Physician");
		setOID("");

		putMap("E", "Employed");
		putMap("SE", "Self-employed");

	}

}
