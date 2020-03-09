package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ROL extends hl7.model.V2_7.segment.ROL{
	public ROL(){
		super();
	}

	public static ROL CLASS;
	static{
		CLASS = new ROL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

