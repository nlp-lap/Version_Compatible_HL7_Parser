package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0207 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0207();
		return table;
	}

	public static final String a = "a";
	public static final String i = "i";
	public static final String not_present = "not present";
	public static final String r = "r";

	private Table0207(){
		setTableName("Processing Mode");
		setOID("2.16.840.1.113883.12.207");

		putMap("a", "Archive");
		putMap("i", "Initial Load");
		putMap("not present", "Not Present (the default, meaning current processing)");
		putMap("r", "Restore from Archive");

	}

}
