package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LAN extends hl7.model.V2_7.segment.LAN{
	public LAN(){
		super();
	}

	public static LAN CLASS;
	static{
		CLASS = new LAN();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

