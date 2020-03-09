package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0508 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0508();
		return table;
	}

	public static final String AU = "AU";
	public static final String CM = "CM";
	public static final String CS = "CS";
	public static final String DI = "DI";
	public static final String FR = "FR";
	public static final String HB = "HB";
	public static final String HL = "HL";
	public static final String IG = "IG";
	public static final String IR = "IR";
	public static final String LR = "LR";
	public static final String WA = "WA";

	private Table0508(){
		setTableName("Blood Product Processing Requirements");
		setOID("");

		putMap("AU", "Autologous Unit");
		putMap("CM", "CMV Negative");
		putMap("CS", "CMV Safe");
		putMap("DI", "Directed Unit");
		putMap("FR", "Fresh unit");
		putMap("HB", "Hemoglobin S Negative");
		putMap("HL", "HLA Matched");
		putMap("IG", "IgA Deficient");
		putMap("IR", "Irradiated");
		putMap("LR", "Leukoreduced");
		putMap("WA", "Washed");

	}

}
