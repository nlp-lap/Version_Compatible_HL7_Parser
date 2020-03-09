package hl7.model.V2_2.message;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class ACK extends hl7.model.V2_1.message.ACK{
	public static final String VERSION = "2.2";

	public static int SIZE = 151;
	public Structure[][] components = new Structure[SIZE][];
	public static Structure[] standard = new Structure[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	
	static{
		standard[0]=hl7.pseudo.segment.MSH.CLASS;
		standard[1]=hl7.pseudo.segment.MSH.CLASS;
		standard[2]=hl7.pseudo.segment.MSA.CLASS;
		standard[3]=hl7.pseudo.segment.MSA.CLASS;
		standard[4]=hl7.pseudo.segment.MSH.CLASS;
		standard[5]=hl7.pseudo.segment.MSA.CLASS;
		standard[6]=hl7.pseudo.segment.ERR.CLASS;
		standard[7]=hl7.pseudo.segment.MSH.CLASS;
		standard[8]=hl7.pseudo.segment.MSA.CLASS;
		standard[9]=hl7.pseudo.segment.ERR.CLASS;
		standard[10]=hl7.pseudo.segment.MSH.CLASS;
		standard[11]=hl7.pseudo.segment.MSA.CLASS;
		standard[12]=hl7.pseudo.segment.ERR.CLASS;
		standard[13]=hl7.pseudo.segment.MSH.CLASS;
		standard[14]=hl7.pseudo.segment.MSA.CLASS;
		standard[15]=hl7.pseudo.segment.ERR.CLASS;
		standard[16]=hl7.pseudo.segment.MSH.CLASS;
		standard[17]=hl7.pseudo.segment.MSA.CLASS;
		standard[18]=hl7.pseudo.segment.ERR.CLASS;
		standard[19]=hl7.pseudo.segment.MSH.CLASS;
		standard[20]=hl7.pseudo.segment.MSA.CLASS;
		standard[21]=hl7.pseudo.segment.ERR.CLASS;
		standard[22]=hl7.pseudo.segment.MSH.CLASS;
		standard[23]=hl7.pseudo.segment.MSA.CLASS;
		standard[24]=hl7.pseudo.segment.ERR.CLASS;
		standard[25]=hl7.pseudo.segment.MSH.CLASS;
		standard[26]=hl7.pseudo.segment.MSA.CLASS;
		standard[27]=hl7.pseudo.segment.ERR.CLASS;
		standard[28]=hl7.pseudo.segment.MSH.CLASS;
		standard[29]=hl7.pseudo.segment.MSA.CLASS;
		standard[30]=hl7.pseudo.segment.ERR.CLASS;
		standard[31]=hl7.pseudo.segment.MSH.CLASS;
		standard[32]=hl7.pseudo.segment.MSA.CLASS;
		standard[33]=hl7.pseudo.segment.ERR.CLASS;
		standard[34]=hl7.pseudo.segment.MSH.CLASS;
		standard[35]=hl7.pseudo.segment.MSA.CLASS;
		standard[36]=hl7.pseudo.segment.ERR.CLASS;
		standard[37]=hl7.pseudo.segment.MSH.CLASS;
		standard[38]=hl7.pseudo.segment.MSA.CLASS;
		standard[39]=hl7.pseudo.segment.ERR.CLASS;
		standard[40]=hl7.pseudo.segment.MSH.CLASS;
		standard[41]=hl7.pseudo.segment.MSA.CLASS;
		standard[42]=hl7.pseudo.segment.ERR.CLASS;
		standard[43]=hl7.pseudo.segment.MSH.CLASS;
		standard[44]=hl7.pseudo.segment.MSA.CLASS;
		standard[45]=hl7.pseudo.segment.ERR.CLASS;
		standard[46]=hl7.pseudo.segment.MSH.CLASS;
		standard[47]=hl7.pseudo.segment.MSA.CLASS;
		standard[48]=hl7.pseudo.segment.ERR.CLASS;
		standard[49]=hl7.pseudo.segment.MSH.CLASS;
		standard[50]=hl7.pseudo.segment.MSA.CLASS;
		standard[51]=hl7.pseudo.segment.ERR.CLASS;
		standard[52]=hl7.pseudo.segment.MSH.CLASS;
		standard[53]=hl7.pseudo.segment.MSA.CLASS;
		standard[54]=hl7.pseudo.segment.ERR.CLASS;
		standard[55]=hl7.pseudo.segment.MSH.CLASS;
		standard[56]=hl7.pseudo.segment.MSA.CLASS;
		standard[57]=hl7.pseudo.segment.ERR.CLASS;
		standard[58]=hl7.pseudo.segment.MSH.CLASS;
		standard[59]=hl7.pseudo.segment.MSA.CLASS;
		standard[60]=hl7.pseudo.segment.ERR.CLASS;
		standard[61]=hl7.pseudo.segment.MSH.CLASS;
		standard[62]=hl7.pseudo.segment.MSA.CLASS;
		standard[63]=hl7.pseudo.segment.ERR.CLASS;
		standard[64]=hl7.pseudo.segment.MSH.CLASS;
		standard[65]=hl7.pseudo.segment.MSA.CLASS;
		standard[66]=hl7.pseudo.segment.ERR.CLASS;
		standard[67]=hl7.pseudo.segment.MSH.CLASS;
		standard[68]=hl7.pseudo.segment.MSA.CLASS;
		standard[69]=hl7.pseudo.segment.ERR.CLASS;
		standard[70]=hl7.pseudo.segment.MSH.CLASS;
		standard[71]=hl7.pseudo.segment.MSA.CLASS;
		standard[72]=hl7.pseudo.segment.ERR.CLASS;
		standard[73]=hl7.pseudo.segment.MSH.CLASS;
		standard[74]=hl7.pseudo.segment.MSA.CLASS;
		standard[75]=hl7.pseudo.segment.ERR.CLASS;
		standard[76]=hl7.pseudo.segment.MSH.CLASS;
		standard[77]=hl7.pseudo.segment.MSA.CLASS;
		standard[78]=hl7.pseudo.segment.ERR.CLASS;
		standard[79]=hl7.pseudo.segment.MSH.CLASS;
		standard[80]=hl7.pseudo.segment.MSA.CLASS;
		standard[81]=hl7.pseudo.segment.ERR.CLASS;
		standard[82]=hl7.pseudo.segment.MSH.CLASS;
		standard[83]=hl7.pseudo.segment.MSA.CLASS;
		standard[84]=hl7.pseudo.segment.ERR.CLASS;
		standard[85]=hl7.pseudo.segment.MSH.CLASS;
		standard[86]=hl7.pseudo.segment.MSA.CLASS;
		standard[87]=hl7.pseudo.segment.ERR.CLASS;
		standard[88]=hl7.pseudo.segment.MSH.CLASS;
		standard[89]=hl7.pseudo.segment.MSA.CLASS;
		standard[90]=hl7.pseudo.segment.ERR.CLASS;
		standard[91]=hl7.pseudo.segment.MSH.CLASS;
		standard[92]=hl7.pseudo.segment.MSA.CLASS;
		standard[93]=hl7.pseudo.segment.ERR.CLASS;
		standard[94]=hl7.pseudo.segment.MSH.CLASS;
		standard[95]=hl7.pseudo.segment.MSA.CLASS;
		standard[96]=hl7.pseudo.segment.ERR.CLASS;
		standard[97]=hl7.pseudo.segment.MSH.CLASS;
		standard[98]=hl7.pseudo.segment.MSA.CLASS;
		standard[99]=hl7.pseudo.segment.ERR.CLASS;
		standard[100]=hl7.pseudo.segment.MSH.CLASS;
		standard[101]=hl7.pseudo.segment.MSA.CLASS;
		standard[102]=hl7.pseudo.segment.ERR.CLASS;
		standard[103]=hl7.pseudo.segment.MSH.CLASS;
		standard[104]=hl7.pseudo.segment.MSA.CLASS;
		standard[105]=hl7.pseudo.segment.ERR.CLASS;
		standard[106]=hl7.pseudo.segment.MSH.CLASS;
		standard[107]=hl7.pseudo.segment.MSA.CLASS;
		standard[108]=hl7.pseudo.segment.ERR.CLASS;
		standard[109]=hl7.pseudo.segment.MSH.CLASS;
		standard[110]=hl7.pseudo.segment.MSA.CLASS;
		standard[111]=hl7.pseudo.segment.ERR.CLASS;
		standard[112]=hl7.pseudo.segment.MSH.CLASS;
		standard[113]=hl7.pseudo.segment.MSA.CLASS;
		standard[114]=hl7.pseudo.segment.ERR.CLASS;
		standard[115]=hl7.pseudo.segment.MSH.CLASS;
		standard[116]=hl7.pseudo.segment.MSA.CLASS;
		standard[117]=hl7.pseudo.segment.MSH.CLASS;
		standard[118]=hl7.pseudo.segment.MSA.CLASS;
		standard[119]=hl7.pseudo.segment.ERR.CLASS;
		standard[120]=hl7.pseudo.segment.MSH.CLASS;
		standard[121]=hl7.pseudo.segment.MSA.CLASS;
		standard[122]=hl7.pseudo.segment.ERR.CLASS;
		standard[123]=hl7.pseudo.segment.MSH.CLASS;
		standard[124]=hl7.pseudo.segment.MSA.CLASS;
		standard[125]=hl7.pseudo.segment.ERR.CLASS;
		standard[126]=hl7.pseudo.segment.MSH.CLASS;
		standard[127]=hl7.pseudo.segment.MSA.CLASS;
		standard[128]=hl7.pseudo.segment.ERR.CLASS;
		standard[129]=hl7.pseudo.segment.MSH.CLASS;
		standard[130]=hl7.pseudo.segment.MSA.CLASS;
		standard[131]=hl7.pseudo.segment.ERR.CLASS;
		standard[132]=hl7.pseudo.segment.MSH.CLASS;
		standard[133]=hl7.pseudo.segment.MSA.CLASS;
		standard[134]=hl7.pseudo.segment.ERR.CLASS;
		standard[135]=hl7.pseudo.segment.MSH.CLASS;
		standard[136]=hl7.pseudo.segment.MSA.CLASS;
		standard[137]=hl7.pseudo.segment.ERR.CLASS;
		standard[138]=hl7.pseudo.segment.MSH.CLASS;
		standard[139]=hl7.pseudo.segment.MSA.CLASS;
		standard[140]=hl7.pseudo.segment.MSH.CLASS;
		standard[141]=hl7.pseudo.segment.MSA.CLASS;
		standard[142]=hl7.pseudo.segment.MSH.CLASS;
		standard[143]=hl7.pseudo.segment.MSA.CLASS;
		standard[144]=hl7.pseudo.segment.MSH.CLASS;
		standard[145]=hl7.pseudo.segment.MSA.CLASS;
		standard[146]=hl7.pseudo.segment.MSH.CLASS;
		standard[147]=hl7.pseudo.segment.MSA.CLASS;
		standard[148]=hl7.pseudo.segment.ERR.CLASS;
		standard[149]=hl7.pseudo.segment.ERR.CLASS;
		standard[150]=hl7.pseudo.segment.ERR.CLASS;
	
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=false;
		optional[5]=false;
		optional[6]=false;
		optional[7]=false;
		optional[8]=false;
		optional[9]=false;
		optional[10]=false;
		optional[11]=false;
		optional[12]=false;
		optional[13]=false;
		optional[14]=false;
		optional[15]=false;
		optional[16]=false;
		optional[17]=false;
		optional[18]=false;
		optional[19]=false;
		optional[20]=false;
		optional[21]=false;
		optional[22]=false;
		optional[23]=false;
		optional[24]=false;
		optional[25]=false;
		optional[26]=false;
		optional[27]=false;
		optional[28]=false;
		optional[29]=false;
		optional[30]=false;
		optional[31]=false;
		optional[32]=false;
		optional[33]=false;
		optional[34]=false;
		optional[35]=false;
		optional[36]=false;
		optional[37]=false;
		optional[38]=false;
		optional[39]=false;
		optional[40]=false;
		optional[41]=false;
		optional[42]=false;
		optional[43]=false;
		optional[44]=false;
		optional[45]=false;
		optional[46]=false;
		optional[47]=false;
		optional[48]=false;
		optional[49]=false;
		optional[50]=false;
		optional[51]=false;
		optional[52]=false;
		optional[53]=false;
		optional[54]=false;
		optional[55]=false;
		optional[56]=false;
		optional[57]=false;
		optional[58]=false;
		optional[59]=false;
		optional[60]=false;
		optional[61]=false;
		optional[62]=false;
		optional[63]=false;
		optional[64]=false;
		optional[65]=false;
		optional[66]=false;
		optional[67]=false;
		optional[68]=false;
		optional[69]=false;
		optional[70]=false;
		optional[71]=false;
		optional[72]=false;
		optional[73]=false;
		optional[74]=false;
		optional[75]=false;
		optional[76]=false;
		optional[77]=false;
		optional[78]=false;
		optional[79]=false;
		optional[80]=false;
		optional[81]=false;
		optional[82]=false;
		optional[83]=false;
		optional[84]=false;
		optional[85]=false;
		optional[86]=false;
		optional[87]=false;
		optional[88]=false;
		optional[89]=false;
		optional[90]=false;
		optional[91]=false;
		optional[92]=false;
		optional[93]=false;
		optional[94]=false;
		optional[95]=false;
		optional[96]=false;
		optional[97]=false;
		optional[98]=false;
		optional[99]=false;
		optional[100]=false;
		optional[101]=false;
		optional[102]=false;
		optional[103]=false;
		optional[104]=false;
		optional[105]=false;
		optional[106]=false;
		optional[107]=false;
		optional[108]=false;
		optional[109]=false;
		optional[110]=false;
		optional[111]=false;
		optional[112]=false;
		optional[113]=false;
		optional[114]=false;
		optional[115]=false;
		optional[116]=false;
		optional[117]=false;
		optional[118]=false;
		optional[119]=false;
		optional[120]=false;
		optional[121]=false;
		optional[122]=false;
		optional[123]=false;
		optional[124]=false;
		optional[125]=false;
		optional[126]=false;
		optional[127]=false;
		optional[128]=false;
		optional[129]=false;
		optional[130]=false;
		optional[131]=false;
		optional[132]=false;
		optional[133]=false;
		optional[134]=false;
		optional[135]=false;
		optional[136]=false;
		optional[137]=false;
		optional[138]=false;
		optional[139]=false;
		optional[140]=false;
		optional[141]=false;
		optional[142]=false;
		optional[143]=false;
		optional[144]=false;
		optional[145]=false;
		optional[146]=false;
		optional[147]=false;
		optional[148]=false;
		optional[149]=false;
		optional[150]=false;
		
		repeatable [0]=false;
		repeatable [1]=false;
		repeatable [2]=false;
		repeatable [3]=false;
		repeatable [4]=false;
		repeatable [5]=false;
		repeatable [6]=false;
		repeatable [7]=false;
		repeatable [8]=false;
		repeatable [9]=false;
		repeatable [10]=false;
		repeatable [11]=false;
		repeatable [12]=false;
		repeatable [13]=false;
		repeatable [14]=false;
		repeatable [15]=false;
		repeatable [16]=false;
		repeatable [17]=false;
		repeatable [18]=false;
		repeatable [19]=false;
		repeatable [20]=false;
		repeatable [21]=false;
		repeatable [22]=false;
		repeatable [23]=false;
		repeatable [24]=false;
		repeatable [25]=false;
		repeatable [26]=false;
		repeatable [27]=false;
		repeatable [28]=false;
		repeatable [29]=false;
		repeatable [30]=false;
		repeatable [31]=false;
		repeatable [32]=false;
		repeatable [33]=false;
		repeatable [34]=false;
		repeatable [35]=false;
		repeatable [36]=false;
		repeatable [37]=false;
		repeatable [38]=false;
		repeatable [39]=false;
		repeatable [40]=false;
		repeatable [41]=false;
		repeatable [42]=false;
		repeatable [43]=false;
		repeatable [44]=false;
		repeatable [45]=false;
		repeatable [46]=false;
		repeatable [47]=false;
		repeatable [48]=false;
		repeatable [49]=false;
		repeatable [50]=false;
		repeatable [51]=false;
		repeatable [52]=false;
		repeatable [53]=false;
		repeatable [54]=false;
		repeatable [55]=false;
		repeatable [56]=false;
		repeatable [57]=false;
		repeatable [58]=false;
		repeatable [59]=false;
		repeatable [60]=false;
		repeatable [61]=false;
		repeatable [62]=false;
		repeatable [63]=false;
		repeatable [64]=false;
		repeatable [65]=false;
		repeatable [66]=false;
		repeatable [67]=false;
		repeatable [68]=false;
		repeatable [69]=false;
		repeatable [70]=false;
		repeatable [71]=false;
		repeatable [72]=false;
		repeatable [73]=false;
		repeatable [74]=false;
		repeatable [75]=false;
		repeatable [76]=false;
		repeatable [77]=false;
		repeatable [78]=false;
		repeatable [79]=false;
		repeatable [80]=false;
		repeatable [81]=false;
		repeatable [82]=false;
		repeatable [83]=false;
		repeatable [84]=false;
		repeatable [85]=false;
		repeatable [86]=false;
		repeatable [87]=false;
		repeatable [88]=false;
		repeatable [89]=false;
		repeatable [90]=false;
		repeatable [91]=false;
		repeatable [92]=false;
		repeatable [93]=false;
		repeatable [94]=false;
		repeatable [95]=false;
		repeatable [96]=false;
		repeatable [97]=false;
		repeatable [98]=false;
		repeatable [99]=false;
		repeatable [100]=false;
		repeatable [101]=false;
		repeatable [102]=false;
		repeatable [103]=false;
		repeatable [104]=false;
		repeatable [105]=false;
		repeatable [106]=false;
		repeatable [107]=false;
		repeatable [108]=false;
		repeatable [109]=false;
		repeatable [110]=false;
		repeatable [111]=false;
		repeatable [112]=false;
		repeatable [113]=false;
		repeatable [114]=false;
		repeatable [115]=false;
		repeatable [116]=false;
		repeatable [117]=false;
		repeatable [118]=false;
		repeatable [119]=false;
		repeatable [120]=false;
		repeatable [121]=false;
		repeatable [122]=false;
		repeatable [123]=false;
		repeatable [124]=false;
		repeatable [125]=false;
		repeatable [126]=false;
		repeatable [127]=false;
		repeatable [128]=false;
		repeatable [129]=false;
		repeatable [130]=false;
		repeatable [131]=false;
		repeatable [132]=false;
		repeatable [133]=false;
		repeatable [134]=false;
		repeatable [135]=false;
		repeatable [136]=false;
		repeatable [137]=false;
		repeatable [138]=false;
		repeatable [139]=false;
		repeatable [140]=false;
		repeatable [141]=false;
		repeatable [142]=false;
		repeatable [143]=false;
		repeatable [144]=false;
		repeatable [145]=false;
		repeatable [146]=false;
		repeatable [147]=false;
		repeatable [148]=false;
		repeatable [149]=false;
		repeatable [150]=false;
	}
	
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			Structure[] structures = components[i];
			for(int c=0; structures!=null&&c<structures.length; c++){
				Structure structure = components[i][c];
				structure.setVersion(setVersion);
			}
		}
	}

	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			Structure[] structures = components[i];
			for(int c=0; structures!=null&&c<structures.length; c++){
				Structure structure = components[i][c];
				structure.originalVersion(originalVersion);
			}
		}
	}
	public Structure[][] getComponents(){
		if(setVersion.equals(VERSION)){
			return components;
		}else{
			return super.getComponents();
		}
	}
	
	private boolean compiled = false;	//최초 컴파일 여부 확인
	public void decode(String message) throws Exception {
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//최초 컴파일 여부 확인
			
			char separator = MessageStructure.SEGMENT_TERMINATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;

			int[] index = new int[2];
			while(index[0]<comps.length && index[1]<SIZE){
				decode(components, originalVersion, setVersion, VERSION, index, comps);
			}
		}
	}
	
	private void decode(Structure[][] components, String originalVersion, String setVersion, String VERSION, int[] index, String[] comps) throws Exception{
		Structure structure = standard[index[1]];
		String comp = comps[index[0]];
		String segmentType = comp.substring(0, 3);
		if(structure instanceof Segment){	//Segment일 때
			String standardType = structure.getType();
			if(segmentType.equals(standardType)){		//표준과 Type이 동일한가?
				Segment segment = ((Segment)structure).cloneClass(originalVersion, setVersion);
				segment.originalVersion(originalVersion);
				segment.decode(comp);
				addStructure(components, segment, index[1]);
				index[0]++;	//다음 comp 처리
			}else{
				index[1]++;	//다음 Segment와 비교
			}
		}else if(structure instanceof Group){
			Group group = (Group)structure;
			int stdIndex = group.indexStandard(segmentType);
			if(stdIndex<0){
				index[1]++;
			}else{
				int groupIndex = index[1];
				
				boolean needsNewGroup = group.needsNewGroup(segmentType, components[index[1]]); 
				if(needsNewGroup){
					Group newGroup = group.cloneClass(originalVersion, setVersion);
					newGroup.originalVersion(originalVersion);
					newGroup.decode(originalVersion, setVersion, VERSION, index, index[1], comps);
					addStructure(components, newGroup, index[1]);
				}else{
					group.decode(originalVersion, setVersion, VERSION, index, index[1], comps);
				}
				
				index[1] = groupIndex;
			}
		}
	}
	
	public static void addStructure(Structure[][] components, Structure structure, int index){
		if(components.length<=index) return;
		Structure[] comps = components[index];
		Structure[] newComps;
		newComps = (comps==null)?new Structure[1]:new Structure[comps.length+1];
		for(int i=0; i<newComps.length-1; i++) newComps[i]=comps[i];
		newComps[newComps.length-1] = structure;
		components[index] = newComps;
	}
	
	
	/* -----------------------------------------------------------------
	 * 이전 버전으로 매핑 components:구버전, subComponents:신버전
	 * 신버전 메시지-->구버전 파서(상위호환)
	 * -----------------------------------------------------------------
	 */
	public static void backward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
		components[0] = subComponents[0];
		components[1] = subComponents[1];
		components[2] = subComponents[2];
		components[3] = subComponents[3];
		components[4] = subComponents[4];
		components[5] = subComponents[5];
		components[6] = subComponents[6];
		components[7] = subComponents[7];
		components[8] = subComponents[8];
		components[9] = subComponents[9];
		components[10] = subComponents[10];
		components[11] = subComponents[11];
		components[12] = subComponents[12];
		components[13] = subComponents[13];
		components[14] = subComponents[14];
		components[15] = subComponents[15];
		components[16] = subComponents[16];
		components[17] = subComponents[17];
		components[18] = subComponents[18];
		components[19] = subComponents[19];
		components[20] = subComponents[20];
		components[21] = subComponents[21];
		components[22] = subComponents[22];
		components[23] = subComponents[23];
		components[24] = subComponents[24];
		components[25] = subComponents[25];
		components[26] = subComponents[26];
		components[27] = subComponents[27];
		components[28] = subComponents[28];
		components[29] = subComponents[29];
		components[30] = subComponents[30];
		components[31] = subComponents[31];
		components[32] = subComponents[32];
		components[33] = subComponents[33];
		components[34] = subComponents[34];
		components[35] = subComponents[35];
		components[36] = subComponents[36];
		components[37] = subComponents[37];
		components[38] = subComponents[38];
		components[39] = subComponents[39];
		components[40] = subComponents[40];
		components[41] = subComponents[41];
		components[42] = subComponents[42];
		components[43] = subComponents[43];
		components[44] = subComponents[44];
		components[45] = subComponents[45];
		components[46] = subComponents[46];
		components[47] = subComponents[47];
		components[48] = subComponents[48];
		components[49] = subComponents[49];
		components[50] = subComponents[50];
		components[51] = subComponents[51];
		components[52] = subComponents[52];
		components[53] = subComponents[53];
		components[54] = subComponents[54];
		components[55] = subComponents[55];
		components[56] = subComponents[56];
		components[57] = subComponents[57];
		components[58] = subComponents[58];
		components[59] = subComponents[59];
		components[60] = subComponents[60];
		components[61] = subComponents[61];
		components[62] = subComponents[62];
		components[63] = subComponents[63];
		components[64] = subComponents[64];
		components[65] = subComponents[65];
		components[66] = subComponents[66];
		components[67] = subComponents[67];
		components[68] = subComponents[68];
		components[69] = subComponents[69];
		components[70] = subComponents[70];
		components[71] = subComponents[71];
		components[72] = subComponents[72];
		components[73] = subComponents[73];
		components[74] = subComponents[74];
		components[75] = subComponents[75];
		components[76] = subComponents[76];
		components[77] = subComponents[77];
		components[78] = subComponents[78];
		components[79] = subComponents[79];
		components[80] = subComponents[80];
		components[81] = subComponents[81];
		components[82] = subComponents[82];
		components[83] = subComponents[83];
		components[84] = subComponents[84];
		components[85] = subComponents[85];
		components[86] = subComponents[86];
		components[87] = subComponents[87];
		components[88] = subComponents[88];
		components[89] = subComponents[89];
		components[90] = subComponents[90];
		components[91] = subComponents[91];
		components[92] = subComponents[92];
		components[93] = subComponents[93];
		components[94] = subComponents[94];
		components[95] = subComponents[95];
		components[96] = subComponents[96];
		components[97] = subComponents[97];
		components[98] = subComponents[98];
		components[99] = subComponents[99];
		components[100] = subComponents[100];
		components[101] = subComponents[101];
		components[102] = subComponents[102];
		components[103] = subComponents[103];
		components[104] = subComponents[104];
		components[105] = subComponents[105];
		components[106] = subComponents[106];
		components[107] = subComponents[107];
		components[108] = subComponents[108];
		components[109] = subComponents[109];
		components[110] = subComponents[110];
		components[111] = subComponents[111];
		components[112] = subComponents[112];
		components[113] = subComponents[113];
		components[114] = subComponents[114];
		components[115] = subComponents[115];
		components[116] = subComponents[116];
		components[117] = subComponents[118];
		components[118] = subComponents[119];
		components[119] = subComponents[120];
		components[120] = subComponents[121];
		components[121] = subComponents[122];
		components[122] = subComponents[123];
		components[123] = subComponents[124];
		components[124] = subComponents[125];
		components[125] = subComponents[126];
		components[126] = subComponents[127];
		components[127] = subComponents[128];
		components[128] = subComponents[129];
		components[129] = subComponents[130];
		components[130] = subComponents[131];
		components[131] = subComponents[132];
		components[132] = subComponents[133];
		components[133] = subComponents[134];
		components[134] = subComponents[135];
		components[135] = subComponents[136];
		components[136] = subComponents[137];
		components[137] = subComponents[138];
		components[138] = subComponents[139];
		components[139] = subComponents[140];
		components[140] = subComponents[142];
		components[141] = subComponents[143];
		components[142] = subComponents[145];
		components[143] = subComponents[146];
		components[144] = subComponents[148];
		components[145] = subComponents[149];
		components[146] = subComponents[151];
		components[147] = subComponents[152];
		components[148] = subComponents[153];
		components[149] = subComponents[156];
		components[150] = subComponents[159];
	}
	
	/* -----------------------------------------------------------------
	 * 이후 버전으로 매핑 components:구버전, subComponents:신버전
	 * 구버전 메시지-->신버전 파서(하위호환)
	 * -----------------------------------------------------------------
	 */
	public static void forward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		subComponents[0] = components[0];
		subComponents[1] = components[0];
		subComponents[2] = components[2];
		subComponents[3] = components[2];
		subComponents[4] = components[4];
		subComponents[5] = components[5];
		subComponents[6] = components[6];
		subComponents[7] = components[7];
		subComponents[8] = components[8];
		subComponents[9] = components[9];
		subComponents[10] = components[10];
		subComponents[11] = components[11];
		subComponents[12] = components[12];
		subComponents[13] = components[13];
		subComponents[14] = components[14];
		subComponents[15] = components[15];
		subComponents[16] = components[16];
		subComponents[17] = components[17];
		subComponents[18] = components[18];
		subComponents[19] = components[19];
		subComponents[20] = components[20];
		subComponents[21] = components[21];
		subComponents[22] = components[22];
		subComponents[23] = components[23];
		subComponents[24] = components[24];
		subComponents[25] = components[25];
		subComponents[26] = components[26];
		subComponents[27] = components[27];
		subComponents[28] = components[28];
		subComponents[29] = components[29];
		subComponents[30] = components[30];
		subComponents[31] = components[31];
		subComponents[32] = components[32];
		subComponents[33] = components[33];
		subComponents[34] = components[34];
		subComponents[35] = components[35];
		subComponents[36] = components[36];
		subComponents[37] = components[37];
		subComponents[38] = components[38];
		subComponents[39] = components[39];
		subComponents[40] = components[40];
		subComponents[41] = components[41];
		subComponents[42] = components[42];
		subComponents[43] = components[43];
		subComponents[44] = components[44];
		subComponents[45] = components[45];
		subComponents[46] = components[46];
		subComponents[47] = components[47];
		subComponents[48] = components[48];
		subComponents[49] = components[49];
		subComponents[50] = components[50];
		subComponents[51] = components[51];
		subComponents[52] = components[52];
		subComponents[53] = components[53];
		subComponents[54] = components[54];
		subComponents[55] = components[55];
		subComponents[56] = components[56];
		subComponents[57] = components[57];
		subComponents[58] = components[58];
		subComponents[59] = components[59];
		subComponents[60] = components[60];
		subComponents[61] = components[61];
		subComponents[62] = components[62];
		subComponents[63] = components[63];
		subComponents[64] = components[64];
		subComponents[65] = components[65];
		subComponents[66] = components[66];
		subComponents[67] = components[67];
		subComponents[68] = components[68];
		subComponents[69] = components[69];
		subComponents[70] = components[70];
		subComponents[71] = components[71];
		subComponents[72] = components[72];
		subComponents[73] = components[73];
		subComponents[74] = components[74];
		subComponents[75] = components[75];
		subComponents[76] = components[76];
		subComponents[77] = components[77];
		subComponents[78] = components[84];
		subComponents[81] = components[84];
		subComponents[84] = components[84];
		subComponents[87] = components[84];
		subComponents[90] = components[84];
		subComponents[93] = components[84];
		subComponents[96] = components[84];
		subComponents[99] = components[84];
		subComponents[102] = components[84];
		subComponents[105] = components[84];
		subComponents[108] = components[84];
		subComponents[111] = components[84];
		subComponents[114] = components[84];
		subComponents[119] = components[84];
		subComponents[122] = components[84];
		subComponents[125] = components[84];
		subComponents[128] = components[84];
		subComponents[131] = components[84];
		subComponents[134] = components[84];
		subComponents[137] = components[84];
		subComponents[148] = components[84];
		subComponents[149] = components[84];
		subComponents[150] = components[84];
		subComponents[79] = null;
		subComponents[80] = null;
		subComponents[82] = null;
		subComponents[83] = null;
		subComponents[85] = null;
		subComponents[86] = null;
		subComponents[88] = null;
		subComponents[89] = null;
		subComponents[91] = null;
		subComponents[92] = null;
		subComponents[94] = null;
		subComponents[95] = null;
		subComponents[97] = null;
		subComponents[98] = null;
		subComponents[100] = null;
		subComponents[101] = null;
		subComponents[103] = null;
		subComponents[104] = null;
		subComponents[106] = null;
		subComponents[107] = null;
		subComponents[109] = null;
		subComponents[110] = null;
		subComponents[112] = null;
		subComponents[113] = null;
		subComponents[115] = null;
		subComponents[116] = null;
		subComponents[117] = null;
		subComponents[118] = null;
		subComponents[120] = null;
		subComponents[121] = null;
		subComponents[123] = null;
		subComponents[124] = null;
		subComponents[126] = null;
		subComponents[127] = null;
		subComponents[129] = null;
		subComponents[130] = null;
		subComponents[132] = null;
		subComponents[133] = null;
		subComponents[135] = null;
		subComponents[136] = null;
		subComponents[138] = null;
		subComponents[139] = null;
		subComponents[140] = null;
		subComponents[141] = null;
		subComponents[142] = null;
		subComponents[143] = null;
		subComponents[144] = null;
		subComponents[145] = null;
		subComponents[146] = null;
		subComponents[147] = null;
	}
	
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//가장 마지막 메소드에서 위치찾기 옵션 설정
		return encode(null);
	}
	
	public String encode(Structure[][] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //실제 버전의 위치 찾기
			//실제 버전이 현재 위치가 아닐 때
			//실제 버전 위치 찾아가기
			return super.encode(null);
			
		}else{//실제 버전의 위치 찾기
			seekOriginalVersion = false;
			//실제 버전이 현재 위치일 때
			if(setVersion.equals(VERSION)){ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치일 때
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치가 아닐 때
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //버전으로 이동 방향 찾기
					//설정 버전이 현재 버전보다 낮을 때 (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
						hl7.model.V2_1.message.ACK type = (hl7.model.V2_1.message.ACK)this;
						type.backward(type.components, components, originalVersion, setVersion);
					//}
					//설정 버전의 위치로 찾아가기
					return super.encode(components);
					
				}else{ //버전으로 이동 방향 찾기
					/*-------------------------------------------------------------
					 *설정 버전이 현재 버전보다 높을 때(forward)
					 *이후 버전으로 Casting 후 forward 호출
					 *마지막 버전은 생략 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//하위 버전으로 인코딩 시 해당 위치를 찾아 가도록 (메소드 오버라이딩 때문에 처음부터 다시 찾아가야 함)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_3.message.ACK type = (hl7.model.V2_3.message.ACK)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}
	
	public String makeMessage(Structure[][] components, String version) throws Exception{
		if(VERSION.equals(version)){
			setCharacter(components, version);
			String message = "";
			char separator = MessageStructure.SEGMENT_TERMINATOR;
			for(int i=0; i<SIZE; i++){
				if(components[i]==null) continue;
				for(int j=0; j<components[i].length; j++){
					if(!repeatable[i]&&j>0) continue;
					String segment = components[i][j].encode();
					if(segment!=null){
						if(message.length()>0) message += separator;
						message += segment;
					}
				}

			}
			return (message.length()==0)?null:message;
		}else{
			return super.makeMessage(components, version);
		}
	}
}
