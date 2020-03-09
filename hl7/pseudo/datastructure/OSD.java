package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class OSD extends hl7.model.V2_6.datastructure.OSD{
	public OSD(){
		super();
	}
	
	public static OSD CLASS;
	static{
		CLASS = new OSD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
