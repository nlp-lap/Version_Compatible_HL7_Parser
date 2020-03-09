package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SN extends hl7.model.V2_7.datastructure.SN{
	public SN(){
		super();
	}
	
	public static SN CLASS;
	static{
		CLASS = new SN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
