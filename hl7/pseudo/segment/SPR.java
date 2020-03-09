package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SPR extends hl7.model.V2_51.segment.SPR{
	public SPR(){
		super();
	}

	public static SPR CLASS;
	static{
		CLASS = new SPR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

