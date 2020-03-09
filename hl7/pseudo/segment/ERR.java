package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ERR extends hl7.model.V2_7.segment.ERR{
	public ERR(){
		super();
	}

	public static ERR CLASS;
	static{
		CLASS = new ERR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

