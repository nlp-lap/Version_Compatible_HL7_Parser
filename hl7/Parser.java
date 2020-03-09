package hl7;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import builder.util.Util;

public class Parser {
	public static void main(String[] args) throws Exception{
		new Parser();
	}
	
	public Parser() throws Exception{
		MessageStructure.FIELD_SEPARATOR = '|';
		MessageStructure.COMPONENT_SEPARATOR = '^';
		MessageStructure.REPEATITION_SEPARATOR = '~';
		MessageStructure.ESCAPE_SEPARATOR = '\\';
		MessageStructure.SUBCOMPONENT_SEPARATOR = '&';
//		testDataStructure();
//		testSegment();
		testMessage();
	}
	
//	public hl7.bean.message.MessageStructure decode(String message) throws Exception{
//		hl7.model.pseudo.message.ADT_A01 msg = new hl7.model.pseudo.message.ADT_A01();
//		msg.decode(message);
//		return msg;
//	}
	
	private void testMessage() throws Exception{
		String file = "./message/ORU_R01_27.hl7";
//		String file = "./message/ADT_A01_27 GROUP.hl7";
		String message = Util.load(file);
		System.out.println(message);
		
		hl7.pseudo.message.ORU_R01 msg = new hl7.pseudo.message.ORU_R01();
//		hl7.pseudo.message.ADT_A01 msg = new hl7.pseudo.message.ADT_A01();
		msg.originalVersion("2.7");
		msg.setVersion(msg.originalVersion);
		System.out.println("시작=====");
		msg.decode(message);

		
		System.out.println();
		msg.setVersion("2.6");
		System.out.println("인코딩 ======== "+msg.setVersion);
		System.out.println(msg.encode());
	}
	
	
	private void testSegment() throws Exception{
//		String message = "MSH|^~＼&|MegaReg|UABHospC|ImOrdMgr|UABImgCtr|20010529090131-0500||ADT^A01^ADT_A01|01052901|P|2.5";
//		hl7.model.pseudo.segment.MSH segment = new hl7.model.pseudo.segment.MSH();
//		String message = "MSH|^~\\&|Gateway|BIT|SeniCare|MIPTH|20120209181400||ORU_R01|20120209181400-0|P|2.5";
//		hl7.model.pseudo.segment.MSH segment = new hl7.model.pseudo.segment.MSH();
//		String message = "PID|||56782445^^^UAReg^PI~999855750^^^USSA^SS|AA~BB|AA~BB|19620910|M~M||C|260 GOODWIN CREST DTRIVE^^BIRMINGHAM^AL^35209^^H|||||||0105I30001";
//		hl7.pseudo.segment.PID segment = new hl7.pseudo.segment.PID();
//		String message = "OBR||1|1|10210-3^PHYSICAL FINDINGS^LN||20120206121848|20120206121848";
//		hl7.model.pseudo.segment.OBR segment = new hl7.model.pseudo.segment.OBR();
		String message = "OBX|3|NM|41982-0^BODY FAT PERCENTAGE:MFR^LN||20.0|%|10.0-20.0||||F";
		hl7.pseudo.segment.OBX segment = new hl7.pseudo.segment.OBX();
//		String message = "EVN|A01|200105290900~200105290901||||200105290900";
//		hl7.model.pseudo.segment.EVN segment = new hl7.model.pseudo.segment.EVN();
//		String message = "PV1||I|W^389^1^UABH^^^^3||||12345^MORGAN^REX^J^^^MD^^^UAMC^L||67890^GRAINGER^LUCY^X^^^MD^^^UAMC^L|MED|||||A0||13579^POTTER^SHERMAN^T^^^MD^^^UAMC^L";
//		hl7.pseudo.segment.PV1 segment = new hl7.pseudo.segment.PV1();
//		String message = "AL1|1|DA|ASP^ASPRIN^99L0C2|M0|GI DISTRESS";
//		hl7.pseudo.segment.AL1 segment = new hl7.pseudo.segment.AL1();

		String version = "2.7";
		System.out.println("디코딩 ======== "+version);
		segment.originalVersion(version);
		segment.setVersion(segment.originalVersion);
		segment.decode(message);
		System.out.println(segment.encode()+"\n");

		version = "2.5";
		System.out.println("인코딩 ======== "+version);
		segment.setVersion(version);
		System.out.println(segment.encode());
//		
//		version = "2.4";
//		System.out.println("인코딩 ======== "+version);
//		segment.setVersion(version);
//		System.out.println(segment.encode());
//		
//		version = "2.5";
//		System.out.println("인코딩 ======== "+version);
//		segment.setVersion(version);
//		System.out.println(segment.encode());
//		
//		version = "2.5.1";
//		System.out.println("인코딩 ======== "+version);
//		segment.setVersion(version);
//		System.out.println(segment.encode());
		
//		version = "2.7";
//		System.out.println("인코딩 ======== "+version);
//		segment.setVersion(version);
//		System.out.println(segment.encode());
	}
	
	
	private void testDataStructure() throws Exception{
//		String message = "A1^B1^C1~A2^B2^C2";
//		hl7.model.pseudo.datastructure.CE type = new hl7.model.pseudo.datastructure.CE();
		
		String message = "12345^MORGAN^REX^J^^^MD^^^UAMC^L";
		hl7.pseudo.datastructure.HD type = new hl7.pseudo.datastructure.HD();
		
		System.out.println("디코딩 ======== ");
		System.out.println(message);
		type.originalVersion = "2.5";
		type.setVersion(type.originalVersion);
		type.decode(message);
		
		System.out.println("인코딩 ======== ");
		type.setVersion("2.7");
		System.out.println(type.encode());
		
		DataStructure[] comps = type.components;
		for(int i=0; i<comps.length; i++){
			System.out.println(comps[i].encode());
		}
	}
}
