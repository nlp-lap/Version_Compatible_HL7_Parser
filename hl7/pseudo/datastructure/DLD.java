package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DLD extends hl7.model.V2_7.datastructure.DLD{
	public DLD(){
		super();
	}
	
	public static DLD CLASS;
	static{
		CLASS = new DLD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
