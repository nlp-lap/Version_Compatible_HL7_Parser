package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0548 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0548();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";

	private Table0548(){
		setTableName("Signatory's Relationship to Subject");
		setOID("");

		putMap("1", "Self");
		putMap("2", "Parent");
		putMap("3", "Next of Kin");
		putMap("4", "Durable Power of Attorney in Healthcare Affairs");
		putMap("5", "Conservator");
		putMap("6", "Emergent Practitioner (practitioner judging case as emergency requiring care without a consent)");
		putMap("7", "Non-Emergent Practitioner (i.e. medical ethics committee)");

	}

}
