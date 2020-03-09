package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ARV extends hl7.model.V2_7.segment.ARV{
	public ARV(){
		super();
	}

	public static ARV CLASS;
	static{
		CLASS = new ARV();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

