package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ABS extends hl7.model.V2_7.segment.ABS{
	public ABS(){
		super();
	}

	public static ABS CLASS;
	static{
		CLASS = new ABS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

