package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFR_M01 extends hl7.model.V2_6.message.MFR_M01{
	public MFR_M01(){
		super();
	}

	public static MFR_M01 CLASS;
	static{
		CLASS = new MFR_M01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

