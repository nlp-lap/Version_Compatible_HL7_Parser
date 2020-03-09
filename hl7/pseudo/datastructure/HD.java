package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class HD extends hl7.model.V2_7.datastructure.HD{
	public HD(){
		super();
	}
	
	public static HD CLASS;
	static{
		CLASS = new HD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
