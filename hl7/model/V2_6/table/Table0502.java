package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0502 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0502();
		return table;
	}

	public static final String LM = "LM";
	public static final String MIN = "MIN";
	public static final String NC = "NC";

	private Table0502(){
		setTableName("Non-Subject Consenter Reason");
		setOID("2.16.840.1.113883.12.502");

		putMap("LM", "Legally mandated");
		putMap("MIN", "Subject is a minor");
		putMap("NC", "Subject is not competent to consent");

	}

}
