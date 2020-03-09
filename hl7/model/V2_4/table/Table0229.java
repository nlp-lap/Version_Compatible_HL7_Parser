package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0229 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0229();
		return table;
	}

	public static final String C = "C";
	public static final String G = "G";
	public static final String M = "M";

	private Table0229(){
		setTableName("DRG payor");
		setOID("2.16.840.1.113883.12.229");

		putMap("C", "Champus");
		putMap("G", "Managed Care Organization");
		putMap("M", "Medicare");

	}

}
