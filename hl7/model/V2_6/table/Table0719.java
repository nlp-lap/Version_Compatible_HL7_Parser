package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0719 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0719();
		return table;
	}

	public static final String DIA = "DIA";
	public static final String EMP = "EMP";
	public static final String ORG = "ORG";
	public static final String PAT = "PAT";
	public static final String PHY = "PHY";
	public static final String REG = "REG";
	public static final String VIP = "VIP";

	private Table0719(){
		setTableName("Access Restriction Reason Code");
		setOID("2.16.840.1.113883.12.719");

		putMap("DIA", "Diagnosis-related");
		putMap("EMP", "Employee of this organization");
		putMap("ORG", "Organizational policy or requirement");
		putMap("PAT", "Patient Request");
		putMap("PHY", "Physician Request");
		putMap("REG", "Regulatory requirement");
		putMap("VIP", "Very important person or celebrity");

	}

}
