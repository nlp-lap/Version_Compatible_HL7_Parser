package hl7.model.V2_3.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class GT1 extends hl7.model.V2_2.segment.GT1{

	public static final String VERSION = "2.3";
	
	public static int SIZE = 55;
	public DataStructure[][] components = new DataStructure[SIZE][];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	public static int[] minLength = new int[SIZE];
	public static int[] maxLength = new int[SIZE];
	
	static{
		standard[0]=hl7.bean.datastructure.primitive.SI.CLASS;
		standard[1]=hl7.pseudo.datastructure.CX.CLASS;
		standard[2]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[3]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[4]=hl7.pseudo.datastructure.XAD.CLASS;
		standard[5]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[6]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[15]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[16]=hl7.pseudo.datastructure.XAD.CLASS;
		standard[17]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[18]=hl7.pseudo.datastructure.CX.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[20]=hl7.pseudo.datastructure.XON.CLASS;
		standard[21]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[22]=hl7.pseudo.datastructure.CE.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[25]=hl7.pseudo.datastructure.CE.CLASS;
		standard[26]=hl7.pseudo.datastructure.CP.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[28]=hl7.pseudo.datastructure.CX.CLASS;
		standard[29]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[30]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[31]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[32]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[33]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[34]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[35]=hl7.pseudo.datastructure.CE.CLASS;
		standard[36]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[37]=hl7.pseudo.datastructure.CE.CLASS;
		standard[38]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[39]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[40]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[41]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[42]=hl7.pseudo.datastructure.CE.CLASS;
		standard[43]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[44]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[45]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[46]=hl7.pseudo.datastructure.CE.CLASS;
		standard[47]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[48]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[49]=hl7.pseudo.datastructure.JCC.CLASS;
		standard[50]=hl7.pseudo.datastructure.XON.CLASS;
		standard[51]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[52]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[53]=hl7.pseudo.datastructure.FC.CLASS;
		standard[54]=hl7.bean.datastructure.primitive.IS.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=hl7.model.V2_3.table.Table0001.getInstance();
		tables[9]=hl7.model.V2_3.table.Table0068.getInstance();
		tables[10]=hl7.model.V2_3.table.Table0063.getInstance();
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		tables[14]=null;
		tables[15]=null;
		tables[16]=null;
		tables[17]=null;
		tables[18]=null;
		tables[19]=hl7.model.V2_3.table.Table0066.getInstance();
		tables[20]=null;
		tables[21]=hl7.model.V2_3.table.Table0136.getInstance();
		tables[22]=null;
		tables[23]=null;
		tables[24]=hl7.model.V2_3.table.Table0136.getInstance();
		tables[25]=hl7.model.V2_3.table.Table0218.getInstance();
		tables[26]=null;
		tables[27]=null;
		tables[28]=null;
		tables[29]=null;
		tables[30]=null;
		tables[31]=null;
		tables[32]=hl7.model.V2_3.table.Table0223.getInstance();
		tables[33]=hl7.model.V2_3.table.Table0009.getInstance();
		tables[34]=hl7.model.V2_3.table.Table0171.getInstance();
		tables[35]=hl7.model.V2_3.table.Table0296.getInstance();
		tables[36]=hl7.model.V2_3.table.Table0220.getInstance();
		tables[37]=hl7.model.V2_3.table.Table0215.getInstance();
		tables[38]=hl7.model.V2_3.table.Table0136.getInstance();
		tables[39]=hl7.model.V2_3.table.Table0231.getInstance();
		tables[40]=hl7.model.V2_3.table.Table0006.getInstance();
		tables[41]=null;
		tables[42]=hl7.model.V2_3.table.Table0212.getInstance();
		tables[43]=hl7.model.V2_3.table.Table0189.getInstance();
		tables[44]=null;
		tables[45]=null;
		tables[46]=hl7.model.V2_3.table.Table0222.getInstance();
		tables[47]=hl7.model.V2_3.table.Table0063.getInstance();
		tables[48]=null;
		tables[49]=null;
		tables[50]=null;
		tables[51]=hl7.model.V2_3.table.Table0310.getInstance();
		tables[52]=hl7.model.V2_3.table.Table0311.getInstance();
		tables[53]=hl7.model.V2_3.table.Table0064.getInstance();
		tables[54]=hl7.model.V2_3.table.Table0005.getInstance();
		
		descriptions[0]="SET_ID_GUARANTOR";
		descriptions[1]="GUARANTOR_NUMBER";
		descriptions[2]="GUARANTOR_NAME";
		descriptions[3]="GUARANTOR_SPOUSE_NAME";
		descriptions[4]="GUARANTOR_ADDRESS";
		descriptions[5]="GUARANTOR_PH_NUM_HOME";
		descriptions[6]="GUARANTOR_PH_NUM_BUSINESS";
		descriptions[7]="GUARANTOR_DATE_TIME_OF_BIRTH";
		descriptions[8]="GUARANTOR_SEX";
		descriptions[9]="GUARANTOR_TYPE";
		descriptions[10]="GUARANTOR_RELATIONSHIP";
		descriptions[11]="GUARANTOR_SSN";
		descriptions[12]="GUARANTOR_DATE_BEGIN";
		descriptions[13]="GUARANTOR_DATE_END";
		descriptions[14]="GUARANTOR_PRIORITY";
		descriptions[15]="GUARANTOR_EMPLOYER_NAME";
		descriptions[16]="GUARANTOR_EMPLOYER_ADDRESS";
		descriptions[17]="GUARANTOR_EMPLOY_PHONE_NUMBER";
		descriptions[18]="GUARANTOR_EMPLOYEE_ID_NUMBER";
		descriptions[19]="GUARANTOR_EMPLOYMENT_STATUS";
		descriptions[20]="GUARANTOR_ORGANIZATION";
		descriptions[21]="GUARANTOR_BILLING_HOLD_FLAG";
		descriptions[22]="GUARANTOR_CREDIT_RATING_CODE";
		descriptions[23]="GUARANTOR_DEATH_DATE_AND_TIME";
		descriptions[24]="GUARANTOR_DEATH_FLAG";
		descriptions[25]="GUARANTOR_CHARGE_ADJUSTMENT_CODE";
		descriptions[26]="GUARANTOR_HOUSEHOLD_ANNUAL_INCOME";
		descriptions[27]="GUARANTOR_HOUSEHOLD_SIZE";
		descriptions[28]="GUARANTOR_EMPLOYER_ID_NUMBER";
		descriptions[29]="GUARANTOR_MARITAL_STATUS_CODE";
		descriptions[30]="GUARANTOR_HIRE_EFFECTIVE_DATE";
		descriptions[31]="EMPLOYMENT_STOP_DATE";
		descriptions[32]="LIVING_DEPENDENCY";
		descriptions[33]="AMBULATORY_STATUS";
		descriptions[34]="CITIZENSHIP";
		descriptions[35]="PRIMARY_LANGUAGE";
		descriptions[36]="LIVING_ARRANGEMENT";
		descriptions[37]="PUBLICITY_INDICATOR";
		descriptions[38]="PROTECTION_INDICATOR";
		descriptions[39]="STUDENT_INDICATOR";
		descriptions[40]="RELIGION";
		descriptions[41]="MOTHER’S_MAIDEN_NAME";
		descriptions[42]="NATIONALITY_CODE";
		descriptions[43]="ETHNIC_GROUP";
		descriptions[44]="CONTACT_PERSONS_NAME";
		descriptions[45]="CONTACT_PERSON’S_TELEPHONE_NUMBER";
		descriptions[46]="CONTACT_REASON";
		descriptions[47]="CONTACT_RELATIONSHIP_CODE";
		descriptions[48]="JOB_TITLE";
		descriptions[49]="JOB_CODE_CLASS";
		descriptions[50]="GUARANTOR_EMPLOYERS_ORGANIZATION_NAME";
		descriptions[51]="HANDICAP";
		descriptions[52]="JOB_STATUS";
		descriptions[53]="GUARANTOR_FINANCIAL_CLASS";
		descriptions[54]="GUARANTOR_RACE";

		required[0]=true;
		required[1]=false;
		required[2]=true;
		required[3]=false;
		required[4]=false;
		required[5]=false;
		required[6]=false;
		required[7]=false;
		required[8]=false;
		required[9]=false;
		required[10]=false;
		required[11]=false;
		required[12]=false;
		required[13]=false;
		required[14]=false;
		required[15]=false;
		required[16]=false;
		required[17]=false;
		required[18]=false;
		required[19]=false;
		required[20]=false;
		required[21]=false;
		required[22]=false;
		required[23]=false;
		required[24]=false;
		required[25]=false;
		required[26]=false;
		required[27]=false;
		required[28]=false;
		required[29]=false;
		required[30]=false;
		required[31]=false;
		required[32]=false;
		required[33]=false;
		required[34]=false;
		required[35]=false;
		required[36]=false;
		required[37]=false;
		required[38]=false;
		required[39]=false;
		required[40]=false;
		required[41]=false;
		required[42]=false;
		required[43]=false;
		required[44]=false;
		required[45]=false;
		required[46]=false;
		required[47]=false;
		required[48]=false;
		required[49]=false;
		required[50]=false;
		required[51]=false;
		required[52]=false;
		required[53]=false;
		required[54]=false;
		
		optional[0]=false;
		optional[1]=true;
		optional[2]=false;
		optional[3]=true;
		optional[4]=true;
		optional[5]=true;
		optional[6]=true;
		optional[7]=true;
		optional[8]=true;
		optional[9]=true;
		optional[10]=true;
		optional[11]=true;
		optional[12]=true;
		optional[13]=true;
		optional[14]=true;
		optional[15]=true;
		optional[16]=true;
		optional[17]=true;
		optional[18]=true;
		optional[19]=true;
		optional[20]=true;
		optional[21]=true;
		optional[22]=true;
		optional[23]=true;
		optional[24]=true;
		optional[25]=true;
		optional[26]=true;
		optional[27]=true;
		optional[28]=true;
		optional[29]=true;
		optional[30]=true;
		optional[31]=true;
		optional[32]=true;
		optional[33]=true;
		optional[34]=true;
		optional[35]=true;
		optional[36]=true;
		optional[37]=true;
		optional[38]=true;
		optional[39]=true;
		optional[40]=true;
		optional[41]=true;
		optional[42]=true;
		optional[43]=true;
		optional[44]=true;
		optional[45]=true;
		optional[46]=true;
		optional[47]=true;
		optional[48]=true;
		optional[49]=true;
		optional[50]=true;
		optional[51]=true;
		optional[52]=true;
		optional[53]=true;
		optional[54]=true;

		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=false;
		conditional[8]=false;
		conditional[9]=false;
		conditional[10]=false;
		conditional[11]=false;
		conditional[12]=false;
		conditional[13]=false;
		conditional[14]=false;
		conditional[15]=false;
		conditional[16]=false;
		conditional[17]=false;
		conditional[18]=false;
		conditional[19]=false;
		conditional[20]=false;
		conditional[21]=false;
		conditional[22]=false;
		conditional[23]=false;
		conditional[24]=false;
		conditional[25]=false;
		conditional[26]=false;
		conditional[27]=false;
		conditional[28]=false;
		conditional[29]=false;
		conditional[30]=false;
		conditional[31]=false;
		conditional[32]=false;
		conditional[33]=false;
		conditional[34]=false;
		conditional[35]=false;
		conditional[36]=false;
		conditional[37]=false;
		conditional[38]=false;
		conditional[39]=false;
		conditional[40]=false;
		conditional[41]=false;
		conditional[42]=false;
		conditional[43]=false;
		conditional[44]=false;
		conditional[45]=false;
		conditional[46]=false;
		conditional[47]=false;
		conditional[48]=false;
		conditional[49]=false;
		conditional[50]=false;
		conditional[51]=false;
		conditional[52]=false;
		conditional[53]=false;
		conditional[54]=false;
	
		repeatable [0]=true;
		repeatable [1]=true;
		repeatable [2]=true;
		repeatable [3]=true;
		repeatable [4]=true;
		repeatable [5]=true;
		repeatable [6]=true;
		repeatable [7]=true;
		repeatable [8]=true;
		repeatable [9]=true;
		repeatable [10]=true;
		repeatable [11]=true;
		repeatable [12]=true;
		repeatable [13]=true;
		repeatable [14]=true;
		repeatable [15]=true;
		repeatable [16]=true;
		repeatable [17]=true;
		repeatable [18]=true;
		repeatable [19]=true;
		repeatable [20]=true;
		repeatable [21]=true;
		repeatable [22]=true;
		repeatable [23]=true;
		repeatable [24]=true;
		repeatable [25]=true;
		repeatable [26]=true;
		repeatable [27]=true;
		repeatable [28]=true;
		repeatable [29]=true;
		repeatable [30]=true;
		repeatable [31]=true;
		repeatable [32]=true;
		repeatable [33]=true;
		repeatable [34]=true;
		repeatable [35]=true;
		repeatable [36]=true;
		repeatable [37]=true;
		repeatable [38]=true;
		repeatable [39]=true;
		repeatable [40]=true;
		repeatable [41]=true;
		repeatable [42]=true;
		repeatable [43]=true;
		repeatable [44]=true;
		repeatable [45]=true;
		repeatable [46]=true;
		repeatable [47]=true;
		repeatable [48]=true;
		repeatable [49]=true;
		repeatable [50]=true;
		repeatable [51]=true;
		repeatable [52]=true;
		repeatable [53]=true;
		repeatable [54]=true;
	
		minLength[0]=0;
		minLength[1]=0;
		minLength[2]=0;
		minLength[3]=0;
		minLength[4]=0;
		minLength[5]=0;
		minLength[6]=0;
		minLength[7]=0;
		minLength[8]=0;
		minLength[9]=0;
		minLength[10]=0;
		minLength[11]=0;
		minLength[12]=0;
		minLength[13]=0;
		minLength[14]=0;
		minLength[15]=0;
		minLength[16]=0;
		minLength[17]=0;
		minLength[18]=0;
		minLength[19]=0;
		minLength[20]=0;
		minLength[21]=0;
		minLength[22]=0;
		minLength[23]=0;
		minLength[24]=0;
		minLength[25]=0;
		minLength[26]=0;
		minLength[27]=0;
		minLength[28]=0;
		minLength[29]=0;
		minLength[30]=0;
		minLength[31]=0;
		minLength[32]=0;
		minLength[33]=0;
		minLength[34]=0;
		minLength[35]=0;
		minLength[36]=0;
		minLength[37]=0;
		minLength[38]=0;
		minLength[39]=0;
		minLength[40]=0;
		minLength[41]=0;
		minLength[42]=0;
		minLength[43]=0;
		minLength[44]=0;
		minLength[45]=0;
		minLength[46]=0;
		minLength[47]=0;
		minLength[48]=0;
		minLength[49]=0;
		minLength[50]=0;
		minLength[51]=0;
		minLength[52]=0;
		minLength[53]=0;
		minLength[54]=0;
		maxLength[0]=4;
		maxLength[1]=59;
		maxLength[2]=48;
		maxLength[3]=48;
		maxLength[4]=106;
		maxLength[5]=40;
		maxLength[6]=40;
		maxLength[7]=26;
		maxLength[8]=1;
		maxLength[9]=2;
		maxLength[10]=2;
		maxLength[11]=11;
		maxLength[12]=8;
		maxLength[13]=8;
		maxLength[14]=2;
		maxLength[15]=130;
		maxLength[16]=106;
		maxLength[17]=40;
		maxLength[18]=20;
		maxLength[19]=2;
		maxLength[20]=130;
		maxLength[21]=1;
		maxLength[22]=80;
		maxLength[23]=26;
		maxLength[24]=1;
		maxLength[25]=80;
		maxLength[26]=10;
		maxLength[27]=3;
		maxLength[28]=20;
		maxLength[29]=1;
		maxLength[30]=8;
		maxLength[31]=8;
		maxLength[32]=2;
		maxLength[33]=2;
		maxLength[34]=4;
		maxLength[35]=60;
		maxLength[36]=2;
		maxLength[37]=1;
		maxLength[38]=1;
		maxLength[39]=2;
		maxLength[40]=3;
		maxLength[41]=48;
		maxLength[42]=80;
		maxLength[43]=1;
		maxLength[44]=48;
		maxLength[45]=40;
		maxLength[46]=2;
		maxLength[47]=2;
		maxLength[48]=20;
		maxLength[49]=20;
		maxLength[50]=130;
		maxLength[51]=2;
		maxLength[52]=2;
		maxLength[53]=50;
		maxLength[54]=1;
	}
	
	public GT1(){
		type = Segment.GT1;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.GT1 seg = new hl7.pseudo.segment.GT1();
		seg.originalVersion = originalVersion;
		seg.setVersion = setVersion;
		return seg;
	}
	
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure[] dataStructures = components[i];
			for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
				DataStructure dataStructure = components[i][c];
				if(dataStructure!=null) dataStructure.setVersion(setVersion);
			}
		}
	}

	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure[] dataStructures = components[i];
			for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
				DataStructure dataStructure = components[i][c];
				if(dataStructure!=null) dataStructure.originalVersion(originalVersion);
			}
		}
	}

	public DataStructure[][] getComponents(){
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
			
			char separator = MessageStructure.FIELD_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		


			for(int i=1; i<components.length&&comps!=null&&i<comps.length; i++){
				//반복 메시지 처리
				String[] messages = divide(comps[i], MessageStructure.REPEATITION_SEPARATOR);
				if(messages==null) continue;
				DataStructure[] dataStructures = new DataStructure[messages.length];
				components[i-1] = dataStructures;
				for(int c=0; c<messages.length; c++){
					components[i-1][c] = standard[i-1].cloneClass(originalVersion, setVersion);
					components[i-1][c].originalVersion(originalVersion);
					components[i-1][c].decode(messages[c]);
				}
			}


		}
	}
	
	/* -----------------------------------------------------------------
	 * 이전 버전으로 매핑 components:구버전, subComponents:신버전
	 * 신버전 메시지-->구버전 파서(상위호환)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion, String prevVersion) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			DataStructure[] subComps = new DataStructure[subComponents[i].length];
			components[i] = subComps;
			for(int c=0; c<subComps.length; c++){
				if(i==10) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==29) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==34) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==40) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==43) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==54) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==22) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==25) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==35) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==37) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==42) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==46) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==0) components[i][c] = subComponents[i][c];
				if(i==1) components[i][c] = subComponents[i][c];
				if(i==2) components[i][c] = subComponents[i][c];
				if(i==3) components[i][c] = subComponents[i][c];
				if(i==4) components[i][c] = subComponents[i][c];
				if(i==5) components[i][c] = subComponents[i][c];
				if(i==6) components[i][c] = subComponents[i][c];
				if(i==7) components[i][c] = subComponents[i][c];
				if(i==8) components[i][c] = subComponents[i][c];
				if(i==9) components[i][c] = subComponents[i][c];
				if(i==11) components[i][c] = subComponents[i][c];
				if(i==12) components[i][c] = subComponents[i][c];
				if(i==13) components[i][c] = subComponents[i][c];
				if(i==14) components[i][c] = subComponents[i][c];
				if(i==15) components[i][c] = subComponents[i][c];
				if(i==16) components[i][c] = subComponents[i][c];
				if(i==17) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
				if(i==19) components[i][c] = subComponents[i][c];
				if(i==20) components[i][c] = subComponents[i][c];
				if(i==21) components[i][c] = subComponents[i][c];
				if(i==23) components[i][c] = subComponents[i][c];
				if(i==24) components[i][c] = subComponents[i][c];
				if(i==26) components[i][c] = subComponents[i][c];
				if(i==27) components[i][c] = subComponents[i][c];
				if(i==28) components[i][c] = subComponents[i][c];
				if(i==30) components[i][c] = subComponents[i][c];
				if(i==31) components[i][c] = subComponents[i][c];
				if(i==32) components[i][c] = subComponents[i][c];
				if(i==33) components[i][c] = subComponents[i][c];
				if(i==36) components[i][c] = subComponents[i][c];
				if(i==38) components[i][c] = subComponents[i][c];
				if(i==39) components[i][c] = subComponents[i][c];
				if(i==41) components[i][c] = subComponents[i][c];
				if(i==44) components[i][c] = subComponents[i][c];
				if(i==45) components[i][c] = subComponents[i][c];
				if(i==47) components[i][c] = subComponents[i][c];
				if(i==48) components[i][c] = subComponents[i][c];
				if(i==49) components[i][c] = subComponents[i][c];
				if(i==50) components[i][c] = subComponents[i][c];
				if(i==51) components[i][c] = subComponents[i][c];
				if(i==52) components[i][c] = subComponents[i][c];
				if(i==53) components[i][c] = subComponents[i][c];
				if(components[i][c]==null) continue;
				components[i][c].depth(subComponents[i][c].depth);
				subComponents[i][c].setVersion(prevVersion);
				String data = subComponents[i][c].encode();
				components[i][c].decode(data);
			}
		}
	}
	
	/* -----------------------------------------------------------------
	 * 이후 버전으로 매핑 components:구버전, subComponents:신버전
	 * 구버전 메시지-->신버전 파서(하위호환)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			DataStructure[] comps = new DataStructure[components[i].length];
			subComponents[i] = comps;
			for(int c=0; c<comps.length; c++){
				if(i==7) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==8) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==9) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==10) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==19) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==21) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==23) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==24) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==27) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==29) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==30) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.DT.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==31) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.DT.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==32) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==33) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==34) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==36) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==38) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==39) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==40) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==43) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==47) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==48) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==51) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==52) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==54) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==1) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CX.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==2) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==3) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==4) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XAD.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==5) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XTN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==6) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XTN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==15) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==16) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XAD.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==17) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XTN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==18) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CX.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==20) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XON.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==22) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==25) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==26) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CP.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==28) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CX.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==35) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==37) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==41) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==42) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==44) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==45) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XTN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==46) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==49) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.JCC.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==50) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XON.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==53) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.FC.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==0) subComponents[i][c] = components[i][c];
				if(i==11) subComponents[i][c] = components[i][c];
				if(i==12) subComponents[i][c] = components[i][c];
				if(i==13) subComponents[i][c] = components[i][c];
				if(i==14) subComponents[i][c] = components[i][c];
				if(components[i][c]==null) continue;
				subComponents[i][c].depth(components[i][c].depth);
				components[i][c].setVersion(originalVersion);
				String data = components[i][c].encode();
				subComponents[i][c].decode(data);
			}
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//가장 마지막 메소드에서 위치찾기 옵션 설정
		return encode(null);
	}
	
	public String encode(DataStructure[][] subComponents) throws Exception{
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
						hl7.model.V2_2.segment.GT1 type = (hl7.model.V2_2.segment.GT1)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION);
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
			hl7.model.V2_31.segment.GT1 type = (hl7.model.V2_31.segment.GT1)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}
	
	public String makeMessage(DataStructure[][] components, String version) throws Exception{
		if(VERSION.equals(version)){
			setCharacter(components, VERSION);
			String message = "";
			boolean add = false;	//뒤쪽에서 컴포넌트가 존재할 때 true
			char separator = MessageStructure.FIELD_SEPARATOR;
			for(int i=components.length-1; i>=0; i--){
				DataStructure[] dataStructures = components[i];
				if(dataStructures!=null || required[i]) add=true;	//필수항목부터 추가
				String component = "";
				for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
					if(!repeatable[i]&&c>0) continue;
					DataStructure comp = dataStructures[c];
					if(comp==null) continue;
					String data = comp.encode();
					if(data==null) data="";
					if(maxLength[i]>0&&data.length()>maxLength[i]) data=data.substring(0, maxLength[i]);
					if(c>0) component += MessageStructure.REPEATITION_SEPARATOR;
					component += data;
				}
				if(add) message = component + ((message.length()>0)?separator:"") + message; 
			}
			return (message.length()==0)?null:type+separator+message;
			
		}else{
			return super.makeMessage(components, version);
		}
	}
}
