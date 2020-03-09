package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0488 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0488();
		return table;
	}

	public static final String ANP = "ANP";
	public static final String BAP = "BAP";
	public static final String BCAE = "BCAE";
	public static final String BCAN = "BCAN";
	public static final String BCPD = "BCPD";
	public static final String BIO = "BIO";
	public static final String CAP = "CAP";
	public static final String CATH = "CATH";
	public static final String CVP = "CVP";
	public static final String EPLA = "EPLA";
	public static final String ESWA = "ESWA";
	public static final String FNA = "FNA";
	public static final String KOFFP = "KOFFP";
	public static final String LNA = "LNA";
	public static final String LNV = "LNV";
	public static final String MARTL = "MARTL";
	public static final String ML11 = "ML11";
	public static final String MLP = "MLP";
	public static final String NYP = "NYP";
	public static final String PACE = "PACE";
	public static final String PIN = "PIN";
	public static final String PNA = "PNA";
	public static final String PRIME = "PRIME";
	public static final String PUMP = "PUMP";
	public static final String QC5 = "QC5";
	public static final String SCLP = "SCLP";
	public static final String SCRAPS = "SCRAPS";
	public static final String SHA = "SHA";
	public static final String SWA = "SWA";
	public static final String SWD = "SWD";
	public static final String TMAN = "TMAN";
	public static final String TMCH = "TMCH";
	public static final String TMM4 = "TMM4";
	public static final String TMMY = "TMMY";
	public static final String TMOT = "TMOT";
	public static final String TMP = "TMP";
	public static final String TMPV = "TMPV";
	public static final String TMSC = "TMSC";
	public static final String TMUP = "TMUP";
	public static final String TMVI = "TMVI";
	public static final String VENIP = "VENIP";
	public static final String WOOD = "WOOD";

	private Table0488(){
		setTableName("Specimen Collection Method");
		setOID("2.16.840.1.113883.12.488");

		putMap("ANP", "Plates, Anaerobic");
		putMap("BAP", "Plates, Blood Agar");
		putMap("BCAE", "Blood Culture, Aerobic Bottle");
		putMap("BCAN", "Blood Culture, Anaerobic Bottle");
		putMap("BCPD", "Blood Culture, Pediatric Bottle");
		putMap("BIO", "Biopsy");
		putMap("CAP", "Capillary Specimen");
		putMap("CATH", "Catheterized");
		putMap("CVP", "Line, CVP");
		putMap("EPLA", "Environmental, Plate");
		putMap("ESWA", "Environmental, Swab");
		putMap("FNA", "Aspiration, Fine Needle");
		putMap("KOFFP", "Plate, Cough");
		putMap("LNA", "Line, Arterial");
		putMap("LNV", "Line, Venous");
		putMap("MARTL", "Martin-Lewis Agar");
		putMap("ML11", "Mod. Martin-Lewis Agar");
		putMap("MLP", "Plate, Martin-Lewis");
		putMap("NYP", "Plate, New York City");
		putMap("PACE", "Pace, Gen-Probe");
		putMap("PIN", "Pinworm Prep");
		putMap("PNA", "Aterial puncture");
		putMap("PRIME", "Pump Prime");
		putMap("PUMP", "Pump Specimen");
		putMap("QC5", "Quality Control For Micro");
		putMap("SCLP", "Scalp, Fetal Vein");
		putMap("SCRAPS", "Scrapings");
		putMap("SHA", "Shaving");
		putMap("SWA", "Swab");
		putMap("SWD", "Swab, Dacron tipped");
		putMap("TMAN", "Transport Media, Anaerobic");
		putMap("TMCH", "Transport Media, Chalamydia");
		putMap("TMM4", "Transport Media, M4");
		putMap("TMMY", "Transport Media, Mycoplasma");
		putMap("TMOT", "Transport Media,");
		putMap("TMP", "Plate, Thayer-Martin");
		putMap("TMPV", "Transport Media, PVA");
		putMap("TMSC", "Transport Media, Stool Culture");
		putMap("TMUP", "Transport Media, Ureaplasma");
		putMap("TMVI", "Transport Media, Viral");
		putMap("VENIP", "Venipuncture");
		putMap("WOOD", "Swab, Wooden Shaft");

	}

}
