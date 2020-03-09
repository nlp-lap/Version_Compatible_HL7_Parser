package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0103 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0103();
		return table;
	}

	public static final String D = "D";
	public static final String P = "P";
	public static final String T = "T";

	private Table0103(){
		setTableName("Processing ID");
		setOID("");

		putMap("D", "Debugging");
		putMap("P", "Production");
		putMap("T", "Training");

	}

}
