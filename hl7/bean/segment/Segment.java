package hl7.bean.segment;

import hl7.bean.Structure;
import hl7.bean.datastructure.DataStructure;

import java.util.ArrayList;

public abstract class Segment implements Structure{
	private static final long serialVersionUID = 1L;

	public abstract Segment cloneClass(String originalVersion, String setVersion);
	
	public String setVersion = "";
	protected boolean seekOriginalVersion = true;
	public String originalVersion="";
	public String encodeVersion="";
	
	public String description;
	public String type;
	public boolean required;
	public boolean optional;
	public boolean conditional;
	public boolean repeatable;
	
	public String getType(){
		return type;
	}
	public void setVersion(String setVersion){
//		Segment.setVersion = setVersion;
//		DataStructure.setVersion = setVersion;
	}
	public void originalVersion(String originalVersion){
//		Segment.originalVersion = originalVersion;
//		DataStructure.originalVersion = originalVersion;
	}
	public DataStructure[][] getComponents(){
		return null;
	}
	
	protected String[] divide(String message, char delimiter){
		if(message==null) return null;
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
    	for(int i=0; i<message.length(); i++){
    		char ch = message.charAt(i); 
    		if(ch==delimiter){
    			list.add(sb.toString());
    			sb.setLength(0);
    		}else{
    			sb.append(ch);
    		}
    	}
    	if(sb.length()>0) list.add(sb.toString());
    	return (list.size()>0)?list.toArray(new String[0]):null;
	}
	
	public void decode(String component) throws Exception{
		//throw new Exception("No matching segment version");
	}
	
	public String encode() throws Exception{
//		throw new Exception("No matching segment version");
		return "";
		
	}
	
	public String encode(DataStructure[][] subComponents) throws Exception{
//		throw new Exception("No matching segment version");
		return "";
	}
	
