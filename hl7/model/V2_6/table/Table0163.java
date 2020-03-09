package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0163 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0163();
		return table;
	}

	public static final String BE = "BE";
	public static final String BN = "BN";
	public static final String BU = "BU";
	public static final String CT = "CT";
	public static final String LA = "LA";
	public static final String LAC = "LAC";
	public static final String LACF = "LACF";
	public static final String LD = "LD";
	public static final String LE = "LE";
	public static final String LEJ = "LEJ";
	public static final String LF = "LF";
	public static final String LG = "LG";
	public static final String LH = "LH";
	public static final String LIJ = "LIJ";
	public static final String LLAQ = "LLAQ";
	public static final String LLFA = "LLFA";
	public static final String LMFA = "LMFA";
	public static final String LN = "LN";
	public static final String LPC = "LPC";
	public static final String LSC = "LSC";
	public static final String LT = "LT";
	public static final String LUA = "LUA";
	public static final String LUAQ = "LUAQ";
	public static final String LUFA = "LUFA";
	public static final String LVG = "LVG";
	public static final String LVL = "LVL";
	public static final String NB = "NB";
	public static final String OD = "OD";
	public static final String OS = "OS";
	public static final String OU = "OU";
	public static final String PA = "PA";
	public static final String PERIN = "PERIN";
	public static final String RA = "RA";
	public static final String RAC = "RAC";
	public static final String RACF = "RACF";
	public static final String RD = "RD";
	public static final String RE = "RE";
	public static final String REJ = "REJ";
	public static final String RF = "RF";
	public static final String RG = "RG";
	public static final String RH = "RH";
	public static final String RIJ = "RIJ";
	public static final String RLAQ = "RLAQ";
	public static final String RLFA = "RLFA";
	public static final String RMFA = "RMFA";
	public static final String RN = "RN";
	public static final String RPC = "RPC";
	public static final String RSC = "RSC";
	public static final String RT = "RT";
	public static final String RUA = "RUA";
	public static final String RUAQ = "RUAQ";
	public static final String RUFA = "RUFA";
	public static final String RVG = "RVG";
	public static final String RVL = "RVL";

	private Table0163(){
		setTableName("Body site");
		setOID("2.16.840.1.113883.12.163");

		putMap("BE", "Bilateral Ears");
		putMap("BN", "Bilateral Nares");
		putMap("BU", "Buttock");
		putMap("CT", "Chest Tube");
		putMap("LA", "Left Arm");
		putMap("LAC", "Left Anterior Chest");
		putMap("LACF", "Left Antecubital Fossa");
		putMap("LD", "Left Deltoid");
		putMap("LE", "Left Ear");
		putMap("LEJ", "Left External Jugular");
		putMap("LF", "Left Foot");
		putMap("LG", "Left Gluteus Medius");
		putMap("LH", "Left Hand");
		putMap("LIJ", "Left Internal Jugular");
		putMap("LLAQ", "Left Lower Abd Quadrant");
		putMap("LLFA", "Left Lower Forearm");
		putMap("LMFA", "Left Mid Forearm");
		putMap("LN", "Left Naris");
		putMap("LPC", "Left Posterior Chest");
		putMap("LSC", "Left Subclavian");
		putMap("LT", "Left Thigh");
		putMap("LUA", "Left Upper Arm");
		putMap("LUAQ", "Left Upper Abd Quadrant");
		putMap("LUFA", "Left Upper Forearm");
		putMap("LVG", "Left Ventragluteal");
		putMap("LVL", "Left Vastus Lateralis");
		putMap("NB", "Nebulized");
		putMap("OD", "Right Eye");
		putMap("OS", "Left Eye");
		putMap("OU", "Bilateral Eyes");
		putMap("PA", "Perianal");
		putMap("PERIN", "Perineal");
		putMap("RA", "Right Arm");
		putMap("RAC", "Right Anterior Chest");
		putMap("RACF", "Right Antecubital Fossa");
		putMap("RD", "Right Deltoid");
		putMap("RE", "Right Ear");
		putMap("REJ", "Right External Jugular");
		putMap("RF", "Right Foot");
		putMap("RG", "Right Gluteus Medius");
		putMap("RH", "Right Hand");
		putMap("RIJ", "Right Internal Jugular");
		putMap("RLAQ", "Rt Lower Abd Quadrant");
		putMap("RLFA", "Right Lower Forearm");
		putMap("RMFA", "Right Mid Forearm");
		putMap("RN", "Right Naris");
		putMap("RPC", "Right Posterior Chest");
		putMap("RSC", "Right Subclavian");
		putMap("RT", "Right Thigh");
		putMap("RUA", "Right Upper Arm");
		putMap("RUAQ", "Right Upper Abd Quadrant");
		putMap("RUFA", "Right Upper Forearm");
		putMap("RVG", "Right Ventragluteal");
		putMap("RVL", "Right Vastus Lateralis");

	}

}
