package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class UAC extends hl7.model.V2_7.segment.UAC{
	public UAC(){
		super();
	}

	public static UAC CLASS;
	static{
		CLASS = new UAC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

