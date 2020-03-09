package hl7.model.V2_31.message;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class ACK extends hl7.model.V2_3.message.ACK{
	public static final String VERSION = "2.3.1";

	public static int SIZE = 212;
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
		standard[117]=hl7.pseudo.segment.ERR.CLASS;
		standard[118]=hl7.pseudo.segment.MSH.CLASS;
		standard[119]=hl7.pseudo.segment.MSA.CLASS;
		standard[120]=hl7.pseudo.segment.ERR.CLASS;
		standard[121]=hl7.pseudo.segment.MSH.CLASS;
		standard[122]=hl7.pseudo.segment.MSA.CLASS;
		standard[123]=hl7.pseudo.segment.ERR.CLASS;
		standard[124]=hl7.pseudo.segment.MSH.CLASS;
		standard[125]=hl7.pseudo.segment.MSA.CLASS;
		standard[126]=hl7.pseudo.segment.ERR.CLASS;
		standard[127]=hl7.pseudo.segment.MSH.CLASS;
		standard[128]=hl7.pseudo.segment.MSA.CLASS;
		standard[129]=hl7.pseudo.segment.ERR.CLASS;
		standard[130]=hl7.pseudo.segment.MSH.CLASS;
		standard[131]=hl7.pseudo.segment.MSA.CLASS;
		standard[132]=hl7.pseudo.segment.ERR.CLASS;
		standard[133]=hl7.pseudo.segment.MSH.CLASS;
		standard[134]=hl7.pseudo.segment.MSA.CLASS;
		standard[135]=hl7.pseudo.segment.ERR.CLASS;
		standard[136]=hl7.pseudo.segment.MSH.CLASS;
		standard[137]=hl7.pseudo.segment.MSA.CLASS;
		standard[138]=hl7.pseudo.segment.ERR.CLASS;
		standard[139]=hl7.pseudo.segment.MSH.CLASS;
		standard[140]=hl7.pseudo.segment.MSA.CLASS;
		standard[141]=hl7.pseudo.segment.ERR.CLASS;
		standard[142]=hl7.pseudo.segment.MSH.CLASS;
		standard[143]=hl7.pseudo.segment.MSA.CLASS;
		standard[144]=hl7.pseudo.segment.ERR.CLASS;
		standard[145]=hl7.pseudo.segment.MSH.CLASS;
		standard[146]=hl7.pseudo.segment.MSA.CLASS;
		standard[147]=hl7.pseudo.segment.ERR.CLASS;
		standard[148]=hl7.pseudo.segment.MSH.CLASS;
		standard[149]=hl7.pseudo.segment.MSA.CLASS;
		standard[150]=hl7.pseudo.segment.ERR.CLASS;
		standard[151]=hl7.pseudo.segment.MSH.CLASS;
		standard[152]=hl7.pseudo.segment.MSA.CLASS;
		standard[153]=hl7.pseudo.segment.ERR.CLASS;
		standard[154]=hl7.pseudo.segment.MSH.CLASS;
		standard[155]=hl7.pseudo.segment.MSA.CLASS;
		standard[156]=hl7.pseudo.segment.ERR.CLASS;
		standard[157]=hl7.pseudo.segment.MSH.CLASS;
		standard[158]=hl7.pseudo.segment.MSA.CLASS;
		standard[159]=hl7.pseudo.segment.ERR.CLASS;
		standard[160]=hl7.pseudo.segment.MSH.CLASS;
		standard[161]=hl7.pseudo.segment.MSA.CLASS;
		standard[162]=hl7.pseudo.segment.ERR.CLASS;
		standard[163]=hl7.pseudo.segment.MSH.CLASS;
		standard[164]=hl7.pseudo.segment.MSA.CLASS;
		standard[165]=hl7.pseudo.segment.ERR.CLASS;
		standard[166]=hl7.pseudo.segment.MSH.CLASS;
		standard[167]=hl7.pseudo.segment.MSA.CLASS;
		standard[168]=hl7.pseudo.segment.ERR.CLASS;
		standard[169]=hl7.pseudo.segment.MSH.CLASS;
		standard[170]=hl7.pseudo.segment.MSA.CLASS;
		standard[171]=hl7.pseudo.segment.ERR.CLASS;
		standard[172]=hl7.pseudo.segment.MSH.CLASS;
		standard[173]=hl7.pseudo.segment.MSA.CLASS;
		standard[174]=hl7.pseudo.segment.MSH.CLASS;
		standard[175]=hl7.pseudo.segment.MSA.CLASS;
		standard[176]=hl7.pseudo.segment.ERR.CLASS;
		standard[177]=hl7.pseudo.segment.MSH.CLASS;
		standard[178]=hl7.pseudo.segment.MSA.CLASS;
		standard[179]=hl7.pseudo.segment.ERR.CLASS;
		standard[180]=hl7.pseudo.segment.MSH.CLASS;
		standard[181]=hl7.pseudo.segment.MSA.CLASS;
		standard[182]=hl7.pseudo.segment.ERR.CLASS;
		standard[183]=hl7.pseudo.segment.MSH.CLASS;
		standard[184]=hl7.pseudo.segment.MSA.CLASS;
		standard[185]=hl7.pseudo.segment.ERR.CLASS;
		standard[186]=hl7.pseudo.segment.MSH.CLASS;
		standard[187]=hl7.pseudo.segment.MSA.CLASS;
		standard[188]=hl7.pseudo.segment.ERR.CLASS;
		standard[189]=hl7.pseudo.segment.MSH.CLASS;
		standard[190]=hl7.pseudo.segment.MSA.CLASS;
		standard[191]=hl7.pseudo.segment.ERR.CLASS;
		standard[192]=hl7.pseudo.segment.MSH.CLASS;
		standard[193]=hl7.pseudo.segment.MSA.CLASS;
		standard[194]=hl7.pseudo.segment.ERR.CLASS;
		standard[195]=hl7.pseudo.segment.MSH.CLASS;
		standard[196]=hl7.pseudo.segment.MSA.CLASS;
		standard[197]=hl7.pseudo.segment.ERR.CLASS;
		standard[198]=hl7.pseudo.segment.MSH.CLASS;
		standard[199]=hl7.pseudo.segment.MSA.CLASS;
		standard[200]=hl7.pseudo.segment.ERR.CLASS;
		standard[201]=hl7.pseudo.segment.MSH.CLASS;
		standard[202]=hl7.pseudo.segment.MSA.CLASS;
		standard[203]=hl7.pseudo.segment.ERR.CLASS;
		standard[204]=hl7.pseudo.segment.MSH.CLASS;
		standard[205]=hl7.pseudo.segment.MSA.CLASS;
		standard[206]=hl7.pseudo.segment.ERR.CLASS;
		standard[207]=hl7.pseudo.segment.MSH.CLASS;
		standard[208]=hl7.pseudo.segment.MSA.CLASS;
		standard[209]=hl7.pseudo.segment.ERR.CLASS;
		standard[210]=hl7.pseudo.segment.ERR.CLASS;
		standard[211]=hl7.pseudo.segment.ERR.CLASS;
	
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
		optional[151]=false;
		optional[152]=false;
		optional[153]=false;
		optional[154]=false;
		optional[155]=false;
		optional[156]=false;
		optional[157]=false;
		optional[158]=false;
		optional[159]=false;
		optional[160]=false;
		optional[161]=false;
		optional[162]=false;
		optional[163]=false;
		optional[164]=false;
		optional[165]=false;
		optional[166]=false;
		optional[167]=false;
		optional[168]=false;
		optional[169]=false;
		optional[170]=false;
		optional[171]=false;
		optional[172]=false;
		optional[173]=false;
		optional[174]=false;
		optional[175]=false;
		optional[176]=false;
		optional[177]=false;
		optional[178]=false;
		optional[179]=false;
		optional[180]=false;
		optional[181]=false;
		optional[182]=false;
		optional[183]=false;
		optional[184]=false;
		optional[185]=false;
		optional[186]=false;
		optional[187]=false;
		optional[188]=false;
		optional[189]=false;
		optional[190]=false;
		optional[191]=false;
		optional[192]=false;
		optional[193]=false;
		optional[194]=false;
		optional[195]=false;
		optional[196]=false;
		optional[197]=false;
		optional[198]=false;
		optional[199]=false;
		optional[200]=false;
		optional[201]=false;
		optional[202]=false;
		optional[203]=false;
		optional[204]=false;
		optional[205]=false;
		optional[206]=false;
		optional[207]=false;
		optional[208]=false;
		optional[209]=false;
		optional[210]=false;
		optional[211]=false;
		
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
		repeatable [151]=false;
		repeatable [152]=false;
		repeatable [153]=false;
		repeatable [154]=false;
		repeatable [155]=false;
		repeatable [156]=false;
		repeatable [157]=false;
		repeatable [158]=false;
		repeatable [159]=false;
		repeatable [160]=false;
		repeatable [161]=false;
		repeatable [162]=false;
		repeatable [163]=false;
		repeatable [164]=false;
		repeatable [165]=false;
		repeatable [166]=false;
		repeatable [167]=false;
		repeatable [168]=false;
		repeatable [169]=false;
		repeatable [170]=false;
		repeatable [171]=false;
		repeatable [172]=false;
		repeatable [173]=false;
		repeatable [174]=false;
		repeatable [175]=false;
		repeatable [176]=false;
		repeatable [177]=false;
		repeatable [178]=false;
		repeatable [179]=false;
		repeatable [180]=false;
		repeatable [181]=false;
		repeatable [182]=false;
		repeatable [183]=false;
		repeatable [184]=false;
		repeatable [185]=false;
		repeatable [186]=false;
		repeatable [187]=false;
		repeatable [188]=false;
		repeatable [189]=false;
		repeatable [190]=false;
		repeatable [191]=false;
		repeatable [192]=false;
		repeatable [193]=false;
		repeatable [194]=false;
		repeatable [195]=false;
		repeatable [196]=false;
		repeatable [197]=false;
		repeatable [198]=false;
		repeatable [199]=false;
		repeatable [200]=false;
		repeatable [201]=false;
		repeatable [202]=false;
		repeatable [203]=false;
		repeatable [204]=false;
		repeatable [205]=false;
		repeatable [206]=false;
		repeatable [207]=false;
		repeatable [208]=false;
		repeatable [209]=false;
		repeatable [210]=false;
		repeatable [211]=false;
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
		components[3] = subComponents[4];
		components[4] = subComponents[6];
		components[5] = subComponents[7];
		components[6] = subComponents[8];
		components[7] = subComponents[9];
		components[8] = subComponents[10];
		components[9] = subComponents[11];
		components[10] = subComponents[12];
		components[11] = subComponents[13];
		components[12] = subComponents[16];
		components[15] = subComponents[17];
		components[18] = subComponents[18];
		components[13] = null;
		components[14] = null;
		components[16] = null;
		components[17] = null;
		components[19] = null;
		components[20] = null;
		components[21] = null;
		components[22] = null;
		components[23] = null;
		components[24] = null;
		components[25] = null;
		components[26] = null;
		components[27] = null;
		components[28] = null;
		components[29] = null;
		components[30] = null;
		components[31] = null;
		components[32] = null;
		components[33] = null;
		components[34] = null;
		components[35] = null;
		components[36] = null;
		components[37] = null;
		components[38] = null;
		components[39] = null;
		components[40] = null;
		components[41] = null;
		components[42] = null;
		components[43] = null;
		components[44] = null;
		components[45] = null;
		components[46] = null;
		components[47] = null;
		components[48] = null;
		components[49] = null;
		components[50] = null;
		components[51] = null;
		components[52] = null;
		components[53] = null;
		components[54] = null;
		components[55] = null;
		components[56] = null;
		components[57] = null;
		components[58] = null;
		components[59] = null;
		components[60] = null;
		components[61] = null;
		components[62] = null;
		components[63] = null;
		components[64] = null;
		components[65] = null;
		components[66] = null;
		components[67] = null;
		components[68] = null;
		components[69] = null;
		components[70] = null;
		components[71] = null;
		components[72] = null;
		components[73] = null;
		components[74] = null;
		components[75] = null;
		components[76] = null;
		components[77] = null;
		components[78] = null;
		components[79] = null;
		components[80] = null;
		components[81] = null;
		components[82] = null;
		components[83] = null;
		components[84] = null;
		components[85] = null;
		components[86] = null;
		components[87] = null;
		components[88] = null;
		components[89] = null;
		components[90] = null;
		components[91] = null;
		components[92] = null;
		components[93] = null;
		components[94] = null;
		components[95] = null;
		components[96] = null;
		components[97] = null;
		components[98] = null;
		components[99] = null;
		components[100] = null;
		components[101] = null;
		components[102] = null;
		components[103] = null;
		components[104] = null;
		components[105] = null;
		components[106] = null;
		components[107] = null;
		components[108] = null;
		components[109] = null;
		components[110] = null;
		components[111] = null;
		components[112] = null;
		components[113] = null;
		components[114] = null;
		components[115] = null;
		components[116] = null;
		components[117] = null;
		components[118] = null;
		components[119] = null;
		components[120] = null;
		components[121] = null;
		components[122] = null;
		components[123] = null;
		components[124] = null;
		components[125] = null;
		components[126] = null;
		components[127] = null;
		components[128] = null;
		components[129] = null;
		components[130] = null;
		components[131] = null;
		components[132] = null;
		components[133] = null;
		components[134] = null;
		components[135] = null;
		components[136] = null;
		components[137] = null;
		components[138] = null;
		components[139] = null;
		components[140] = null;
		components[141] = null;
		components[142] = null;
		components[143] = null;
		components[144] = null;
		components[145] = null;
		components[146] = null;
		components[147] = null;
		components[148] = null;
		components[149] = null;
		components[150] = null;
		components[151] = null;
		components[152] = null;
		components[153] = null;
		components[154] = null;
		components[155] = null;
		components[156] = null;
		components[157] = null;
		components[158] = null;
		components[159] = null;
		components[160] = null;
		components[161] = null;
		components[162] = null;
		components[163] = null;
		components[164] = null;
		components[165] = null;
		components[166] = null;
		components[167] = null;
		components[168] = null;
		components[169] = null;
		components[170] = null;
		components[171] = null;
		components[172] = null;
		components[173] = null;
		components[174] = null;
		components[175] = null;
		components[176] = null;
		components[177] = null;
		components[178] = null;
		components[179] = null;
		components[180] = null;
		components[181] = null;
		components[182] = null;
		components[183] = null;
		components[184] = null;
		components[185] = null;
		components[186] = null;
		components[187] = null;
		components[188] = null;
		components[189] = null;
		components[190] = null;
		components[191] = null;
		components[192] = null;
		components[193] = null;
		components[194] = null;
		components[195] = null;
		components[196] = null;
		components[197] = null;
		components[198] = null;
		components[199] = null;
		components[200] = null;
		components[201] = null;
		components[202] = null;
		components[203] = null;
		components[204] = null;
		components[205] = null;
		components[206] = null;
		components[207] = null;
		components[208] = null;
		components[209] = null;
		components[210] = null;
		components[211] = null;
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
		subComponents[78] = components[78];
		subComponents[79] = components[79];
		subComponents[80] = components[80];
		subComponents[81] = components[81];
		subComponents[82] = components[82];
		subComponents[83] = components[83];
		subComponents[84] = components[84];
		subComponents[85] = components[85];
		subComponents[86] = components[86];
		subComponents[87] = components[87];
		subComponents[88] = components[88];
		subComponents[89] = components[89];
		subComponents[90] = components[90];
		subComponents[91] = components[91];
		subComponents[92] = components[92];
		subComponents[93] = components[93];
		subComponents[94] = components[94];
		subComponents[95] = components[95];
		subComponents[96] = components[96];
		subComponents[97] = components[97];
		subComponents[98] = components[98];
		subComponents[99] = components[99];
		subComponents[100] = components[100];
		subComponents[101] = components[101];
		subComponents[102] = components[102];
		subComponents[103] = components[103];
		subComponents[104] = components[104];
		subComponents[105] = components[105];
		subComponents[106] = components[106];
		subComponents[107] = components[107];
		subComponents[108] = components[108];
		subComponents[109] = components[109];
		subComponents[110] = components[110];
		subComponents[111] = components[111];
		subComponents[112] = components[112];
		subComponents[113] = components[113];
		subComponents[114] = components[114];
		subComponents[115] = components[115];
		subComponents[116] = components[116];
		subComponents[117] = components[117];
		subComponents[118] = components[118];
		subComponents[119] = components[119];
		subComponents[120] = components[120];
		subComponents[121] = components[121];
		subComponents[122] = components[122];
		subComponents[123] = components[123];
		subComponents[124] = components[124];
		subComponents[125] = components[125];
		subComponents[126] = components[126];
		subComponents[127] = components[127];
		subComponents[128] = components[128];
		subComponents[129] = components[129];
		subComponents[130] = components[130];
		subComponents[131] = components[131];
		subComponents[132] = components[132];
		subComponents[133] = components[133];
		subComponents[134] = components[134];
		subComponents[135] = components[135];
		subComponents[136] = components[136];
		subComponents[137] = components[137];
		subComponents[138] = components[138];
		subComponents[139] = components[139];
		subComponents[140] = components[140];
		subComponents[141] = components[141];
		subComponents[142] = components[142];
		subComponents[143] = components[143];
		subComponents[144] = components[144];
		subComponents[145] = components[145];
		subComponents[146] = components[146];
		subComponents[147] = components[147];
		subComponents[148] = components[148];
		subComponents[149] = components[149];
		subComponents[150] = components[150];
		subComponents[151] = components[151];
		subComponents[152] = components[152];
		subComponents[153] = components[153];
		subComponents[154] = components[154];
		subComponents[155] = components[155];
		subComponents[156] = components[156];
		subComponents[157] = components[157];
		subComponents[158] = components[158];
		subComponents[159] = components[159];
		subComponents[160] = components[160];
		subComponents[161] = components[161];
		subComponents[162] = components[162];
		subComponents[163] = components[163];
		subComponents[164] = components[164];
		subComponents[165] = components[165];
		subComponents[166] = components[166];
		subComponents[167] = components[167];
		subComponents[168] = components[168];
		subComponents[169] = components[169];
		subComponents[170] = components[170];
		subComponents[171] = components[171];
		subComponents[172] = components[172];
		subComponents[173] = components[173];
		subComponents[174] = components[175];
		subComponents[175] = components[176];
		subComponents[176] = components[177];
		subComponents[177] = components[178];
		subComponents[178] = components[179];
		subComponents[179] = components[180];
		subComponents[180] = components[181];
		subComponents[181] = components[182];
		subComponents[182] = components[183];
		subComponents[183] = components[184];
		subComponents[184] = components[185];
		subComponents[185] = components[186];
		subComponents[186] = components[187];
		subComponents[187] = components[188];
		subComponents[188] = components[189];
		subComponents[189] = components[190];
		subComponents[190] = components[191];
		subComponents[191] = components[192];
		subComponents[192] = components[193];
		subComponents[193] = components[194];
		subComponents[194] = components[195];
		subComponents[195] = components[196];
		subComponents[196] = components[197];
		subComponents[197] = components[198];
		subComponents[198] = components[199];
		subComponents[199] = components[200];
		subComponents[200] = components[201];
		subComponents[201] = components[202];
		subComponents[202] = components[203];
		subComponents[203] = components[204];
		subComponents[204] = components[205];
		subComponents[205] = components[206];
		subComponents[206] = components[207];
		subComponents[207] = components[208];
		subComponents[208] = components[209];
		subComponents[209] = components[210];
		subComponents[210] = components[210];
		subComponents[211] = components[210];
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
						hl7.model.V2_3.message.ACK type = (hl7.model.V2_3.message.ACK)this;
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
			hl7.model.V2_4.message.ACK type = (hl7.model.V2_4.message.ACK)this;
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
