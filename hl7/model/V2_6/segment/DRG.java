package hl7.model.V2_6.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class DRG extends hl7.model.V2_51.segment.DRG{

	public static final String VERSION = "2.6";
	
	public static int SIZE = 33;
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
		standard[0]=hl7.pseudo.datastructure.CNE.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[4]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[6]=hl7.pseudo.datastructure.CP.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[8]=hl7.pseudo.datastructure.CP.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[11]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[12]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[13]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[15]=hl7.pseudo.datastructure.MO.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[18]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[20]=hl7.pseudo.datastructure.MO.CLASS;
		standard[21]=hl7.pseudo.datastructure.MO.CLASS;
		standard[22]=hl7.pseudo.datastructure.MO.CLASS;
		standard[23]=hl7.pseudo.datastructure.MO.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[25]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[28]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[29]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[30]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[31]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[32]=hl7.bean.datastructure.primitive.IS.CLASS;
		
		tables[0]=hl7.model.V2_6.table.Table0055.getInstance();
		tables[1]=null;
		tables[2]=hl7.model.V2_6.table.Table0136.getInstance();
		tables[3]=hl7.model.V2_6.table.Table0056.getInstance();
		tables[4]=hl7.model.V2_6.table.Table0083.getInstance();
		tables[5]=null;
		tables[6]=null;
		tables[7]=hl7.model.V2_6.table.Table0229.getInstance();
		tables[8]=null;
		tables[9]=hl7.model.V2_6.table.Table0136.getInstance();
		tables[10]=hl7.model.V2_6.table.Table0415.getInstance();
		tables[11]=null;
		tables[12]=hl7.model.V2_6.table.Table0734.getInstance();
		tables[13]=hl7.model.V2_6.table.Table0728.getInstance();
		tables[14]=null;
		tables[15]=null;
		tables[16]=hl7.model.V2_6.table.Table0739.getInstance();
		tables[17]=null;
		tables[18]=null;
		tables[19]=hl7.model.V2_6.table.Table0742.getInstance();
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=null;
		tables[24]=null;
		tables[25]=hl7.model.V2_6.table.Table0749.getInstance();
		tables[26]=hl7.model.V2_6.table.Table0749.getInstance();
		tables[27]=hl7.model.V2_6.table.Table0749.getInstance();
		tables[28]=hl7.model.V2_6.table.Table0749.getInstance();
		tables[29]=hl7.model.V2_6.table.Table0749.getInstance();
		tables[30]=hl7.model.V2_6.table.Table0755.getInstance();
		tables[31]=hl7.model.V2_6.table.Table0757.getInstance();
		tables[32]=hl7.model.V2_6.table.Table0759.getInstance();
		
		descriptions[0]="DIAGNOSTIC_RELATED_GROUP";
		descriptions[1]="DRG_ASSIGNED_DATE_TIME";
		descriptions[2]="DRG_APPROVAL_INDICATOR";
		descriptions[3]="DRG_GROUPER_REVIEW_CODE";
		descriptions[4]="OUTLIER_TYPE";
		descriptions[5]="OUTLIER_DAYS";
		descriptions[6]="OUTLIER_COST";
		descriptions[7]="DRG_PAYOR";
		descriptions[8]="OUTLIER_REIMBURSEMENT";
		descriptions[9]="CONFIDENTIAL_INDICATOR";
		descriptions[10]="DRG_TRANSFER_TYPE";
		descriptions[11]="NAME_OF_CODER";
		descriptions[12]="GROUPER_STATUS";
		descriptions[13]="PCCL_VALUE_CODE";
		descriptions[14]="EFFECTIVE_WEIGHT";
		descriptions[15]="MONETARY_AMOUNT";
		descriptions[16]="STATUS_PATIENT";
		descriptions[17]="GROUPER_SOFTWARE_NAME";
		descriptions[18]="GROUPER_SOFTWARE_VERSION";
		descriptions[19]="STATUS_FINANCIAL_CALCULATION";
		descriptions[20]="RELATIVE_DISCOUNT_SURCHARGE";
		descriptions[21]="BASIC_CHARGE";
		descriptions[22]="TOTAL_CHARGE";
		descriptions[23]="DISCOUNT_SURCHARGE";
		descriptions[24]="CALCULATED_DAYS";
		descriptions[25]="STATUS_GENDER";
		descriptions[26]="STATUS_AGE";
		descriptions[27]="STATUS_LENGTH_OF_STAY";
		descriptions[28]="STATUS_SAME_DAY_FLAG";
		descriptions[29]="STATUS_SEPARATION_MODE";
		descriptions[30]="STATUS_WEIGHT_AT_BIRTH";
		descriptions[31]="STATUS_RESPIRATION_MINUTES";
		descriptions[32]="STATUS_ADMISSION";

		required[0]=false;
		required[1]=false;
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
		
		optional[0]=true;
		optional[1]=true;
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
		maxLength[0]=250;
		maxLength[1]=24;
		maxLength[2]=1;
		maxLength[3]=2;
		maxLength[4]=250;
		maxLength[5]=3;
		maxLength[6]=12;
		maxLength[7]=1;
		maxLength[8]=9;
		maxLength[9]=1;
		maxLength[10]=21;
		maxLength[11]=1103;
		maxLength[12]=705;
		maxLength[13]=20;
		maxLength[14]=5;
		maxLength[15]=20;
		maxLength[16]=20;
		maxLength[17]=100;
		maxLength[18]=100;
		maxLength[19]=20;
		maxLength[20]=20;
		maxLength[21]=20;
		maxLength[22]=20;
		maxLength[23]=20;
		maxLength[24]=5;
		maxLength[25]=20;
		maxLength[26]=20;
		maxLength[27]=20;
		maxLength[28]=20;
		maxLength[29]=20;
		maxLength[30]=20;
		maxLength[31]=20;
		maxLength[32]=20;
	}
	
	public DRG(){
		type = Segment.DRG;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.DRG seg = new hl7.pseudo.segment.DRG();
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
				if(i==3) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==7) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==10) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==16) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==19) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==25) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==26) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==27) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==28) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==29) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==30) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==31) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==32) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==0) components[i][c] = subComponents[i][c];
				if(i==1) components[i][c] = subComponents[i][c];
				if(i==2) components[i][c] = subComponents[i][c];
				if(i==4) components[i][c] = subComponents[i][c];
				if(i==5) components[i][c] = subComponents[i][c];
				if(i==6) components[i][c] = subComponents[i][c];
				if(i==8) components[i][c] = subComponents[i][c];
				if(i==9) components[i][c] = subComponents[i][c];
				if(i==11) components[i][c] = subComponents[i][c];
				if(i==12) components[i][c] = subComponents[i][c];
				if(i==13) components[i][c] = subComponents[i][c];
				if(i==14) components[i][c] = subComponents[i][c];
				if(i==15) components[i][c] = subComponents[i][c];
				if(i==17) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
				if(i==20) components[i][c] = subComponents[i][c];
				if(i==21) components[i][c] = subComponents[i][c];
				if(i==22) components[i][c] = subComponents[i][c];
				if(i==23) components[i][c] = subComponents[i][c];
				if(i==24) components[i][c] = subComponents[i][c];
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
				if(i==1) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.DTM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==14) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==16) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==17) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==18) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==19) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==24) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==25) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==26) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==27) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==28) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==29) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==30) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==31) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==32) subComponents[i][c] = (components[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==0) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CNE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==4) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==11) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.XPN.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==12) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==13) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==15) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.MO.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==20) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.MO.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==21) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.MO.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==22) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.MO.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==23) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.MO.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==2) subComponents[i][c] = components[i][c];
				if(i==3) subComponents[i][c] = components[i][c];
				if(i==5) subComponents[i][c] = components[i][c];
				if(i==6) subComponents[i][c] = components[i][c];
				if(i==7) subComponents[i][c] = components[i][c];
				if(i==8) subComponents[i][c] = components[i][c];
				if(i==9) subComponents[i][c] = components[i][c];
				if(i==10) subComponents[i][c] = components[i][c];
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
						hl7.model.V2_51.segment.DRG type = (hl7.model.V2_51.segment.DRG)this;
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
			hl7.model.V2_7.segment.DRG type = (hl7.model.V2_7.segment.DRG)this;
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
