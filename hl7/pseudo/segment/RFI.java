package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RFI extends hl7.model.V2_7.segment.RFI{
	public RFI(){
		super();
	}

	public static RFI CLASS;
	static{
		CLASS = new RFI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

