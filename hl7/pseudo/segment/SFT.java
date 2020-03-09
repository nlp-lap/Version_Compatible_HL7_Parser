package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SFT extends hl7.model.V2_7.segment.SFT{
	public SFT(){
		super();
	}

	public static SFT CLASS;
	static{
		CLASS = new SFT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

