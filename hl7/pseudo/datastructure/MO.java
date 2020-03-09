package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class MO extends hl7.model.V2_7.datastructure.MO{
	public MO(){
		super();
	}
	
	public static MO CLASS;
	static{
		CLASS = new MO();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
