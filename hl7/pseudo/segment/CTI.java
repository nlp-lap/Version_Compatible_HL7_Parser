package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CTI extends hl7.model.V2_7.segment.CTI{
	public CTI(){
		super();
	}

	public static CTI CLASS;
	static{
		CLASS = new CTI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

