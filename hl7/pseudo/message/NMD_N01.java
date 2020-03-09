package hl7.pseudo.message;

import hl7.bean.Structure;

public class NMD_N01 extends hl7.model.V2_2.message.NMD_N01{
	public NMD_N01(){
		super();
	}

	public static NMD_N01 CLASS;
	static{
		CLASS = new NMD_N01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

