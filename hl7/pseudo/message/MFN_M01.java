package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFN_M01 extends hl7.model.V2_6.message.MFN_M01{
	public MFN_M01(){
		super();
	}

	public static MFN_M01 CLASS;
	static{
		CLASS = new MFN_M01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

