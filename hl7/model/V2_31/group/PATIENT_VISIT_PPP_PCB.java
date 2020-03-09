package hl7.model.V2_31.group;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class PATIENT_VISIT_PPP_PCB extends hl7.model.V2_3.group.PATIENT_VISIT_PPP_PCB{
	public static final String VERSION = "2.3.1";

	public static int SIZE = 2;
	public Structure[][] components = new Structure[SIZE][];
	public static Structure[] standard = new Structure[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	
	static{
		standard[0]=hl7.pseudo.segment.PV1.CLASS;
		standard[1]=hl7.pseudo.segment.PV2.CLASS;
		
		optional[0]=false;
		optional[1]=false;
		
		repeatable [0]=false;
		repeatable [1]=false;
	}
	
	@Override
	public Group cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.group.PATIENT_VISIT_PPP_PCB group = new hl7.pseudo.group.PATIENT_VISIT_PPP_PCB();
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
		//�۷� Segment�� ��ġ �˾Ƴ���
		int stdIndex = indexStandard(segmentType);
		
		//���� components�� ������ ��ü ���� ��ġ �˾Ƴ���
		int compIndex = -1;
		for(int i=0; i<comps.length; i++){
			if(comps[i]!=null) compIndex = i;
		}
		
		//�Է� Segment�� ��ġ�� components ������ ��ü ��ġ���� ���ų�(�ߺ�����) ��(�߰�) �ΰ�?
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
	
	private boolean compiled = false;	//���� ������ ���� Ȯ��
	public void decode(String message) throws Exception {
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//���� ������ ���� Ȯ��
			
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
			if(structure instanceof Segment){	//Segment�� ��
				String standardType = structure.getType();
				if(segmentType.equals(standardType)){		//ǥ�ذ� Type�� �����Ѱ�?
					Segment segment = ((Segment)structure).cloneClass(originalVersion, setVersion);
					segment.originalVersion(originalVersion);
					segment.decode(comp);
					addStructure(components, segment, newIndex[1]);
					newIndex[0]++;	//���� comp ó��
				}else{
					newIndex[1]++;	//���� Segment�� ��
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
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void backward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
		components[0] = subComponents[0];
		components[1] = subComponents[1];
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
		subComponents[0] = components[0];
		subComponents[1] = components[1];
	}
	
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(Structure[][] subComponents) throws Exception{
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
						hl7.model.V2_3.group.PATIENT_VISIT_PPP_PCB type = (hl7.model.V2_3.group.PATIENT_VISIT_PPP_PCB)this;
						type.backward(type.components, components, originalVersion, setVersion);
					//}
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
			hl7.model.V2_4.group.PATIENT_VISIT_PPP_PCB type = (hl7.model.V2_4.group.PATIENT_VISIT_PPP_PCB)this;
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
