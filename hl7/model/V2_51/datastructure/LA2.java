package hl7.model.V2_51.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class LA2 extends hl7.model.V2_5.datastructure.LA2{
	public static final String VERSION = "2.5.1";
	public static final String POINT_OF_CARE = "Point of Care";
	public static final String ROOM = "Room";
	public static final String BED = "Bed";
	public static final String FACILITY = "Facility";
	public static final String LOCATION_STATUS = "Location Status";
	public static final String PATIENT_LOCATION_TYPE = "Patient Location Type";
	public static final String BUILDING = "Building";
	public static final String FLOOR = "Floor";
	public static final String STREET_ADDRESS = "Street Address";
	public static final String OTHER_DESIGNATION = "Other Designation";
	public static final String CITY = "City";
	public static final String STATE_OR_PROVINCE = "State or Province";
	public static final String ZIP_OR_POSTAL_CODE = "Zip or Postal Code";
	public static final String COUNTRY = "Country";
	public static final String ADDRESS_TYPE = "Address Type";
	public static final String OTHER_GEOGRAPHIC_DESIGNATION = "Other Geographic Designation";
	
	public static int SIZE = 16;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[3]=hl7.pseudo.datastructure.HD.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.ST.CLASS;
		
		tables[0]=hl7.model.V2_51.table.Table0302.getInstance();
		tables[1]=hl7.model.V2_51.table.Table0303.getInstance();
		tables[2]=hl7.model.V2_51.table.Table0304.getInstance();
		tables[3]=null;
		tables[4]=hl7.model.V2_51.table.Table0306.getInstance();
		tables[5]=hl7.model.V2_51.table.Table0305.getInstance();
		tables[6]=hl7.model.V2_51.table.Table0307.getInstance();
		tables[7]=hl7.model.V2_51.table.Table0308.getInstance();
		tables[8]=null;
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		tables[12]=null;
		tables[13]=hl7.model.V2_51.table.Table0399.getInstance();
		tables[14]=hl7.model.V2_51.table.Table0190.getInstance();
		tables[15]=null;
		
		descriptions[0]=POINT_OF_CARE;
		descriptions[1]=ROOM;
		descriptions[2]=BED;
		descriptions[3]=FACILITY;
		descriptions[4]=LOCATION_STATUS;
		descriptions[5]=PATIENT_LOCATION_TYPE;
		descriptions[6]=BUILDING;
		descriptions[7]=FLOOR;
		descriptions[8]=STREET_ADDRESS;
		descriptions[9]=OTHER_DESIGNATION;
		descriptions[10]=CITY;
		descriptions[11]=STATE_OR_PROVINCE;
		descriptions[12]=ZIP_OR_POSTAL_CODE;
		descriptions[13]=COUNTRY;
		descriptions[14]=ADDRESS_TYPE;
		descriptions[15]=OTHER_GEOGRAPHIC_DESIGNATION;

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
		
		length[0]=20;
		length[1]=20;
		length[2]=20;
		length[3]=227;
		length[4]=20;
		length[5]=20;
		length[6]=20;
		length[7]=20;
		length[8]=120;
		length[9]=120;
		length[10]=50;
		length[11]=50;
		length[12]=12;
		length[13]=3;
		length[14]=3;
		length[15]=50;
	}
	
	public LA2(){
		type = DataStructure.LA2;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.LA2 data = new hl7.pseudo.datastructure.LA2();
		data.originalVersion = originalVersion;
		data.setVersion = setVersion;
		return data;
	}
	
	public void depth(int depth) {
		super.depth(depth);
		this.depth = depth; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.depth(depth+1);
		}
	}
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.setVersion(setVersion);
		}
	}
	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.originalVersion(originalVersion);
		}
	}
	public DataStructure[] getComponents(){
		if(setVersion.equals(VERSION)){
			return components;
		}else{
			return super.getComponents();
		}
	}
	
	private boolean compiled = false;	//���� ������ ���� Ȯ��
	public void decode(String message) throws Exception {
		originalComponent = message;
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//���� ������ ���� Ȯ��
			
			char separator = (depth<1)?MessageStructure.COMPONENT_SEPARATOR:MessageStructure.SUBCOMPONENT_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		
			for(int i=0; i<components.length&&comps!=null&&i<comps.length; i++){
				components[i] = standard[i].cloneClass(originalVersion, setVersion);
				components[i].originalVersion(originalVersion);
				components[i].depth(depth+1);
				components[i].decode(comps[i]);
			}
		}
	}
	


	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[] components, DataStructure[] subComponents, String originalVersion, String setVersion, String prevVersion, int depth) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			if(i==0) components[i] = subComponents[i];
			if(i==1) components[i] = subComponents[i];
			if(i==2) components[i] = subComponents[i];
			if(i==3) components[i] = subComponents[i];
			if(i==4) components[i] = subComponents[i];
			if(i==5) components[i] = subComponents[i];
			if(i==6) components[i] = subComponents[i];
			if(i==7) components[i] = subComponents[i];
			if(i==8) components[i] = subComponents[i];
			if(i==9) components[i] = subComponents[i];
			if(i==10) components[i] = subComponents[i];
			if(i==11) components[i] = subComponents[i];
			if(i==12) components[i] = subComponents[i];
			if(i==13) components[i] = subComponents[i];
			if(i==14) components[i] = subComponents[i];
			if(i==15) components[i] = subComponents[i];
			if(components[i]==null) continue;
			components[i].depth(subComponents[i].depth);
			subComponents[i].setVersion(prevVersion);
			String data = subComponents[i].encode();
			components[i].decode(data);
		}
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[] components, DataStructure[] subComponents, String originalVersion, String setVersion, int depth) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			if(i==0) subComponents[i] = components[i];
			if(i==1) subComponents[i] = components[i];
			if(i==2) subComponents[i] = components[i];
			if(i==3) subComponents[i] = components[i];
			if(i==4) subComponents[i] = components[i];
			if(i==5) subComponents[i] = components[i];
			if(i==6) subComponents[i] = components[i];
			if(i==7) subComponents[i] = components[i];
			if(i==8) subComponents[i] = components[i];
			if(i==9) subComponents[i] = components[i];
			if(i==10) subComponents[i] = components[i];
			if(i==11) subComponents[i] = components[i];
			if(i==12) subComponents[i] = components[i];
			if(i==13) subComponents[i] = components[i];
			if(i==14) subComponents[i] = components[i];
			if(i==15) subComponents[i] = components[i];
			if(components[i]==null) continue;
			subComponents[i].depth(components[i].depth);
			components[i].setVersion(originalVersion);
			String data = components[i].encode();
			subComponents[i].decode(data);
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(DataStructure[] subComponents) throws Exception{
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
						hl7.model.V2_5.datastructure.LA2 type = (hl7.model.V2_5.datastructure.LA2)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION, depth);
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
			hl7.model.V2_6.datastructure.LA2 type = (hl7.model.V2_6.datastructure.LA2)this;
			type.forward(this.components, type.components, originalVersion, setVersion, depth);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}

	public String makeMessage(DataStructure[] components, String version) throws Exception{
		if(VERSION.equals(version)){
			String message = "";

			boolean add = false;	//���ʿ��� ������Ʈ�� ������ �� true
			String component = "";
			DataStructure exDS = null;
			for(int i=0; i<components.length; i++){
				if(components[i]!=null) exDS = components[i];
			}
			if(exDS==null) return null;
			char separator = (exDS.depth<=1)?MessageStructure.COMPONENT_SEPARATOR:MessageStructure.SUBCOMPONENT_SEPARATOR;;
			for(int i=components.length-1; i>=0; i--){
				DataStructure comp = components[i];
				if(comp!=null || required[i]) add=true;	//�ʼ��׸���� �߰�
				
				if(add&&component.length()>0) component = separator + component;
				if(comp==null) continue;
			
				String data = comp.encode();
				if(length[i]>0&&data!=null&&data.length()>length[i]) data=data.substring(0, length[i]);
				component = ((data==null)?"":data) + component;
			}
			
			if(message.length()>0) message+=MessageStructure.REPEATITION_SEPARATOR;
			message+=component;
			return (message.length()==0)?null:message;
			
		}else{
			return super.makeMessage(components, version);
		}
	}

}