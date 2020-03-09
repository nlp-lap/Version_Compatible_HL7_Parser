package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PID extends hl7.model.V2_7.segment.PID{
	public PID(){
		super();
	}

	public static PID CLASS;
	static{
		CLASS = new PID();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

