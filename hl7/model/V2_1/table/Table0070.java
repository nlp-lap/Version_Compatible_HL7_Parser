package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0070 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0070();
		return table;
	}

	public static final String BLD = "BLD";
	public static final String BON = "BON";
	public static final String BRN = "BRN";
	public static final String CNJT = "CNJT";
	public static final String CSF = "CSF";
	public static final String CVX = "CVX";
	public static final String EAR = "EAR";
	public static final String FIB = "FIB";
	public static final String HAR = "HAR";
	public static final String MN = "MN";
	public static final String NOS = "NOS";
	public static final String OTH = "OTH";
	public static final String PLAS = "PLAS";
	public static final String PRT = "PRT";
	public static final String RBC = "RBC";
	public static final String SAL = "SAL";
	public static final String SEM = "SEM";
	public static final String SER = "SER";
	public static final String SKN = "SKN";
	public static final String SNV = "SNV";
	public static final String STL = "STL";
	public static final String SWT = "SWT";
	public static final String THRT = "THRT";
	public static final String TIS = "TIS";
	public static final String UMB = "UMB";
	public static final String UR = "UR";
	public static final String URTH = "URTH";
	public static final String WBC = "WBC";
	public static final String WND = "WND";

	private Table0070(){
		setTableName("SOURCE OF SPECIMEN");
		setOID("2.16.840.1.113883.12.70");

		putMap("BLD", "Blood");
		putMap("BON", "Bone");
		putMap("BRN", "Burn");
		putMap("CNJT", "Conjunctiva");
		putMap("CSF", "Cerebral spinal fluid");
		putMap("CVX", "Cervix");
		putMap("EAR", "Ear");
		putMap("FIB", "Fibroblood");
		putMap("HAR", "Hair");
		putMap("MN", "Amniotic Fluid");
		putMap("NOS", "Nose");
		putMap("OTH", "Other");
		putMap("PLAS", "Plasma");
		putMap("PRT", "Peritoneal Fluid");
		putMap("RBC", "Erythrocytes");
		putMap("SAL", "Saliva");
		putMap("SEM", "Seminal Fluid");
		putMap("SER", "Serum");
		putMap("SKN", "Skin");
		putMap("SNV", "Synovial Fluid");
		putMap("STL", "Stool");
		putMap("SWT", "Sweat");
		putMap("THRT", "Throat");
		putMap("TIS", "Tissue");
		putMap("UMB", "Umbilical Blood");
		putMap("UR", "Urine");
		putMap("URTH", "Urethra");
		putMap("WBC", "Leukocytes");
		putMap("WND", "Wound");

	}

}
