package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CDM extends hl7.model.V2_7.segment.CDM{
	public CDM(){
		super();
	}

	public static CDM CLASS;
	static{
		CLASS = new CDM();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

