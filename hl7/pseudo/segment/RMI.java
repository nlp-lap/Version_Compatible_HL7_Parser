package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RMI extends hl7.model.V2_7.segment.RMI{
	public RMI(){
		super();
	}

	public static RMI CLASS;
	static{
		CLASS = new RMI();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

