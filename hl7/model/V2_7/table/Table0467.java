package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0467 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0467();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String U = "U";

	private Table0467(){
		setTableName("Modifier Edit Code");
		setOID("");

		putMap("0", "Modifier does NOT exist");
		putMap("1", "Modifier present, no errors");
		putMap("2", "Modifier invalid");
		putMap("3", "Modifier NOT approved for ASC/HOPD use");
		putMap("4", "Modifier approved for ASC/HOPD use, inappropriate for code");
		putMap("U", "Modifier edit code unknown");

	}

}
