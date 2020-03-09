package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CTD extends hl7.model.V2_7.segment.CTD{
	public CTD(){
		super();
	}

	public static CTD CLASS;
	static{
		CLASS = new CTD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

