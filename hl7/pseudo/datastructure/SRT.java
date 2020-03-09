package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SRT extends hl7.model.V2_7.datastructure.SRT{
	public SRT(){
		super();
	}
	
	public static SRT CLASS;
	static{
		CLASS = new SRT();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
