package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class GOL extends hl7.model.V2_7.segment.GOL{
	public GOL(){
		super();
	}

	public static GOL CLASS;
	static{
		CLASS = new GOL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

