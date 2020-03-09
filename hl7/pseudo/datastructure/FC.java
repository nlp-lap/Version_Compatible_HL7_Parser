package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class FC extends hl7.model.V2_7.datastructure.FC{
	public FC(){
		super();
	}
	
	public static FC CLASS;
	static{
		CLASS = new FC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
