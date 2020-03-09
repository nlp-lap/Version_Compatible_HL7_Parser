﻿# Version_Compatible_HL7_Parser

Version-Compatible HL7 Parser

International standards for the exchange of healthcare information, known as Health Level Seven (HL7), were developed for the interoperability of healthcare information systems. Because of HL7’s complex structure and syntax, HL7 messages are processed by computer software. HL7 defines that, when the version is updated, it should be compatible with the previous version. However, most of the HL7 interface software that is currently in development does not consider the version compatibility of HL7 messages. Instead, a separate conversion software module has been used to handle the version compatibility of HL7 messages for the healthcare information system. However, such a method is inefficient, because it requires several hours and incurs a huge cost. Therefore, in this study, an HL7 parser was developed that not only supports backward compatibility with older versions in accordance with the version compatibility definition of the HL7 V2 messages, but also guarantees forward compatibility with newer versions to enhance its utilization. The developed parser was used to test conversion between different versions of HL7 V2 messages, which were created to transmit information from one healthcare device to another.
