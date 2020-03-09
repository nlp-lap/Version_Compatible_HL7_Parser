package hl7.model.V2_2.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class IN2 extends hl7.character.segment.IN2{

	public static final String VERSION = "2.2";
	
	public static int SIZE = 30;
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
		standard[0]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[2]=hl7.pseudo.datastructure.CN.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[6]=hl7.pseudo.datastructure.PN.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[8]=hl7.pseudo.datastructure.PN.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[18]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[21]=hl7.pseudo.datastructure.PN.CLASS;
		standard[22]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[25]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[27]=hl7.pseudo.datastructure.CM.CLASS;
		standard[28]=hl7.pseudo.datastructure.CM.CLASS;
		standard[29]=hl7.pseudo.datastructure.CM.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=hl7.model.V2_2.table.Table0139.getInstance();
		tables[4]=hl7.model.V2_2.table.Table0137.getInstance();
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=null;
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		tables[12]=null;
		tables[13]=hl7.model.V2_2.table.Table0140.getInstance();
		tables[14]=hl7.model.V2_2.table.Table0141.getInstance();
		tables[15]=hl7.model.V2_2.table.Table0142.getInstance();
		tables[16]=null;
		tables[17]=hl7.model.V2_2.table.Table0136.getInstance();
		tables[18]=hl7.model.V2_2.table.Table0136.getInstance();
		tables[19]=hl7.model.V2_2.table.Table0136.getInstance();
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=hl7.model.V2_2.table.Table0143.getInstance();
		tables[24]=null;
		tables[25]=null;
		tables[26]=hl7.model.V2_2.table.Table0144.getInstance();
		tables[27]=hl7.model.V2_2.table.Table0145.getInstance();
		tables[28]=hl7.model.V2_2.table.Table0147.getInstance();
		tables[29]=null;
		
		descriptions[0]="INSUREDS_EMPLOYEE_ID";
		descriptions[1]="INSUREDS_SOCIAL_SECURITY_NUMBER";
		descriptions[2]="INSUREDS_EMPLOYER_NAME";
		descriptions[3]="EMPLOYER_INFORMATION_DATA";
		descriptions[4]="MAIL_CLAIM_PARTY";
		descriptions[5]="MEDICARE_HEALTH_INSURANCE_CARD_NUMBER";
		descriptions[6]="MEDICAID_CASE_NAME";
		descriptions[7]="MEDICAID_CASE_NUMBER";
		descriptions[8]="CHAMPUS_SPONSOR_NAME";
		descriptions[9]="CHAMPUS_ID_NUMBER";
		descriptions[10]="DEPENDENT_OF_CHAMPUS_RECIPIENT";
		descriptions[11]="CHAMPUS_ORGANIZATION";
		descriptions[12]="CHAMPUS_STATION";
		descriptions[13]="CHAMPUS_SERVICE";
		descriptions[14]="CHAMPUS_RANK_GRADE";
		descriptions[15]="CHAMPUS_STATUS";
		descriptions[16]="CHAMPUS_RETIRE_DATE";
		descriptions[17]="CHAMPUS_NON_AVAILABILITY_CERTIFICATION_ON_FILE";
		descriptions[18]="BABY_COVERAGE";
		descriptions[19]="COMBINE_BABY_BILL";
		descriptions[20]="BLOOD_DEDUCTIBLE";
		descriptions[21]="SPECIAL_COVERAGE_APPROVAL_NAME";
		descriptions[22]="SPECIAL_COVERAGE_APPROVAL_TITLE";
		descriptions[23]="NON_COVERED_INSURANCE_CODE";
		descriptions[24]="PAYOR_ID";
		descriptions[25]="PAYOR_SUBSCRIBER_ID";
		descriptions[26]="ELIGIBILITY_SOURCE";
		descriptions[27]="ROOM_COVERAGE_TYPE_AMOUNT";
		descriptions[28]="POLICY_TYPE_AMOUNT";
		descriptions[29]="DAILY_DEDUCTIBLE";

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
		maxLength[0]=15;
		maxLength[1]=9;
		maxLength[2]=60;
		maxLength[3]=1;
		maxLength[4]=1;
		maxLength[5]=15;
		maxLength[6]=48;
		maxLength[7]=15;
		maxLength[8]=48;
		maxLength[9]=20;
		maxLength[10]=1;
		maxLength[11]=25;
		maxLength[12]=25;
		maxLength[13]=14;
		maxLength[14]=2;
		maxLength[15]=3;
		maxLength[16]=8;
		maxLength[17]=1;
		maxLength[18]=1;
		maxLength[19]=1;
		maxLength[20]=1;
		maxLength[21]=48;
		maxLength[22]=30;
		maxLength[23]=8;
		maxLength[24]=6;
		maxLength[25]=6;
		maxLength[26]=1;
		maxLength[27]=25;
		maxLength[28]=25;
		maxLength[29]=25;
	}
	
	public IN2(){
		type = Segment.IN2;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.IN2 seg = new hl7.pseudo.segment.IN2();
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
				if(i==0) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==3) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==4) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==5) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==7) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==9) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==10) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==13) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==14) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==15) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==20) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.NM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==23) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==24) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==25) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==26) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==2) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CN.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==6) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.PN.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==8) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.PN.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==21) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.PN.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==27) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==28) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==29) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CM.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==1) components[i][c] = subComponents[i][c];
				if(i==11) components[i][c] = subComponents[i][c];
				if(i==12) components[i][c] = subComponents[i][c];
				if(i==16) components[i][c] = subComponents[i][c];
				if(i==17) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
				if(i==19) components[i][c] = subComponents[i][c];
				if(i==22) components[i][c] = subComponents[i][c];
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
			hl7.model.V2_3.segment.IN2 type = (hl7.model.V2_3.segment.IN2)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return null;
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
