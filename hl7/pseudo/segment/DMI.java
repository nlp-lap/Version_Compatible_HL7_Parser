package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DMI extends hl7.model.V2_7.segment.DMI{
	public DMI(){
		super();
	}

	public static DMI CLASS;
	static{
		CLASS = new DMI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

