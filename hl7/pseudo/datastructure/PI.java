package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PI extends hl7.model.V2_4.datastructure.PI{
	public PI(){
		super();
	}
	
	public static PI CLASS;
	static{
		CLASS = new PI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
