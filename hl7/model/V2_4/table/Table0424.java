package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0424 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0424();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0424(){
		setTableName("Gestation category code");
		setOID("2.16.840.1.113883.12.424");

		putMap("1", "Premature / Pre-term");
		putMap("2", "Full Term");
		putMap("3", "Overdue / Post-term");

	}

}
