package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0424 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0424();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0424(){
		setTableName("Gestation Category Code");
		setOID("");

		putMap("1", "Premature / Pre-term");
		putMap("2", "Full Term");
		putMap("3", "Overdue / Post-term");

	}

}
