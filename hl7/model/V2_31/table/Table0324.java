package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0324 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0324();
		return table;
	}

	public static final String GEN = "GEN";
	public static final String IMP = "IMP";
	public static final String INF = "INF";
	public static final String LCR = "LCR";
	public static final String LIC = "LIC";
	public static final String OVR = "OVR";
	public static final String PRL = "PRL";
	public static final String SET = "SET";
	public static final String SHA = "SHA";
	public static final String SMK = "SMK";
	public static final String STF = "STF";
	public static final String TEA = "TEA";

	private Table0324(){
		setTableName("Location characteristic ID");
		setOID("2.16.840.1.113883.12.324");

		putMap("GEN", "Gender of patient(s)");
		putMap("IMP", "Implant: can be used for radiation implant patients");
		putMap("INF", "Infectious disease: this location can be used for isolation");
		putMap("LCR", "Level of care");
		putMap("LIC", "Licensed");
		putMap("OVR", "Overflow");
		putMap("PRL", "Privacy level: indicating the level of private versus non-private room");
		putMap("SET", "Bed is set up");
		putMap("SHA", "Shadow: a temporary holding location that does not physically exist");
		putMap("SMK", "Smoking");
		putMap("STF", "Bed is staffed");
		putMap("TEA", "Teaching location");

	}

}
