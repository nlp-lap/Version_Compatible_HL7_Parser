package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFD_M03 extends hl7.model.V2_2.message.MFD_M03{
	public MFD_M03(){
		super();
	}

	public static MFD_M03 CLASS;
	static{
		CLASS = new MFD_M03();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

