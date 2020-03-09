package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class MA extends hl7.model.V2_7.datastructure.MA{
	public MA(){
		super();
	}
	
	public static MA CLASS;
	static{
		CLASS = new MA();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
