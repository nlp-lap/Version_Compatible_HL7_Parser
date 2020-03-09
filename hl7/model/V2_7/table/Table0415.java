package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0415 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0415();
		return table;
	}

	public static final String E = "E";
	public static final String N = "N";

	private Table0415(){
		setTableName("DRG Transfer Type");
		setOID("");

		putMap("E", "DRG Exempt");
		putMap("N", "DRG Non Exempt");

	}

}
