package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ITM extends hl7.model.V2_7.segment.ITM{
	public ITM(){
		super();
	}

	public static ITM CLASS;
	static{
		CLASS = new ITM();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

