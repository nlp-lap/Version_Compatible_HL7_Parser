package hl7.model.V2_7.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class MSH extends hl7.model.V2_6.segment.MSH{

	public static final String VERSION = "2.7";
	
	public static int SIZE = 25;
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
		standard[2]=hl7.pseudo.datastructure.HD.CLASS;
		standard[3]=hl7.pseudo.datastructure.HD.CLASS;
		standard[4]=hl7.pseudo.datastructure.HD.CLASS;
		standard[5]=hl7.pseudo.datastructure.HD.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[8]=hl7.pseudo.datastructure.MSG.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[10]=hl7.pseudo.datastructure.PT.CLASS;
		standard[11]=hl7.pseudo.datastructure.VID.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[18]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[20]=hl7.pseudo.datastructure.EI.CLASS;
		standard[21]=hl7.pseudo.datastructure.XON.CLASS;
		standard[22]=hl7.pseudo.datastructure.XON.CLASS;
		standard[23]=hl7.pseudo.datastructure.HD.CLASS;
		standard[24]=hl7.pseudo.datastructure.HD.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=hl7.model.V2_7.table.Table0361.getInstance();
		tables[3]=hl7.model.V2_7.table.Table0362.getInstance();
		tables[4]=hl7.model.V2_7.table.Table0361.getInstance();
		tables[5]=hl7.model.V2_7.table.Table0362.getInstance();
		tables[6]=null;
		tables[7]=null;
		tables[8]=null;
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		tables[14]=hl7.model.V2_7.table.Table0155.getInstance();
		tables[15]=hl7.model.V2_7.table.Table0155.getInstance();
		tables[16]=hl7.model.V2_7.table.Table0399.getInstance();
		tables[17]=hl7.model.V2_7.table.Table0211.getInstance();
		tables[18]=null;
		tables[19]=hl7.model.V2_7.table.Table0356.getInstance();
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=null;
		tables[24]=null;
		
		descriptions[0]="FIELD_SEPARATOR";
		descriptions[1]="ENCODING_CHARACTERS";
		descriptions[2]="SENDING_APPLICATION";
		descriptions[3]="SENDING_FACILITY";
		descriptions[4]="RECEIVING_APPLICATION";
		descriptions[5]="RECEIVING_FACILITY";
		descriptions[6]="DATE_TIME_OF_MESSAGE";
		descriptions[7]="SECURITY";
		descriptions[8]="MESSAGE_TYPE";
		descriptions[9]="MESSAGE_CONTROL_ID";
		descriptions[10]="PROCESSING_ID";
		descriptions[11]="VERSION_ID";
		descriptions[12]="SEQUENCE_NUMBER";
		descriptions[13]="CONTINUATION_POINTER";
		descriptions[14]="ACCEPT_ACKNOWLEDGMENT_TYPE";
		descriptions[15]="APPLICATION_ACKNOWLEDGMENT_TYPE";
		descriptions[16]="COUNTRY_CODE";
		descriptions[17]="CHARACTER_SET";
		descriptions[18]="PRINCIPAL_LANGUAGE_OF_MESSAGE";
		descriptions[19]="ALTERNATE_CHARACTER_SET_HANDLING_SCHEME";
		descriptions[20]="MESSAGE_PROFILE_IDENTIFIER";
		descriptions[21]="SENDING_RESPONSIBLE_ORGANIZATION";
		descriptions[22]="RECEIVING_RESPONSIBLE_ORGANIZATION";
		descriptions[23]="SENDING_NETWORK_ADDRESS";
		descriptions[24]="RECEIVING_NETWORK_ADDRESS";

		required[0]=true;
		required[1]=true;
		required[2]=false;
		required[3]=false;
		required[4]=false;
		required[5]=false;
		required[6]=true;
		required[7]=false;
		required[8]=true;
		required[9]=true;
		required[10]=true;
		required[11]=true;
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
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=true;
		optional[3]=true;
		optional[4]=true;
		optional[5]=true;
		optional[6]=false;
		optional[7]=true;
		optional[8]=false;
		optional[9]=false;
		optional[10]=false;
		optional[11]=false;
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
	
		minLength[0]=1;
		minLength[1]=4;
		minLength[2]=0;
		minLength[3]=0;
		minLength[4]=0;
		minLength[5]=0;
		minLength[6]=0;
		minLength[7]=0;
		minLength[8]=0;
		minLength[9]=1;
		minLength[10]=0;
		minLength[11]=0;
		minLength[12]=0;
		minLength[13]=0;
		minLength[14]=2;
		minLength[15]=2;
		minLength[16]=3;
		minLength[17]=5;
		minLength[18]=0;
		minLength[19]=3;
		minLength[20]=0;
		minLength[21]=0;
		minLength[22]=0;
		minLength[23]=0;
		minLength[24]=0;
		maxLength[0]=1;
		maxLength[1]=5;
		maxLength[2]=2147483647;
		maxLength[3]=2147483647;
		maxLength[4]=2147483647;
		maxLength[5]=2147483647;
		maxLength[6]=2147483647;
		maxLength[7]=2147483647;
		maxLength[8]=2147483647;
		maxLength[9]=199;
		maxLength[10]=2147483647;
		maxLength[11]=2147483647;
		maxLength[12]=2147483647;
		maxLength[13]=2147483647;
		maxLength[14]=2;
		maxLength[15]=2;
		maxLength[16]=3;
		maxLength[17]=15;
		maxLength[18]=2147483647;
		maxLength[19]=13;
		maxLength[20]=2147483647;
		maxLength[21]=2147483647;
		maxLength[22]=2147483647;
		maxLength[23]=2147483647;
		maxLength[24]=2147483647;
	}
	
	public MSH(){
		type = Segment.MSH;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.MSH seg = new hl7.pseudo.segment.MSH();
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
		



			for(int i=0; i<components.length&&comps!=null&&i<comps.length; i++){
				if(i==0){
					components[i] = new DataStructure[1];
					components[i][0] = standard[i].cloneClass(originalVersion, setVersion);
					components[i][0].decode(String.valueOf(separator));
				}else if(i==1){
					components[i] = new DataStructure[1];
					components[i][0] = standard[i].cloneClass(originalVersion, setVersion);
					components[i][0].decode(comps[i]);
				}else{
					//반복 메시지 처리
					String[] messages = divide(comps[i], MessageStructure.REPEATITION_SEPARATOR);
					if(messages==null) continue;
					DataStructure[] dataStructures = new DataStructure[messages.length];
					components[i] = dataStructures;
					for(int c=0; c<messages.length; c++){
						components[i][c] = standard[i].cloneClass(originalVersion, setVersion);
						components[i][c].originalVersion(originalVersion);
						components[i][c].decode(messages[c]);
					}
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
						hl7.model.V2_6.segment.MSH type = (hl7.model.V2_6.segment.MSH)this;
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
			return null;
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
			for(int i=components.length-1; i>0; i--){
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
