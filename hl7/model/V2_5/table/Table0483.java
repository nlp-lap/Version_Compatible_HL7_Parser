package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0483 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0483();
		return table;
	}

	public static final String EL = "EL";
	public static final String EM = "EM";
	public static final String FX = "FX";
	public static final String IP = "IP";
	public static final String MA = "MA";
	public static final String PA = "PA";
	public static final String PH = "PH";
	public static final String RE = "RE";
	public static final String VC = "VC";
	public static final String VO = "VO";

	private Table0483(){
		setTableName("Authorization Mode");
		setOID("2.16.840.1.113883.12.483");

		putMap("EL", "Electronic");
		putMap("EM", "E-mail");
		putMap("FX", "Fax");
		putMap("IP", "In Person");
		putMap("MA", "Mail");
		putMap("PA", "Paper");
		putMap("PH", "Phone");
		putMap("RE", "Reflexive (Automated system)");
		putMap("VC", "Video-conference");
		putMap("VO", "Voice");

	}

}
