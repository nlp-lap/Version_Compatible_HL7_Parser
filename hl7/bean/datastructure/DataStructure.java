package hl7.bean.datastructure;

import hl7.bean.Structure;

public abstract class DataStructure implements Structure{
	public abstract String encode() throws Exception;
	public void setVersion(String setVersion){
//		DataStructure.setVersion = setVersion;
	}
	public void originalVersion(String originalVersion){
//		DataStructure.originalVersion = originalVersion;
	}
	public void depth(int depth){
		
	};
	public DataStructure[] getComponents(){
		return null;
	}
	public abstract void decode(String value) throws Exception;
	public abstract DataStructure cloneClass(String originalVersion, String setVersion);

	public String setVersion = "";
	protected boolean seekOriginalVersion = true;
	public String originalVersion="";
	public String encodeVersion="";
	
	public String description;
	public String type;
	public int depth;
	public boolean required;
	public boolean optional;
	public boolean conditional;
	public int length;
	
	
	
	public static final String AD = "AD";
	public static final String AUI = "AUI";
	public static final String CCD = "CCD";
	public static final String CCP = "CCP";
	public static final String CD = "CD";
	public static final String CE = "CE";
	public static final String CF = "CF";
	public static final String CK = "CK";
	public static final String CM = "CM";
	public static final String CN = "CN";
	public static final String CNE = "CNE";
	public static final String CNN = "CNN";
	public static final String CNS = "CNS";
	public static final String CP = "CP";
	public static final String CQ = "CQ";
	public static final String CSU = "CSU";
	public static final String CWE = "CWE";
	public static final String CX = "CX";
	public static final String DDI = "DDI";
	public static final String DIN = "DIN";
	public static final String DLD = "DLD";
	public static final String DLN = "DLN";
	public static final String DLT = "DLT";
	public static final String DR = "DR";
	public static final String DT = "DT";
	public static final String DTM = "DTM";
	public static final String DTN = "DTN";
	public static final String ED = "ED";
	public static final String EI = "EI";
	public static final String EIP = "EIP";
	public static final String ELD = "ELD";
	public static final String ERL = "ERL";
	public static final String FC = "FC";
	public static final String FN = "FN";
	public static final String FT = "FT";
	public static final String GTS = "GTS";
	public static final String TS = "TS";
	public static final String TN = "TN";
	public static final String HD = "HD";
	public static final String ICD = "ICD";
	public static final String ID = "ID";
	public static final String IS = "IS";
	public static final String JCC = "JCC";
	public static final String LA1 = "LA1";
	public static final String LA2 = "LA2";
	public static final String MA = "MA";
	public static final String MO = "MO";
	public static final String MOC = "MOC";
	public static final String MOP = "MOP";
	public static final String MSG = "MSG";
	public static final String NA = "NA";
	public static final String NDL = "NDL";
	public static final String NM = "NM";
	public static final String NR = "NR";
	public static final String OCD = "OCD";
	public static final String OSD = "OSD";
	public static final String OSP = "OSP";
	public static final String PCF = "PCF";
	public static final String PI = "PI";
	public static final String PIP = "PIP";
	public static final String PL = "PL";
	public static final String PLN = "PLN";
	public static final String PN = "PN";
	public static final String PPN = "PPN";
	public static final String PRL = "PRL";
	public static final String PT = "PT";
	public static final String PTA = "PTA";
	public static final String QIP = "QIP";
	public static final String QSC = "QSC";
	public static final String RCD = "RCD";
	public static final String RFR = "RFR";
	public static final String RI = "RI";
	public static final String RMC = "RMC";
	public static final String RP = "RP";
	public static final String RPT = "RPT";
	public static final String SAD = "SAD";
	public static final String SCV = "SCV";
	public static final String SI = "SI";
	public static final String SN = "SN";
	public static final String SNM = "SNM";
	public static final String SPD = "SPD";
	public static final String SPS = "SPS";
	public static final String SRT = "SRT";
	public static final String ST = "ST";
	public static final String TM = "TM";
	public static final String TQ = "TQ";
	public static final String TX = "TX";
	public static final String UVC = "UVC";
	public static final String var = "var";
	public static final String VH = "VH";
	public static final String VID = "VID";
	public static final String VR = "VR";
	public static final String WVI = "WVI";
	public static final String WVS = "WVS";
	public static final String XAD = "XAD";
	public static final String XCN = "XCN";
	public static final String XON = "XON";
	public static final String XPN = "XPN";
	public static final String XTN = "XTN";
}
