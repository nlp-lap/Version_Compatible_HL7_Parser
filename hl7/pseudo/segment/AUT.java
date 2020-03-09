package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AUT extends hl7.model.V2_7.segment.AUT{
	public AUT(){
		super();
	}

	public static AUT CLASS;
	static{
		CLASS = new AUT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

