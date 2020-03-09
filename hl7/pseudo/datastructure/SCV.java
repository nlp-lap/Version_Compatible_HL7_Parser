package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SCV extends hl7.model.V2_7.datastructure.SCV{
	public SCV(){
		super();
	}
	
	public static SCV CLASS;
	static{
		CLASS = new SCV();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
