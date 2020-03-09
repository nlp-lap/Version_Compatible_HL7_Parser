package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SPM extends hl7.model.V2_7.segment.SPM{
	public SPM(){
		super();
	}

	public static SPM CLASS;
	static{
		CLASS = new SPM();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

