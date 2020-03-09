package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFD_M01 extends hl7.model.V2_2.message.MFD_M01{
	public MFD_M01(){
		super();
	}

	public static MFD_M01 CLASS;
	static{
		CLASS = new MFD_M01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

