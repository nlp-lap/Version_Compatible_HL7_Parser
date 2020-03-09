package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ORC extends hl7.model.V2_7.segment.ORC{
	public ORC(){
		super();
	}

	public static ORC CLASS;
	static{
		CLASS = new ORC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