	public String makeMessage(DataStructure[][] components, String version) throws Exception{
//		throw new Exception("No matching segment version");
		return "";
	}
	
	
	public static final String PKG = "PKG";
	public static final String ERR = "ERR";
	public static final String ERQ = "ERQ";
	public static final String ARV = "ARV";
	public static final String SPR = "SPR";
	public static final String ODT = "ODT";
	public static final String AFF = "AFF";
	public static final String ARQ = "ARQ";
	public static final String ODS = "ODS";
	public static final String SDD = "SDD";
	public static final String BLG = "BLG";
	public static final String SPM = "SPM";
	public static final String BLC = "BLC";
	public static final String CER = "CER";
	public static final String NK1 = "NK1";
	public static final String EQU = "EQU";
	public static final String EQP = "EQP";
	public static final String QPD = "QPD";
	public static final String SCP = "SCP";
	public static final String EQL = "EQL";
	public static final String SCH = "SCH";
	public static final String SCD = "SCD";
	public static final String EDU = "EDU";
	public static final String IPR = "IPR";
	public static final String PV2 = "PV2";
	public static final String PV1 = "PV1";
	public static final String CDM = "CDM";
	public static final String IPC = "IPC";
	public static final String PID = "PID";
	public static final String VTQ = "VTQ";
	public static final String OBX = "OBX";
	public static final String ADJ = "ADJ";
	public static final String APR = "APR";
	public static final String OBR = "OBR";
	public static final String ADD = "ADD";
	public static final String ECR = "ECR";
	public static final String GP2 = "GP2";
	public static final String GP1 = "GP1";
	public static final String UB2 = "UB2";
	public static final String UB1 = "UB1";
	public static final String GOL = "GOL";
	public static final String ECD = "ECD";
	public static final String PTH = "PTH";
	public static final String UAC = "UAC";
	public static final String RGS = "RGS";
	public static final String CON_ = "CON_";
	public static final String INV = "INV";
	public static final String QAK = "QAK";
	public static final String SAC = "SAC";
	public static final String ACC = "ACC";
	public static final String NTE = "NTE";
	public static final String FHS = "FHS";
	public static final String PSS = "PSS";
	public static final String FTS = "FTS";
	public static final String ABS = "ABS";
	public static final String NST = "NST";
	public static final String BHS = "BHS";
	public static final String PSL = "PSL";
	public static final String CNS = "CNS";
	public static final String IAR = "IAR";
	public static final String PSH = "PSH";
	public static final String PSG = "PSG";
	public static final String BTX = "BTX";
	public static final String SLT = "SLT";
	public static final String IAM = "IAM";
	public static final String BTS = "BTS";
	public static final String IN3 = "IN3";
	public static final String IN2 = "IN2";
	public static final String IN1 = "IN1";
	public static final String NSC = "NSC";
	public static final String RFI = "RFI";
	public static final String OM7 = "OM7";
	public static final String OM6 = "OM6";
	public static final String OM5 = "OM5";
	public static final String OM4 = "OM4";
	public static final String OM3 = "OM3";
	public static final String PRT = "PRT";
	public static final String OM2 = "OM2";
	public static final String OM1 = "OM1";
	public static final String FT1 = "FT1";
	public static final String DSP = "DSP";
	public static final String PRD = "PRD";
	public static final String PRC = "PRC";
	public static final String RF1 = "RF1";
	public static final String PRB = "PRB";
	public static final String ILT = "ILT";
	public static final String PRA = "PRA";
	public static final String PES = "PES";
	public static final String REL = "REL";
	public static final String LRL = "LRL";
	public static final String PEO = "PEO";
	public static final String DSC = "DSC";
	public static final String PR1 = "PR1";
	public static final String DG1 = "DG1";
	public static final String RQD = "RQD";
	public static final String CM2 = "CM2";
	public static final String RDT = "RDT";
	public static final String CM1 = "CM1";
	public static final String CM0 = "CM0";
	public static final String TQ2 = "TQ2";
	public static final String TQ1 = "TQ1";
	public static final String DRG = "DRG";
	public static final String RDF = "RDF";
	public static final String RQ1 = "RQ1";
	public static final String NDS = "NDS";
	public static final String NPU = "NPU";
	public static final String PDC = "PDC";
	public static final String LDP = "LDP";
	public static final String PDA = "PDA";
	public static final String OVR = "OVR";
	public static final String RCP = "RCP";
	public static final String AL1 = "AL1";
	public static final String TCD = "TCD";
	public static final String PCR = "PCR";
	public static final String TCC = "TCC";
	public static final String PD1 = "PD1";
	public static final String IVT = "IVT";
	public static final String SID = "SID";
	public static final String ROL = "ROL";
	public static final String PCE = "PCE";
	public static final String NCK = "NCK";
	public static final String QID = "QID";
	public static final String BPX = "BPX";
	public static final String LCH = "LCH";
	public static final String IVC = "IVC";
	public static final String SHP = "SHP";
	public static final String EVN = "EVN";
	public static final String STZ = "STZ";
	public static final String LCC = "LCC";
	public static final String BPO = "BPO";
	public static final String VND = "VND";
	public static final String IIM = "IIM";
	public static final String LOC = "LOC";
	public static final String VAR = "VAR";
	public static final String STF = "STF";
	public static final String AIS = "AIS";
	public static final String AIP = "AIP";
	public static final String AIL = "AIL";
	public static final String AUT = "AUT";
	public static final String AIG = "AIG";
	public static final String PMT = "PMT";
	public static final String RMI = "RMI";
	public static final String ITM = "ITM";
	public static final String PAC = "PAC";
	public static final String LAN = "LAN";
	public static final String SFT = "SFT";
	public static final String URS = "URS";
	public static final String PYE = "PYE";
	public static final String MSH = "MSH";
	public static final String CTI = "CTI";
	public static final String URD = "URD";
	public static final String DB1 = "DB1";
	public static final String MSA = "MSA";
	public static final String CTD = "CTD";
	public static final String RXR = "RXR";
	public static final String RXO = "RXO";
	public static final String FAC = "FAC";
	public static final String GT1 = "GT1";
	public static final String QRI = "QRI";
	public static final String ORO = "ORO";
	public static final String ISD = "ISD";
	public static final String TXA = "TXA";
	public static final String MFI = "MFI";
	public static final String QRF = "QRF";
	public static final String RXG = "RXG";
	public static final String QRD = "QRD";
	public static final String RXE = "RXE";
	public static final String RXD = "RXD";
	public static final String MFE = "MFE";
	public static final String RXC = "RXC";
	public static final String CSS = "CSS";
	public static final String CSR = "CSR";
	public static final String DMI = "DMI";
	public static final String ORG = "ORG";
	public static final String RXA = "RXA";
	public static final String MFA = "MFA";
	public static final String CSP = "CSP";
	public static final String ORC = "ORC";
	public static final String MRG = "MRG";
	public static final String RX1 = "RX1";
}
