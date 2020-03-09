package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class FAC extends hl7.model.V2_7.segment.FAC{
	public FAC(){
		super();
	}

	public static FAC CLASS;
	static{
		CLASS = new FAC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

