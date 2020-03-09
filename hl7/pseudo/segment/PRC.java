package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PRC extends hl7.model.V2_7.segment.PRC{
	public PRC(){
		super();
	}

	public static PRC CLASS;
	static{
		CLASS = new PRC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

