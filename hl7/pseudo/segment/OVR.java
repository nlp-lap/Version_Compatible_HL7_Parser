package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OVR extends hl7.model.V2_7.segment.OVR{
	public OVR(){
		super();
	}

	public static OVR CLASS;
	static{
		CLASS = new OVR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

