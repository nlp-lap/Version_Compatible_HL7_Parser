package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class VR extends hl7.model.V2_7.datastructure.VR{
	public VR(){
		super();
	}
	
	public static VR CLASS;
	static{
		CLASS = new VR();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
