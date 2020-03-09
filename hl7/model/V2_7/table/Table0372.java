package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0372 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0372();
		return table;
	}

	public static final String BLD = "BLD";
	public static final String BSEP = "BSEP";
	public static final String PLAS = "PLAS";
	public static final String PPP = "PPP";
	public static final String PRP = "PRP";
	public static final String SED = "SED";
	public static final String SER = "SER";
	public static final String SUP = "SUP";

	private Table0372(){
		setTableName("Specimen Component");
		setOID("");

		putMap("BLD", "Whole blood, homogeneous");
		putMap("BSEP", "Whole blood, separated");
		putMap("PLAS", "Plasma, NOS (not otherwise specified)");
		putMap("PPP", "Platelet poor plasma");
		putMap("PRP", "Platelet rich plasma");
		putMap("SED", "Sediment");
		putMap("SER", "Serum, NOS (not otherwise specified)");
		putMap("SUP", "Supernatant");

	}

}
