package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0164 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0164();
		return table;
	}

	public static final String AP = "AP";
	public static final String BT = "BT";
	public static final String HL = "HL";
	public static final String IPPB = "IPPB";
	public static final String IVP = "IVP";
	public static final String IVS = "IVS";
	public static final String MI = "MI";
	public static final String NEB = "NEB";
	public static final String PCA = "PCA";

	private Table0164(){
		setTableName("Administration device");
		setOID("2.16.840.1.113883.12.164");

		putMap("AP", "Applicator");
		putMap("BT", "Buretrol");
		putMap("HL", "Heparin Lock");
		putMap("IPPB", "IPPB");
		putMap("IVP", "IV Pump");
		putMap("IVS", "IV Soluset");
		putMap("MI", "Metered Inhaler");
		putMap("NEB", "Nebulizer");
		putMap("PCA", "PCA Pump");

	}

}
