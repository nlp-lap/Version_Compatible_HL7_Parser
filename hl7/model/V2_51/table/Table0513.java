package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0513 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0513();
		return table;
	}

	public static final String RA = "RA";
	public static final String RL = "RL";
	public static final String TR = "TR";
	public static final String TX = "TX";
	public static final String WA = "WA";

	private Table0513(){
		setTableName("Blood Product Transfusion/Disposition Status");
		setOID("2.16.840.1.113883.12.513");

		putMap("RA", "Returned unused/no longer needed");
		putMap("RL", "Returned unused/keep linked to patient for possible use later");
		putMap("TR", "Transfused with adverse reaction");
		putMap("TX", "Transfused");
		putMap("WA", "Wasted (product no longer viable)");

	}

}
