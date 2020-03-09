package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0778 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0778();
		return table;
	}

	public static final String EQP = "EQP";
	public static final String IMP = "IMP";
	public static final String MED = "MED";
	public static final String SUP = "SUP";
	public static final String TDC = "TDC";

	private Table0778(){
		setTableName("Item Type");
		setOID("2.16.840.1.113883.12.778");

		putMap("EQP", "Equipment");
		putMap("IMP", "Implant");
		putMap("MED", "Medication");
		putMap("SUP", "Supply");
		putMap("TDC", "Tubes, Drains, and Catheters");

	}

}
