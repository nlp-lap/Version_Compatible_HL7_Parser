package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class INV extends hl7.model.V2_7.segment.INV{
	public INV(){
		super();
	}

	public static INV CLASS;
	static{
		CLASS = new INV();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

