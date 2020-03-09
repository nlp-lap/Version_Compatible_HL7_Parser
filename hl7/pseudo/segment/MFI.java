package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MFI extends hl7.model.V2_7.segment.MFI{
	public MFI(){
		super();
	}

	public static MFI CLASS;
	static{
		CLASS = new MFI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

