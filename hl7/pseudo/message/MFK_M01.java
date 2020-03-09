package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFK_M01 extends hl7.model.V2_7.message.MFK_M01{
	public MFK_M01(){
		super();
	}

	public static MFK_M01 CLASS;
	static{
		CLASS = new MFK_M01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

