package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class VID extends hl7.model.V2_7.datastructure.VID{
	public VID(){
		super();
	}
	
	public static VID CLASS;
	static{
		CLASS = new VID();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
