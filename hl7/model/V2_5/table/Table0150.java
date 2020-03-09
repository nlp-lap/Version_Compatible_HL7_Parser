package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0150 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0150();
		return table;
	}

	public static final String ER = "ER";
	public static final String IPE = "IPE";
	public static final String OPE = "OPE";
	public static final String UR = "UR";

	private Table0150(){
		setTableName("Certification patient type");
		setOID("2.16.840.1.113883.12.150");

		putMap("ER", "Emergency");
		putMap("IPE", "Inpatient elective");
		putMap("OPE", "Outpatient elective");
		putMap("UR", "Urgent");

	}

}
