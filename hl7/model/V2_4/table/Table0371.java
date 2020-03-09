package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0371 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0371();
		return table;
	}

	public static final String BOR = "BOR";
	public static final String C32 = "C32";
	public static final String C38 = "C38";
	public static final String EDTK = "EDTK";
	public static final String EDTN = "EDTN";
	public static final String HCL6 = "HCL6";
	public static final String HEPL = "HEPL";
	public static final String HEPN = "HEPN";

	private Table0371(){
		setTableName("Additive");
		setOID("2.16.840.1.113883.12.371");

		putMap("BOR", "Borate");
		putMap("C32", "3.2%  Citrate");
		putMap("C38", "3.8% Citrate");
		putMap("EDTK", "Potassium/K EDTA");
		putMap("EDTN", "Sodium/Na EDTA");
		putMap("HCL6", "6N HCL");
		putMap("HEPL", "Lithium/Li  Heparin");
		putMap("HEPN", "Sodium/Na  Heparin");

	}

}
