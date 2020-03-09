package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AIS extends hl7.model.V2_7.segment.AIS{
	public AIS(){
		super();
	}

	public static AIS CLASS;
	static{
		CLASS = new AIS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

