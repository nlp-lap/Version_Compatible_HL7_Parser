package hl7.model.V2_3.group;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class GOAL_PPV_PCA extends hl7.character.group.GOAL_PPV_PCA{
	public static final String VERSION = "2.3";

	public static int SIZE = 8;
	public Structure[][] components = new Structure[SIZE][];
	public static Structure[] standard = new Structure[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	
	static{
		standard[0]=hl7.pseudo.segment.GOL.CLASS;
		standard[1]=hl7.pseudo.segment.NTE.CLASS;
		standard[2]=hl7.pseudo.segment.VAR.CLASS;
		standard[3]=hl7.pseudo.group.GOAL_ROLE_PPV_PCA.CLASS;
		standard[4]=hl7.pseudo.group.GOAL_PATHWAY_PPV_PCA.CLASS;
		standard[5]=hl7.pseudo.group.GOAL_OBSERVATION_PPV_PCA.CLASS;
		standard[6]=hl7.pseudo.group.PROBLEM_PPV_PCA.CLASS;
		standard[7]=hl7.pseudo.group.ORDER_PPV_PCA.CLASS;
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=true;
		optional[4]=true;
		optional[5]=true;
		optional[6]=true;
		optional[7]=true;
		
		repeatable [0]=false;
		repeatable [1]=false;
		repeatable [2]=false;
		repeatable [3]=true;
		repeatable [4]=true;
		repeatable [5]=true;
		repeatable [6]=true;
		repeatable [7]=true;
	}
	
	@Override
	public Group cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.group.GOAL_PPV_PCA group = new hl7.pseudo.group.GOAL_PPV_PCA();
		group.originalVersion = originalVersion;
		group.setVersion = setVersion;
		return group;
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

	
	public boolean needsNewGroup(String segmentType, Structure[] comps){
		if(comps==null) return true;
		//앱력 Segment의 위치 알아내기
		int stdIndex = indexStandard(segmentType);
		
		//현재 components의 마지막 객체 저장 위치 알아내기
		int compIndex = -1;
		for(int i=0; i<comps.length; i++){
			if(comps[i]!=null) compIndex = i;
		}
		
		//입력 Segment의 위치가 components 마지막 객체 위치보다 같거나(중복저장) 뒤(추가) 인가?
		return stdIndex>=compIndex;
	}
	
	public int indexStandard(String segmentType){
		int stdIndex = -1;
		for(int i=0; i<standard.length; i++){
			Structure structure = standard[i];
			if(structure instanceof Segment){
				if(segmentType.equals(structure.getType())){
					stdIndex = i;
					break;
				}
			}else if(structure instanceof Group){
				Group group = (Group)structure;
				stdIndex = group.indexStandard(segmentType);
				if(stdIndex>=0) break;
			}
		}
		return stdIndex;
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
				decode(originalVersion, setVersion, VERSION, index, index[1], comps);
			}
		}
	}
	
	public void decode(String originalVersion, String setVersion, String VERSION, int[] index, int prevLength, String[] comps) throws Exception{
		int[] newIndex = new int[]{index[0], 0};
		while(newIndex[1]<standard.length){
			Structure structure = standard[newIndex[1]];
			if(comps.length<=newIndex[0]){
				index[0]=newIndex[0];
				return;
			}
			String comp = comps[newIndex[0]];
			String segmentType = comp.substring(0, 3);
			if(structure instanceof Segment){	//Segment일 때
				String standardType = structure.getType();
				if(segmentType.equals(standardType)){		//표준과 Type이 동일한가?
					Segment segment = ((Segment)structure).cloneClass(originalVersion, setVersion);
					segment.originalVersion(originalVersion);
					segment.decode(comp);
					addStructure(components, segment, newIndex[1]);
					newIndex[0]++;	//다음 comp 처리
				}else{
					newIndex[1]++;	//다음 Segment와 비교
				}
			}else if(structure instanceof Group){
				Group group = (Group)structure;
				int stdIndex = group.indexStandard(segmentType);
				
				if(stdIndex<0){
					newIndex[1]++;
				}else{
					boolean needsNewGroup = group.needsNewGroup(segmentType, components[newIndex[1]]); 
					if(needsNewGroup){
						Group newGroup = group.cloneClass(originalVersion, setVersion);
						newGroup.originalVersion(originalVersion);
						newGroup.decode(originalVersion, setVersion, VERSION, newIndex, prevLength, comps);
						addStructure(components, newGroup, newIndex[1]);
						newIndex[0]++;
					}else{
						group.decode(originalVersion, setVersion, VERSION, newIndex, prevLength, comps);
					}
				}
				
			}
		}
		index[0]=newIndex[0];
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
	}
	
	/* -----------------------------------------------------------------
	 * 이후 버전으로 매핑 components:구버전, subComponents:신버전
	 * 구버전 메시지-->신버전 파서(하위호환)
	 * -----------------------------------------------------------------
	 */
	public static void forward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
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
					//}
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
			hl7.model.V2_31.group.GOAL_PPV_PCA type = (hl7.model.V2_31.group.GOAL_PPV_PCA)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return null;
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
