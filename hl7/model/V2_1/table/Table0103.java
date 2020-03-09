package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0103 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0103();
		return table;
	}

	public static final String D = "D";
	public static final String P = "P";
	public static final String T = "T";

	private Table0103(){
		setTableName("PROCESSING ID");
		setOID("2.16.840.1.113883.12.103");

		putMap("D", "Debugging");
		putMap("P", "Production");
		putMap("T", "Training");

	}

}
