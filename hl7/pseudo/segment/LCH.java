package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LCH extends hl7.model.V2_7.segment.LCH{
	public LCH(){
		super();
	}

	public static LCH CLASS;
	static{
		CLASS = new LCH();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

