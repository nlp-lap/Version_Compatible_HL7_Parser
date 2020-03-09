package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0062 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0062();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String O = "O";
	public static final String U = "U";

	private Table0062(){
		setTableName("Event Reason");
		setOID("");

		putMap("01", "Patient request");
		putMap("02", "Physician/health practitioner order");
		putMap("03", "Census management");
		putMap("O", "Other");
		putMap("U", "Unknown");

	}

}
