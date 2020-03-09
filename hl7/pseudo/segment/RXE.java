package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXE extends hl7.model.V2_7.segment.RXE{
	public RXE(){
		super();
	}

	public static RXE CLASS;
	static{
		CLASS = new RXE();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

