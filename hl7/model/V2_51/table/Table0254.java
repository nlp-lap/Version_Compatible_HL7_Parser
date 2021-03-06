package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0254 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0254();
		return table;
	}

	public static final String ABS = "ABS";
	public static final String ACNC = "ACNC";
	public static final String ACT = "ACT";
	public static final String APER = "APER";
	public static final String ARB = "ARB";
	public static final String AREA = "AREA";
	public static final String ASPECT = "ASPECT";
	public static final String CACT = "CACT";
	public static final String CCNT = "CCNT";
	public static final String CCRTO = "CCRTO";
	public static final String CFR = "CFR";
	public static final String CLAS = "CLAS";
	public static final String CNC = "CNC";
	public static final String CNST = "CNST";
	public static final String COEF = "COEF";
	public static final String COLOR = "COLOR";
	public static final String CONS = "CONS";
	public static final String CRAT = "CRAT";
	public static final String CRTO = "CRTO";
	public static final String DEN = "DEN";
	public static final String DEV = "DEV";
	public static final String DIFF = "DIFF";
	public static final String ELAS = "ELAS";
	public static final String ELPOT = "ELPOT";
	public static final String ELRAT = "ELRAT";
	public static final String ELRES = "ELRES";
	public static final String ENGR = "ENGR";
	public static final String ENT = "ENT";
	public static final String ENTCAT = "ENTCAT";
	public static final String ENTNUM = "ENTNUM";
	public static final String ENTSUB = "ENTSUB";
	public static final String ENTVOL = "ENTVOL";
	public static final String EQL = "EQL";
	public static final String FORCE = "FORCE";
	public static final String FREQ = "FREQ";
	public static final String IMP = "IMP";
	public static final String KINV = "KINV";
	public static final String LEN = "LEN";
	public static final String LINC = "LINC";
	public static final String LIQ = "LIQ";
	public static final String MASS = "MASS";
	public static final String MCNC = "MCNC";
	public static final String MCNT = "MCNT";
	public static final String MCRTO = "MCRTO";
	public static final String MFR = "MFR";
	public static final String MGFLUX = "MGFLUX";
	public static final String MINC = "MINC";
	public static final String MORPH = "MORPH";
	public static final String MOTIL = "MOTIL";
	public static final String MRAT = "MRAT";
	public static final String MRTO = "MRTO";
	public static final String NCNC = "NCNC";
	public static final String NCNT = "NCNT";
	public static final String NFR = "NFR";
	public static final String NRTO = "NRTO";
	public static final String NUM = "NUM";
	public static final String OD = "OD";
	public static final String OSMOL = "OSMOL";
	public static final String PRES = "PRES";
	public static final String PRID = "PRID";
	public static final String PWR = "PWR";
	public static final String RANGE = "RANGE";
	public static final String RATIO = "RATIO";
	public static final String RCRLTM = "RCRLTM";
	public static final String RDEN = "RDEN";
	public static final String REL = "REL";
	public static final String RLMCNC = "RLMCNC";
	public static final String RLSCNC = "RLSCNC";
	public static final String RLTM = "RLTM";
	public static final String SATFR = "SATFR";
	public static final String SCNC = "SCNC";
	public static final String SCNCIN = "SCNCIN";
	public static final String SCNT = "SCNT";
	public static final String SCNTR = "SCNTR";
	public static final String SCRTO = "SCRTO";
	public static final String SFR = "SFR";
	public static final String SHAPE = "SHAPE";
	public static final String SMELL = "SMELL";
	public static final String SRAT = "SRAT";
	public static final String SRTO = "SRTO";
	public static final String SUB = "SUB";
	public static final String SUSC = "SUSC";
	public static final String TASTE = "TASTE";
	public static final String TEMP = "TEMP";
	public static final String TEMPDF = "TEMPDF";
	public static final String TEMPIN = "TEMPIN";
	public static final String THRMCNC = "THRMCNC";
	public static final String THRSCNC = "THRSCNC";
	public static final String TIME = "TIME";
	public static final String TITR = "TITR";
	public static final String TMDF = "TMDF";
	public static final String TMSTP = "TMSTP";
	public static final String TRTO = "TRTO";
	public static final String TYPE = "TYPE";
	public static final String VCNT = "VCNT";
	public static final String VEL = "VEL";
	public static final String VELRT = "VELRT";
	public static final String VFR = "VFR";
	public static final String VISC = "VISC";
	public static final String VOL = "VOL";
	public static final String VRAT = "VRAT";
	public static final String VRTO = "VRTO";

	private Table0254(){
		setTableName("Kind of quantity");
		setOID("2.16.840.1.113883.12.254");

		putMap("ABS", "Absorbance");
		putMap("ACNC", "Concentration, Arbitrary Substance");
		putMap("ACT", "*Activity");
		putMap("APER", "Appearance");
		putMap("ARB", "*Arbitrary");
		putMap("AREA", "Area");
		putMap("ASPECT", "Aspect");
		putMap("CACT", "*Catalytic Activity");
		putMap("CCNT", "*Catalytic Content");
		putMap("CCRTO", "Catalytic Concentration Ratio");
		putMap("CFR", "*Catalytic Fraction");
		putMap("CLAS", "Class");
		putMap("CNC", "*Catalytic Concentration");
		putMap("CNST", "*Constant");
		putMap("COEF", "*Coefficient");
		putMap("COLOR", "Color");
		putMap("CONS", "Consistency");
		putMap("CRAT", "*Catalytic Rate");
		putMap("CRTO", "Catalytic Ratio");
		putMap("DEN", "Density");
		putMap("DEV", "Device");
		putMap("DIFF", "*Difference");
		putMap("ELAS", "Elasticity");
		putMap("ELPOT", "Electrical Potential (Voltage)");
		putMap("ELRAT", "Electrical current (amperage)");
		putMap("ELRES", "Electrical Resistance");
		putMap("ENGR", "Energy");
		putMap("ENT", "*Entitic");
		putMap("ENTCAT", "*Entitic Catalytic Activity");
		putMap("ENTNUM", "*Entitic Number");
		putMap("ENTSUB", "*Entitic Substance of Amount");
		putMap("ENTVOL", "*Entitic Volume");
		putMap("EQL", "Equilibrium");
		putMap("FORCE", "Mechanical force");
		putMap("FREQ", "Frequency");
		putMap("IMP", "Impression/ interpretation of study");
		putMap("KINV", "*Kinematic Viscosity");
		putMap("LEN", "Length");
		putMap("LINC", "*Length Increment");
		putMap("LIQ", "*Liquefaction");
		putMap("MASS", "*Mass");
		putMap("MCNC", "*Mass Concentration");
		putMap("MCNT", "Mass Content");
		putMap("MCRTO", "*Mass Concentration Ratio");
		putMap("MFR", "*Mass Fraction");
		putMap("MGFLUX", "Magnetic flux");
		putMap("MINC", "*Mass Increment");
		putMap("MORPH", "Morphology");
		putMap("MOTIL", "Motility");
		putMap("MRAT", "*Mass Rate");
		putMap("MRTO", "*Mass Ratio");
		putMap("NCNC", "*Number Concentration");
		putMap("NCNT", "*Number Content");
		putMap("NFR", "*Number Fraction");
		putMap("NRTO", "*Number Ratio");
		putMap("NUM", "*Number");
		putMap("OD", "Optical density");
		putMap("OSMOL", "*Osmolality");
		putMap("PRES", "*Pressure (Partial)");
		putMap("PRID", "Presence/Identity/Existence");
		putMap("PWR", "Power (wattage)");
		putMap("RANGE", "*Ranges");
		putMap("RATIO", "*Ratios");
		putMap("RCRLTM", "*Reciprocal Relative Time");
		putMap("RDEN", "*Relative Density");
		putMap("REL", "*Relative");
		putMap("RLMCNC", "*Relative Mass Concentration");
		putMap("RLSCNC", "*Relative Substance Concentration");
		putMap("RLTM", "*Relative Time");
		putMap("SATFR", "*Saturation Fraction");
		putMap("SCNC", "*Substance Concentration");
		putMap("SCNCIN", "*Substance Concentration Increment");
		putMap("SCNT", "*Substance Content");
		putMap("SCNTR", "*Substance Content Rate");
		putMap("SCRTO", "*Substance Concentration Ratio");
		putMap("SFR", "*Substance Fraction");
		putMap("SHAPE", "Shape");
		putMap("SMELL", "Smell");
		putMap("SRAT", "*Substance Rate");
		putMap("SRTO", "*Substance Ratio");
		putMap("SUB", "*Substance Amount");
		putMap("SUSC", "*Susceptibility");
		putMap("TASTE", "Taste");
		putMap("TEMP", "*Temperature");
		putMap("TEMPDF", "*Temperature Difference");
		putMap("TEMPIN", "*Temperature Increment");
		putMap("THRMCNC", "*Threshold Mass Concentration");
		putMap("THRSCNC", "*Threshold Substance Concentration");
		putMap("TIME", "*Time (e.g. seconds)");
		putMap("TITR", "*Dilution Factor (Titer)");
		putMap("TMDF", "*Time Difference");
		putMap("TMSTP", "*Time Stamp -- Date and Time");
		putMap("TRTO", "*Time Ratio");
		putMap("TYPE", "*Type");
		putMap("VCNT", "*Volume Content");
		putMap("VEL", "*Velocity");
		putMap("VELRT", "*Velocity Ratio");
		putMap("VFR", "*Volume Fraction");
		putMap("VISC", "*Viscosity");
		putMap("VOL", "*Volume");
		putMap("VRAT", "*Volume Rate");
		putMap("VRTO", "*Volume Ratio");

	}

}
