package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ODT extends hl7.model.V2_7.segment.ODT{
	public ODT(){
		super();
	}

	public static ODT CLASS;
	static{
		CLASS = new ODT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

