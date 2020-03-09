package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0371 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0371();
		return table;
	}

	public static final String ACDA = "ACDA";
	public static final String ACDB = "ACDB";
	public static final String ACET = "ACET";
	public static final String AMIES = "AMIES";
	public static final String BACTM = "BACTM";
	public static final String BF10 = "BF10";
	public static final String BOR = "BOR";
	public static final String BOUIN = "BOUIN";
	public static final String BSKM = "BSKM";
	public static final String C32 = "C32";
	public static final String C38 = "C38";
	public static final String CARS = "CARS";
	public static final String CARY = "CARY";
	public static final String CHLTM = "CHLTM";
	public static final String CTAD = "CTAD";
	public static final String EDTK = "EDTK";
	public static final String EDTK15 = "EDTK15";
	public static final String EDTK75 = "EDTK75";
	public static final String EDTN = "EDTN";
	public static final String ENT = "ENT";
	public static final String ENT_PLUSE = "ENT+";
	public static final String F10 = "F10";
	public static final String FDP = "FDP";
	public static final String FL10 = "FL10";
	public static final String FL100 = "FL100";
	public static final String HCL6 = "HCL6";
	public static final String HEPA = "HEPA";
	public static final String HEPL = "HEPL";
	public static final String HEPN = "HEPN";
	public static final String HNO3 = "HNO3";
	public static final String JKM = "JKM";
	public static final String KARN = "KARN";
	public static final String KOX = "KOX";
	public static final String LIA = "LIA";
	public static final String M4 = "M4";
	public static final String M4RT = "M4RT";
	public static final String M5 = "M5";
	public static final String MICHTM = "MICHTM";
	public static final String MMDTM = "MMDTM";
	public static final String NAF = "NAF";
	public static final String NAPS = "NAPS";
	public static final String NONE = "NONE";
	public static final String PAGE = "PAGE";
	public static final String PHENOL = "PHENOL";
	public static final String PVA = "PVA";
	public static final String RLM = "RLM";
	public static final String SILICA = "SILICA";
	public static final String SPS = "SPS";
	public static final String SST = "SST";
	public static final String STUTM = "STUTM";
	public static final String THROM = "THROM";
	public static final String THYMOL = "THYMOL";
	public static final String THYO = "THYO";
	public static final String TOLU = "TOLU";
	public static final String URETM = "URETM";
	public static final String VIRTM = "VIRTM";
	public static final String WEST = "WEST";

	private Table0371(){
		setTableName("Additive/Preservative");
		setOID("2.16.840.1.113883.12.371");

		putMap("ACDA", "ACD Solution A");
		putMap("ACDB", "ACD Solution B");
		putMap("ACET", "Acetic Acid");
		putMap("AMIES", "Amies transport medium");
		putMap("BACTM", "Bacterial Transport medium");
		putMap("BF10", "Buffered 10% formalin");
		putMap("BOR", "Borate Boric Acid");
		putMap("BOUIN", "Bouin's solution");
		putMap("BSKM", "Buffered skim milk");
		putMap("C32", "3.2%  Citrate");
		putMap("C38", "3.8% Citrate");
		putMap("CARS", "Carson's Modified 10% formalin");
		putMap("CARY", "Cary Blair Medium");
		putMap("CHLTM", "Chlamydia transport medium");
		putMap("CTAD", "CTAD (this should be spelled out if not universally understood)");
		putMap("EDTK", "Potassium/K EDTA");
		putMap("EDTK15", "Potassium/K EDTA 15%");
		putMap("EDTK75", "Potassium/K EDTA 7.5%");
		putMap("EDTN", "Sodium/Na EDTA");
		putMap("ENT", "Enteric bacteria transport medium");
		putMap("ENT+", "Enteric plus");
		putMap("F10", "10% Formalin");
		putMap("FDP", "Thrombin NIH; soybean trypsin inhibitor (Fibrin Degradation Products)");
		putMap("FL10", "Sodium Fluoride, 10mg");
		putMap("FL100", "Sodium Fluoride, 100mg");
		putMap("HCL6", "6N HCL");
		putMap("HEPA", "Ammonium heparin");
		putMap("HEPL", "Lithium/Li  Heparin");
		putMap("HEPN", "Sodium/Na  Heparin");
		putMap("HNO3", "Nitric Acid");
		putMap("JKM", "Jones Kendrick Medium");
		putMap("KARN", "Karnovsky's fixative");
		putMap("KOX", "Potassium Oxalate");
		putMap("LIA", "Lithium iodoacetate");
		putMap("M4", "M4");
		putMap("M4RT", "M4-RT");
		putMap("M5", "M5");
		putMap("MICHTM", "Michel's transport medium");
		putMap("MMDTM", "MMD transport medium");
		putMap("NAF", "Sodium Fluoride");
		putMap("NAPS", "Sodium polyanethol sulfonate 0.35% in 0.85% sodium chloride");
		putMap("NONE", "None");
		putMap("PAGE", "Pages's Saline");
		putMap("PHENOL", "Phenol");
		putMap("PVA", "PVA (polyvinylalcohol)");
		putMap("RLM", "Reagan Lowe Medium");
		putMap("SILICA", "Siliceous earth, 12 mg");
		putMap("SPS", "SPS(this should be spelled out if not universally understood)");
		putMap("SST", "Serum Separator Tube (Polymer Gel)");
		putMap("STUTM", "Stuart transport medium");
		putMap("THROM", "Thrombin");
		putMap("THYMOL", "Thymol");
		putMap("THYO", "Thyoglycollate broth");
		putMap("TOLU", "Toluene");
		putMap("URETM", "Ureaplasma transport medium");
		putMap("VIRTM", "Viral Transport medium");
		putMap("WEST", "Buffered Citrate (Westergren Sedimentation Rate)");

	}

}
