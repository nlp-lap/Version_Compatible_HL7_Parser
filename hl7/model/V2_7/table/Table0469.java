package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0469 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0469();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0469(){
		setTableName("Packaging Status Code");
		setOID("");

		putMap("0", "Not packaged");
		putMap("1", "Packaged service (status indicator N, or no HCPCS code and certain revenue codes)");
		putMap("2", "Packaged as part of partial hospitalization per diem or daily mental health service per diem");

	}

}
