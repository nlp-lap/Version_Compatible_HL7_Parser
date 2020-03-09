package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0426 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0426();
		return table;
	}

	public static final String CRYO = "CRYO";
	public static final String CRYOP = "CRYOP";
	public static final String FFP = "FFP";
	public static final String FFPTH = "FFPTH";
	public static final String PC = "PC";
	public static final String PCA = "PCA";
	public static final String PCNEO = "PCNEO";
	public static final String PCW = "PCW";
	public static final String PLT = "PLT";
	public static final String PLTNEO = "PLTNEO";
	public static final String PLTP = "PLTP";
	public static final String PLTPH = "PLTPH";
	public static final String PLTPHLR = "PLTPHLR";
	public static final String RWB = "RWB";
	public static final String WBA = "WBA";

	private Table0426(){
		setTableName("Blood Product Code");
		setOID("");

		putMap("CRYO", "Cryoprecipitated AHF");
		putMap("CRYOP", "Pooled Cryoprecipitate");
		putMap("FFP", "Fresh Frozen Plasma");
		putMap("FFPTH", "Fresh Frozen Plasma - Thawed");
		putMap("PC", "Packed Cells");
		putMap("PCA", "Autologous Packed Cells");
		putMap("PCNEO", "Packed Cells - Neonatal");
		putMap("PCW", "Washed Packed Cells");
		putMap("PLT", "Platelet Concentrate");
		putMap("PLTNEO", "Reduced Volume Platelets");
		putMap("PLTP", "Pooled Platelets");
		putMap("PLTPH", "Platelet Pheresis");
		putMap("PLTPHLR", "Leukoreduced Platelet Pheresis");
		putMap("RWB", "Reconstituted Whole Blood");
		putMap("WBA", "Autologous Whole Blood");

	}

}
