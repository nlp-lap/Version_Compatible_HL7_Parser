package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QRF extends hl7.model.V2_6.segment.QRF{
	public QRF(){
		super();
	}

	public static QRF CLASS;
	static{
		CLASS = new QRF();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

