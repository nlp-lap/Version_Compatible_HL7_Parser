package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SHP extends hl7.model.V2_7.segment.SHP{
	public SHP(){
		super();
	}

	public static SHP CLASS;
	static{
		CLASS = new SHP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

