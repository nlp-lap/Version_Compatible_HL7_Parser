package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0122 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0122();
		return table;
	}

	public static final String CH = "CH";
	public static final String CO = "CO";
	public static final String CR = "CR";
	public static final String DP = "DP";
	public static final String GR = "GR";
	public static final String NC = "NC";
	public static final String PC = "PC";
	public static final String RS = "RS";

	private Table0122(){
		setTableName("Charge type");
		setOID("2.16.840.1.113883.12.122");

		putMap("CH", "Charge");
		putMap("CO", "Contract");
		putMap("CR", "Credit");
		putMap("DP", "Department");
		putMap("GR", "Grant");
		putMap("NC", "No Charge");
		putMap("PC", "Professional");
		putMap("RS", "Research");

	}

}
