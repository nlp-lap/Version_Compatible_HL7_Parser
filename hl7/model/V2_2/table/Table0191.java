package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0191 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0191();
		return table;
	}

	public static final String FT = "FT";
	public static final String NS = "NS";
	public static final String SD = "SD";
	public static final String SI = "SI";
	public static final String TX = "TX";

	private Table0191(){
		setTableName("Type Of Data");
		setOID("2.16.840.1.113883.12.191");

		putMap("FT", "Formatted Text");
		putMap("NS", "Non-scanned Image");
		putMap("SD", "Scanned Document");
		putMap("SI", "Scanned Image");
		putMap("TX", "Machine Readable Text Document");

	}

}
