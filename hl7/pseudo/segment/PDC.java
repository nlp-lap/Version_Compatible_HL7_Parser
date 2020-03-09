package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PDC extends hl7.model.V2_7.segment.PDC{
	public PDC(){
		super();
	}

	public static PDC CLASS;
	static{
		CLASS = new PDC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

