package hl7.model.V2_6.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class PV1 extends hl7.model.V2_51.segment.PV1{

	public static final String VERSION = "2.6";
	
	public static int SIZE = 52;
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
		standard[1]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[2]=hl7.pseudo.datastructure.PL.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[4]=hl7.pseudo.datastructure.CX.CLASS;
		standard[5]=hl7.pseudo.datastructure.PL.CLASS;
		standard[6]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[7]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[8]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[10]=hl7.pseudo.datastructure.PL.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[16]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[18]=hl7.pseudo.datastructure.CX.CLASS;
		standard[19]=hl7.pseudo.datastructure.FC.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[21]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[22]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[25]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[28]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[29]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[30]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[31]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[32]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[33]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[34]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[35]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[36]=hl7.pseudo.datastructure.DLD.CLASS;
		standard[37]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[38]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[39]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[40]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[41]=hl7.pseudo.datastructure.PL.CLASS;
		standard[42]=hl7.pseudo.datastructure.PL.CLASS;
		standard[43]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[44]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[45]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[46]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[47]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[48]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[49]=hl7.pseudo.datastructure.CX.CLASS;
		standard[50]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[51]=hl7.pseudo.datastructure.XCN.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_6.table.Table0004.getInstance();
		tables[2]=null;
		tables[3]=hl7.model.V2_6.table.Table0007.getInstance();
		tables[4]=null;
		tables[5]=null;
		tables[6]=hl7.model.V2_6.table.Table0010.getInstance();
		tables[7]=hl7.model.V2_6.table.Table0010.getInstance();
		tables[8]=hl7.model.V2_6.table.Table0010.getInstance();
		tables[9]=hl7.model.V2_6.table.Table0069.getInstance();
		tables[10]=null;
		tables[11]=hl7.model.V2_6.table.Table0087.getInstance();
		tables[12]=hl7.model.V2_6.table.Table0092.getInstance();
		tables[13]=hl7.model.V2_6.table.Table0023.getInstance();
		tables[14]=hl7.model.V2_6.table.Table0009.getInstance();
		tables[15]=hl7.model.V2_6.table.Table0099.getInstance();
		tables[16]=hl7.model.V2_6.table.Table0010.getInstance();
		tables[17]=hl7.model.V2_6.table.Table0018.getInstance();
		tables[18]=null;
		tables[19]=hl7.model.V2_6.table.Table0064.getInstance();
		tables[20]=hl7.model.V2_6.table.Table0032.getInstance();
		tables[21]=hl7.model.V2_6.table.Table0045.getInstance();
		tables[22]=hl7.model.V2_6.table.Table0046.getInstance();
		tables[23]=hl7.model.V2_6.table.Table0044.getInstance();
		tables[24]=null;
		tables[25]=null;
		tables[26]=null;
		tables[27]=hl7.model.V2_6.table.Table0073.getInstance();
		tables[28]=hl7.model.V2_6.table.Table0110.getInstance();
		tables[29]=null;
		tables[30]=hl7.model.V2_6.table.Table0021.getInstance();
		tables[31]=null;
		tables[32]=null;
		tables[33]=hl7.model.V2_6.table.Table0111.getInstance();
		tables[34]=null;
		tables[35]=hl7.model.V2_6.table.Table0112.getInstance();
		tables[36]=hl7.model.V2_6.table.Table0113.getInstance();
		tables[37]=hl7.model.V2_6.table.Table0114.getInstance();
		tables[38]=hl7.model.V2_6.table.Table0115.getInstance();
		tables[39]=hl7.model.V2_6.table.Table0116.getInstance();
		tables[40]=hl7.model.V2_6.table.Table0117.getInstance();
		tables[41]=null;
		tables[42]=null;
		tables[43]=null;
		tables[44]=null;
		tables[45]=null;
		tables[46]=null;
		tables[47]=null;
		tables[48]=null;
		tables[49]=hl7.model.V2_6.table.Table0203.getInstance();
		tables[50]=hl7.model.V2_6.table.Table0326.getInstance();
		tables[51]=hl7.model.V2_6.table.Table0010.getInstance();
		
		descriptions[0]="SET_ID_PV1";
		descriptions[1]="PATIENT_CLASS";
		descriptions[2]="ASSIGNED_PATIENT_LOCATION";
		descriptions[3]="ADMISSION_TYPE";
		descriptions[4]="PREADMIT_NUMBER";
		descriptions[5]="PRIOR_PATIENT_LOCATION";
		descriptions[6]="ATTENDING_DOCTOR";
		descriptions[7]="REFERRING_DOCTOR";
		descriptions[8]="CONSULTING_DOCTOR";
		descriptions[9]="HOSPITAL_SERVICE";
		descriptions[10]="TEMPORARY_LOCATION";
		descriptions[11]="PREADMIT_TEST_INDICATOR";
		descriptions[12]="RE_ADMISSION_INDICATOR";
		descriptions[13]="ADMIT_SOURCE";
		descriptions[14]="AMBULATORY_STATUS";
		descriptions[15]="VIP_INDICATOR";
		descriptions[16]="ADMITTING_DOCTOR";
		descriptions[17]="PATIENT_TYPE";
		descriptions[18]="VISIT_NUMBER";
		descriptions[19]="FINANCIAL_CLASS";
		descriptions[20]="CHARGE_PRICE_INDICATOR";
		descriptions[21]="COURTESY_CODE";
		descriptions[22]="CREDIT_RATING";
		descriptions[23]="CONTRACT_CODE";
		descriptions[24]="CONTRACT_EFFECTIVE_DATE";
		descriptions[25]="CONTRACT_AMOUNT";
		descriptions[26]="CONTRACT_PERIOD";
		descriptions[27]="INTEREST_CODE";
		descriptions[28]="TRANSFER_TO_BAD_DEBT_CODE";
		descriptions[29]="TRANSFER_TO_BAD_DEBT_DATE";
		descriptions[30]="BAD_DEBT_AGENCY_CODE";
		descriptions[31]="BAD_DEBT_TRANSFER_AMOUNT";
		descriptions[32]="BAD_DEBT_RECOVERY_AMOUNT";
		descriptions[33]="DELETE_ACCOUNT_INDICATOR";
		descriptions[34]="DELETE_ACCOUNT_DATE";
		descriptions[35]="DISCHARGE_DISPOSITION";
		descriptions[36]="DISCHARGED_TO_LOCATION";
		descriptions[37]="DIET_TYPE";
		descriptions[38]="SERVICING_FACILITY";
		descriptions[39]="BED_STATUS";
		descriptions[40]="ACCOUNT_STATUS";
		descriptions[41]="PENDING_LOCATION";
		descriptions[42]="PRIOR_TEMPORARY_LOCATION";
		descriptions[43]="ADMIT_DATE_TIME";
		descriptions[44]="DISCHARGE_DATE_TIME";
		descriptions[45]="CURRENT_PATIENT_BALANCE";
		descriptions[46]="TOTAL_CHARGES";
		descriptions[47]="TOTAL_ADJUSTMENTS";
		descriptions[48]="TOTAL_PAYMENTS";
		descriptions[49]="ALTERNATE_VISIT_ID";
		descriptions[50]="VISIT_INDICATOR";
		descriptions[51]="OTHER_HEALTHCARE_PROVIDER";

		required[0]=false;
		required[1]=true;
		required[2]=false;
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
		
		optional[0]=true;
		optional[1]=false;
		optional[2]=true;
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
		maxLength[0]=4;
		maxLength[1]=1;
		maxLength[2]=80;
		maxLength[3]=2;
		maxLength[4]=250;
		maxLength[5]=80;
		maxLength[6]=250;
		maxLength[7]=250;
		maxLength[8]=2147483647;
		maxLength[9]=3;
		maxLength[10]=80;
		maxLength[11]=2;
		maxLength[12]=2;
		maxLength[13]=6;
		maxLength[14]=2;
		maxLength[15]=2;
		maxLength[16]=250;
		maxLength[17]=2;
		maxLength[18]=250;
		maxLength[19]=50;
		maxLength[20]=2;
		maxLength[21]=2;
		maxLength[22]=2;
		maxLength[23]=2;
		maxLength[24]=8;
		maxLength[25]=12;
		maxLength[26]=3;
		maxLength[27]=2;
		maxLength[28]=4;
		maxLength[29]=8;
		maxLength[30]=10;
		maxLength[31]=12;
		maxLength[32]=12;
		maxLength[33]=1;
		maxLength[34]=8;
		maxLength[35]=3;
		maxLength[36]=47;
		maxLength[37]=705;
		maxLength[38]=2;
		maxLength[39]=2147483647;
		maxLength[40]=2;
		maxLength[41]=80;
		maxLength[42]=80;
		maxLength[43]=24;
		maxLength[44]=24;
		maxLength[45]=12;
		maxLength[46]=12;
		maxLength[47]=12;
		maxLength[48]=12;
		maxLength[49]=250;
		maxLength[50]=1;
		maxLength[51]=2147483647;
	}
	
	public PV1(){
		type = Segment.PV1;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.PV1 seg = new hl7.pseudo.segment.PV1();
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
	
	private boolean compiled = false;	//���� ������ ���� Ȯ��
	public void decode(String message) throws Exception {
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//���� ������ ���� Ȯ��
			
			char separator = MessageStructure.FIELD_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		


			for(int i=1; i<components.length&&comps!=null&&i<comps.length; i++){
				//�ݺ� �޽��� ó��
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
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion, String prevVersion) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			DataStructure[] subComps = new DataStructure[subComponents[i].length];
			components[i] = subComps;
			for(int c=0; c<subComps.length; c++){
				if(i==1) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==3) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==9) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==11) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==12) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==13) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==14) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==15) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==17) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==20) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==21) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==22) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==23) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==27) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==28) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==30) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==33) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==35) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==38) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==39) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==40) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==50) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==0) components[i][c] = subComponents[i][c];
				if(i==2) components[i][c] = subComponents[i][c];
				if(i==4) components[i][c] = subComponents[i][c];
				if(i==5) components[i][c] = subComponents[i][c];
				if(i==6) components[i][c] = subComponents[i][c];
				if(i==7) components[i][c] = subComponents[i][c];
				if(i==8) components[i][c] = subComponents[i][c];
				if(i==10) components[i][c] = subComponents[i][c];
				if(i==16) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
				if(i==19) components[i][c] = subComponents[i][c];
				if(i==24) components[i][c] = subComponents[i][c];
				if(i==25) components[i][c] = subComponents[i][c];
				if(i==26) components[i][c] = subComponents[i][c];
				if(i==29) components[i][c] = subComponents[i][c];
				if(i==31) components[i][c] = subComponents[i][c];
				if(i==32) components[i][c] = subComponents[i][c];
				if(i==34) components[i][c] = subComponents[i][c];
				if(i==36) components[i][c] = subComponents[i][c];
				if(i==37) components[i][c] = subComponents[i][c];
				if(i==41) components[i][c] = subComponents[i][c];
				if(i==42) components[i][c] = subComponents[i][c];
				if(i==43) components[i][c] = subComponents[i][c];
				if(i==44) components[i][c] = subComponents[i][c];
				if(i==45) components[i][c] = subComponents[i][c];
				if(i==46) components[i][c] = subComponents[i][c];
				if(i==47) components[i][c] = subComponents[i][c];
				if(i==48) components[i][c] = subComponents[i][c];
				if(i==49) components[i][c] = subComponents[i][c];
				if(i==51) components[i][c] = subComponents[i][c];
				if(components[i][c]==null) continue;
				components[i][c].depth(subComponents[i][c].depth);
				subComponents[i][c].setVersion(prevVersion);
				String data = subComponents[i][c].encode();
				components[i][c].decode(data);
			}
		}
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			DataStructure[] comps = new DataStructure[components[i].length];
			subComponents[i] = comps;
			for(int c=0; c<comps.length; c++){
				if(i==43) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.DTM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==44) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.DTM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==37) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==0) subComponents[i][c] = components[i][c];
				if(i==1) subComponents[i][c] = components[i][c];
				if(i==2) subComponents[i][c] = components[i][c];
				if(i==3) subComponents[i][c] = components[i][c];
				if(i==4) subComponents[i][c] = components[i][c];
				if(i==5) subComponents[i][c] = components[i][c];
				if(i==6) subComponents[i][c] = components[i][c];
				if(i==7) subComponents[i][c] = components[i][c];
				if(i==8) subComponents[i][c] = components[i][c];
				if(i==9) subComponents[i][c] = components[i][c];
				if(i==10) subComponents[i][c] = components[i][c];
				if(i==11) subComponents[i][c] = components[i][c];
				if(i==12) subComponents[i][c] = components[i][c];
				if(i==13) subComponents[i][c] = components[i][c];
				if(i==14) subComponents[i][c] = components[i][c];
				if(i==15) subComponents[i][c] = components[i][c];
				if(i==16) subComponents[i][c] = components[i][c];
				if(i==17) subComponents[i][c] = components[i][c];
				if(i==18) subComponents[i][c] = components[i][c];
				if(i==19) subComponents[i][c] = components[i][c];
				if(i==20) subComponents[i][c] = components[i][c];
				if(i==21) subComponents[i][c] = components[i][c];
				if(i==22) subComponents[i][c] = components[i][c];
				if(i==23) subComponents[i][c] = components[i][c];
				if(i==24) subComponents[i][c] = components[i][c];
				if(i==25) subComponents[i][c] = components[i][c];
				if(i==26) subComponents[i][c] = components[i][c];
				if(i==27) subComponents[i][c] = components[i][c];
				if(i==28) subComponents[i][c] = components[i][c];
				if(i==29) subComponents[i][c] = components[i][c];
				if(i==30) subComponents[i][c] = components[i][c];
				if(i==31) subComponents[i][c] = components[i][c];
				if(i==32) subComponents[i][c] = components[i][c];
				if(i==33) subComponents[i][c] = components[i][c];
				if(i==34) subComponents[i][c] = components[i][c];
				if(i==35) subComponents[i][c] = components[i][c];
				if(i==36) subComponents[i][c] = components[i][c];
				if(i==38) subComponents[i][c] = components[i][c];
				if(i==39) subComponents[i][c] = components[i][c];
				if(i==40) subComponents[i][c] = components[i][c];
				if(i==41) subComponents[i][c] = components[i][c];
				if(i==42) subComponents[i][c] = components[i][c];
				if(i==45) subComponents[i][c] = components[i][c];
				if(i==46) subComponents[i][c] = components[i][c];
				if(i==47) subComponents[i][c] = components[i][c];
				if(i==48) subComponents[i][c] = components[i][c];
				if(i==49) subComponents[i][c] = components[i][c];
				if(i==50) subComponents[i][c] = components[i][c];
				if(i==51) subComponents[i][c] = components[i][c];
				if(components[i][c]==null) continue;
				subComponents[i][c].depth(components[i][c].depth);
				components[i][c].setVersion(originalVersion);
				String data = components[i][c].encode();
				subComponents[i][c].decode(data);
			}
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(DataStructure[][] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //���� ������ ��ġ ã��
			//���� ������ ���� ��ġ�� �ƴ� ��
			//���� ���� ��ġ ã�ư���
			return super.encode(null);
			
		}else{//���� ������ ��ġ ã��
			seekOriginalVersion = false;
			//���� ������ ���� ��ġ�� ��
			if(setVersion.equals(VERSION)){ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� ��
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� �ƴ� ��
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //�������� �̵� ���� ã��
					//���� ������ ���� �������� ���� �� (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
						hl7.model.V2_51.segment.PV1 type = (hl7.model.V2_51.segment.PV1)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION);
					//}
					//���� ������ ��ġ�� ã�ư���
					return super.encode(components);
					
				}else{ //�������� �̵� ���� ã��
					/*-------------------------------------------------------------
					 *���� ������ ���� �������� ���� ��(forward)
					 *���� �������� Casting �� forward ȣ��
					 *������ ������ ���� 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//���� �������� ���ڵ� �� �ش� ��ġ�� ã�� ������ (�޼ҵ� �������̵� ������ ó������ �ٽ� ã�ư��� ��)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_7.segment.PV1 type = (hl7.model.V2_7.segment.PV1)this;
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
			boolean add = false;	//���ʿ��� ������Ʈ�� ������ �� true
			char separator = MessageStructure.FIELD_SEPARATOR;
			for(int i=components.length-1; i>=0; i--){
				DataStructure[] dataStructures = components[i];
				if(dataStructures!=null || required[i]) add=true;	//�ʼ��׸���� �߰�
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
