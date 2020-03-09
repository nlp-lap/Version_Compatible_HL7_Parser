package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0070 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0070();
		return table;
	}

	public static final String ABLD = "ABLD";
	public static final String ABS = "ABS";
	public static final String AMN = "AMN";
	public static final String ASP = "ASP";
	public static final String BBL = "BBL";
	public static final String BDY = "BDY";
	public static final String BLD = "BLD";
	public static final String BON = "BON";
	public static final String BPH = "BPH";
	public static final String BRN = "BRN";
	public static final String BRO = "BRO";
	public static final String BRTH = "BRTH";
	public static final String CALC = "CALC";
	public static final String CBLD = "CBLD";
	public static final String CDM = "CDM";
	public static final String CNJT = "CNJT";
	public static final String CNL = "CNL";
	public static final String COL = "COL";
	public static final String CSF = "CSF";
	public static final String CTP = "CTP";
	public static final String CUR = "CUR";
	public static final String CVM = "CVM";
	public static final String CVX = "CVX";
	public static final String CYST = "CYST";
	public static final String DRN = "DRN";
	public static final String EAR = "EAR";
	public static final String ELT = "ELT";
	public static final String ENDC = "ENDC";
	public static final String ENDM = "ENDM";
	public static final String EOS = "EOS";
	public static final String FIB = "FIB";
	public static final String FIST = "FIST";
	public static final String FLT = "FLT";
	public static final String FLU = "FLU";
	public static final String GAST = "GAST";
	public static final String GEN = "GEN";
	public static final String GENC = "GENC";
	public static final String GENL = "GENL";
	public static final String GENV = "GENV";
	public static final String HAR = "HAR";
	public static final String IT = "IT";
	public static final String LAM = "LAM";
	public static final String LN = "LN";
	public static final String LNA = "LNA";
	public static final String LNV = "LNV";
	public static final String LYM = "LYM";
	public static final String MAC = "MAC";
	public static final String MAR = "MAR";
	public static final String MBLD = "MBLD";
	public static final String MEC = "MEC";
	public static final String MILK = "MILK";
	public static final String MLK = "MLK";
	public static final String NAIL = "NAIL";
	public static final String NOS = "NOS";
	public static final String ORH = "ORH";
	public static final String PER = "PER";
	public static final String PLAS = "PLAS";
	public static final String PLB = "PLB";
	public static final String PLC = "PLC";
	public static final String PLR = "PLR";
	public static final String PMN = "PMN";
	public static final String PRT = "PRT";
	public static final String PUS = "PUS";
	public static final String RBC = "RBC";
	public static final String SAL = "SAL";
	public static final String SEM = "SEM";
	public static final String SER = "SER";
	public static final String SKM = "SKM";
	public static final String SKN = "SKN";
	public static final String SNV = "SNV";
	public static final String SPRM = "SPRM";
	public static final String SPT = "SPT";
	public static final String SPTC = "SPTC";
	public static final String SPTT = "SPTT";
	public static final String STL = "STL";
	public static final String STON = "STON";
	public static final String SWT = "SWT";
	public static final String TEAR = "TEAR";
	public static final String THRB = "THRB";
	public static final String THRT = "THRT";
	public static final String TISB = "TISB";
	public static final String TISC = "TISC";
	public static final String TISG = "TISG";
	public static final String TISL = "TISL";
	public static final String TISP = "TISP";
	public static final String TISPL = "TISPL";
	public static final String TISS = "TISS";
	public static final String TISU = "TISU";
	public static final String ULC = "ULC";
	public static final String UMB = "UMB";
	public static final String UR = "UR";
	public static final String URC = "URC";
	public static final String URT = "URT";
	public static final String URTH = "URTH";
	public static final String VOM = "VOM";
	public static final String WBC = "WBC";
	public static final String WICK = "WICK";
	public static final String WND = "WND";
	public static final String WNDA = "WNDA";
	public static final String WNDD = "WNDD";
	public static final String WNDE = "WNDE";

	private Table0070(){
		setTableName("SOURCE OF SPECIMEN");
		setOID("2.16.840.1.113883.12.70");

		putMap("ABLD", "Arterial blood");
		putMap("ABS", "Abcess");
		putMap("AMN", "Amniotic fluid");
		putMap("ASP", "Aspirate");
		putMap("BBL", "Blood bag");
		putMap("BDY", "Whole body");
		putMap("BLD", "Whole blood");
		putMap("BON", "Bone");
		putMap("BPH", "Basophils");
		putMap("BRN", "Burn");
		putMap("BRO", "Bronchial");
		putMap("BRTH", "Breath (use EXHLD)");
		putMap("CALC", "Calculus (=Stone)");
		putMap("CBLD", "Cord blood");
		putMap("CDM", "Cardiac muscle");
		putMap("CNJT", "Conjunctiva");
		putMap("CNL", "Cannula");
		putMap("COL", "Colostrum");
		putMap("CSF", "Cerebral spinal fluid");
		putMap("CTP", "Catheter tip");
		putMap("CUR", "Curettage");
		putMap("CVM", "Cervical mucus");
		putMap("CVX", "Cervix");
		putMap("CYST", "Cyst");
		putMap("DRN", "Drain");
		putMap("EAR", "Ear");
		putMap("ELT", "Electrode");
		putMap("ENDC", "Endocardium");
		putMap("ENDM", "Endometrium");
		putMap("EOS", "Eosinophils");
		putMap("FIB", "Fibroblasts");
		putMap("FIST", "Fistula");
		putMap("FLT", "Filter");
		putMap("FLU", "Body fluid, unsp");
		putMap("GAST", "Gastric fluid/contents");
		putMap("GEN", "Genital");
		putMap("GENC", "Genital cervix");
		putMap("GENL", "Genital lochia");
		putMap("GENV", "Genital vaginal");
		putMap("HAR", "Hair");
		putMap("IT", "Intubation tube");
		putMap("LAM", "Lamella");
		putMap("LN", "Line");
		putMap("LNA", "Line arterial");
		putMap("LNV", "Line venous");
		putMap("LYM", "Lymphocytes");
		putMap("MAC", "Macrophages");
		putMap("MAR", "Marrow");
		putMap("MBLD", "Menstrual blood");
		putMap("MEC", "Meconium");
		putMap("MILK", "Breast milk");
		putMap("MLK", "Milk");
		putMap("NAIL", "Nail");
		putMap("NOS", "Nose (nasal passage)");
		putMap("ORH", "Other");
		putMap("PER", "Peritoneum");
		putMap("PLAS", "Plasma");
		putMap("PLB", "Plasma bag");
		putMap("PLC", "Placenta");
		putMap("PLR", "Pleural fluid (thoracentesis fld)");
		putMap("PMN", "Polymorphonuclear neutrophils");
		putMap("PRT", "Peritoneal fluid / ascites");
		putMap("PUS", "Pus");
		putMap("RBC", "Erythrocytes");
		putMap("SAL", "Saliva");
		putMap("SEM", "Seminal fluid");
		putMap("SER", "Serum");
		putMap("SKM", "Skeletal muscle");
		putMap("SKN", "Skin");
		putMap("SNV", "Synovial fluid (Joint fluid)");
		putMap("SPRM", "Spermatozoa");
		putMap("SPT", "Sputum");
		putMap("SPTC", "Sputum - coughed");
		putMap("SPTT", "Sputum - tracheal aspirate");
		putMap("STL", "Stool");
		putMap("STON", "Stone (use CALC)");
		putMap("SWT", "Sweat");
		putMap("TEAR", "Tears");
		putMap("THRB", "Thrombocyte (platelet)");
		putMap("THRT", "Throat");
		putMap("TISB", "Tissue bone marrow");
		putMap("TISC", "Tissue curettage");
		putMap("TISG", "Tissue gall bladder");
		putMap("TISL", "Tissue lung");
		putMap("TISP", "Tissue peritoneum");
		putMap("TISPL", "Tissue placenta");
		putMap("TISS", "Tissue");
		putMap("TISU", "Tissue ulcer");
		putMap("ULC", "Ulcer");
		putMap("UMB", "Umbilical Blood");
		putMap("UR", "Urine");
		putMap("URC", "Urine clean catch");
		putMap("URT", "Urine catheter");
		putMap("URTH", "Urethra");
		putMap("VOM", "Vomitus");
		putMap("WBC", "Leukocytes");
		putMap("WICK", "Wick");
		putMap("WND", "Wound");
		putMap("WNDA", "Wound abscess");
		putMap("WNDD", "Wound drainage");
		putMap("WNDE", "Wound exudate");

	}

}