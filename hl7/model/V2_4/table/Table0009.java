package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0009 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0009();
		return table;
	}

	public static final String A0 = "A0";
	public static final String A1 = "A1";
	public static final String A2 = "A2";
	public static final String A3 = "A3";
	public static final String A4 = "A4";
	public static final String A5 = "A5";
	public static final String A6 = "A6";
	public static final String A7 = "A7";
	public static final String A8 = "A8";
	public static final String A9 = "A9";
	public static final String B1 = "B1";
	public static final String B2 = "B2";
	public static final String B3 = "B3";
	public static final String B4 = "B4";
	public static final String B5 = "B5";
	public static final String B6 = "B6";

	private Table0009(){
		setTableName("Ambulatory status");
		setOID("2.16.840.1.113883.12.9");

		putMap("A0", "No functional limitations");
		putMap("A1", "Ambulates with assistive device");
		putMap("A2", "Wheelchair/stretcher bound");
		putMap("A3", "Comatose; non-responsive");
		putMap("A4", "Disoriented");
		putMap("A5", "Vision impaired");
		putMap("A6", "Hearing impaired");
		putMap("A7", "Speech impaired");
		putMap("A8", "Non-English speaking");
		putMap("A9", "Functional level unknown");
		putMap("B1", "Oxygen therapy");
		putMap("B2", "Special equipment (tubes, IVs, catheters)");
		putMap("B3", "Amputee");
		putMap("B4", "Mastectomy");
		putMap("B5", "Paraplegic");
		putMap("B6", "Pregnant");

	}

}
