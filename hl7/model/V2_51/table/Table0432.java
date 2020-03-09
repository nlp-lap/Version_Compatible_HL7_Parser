package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0432 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0432();
		return table;
	}

	public static final String AC = "AC";
	public static final String CH = "CH";
	public static final String CO = "CO";
	public static final String CR = "CR";
	public static final String IM = "IM";
	public static final String MO = "MO";

	private Table0432(){
		setTableName("Admission Level of Care Code");
		setOID("2.16.840.1.113883.12.432");

		putMap("AC", "Acute");
		putMap("CH", "Chronic");
		putMap("CO", "Comatose");
		putMap("CR", "Critical");
		putMap("IM", "Improved");
		putMap("MO", "Moribund");

	}

}
