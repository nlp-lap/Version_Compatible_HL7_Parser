package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ACC extends hl7.model.V2_7.segment.ACC{
	public ACC(){
		super();
	}

	public static ACC CLASS;
	static{
		CLASS = new ACC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

