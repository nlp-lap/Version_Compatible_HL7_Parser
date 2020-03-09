package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0147 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0147();
		return table;
	}

	public static final String _2ANC = "2ANC";
	public static final String _2MMD = "2MMD";
	public static final String _3MMD = "3MMD";
	public static final String ANC = "ANC";
	public static final String MMD = "MMD";

	private Table0147(){
		setTableName("Policy Type");
		setOID("");

		putMap("2ANC", "Second ancillary");
		putMap("2MMD", "Second major medical");
		putMap("3MMD", "Third major medical");
		putMap("ANC", "Ancillary");
		putMap("MMD", "Major medical");

	}

}
