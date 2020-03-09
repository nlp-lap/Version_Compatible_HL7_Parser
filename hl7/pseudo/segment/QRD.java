package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QRD extends hl7.model.V2_6.segment.QRD{
	public QRD(){
		super();
	}

	public static QRD CLASS;
	static{
		CLASS = new QRD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

