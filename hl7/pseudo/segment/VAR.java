package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class VAR extends hl7.model.V2_7.segment.VAR{
	public VAR(){
		super();
	}

	public static VAR CLASS;
	static{
		CLASS = new VAR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

