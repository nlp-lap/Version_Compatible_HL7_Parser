package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SPS extends hl7.model.V2_6.datastructure.SPS{
	public SPS(){
		super();
	}
	
	public static SPS CLASS;
	static{
		CLASS = new SPS();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
