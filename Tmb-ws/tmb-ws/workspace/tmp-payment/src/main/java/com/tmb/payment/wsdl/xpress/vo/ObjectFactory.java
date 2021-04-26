
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ifxforum.xsd._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MediaCashData_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaCashData");
    private final static QName _AcctTrnInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnInfo");
    private final static QName _AcctStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStatusRec");
    private final static QName _PartyCardRelSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyCardRelSel");
    private final static QName _StopChkInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "StopChkInfo");
    private final static QName _StopChkSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "StopChkSel");
    private final static QName _StopChkKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "StopChkKeys");
    private final static QName _StopChkStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "StopChkStatus");
    private final static QName _ExchangeRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchangeRate");
    private final static QName _ChkIssueInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueInfo");
    private final static QName _ChkImgData_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkImgData");
    private final static QName _AcctTrnEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnEnvr");
    private final static QName _CreditInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditInfo");
    private final static QName _PersonData_QNAME = new QName("urn:ifxforum-org:XSD:1", "PersonData");
    private final static QName _MediaBal_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaBal");
    private final static QName _SecTokenLogin_QNAME = new QName("urn:ifxforum-org:XSD:1", "SecTokenLogin");
    private final static QName _FinancialData_QNAME = new QName("urn:ifxforum-org:XSD:1", "FinancialData");
    private final static QName _Contact_QNAME = new QName("urn:ifxforum-org:XSD:1", "Contact");
    private final static QName _SecTokenSecretAnswer_QNAME = new QName("urn:ifxforum-org:XSD:1", "SecTokenSecretAnswer");
    private final static QName _OrgPartyInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "OrgPartyInfo");
    private final static QName _OrgCategoryCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "OrgCategoryCode");
    private final static QName _IntRateData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntRateData");
    private final static QName _IntDistAcctRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntDistAcctRef");
    private final static QName _ChkDetail_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkDetail");
    private final static QName _CreditAcctData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAcctData");
    private final static QName _FromAcctRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "FromAcctRef");
    private final static QName _PartyPref_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyPref");
    private final static QName _PersonName_QNAME = new QName("urn:ifxforum-org:XSD:1", "PersonName");
    private final static QName _Employment_QNAME = new QName("urn:ifxforum-org:XSD:1", "Employment");
    private final static QName _PartyKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyKeys");
    private final static QName _PartyPartyRelKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelKeys");
    private final static QName _CardKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardKeys");
    private final static QName _PartyAcctRelKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelKeys");
    private final static QName _AcctKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctKeys");
    private final static QName _AcctTrnSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnSel");
    private final static QName _RelPartyRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "RelPartyRef");
    private final static QName _CardAcctRelRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelRec");
    private final static QName _CardAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAuth");
    private final static QName _CardStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardStatus");
    private final static QName _CardInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardInfo");
    private final static QName _PartyPartyRelInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelInfo");
    private final static QName _AcctTaxData_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTaxData");
    private final static QName _ForExRateSheetInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetInfo");
    private final static QName _XferInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "XferInfo");
    private final static QName _XferKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "XferKeys");
    private final static QName _ForExRateSheetCurRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetCurRate");
    private final static QName _CredentialsRqHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CredentialsRqHdr");
    private final static QName _MsgRqHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "MsgRqHdr");
    private final static QName _MsgRsHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "MsgRsHdr");
    private final static QName _CredentialsRsHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CredentialsRsHdr");
    private final static QName _SecTokenCard_QNAME = new QName("urn:ifxforum-org:XSD:1", "SecTokenCard");
    private final static QName _PartyPartyRelSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelSel");
    private final static QName _CurAmtRange_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurAmtRange");
    private final static QName _DtRange_QNAME = new QName("urn:ifxforum-org:XSD:1", "DtRange");
    private final static QName _PartyAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAuth");
    private final static QName _ContextRqHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContextRqHdr");
    private final static QName _ContextRsHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContextRsHdr");
    private final static QName _Interface_QNAME = new QName("urn:ifxforum-org:XSD:1", "Interface");
    private final static QName _NetworkTrnData_QNAME = new QName("urn:ifxforum-org:XSD:1", "NetworkTrnData");
    private final static QName _AnnualIncome_QNAME = new QName("urn:ifxforum-org:XSD:1", "AnnualIncome");
    private final static QName _AdditionalStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "AdditionalStatus");
    private final static QName _RqUID_QNAME = new QName("urn:ifxforum-org:XSD:1", "RqUID");
    private final static QName _PostAddr_QNAME = new QName("urn:ifxforum-org:XSD:1", "PostAddr");
    private final static QName _IssuedIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuedIdent");
    private final static QName _IntDispData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntDispData");
    private final static QName _PartyAcctRelData_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelData");
    private final static QName _USATaxIdCert_QNAME = new QName("urn:ifxforum-org:XSD:1", "USA.TaxIdCert");
    private final static QName _PartySel_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartySel");
    private final static QName _PersonPartyInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "PersonPartyInfo");
    private final static QName _PartyInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyInfo");
    private final static QName _AcctInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctInfo");
    private final static QName _AcctStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStatus");
    private final static QName _PartyAcctRelInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelInfo");
    private final static QName _PartyAcctRelRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelRec");
    private final static QName _PartyAcctRelSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelSel");
    private final static QName _RecXferInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecXferInfo");
    private final static QName _RecXferKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecXferKeys");
    private final static QName _PhoneNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "PhoneNum");
    private final static QName _CreditMediaChkData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditMediaChkData");
    private final static QName _DepAcctData_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAcctData");
    private final static QName _RecurrenceRule_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecurrenceRule");
    private final static QName _RecurRule_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecurRule");
    private final static QName _ChkData_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkData");
    private final static QName _MediaAcctSummary_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctSummary");
    private final static QName _AcctRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctRec");
    private final static QName _AcctTrnRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnRec");
    private final static QName _PartyRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyRec");
    private final static QName _PartyIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyIdent");
    private final static QName _PartyPartyRelRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelRec");
    private final static QName _RecXferRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecXferRec");
    private final static QName _StopChkRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "StopChkRec");
    private final static QName _CardRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardRec");
    private final static QName _XferRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "XferRec");
    private final static QName _MediaAcctStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctStatusRec");
    private final static QName _MediaAcctRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctRec");
    private final static QName _PartyCardRelRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyCardRelRec");
    private final static QName _PartyAuthRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyAuthRec");
    private final static QName _ForExRateSheetRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetRec");
    private final static QName _AlertInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "AlertInfo");
    private final static QName _AlertKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AlertKeys");
    private final static QName _AlertRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AlertRec");
    private final static QName _AlertAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "AlertAmt");
    private final static QName _PmtInstruction_QNAME = new QName("urn:ifxforum-org:XSD:1", "PmtInstruction");
    private final static QName _PmtRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "PmtRec");
    private final static QName _PmtInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "PmtInfo");
    private final static QName _PmtKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "PmtKeys");
    private final static QName _ForExQuoteRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteRec");
    private final static QName _ChkIssueRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueRec");
    private final static QName _ChkIssueMiscData_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueMiscData");
    private final static QName _ChkIssueKeyData_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueKeyData");
    private final static QName _ChkIssueIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueIdent");
    private final static QName _ChkIssueAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueAuth");
    private final static QName _ForExRateSheetAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetAuth");
    private final static QName _DefaultDrawerInd_QNAME = new QName("urn:ifxforum-org:XSD:1", "DefaultDrawerInd");
    private final static QName _PartyIdentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyIdentType");
    private final static QName _PartyIdentValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "PartyIdentValue");
    private final static QName _RecXferKeyData_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecXferKeyData");
    private final static QName _AcctFromKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctFromKeys");
    private final static QName _AcctToKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctToKeys");
    private final static QName _NotAvailableInd_QNAME = new QName("urn:ifxforum-org:XSD:1", "NotAvailableInd");
    private final static QName _RecXferAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "RecXferAuth");
    private final static QName _XferAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "XferAuth");
    private final static QName _AcceptReqd_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcceptReqd");
    private final static QName _AcctAmtType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctAmtType");
    private final static QName _AcctBal_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctBal");
    private final static QName _AcctCur_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctCur");
    private final static QName _AcctEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctEnvr");
    private final static QName _AcctId_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctId");
    private final static QName _AcctIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctIdent");
    private final static QName _AcctIdentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctIdentType");
    private final static QName _AcctIdentValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctIdentValue");
    private final static QName _AcctKey_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctKey");
    private final static QName _AcctList_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctList");
    private final static QName _AcctMask_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctMask");
    private final static QName _AcctPayAcct_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctPayAcct");
    private final static QName _AcctPayAcctId_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctPayAcctId");
    private final static QName _AcctPeriodData_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctPeriodData");
    private final static QName _AcctPeriodType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctPeriodType");
    private final static QName _AcctRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctRef");
    private final static QName _AcctSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctSel");
    private final static QName _AcctAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctAuth");
    private final static QName _AcctStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStatusCode");
    private final static QName _AcctStmtEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtEnvr");
    private final static QName _AcctStmtId_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtId");
    private final static QName _AcctStmtInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtInfo");
    private final static QName _AcctStmtKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtKeys");
    private final static QName _AcctStmtRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtRec");
    private final static QName _AcctStmtRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtRef");
    private final static QName _AcctStmtSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtSel");
    private final static QName _AcctStmtStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtStatus");
    private final static QName _AcctStmtStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtStatusCode");
    private final static QName _AcctStmtStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctStmtStatusRec");
    private final static QName _AcctTaxType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTaxType");
    private final static QName _AcctTitle_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTitle");
    private final static QName _AcctTrnImgEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgEnvr");
    private final static QName _AcctTrnImgId_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgId");
    private final static QName _AcctTrnImgInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgInfo");
    private final static QName _AcctTrnImgKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgKeys");
    private final static QName _AcctTrnImgRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgRec");
    private final static QName _AcctTrnImgRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgRef");
    private final static QName _AcctTrnImgSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgSel");
    private final static QName _AcctTrnImgStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgStatus");
    private final static QName _AcctTrnImgStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgStatusCode");
    private final static QName _AcctTrnImgStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnImgStatusRec");
    private final static QName _AcctTrnAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnAuth");
    private final static QName _AcctTrnId_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnId");
    private final static QName _AcctTrnKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnKeys");
    private final static QName _AcctTrnLimit_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnLimit");
    private final static QName _AcctTrnRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnRef");
    private final static QName _AcctTrnStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnStatus");
    private final static QName _AcctTrnStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnStatusCode");
    private final static QName _AcctTrnUse_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnUse");
    private final static QName _AcctTrnStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTrnStatusRec");
    private final static QName _AcctType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctType");
    private final static QName _AcctTypeSource_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTypeSource");
    private final static QName _AcctTypeValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctTypeValue");
    private final static QName _AcctUse_QNAME = new QName("urn:ifxforum-org:XSD:1", "AcctUse");
    private final static QName _Addr1_QNAME = new QName("urn:ifxforum-org:XSD:1", "Addr1");
    private final static QName _Addr2_QNAME = new QName("urn:ifxforum-org:XSD:1", "Addr2");
    private final static QName _Addr3_QNAME = new QName("urn:ifxforum-org:XSD:1", "Addr3");
    private final static QName _Addr4_QNAME = new QName("urn:ifxforum-org:XSD:1", "Addr4");
    private final static QName _AddrType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AddrType");
    private final static QName _AdjType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AdjType");
    private final static QName _AffinityName_QNAME = new QName("urn:ifxforum-org:XSD:1", "AffinityName");
    private final static QName _AgentIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "AgentIdent");
    private final static QName _AgentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "AgentType");
    private final static QName _Aging_QNAME = new QName("urn:ifxforum-org:XSD:1", "Aging");
    private final static QName _AllDayEvent_QNAME = new QName("urn:ifxforum-org:XSD:1", "AllDayEvent");
    private final static QName _AllocateAllowed_QNAME = new QName("urn:ifxforum-org:XSD:1", "AllocateAllowed");
    private final static QName _Amt_QNAME = new QName("urn:ifxforum-org:XSD:1", "Amt");
    private final static QName _AppIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "AppIdent");
    private final static QName _AppPan_QNAME = new QName("urn:ifxforum-org:XSD:1", "AppPan");
    private final static QName _AppPanSeq_QNAME = new QName("urn:ifxforum-org:XSD:1", "AppPanSeq");
    private final static QName _ApprovalIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ApprovalIdent");
    private final static QName _ArtWorkIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ArtWorkIdent");
    private final static QName _AsyncRqUID_QNAME = new QName("urn:ifxforum-org:XSD:1", "AsyncRqUID");
    private final static QName _AsyncRsData_QNAME = new QName("urn:ifxforum-org:XSD:1", "AsyncRsData");
    private final static QName _AuthRsCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "AuthRsCode");
    private final static QName _AutoReissue_QNAME = new QName("urn:ifxforum-org:XSD:1", "AutoReissue");
    private final static QName _AutoReplacement_QNAME = new QName("urn:ifxforum-org:XSD:1", "AutoReplacement");
    private final static QName _AvailDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "AvailDt");
    private final static QName _BBAN_QNAME = new QName("urn:ifxforum-org:XSD:1", "BBAN");
    private final static QName _BalAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BalAmt");
    private final static QName _BalType_QNAME = new QName("urn:ifxforum-org:XSD:1", "BalType");
    private final static QName _BalTypeSource_QNAME = new QName("urn:ifxforum-org:XSD:1", "BalTypeSource");
    private final static QName _BalTypeValues_QNAME = new QName("urn:ifxforum-org:XSD:1", "BalTypeValues");
    private final static QName _BankSvcChkSum_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSum");
    private final static QName _BankSvcChkSumEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumEnvr");
    private final static QName _BankSvcChkSumId_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumId");
    private final static QName _BankSvcChkSumInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumInfo");
    private final static QName _BankSvcChkSumKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumKeys");
    private final static QName _BankSvcChkSumRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumRec");
    private final static QName _BankSvcChkSumSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumSel");
    private final static QName _BankSvcChkSumStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumStatus");
    private final static QName _BankSvcChkSumStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumStatusCode");
    private final static QName _BankSvcChkSumStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumStatusRec");
    private final static QName _BankSvcChkSumType_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumType");
    private final static QName _BankSvcChkSumValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "BankSvcChkSumValue");
    private final static QName _BaseAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "BaseAuth");
    private final static QName _BaseCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BaseCurAmt");
    private final static QName _BaseCurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "BaseCurCode");
    private final static QName _BaseKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "BaseKeys");
    private final static QName _BaseEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "BaseEnvr");
    private final static QName _BatchData_QNAME = new QName("urn:ifxforum-org:XSD:1", "BatchData");
    private final static QName _BidOffer_QNAME = new QName("urn:ifxforum-org:XSD:1", "BidOffer");
    private final static QName _BillEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillEnvr");
    private final static QName _BillDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillDt");
    private final static QName _BillId_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillId");
    private final static QName _BillInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillInfo");
    private final static QName _BillKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillKeys");
    private final static QName _BillRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillRec");
    private final static QName _BillRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillRef");
    private final static QName _BillSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSel");
    private final static QName _BillStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillStatus");
    private final static QName _BillStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillStatusCode");
    private final static QName _BillStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillStatusRec");
    private final static QName _BillRefData_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillRefData");
    private final static QName _BillRetAddr_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillRetAddr");
    private final static QName _BillType_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillType");
    private final static QName _BillerContact_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerContact");
    private final static QName _BillerId_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerId");
    private final static QName _BillerKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerKeys");
    private final static QName _BillerNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerNum");
    private final static QName _BillerPayInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerPayInfo");
    private final static QName _BillerPayee_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillerPayee");
    private final static QName _BillingAcct_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillingAcct");
    private final static QName _BillingMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillingMethod");
    private final static QName _BinData_QNAME = new QName("urn:ifxforum-org:XSD:1", "BinData");
    private final static QName _BillStmtData_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillStmtData");
    private final static QName _BillSummAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSummAmt");
    private final static QName _BillSummAmtCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSummAmtCode");
    private final static QName _BillSummAmtIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSummAmtIdent");
    private final static QName _BillSummAmtType_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSummAmtType");
    private final static QName _BillSummSubAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BillSummSubAmt");
    private final static QName _BinLength_QNAME = new QName("urn:ifxforum-org:XSD:1", "BinLength");
    private final static QName _Binary_QNAME = new QName("urn:ifxforum-org:XSD:1", "Binary");
    private final static QName _Binary128_QNAME = new QName("urn:ifxforum-org:XSD:1", "Binary128");
    private final static QName _BirthDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BirthDt");
    private final static QName _BirthPlace_QNAME = new QName("urn:ifxforum-org:XSD:1", "BirthPlace");
    private final static QName _BranchIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "BranchIdent");
    private final static QName _BranchName_QNAME = new QName("urn:ifxforum-org:XSD:1", "BranchName");
    private final static QName _Brand_QNAME = new QName("urn:ifxforum-org:XSD:1", "Brand");
    private final static QName _BuySellIndicator_QNAME = new QName("urn:ifxforum-org:XSD:1", "BuySellIndicator");
    private final static QName _CampaignIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CampaignIdent");
    private final static QName _CLABE_QNAME = new QName("urn:ifxforum-org:XSD:1", "CLABE");
    private final static QName _CSPRefIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CSPRefIdent");
    private final static QName _CSPhoneNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "CSPhoneNum");
    private final static QName _CalException_QNAME = new QName("urn:ifxforum-org:XSD:1", "CalException");
    private final static QName _CardAcctPriority_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctPriority");
    private final static QName _CardAuthRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAuthRec");
    private final static QName _CardAcctRelEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelEnvr");
    private final static QName _CardAcctRelAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelAuth");
    private final static QName _CardAcctRelId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelId");
    private final static QName _CardAcctRelInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelInfo");
    private final static QName _CardAcctRelKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelKeys");
    private final static QName _CardAcctRelRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelRef");
    private final static QName _CardAcctRelSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelSel");
    private final static QName _CardAcctRelStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelStatus");
    private final static QName _CardAcctRelStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelStatusCode");
    private final static QName _CardAcctRelStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardAcctRelStatusRec");
    private final static QName _CardCategory_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardCategory");
    private final static QName _CardChipData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardChipData");
    private final static QName _CardEmbossNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardEmbossNum");
    private final static QName _CardEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardEnvr");
    private final static QName _CardId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardId");
    private final static QName _CardMagData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardMagData");
    private final static QName _CardNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardNum");
    private final static QName _CardPref_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardPref");
    private final static QName _CardPrefTrn_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardPrefTrn");
    private final static QName _CardRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardRef");
    private final static QName _CardSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardSel");
    private final static QName _CardSeqNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardSeqNum");
    private final static QName _CardStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardStatusRec");
    private final static QName _CardStatusAction_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardStatusAction");
    private final static QName _CardStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardStatusCode");
    private final static QName _CardTechnology_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardTechnology");
    private final static QName _CardTrnLimit_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardTrnLimit");
    private final static QName _CardType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardType");
    private final static QName _CardUpdateRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardUpdateRec");
    private final static QName _CardUpdateRsHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardUpdateRsHdr");
    private final static QName _CardVerifyType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardVerifyType");
    private final static QName _CardVrfyData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CardVrfyData");
    private final static QName _CashAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CashAmt");
    private final static QName _CashQuality_QNAME = new QName("urn:ifxforum-org:XSD:1", "CashQuality");
    private final static QName _CashSerialNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "CashSerialNum");
    private final static QName _CashSignature_QNAME = new QName("urn:ifxforum-org:XSD:1", "CashSignature");
    private final static QName _CashValidity_QNAME = new QName("urn:ifxforum-org:XSD:1", "CashValidity");
    private final static QName _Category_QNAME = new QName("urn:ifxforum-org:XSD:1", "Category");
    private final static QName _Certificate_QNAME = new QName("urn:ifxforum-org:XSD:1", "Certificate");
    private final static QName _ChargeRegulation_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChargeRegulation");
    private final static QName _ChkAcceptId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptId");
    private final static QName _ChkAcceptEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptEnvr");
    private final static QName _ChkAcceptInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptInfo");
    private final static QName _ChkAcceptKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptKeys");
    private final static QName _ChkAcceptRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptRec");
    private final static QName _ChkAcceptRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptRef");
    private final static QName _ChkAcceptSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptSel");
    private final static QName _ChkAcceptStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptStatus");
    private final static QName _ChkAcceptStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptStatusCode");
    private final static QName _ChkAcceptStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptStatusRec");
    private final static QName _ChkAcceptType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkAcceptType");
    private final static QName _ChkCourtesyAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkCourtesyAmt");
    private final static QName _ChkBkStyleId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkBkStyleId");
    private final static QName _ChkEnteredAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkEnteredAmt");
    private final static QName _ChkImgBack_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkImgBack");
    private final static QName _ChkImgFront_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkImgFront");
    private final static QName _ChkIssueEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueEnvr");
    private final static QName _ChkIssueId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueId");
    private final static QName _ChkIssueKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueKeys");
    private final static QName _ChkIssueRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueRef");
    private final static QName _ChkIssueSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueSel");
    private final static QName _ChkIssueStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueStatus");
    private final static QName _ChkIssueStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueStatusCode");
    private final static QName _ChkIssueStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkIssueStatusRec");
    private final static QName _ChkNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNum");
    private final static QName _ChkNumPrefix_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNumPrefix");
    private final static QName _ChkNumEnd_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNumEnd");
    private final static QName _ChkNumRange_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNumRange");
    private final static QName _ChkNumStart_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNumStart");
    private final static QName _ChkNumSuffix_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkNumSuffix");
    private final static QName _ChkOrdEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdEnvr");
    private final static QName _ChkOrdId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdId");
    private final static QName _ChkOrdInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdInfo");
    private final static QName _ChkOrdKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdKeys");
    private final static QName _ChkOrdRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdRec");
    private final static QName _ChkOrdRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdRef");
    private final static QName _ChkOrdSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdSel");
    private final static QName _ChkOrdStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdStatus");
    private final static QName _ChkOrdStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdStatusCode");
    private final static QName _ChkOrdStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkOrdStatusRec");
    private final static QName _Chksum_QNAME = new QName("urn:ifxforum-org:XSD:1", "Chksum");
    private final static QName _ChksumEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumEnvr");
    private final static QName _ChksumId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumId");
    private final static QName _ChksumInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumInfo");
    private final static QName _ChksumKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumKeys");
    private final static QName _ChksumRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumRec");
    private final static QName _ChksumRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumRef");
    private final static QName _ChksumSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumSel");
    private final static QName _ChksumStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumStatus");
    private final static QName _ChksumStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumStatusCode");
    private final static QName _ChksumStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumStatusRec");
    private final static QName _ChksumType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumType");
    private final static QName _ChksumValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChksumValue");
    private final static QName _ChkPrint_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkPrint");
    private final static QName _ChkText_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkText");
    private final static QName _ChkURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "ChkURL");
    private final static QName _City_QNAME = new QName("urn:ifxforum-org:XSD:1", "City");
    private final static QName _ClearingLangCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClearingLangCode");
    private final static QName _ClientApp_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientApp");
    private final static QName _ClientBusinessDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientBusinessDt");
    private final static QName _ClientChgCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientChgCode");
    private final static QName _ClientCreateDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientCreateDt");
    private final static QName _ClientDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientDt");
    private final static QName _ClientTerminalSeqNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClientTerminalSeqNum");
    private final static QName _CloseDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CloseDt");
    private final static QName _ClosedDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClosedDt");
    private final static QName _ClubAcctIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ClubAcctIdent");
    private final static QName _CollateralDesc_QNAME = new QName("urn:ifxforum-org:XSD:1", "CollateralDesc");
    private final static QName _CollatingSequence_QNAME = new QName("urn:ifxforum-org:XSD:1", "CollatingSequence");
    private final static QName _CompRemitStmtEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtEnvr");
    private final static QName _CompRemitStmtId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtId");
    private final static QName _CompRemitStmtInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtInfo");
    private final static QName _CompRemitStmtKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtKeys");
    private final static QName _CompRemitStmtRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtRec");
    private final static QName _CompRemitStmtRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtRef");
    private final static QName _CompRemitStmtSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtSel");
    private final static QName _CompRemitStmtStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtStatus");
    private final static QName _CompRemitStmtStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtStatusCode");
    private final static QName _CompRemitStmtStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompRemitStmtStatusRec");
    private final static QName _CompositeCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompositeCurAmt");
    private final static QName _CompositeCurAmtIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompositeCurAmtIdent");
    private final static QName _CompositeCurAmtType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CompositeCurAmtType");
    private final static QName _ContactName_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContactName");
    private final static QName _ContactType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContactType");
    private final static QName _ContentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContentType");
    private final static QName _ContraCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContraCurAmt");
    private final static QName _ContraCurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ContraCurCode");
    private final static QName _CorrectAction_QNAME = new QName("urn:ifxforum-org:XSD:1", "CorrectAction");
    private final static QName _CorrespondenceIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CorrespondenceIdent");
    private final static QName _Count_QNAME = new QName("urn:ifxforum-org:XSD:1", "Count");
    private final static QName _CounterpartyData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CounterpartyData");
    private final static QName _CountryCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CountryCode");
    private final static QName _CountryCodeSource_QNAME = new QName("urn:ifxforum-org:XSD:1", "CountryCodeSource");
    private final static QName _CountryCodeValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "CountryCodeValue");
    private final static QName _CountyDistrict_QNAME = new QName("urn:ifxforum-org:XSD:1", "CountyDistrict");
    private final static QName _CoverMngrm_QNAME = new QName("urn:ifxforum-org:XSD:1", "CoverMngrm");
    private final static QName _CoverStyleIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CoverStyleIdent");
    private final static QName _CreateRefIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreateRefIdent");
    private final static QName _CreatedDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreatedDt");
    private final static QName _CreditAthEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthEnvr");
    private final static QName _CreditAthId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthId");
    private final static QName _CreditAthInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthInfo");
    private final static QName _CreditAthKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthKeys");
    private final static QName _CreditAthRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthRec");
    private final static QName _CreditAthRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthRef");
    private final static QName _CreditAthSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthSel");
    private final static QName _CreditAthStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthStatus");
    private final static QName _CreditAthStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthStatusRec");
    private final static QName _CreditAthType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAthType");
    private final static QName _CreditAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditAuth");
    private final static QName _CreditEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditEnvr");
    private final static QName _CreditHeldAmtExpDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditHeldAmtExpDt");
    private final static QName _CreditId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditId");
    private final static QName _CreditKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditKeys");
    private final static QName _CreditMediaCashData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditMediaCashData");
    private final static QName _CreditMediaItem_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditMediaItem");
    private final static QName _CreditMediaItemIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditMediaItemIdent");
    private final static QName _CreditRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditRec");
    private final static QName _CreditRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditRef");
    private final static QName _CreditSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditSel");
    private final static QName _CreditStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditStatus");
    private final static QName _CreditStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditStatusCode");
    private final static QName _CreditStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditStatusRec");
    private final static QName _CreditStmtData_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditStmtData");
    private final static QName _CreditType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CreditType");
    private final static QName _CryptPswd_QNAME = new QName("urn:ifxforum-org:XSD:1", "CryptPswd");
    private final static QName _CryptSecret_QNAME = new QName("urn:ifxforum-org:XSD:1", "CryptSecret");
    private final static QName _CryptType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CryptType");
    private final static QName _CurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurAmt");
    private final static QName _CurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurCode");
    private final static QName _CurRecLimit_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurRecLimit");
    private final static QName _CurrencyAmount_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurrencyAmount");
    private final static QName _CurrencyCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurrencyCode");
    private final static QName _CurrencyCodeType_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurrencyCodeType");
    private final static QName _CurrencyCodeValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurrencyCodeValue");
    private final static QName _CurCodeValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "CurCodeValue");
    private final static QName _Cursor_QNAME = new QName("urn:ifxforum-org:XSD:1", "Cursor");
    private final static QName _CustDiscEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscEnvr");
    private final static QName _CustDiscId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscId");
    private final static QName _CustDiscInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscInfo");
    private final static QName _CustDiscKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscKeys");
    private final static QName _CustDiscRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscRec");
    private final static QName _CustDiscRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscRef");
    private final static QName _CustDiscSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscSel");
    private final static QName _CustDiscStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscStatus");
    private final static QName _CustDiscStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscStatusCode");
    private final static QName _CustDiscStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustDiscStatusRec");
    private final static QName _CustLangPref_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustLangPref");
    private final static QName _CustPayeeEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeEnvr");
    private final static QName _CustPayeeId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeId");
    private final static QName _CustPayeeInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeInfo");
    private final static QName _CustPayeeKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeKeys");
    private final static QName _CustPayeeRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeRec");
    private final static QName _CustPayeeRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeRef");
    private final static QName _CustPayeeSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeSel");
    private final static QName _CustPayeeStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeStatus");
    private final static QName _CustPayeeStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeStatusCode");
    private final static QName _CustPayeeStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustPayeeStatusRec");
    private final static QName _CustSvcEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcEnvr");
    private final static QName _CustSvcId_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcId");
    private final static QName _CustSvcInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcInfo");
    private final static QName _CustSvcKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcKeys");
    private final static QName _CustSvcRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcRec");
    private final static QName _CustSvcRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcRef");
    private final static QName _CustSvcSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcSel");
    private final static QName _CustSvcStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcStatus");
    private final static QName _CustSvcStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcStatusCode");
    private final static QName _CustSvcStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "CustSvcStatusRec");
    private final static QName _DayOfMonth_QNAME = new QName("urn:ifxforum-org:XSD:1", "DayOfMonth");
    private final static QName _DayOfWeek_QNAME = new QName("urn:ifxforum-org:XSD:1", "DayOfWeek");
    private final static QName _DaysCall_QNAME = new QName("urn:ifxforum-org:XSD:1", "DaysCall");
    private final static QName _DaysToEPost_QNAME = new QName("urn:ifxforum-org:XSD:1", "DaysToEPost");
    private final static QName _DaysToPay_QNAME = new QName("urn:ifxforum-org:XSD:1", "DaysToPay");
    private final static QName _DebitAthEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthEnvr");
    private final static QName _DebitAthId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthId");
    private final static QName _DebitAthInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthInfo");
    private final static QName _DebitAthKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthKeys");
    private final static QName _DebitAthSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthSel");
    private final static QName _DebitAthStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthStatus");
    private final static QName _DebitAthStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthStatusRec");
    private final static QName _DebitAthType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitAthType");
    private final static QName _DebitEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitEnvr");
    private final static QName _DebitId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitId");
    private final static QName _DebitInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitInfo");
    private final static QName _DebitKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitKeys");
    private final static QName _DebitRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitRec");
    private final static QName _DebitRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitRef");
    private final static QName _DebitSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitSel");
    private final static QName _DebitStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitStatus");
    private final static QName _DebitStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitStatusCode");
    private final static QName _DebitStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitStatusRec");
    private final static QName _DebitType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DebitType");
    private final static QName _Debtor_QNAME = new QName("urn:ifxforum-org:XSD:1", "Debtor");
    private final static QName _DeceasedDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeceasedDt");
    private final static QName _DeliveryDestination_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeliveryDestination");
    private final static QName _DeleteSvcAcctId_QNAME = new QName("urn:ifxforum-org:XSD:1", "delete.SvcAcctId");
    private final static QName _DelElements_QNAME = new QName("urn:ifxforum-org:XSD:1", "DelElements");
    private final static QName _DeliveryInstruction_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeliveryInstruction");
    private final static QName _DelinqAging_QNAME = new QName("urn:ifxforum-org:XSD:1", "DelinqAging");
    private final static QName _DeliveryMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeliveryMedia");
    private final static QName _DeliveryMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeliveryMethod");
    private final static QName _DeliveryDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "DeliveryDt");
    private final static QName _DepAppEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppEnvr");
    private final static QName _DepAppId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppId");
    private final static QName _DepAppInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppInfo");
    private final static QName _DepAppKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppKeys");
    private final static QName _DepAppRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppRec");
    private final static QName _DepAppRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppRef");
    private final static QName _DepAppSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppSel");
    private final static QName _DepAppStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppStatus");
    private final static QName _DepAppStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppStatusCode");
    private final static QName _DepAppStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppStatusRec");
    private final static QName _DepApplicant_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepApplicant");
    private final static QName _DepApplicantAcctRel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepApplicantAcctRel");
    private final static QName _DepAppAcctIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepAppAcctIdent");
    private final static QName _DepBkOrdEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdEnvr");
    private final static QName _DepBkOrdId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdId");
    private final static QName _DepBkOrdInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdInfo");
    private final static QName _DepBkOrdKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdKeys");
    private final static QName _DepBkOrdRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdRec");
    private final static QName _DepBkOrdRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdRef");
    private final static QName _DepBkOrdSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdSel");
    private final static QName _DepBkOrdStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdStatus");
    private final static QName _DepBkOrdStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdStatusCode");
    private final static QName _DepBkOrdStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkOrdStatusRec");
    private final static QName _DepBkStyleIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "DepBkStyleIdent");
    private final static QName _Dependents_QNAME = new QName("urn:ifxforum-org:XSD:1", "Dependents");
    private final static QName _Desc_QNAME = new QName("urn:ifxforum-org:XSD:1", "Desc");
    private final static QName _Design_QNAME = new QName("urn:ifxforum-org:XSD:1", "Design");
    private final static QName _DfltPmtData_QNAME = new QName("urn:ifxforum-org:XSD:1", "DfltPmtData");
    private final static QName _Discount_QNAME = new QName("urn:ifxforum-org:XSD:1", "Discount");
    private final static QName _DocCtrlIn_QNAME = new QName("urn:ifxforum-org:XSD:1", "DocCtrlIn");
    private final static QName _DocCtrlOut_QNAME = new QName("urn:ifxforum-org:XSD:1", "DocCtrlOut");
    private final static QName _DocumentVerifyType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DocumentVerifyType");
    private final static QName _DueDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "DueDt");
    private final static QName _Duration_QNAME = new QName("urn:ifxforum-org:XSD:1", "Duration");
    private final static QName _Unit_QNAME = new QName("urn:ifxforum-org:XSD:1", "Unit");
    private final static QName _DevAlmAlarm_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAlmAlarm");
    private final static QName _DevAlmOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAlmOperation");
    private final static QName _DevAlmType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAlmType");
    private final static QName _DevAppComponent_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAppComponent");
    private final static QName _DevAppNormalOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAppNormalOperation");
    private final static QName _DevAppOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevAppOperation");
    private final static QName _DevCamOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamOperation");
    private final static QName _DevCamStatusArea_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamStatusArea");
    private final static QName _DevCamStatusMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamStatusMedia");
    private final static QName _DevCamStatusPictures_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamStatusPictures");
    private final static QName _DevCamStatusState_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamStatusState");
    private final static QName _DevCamType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCamType");
    private final static QName _DevCdmBin_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBin");
    private final static QName _DevCdmBinCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinCount");
    private final static QName _DevCdmBinCurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinCurCode");
    private final static QName _DevCdmBinDenomination_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinDenomination");
    private final static QName _DevCdmBinMaxCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinMaxCount");
    private final static QName _DevCdmBinMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinMedia");
    private final static QName _DevCdmBinNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinNum");
    private final static QName _DevCdmBinStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinStatus");
    private final static QName _DevCdmBinType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmBinType");
    private final static QName _DevCdmCashUnits_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmCashUnits");
    private final static QName _DevCdmIntermediateStacker_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmIntermediateStacker");
    private final static QName _DevCdmOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmOperation");
    private final static QName _DevCdmPosition_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmPosition");
    private final static QName _DevCdmPositionLocation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmPositionLocation");
    private final static QName _DevCdmPositionStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmPositionStatus");
    private final static QName _DevCdmSafeDoor_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmSafeDoor");
    private final static QName _DevCdmShutter_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmShutter");
    private final static QName _DevCdmTransport_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmTransport");
    private final static QName _DevCdmTransportItems_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmTransportItems");
    private final static QName _DevCdmType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCdmType");
    private final static QName _DevChkImageEnabled_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevChkImageEnabled");
    private final static QName _DevChkInk_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevChkInk");
    private final static QName _DevChkMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevChkMedia");
    private final static QName _DevChkOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevChkOperation");
    private final static QName _DevChkType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevChkType");
    private final static QName _DevCimBin_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBin");
    private final static QName _DevCimBinCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinCount");
    private final static QName _DevCimBinCurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinCurCode");
    private final static QName _DevCimBinDenomination_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinDenomination");
    private final static QName _DevCimBinMaxCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinMaxCount");
    private final static QName _DevCimBinNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinNum");
    private final static QName _DevCimBinStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinStatus");
    private final static QName _DevCimBinType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimBinType");
    private final static QName _DevCimCashUnits_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimCashUnits");
    private final static QName _DevCimDropBox_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimDropBox");
    private final static QName _DevCimIntermediateStacker_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimIntermediateStacker");
    private final static QName _DevCimNoteReader_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimNoteReader");
    private final static QName _DevCimOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimOperation");
    private final static QName _DevCimPosition_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimPosition");
    private final static QName _DevCimPositionLocation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimPositionLocation");
    private final static QName _DevCimPositionStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimPositionStatus");
    private final static QName _DevCimSafeDoor_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimSafeDoor");
    private final static QName _DevCimShutter_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimShutter");
    private final static QName _DevCimStackerItems_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimStackerItems");
    private final static QName _DevCimTransport_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimTransport");
    private final static QName _DevCimTransportItems_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimTransportItems");
    private final static QName _DevCimType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevCimType");
    private final static QName _DevDepContainer_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepContainer");
    private final static QName _DevDepEnvelopeDispenser_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepEnvelopeDispenser");
    private final static QName _DevDepEnvelopeSupply_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepEnvelopeSupply");
    private final static QName _DevDepNumOfDeposits_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepNumOfDeposits");
    private final static QName _DevDepOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepOperation");
    private final static QName _DevDepPrinter_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepPrinter");
    private final static QName _DevDepShutter_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepShutter");
    private final static QName _DevDepToner_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepToner");
    private final static QName _DevDepTransport_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepTransport");
    private final static QName _DevDepType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDepType");
    private final static QName _DevDetail_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetail");
    private final static QName _DevDetailAlm_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailAlm");
    private final static QName _DevDetailApp_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailApp");
    private final static QName _DevDetailCam_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailCam");
    private final static QName _DevDetailCdm_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailCdm");
    private final static QName _DevDetailChk_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailChk");
    private final static QName _DevDetailCim_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailCim");
    private final static QName _DevDetailDep_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailDep");
    private final static QName _DevDetailIdc_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailIdc");
    private final static QName _DevDetailPIN_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailPIN");
    private final static QName _DevDetailPtr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailPtr");
    private final static QName _DevDetailSiu_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailSiu");
    private final static QName _DevDetailTtu_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailTtu");
    private final static QName _DevDetailVdm_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevDetailVdm");
    private final static QName _DevEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevEnvr");
    private final static QName _DevHealthLevel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevHealthLevel");
    private final static QName _DevId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevId");
    private final static QName _DevIdcCards_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcCards");
    private final static QName _DevIdcChipPower_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcChipPower");
    private final static QName _DevIdcMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcMedia");
    private final static QName _DevIdcOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcOperation");
    private final static QName _DevIdcRetainBin_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcRetainBin");
    private final static QName _DevIdcRetainedCard_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcRetainedCard");
    private final static QName _DevIdcSecurity_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcSecurity");
    private final static QName _DevIdcType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevIdcType");
    private final static QName _DevInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevInfo");
    private final static QName _DevKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevKeys");
    private final static QName _DevName_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevName");
    private final static QName _DevPINEncStat_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPINEncStat");
    private final static QName _DevPINOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPINOperation");
    private final static QName _DevPINType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPINType");
    private final static QName _DevPlatformData_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPlatformData");
    private final static QName _DevPlatformSource_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPlatformSource");
    private final static QName _DevPlatformXfs_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPlatformXfs");
    private final static QName _DevPtrInk_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrInk");
    private final static QName _DevPtrLamp_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrLamp");
    private final static QName _DevPtrMedia_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrMedia");
    private final static QName _DevPtrOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrOperation");
    private final static QName _DevPtrRetractBin_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrRetractBin");
    private final static QName _DevPtrRetractBinStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrRetractBinStatus");
    private final static QName _DevPtrSupply_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrSupply");
    private final static QName _DevPtrSupplyLevel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrSupplyLevel");
    private final static QName _DevPtrSupplyLocation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrSupplyLocation");
    private final static QName _DevPtrToner_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrToner");
    private final static QName _DevPtrType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevPtrType");
    private final static QName _DevRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevRec");
    private final static QName _DevRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevRef");
    private final static QName _DevSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSel");
    private final static QName _DevSiuAmberLed_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAmberLed");
    private final static QName _DevSiuAmbientLight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAmbientLight");
    private final static QName _DevSiuAudibleAlarm_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAudibleAlarm");
    private final static QName _DevSiuAudio_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAudio");
    private final static QName _DevSiuAuxiliary_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAuxiliary");
    private final static QName _DevSiuAuxiliaryStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuAuxiliaryStatus");
    private final static QName _DevSiuCabinet_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuCabinet");
    private final static QName _DevSiuCdmGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuCdmGuidelight");
    private final static QName _DevSiuChkGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuChkGuidelight");
    private final static QName _DevSiuCimGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuCimGuidelight");
    private final static QName _DevSiuCoinInGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuCoinInGuidelight");
    private final static QName _DevSiuCoinOutGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuCoinOutGuidelight");
    private final static QName _DevSiuDepGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuDepGuidelight");
    private final static QName _DevSiuDocumentGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuDocumentGuidelight");
    private final static QName _DevSiuDoorStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuDoorStatus");
    private final static QName _DevSiuDoors_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuDoors");
    private final static QName _DevSiuEnhancedAudio_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuEnhancedAudio");
    private final static QName _DevSiuFasciaLight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuFasciaLight");
    private final static QName _DevSiuGreenLed_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuGreenLed");
    private final static QName _DevSiuGuidelightStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuGuidelightStatus");
    private final static QName _DevSiuGuidelights_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuGuidelights");
    private final static QName _DevSiuHeat_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuHeat");
    private final static QName _DevSiuHeating_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuHeating");
    private final static QName _DevSiuIdcGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuIdcGuidelight");
    private final static QName _DevSiuIndicatorStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuIndicatorStatus");
    private final static QName _DevSiuIndicators_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuIndicators");
    private final static QName _DevSiuIntTamper_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuIntTamper");
    private final static QName _DevSiuOpenClose_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuOpenClose");
    private final static QName _DevSiuOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuOperation");
    private final static QName _DevSiuOperatorSwitch_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuOperatorSwitch");
    private final static QName _DevSiuPassbookGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuPassbookGuidelight");
    private final static QName _DevSiuProximity_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuProximity");
    private final static QName _DevSiuReceiptGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuReceiptGuidelight");
    private final static QName _DevSiuRedLed_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuRedLed");
    private final static QName _DevSiuRemoteStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuRemoteStatus");
    private final static QName _DevSiuSafe_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuSafe");
    private final static QName _DevSiuScannerGuidelight_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuScannerGuidelight");
    private final static QName _DevSiuSeismic_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuSeismic");
    private final static QName _DevSiuSensorStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuSensorStatus");
    private final static QName _DevSiuSensors_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuSensors");
    private final static QName _DevSiuTamper_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuTamper");
    private final static QName _DevSiuType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuType");
    private final static QName _DevSiuUps_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuUps");
    private final static QName _DevSiuVandalShield_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuVandalShield");
    private final static QName _DevSiuVolume_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevSiuVolume");
    private final static QName _DevStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevStatus");
    private final static QName _DevStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevStatusCode");
    private final static QName _DevStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevStatusRec");
    private final static QName _DevTtuKbd_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevTtuKbd");
    private final static QName _DevTtuKbdLock_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevTtuKbdLock");
    private final static QName _DevTtuLed_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevTtuLed");
    private final static QName _DevTtuOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevTtuOperation");
    private final static QName _DevTtuType_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevTtuType");
    private final static QName _DevVdmOperation_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevVdmOperation");
    private final static QName _DevVdmServiceState_QNAME = new QName("urn:ifxforum-org:XSD:1", "DevVdmServiceState");
    private final static QName _DiscEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscEnvr");
    private final static QName _DiscId_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscId");
    private final static QName _DiscInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscInfo");
    private final static QName _DiscKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscKeys");
    private final static QName _DiscRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscRec");
    private final static QName _DiscRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscRef");
    private final static QName _DiscSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscSel");
    private final static QName _DiscStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscStatus");
    private final static QName _DiscStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscStatusCode");
    private final static QName _DiscStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscStatusRec");
    private final static QName _DiscURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "DiscURL");
    private final static QName _DueDtRange_QNAME = new QName("urn:ifxforum-org:XSD:1", "DueDtRange");
    private final static QName _EducationLevel_QNAME = new QName("urn:ifxforum-org:XSD:1", "EducationLevel");
    private final static QName _EMVRqData_QNAME = new QName("urn:ifxforum-org:XSD:1", "EMVRqData");
    private final static QName _EMVRqRawData_QNAME = new QName("urn:ifxforum-org:XSD:1", "EMVRqRawData");
    private final static QName _EMVRsData_QNAME = new QName("urn:ifxforum-org:XSD:1", "EMVRsData");
    private final static QName _EMVRsRawData_QNAME = new QName("urn:ifxforum-org:XSD:1", "EMVRsRawData");
    private final static QName _EffDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "EffDt");
    private final static QName _EffTimeFrame_QNAME = new QName("urn:ifxforum-org:XSD:1", "EffTimeFrame");
    private final static QName _Email_QNAME = new QName("urn:ifxforum-org:XSD:1", "Email");
    private final static QName _EmailAddr_QNAME = new QName("urn:ifxforum-org:XSD:1", "EmailAddr");
    private final static QName _EmailType_QNAME = new QName("urn:ifxforum-org:XSD:1", "EmailType");
    private final static QName _EmploymentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "EmploymentType");
    private final static QName _EndDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "EndDt");
    private final static QName _EndPageNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "EndPageNum");
    private final static QName _EndSectName_QNAME = new QName("urn:ifxforum-org:XSD:1", "EndSectName");
    private final static QName _Environment_QNAME = new QName("urn:ifxforum-org:XSD:1", "Environment");
    private final static QName _EstablishedDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "EstablishedDt");
    private final static QName _ExceptionType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExceptionType");
    private final static QName _ExchConvertRule_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchConvertRule");
    private final static QName _ExchMktConvertRule_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchMktConvertRule");
    private final static QName _ExchMktRatePrecision_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchMktRatePrecision");
    private final static QName _ExchRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchRate");
    private final static QName _ExchRateInvertPrec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchRateInvertPrec");
    private final static QName _ExchRatePrecision_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExchRatePrecision");
    private final static QName _ExpDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExpDt");
    private final static QName _ExpectedAvailDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExpectedAvailDt");
    private final static QName _ExpectedOpenDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExpectedOpenDt");
    private final static QName _ExtAcctBal_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExtAcctBal");
    private final static QName _ExtBalType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ExtBalType");
    private final static QName _FIData_QNAME = new QName("urn:ifxforum-org:XSD:1", "FIData");
    private final static QName _FIIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "FIIdent");
    private final static QName _FIIdentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "FIIdentType");
    private final static QName _FSPayee_QNAME = new QName("urn:ifxforum-org:XSD:1", "FSPayee");
    private final static QName _FamilyName_QNAME = new QName("urn:ifxforum-org:XSD:1", "FamilyName");
    private final static QName _Fee_QNAME = new QName("urn:ifxforum-org:XSD:1", "Fee");
    private final static QName _FeeChargeAlloc_QNAME = new QName("urn:ifxforum-org:XSD:1", "FeeChargeAlloc");
    private final static QName _FeeRqHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "FeeRqHdr");
    private final static QName _FeeRsHdr_QNAME = new QName("urn:ifxforum-org:XSD:1", "FeeRsHdr");
    private final static QName _FeeType_QNAME = new QName("urn:ifxforum-org:XSD:1", "FeeType");
    private final static QName _FieldSelect_QNAME = new QName("urn:ifxforum-org:XSD:1", "FieldSelect");
    private final static QName _FinancialAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "FinancialAmt");
    private final static QName _FinancialReportsURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "FinancialReportsURL");
    private final static QName _FinancialSubType_QNAME = new QName("urn:ifxforum-org:XSD:1", "FinancialSubType");
    private final static QName _FinancialType_QNAME = new QName("urn:ifxforum-org:XSD:1", "FinancialType");
    private final static QName _FiscalYearEnd_QNAME = new QName("urn:ifxforum-org:XSD:1", "FiscalYearEnd");
    private final static QName _FixingDateEndDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "FixingDateEndDt");
    private final static QName _FixingDateStartDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "FixingDateStartDt");
    private final static QName _FixingDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "FixingDt");
    private final static QName _FontIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "FontIdent");
    private final static QName _ForExDealEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealEnvr");
    private final static QName _ForExDealId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealId");
    private final static QName _ForExDealIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealIdent");
    private final static QName _ForExDealInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealInfo");
    private final static QName _ForExDealRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealRec");
    private final static QName _ForExDealRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealRef");
    private final static QName _ForExDealStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealStatus");
    private final static QName _ForExDealStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealStatusCode");
    private final static QName _ForExDealKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealKeys");
    private final static QName _ForExDealSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealSel");
    private final static QName _ForExDealStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExDealStatusRec");
    private final static QName _ForExHomeRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExHomeRate");
    private final static QName _ForExQuoteId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteId");
    private final static QName _ForExQuoteIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteIdent");
    private final static QName _ForExQuoteKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteKeys");
    private final static QName _ForExQuoteEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteEnvr");
    private final static QName _ForExQuoteInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteInfo");
    private final static QName _ForExQuoteRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteRef");
    private final static QName _ForExQuoteSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteSel");
    private final static QName _ForExQuoteStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteStatus");
    private final static QName _ForExQuoteStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteStatusCode");
    private final static QName _ForExQuoteStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteStatusRec");
    private final static QName _ForExQuoteType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExQuoteType");
    private final static QName _ForExRateProviderName_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateProviderName");
    private final static QName _ForExRateSheetEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetEnvr");
    private final static QName _ForExRateSheetId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetId");
    private final static QName _ForExRateSheetIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetIdent");
    private final static QName _ForExRateSheetKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetKeys");
    private final static QName _ForExRateSheetRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetRef");
    private final static QName _ForExRateSheetStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetStatus");
    private final static QName _ForExRateSheetStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetStatusCode");
    private final static QName _ForExRateSheetStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateSheetStatusRec");
    private final static QName _ForExRateType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExRateType");
    private final static QName _ForExValDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExValDt");
    private final static QName _ForExValDtTimeFrame_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExValDtTimeFrame");
    private final static QName _ForExValDtType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForExValDtType");
    private final static QName _ForwardPts_QNAME = new QName("urn:ifxforum-org:XSD:1", "ForwardPts");
    private final static QName _Freq_QNAME = new QName("urn:ifxforum-org:XSD:1", "Freq");
    private final static QName _FormImg_QNAME = new QName("urn:ifxforum-org:XSD:1", "FormImg");
    private final static QName _FullName_QNAME = new QName("urn:ifxforum-org:XSD:1", "FullName");
    private final static QName _FundingDueDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "FundingDueDt");
    private final static QName _FundingMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "FundingMethod");
    private final static QName _FundingPriority_QNAME = new QName("urn:ifxforum-org:XSD:1", "FundingPriority");
    private final static QName _Gender_QNAME = new QName("urn:ifxforum-org:XSD:1", "Gender");
    private final static QName _GTIN_QNAME = new QName("urn:ifxforum-org:XSD:1", "GTIN");
    private final static QName _GivenName_QNAME = new QName("urn:ifxforum-org:XSD:1", "GivenName");
    private final static QName _GovIssuedIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "GovIssuedIdent");
    private final static QName _GovLevel_QNAME = new QName("urn:ifxforum-org:XSD:1", "GovLevel");
    private final static QName _GovOrgName_QNAME = new QName("urn:ifxforum-org:XSD:1", "GovOrgName");
    private final static QName _GraceEndDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "GraceEndDt");
    private final static QName _HomeOwnership_QNAME = new QName("urn:ifxforum-org:XSD:1", "HomeOwnership");
    private final static QName _HighCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "HighCurAmt");
    private final static QName _HistRetentionDays_QNAME = new QName("urn:ifxforum-org:XSD:1", "HistRetentionDays");
    private final static QName _HomeCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "HomeCurAmt");
    private final static QName _HomeCurCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "HomeCurCode");
    private final static QName _IBAN_QNAME = new QName("urn:ifxforum-org:XSD:1", "IBAN");
    private final static QName _ICCUpdateEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateEnvr");
    private final static QName _ICCUpdateId_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateId");
    private final static QName _ICCUpdateInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateInfo");
    private final static QName _ICCUpdateRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateRec");
    private final static QName _ICCUpdateStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateStatus");
    private final static QName _ICCUpdateStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateStatusCode");
    private final static QName _ICCUpdateKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateKeys");
    private final static QName _ICCUpdateRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateRef");
    private final static QName _ICCUpdateSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateSel");
    private final static QName _ICCUpdateStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "ICCUpdateStatusRec");
    private final static QName _IdentCharacterData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentCharacterData");
    private final static QName _IdentConditions_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentConditions");
    private final static QName _IdentImg_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentImg");
    private final static QName _IdentPrevReadMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentPrevReadMethod");
    private final static QName _IdentPrevServiceCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentPrevServiceCode");
    private final static QName _IdentProgram_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentProgram");
    private final static QName _IdentReadMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentReadMethod");
    private final static QName _IdentServiceCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentServiceCode");
    private final static QName _IdentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentType");
    private final static QName _IdentVerifyEntity_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentVerifyEntity");
    private final static QName _IdentVerifyMethod_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentVerifyMethod");
    private final static QName _IdentVerifyResults_QNAME = new QName("urn:ifxforum-org:XSD:1", "IdentVerifyResults");
    private final static QName _ImageURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "ImageURL");
    private final static QName _ImmediateXfer_QNAME = new QName("urn:ifxforum-org:XSD:1", "ImmediateXfer");
    private final static QName _InitialAmount_QNAME = new QName("urn:ifxforum-org:XSD:1", "InitialAmount");
    private final static QName _InvItemId_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvItemId");
    private final static QName _ImmediatePmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ImmediatePmt");
    private final static QName _ImmigrationStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "ImmigrationStatus");
    private final static QName _ImportDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "ImportDt");
    private final static QName _IncEndrsmntStmp_QNAME = new QName("urn:ifxforum-org:XSD:1", "IncEndrsmntStmp");
    private final static QName _IncSecSigLine_QNAME = new QName("urn:ifxforum-org:XSD:1", "IncSecSigLine");
    private final static QName _Index_QNAME = new QName("urn:ifxforum-org:XSD:1", "Index");
    private final static QName _IndustIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "IndustIdent");
    private final static QName _IndustNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "IndustNum");
    private final static QName _IntAPR_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntAPR");
    private final static QName _IntAPY_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntAPY");
    private final static QName _IntDisposition_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntDisposition");
    private final static QName _InterestRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "InterestRate");
    private final static QName _InterestRateYield_QNAME = new QName("urn:ifxforum-org:XSD:1", "InterestRateYield");
    private final static QName _InterchangeServiceCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "InterchangeServiceCode");
    private final static QName _InterfaceName_QNAME = new QName("urn:ifxforum-org:XSD:1", "InterfaceName");
    private final static QName _InterfaceVersion_QNAME = new QName("urn:ifxforum-org:XSD:1", "InterfaceVersion");
    private final static QName _IntermediaryDepAcct_QNAME = new QName("urn:ifxforum-org:XSD:1", "IntermediaryDepAcct");
    private final static QName _InvalidPinAttempts_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvalidPinAttempts");
    private final static QName _InvoiceAdj_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceAdj");
    private final static QName _InvoiceAdjNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceAdjNum");
    private final static QName _InvoiceData_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceData");
    private final static QName _InvoiceLineItem_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceLineItem");
    private final static QName _InvoiceLineItemNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceLineItemNum");
    private final static QName _InvoiceNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceNum");
    private final static QName _InvoicePremium_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoicePremium");
    private final static QName _InvoiceReceiver_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceReceiver");
    private final static QName _InvoiceSender_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceSender");
    private final static QName _InvoiceType_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceType");
    private final static QName _InvoiceVouchNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "InvoiceVouchNum");
    private final static QName _IssueDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssueDt");
    private final static QName _IssuedIdentType_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuedIdentType");
    private final static QName _IssuedIdentValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuedIdentValue");
    private final static QName _IssuedLoc_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuedLoc");
    private final static QName _Issuer_QNAME = new QName("urn:ifxforum-org:XSD:1", "Issuer");
    private final static QName _IssuerName_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerName");
    private final static QName _IssuerPostScriptData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerPostScriptData");
    private final static QName _IssuerPreScriptData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerPreScriptData");
    private final static QName _IssuerScriptCmd_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerScriptCmd");
    private final static QName _IssuerScriptData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerScriptData");
    private final static QName _IssuerScriptIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerScriptIdent");
    private final static QName _IssuerScriptResult_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerScriptResult");
    private final static QName _IssuerScriptResultData_QNAME = new QName("urn:ifxforum-org:XSD:1", "IssuerScriptResultData");
    private final static QName _JobTitle_QNAME = new QName("urn:ifxforum-org:XSD:1", "JobTitle");
    private final static QName _LOCLimit_QNAME = new QName("urn:ifxforum-org:XSD:1", "LOCLimit");
    private final static QName _LOCLoanData_QNAME = new QName("urn:ifxforum-org:XSD:1", "LOCLoanData");
    private final static QName _Language_QNAME = new QName("urn:ifxforum-org:XSD:1", "Language");
    private final static QName _LastContactDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastContactDt");
    private final static QName _LastOccurInd_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastOccurInd");
    private final static QName _LastOccurenceDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastOccurenceDt");
    private final static QName _LastPrivacyNoteDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastPrivacyNoteDt");
    private final static QName _LastUpdateDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastUpdateDt");
    private final static QName _LastUpdateRqUID_QNAME = new QName("urn:ifxforum-org:XSD:1", "LastUpdateRqUID");
    private final static QName _LegalForm_QNAME = new QName("urn:ifxforum-org:XSD:1", "LegalForm");
    private final static QName _LegalName_QNAME = new QName("urn:ifxforum-org:XSD:1", "LegalName");
    private final static QName _LegalNameInd_QNAME = new QName("urn:ifxforum-org:XSD:1", "LegalNameInd");
    private final static QName _LegalRptCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "LegalRptCode");
    private final static QName _LimitCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "LimitCount");
    private final static QName _LimitResetDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LimitResetDt");
    private final static QName _LimitPosition_QNAME = new QName("urn:ifxforum-org:XSD:1", "LimitPosition");
    private final static QName _LimitType_QNAME = new QName("urn:ifxforum-org:XSD:1", "LimitType");
    private final static QName _Locator_QNAME = new QName("urn:ifxforum-org:XSD:1", "Locator");
    private final static QName _LockboxAcctIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "LockboxAcctIdent");
    private final static QName _LockboxDepIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "LockboxDepIdent");
    private final static QName _LockboxURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "LockboxURL");
    private final static QName _LoginAuthority_QNAME = new QName("urn:ifxforum-org:XSD:1", "LoginAuthority");
    private final static QName _LoginIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "LoginIdent");
    private final static QName _LoginName_QNAME = new QName("urn:ifxforum-org:XSD:1", "LoginName");
    private final static QName _LongText_QNAME = new QName("urn:ifxforum-org:XSD:1", "LongText");
    private final static QName _LowCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "LowCurAmt");
    private final static QName _MCC_QNAME = new QName("urn:ifxforum-org:XSD:1", "MCC");
    private final static QName _MacValue_QNAME = new QName("urn:ifxforum-org:XSD:1", "MacValue");
    private final static QName _MacVariant_QNAME = new QName("urn:ifxforum-org:XSD:1", "MacVariant");
    private final static QName _MagCardUpdateData_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateData");
    private final static QName _MagCardUpdateEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateEnvr");
    private final static QName _MagCardUpdateId_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateId");
    private final static QName _MagCardUpdateInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateInfo");
    private final static QName _MagCardUpdateRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateRec");
    private final static QName _MagCardUpdateStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateStatus");
    private final static QName _MagCardUpdateStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateStatusCode");
    private final static QName _MagCardUpdateKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateKeys");
    private final static QName _MagCardUpdateRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateRef");
    private final static QName _MagCardUpdateSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateSel");
    private final static QName _MagCardUpdateStatusRec_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagCardUpdateStatusRec");
    private final static QName _MagData1_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagData1");
    private final static QName _MagData2_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagData2");
    private final static QName _MagData3_QNAME = new QName("urn:ifxforum-org:XSD:1", "MagData3");
    private final static QName _ManualMicr_QNAME = new QName("urn:ifxforum-org:XSD:1", "ManualMicr");
    private final static QName _MaritalStat_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaritalStat");
    private final static QName _MarriedName_QNAME = new QName("urn:ifxforum-org:XSD:1", "MarriedName");
    private final static QName _MatchedRecCount_QNAME = new QName("urn:ifxforum-org:XSD:1", "MatchedRecCount");
    private final static QName _MaternalName_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaternalName");
    private final static QName _MaturityDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaturityDt");
    private final static QName _MaxCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaxCurAmt");
    private final static QName _MaxRecLimit_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaxRecLimit");
    private final static QName _MediaAcctEnvr_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctEnvr");
    private final static QName _ActionSummary_QNAME = new QName("urn:ifxforum-org:XSD:1", "ActionSummary");
    private final static QName _MiscIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "MiscIdent");
    private final static QName _AttributeName_QNAME = new QName("urn:ifxforum-org:XSD:1", "AttributeName");
    private final static QName _BinNum_QNAME = new QName("urn:ifxforum-org:XSD:1", "BinNum");
    private final static QName _Scope_QNAME = new QName("urn:ifxforum-org:XSD:1", "Scope");
    private final static QName _ActionType_QNAME = new QName("urn:ifxforum-org:XSD:1", "ActionType");
    private final static QName _ActionLoginName_QNAME = new QName("urn:ifxforum-org:XSD:1", "ActionLoginName");
    private final static QName _ActionDate_QNAME = new QName("urn:ifxforum-org:XSD:1", "ActionDate");
    private final static QName _MediaAcctAuth_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctAuth");
    private final static QName _MediaAcctId_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctId");
    private final static QName _MediaAcctIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctIdent");
    private final static QName _MediaAcctInfo_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctInfo");
    private final static QName _MediaAcctKeys_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctKeys");
    private final static QName _MediaAcctRef_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctRef");
    private final static QName _MediaAcctSel_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctSel");
    private final static QName _MediaAcctStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctStatus");
    private final static QName _MediaAcctStatusCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctStatusCode");
    private final static QName _MediaAcctSyncRq_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctSyncRq");
    private final static QName _MediaAcctType_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaAcctType");
    private final static QName _MediaItem_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaItem");
    private final static QName _MediaItemSubType_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaItemSubType");
    private final static QName _MediaItemType_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaItemType");
    private final static QName _MediaTotal_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaTotal");
    private final static QName _MediaTotalType_QNAME = new QName("urn:ifxforum-org:XSD:1", "MediaTotalType");
    private final static QName _MemberSinceDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MemberSinceDt");
    private final static QName _NextTrnIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "NextTrnIdent");
    private final static QName _BusinessDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "BusinessDt");
    private final static QName _MaxLimitAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MaxLimitAmt");
    private final static QName _MinLimitAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MinLimitAmt");
    private final static QName _Memo_QNAME = new QName("urn:ifxforum-org:XSD:1", "Memo");
    private final static QName _Method_QNAME = new QName("urn:ifxforum-org:XSD:1", "Method");
    private final static QName _MicrReadIntegrity_QNAME = new QName("urn:ifxforum-org:XSD:1", "MicrReadIntegrity");
    private final static QName _MicrUnformatted_QNAME = new QName("urn:ifxforum-org:XSD:1", "MicrUnformatted");
    private final static QName _MiddleName_QNAME = new QName("urn:ifxforum-org:XSD:1", "MiddleName");
    private final static QName _MilitaryRank_QNAME = new QName("urn:ifxforum-org:XSD:1", "MilitaryRank");
    private final static QName _MinAmtDue_QNAME = new QName("urn:ifxforum-org:XSD:1", "MinAmtDue");
    private final static QName _MinCurAmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MinCurAmt");
    private final static QName _MinPmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MinPmt");
    private final static QName _MktgImg_QNAME = new QName("urn:ifxforum-org:XSD:1", "MktgImg");
    private final static QName _MktgMaterial_QNAME = new QName("urn:ifxforum-org:XSD:1", "MktgMaterial");
    private final static QName _MktgText_QNAME = new QName("urn:ifxforum-org:XSD:1", "MktgText");
    private final static QName _MktgURL_QNAME = new QName("urn:ifxforum-org:XSD:1", "MktgURL");
    private final static QName _Month_QNAME = new QName("urn:ifxforum-org:XSD:1", "Month");
    private final static QName _MotherMaidenName_QNAME = new QName("urn:ifxforum-org:XSD:1", "MotherMaidenName");
    private final static QName _MsgAuthCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "MsgAuthCode");
    private final static QName _MsgRecDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "MsgRecDt");
    private final static QName _MsgType_QNAME = new QName("urn:ifxforum-org:XSD:1", "MsgType");
    private final static QName _NAICS_QNAME = new QName("urn:ifxforum-org:XSD:1", "NAICS");
    private final static QName _Name_QNAME = new QName("urn:ifxforum-org:XSD:1", "Name");
    private final static QName _NamePrefix_QNAME = new QName("urn:ifxforum-org:XSD:1", "NamePrefix");
    private final static QName _NameSpace_QNAME = new QName("urn:ifxforum-org:XSD:1", "NameSpace");
    private final static QName _NameSuffix_QNAME = new QName("urn:ifxforum-org:XSD:1", "NameSuffix");
    private final static QName _Nationality_QNAME = new QName("urn:ifxforum-org:XSD:1", "Nationality");
    private final static QName _NetworkOwner_QNAME = new QName("urn:ifxforum-org:XSD:1", "NetworkOwner");
    private final static QName _NetworkRefIdent_QNAME = new QName("urn:ifxforum-org:XSD:1", "NetworkRefIdent");
    private final static QName _NewForExRate_QNAME = new QName("urn:ifxforum-org:XSD:1", "NewForExRate");
    private final static QName _NextDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "NextDt");
    private final static QName _NextIssueDt_QNAME = new QName("urn:ifxforum-org:XSD:1", "NextIssueDt");
    private final static QName _NextPmt_QNAME = new QName("urn:ifxforum-org:XSD:1", "NextPmt");
    private final static QName _Nickname_QNAME = new QName("urn:ifxforum-org:XSD:1", "Nickname");
    private final static QName _NotifyReqd_QNAME = new QName("urn:ifxforum-org:XSD:1", "NotifyReqd");
    private final static QName _NumEmployees_QNAME = new QName("urn:ifxforum-org:XSD:1", "NumEmployees");
    private final static QName _NumSignatureReqd_QNAME = new QName("urn:ifxforum-org:XSD:1", "NumSignatureReqd");
    private final static QName _Occurrences_QNAME = new QName("urn:ifxforum-org:XSD:1", "Occurrences");
    private final static QName _OEDCode_QNAME = new QName("urn:ifxforum-org:XSD:1", "OEDCode");
    private final static QName _OEDInstitution_QNAME = new QName("urn:ifxforum-org:XSD:1", "OEDInstitution");
    private final static QName _OEDRelationship_QNAME = new QName("urn:ifxforum-org:XSD:1", "OEDRelationship");
    private final static QName _Occupation_QNAME = new QName("urn:ifxforum-org:XSD:1", "Occupation");
    private final static QName _OccupationalStatus_QNAME = new QName("urn:ifxforum-org:XSD:1", "OccupationalStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ifxforum.xsd._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurAmtType }
     * 
     */
    public CurAmtType createCurAmtType() {
        return new CurAmtType();
    }

    /**
     * Create an instance of {@link PartyRefType }
     * 
     */
    public PartyRefType createPartyRefType() {
        return new PartyRefType();
    }

    /**
     * Create an instance of {@link CurrencyAmountType }
     * 
     */
    public CurrencyAmountType createCurrencyAmountType() {
        return new CurrencyAmountType();
    }

    /**
     * Create an instance of {@link AcctIdentType }
     * 
     */
    public AcctIdentType createAcctIdentType() {
        return new AcctIdentType();
    }

    /**
     * Create an instance of {@link PostAddrType }
     * 
     */
    public PostAddrType createPostAddrType() {
        return new PostAddrType();
    }

    /**
     * Create an instance of {@link AcctTypeType }
     * 
     */
    public AcctTypeType createAcctTypeType() {
        return new AcctTypeType();
    }

    /**
     * Create an instance of {@link SubjectPswdType }
     * 
     */
    public SubjectPswdType createSubjectPswdType() {
        return new SubjectPswdType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link FIDataType }
     * 
     */
    public FIDataType createFIDataType() {
        return new FIDataType();
    }

    /**
     * Create an instance of {@link SubjectPassCodeType }
     * 
     */
    public SubjectPassCodeType createSubjectPassCodeType() {
        return new SubjectPassCodeType();
    }

    /**
     * Create an instance of {@link CurCodeType }
     * 
     */
    public CurCodeType createCurCodeType() {
        return new CurCodeType();
    }

    /**
     * Create an instance of {@link AcctBalType }
     * 
     */
    public AcctBalType createAcctBalType() {
        return new AcctBalType();
    }

    /**
     * Create an instance of {@link TermType }
     * 
     */
    public TermType createTermType() {
        return new TermType();
    }

    /**
     * Create an instance of {@link AcctKeysType }
     * 
     */
    public AcctKeysType createAcctKeysType() {
        return new AcctKeysType();
    }

    /**
     * Create an instance of {@link BalAmtType }
     * 
     */
    public BalAmtType createBalAmtType() {
        return new BalAmtType();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link CardRefType }
     * 
     */
    public CardRefType createCardRefType() {
        return new CardRefType();
    }

    /**
     * Create an instance of {@link AcctRefType }
     * 
     */
    public AcctRefType createAcctRefType() {
        return new AcctRefType();
    }

    /**
     * Create an instance of {@link MediaCashDataType }
     * 
     */
    public MediaCashDataType createMediaCashDataType() {
        return new MediaCashDataType();
    }

    /**
     * Create an instance of {@link AcctTrnInfoType }
     * 
     */
    public AcctTrnInfoType createAcctTrnInfoType() {
        return new AcctTrnInfoType();
    }

    /**
     * Create an instance of {@link AcctStatusRecType }
     * 
     */
    public AcctStatusRecType createAcctStatusRecType() {
        return new AcctStatusRecType();
    }

    /**
     * Create an instance of {@link PartyCardRelSelType }
     * 
     */
    public PartyCardRelSelType createPartyCardRelSelType() {
        return new PartyCardRelSelType();
    }

    /**
     * Create an instance of {@link StopChkInfoType }
     * 
     */
    public StopChkInfoType createStopChkInfoType() {
        return new StopChkInfoType();
    }

    /**
     * Create an instance of {@link StopChkSelType }
     * 
     */
    public StopChkSelType createStopChkSelType() {
        return new StopChkSelType();
    }

    /**
     * Create an instance of {@link StopChkKeysType }
     * 
     */
    public StopChkKeysType createStopChkKeysType() {
        return new StopChkKeysType();
    }

    /**
     * Create an instance of {@link StopChkStatusType }
     * 
     */
    public StopChkStatusType createStopChkStatusType() {
        return new StopChkStatusType();
    }

    /**
     * Create an instance of {@link ExchangeRateType }
     * 
     */
    public ExchangeRateType createExchangeRateType() {
        return new ExchangeRateType();
    }

    /**
     * Create an instance of {@link ChkIssueInfoType }
     * 
     */
    public ChkIssueInfoType createChkIssueInfoType() {
        return new ChkIssueInfoType();
    }

    /**
     * Create an instance of {@link ChkImgDataType }
     * 
     */
    public ChkImgDataType createChkImgDataType() {
        return new ChkImgDataType();
    }

    /**
     * Create an instance of {@link AcctTrnEnvrType }
     * 
     */
    public AcctTrnEnvrType createAcctTrnEnvrType() {
        return new AcctTrnEnvrType();
    }

    /**
     * Create an instance of {@link CreditInfoType }
     * 
     */
    public CreditInfoType createCreditInfoType() {
        return new CreditInfoType();
    }

    /**
     * Create an instance of {@link PersonDataType }
     * 
     */
    public PersonDataType createPersonDataType() {
        return new PersonDataType();
    }

    /**
     * Create an instance of {@link MediaBalType }
     * 
     */
    public MediaBalType createMediaBalType() {
        return new MediaBalType();
    }

    /**
     * Create an instance of {@link SecTokenLoginType }
     * 
     */
    public SecTokenLoginType createSecTokenLoginType() {
        return new SecTokenLoginType();
    }

    /**
     * Create an instance of {@link FinancialDataType }
     * 
     */
    public FinancialDataType createFinancialDataType() {
        return new FinancialDataType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link SecTokenSecretAnswerType }
     * 
     */
    public SecTokenSecretAnswerType createSecTokenSecretAnswerType() {
        return new SecTokenSecretAnswerType();
    }

    /**
     * Create an instance of {@link OrgPartyInfoType }
     * 
     */
    public OrgPartyInfoType createOrgPartyInfoType() {
        return new OrgPartyInfoType();
    }

    /**
     * Create an instance of {@link OrgCategoryCodeType }
     * 
     */
    public OrgCategoryCodeType createOrgCategoryCodeType() {
        return new OrgCategoryCodeType();
    }

    /**
     * Create an instance of {@link IntRateDataType }
     * 
     */
    public IntRateDataType createIntRateDataType() {
        return new IntRateDataType();
    }

    /**
     * Create an instance of {@link IntDistAcctRefType }
     * 
     */
    public IntDistAcctRefType createIntDistAcctRefType() {
        return new IntDistAcctRefType();
    }

    /**
     * Create an instance of {@link ChkDetailType }
     * 
     */
    public ChkDetailType createChkDetailType() {
        return new ChkDetailType();
    }

    /**
     * Create an instance of {@link CreditAcctDataType }
     * 
     */
    public CreditAcctDataType createCreditAcctDataType() {
        return new CreditAcctDataType();
    }

    /**
     * Create an instance of {@link FromAcctRefType }
     * 
     */
    public FromAcctRefType createFromAcctRefType() {
        return new FromAcctRefType();
    }

    /**
     * Create an instance of {@link PartyPrefType }
     * 
     */
    public PartyPrefType createPartyPrefType() {
        return new PartyPrefType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link EmploymentType }
     * 
     */
    public EmploymentType createEmploymentType() {
        return new EmploymentType();
    }

    /**
     * Create an instance of {@link PartyKeysType }
     * 
     */
    public PartyKeysType createPartyKeysType() {
        return new PartyKeysType();
    }

    /**
     * Create an instance of {@link PartyPartyRelKeysType }
     * 
     */
    public PartyPartyRelKeysType createPartyPartyRelKeysType() {
        return new PartyPartyRelKeysType();
    }

    /**
     * Create an instance of {@link CardKeysType }
     * 
     */
    public CardKeysType createCardKeysType() {
        return new CardKeysType();
    }

    /**
     * Create an instance of {@link PartyAcctRelKeysType }
     * 
     */
    public PartyAcctRelKeysType createPartyAcctRelKeysType() {
        return new PartyAcctRelKeysType();
    }

    /**
     * Create an instance of {@link AcctTrnSelType }
     * 
     */
    public AcctTrnSelType createAcctTrnSelType() {
        return new AcctTrnSelType();
    }

    /**
     * Create an instance of {@link RelPartyRefType }
     * 
     */
    public RelPartyRefType createRelPartyRefType() {
        return new RelPartyRefType();
    }

    /**
     * Create an instance of {@link CardAcctRelRecType }
     * 
     */
    public CardAcctRelRecType createCardAcctRelRecType() {
        return new CardAcctRelRecType();
    }

    /**
     * Create an instance of {@link CardAuthType }
     * 
     */
    public CardAuthType createCardAuthType() {
        return new CardAuthType();
    }

    /**
     * Create an instance of {@link CardStatusType }
     * 
     */
    public CardStatusType createCardStatusType() {
        return new CardStatusType();
    }

    /**
     * Create an instance of {@link CardInfoType }
     * 
     */
    public CardInfoType createCardInfoType() {
        return new CardInfoType();
    }

    /**
     * Create an instance of {@link PartyPartyRelInfoType }
     * 
     */
    public PartyPartyRelInfoType createPartyPartyRelInfoType() {
        return new PartyPartyRelInfoType();
    }

    /**
     * Create an instance of {@link AcctTaxDataType }
     * 
     */
    public AcctTaxDataType createAcctTaxDataType() {
        return new AcctTaxDataType();
    }

    /**
     * Create an instance of {@link ForExRateSheetInfoType }
     * 
     */
    public ForExRateSheetInfoType createForExRateSheetInfoType() {
        return new ForExRateSheetInfoType();
    }

    /**
     * Create an instance of {@link XferInfoType }
     * 
     */
    public XferInfoType createXferInfoType() {
        return new XferInfoType();
    }

    /**
     * Create an instance of {@link XferKeysType }
     * 
     */
    public XferKeysType createXferKeysType() {
        return new XferKeysType();
    }

    /**
     * Create an instance of {@link ForExRateSheetCurRateType }
     * 
     */
    public ForExRateSheetCurRateType createForExRateSheetCurRateType() {
        return new ForExRateSheetCurRateType();
    }

    /**
     * Create an instance of {@link CredentialsRqHdrType }
     * 
     */
    public CredentialsRqHdrType createCredentialsRqHdrType() {
        return new CredentialsRqHdrType();
    }

    /**
     * Create an instance of {@link MsgRqHdrType }
     * 
     */
    public MsgRqHdrType createMsgRqHdrType() {
        return new MsgRqHdrType();
    }

    /**
     * Create an instance of {@link MsgRsHdrType }
     * 
     */
    public MsgRsHdrType createMsgRsHdrType() {
        return new MsgRsHdrType();
    }

    /**
     * Create an instance of {@link CredentialsRsHdrType }
     * 
     */
    public CredentialsRsHdrType createCredentialsRsHdrType() {
        return new CredentialsRsHdrType();
    }

    /**
     * Create an instance of {@link SecTokenCardType }
     * 
     */
    public SecTokenCardType createSecTokenCardType() {
        return new SecTokenCardType();
    }

    /**
     * Create an instance of {@link PartyPartyRelSelType }
     * 
     */
    public PartyPartyRelSelType createPartyPartyRelSelType() {
        return new PartyPartyRelSelType();
    }

    /**
     * Create an instance of {@link CurAmtRangeType }
     * 
     */
    public CurAmtRangeType createCurAmtRangeType() {
        return new CurAmtRangeType();
    }

    /**
     * Create an instance of {@link DtRangeType }
     * 
     */
    public DtRangeType createDtRangeType() {
        return new DtRangeType();
    }

    /**
     * Create an instance of {@link PartyAuthType }
     * 
     */
    public PartyAuthType createPartyAuthType() {
        return new PartyAuthType();
    }

    /**
     * Create an instance of {@link ContextRqHdrType }
     * 
     */
    public ContextRqHdrType createContextRqHdrType() {
        return new ContextRqHdrType();
    }

    /**
     * Create an instance of {@link ContextRsHdrType }
     * 
     */
    public ContextRsHdrType createContextRsHdrType() {
        return new ContextRsHdrType();
    }

    /**
     * Create an instance of {@link InterfaceType }
     * 
     */
    public InterfaceType createInterfaceType() {
        return new InterfaceType();
    }

    /**
     * Create an instance of {@link NetworkTrnDataType }
     * 
     */
    public NetworkTrnDataType createNetworkTrnDataType() {
        return new NetworkTrnDataType();
    }

    /**
     * Create an instance of {@link AnnualIncomeType }
     * 
     */
    public AnnualIncomeType createAnnualIncomeType() {
        return new AnnualIncomeType();
    }

    /**
     * Create an instance of {@link AdditionalStatusType }
     * 
     */
    public AdditionalStatusType createAdditionalStatusType() {
        return new AdditionalStatusType();
    }

    /**
     * Create an instance of {@link IssuedIdentType }
     * 
     */
    public IssuedIdentType createIssuedIdentType() {
        return new IssuedIdentType();
    }

    /**
     * Create an instance of {@link IntDispDataType }
     * 
     */
    public IntDispDataType createIntDispDataType() {
        return new IntDispDataType();
    }

    /**
     * Create an instance of {@link PartyAcctRelDataType }
     * 
     */
    public PartyAcctRelDataType createPartyAcctRelDataType() {
        return new PartyAcctRelDataType();
    }

    /**
     * Create an instance of {@link USATaxIdCertType }
     * 
     */
    public USATaxIdCertType createUSATaxIdCertType() {
        return new USATaxIdCertType();
    }

    /**
     * Create an instance of {@link PartySelType }
     * 
     */
    public PartySelType createPartySelType() {
        return new PartySelType();
    }

    /**
     * Create an instance of {@link PersonPartyInfoType }
     * 
     */
    public PersonPartyInfoType createPersonPartyInfoType() {
        return new PersonPartyInfoType();
    }

    /**
     * Create an instance of {@link PartyInfoType }
     * 
     */
    public PartyInfoType createPartyInfoType() {
        return new PartyInfoType();
    }

    /**
     * Create an instance of {@link AcctInfoType }
     * 
     */
    public AcctInfoType createAcctInfoType() {
        return new AcctInfoType();
    }

    /**
     * Create an instance of {@link AcctStatusType }
     * 
     */
    public AcctStatusType createAcctStatusType() {
        return new AcctStatusType();
    }

    /**
     * Create an instance of {@link PartyAcctRelInfoType }
     * 
     */
    public PartyAcctRelInfoType createPartyAcctRelInfoType() {
        return new PartyAcctRelInfoType();
    }

    /**
     * Create an instance of {@link PartyAcctRelRecType }
     * 
     */
    public PartyAcctRelRecType createPartyAcctRelRecType() {
        return new PartyAcctRelRecType();
    }

    /**
     * Create an instance of {@link PartyAcctRelSelType }
     * 
     */
    public PartyAcctRelSelType createPartyAcctRelSelType() {
        return new PartyAcctRelSelType();
    }

    /**
     * Create an instance of {@link RecXferInfoType }
     * 
     */
    public RecXferInfoType createRecXferInfoType() {
        return new RecXferInfoType();
    }

    /**
     * Create an instance of {@link RecXferKeysType }
     * 
     */
    public RecXferKeysType createRecXferKeysType() {
        return new RecXferKeysType();
    }

    /**
     * Create an instance of {@link PhoneNumType }
     * 
     */
    public PhoneNumType createPhoneNumType() {
        return new PhoneNumType();
    }

    /**
     * Create an instance of {@link CreditMediaChkDataType }
     * 
     */
    public CreditMediaChkDataType createCreditMediaChkDataType() {
        return new CreditMediaChkDataType();
    }

    /**
     * Create an instance of {@link DepAcctDataType }
     * 
     */
    public DepAcctDataType createDepAcctDataType() {
        return new DepAcctDataType();
    }

    /**
     * Create an instance of {@link BaseAuthType }
     * 
     */
    public BaseAuthType createBaseAuthType() {
        return new BaseAuthType();
    }

    /**
     * Create an instance of {@link RecurrenceRuleType }
     * 
     */
    public RecurrenceRuleType createRecurrenceRuleType() {
        return new RecurrenceRuleType();
    }

    /**
     * Create an instance of {@link RecurRuleType }
     * 
     */
    public RecurRuleType createRecurRuleType() {
        return new RecurRuleType();
    }

    /**
     * Create an instance of {@link ChkDataType }
     * 
     */
    public ChkDataType createChkDataType() {
        return new ChkDataType();
    }

    /**
     * Create an instance of {@link MediaAcctSummaryType }
     * 
     */
    public MediaAcctSummaryType createMediaAcctSummaryType() {
        return new MediaAcctSummaryType();
    }

    /**
     * Create an instance of {@link AcctRecType }
     * 
     */
    public AcctRecType createAcctRecType() {
        return new AcctRecType();
    }

    /**
     * Create an instance of {@link AcctTrnRecType }
     * 
     */
    public AcctTrnRecType createAcctTrnRecType() {
        return new AcctTrnRecType();
    }

    /**
     * Create an instance of {@link PartyRecType }
     * 
     */
    public PartyRecType createPartyRecType() {
        return new PartyRecType();
    }

    /**
     * Create an instance of {@link PartyIdentType }
     * 
     */
    public PartyIdentType createPartyIdentType() {
        return new PartyIdentType();
    }

    /**
     * Create an instance of {@link PartyPartyRelRecType }
     * 
     */
    public PartyPartyRelRecType createPartyPartyRelRecType() {
        return new PartyPartyRelRecType();
    }

    /**
     * Create an instance of {@link RecXferRecType }
     * 
     */
    public RecXferRecType createRecXferRecType() {
        return new RecXferRecType();
    }

    /**
     * Create an instance of {@link StopChkRecType }
     * 
     */
    public StopChkRecType createStopChkRecType() {
        return new StopChkRecType();
    }

    /**
     * Create an instance of {@link CardRecType }
     * 
     */
    public CardRecType createCardRecType() {
        return new CardRecType();
    }

    /**
     * Create an instance of {@link XferRecType }
     * 
     */
    public XferRecType createXferRecType() {
        return new XferRecType();
    }

    /**
     * Create an instance of {@link MediaAcctStatusRecType }
     * 
     */
    public MediaAcctStatusRecType createMediaAcctStatusRecType() {
        return new MediaAcctStatusRecType();
    }

    /**
     * Create an instance of {@link MediaAcctRecType }
     * 
     */
    public MediaAcctRecType createMediaAcctRecType() {
        return new MediaAcctRecType();
    }

    /**
     * Create an instance of {@link PartyCardRelRecType }
     * 
     */
    public PartyCardRelRecType createPartyCardRelRecType() {
        return new PartyCardRelRecType();
    }

    /**
     * Create an instance of {@link PartyAuthRecType }
     * 
     */
    public PartyAuthRecType createPartyAuthRecType() {
        return new PartyAuthRecType();
    }

    /**
     * Create an instance of {@link ForExRateSheetRecType }
     * 
     */
    public ForExRateSheetRecType createForExRateSheetRecType() {
        return new ForExRateSheetRecType();
    }

    /**
     * Create an instance of {@link AlertInfoType }
     * 
     */
    public AlertInfoType createAlertInfoType() {
        return new AlertInfoType();
    }

    /**
     * Create an instance of {@link AlertKeysType }
     * 
     */
    public AlertKeysType createAlertKeysType() {
        return new AlertKeysType();
    }

    /**
     * Create an instance of {@link AlertRecType }
     * 
     */
    public AlertRecType createAlertRecType() {
        return new AlertRecType();
    }

    /**
     * Create an instance of {@link AlertAmtType }
     * 
     */
    public AlertAmtType createAlertAmtType() {
        return new AlertAmtType();
    }

    /**
     * Create an instance of {@link PmtInstructionType }
     * 
     */
    public PmtInstructionType createPmtInstructionType() {
        return new PmtInstructionType();
    }

    /**
     * Create an instance of {@link PmtRecType }
     * 
     */
    public PmtRecType createPmtRecType() {
        return new PmtRecType();
    }

    /**
     * Create an instance of {@link PmtInfoType }
     * 
     */
    public PmtInfoType createPmtInfoType() {
        return new PmtInfoType();
    }

    /**
     * Create an instance of {@link PmtKeysType }
     * 
     */
    public PmtKeysType createPmtKeysType() {
        return new PmtKeysType();
    }

    /**
     * Create an instance of {@link ForExQuoteRecType }
     * 
     */
    public ForExQuoteRecType createForExQuoteRecType() {
        return new ForExQuoteRecType();
    }

    /**
     * Create an instance of {@link ChkIssueRecType }
     * 
     */
    public ChkIssueRecType createChkIssueRecType() {
        return new ChkIssueRecType();
    }

    /**
     * Create an instance of {@link ChkIssueMiscDataType }
     * 
     */
    public ChkIssueMiscDataType createChkIssueMiscDataType() {
        return new ChkIssueMiscDataType();
    }

    /**
     * Create an instance of {@link ChkIssueKeyDataType }
     * 
     */
    public ChkIssueKeyDataType createChkIssueKeyDataType() {
        return new ChkIssueKeyDataType();
    }

    /**
     * Create an instance of {@link ChkIssueAuthType }
     * 
     */
    public ChkIssueAuthType createChkIssueAuthType() {
        return new ChkIssueAuthType();
    }

    /**
     * Create an instance of {@link ForExRateSheetAuthType }
     * 
     */
    public ForExRateSheetAuthType createForExRateSheetAuthType() {
        return new ForExRateSheetAuthType();
    }

    /**
     * Create an instance of {@link RecXferKeyDataType }
     * 
     */
    public RecXferKeyDataType createRecXferKeyDataType() {
        return new RecXferKeyDataType();
    }

    /**
     * Create an instance of {@link AcctFromKeysType }
     * 
     */
    public AcctFromKeysType createAcctFromKeysType() {
        return new AcctFromKeysType();
    }

    /**
     * Create an instance of {@link AcctToKeysType }
     * 
     */
    public AcctToKeysType createAcctToKeysType() {
        return new AcctToKeysType();
    }

    /**
     * Create an instance of {@link RecXferAuthType }
     * 
     */
    public RecXferAuthType createRecXferAuthType() {
        return new RecXferAuthType();
    }

    /**
     * Create an instance of {@link XferAuthType }
     * 
     */
    public XferAuthType createXferAuthType() {
        return new XferAuthType();
    }

    /**
     * Create an instance of {@link AcctEnvrType }
     * 
     */
    public AcctEnvrType createAcctEnvrType() {
        return new AcctEnvrType();
    }

    /**
     * Create an instance of {@link AcctListType }
     * 
     */
    public AcctListType createAcctListType() {
        return new AcctListType();
    }

    /**
     * Create an instance of {@link AcctPeriodDataType }
     * 
     */
    public AcctPeriodDataType createAcctPeriodDataType() {
        return new AcctPeriodDataType();
    }

    /**
     * Create an instance of {@link AcctSelType }
     * 
     */
    public AcctSelType createAcctSelType() {
        return new AcctSelType();
    }

    /**
     * Create an instance of {@link AcctAuthType }
     * 
     */
    public AcctAuthType createAcctAuthType() {
        return new AcctAuthType();
    }

    /**
     * Create an instance of {@link AcctStmtEnvrType }
     * 
     */
    public AcctStmtEnvrType createAcctStmtEnvrType() {
        return new AcctStmtEnvrType();
    }

    /**
     * Create an instance of {@link AcctStmtInfoType }
     * 
     */
    public AcctStmtInfoType createAcctStmtInfoType() {
        return new AcctStmtInfoType();
    }

    /**
     * Create an instance of {@link AcctStmtKeysType }
     * 
     */
    public AcctStmtKeysType createAcctStmtKeysType() {
        return new AcctStmtKeysType();
    }

    /**
     * Create an instance of {@link AcctStmtRecType }
     * 
     */
    public AcctStmtRecType createAcctStmtRecType() {
        return new AcctStmtRecType();
    }

    /**
     * Create an instance of {@link AcctStmtRefType }
     * 
     */
    public AcctStmtRefType createAcctStmtRefType() {
        return new AcctStmtRefType();
    }

    /**
     * Create an instance of {@link AcctStmtSelType }
     * 
     */
    public AcctStmtSelType createAcctStmtSelType() {
        return new AcctStmtSelType();
    }

    /**
     * Create an instance of {@link AcctStmtStatusType }
     * 
     */
    public AcctStmtStatusType createAcctStmtStatusType() {
        return new AcctStmtStatusType();
    }

    /**
     * Create an instance of {@link AcctStmtStatusRecType }
     * 
     */
    public AcctStmtStatusRecType createAcctStmtStatusRecType() {
        return new AcctStmtStatusRecType();
    }

    /**
     * Create an instance of {@link AcctTrnImgEnvrType }
     * 
     */
    public AcctTrnImgEnvrType createAcctTrnImgEnvrType() {
        return new AcctTrnImgEnvrType();
    }

    /**
     * Create an instance of {@link AcctTrnImgInfoType }
     * 
     */
    public AcctTrnImgInfoType createAcctTrnImgInfoType() {
        return new AcctTrnImgInfoType();
    }

    /**
     * Create an instance of {@link AcctTrnImgKeysType }
     * 
     */
    public AcctTrnImgKeysType createAcctTrnImgKeysType() {
        return new AcctTrnImgKeysType();
    }

    /**
     * Create an instance of {@link AcctTrnImgRecType }
     * 
     */
    public AcctTrnImgRecType createAcctTrnImgRecType() {
        return new AcctTrnImgRecType();
    }

    /**
     * Create an instance of {@link AcctTrnImgRefType }
     * 
     */
    public AcctTrnImgRefType createAcctTrnImgRefType() {
        return new AcctTrnImgRefType();
    }

    /**
     * Create an instance of {@link AcctTrnImgSelType }
     * 
     */
    public AcctTrnImgSelType createAcctTrnImgSelType() {
        return new AcctTrnImgSelType();
    }

    /**
     * Create an instance of {@link AcctTrnImgStatusType }
     * 
     */
    public AcctTrnImgStatusType createAcctTrnImgStatusType() {
        return new AcctTrnImgStatusType();
    }

    /**
     * Create an instance of {@link AcctTrnImgStatusRecType }
     * 
     */
    public AcctTrnImgStatusRecType createAcctTrnImgStatusRecType() {
        return new AcctTrnImgStatusRecType();
    }

    /**
     * Create an instance of {@link AcctTrnAuthType }
     * 
     */
    public AcctTrnAuthType createAcctTrnAuthType() {
        return new AcctTrnAuthType();
    }

    /**
     * Create an instance of {@link AcctTrnKeysType }
     * 
     */
    public AcctTrnKeysType createAcctTrnKeysType() {
        return new AcctTrnKeysType();
    }

    /**
     * Create an instance of {@link AcctTrnLimitType }
     * 
     */
    public AcctTrnLimitType createAcctTrnLimitType() {
        return new AcctTrnLimitType();
    }

    /**
     * Create an instance of {@link AcctTrnRefType }
     * 
     */
    public AcctTrnRefType createAcctTrnRefType() {
        return new AcctTrnRefType();
    }

    /**
     * Create an instance of {@link AcctTrnStatusType }
     * 
     */
    public AcctTrnStatusType createAcctTrnStatusType() {
        return new AcctTrnStatusType();
    }

    /**
     * Create an instance of {@link AcctTrnStatusRecType }
     * 
     */
    public AcctTrnStatusRecType createAcctTrnStatusRecType() {
        return new AcctTrnStatusRecType();
    }

    /**
     * Create an instance of {@link AsyncRsDataType }
     * 
     */
    public AsyncRsDataType createAsyncRsDataType() {
        return new AsyncRsDataType();
    }

    /**
     * Create an instance of {@link BalTypeType }
     * 
     */
    public BalTypeType createBalTypeType() {
        return new BalTypeType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumType }
     * 
     */
    public BankSvcChkSumType createBankSvcChkSumType() {
        return new BankSvcChkSumType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumEnvrType }
     * 
     */
    public BankSvcChkSumEnvrType createBankSvcChkSumEnvrType() {
        return new BankSvcChkSumEnvrType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumInfoType }
     * 
     */
    public BankSvcChkSumInfoType createBankSvcChkSumInfoType() {
        return new BankSvcChkSumInfoType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumKeysType }
     * 
     */
    public BankSvcChkSumKeysType createBankSvcChkSumKeysType() {
        return new BankSvcChkSumKeysType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumRecType }
     * 
     */
    public BankSvcChkSumRecType createBankSvcChkSumRecType() {
        return new BankSvcChkSumRecType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumSelType }
     * 
     */
    public BankSvcChkSumSelType createBankSvcChkSumSelType() {
        return new BankSvcChkSumSelType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumStatusType }
     * 
     */
    public BankSvcChkSumStatusType createBankSvcChkSumStatusType() {
        return new BankSvcChkSumStatusType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumStatusRecType }
     * 
     */
    public BankSvcChkSumStatusRecType createBankSvcChkSumStatusRecType() {
        return new BankSvcChkSumStatusRecType();
    }

    /**
     * Create an instance of {@link BaseCurCodeType }
     * 
     */
    public BaseCurCodeType createBaseCurCodeType() {
        return new BaseCurCodeType();
    }

    /**
     * Create an instance of {@link BaseKeysType }
     * 
     */
    public BaseKeysType createBaseKeysType() {
        return new BaseKeysType();
    }

    /**
     * Create an instance of {@link BaseEnvrType }
     * 
     */
    public BaseEnvrType createBaseEnvrType() {
        return new BaseEnvrType();
    }

    /**
     * Create an instance of {@link BatchDataType }
     * 
     */
    public BatchDataType createBatchDataType() {
        return new BatchDataType();
    }

    /**
     * Create an instance of {@link BillEnvrType }
     * 
     */
    public BillEnvrType createBillEnvrType() {
        return new BillEnvrType();
    }

    /**
     * Create an instance of {@link BillInfoType }
     * 
     */
    public BillInfoType createBillInfoType() {
        return new BillInfoType();
    }

    /**
     * Create an instance of {@link BillKeysType }
     * 
     */
    public BillKeysType createBillKeysType() {
        return new BillKeysType();
    }

    /**
     * Create an instance of {@link BillRecType }
     * 
     */
    public BillRecType createBillRecType() {
        return new BillRecType();
    }

    /**
     * Create an instance of {@link BillRefType }
     * 
     */
    public BillRefType createBillRefType() {
        return new BillRefType();
    }

    /**
     * Create an instance of {@link BillSelType }
     * 
     */
    public BillSelType createBillSelType() {
        return new BillSelType();
    }

    /**
     * Create an instance of {@link BillStatusType }
     * 
     */
    public BillStatusType createBillStatusType() {
        return new BillStatusType();
    }

    /**
     * Create an instance of {@link BillStatusRecType }
     * 
     */
    public BillStatusRecType createBillStatusRecType() {
        return new BillStatusRecType();
    }

    /**
     * Create an instance of {@link BillRetAddrType }
     * 
     */
    public BillRetAddrType createBillRetAddrType() {
        return new BillRetAddrType();
    }

    /**
     * Create an instance of {@link BillerContactType }
     * 
     */
    public BillerContactType createBillerContactType() {
        return new BillerContactType();
    }

    /**
     * Create an instance of {@link BillerIdType }
     * 
     */
    public BillerIdType createBillerIdType() {
        return new BillerIdType();
    }

    /**
     * Create an instance of {@link BillerKeysType }
     * 
     */
    public BillerKeysType createBillerKeysType() {
        return new BillerKeysType();
    }

    /**
     * Create an instance of {@link BillerPayInfoType }
     * 
     */
    public BillerPayInfoType createBillerPayInfoType() {
        return new BillerPayInfoType();
    }

    /**
     * Create an instance of {@link BillerPayeeType }
     * 
     */
    public BillerPayeeType createBillerPayeeType() {
        return new BillerPayeeType();
    }

    /**
     * Create an instance of {@link BillStmtDataType }
     * 
     */
    public BillStmtDataType createBillStmtDataType() {
        return new BillStmtDataType();
    }

    /**
     * Create an instance of {@link BillSummAmtType }
     * 
     */
    public BillSummAmtType createBillSummAmtType() {
        return new BillSummAmtType();
    }

    /**
     * Create an instance of {@link BillSummSubAmtType }
     * 
     */
    public BillSummSubAmtType createBillSummSubAmtType() {
        return new BillSummSubAmtType();
    }

    /**
     * Create an instance of {@link BinaryType }
     * 
     */
    public BinaryType createBinaryType() {
        return new BinaryType();
    }

    /**
     * Create an instance of {@link Binary128Type }
     * 
     */
    public Binary128Type createBinary128Type() {
        return new Binary128Type();
    }

    /**
     * Create an instance of {@link CalExceptionType }
     * 
     */
    public CalExceptionType createCalExceptionType() {
        return new CalExceptionType();
    }

    /**
     * Create an instance of {@link CardAuthRecType }
     * 
     */
    public CardAuthRecType createCardAuthRecType() {
        return new CardAuthRecType();
    }

    /**
     * Create an instance of {@link CardAcctRelEnvrType }
     * 
     */
    public CardAcctRelEnvrType createCardAcctRelEnvrType() {
        return new CardAcctRelEnvrType();
    }

    /**
     * Create an instance of {@link CardAcctRelAuthType }
     * 
     */
    public CardAcctRelAuthType createCardAcctRelAuthType() {
        return new CardAcctRelAuthType();
    }

    /**
     * Create an instance of {@link CardAcctRelInfoType }
     * 
     */
    public CardAcctRelInfoType createCardAcctRelInfoType() {
        return new CardAcctRelInfoType();
    }

    /**
     * Create an instance of {@link CardAcctRelKeysType }
     * 
     */
    public CardAcctRelKeysType createCardAcctRelKeysType() {
        return new CardAcctRelKeysType();
    }

    /**
     * Create an instance of {@link CardAcctRelRefType }
     * 
     */
    public CardAcctRelRefType createCardAcctRelRefType() {
        return new CardAcctRelRefType();
    }

    /**
     * Create an instance of {@link CardAcctRelSelType }
     * 
     */
    public CardAcctRelSelType createCardAcctRelSelType() {
        return new CardAcctRelSelType();
    }

    /**
     * Create an instance of {@link CardAcctRelStatusType }
     * 
     */
    public CardAcctRelStatusType createCardAcctRelStatusType() {
        return new CardAcctRelStatusType();
    }

    /**
     * Create an instance of {@link CardAcctRelStatusRecType }
     * 
     */
    public CardAcctRelStatusRecType createCardAcctRelStatusRecType() {
        return new CardAcctRelStatusRecType();
    }

    /**
     * Create an instance of {@link CardChipDataType }
     * 
     */
    public CardChipDataType createCardChipDataType() {
        return new CardChipDataType();
    }

    /**
     * Create an instance of {@link CardEnvrType }
     * 
     */
    public CardEnvrType createCardEnvrType() {
        return new CardEnvrType();
    }

    /**
     * Create an instance of {@link CardMagDataType }
     * 
     */
    public CardMagDataType createCardMagDataType() {
        return new CardMagDataType();
    }

    /**
     * Create an instance of {@link CardPrefType }
     * 
     */
    public CardPrefType createCardPrefType() {
        return new CardPrefType();
    }

    /**
     * Create an instance of {@link CardPrefTrnType }
     * 
     */
    public CardPrefTrnType createCardPrefTrnType() {
        return new CardPrefTrnType();
    }

    /**
     * Create an instance of {@link CardSelType }
     * 
     */
    public CardSelType createCardSelType() {
        return new CardSelType();
    }

    /**
     * Create an instance of {@link CardStatusRecType }
     * 
     */
    public CardStatusRecType createCardStatusRecType() {
        return new CardStatusRecType();
    }

    /**
     * Create an instance of {@link CardTrnLimitType }
     * 
     */
    public CardTrnLimitType createCardTrnLimitType() {
        return new CardTrnLimitType();
    }

    /**
     * Create an instance of {@link CardUpdateRecType }
     * 
     */
    public CardUpdateRecType createCardUpdateRecType() {
        return new CardUpdateRecType();
    }

    /**
     * Create an instance of {@link CardUpdateRsHdrType }
     * 
     */
    public CardUpdateRsHdrType createCardUpdateRsHdrType() {
        return new CardUpdateRsHdrType();
    }

    /**
     * Create an instance of {@link CashAmtType }
     * 
     */
    public CashAmtType createCashAmtType() {
        return new CashAmtType();
    }

    /**
     * Create an instance of {@link CashSignatureType }
     * 
     */
    public CashSignatureType createCashSignatureType() {
        return new CashSignatureType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link ChkAcceptEnvrType }
     * 
     */
    public ChkAcceptEnvrType createChkAcceptEnvrType() {
        return new ChkAcceptEnvrType();
    }

    /**
     * Create an instance of {@link ChkAcceptInfoType }
     * 
     */
    public ChkAcceptInfoType createChkAcceptInfoType() {
        return new ChkAcceptInfoType();
    }

    /**
     * Create an instance of {@link ChkAcceptKeysType }
     * 
     */
    public ChkAcceptKeysType createChkAcceptKeysType() {
        return new ChkAcceptKeysType();
    }

    /**
     * Create an instance of {@link ChkAcceptRecType }
     * 
     */
    public ChkAcceptRecType createChkAcceptRecType() {
        return new ChkAcceptRecType();
    }

    /**
     * Create an instance of {@link ChkAcceptRefType }
     * 
     */
    public ChkAcceptRefType createChkAcceptRefType() {
        return new ChkAcceptRefType();
    }

    /**
     * Create an instance of {@link ChkAcceptSelType }
     * 
     */
    public ChkAcceptSelType createChkAcceptSelType() {
        return new ChkAcceptSelType();
    }

    /**
     * Create an instance of {@link ChkAcceptStatusType }
     * 
     */
    public ChkAcceptStatusType createChkAcceptStatusType() {
        return new ChkAcceptStatusType();
    }

    /**
     * Create an instance of {@link ChkAcceptStatusRecType }
     * 
     */
    public ChkAcceptStatusRecType createChkAcceptStatusRecType() {
        return new ChkAcceptStatusRecType();
    }

    /**
     * Create an instance of {@link ChkCourtesyAmtType }
     * 
     */
    public ChkCourtesyAmtType createChkCourtesyAmtType() {
        return new ChkCourtesyAmtType();
    }

    /**
     * Create an instance of {@link ChkEnteredAmtType }
     * 
     */
    public ChkEnteredAmtType createChkEnteredAmtType() {
        return new ChkEnteredAmtType();
    }

    /**
     * Create an instance of {@link ChkImgBackType }
     * 
     */
    public ChkImgBackType createChkImgBackType() {
        return new ChkImgBackType();
    }

    /**
     * Create an instance of {@link ChkImgFrontType }
     * 
     */
    public ChkImgFrontType createChkImgFrontType() {
        return new ChkImgFrontType();
    }

    /**
     * Create an instance of {@link ChkIssueEnvrType }
     * 
     */
    public ChkIssueEnvrType createChkIssueEnvrType() {
        return new ChkIssueEnvrType();
    }

    /**
     * Create an instance of {@link ChkIssueKeysType }
     * 
     */
    public ChkIssueKeysType createChkIssueKeysType() {
        return new ChkIssueKeysType();
    }

    /**
     * Create an instance of {@link ChkIssueRefType }
     * 
     */
    public ChkIssueRefType createChkIssueRefType() {
        return new ChkIssueRefType();
    }

    /**
     * Create an instance of {@link ChkIssueSelType }
     * 
     */
    public ChkIssueSelType createChkIssueSelType() {
        return new ChkIssueSelType();
    }

    /**
     * Create an instance of {@link ChkIssueStatusType }
     * 
     */
    public ChkIssueStatusType createChkIssueStatusType() {
        return new ChkIssueStatusType();
    }

    /**
     * Create an instance of {@link ChkIssueStatusRecType }
     * 
     */
    public ChkIssueStatusRecType createChkIssueStatusRecType() {
        return new ChkIssueStatusRecType();
    }

    /**
     * Create an instance of {@link ChkNumRangeType }
     * 
     */
    public ChkNumRangeType createChkNumRangeType() {
        return new ChkNumRangeType();
    }

    /**
     * Create an instance of {@link ChkOrdEnvrType }
     * 
     */
    public ChkOrdEnvrType createChkOrdEnvrType() {
        return new ChkOrdEnvrType();
    }

    /**
     * Create an instance of {@link ChkOrdInfoType }
     * 
     */
    public ChkOrdInfoType createChkOrdInfoType() {
        return new ChkOrdInfoType();
    }

    /**
     * Create an instance of {@link ChkOrdKeysType }
     * 
     */
    public ChkOrdKeysType createChkOrdKeysType() {
        return new ChkOrdKeysType();
    }

    /**
     * Create an instance of {@link ChkOrdRecType }
     * 
     */
    public ChkOrdRecType createChkOrdRecType() {
        return new ChkOrdRecType();
    }

    /**
     * Create an instance of {@link ChkOrdRefType }
     * 
     */
    public ChkOrdRefType createChkOrdRefType() {
        return new ChkOrdRefType();
    }

    /**
     * Create an instance of {@link ChkOrdSelType }
     * 
     */
    public ChkOrdSelType createChkOrdSelType() {
        return new ChkOrdSelType();
    }

    /**
     * Create an instance of {@link ChkOrdStatusType }
     * 
     */
    public ChkOrdStatusType createChkOrdStatusType() {
        return new ChkOrdStatusType();
    }

    /**
     * Create an instance of {@link ChkOrdStatusRecType }
     * 
     */
    public ChkOrdStatusRecType createChkOrdStatusRecType() {
        return new ChkOrdStatusRecType();
    }

    /**
     * Create an instance of {@link ChksumType }
     * 
     */
    public ChksumType createChksumType() {
        return new ChksumType();
    }

    /**
     * Create an instance of {@link ChksumEnvrType }
     * 
     */
    public ChksumEnvrType createChksumEnvrType() {
        return new ChksumEnvrType();
    }

    /**
     * Create an instance of {@link ChksumInfoType }
     * 
     */
    public ChksumInfoType createChksumInfoType() {
        return new ChksumInfoType();
    }

    /**
     * Create an instance of {@link ChksumKeysType }
     * 
     */
    public ChksumKeysType createChksumKeysType() {
        return new ChksumKeysType();
    }

    /**
     * Create an instance of {@link ChksumRecType }
     * 
     */
    public ChksumRecType createChksumRecType() {
        return new ChksumRecType();
    }

    /**
     * Create an instance of {@link ChksumRefType }
     * 
     */
    public ChksumRefType createChksumRefType() {
        return new ChksumRefType();
    }

    /**
     * Create an instance of {@link ChksumSelType }
     * 
     */
    public ChksumSelType createChksumSelType() {
        return new ChksumSelType();
    }

    /**
     * Create an instance of {@link ChksumStatusType }
     * 
     */
    public ChksumStatusType createChksumStatusType() {
        return new ChksumStatusType();
    }

    /**
     * Create an instance of {@link ChksumStatusRecType }
     * 
     */
    public ChksumStatusRecType createChksumStatusRecType() {
        return new ChksumStatusRecType();
    }

    /**
     * Create an instance of {@link ChkPrintType }
     * 
     */
    public ChkPrintType createChkPrintType() {
        return new ChkPrintType();
    }

    /**
     * Create an instance of {@link ClearingLangCodeType }
     * 
     */
    public ClearingLangCodeType createClearingLangCodeType() {
        return new ClearingLangCodeType();
    }

    /**
     * Create an instance of {@link ClientAppType }
     * 
     */
    public ClientAppType createClientAppType() {
        return new ClientAppType();
    }

    /**
     * Create an instance of {@link CompRemitStmtEnvrType }
     * 
     */
    public CompRemitStmtEnvrType createCompRemitStmtEnvrType() {
        return new CompRemitStmtEnvrType();
    }

    /**
     * Create an instance of {@link CompRemitStmtInfoType }
     * 
     */
    public CompRemitStmtInfoType createCompRemitStmtInfoType() {
        return new CompRemitStmtInfoType();
    }

    /**
     * Create an instance of {@link CompRemitStmtKeysType }
     * 
     */
    public CompRemitStmtKeysType createCompRemitStmtKeysType() {
        return new CompRemitStmtKeysType();
    }

    /**
     * Create an instance of {@link CompRemitStmtRecType }
     * 
     */
    public CompRemitStmtRecType createCompRemitStmtRecType() {
        return new CompRemitStmtRecType();
    }

    /**
     * Create an instance of {@link CompRemitStmtRefType }
     * 
     */
    public CompRemitStmtRefType createCompRemitStmtRefType() {
        return new CompRemitStmtRefType();
    }

    /**
     * Create an instance of {@link CompRemitStmtSelType }
     * 
     */
    public CompRemitStmtSelType createCompRemitStmtSelType() {
        return new CompRemitStmtSelType();
    }

    /**
     * Create an instance of {@link CompRemitStmtStatusType }
     * 
     */
    public CompRemitStmtStatusType createCompRemitStmtStatusType() {
        return new CompRemitStmtStatusType();
    }

    /**
     * Create an instance of {@link CompRemitStmtStatusRecType }
     * 
     */
    public CompRemitStmtStatusRecType createCompRemitStmtStatusRecType() {
        return new CompRemitStmtStatusRecType();
    }

    /**
     * Create an instance of {@link CompositeCurAmtType }
     * 
     */
    public CompositeCurAmtType createCompositeCurAmtType() {
        return new CompositeCurAmtType();
    }

    /**
     * Create an instance of {@link ContraCurCodeType }
     * 
     */
    public ContraCurCodeType createContraCurCodeType() {
        return new ContraCurCodeType();
    }

    /**
     * Create an instance of {@link CounterpartyDataType }
     * 
     */
    public CounterpartyDataType createCounterpartyDataType() {
        return new CounterpartyDataType();
    }

    /**
     * Create an instance of {@link CreditAthEnvrType }
     * 
     */
    public CreditAthEnvrType createCreditAthEnvrType() {
        return new CreditAthEnvrType();
    }

    /**
     * Create an instance of {@link CreditAthInfoType }
     * 
     */
    public CreditAthInfoType createCreditAthInfoType() {
        return new CreditAthInfoType();
    }

    /**
     * Create an instance of {@link CreditAthKeysType }
     * 
     */
    public CreditAthKeysType createCreditAthKeysType() {
        return new CreditAthKeysType();
    }

    /**
     * Create an instance of {@link CreditAthRecType }
     * 
     */
    public CreditAthRecType createCreditAthRecType() {
        return new CreditAthRecType();
    }

    /**
     * Create an instance of {@link CreditAthRefType }
     * 
     */
    public CreditAthRefType createCreditAthRefType() {
        return new CreditAthRefType();
    }

    /**
     * Create an instance of {@link CreditAthSelType }
     * 
     */
    public CreditAthSelType createCreditAthSelType() {
        return new CreditAthSelType();
    }

    /**
     * Create an instance of {@link CreditAthStatusType }
     * 
     */
    public CreditAthStatusType createCreditAthStatusType() {
        return new CreditAthStatusType();
    }

    /**
     * Create an instance of {@link CreditAthStatusRecType }
     * 
     */
    public CreditAthStatusRecType createCreditAthStatusRecType() {
        return new CreditAthStatusRecType();
    }

    /**
     * Create an instance of {@link CreditAuthType }
     * 
     */
    public CreditAuthType createCreditAuthType() {
        return new CreditAuthType();
    }

    /**
     * Create an instance of {@link CreditEnvrType }
     * 
     */
    public CreditEnvrType createCreditEnvrType() {
        return new CreditEnvrType();
    }

    /**
     * Create an instance of {@link CreditKeysType }
     * 
     */
    public CreditKeysType createCreditKeysType() {
        return new CreditKeysType();
    }

    /**
     * Create an instance of {@link CreditMediaCashDataType }
     * 
     */
    public CreditMediaCashDataType createCreditMediaCashDataType() {
        return new CreditMediaCashDataType();
    }

    /**
     * Create an instance of {@link CreditMediaItemType }
     * 
     */
    public CreditMediaItemType createCreditMediaItemType() {
        return new CreditMediaItemType();
    }

    /**
     * Create an instance of {@link CreditRecType }
     * 
     */
    public CreditRecType createCreditRecType() {
        return new CreditRecType();
    }

    /**
     * Create an instance of {@link CreditRefType }
     * 
     */
    public CreditRefType createCreditRefType() {
        return new CreditRefType();
    }

    /**
     * Create an instance of {@link CreditSelType }
     * 
     */
    public CreditSelType createCreditSelType() {
        return new CreditSelType();
    }

    /**
     * Create an instance of {@link CreditStatusType }
     * 
     */
    public CreditStatusType createCreditStatusType() {
        return new CreditStatusType();
    }

    /**
     * Create an instance of {@link CreditStatusRecType }
     * 
     */
    public CreditStatusRecType createCreditStatusRecType() {
        return new CreditStatusRecType();
    }

    /**
     * Create an instance of {@link CreditStmtDataType }
     * 
     */
    public CreditStmtDataType createCreditStmtDataType() {
        return new CreditStmtDataType();
    }

    /**
     * Create an instance of {@link CryptPswdType }
     * 
     */
    public CryptPswdType createCryptPswdType() {
        return new CryptPswdType();
    }

    /**
     * Create an instance of {@link CryptSecretType }
     * 
     */
    public CryptSecretType createCryptSecretType() {
        return new CryptSecretType();
    }

    /**
     * Create an instance of {@link CursorType }
     * 
     */
    public CursorType createCursorType() {
        return new CursorType();
    }

    /**
     * Create an instance of {@link CustDiscEnvrType }
     * 
     */
    public CustDiscEnvrType createCustDiscEnvrType() {
        return new CustDiscEnvrType();
    }

    /**
     * Create an instance of {@link CustDiscInfoType }
     * 
     */
    public CustDiscInfoType createCustDiscInfoType() {
        return new CustDiscInfoType();
    }

    /**
     * Create an instance of {@link CustDiscKeysType }
     * 
     */
    public CustDiscKeysType createCustDiscKeysType() {
        return new CustDiscKeysType();
    }

    /**
     * Create an instance of {@link CustDiscRecType }
     * 
     */
    public CustDiscRecType createCustDiscRecType() {
        return new CustDiscRecType();
    }

    /**
     * Create an instance of {@link CustDiscRefType }
     * 
     */
    public CustDiscRefType createCustDiscRefType() {
        return new CustDiscRefType();
    }

    /**
     * Create an instance of {@link CustDiscSelType }
     * 
     */
    public CustDiscSelType createCustDiscSelType() {
        return new CustDiscSelType();
    }

    /**
     * Create an instance of {@link CustDiscStatusType }
     * 
     */
    public CustDiscStatusType createCustDiscStatusType() {
        return new CustDiscStatusType();
    }

    /**
     * Create an instance of {@link CustDiscStatusRecType }
     * 
     */
    public CustDiscStatusRecType createCustDiscStatusRecType() {
        return new CustDiscStatusRecType();
    }

    /**
     * Create an instance of {@link CustPayeeEnvrType }
     * 
     */
    public CustPayeeEnvrType createCustPayeeEnvrType() {
        return new CustPayeeEnvrType();
    }

    /**
     * Create an instance of {@link CustPayeeInfoType }
     * 
     */
    public CustPayeeInfoType createCustPayeeInfoType() {
        return new CustPayeeInfoType();
    }

    /**
     * Create an instance of {@link CustPayeeKeysType }
     * 
     */
    public CustPayeeKeysType createCustPayeeKeysType() {
        return new CustPayeeKeysType();
    }

    /**
     * Create an instance of {@link CustPayeeRecType }
     * 
     */
    public CustPayeeRecType createCustPayeeRecType() {
        return new CustPayeeRecType();
    }

    /**
     * Create an instance of {@link CustPayeeRefType }
     * 
     */
    public CustPayeeRefType createCustPayeeRefType() {
        return new CustPayeeRefType();
    }

    /**
     * Create an instance of {@link CustPayeeSelType }
     * 
     */
    public CustPayeeSelType createCustPayeeSelType() {
        return new CustPayeeSelType();
    }

    /**
     * Create an instance of {@link CustPayeeStatusType }
     * 
     */
    public CustPayeeStatusType createCustPayeeStatusType() {
        return new CustPayeeStatusType();
    }

    /**
     * Create an instance of {@link CustPayeeStatusRecType }
     * 
     */
    public CustPayeeStatusRecType createCustPayeeStatusRecType() {
        return new CustPayeeStatusRecType();
    }

    /**
     * Create an instance of {@link CustSvcEnvrType }
     * 
     */
    public CustSvcEnvrType createCustSvcEnvrType() {
        return new CustSvcEnvrType();
    }

    /**
     * Create an instance of {@link CustSvcIdType }
     * 
     */
    public CustSvcIdType createCustSvcIdType() {
        return new CustSvcIdType();
    }

    /**
     * Create an instance of {@link CustSvcInfoType }
     * 
     */
    public CustSvcInfoType createCustSvcInfoType() {
        return new CustSvcInfoType();
    }

    /**
     * Create an instance of {@link CustSvcKeysType }
     * 
     */
    public CustSvcKeysType createCustSvcKeysType() {
        return new CustSvcKeysType();
    }

    /**
     * Create an instance of {@link CustSvcRecType }
     * 
     */
    public CustSvcRecType createCustSvcRecType() {
        return new CustSvcRecType();
    }

    /**
     * Create an instance of {@link CustSvcRefType }
     * 
     */
    public CustSvcRefType createCustSvcRefType() {
        return new CustSvcRefType();
    }

    /**
     * Create an instance of {@link CustSvcSelType }
     * 
     */
    public CustSvcSelType createCustSvcSelType() {
        return new CustSvcSelType();
    }

    /**
     * Create an instance of {@link CustSvcStatusType }
     * 
     */
    public CustSvcStatusType createCustSvcStatusType() {
        return new CustSvcStatusType();
    }

    /**
     * Create an instance of {@link CustSvcStatusRecType }
     * 
     */
    public CustSvcStatusRecType createCustSvcStatusRecType() {
        return new CustSvcStatusRecType();
    }

    /**
     * Create an instance of {@link DebitAthEnvrType }
     * 
     */
    public DebitAthEnvrType createDebitAthEnvrType() {
        return new DebitAthEnvrType();
    }

    /**
     * Create an instance of {@link DebitAthInfoType }
     * 
     */
    public DebitAthInfoType createDebitAthInfoType() {
        return new DebitAthInfoType();
    }

    /**
     * Create an instance of {@link DebitAthKeysType }
     * 
     */
    public DebitAthKeysType createDebitAthKeysType() {
        return new DebitAthKeysType();
    }

    /**
     * Create an instance of {@link DebitAthSelType }
     * 
     */
    public DebitAthSelType createDebitAthSelType() {
        return new DebitAthSelType();
    }

    /**
     * Create an instance of {@link DebitAthStatusType }
     * 
     */
    public DebitAthStatusType createDebitAthStatusType() {
        return new DebitAthStatusType();
    }

    /**
     * Create an instance of {@link DebitAthStatusRecType }
     * 
     */
    public DebitAthStatusRecType createDebitAthStatusRecType() {
        return new DebitAthStatusRecType();
    }

    /**
     * Create an instance of {@link DebitEnvrType }
     * 
     */
    public DebitEnvrType createDebitEnvrType() {
        return new DebitEnvrType();
    }

    /**
     * Create an instance of {@link DebitInfoType }
     * 
     */
    public DebitInfoType createDebitInfoType() {
        return new DebitInfoType();
    }

    /**
     * Create an instance of {@link DebitKeysType }
     * 
     */
    public DebitKeysType createDebitKeysType() {
        return new DebitKeysType();
    }

    /**
     * Create an instance of {@link DebitRecType }
     * 
     */
    public DebitRecType createDebitRecType() {
        return new DebitRecType();
    }

    /**
     * Create an instance of {@link DebitRefType }
     * 
     */
    public DebitRefType createDebitRefType() {
        return new DebitRefType();
    }

    /**
     * Create an instance of {@link DebitSelType }
     * 
     */
    public DebitSelType createDebitSelType() {
        return new DebitSelType();
    }

    /**
     * Create an instance of {@link DebitStatusType }
     * 
     */
    public DebitStatusType createDebitStatusType() {
        return new DebitStatusType();
    }

    /**
     * Create an instance of {@link DebitStatusRecType }
     * 
     */
    public DebitStatusRecType createDebitStatusRecType() {
        return new DebitStatusRecType();
    }

    /**
     * Create an instance of {@link DebtorType }
     * 
     */
    public DebtorType createDebtorType() {
        return new DebtorType();
    }

    /**
     * Create an instance of {@link DeleteSvcAcctIdType }
     * 
     */
    public DeleteSvcAcctIdType createDeleteSvcAcctIdType() {
        return new DeleteSvcAcctIdType();
    }

    /**
     * Create an instance of {@link DelinqAgingType }
     * 
     */
    public DelinqAgingType createDelinqAgingType() {
        return new DelinqAgingType();
    }

    /**
     * Create an instance of {@link DepAppEnvrType }
     * 
     */
    public DepAppEnvrType createDepAppEnvrType() {
        return new DepAppEnvrType();
    }

    /**
     * Create an instance of {@link DepAppInfoType }
     * 
     */
    public DepAppInfoType createDepAppInfoType() {
        return new DepAppInfoType();
    }

    /**
     * Create an instance of {@link DepAppKeysType }
     * 
     */
    public DepAppKeysType createDepAppKeysType() {
        return new DepAppKeysType();
    }

    /**
     * Create an instance of {@link DepAppRecType }
     * 
     */
    public DepAppRecType createDepAppRecType() {
        return new DepAppRecType();
    }

    /**
     * Create an instance of {@link DepAppRefType }
     * 
     */
    public DepAppRefType createDepAppRefType() {
        return new DepAppRefType();
    }

    /**
     * Create an instance of {@link DepAppSelType }
     * 
     */
    public DepAppSelType createDepAppSelType() {
        return new DepAppSelType();
    }

    /**
     * Create an instance of {@link DepAppStatusType }
     * 
     */
    public DepAppStatusType createDepAppStatusType() {
        return new DepAppStatusType();
    }

    /**
     * Create an instance of {@link DepAppStatusRecType }
     * 
     */
    public DepAppStatusRecType createDepAppStatusRecType() {
        return new DepAppStatusRecType();
    }

    /**
     * Create an instance of {@link DepApplicantType }
     * 
     */
    public DepApplicantType createDepApplicantType() {
        return new DepApplicantType();
    }

    /**
     * Create an instance of {@link DepAppAcctIdentType }
     * 
     */
    public DepAppAcctIdentType createDepAppAcctIdentType() {
        return new DepAppAcctIdentType();
    }

    /**
     * Create an instance of {@link DepBkOrdEnvrType }
     * 
     */
    public DepBkOrdEnvrType createDepBkOrdEnvrType() {
        return new DepBkOrdEnvrType();
    }

    /**
     * Create an instance of {@link DepBkOrdInfoType }
     * 
     */
    public DepBkOrdInfoType createDepBkOrdInfoType() {
        return new DepBkOrdInfoType();
    }

    /**
     * Create an instance of {@link DepBkOrdKeysType }
     * 
     */
    public DepBkOrdKeysType createDepBkOrdKeysType() {
        return new DepBkOrdKeysType();
    }

    /**
     * Create an instance of {@link DepBkOrdRecType }
     * 
     */
    public DepBkOrdRecType createDepBkOrdRecType() {
        return new DepBkOrdRecType();
    }

    /**
     * Create an instance of {@link DepBkOrdRefType }
     * 
     */
    public DepBkOrdRefType createDepBkOrdRefType() {
        return new DepBkOrdRefType();
    }

    /**
     * Create an instance of {@link DepBkOrdSelType }
     * 
     */
    public DepBkOrdSelType createDepBkOrdSelType() {
        return new DepBkOrdSelType();
    }

    /**
     * Create an instance of {@link DepBkOrdStatusType }
     * 
     */
    public DepBkOrdStatusType createDepBkOrdStatusType() {
        return new DepBkOrdStatusType();
    }

    /**
     * Create an instance of {@link DepBkOrdStatusRecType }
     * 
     */
    public DepBkOrdStatusRecType createDepBkOrdStatusRecType() {
        return new DepBkOrdStatusRecType();
    }

    /**
     * Create an instance of {@link DfltPmtDataType }
     * 
     */
    public DfltPmtDataType createDfltPmtDataType() {
        return new DfltPmtDataType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link DocCtrlInType }
     * 
     */
    public DocCtrlInType createDocCtrlInType() {
        return new DocCtrlInType();
    }

    /**
     * Create an instance of {@link DocCtrlOutType }
     * 
     */
    public DocCtrlOutType createDocCtrlOutType() {
        return new DocCtrlOutType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link DevAppComponentType }
     * 
     */
    public DevAppComponentType createDevAppComponentType() {
        return new DevAppComponentType();
    }

    /**
     * Create an instance of {@link DevCdmBinType }
     * 
     */
    public DevCdmBinType createDevCdmBinType() {
        return new DevCdmBinType();
    }

    /**
     * Create an instance of {@link DevCdmBinCurCodeType }
     * 
     */
    public DevCdmBinCurCodeType createDevCdmBinCurCodeType() {
        return new DevCdmBinCurCodeType();
    }

    /**
     * Create an instance of {@link DevCdmPositionType }
     * 
     */
    public DevCdmPositionType createDevCdmPositionType() {
        return new DevCdmPositionType();
    }

    /**
     * Create an instance of {@link DevCimBinType }
     * 
     */
    public DevCimBinType createDevCimBinType() {
        return new DevCimBinType();
    }

    /**
     * Create an instance of {@link DevCimBinCurCodeType }
     * 
     */
    public DevCimBinCurCodeType createDevCimBinCurCodeType() {
        return new DevCimBinCurCodeType();
    }

    /**
     * Create an instance of {@link DevCimPositionType }
     * 
     */
    public DevCimPositionType createDevCimPositionType() {
        return new DevCimPositionType();
    }

    /**
     * Create an instance of {@link DevDetailType }
     * 
     */
    public DevDetailType createDevDetailType() {
        return new DevDetailType();
    }

    /**
     * Create an instance of {@link DevDetailAlmType }
     * 
     */
    public DevDetailAlmType createDevDetailAlmType() {
        return new DevDetailAlmType();
    }

    /**
     * Create an instance of {@link DevDetailAppType }
     * 
     */
    public DevDetailAppType createDevDetailAppType() {
        return new DevDetailAppType();
    }

    /**
     * Create an instance of {@link DevDetailCamType }
     * 
     */
    public DevDetailCamType createDevDetailCamType() {
        return new DevDetailCamType();
    }

    /**
     * Create an instance of {@link DevDetailCdmType }
     * 
     */
    public DevDetailCdmType createDevDetailCdmType() {
        return new DevDetailCdmType();
    }

    /**
     * Create an instance of {@link DevDetailChkType }
     * 
     */
    public DevDetailChkType createDevDetailChkType() {
        return new DevDetailChkType();
    }

    /**
     * Create an instance of {@link DevDetailCimType }
     * 
     */
    public DevDetailCimType createDevDetailCimType() {
        return new DevDetailCimType();
    }

    /**
     * Create an instance of {@link DevDetailDepType }
     * 
     */
    public DevDetailDepType createDevDetailDepType() {
        return new DevDetailDepType();
    }

    /**
     * Create an instance of {@link DevDetailIdcType }
     * 
     */
    public DevDetailIdcType createDevDetailIdcType() {
        return new DevDetailIdcType();
    }

    /**
     * Create an instance of {@link DevDetailPINType }
     * 
     */
    public DevDetailPINType createDevDetailPINType() {
        return new DevDetailPINType();
    }

    /**
     * Create an instance of {@link DevDetailPtrType }
     * 
     */
    public DevDetailPtrType createDevDetailPtrType() {
        return new DevDetailPtrType();
    }

    /**
     * Create an instance of {@link DevDetailSiuType }
     * 
     */
    public DevDetailSiuType createDevDetailSiuType() {
        return new DevDetailSiuType();
    }

    /**
     * Create an instance of {@link DevDetailTtuType }
     * 
     */
    public DevDetailTtuType createDevDetailTtuType() {
        return new DevDetailTtuType();
    }

    /**
     * Create an instance of {@link DevDetailVdmType }
     * 
     */
    public DevDetailVdmType createDevDetailVdmType() {
        return new DevDetailVdmType();
    }

    /**
     * Create an instance of {@link DevEnvrType }
     * 
     */
    public DevEnvrType createDevEnvrType() {
        return new DevEnvrType();
    }

    /**
     * Create an instance of {@link DevIdcRetainedCardType }
     * 
     */
    public DevIdcRetainedCardType createDevIdcRetainedCardType() {
        return new DevIdcRetainedCardType();
    }

    /**
     * Create an instance of {@link DevInfoType }
     * 
     */
    public DevInfoType createDevInfoType() {
        return new DevInfoType();
    }

    /**
     * Create an instance of {@link DevKeysType }
     * 
     */
    public DevKeysType createDevKeysType() {
        return new DevKeysType();
    }

    /**
     * Create an instance of {@link DevPlatformDataType }
     * 
     */
    public DevPlatformDataType createDevPlatformDataType() {
        return new DevPlatformDataType();
    }

    /**
     * Create an instance of {@link DevPlatformXfsType }
     * 
     */
    public DevPlatformXfsType createDevPlatformXfsType() {
        return new DevPlatformXfsType();
    }

    /**
     * Create an instance of {@link DevPtrRetractBinType }
     * 
     */
    public DevPtrRetractBinType createDevPtrRetractBinType() {
        return new DevPtrRetractBinType();
    }

    /**
     * Create an instance of {@link DevPtrSupplyType }
     * 
     */
    public DevPtrSupplyType createDevPtrSupplyType() {
        return new DevPtrSupplyType();
    }

    /**
     * Create an instance of {@link DevRecType }
     * 
     */
    public DevRecType createDevRecType() {
        return new DevRecType();
    }

    /**
     * Create an instance of {@link DevRefType }
     * 
     */
    public DevRefType createDevRefType() {
        return new DevRefType();
    }

    /**
     * Create an instance of {@link DevSelType }
     * 
     */
    public DevSelType createDevSelType() {
        return new DevSelType();
    }

    /**
     * Create an instance of {@link DevSiuAuxiliaryStatusType }
     * 
     */
    public DevSiuAuxiliaryStatusType createDevSiuAuxiliaryStatusType() {
        return new DevSiuAuxiliaryStatusType();
    }

    /**
     * Create an instance of {@link DevSiuDoorStatusType }
     * 
     */
    public DevSiuDoorStatusType createDevSiuDoorStatusType() {
        return new DevSiuDoorStatusType();
    }

    /**
     * Create an instance of {@link DevSiuGuidelightStatusType }
     * 
     */
    public DevSiuGuidelightStatusType createDevSiuGuidelightStatusType() {
        return new DevSiuGuidelightStatusType();
    }

    /**
     * Create an instance of {@link DevSiuIndicatorStatusType }
     * 
     */
    public DevSiuIndicatorStatusType createDevSiuIndicatorStatusType() {
        return new DevSiuIndicatorStatusType();
    }

    /**
     * Create an instance of {@link DevSiuRemoteStatusType }
     * 
     */
    public DevSiuRemoteStatusType createDevSiuRemoteStatusType() {
        return new DevSiuRemoteStatusType();
    }

    /**
     * Create an instance of {@link DevSiuSensorStatusType }
     * 
     */
    public DevSiuSensorStatusType createDevSiuSensorStatusType() {
        return new DevSiuSensorStatusType();
    }

    /**
     * Create an instance of {@link DevSiuTypeType }
     * 
     */
    public DevSiuTypeType createDevSiuTypeType() {
        return new DevSiuTypeType();
    }

    /**
     * Create an instance of {@link DevStatusType }
     * 
     */
    public DevStatusType createDevStatusType() {
        return new DevStatusType();
    }

    /**
     * Create an instance of {@link DevStatusRecType }
     * 
     */
    public DevStatusRecType createDevStatusRecType() {
        return new DevStatusRecType();
    }

    /**
     * Create an instance of {@link DiscEnvrType }
     * 
     */
    public DiscEnvrType createDiscEnvrType() {
        return new DiscEnvrType();
    }

    /**
     * Create an instance of {@link DiscInfoType }
     * 
     */
    public DiscInfoType createDiscInfoType() {
        return new DiscInfoType();
    }

    /**
     * Create an instance of {@link DiscKeysType }
     * 
     */
    public DiscKeysType createDiscKeysType() {
        return new DiscKeysType();
    }

    /**
     * Create an instance of {@link DiscRecType }
     * 
     */
    public DiscRecType createDiscRecType() {
        return new DiscRecType();
    }

    /**
     * Create an instance of {@link DiscRefType }
     * 
     */
    public DiscRefType createDiscRefType() {
        return new DiscRefType();
    }

    /**
     * Create an instance of {@link DiscSelType }
     * 
     */
    public DiscSelType createDiscSelType() {
        return new DiscSelType();
    }

    /**
     * Create an instance of {@link DiscStatusType }
     * 
     */
    public DiscStatusType createDiscStatusType() {
        return new DiscStatusType();
    }

    /**
     * Create an instance of {@link DiscStatusRecType }
     * 
     */
    public DiscStatusRecType createDiscStatusRecType() {
        return new DiscStatusRecType();
    }

    /**
     * Create an instance of {@link DueDtRangeType }
     * 
     */
    public DueDtRangeType createDueDtRangeType() {
        return new DueDtRangeType();
    }

    /**
     * Create an instance of {@link EMVRqDataType }
     * 
     */
    public EMVRqDataType createEMVRqDataType() {
        return new EMVRqDataType();
    }

    /**
     * Create an instance of {@link EMVRsDataType }
     * 
     */
    public EMVRsDataType createEMVRsDataType() {
        return new EMVRsDataType();
    }

    /**
     * Create an instance of {@link EffTimeFrameType }
     * 
     */
    public EffTimeFrameType createEffTimeFrameType() {
        return new EffTimeFrameType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link ExtAcctBalType }
     * 
     */
    public ExtAcctBalType createExtAcctBalType() {
        return new ExtAcctBalType();
    }

    /**
     * Create an instance of {@link FSPayeeType }
     * 
     */
    public FSPayeeType createFSPayeeType() {
        return new FSPayeeType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FeeChargeAllocType }
     * 
     */
    public FeeChargeAllocType createFeeChargeAllocType() {
        return new FeeChargeAllocType();
    }

    /**
     * Create an instance of {@link FeeRqHdrType }
     * 
     */
    public FeeRqHdrType createFeeRqHdrType() {
        return new FeeRqHdrType();
    }

    /**
     * Create an instance of {@link FeeRsHdrType }
     * 
     */
    public FeeRsHdrType createFeeRsHdrType() {
        return new FeeRsHdrType();
    }

    /**
     * Create an instance of {@link FinancialAmtType }
     * 
     */
    public FinancialAmtType createFinancialAmtType() {
        return new FinancialAmtType();
    }

    /**
     * Create an instance of {@link ForExDealEnvrType }
     * 
     */
    public ForExDealEnvrType createForExDealEnvrType() {
        return new ForExDealEnvrType();
    }

    /**
     * Create an instance of {@link ForExDealInfoType }
     * 
     */
    public ForExDealInfoType createForExDealInfoType() {
        return new ForExDealInfoType();
    }

    /**
     * Create an instance of {@link ForExDealRecType }
     * 
     */
    public ForExDealRecType createForExDealRecType() {
        return new ForExDealRecType();
    }

    /**
     * Create an instance of {@link ForExDealRefType }
     * 
     */
    public ForExDealRefType createForExDealRefType() {
        return new ForExDealRefType();
    }

    /**
     * Create an instance of {@link ForExDealStatusType }
     * 
     */
    public ForExDealStatusType createForExDealStatusType() {
        return new ForExDealStatusType();
    }

    /**
     * Create an instance of {@link ForExDealKeysType }
     * 
     */
    public ForExDealKeysType createForExDealKeysType() {
        return new ForExDealKeysType();
    }

    /**
     * Create an instance of {@link ForExDealSelType }
     * 
     */
    public ForExDealSelType createForExDealSelType() {
        return new ForExDealSelType();
    }

    /**
     * Create an instance of {@link ForExDealStatusRecType }
     * 
     */
    public ForExDealStatusRecType createForExDealStatusRecType() {
        return new ForExDealStatusRecType();
    }

    /**
     * Create an instance of {@link ForExHomeRateType }
     * 
     */
    public ForExHomeRateType createForExHomeRateType() {
        return new ForExHomeRateType();
    }

    /**
     * Create an instance of {@link ForExQuoteKeysType }
     * 
     */
    public ForExQuoteKeysType createForExQuoteKeysType() {
        return new ForExQuoteKeysType();
    }

    /**
     * Create an instance of {@link ForExQuoteEnvrType }
     * 
     */
    public ForExQuoteEnvrType createForExQuoteEnvrType() {
        return new ForExQuoteEnvrType();
    }

    /**
     * Create an instance of {@link ForExQuoteInfoType }
     * 
     */
    public ForExQuoteInfoType createForExQuoteInfoType() {
        return new ForExQuoteInfoType();
    }

    /**
     * Create an instance of {@link ForExQuoteRefType }
     * 
     */
    public ForExQuoteRefType createForExQuoteRefType() {
        return new ForExQuoteRefType();
    }

    /**
     * Create an instance of {@link ForExQuoteSelType }
     * 
     */
    public ForExQuoteSelType createForExQuoteSelType() {
        return new ForExQuoteSelType();
    }

    /**
     * Create an instance of {@link ForExQuoteStatusType }
     * 
     */
    public ForExQuoteStatusType createForExQuoteStatusType() {
        return new ForExQuoteStatusType();
    }

    /**
     * Create an instance of {@link ForExQuoteStatusRecType }
     * 
     */
    public ForExQuoteStatusRecType createForExQuoteStatusRecType() {
        return new ForExQuoteStatusRecType();
    }

    /**
     * Create an instance of {@link ForExRateSheetEnvrType }
     * 
     */
    public ForExRateSheetEnvrType createForExRateSheetEnvrType() {
        return new ForExRateSheetEnvrType();
    }

    /**
     * Create an instance of {@link ForExRateSheetKeysType }
     * 
     */
    public ForExRateSheetKeysType createForExRateSheetKeysType() {
        return new ForExRateSheetKeysType();
    }

    /**
     * Create an instance of {@link ForExRateSheetRefType }
     * 
     */
    public ForExRateSheetRefType createForExRateSheetRefType() {
        return new ForExRateSheetRefType();
    }

    /**
     * Create an instance of {@link ForExRateSheetStatusType }
     * 
     */
    public ForExRateSheetStatusType createForExRateSheetStatusType() {
        return new ForExRateSheetStatusType();
    }

    /**
     * Create an instance of {@link ForExRateSheetStatusRecType }
     * 
     */
    public ForExRateSheetStatusRecType createForExRateSheetStatusRecType() {
        return new ForExRateSheetStatusRecType();
    }

    /**
     * Create an instance of {@link ForExValDtTimeFrameType }
     * 
     */
    public ForExValDtTimeFrameType createForExValDtTimeFrameType() {
        return new ForExValDtTimeFrameType();
    }

    /**
     * Create an instance of {@link FormImgType }
     * 
     */
    public FormImgType createFormImgType() {
        return new FormImgType();
    }

    /**
     * Create an instance of {@link GovIssuedIdentType }
     * 
     */
    public GovIssuedIdentType createGovIssuedIdentType() {
        return new GovIssuedIdentType();
    }

    /**
     * Create an instance of {@link HighCurAmtType }
     * 
     */
    public HighCurAmtType createHighCurAmtType() {
        return new HighCurAmtType();
    }

    /**
     * Create an instance of {@link HomeCurCodeType }
     * 
     */
    public HomeCurCodeType createHomeCurCodeType() {
        return new HomeCurCodeType();
    }

    /**
     * Create an instance of {@link ICCUpdateEnvrType }
     * 
     */
    public ICCUpdateEnvrType createICCUpdateEnvrType() {
        return new ICCUpdateEnvrType();
    }

    /**
     * Create an instance of {@link ICCUpdateInfoType }
     * 
     */
    public ICCUpdateInfoType createICCUpdateInfoType() {
        return new ICCUpdateInfoType();
    }

    /**
     * Create an instance of {@link ICCUpdateRecType }
     * 
     */
    public ICCUpdateRecType createICCUpdateRecType() {
        return new ICCUpdateRecType();
    }

    /**
     * Create an instance of {@link ICCUpdateStatusType }
     * 
     */
    public ICCUpdateStatusType createICCUpdateStatusType() {
        return new ICCUpdateStatusType();
    }

    /**
     * Create an instance of {@link ICCUpdateKeysType }
     * 
     */
    public ICCUpdateKeysType createICCUpdateKeysType() {
        return new ICCUpdateKeysType();
    }

    /**
     * Create an instance of {@link ICCUpdateRefType }
     * 
     */
    public ICCUpdateRefType createICCUpdateRefType() {
        return new ICCUpdateRefType();
    }

    /**
     * Create an instance of {@link ICCUpdateSelType }
     * 
     */
    public ICCUpdateSelType createICCUpdateSelType() {
        return new ICCUpdateSelType();
    }

    /**
     * Create an instance of {@link ICCUpdateStatusRecType }
     * 
     */
    public ICCUpdateStatusRecType createICCUpdateStatusRecType() {
        return new ICCUpdateStatusRecType();
    }

    /**
     * Create an instance of {@link IdentCharacterDataType }
     * 
     */
    public IdentCharacterDataType createIdentCharacterDataType() {
        return new IdentCharacterDataType();
    }

    /**
     * Create an instance of {@link IdentImgType }
     * 
     */
    public IdentImgType createIdentImgType() {
        return new IdentImgType();
    }

    /**
     * Create an instance of {@link InitialAmountType }
     * 
     */
    public InitialAmountType createInitialAmountType() {
        return new InitialAmountType();
    }

    /**
     * Create an instance of {@link IndustIdentType }
     * 
     */
    public IndustIdentType createIndustIdentType() {
        return new IndustIdentType();
    }

    /**
     * Create an instance of {@link InterestRateYieldType }
     * 
     */
    public InterestRateYieldType createInterestRateYieldType() {
        return new InterestRateYieldType();
    }

    /**
     * Create an instance of {@link IntermediaryDepAcctType }
     * 
     */
    public IntermediaryDepAcctType createIntermediaryDepAcctType() {
        return new IntermediaryDepAcctType();
    }

    /**
     * Create an instance of {@link InvoiceAdjType }
     * 
     */
    public InvoiceAdjType createInvoiceAdjType() {
        return new InvoiceAdjType();
    }

    /**
     * Create an instance of {@link InvoiceDataType }
     * 
     */
    public InvoiceDataType createInvoiceDataType() {
        return new InvoiceDataType();
    }

    /**
     * Create an instance of {@link InvoiceLineItemType }
     * 
     */
    public InvoiceLineItemType createInvoiceLineItemType() {
        return new InvoiceLineItemType();
    }

    /**
     * Create an instance of {@link InvoicePremiumType }
     * 
     */
    public InvoicePremiumType createInvoicePremiumType() {
        return new InvoicePremiumType();
    }

    /**
     * Create an instance of {@link InvoiceReceiverType }
     * 
     */
    public InvoiceReceiverType createInvoiceReceiverType() {
        return new InvoiceReceiverType();
    }

    /**
     * Create an instance of {@link InvoiceSenderType }
     * 
     */
    public InvoiceSenderType createInvoiceSenderType() {
        return new InvoiceSenderType();
    }

    /**
     * Create an instance of {@link IssuerPostScriptDataType }
     * 
     */
    public IssuerPostScriptDataType createIssuerPostScriptDataType() {
        return new IssuerPostScriptDataType();
    }

    /**
     * Create an instance of {@link IssuerPreScriptDataType }
     * 
     */
    public IssuerPreScriptDataType createIssuerPreScriptDataType() {
        return new IssuerPreScriptDataType();
    }

    /**
     * Create an instance of {@link IssuerScriptDataType }
     * 
     */
    public IssuerScriptDataType createIssuerScriptDataType() {
        return new IssuerScriptDataType();
    }

    /**
     * Create an instance of {@link IssuerScriptResultDataType }
     * 
     */
    public IssuerScriptResultDataType createIssuerScriptResultDataType() {
        return new IssuerScriptResultDataType();
    }

    /**
     * Create an instance of {@link LOCLimitType }
     * 
     */
    public LOCLimitType createLOCLimitType() {
        return new LOCLimitType();
    }

    /**
     * Create an instance of {@link LOCLoanDataType }
     * 
     */
    public LOCLoanDataType createLOCLoanDataType() {
        return new LOCLoanDataType();
    }

    /**
     * Create an instance of {@link LocatorType }
     * 
     */
    public LocatorType createLocatorType() {
        return new LocatorType();
    }

    /**
     * Create an instance of {@link LockboxDepIdentType }
     * 
     */
    public LockboxDepIdentType createLockboxDepIdentType() {
        return new LockboxDepIdentType();
    }

    /**
     * Create an instance of {@link LoginIdentType }
     * 
     */
    public LoginIdentType createLoginIdentType() {
        return new LoginIdentType();
    }

    /**
     * Create an instance of {@link LowCurAmtType }
     * 
     */
    public LowCurAmtType createLowCurAmtType() {
        return new LowCurAmtType();
    }

    /**
     * Create an instance of {@link MagCardUpdateDataType }
     * 
     */
    public MagCardUpdateDataType createMagCardUpdateDataType() {
        return new MagCardUpdateDataType();
    }

    /**
     * Create an instance of {@link MagCardUpdateEnvrType }
     * 
     */
    public MagCardUpdateEnvrType createMagCardUpdateEnvrType() {
        return new MagCardUpdateEnvrType();
    }

    /**
     * Create an instance of {@link MagCardUpdateInfoType }
     * 
     */
    public MagCardUpdateInfoType createMagCardUpdateInfoType() {
        return new MagCardUpdateInfoType();
    }

    /**
     * Create an instance of {@link MagCardUpdateRecType }
     * 
     */
    public MagCardUpdateRecType createMagCardUpdateRecType() {
        return new MagCardUpdateRecType();
    }

    /**
     * Create an instance of {@link MagCardUpdateStatusType }
     * 
     */
    public MagCardUpdateStatusType createMagCardUpdateStatusType() {
        return new MagCardUpdateStatusType();
    }

    /**
     * Create an instance of {@link MagCardUpdateKeysType }
     * 
     */
    public MagCardUpdateKeysType createMagCardUpdateKeysType() {
        return new MagCardUpdateKeysType();
    }

    /**
     * Create an instance of {@link MagCardUpdateRefType }
     * 
     */
    public MagCardUpdateRefType createMagCardUpdateRefType() {
        return new MagCardUpdateRefType();
    }

    /**
     * Create an instance of {@link MagCardUpdateSelType }
     * 
     */
    public MagCardUpdateSelType createMagCardUpdateSelType() {
        return new MagCardUpdateSelType();
    }

    /**
     * Create an instance of {@link MagCardUpdateStatusRecType }
     * 
     */
    public MagCardUpdateStatusRecType createMagCardUpdateStatusRecType() {
        return new MagCardUpdateStatusRecType();
    }

    /**
     * Create an instance of {@link MaxCurAmtType }
     * 
     */
    public MaxCurAmtType createMaxCurAmtType() {
        return new MaxCurAmtType();
    }

    /**
     * Create an instance of {@link MediaAcctEnvrType }
     * 
     */
    public MediaAcctEnvrType createMediaAcctEnvrType() {
        return new MediaAcctEnvrType();
    }

    /**
     * Create an instance of {@link ActionSummaryType }
     * 
     */
    public ActionSummaryType createActionSummaryType() {
        return new ActionSummaryType();
    }

    /**
     * Create an instance of {@link MediaAcctAuthType }
     * 
     */
    public MediaAcctAuthType createMediaAcctAuthType() {
        return new MediaAcctAuthType();
    }

    /**
     * Create an instance of {@link MediaAcctInfoType }
     * 
     */
    public MediaAcctInfoType createMediaAcctInfoType() {
        return new MediaAcctInfoType();
    }

    /**
     * Create an instance of {@link MediaAcctKeysType }
     * 
     */
    public MediaAcctKeysType createMediaAcctKeysType() {
        return new MediaAcctKeysType();
    }

    /**
     * Create an instance of {@link MediaAcctRefType }
     * 
     */
    public MediaAcctRefType createMediaAcctRefType() {
        return new MediaAcctRefType();
    }

    /**
     * Create an instance of {@link MediaAcctSelType }
     * 
     */
    public MediaAcctSelType createMediaAcctSelType() {
        return new MediaAcctSelType();
    }

    /**
     * Create an instance of {@link MediaAcctStatusType }
     * 
     */
    public MediaAcctStatusType createMediaAcctStatusType() {
        return new MediaAcctStatusType();
    }

    /**
     * Create an instance of {@link MediaAcctSyncRqType }
     * 
     */
    public MediaAcctSyncRqType createMediaAcctSyncRqType() {
        return new MediaAcctSyncRqType();
    }

    /**
     * Create an instance of {@link MediaItemType }
     * 
     */
    public MediaItemType createMediaItemType() {
        return new MediaItemType();
    }

    /**
     * Create an instance of {@link MediaTotalType }
     * 
     */
    public MediaTotalType createMediaTotalType() {
        return new MediaTotalType();
    }

    /**
     * Create an instance of {@link MaxLimitAmtType }
     * 
     */
    public MaxLimitAmtType createMaxLimitAmtType() {
        return new MaxLimitAmtType();
    }

    /**
     * Create an instance of {@link MinLimitAmtType }
     * 
     */
    public MinLimitAmtType createMinLimitAmtType() {
        return new MinLimitAmtType();
    }

    /**
     * Create an instance of {@link MinAmtDueType }
     * 
     */
    public MinAmtDueType createMinAmtDueType() {
        return new MinAmtDueType();
    }

    /**
     * Create an instance of {@link MinCurAmtType }
     * 
     */
    public MinCurAmtType createMinCurAmtType() {
        return new MinCurAmtType();
    }

    /**
     * Create an instance of {@link MinPmtType }
     * 
     */
    public MinPmtType createMinPmtType() {
        return new MinPmtType();
    }

    /**
     * Create an instance of {@link MktgImgType }
     * 
     */
    public MktgImgType createMktgImgType() {
        return new MktgImgType();
    }

    /**
     * Create an instance of {@link MktgMaterialType }
     * 
     */
    public MktgMaterialType createMktgMaterialType() {
        return new MktgMaterialType();
    }

    /**
     * Create an instance of {@link MsgAuthCodeType }
     * 
     */
    public MsgAuthCodeType createMsgAuthCodeType() {
        return new MsgAuthCodeType();
    }

    /**
     * Create an instance of {@link NewForExRateType }
     * 
     */
    public NewForExRateType createNewForExRateType() {
        return new NewForExRateType();
    }

    /**
     * Create an instance of {@link NextPmtType }
     * 
     */
    public NextPmtType createNextPmtType() {
        return new NextPmtType();
    }

    /**
     * Create an instance of {@link OperRqType }
     * 
     */
    public OperRqType createOperRqType() {
        return new OperRqType();
    }

    /**
     * Create an instance of {@link OperRsType }
     * 
     */
    public OperRsType createOperRsType() {
        return new OperRsType();
    }

    /**
     * Create an instance of {@link OperRulesType }
     * 
     */
    public OperRulesType createOperRulesType() {
        return new OperRulesType();
    }

    /**
     * Create an instance of {@link OperRqHdrType }
     * 
     */
    public OperRqHdrType createOperRqHdrType() {
        return new OperRqHdrType();
    }

    /**
     * Create an instance of {@link OperRsHdrType }
     * 
     */
    public OperRsHdrType createOperRsHdrType() {
        return new OperRsHdrType();
    }

    /**
     * Create an instance of {@link OrgCatIdentType }
     * 
     */
    public OrgCatIdentType createOrgCatIdentType() {
        return new OrgCatIdentType();
    }

    /**
     * Create an instance of {@link OrgCategoryType }
     * 
     */
    public OrgCategoryType createOrgCategoryType() {
        return new OrgCategoryType();
    }

    /**
     * Create an instance of {@link OrgDataType }
     * 
     */
    public OrgDataType createOrgDataType() {
        return new OrgDataType();
    }

    /**
     * Create an instance of {@link OrgIdentType }
     * 
     */
    public OrgIdentType createOrgIdentType() {
        return new OrgIdentType();
    }

    /**
     * Create an instance of {@link OrgNameType }
     * 
     */
    public OrgNameType createOrgNameType() {
        return new OrgNameType();
    }

    /**
     * Create an instance of {@link OverdraftFundingType }
     * 
     */
    public OverdraftFundingType createOverdraftFundingType() {
        return new OverdraftFundingType();
    }

    /**
     * Create an instance of {@link PageNumRangeType }
     * 
     */
    public PageNumRangeType createPageNumRangeType() {
        return new PageNumRangeType();
    }

    /**
     * Create an instance of {@link PartyAcctRelEnvrType }
     * 
     */
    public PartyAcctRelEnvrType createPartyAcctRelEnvrType() {
        return new PartyAcctRelEnvrType();
    }

    /**
     * Create an instance of {@link PartyAcctRelRefType }
     * 
     */
    public PartyAcctRelRefType createPartyAcctRelRefType() {
        return new PartyAcctRelRefType();
    }

    /**
     * Create an instance of {@link PartyAcctRelStatusType }
     * 
     */
    public PartyAcctRelStatusType createPartyAcctRelStatusType() {
        return new PartyAcctRelStatusType();
    }

    /**
     * Create an instance of {@link PartyAcctRelStatusRecType }
     * 
     */
    public PartyAcctRelStatusRecType createPartyAcctRelStatusRecType() {
        return new PartyAcctRelStatusRecType();
    }

    /**
     * Create an instance of {@link PartyCardRelEnvrType }
     * 
     */
    public PartyCardRelEnvrType createPartyCardRelEnvrType() {
        return new PartyCardRelEnvrType();
    }

    /**
     * Create an instance of {@link PartyCardRelInfoType }
     * 
     */
    public PartyCardRelInfoType createPartyCardRelInfoType() {
        return new PartyCardRelInfoType();
    }

    /**
     * Create an instance of {@link PartyCardRelKeysType }
     * 
     */
    public PartyCardRelKeysType createPartyCardRelKeysType() {
        return new PartyCardRelKeysType();
    }

    /**
     * Create an instance of {@link PartyCardRelRefType }
     * 
     */
    public PartyCardRelRefType createPartyCardRelRefType() {
        return new PartyCardRelRefType();
    }

    /**
     * Create an instance of {@link PartyCardRelStatusType }
     * 
     */
    public PartyCardRelStatusType createPartyCardRelStatusType() {
        return new PartyCardRelStatusType();
    }

    /**
     * Create an instance of {@link PartyCardRelStatusRecType }
     * 
     */
    public PartyCardRelStatusRecType createPartyCardRelStatusRecType() {
        return new PartyCardRelStatusRecType();
    }

    /**
     * Create an instance of {@link POSAgentType }
     * 
     */
    public POSAgentType createPOSAgentType() {
        return new POSAgentType();
    }

    /**
     * Create an instance of {@link POSCapabilitiesType }
     * 
     */
    public POSCapabilitiesType createPOSCapabilitiesType() {
        return new POSCapabilitiesType();
    }

    /**
     * Create an instance of {@link POSSecurityType }
     * 
     */
    public POSSecurityType createPOSSecurityType() {
        return new POSSecurityType();
    }

    /**
     * Create an instance of {@link PageCountLimitType }
     * 
     */
    public PageCountLimitType createPageCountLimitType() {
        return new PageCountLimitType();
    }

    /**
     * Create an instance of {@link PaidCurAmtType }
     * 
     */
    public PaidCurAmtType createPaidCurAmtType() {
        return new PaidCurAmtType();
    }

    /**
     * Create an instance of {@link PaidDtRangeType }
     * 
     */
    public PaidDtRangeType createPaidDtRangeType() {
        return new PaidDtRangeType();
    }

    /**
     * Create an instance of {@link PartyEnvrType }
     * 
     */
    public PartyEnvrType createPartyEnvrType() {
        return new PartyEnvrType();
    }

    /**
     * Create an instance of {@link PartyDataType }
     * 
     */
    public PartyDataType createPartyDataType() {
        return new PartyDataType();
    }

    /**
     * Create an instance of {@link PartyStatusRecType }
     * 
     */
    public PartyStatusRecType createPartyStatusRecType() {
        return new PartyStatusRecType();
    }

    /**
     * Create an instance of {@link PartyStatusType }
     * 
     */
    public PartyStatusType createPartyStatusType() {
        return new PartyStatusType();
    }

    /**
     * Create an instance of {@link PartyPartyRelAuthType }
     * 
     */
    public PartyPartyRelAuthType createPartyPartyRelAuthType() {
        return new PartyPartyRelAuthType();
    }

    /**
     * Create an instance of {@link PartyPartyRelEnvrType }
     * 
     */
    public PartyPartyRelEnvrType createPartyPartyRelEnvrType() {
        return new PartyPartyRelEnvrType();
    }

    /**
     * Create an instance of {@link PartyPartyRelRefType }
     * 
     */
    public PartyPartyRelRefType createPartyPartyRelRefType() {
        return new PartyPartyRelRefType();
    }

    /**
     * Create an instance of {@link PartyPartyRelStatusType }
     * 
     */
    public PartyPartyRelStatusType createPartyPartyRelStatusType() {
        return new PartyPartyRelStatusType();
    }

    /**
     * Create an instance of {@link PartyPartyRelStatusRecType }
     * 
     */
    public PartyPartyRelStatusRecType createPartyPartyRelStatusRecType() {
        return new PartyPartyRelStatusRecType();
    }

    /**
     * Create an instance of {@link PassbkEnvrType }
     * 
     */
    public PassbkEnvrType createPassbkEnvrType() {
        return new PassbkEnvrType();
    }

    /**
     * Create an instance of {@link PassbkInfoType }
     * 
     */
    public PassbkInfoType createPassbkInfoType() {
        return new PassbkInfoType();
    }

    /**
     * Create an instance of {@link PassbkKeysType }
     * 
     */
    public PassbkKeysType createPassbkKeysType() {
        return new PassbkKeysType();
    }

    /**
     * Create an instance of {@link PassbkLastBalPrintedType }
     * 
     */
    public PassbkLastBalPrintedType createPassbkLastBalPrintedType() {
        return new PassbkLastBalPrintedType();
    }

    /**
     * Create an instance of {@link PassbkRecType }
     * 
     */
    public PassbkRecType createPassbkRecType() {
        return new PassbkRecType();
    }

    /**
     * Create an instance of {@link PassbkRefType }
     * 
     */
    public PassbkRefType createPassbkRefType() {
        return new PassbkRefType();
    }

    /**
     * Create an instance of {@link PassbkSelType }
     * 
     */
    public PassbkSelType createPassbkSelType() {
        return new PassbkSelType();
    }

    /**
     * Create an instance of {@link PassbkStatusType }
     * 
     */
    public PassbkStatusType createPassbkStatusType() {
        return new PassbkStatusType();
    }

    /**
     * Create an instance of {@link PassbkStatusRecType }
     * 
     */
    public PassbkStatusRecType createPassbkStatusRecType() {
        return new PassbkStatusRecType();
    }

    /**
     * Create an instance of {@link PassbkItemDetailType }
     * 
     */
    public PassbkItemDetailType createPassbkItemDetailType() {
        return new PassbkItemDetailType();
    }

    /**
     * Create an instance of {@link PassbkItemEnvrType }
     * 
     */
    public PassbkItemEnvrType createPassbkItemEnvrType() {
        return new PassbkItemEnvrType();
    }

    /**
     * Create an instance of {@link PassbkItemInfoType }
     * 
     */
    public PassbkItemInfoType createPassbkItemInfoType() {
        return new PassbkItemInfoType();
    }

    /**
     * Create an instance of {@link PassbkItemKeysType }
     * 
     */
    public PassbkItemKeysType createPassbkItemKeysType() {
        return new PassbkItemKeysType();
    }

    /**
     * Create an instance of {@link PassbkItemRecType }
     * 
     */
    public PassbkItemRecType createPassbkItemRecType() {
        return new PassbkItemRecType();
    }

    /**
     * Create an instance of {@link PassbkItemRefType }
     * 
     */
    public PassbkItemRefType createPassbkItemRefType() {
        return new PassbkItemRefType();
    }

    /**
     * Create an instance of {@link PassbkItemSelType }
     * 
     */
    public PassbkItemSelType createPassbkItemSelType() {
        return new PassbkItemSelType();
    }

    /**
     * Create an instance of {@link PassbkItemStatusType }
     * 
     */
    public PassbkItemStatusType createPassbkItemStatusType() {
        return new PassbkItemStatusType();
    }

    /**
     * Create an instance of {@link PassbkItemStatusRecType }
     * 
     */
    public PassbkItemStatusRecType createPassbkItemStatusRecType() {
        return new PassbkItemStatusRecType();
    }

    /**
     * Create an instance of {@link PmtEnvrType }
     * 
     */
    public PmtEnvrType createPmtEnvrType() {
        return new PmtEnvrType();
    }

    /**
     * Create an instance of {@link PmtInstType }
     * 
     */
    public PmtInstType createPmtInstType() {
        return new PmtInstType();
    }

    /**
     * Create an instance of {@link PmtLegalRptType }
     * 
     */
    public PmtLegalRptType createPmtLegalRptType() {
        return new PmtLegalRptType();
    }

    /**
     * Create an instance of {@link PmtLegalRptDataType }
     * 
     */
    public PmtLegalRptDataType createPmtLegalRptDataType() {
        return new PmtLegalRptDataType();
    }

    /**
     * Create an instance of {@link PmtRefType }
     * 
     */
    public PmtRefType createPmtRefType() {
        return new PmtRefType();
    }

    /**
     * Create an instance of {@link PmtSelType }
     * 
     */
    public PmtSelType createPmtSelType() {
        return new PmtSelType();
    }

    /**
     * Create an instance of {@link PmtStatusType }
     * 
     */
    public PmtStatusType createPmtStatusType() {
        return new PmtStatusType();
    }

    /**
     * Create an instance of {@link PmtStatusRecType }
     * 
     */
    public PmtStatusRecType createPmtStatusRecType() {
        return new PmtStatusRecType();
    }

    /**
     * Create an instance of {@link PmtSummAmtType }
     * 
     */
    public PmtSummAmtType createPmtSummAmtType() {
        return new PmtSummAmtType();
    }

    /**
     * Create an instance of {@link PmtAthEnvrType }
     * 
     */
    public PmtAthEnvrType createPmtAthEnvrType() {
        return new PmtAthEnvrType();
    }

    /**
     * Create an instance of {@link PmtAthInfoType }
     * 
     */
    public PmtAthInfoType createPmtAthInfoType() {
        return new PmtAthInfoType();
    }

    /**
     * Create an instance of {@link PmtAthKeysType }
     * 
     */
    public PmtAthKeysType createPmtAthKeysType() {
        return new PmtAthKeysType();
    }

    /**
     * Create an instance of {@link PmtAthRecType }
     * 
     */
    public PmtAthRecType createPmtAthRecType() {
        return new PmtAthRecType();
    }

    /**
     * Create an instance of {@link PmtAthRefType }
     * 
     */
    public PmtAthRefType createPmtAthRefType() {
        return new PmtAthRefType();
    }

    /**
     * Create an instance of {@link PmtAthSelType }
     * 
     */
    public PmtAthSelType createPmtAthSelType() {
        return new PmtAthSelType();
    }

    /**
     * Create an instance of {@link PmtAthStatusType }
     * 
     */
    public PmtAthStatusType createPmtAthStatusType() {
        return new PmtAthStatusType();
    }

    /**
     * Create an instance of {@link PmtAthStatusRecType }
     * 
     */
    public PmtAthStatusRecType createPmtAthStatusRecType() {
        return new PmtAthStatusRecType();
    }

    /**
     * Create an instance of {@link PmtBatchEnvrType }
     * 
     */
    public PmtBatchEnvrType createPmtBatchEnvrType() {
        return new PmtBatchEnvrType();
    }

    /**
     * Create an instance of {@link PmtBatchInfoType }
     * 
     */
    public PmtBatchInfoType createPmtBatchInfoType() {
        return new PmtBatchInfoType();
    }

    /**
     * Create an instance of {@link PmtBatchKeysType }
     * 
     */
    public PmtBatchKeysType createPmtBatchKeysType() {
        return new PmtBatchKeysType();
    }

    /**
     * Create an instance of {@link PmtBatchRecType }
     * 
     */
    public PmtBatchRecType createPmtBatchRecType() {
        return new PmtBatchRecType();
    }

    /**
     * Create an instance of {@link PmtBatchRefType }
     * 
     */
    public PmtBatchRefType createPmtBatchRefType() {
        return new PmtBatchRefType();
    }

    /**
     * Create an instance of {@link PmtBatchSelType }
     * 
     */
    public PmtBatchSelType createPmtBatchSelType() {
        return new PmtBatchSelType();
    }

    /**
     * Create an instance of {@link PmtBatchStatusType }
     * 
     */
    public PmtBatchStatusType createPmtBatchStatusType() {
        return new PmtBatchStatusType();
    }

    /**
     * Create an instance of {@link PmtBatchStatusRecType }
     * 
     */
    public PmtBatchStatusRecType createPmtBatchStatusRecType() {
        return new PmtBatchStatusRecType();
    }

    /**
     * Create an instance of {@link PmtBatchStatEnvrType }
     * 
     */
    public PmtBatchStatEnvrType createPmtBatchStatEnvrType() {
        return new PmtBatchStatEnvrType();
    }

    /**
     * Create an instance of {@link PmtBatchStatInfoType }
     * 
     */
    public PmtBatchStatInfoType createPmtBatchStatInfoType() {
        return new PmtBatchStatInfoType();
    }

    /**
     * Create an instance of {@link PmtBatchStatKeysType }
     * 
     */
    public PmtBatchStatKeysType createPmtBatchStatKeysType() {
        return new PmtBatchStatKeysType();
    }

    /**
     * Create an instance of {@link PmtBatchStatRecType }
     * 
     */
    public PmtBatchStatRecType createPmtBatchStatRecType() {
        return new PmtBatchStatRecType();
    }

    /**
     * Create an instance of {@link PmtBatchStatRefType }
     * 
     */
    public PmtBatchStatRefType createPmtBatchStatRefType() {
        return new PmtBatchStatRefType();
    }

    /**
     * Create an instance of {@link PmtBatchStatSelType }
     * 
     */
    public PmtBatchStatSelType createPmtBatchStatSelType() {
        return new PmtBatchStatSelType();
    }

    /**
     * Create an instance of {@link PmtBatchStatStatusType }
     * 
     */
    public PmtBatchStatStatusType createPmtBatchStatStatusType() {
        return new PmtBatchStatStatusType();
    }

    /**
     * Create an instance of {@link PmtBatchStatStatusRecType }
     * 
     */
    public PmtBatchStatStatusRecType createPmtBatchStatStatusRecType() {
        return new PmtBatchStatStatusRecType();
    }

    /**
     * Create an instance of {@link PmtEnclEnvrType }
     * 
     */
    public PmtEnclEnvrType createPmtEnclEnvrType() {
        return new PmtEnclEnvrType();
    }

    /**
     * Create an instance of {@link PmtEnclInfoType }
     * 
     */
    public PmtEnclInfoType createPmtEnclInfoType() {
        return new PmtEnclInfoType();
    }

    /**
     * Create an instance of {@link PmtEnclKeysType }
     * 
     */
    public PmtEnclKeysType createPmtEnclKeysType() {
        return new PmtEnclKeysType();
    }

    /**
     * Create an instance of {@link PmtEnclPayeeType }
     * 
     */
    public PmtEnclPayeeType createPmtEnclPayeeType() {
        return new PmtEnclPayeeType();
    }

    /**
     * Create an instance of {@link PmtEnclPayeeInfoType }
     * 
     */
    public PmtEnclPayeeInfoType createPmtEnclPayeeInfoType() {
        return new PmtEnclPayeeInfoType();
    }

    /**
     * Create an instance of {@link PmtEnclRecType }
     * 
     */
    public PmtEnclRecType createPmtEnclRecType() {
        return new PmtEnclRecType();
    }

    /**
     * Create an instance of {@link PmtEnclRefType }
     * 
     */
    public PmtEnclRefType createPmtEnclRefType() {
        return new PmtEnclRefType();
    }

    /**
     * Create an instance of {@link PmtEnclSelType }
     * 
     */
    public PmtEnclSelType createPmtEnclSelType() {
        return new PmtEnclSelType();
    }

    /**
     * Create an instance of {@link PmtEnclStatusType }
     * 
     */
    public PmtEnclStatusType createPmtEnclStatusType() {
        return new PmtEnclStatusType();
    }

    /**
     * Create an instance of {@link PmtEnclStatusRecType }
     * 
     */
    public PmtEnclStatusRecType createPmtEnclStatusRecType() {
        return new PmtEnclStatusRecType();
    }

    /**
     * Create an instance of {@link PmtStatEnvrType }
     * 
     */
    public PmtStatEnvrType createPmtStatEnvrType() {
        return new PmtStatEnvrType();
    }

    /**
     * Create an instance of {@link PmtStatInfoType }
     * 
     */
    public PmtStatInfoType createPmtStatInfoType() {
        return new PmtStatInfoType();
    }

    /**
     * Create an instance of {@link PmtStatKeysType }
     * 
     */
    public PmtStatKeysType createPmtStatKeysType() {
        return new PmtStatKeysType();
    }

    /**
     * Create an instance of {@link PmtStatRecType }
     * 
     */
    public PmtStatRecType createPmtStatRecType() {
        return new PmtStatRecType();
    }

    /**
     * Create an instance of {@link PmtStatRefType }
     * 
     */
    public PmtStatRefType createPmtStatRefType() {
        return new PmtStatRefType();
    }

    /**
     * Create an instance of {@link PmtStatSelType }
     * 
     */
    public PmtStatSelType createPmtStatSelType() {
        return new PmtStatSelType();
    }

    /**
     * Create an instance of {@link PmtStatStatusType }
     * 
     */
    public PmtStatStatusType createPmtStatStatusType() {
        return new PmtStatStatusType();
    }

    /**
     * Create an instance of {@link PmtStatStatusRecType }
     * 
     */
    public PmtStatStatusRecType createPmtStatStatusRecType() {
        return new PmtStatStatusRecType();
    }

    /**
     * Create an instance of {@link PointOfServiceDataType }
     * 
     */
    public PointOfServiceDataType createPointOfServiceDataType() {
        return new PointOfServiceDataType();
    }

    /**
     * Create an instance of {@link PostingSessionEnvrType }
     * 
     */
    public PostingSessionEnvrType createPostingSessionEnvrType() {
        return new PostingSessionEnvrType();
    }

    /**
     * Create an instance of {@link PostingSessionInfoType }
     * 
     */
    public PostingSessionInfoType createPostingSessionInfoType() {
        return new PostingSessionInfoType();
    }

    /**
     * Create an instance of {@link PostingSessionKeysType }
     * 
     */
    public PostingSessionKeysType createPostingSessionKeysType() {
        return new PostingSessionKeysType();
    }

    /**
     * Create an instance of {@link PostingSessionRecType }
     * 
     */
    public PostingSessionRecType createPostingSessionRecType() {
        return new PostingSessionRecType();
    }

    /**
     * Create an instance of {@link PostingSessionRefType }
     * 
     */
    public PostingSessionRefType createPostingSessionRefType() {
        return new PostingSessionRefType();
    }

    /**
     * Create an instance of {@link PostingSessionSelType }
     * 
     */
    public PostingSessionSelType createPostingSessionSelType() {
        return new PostingSessionSelType();
    }

    /**
     * Create an instance of {@link PostingSessionStatusType }
     * 
     */
    public PostingSessionStatusType createPostingSessionStatusType() {
        return new PostingSessionStatusType();
    }

    /**
     * Create an instance of {@link PostingSessionStatusRecType }
     * 
     */
    public PostingSessionStatusRecType createPostingSessionStatusRecType() {
        return new PostingSessionStatusRecType();
    }

    /**
     * Create an instance of {@link PrcDtRangeType }
     * 
     */
    public PrcDtRangeType createPrcDtRangeType() {
        return new PrcDtRangeType();
    }

    /**
     * Create an instance of {@link PrepayPenaltyType }
     * 
     */
    public PrepayPenaltyType createPrepayPenaltyType() {
        return new PrepayPenaltyType();
    }

    /**
     * Create an instance of {@link PrePaidPurchItemDetailType }
     * 
     */
    public PrePaidPurchItemDetailType createPrePaidPurchItemDetailType() {
        return new PrePaidPurchItemDetailType();
    }

    /**
     * Create an instance of {@link PrePaidUnitsType }
     * 
     */
    public PrePaidUnitsType createPrePaidUnitsType() {
        return new PrePaidUnitsType();
    }

    /**
     * Create an instance of {@link PresAcctIdType }
     * 
     */
    public PresAcctIdType createPresAcctIdType() {
        return new PresAcctIdType();
    }

    /**
     * Create an instance of {@link ProxyClientType }
     * 
     */
    public ProxyClientType createProxyClientType() {
        return new ProxyClientType();
    }

    /**
     * Create an instance of {@link PurchItemDetailType }
     * 
     */
    public PurchItemDetailType createPurchItemDetailType() {
        return new PurchItemDetailType();
    }

    /**
     * Create an instance of {@link PurchItemEnvrType }
     * 
     */
    public PurchItemEnvrType createPurchItemEnvrType() {
        return new PurchItemEnvrType();
    }

    /**
     * Create an instance of {@link PurchItemInfoType }
     * 
     */
    public PurchItemInfoType createPurchItemInfoType() {
        return new PurchItemInfoType();
    }

    /**
     * Create an instance of {@link PurchItemKeysType }
     * 
     */
    public PurchItemKeysType createPurchItemKeysType() {
        return new PurchItemKeysType();
    }

    /**
     * Create an instance of {@link PurchItemRecType }
     * 
     */
    public PurchItemRecType createPurchItemRecType() {
        return new PurchItemRecType();
    }

    /**
     * Create an instance of {@link PurchItemRefType }
     * 
     */
    public PurchItemRefType createPurchItemRefType() {
        return new PurchItemRefType();
    }

    /**
     * Create an instance of {@link PurchItemSelType }
     * 
     */
    public PurchItemSelType createPurchItemSelType() {
        return new PurchItemSelType();
    }

    /**
     * Create an instance of {@link PurchItemStatusType }
     * 
     */
    public PurchItemStatusType createPurchItemStatusType() {
        return new PurchItemStatusType();
    }

    /**
     * Create an instance of {@link PurchItemStatusRecType }
     * 
     */
    public PurchItemStatusRecType createPurchItemStatusRecType() {
        return new PurchItemStatusRecType();
    }

    /**
     * Create an instance of {@link RecChkOrdEnvrType }
     * 
     */
    public RecChkOrdEnvrType createRecChkOrdEnvrType() {
        return new RecChkOrdEnvrType();
    }

    /**
     * Create an instance of {@link RecChkOrdInfoType }
     * 
     */
    public RecChkOrdInfoType createRecChkOrdInfoType() {
        return new RecChkOrdInfoType();
    }

    /**
     * Create an instance of {@link RecChkOrdKeysType }
     * 
     */
    public RecChkOrdKeysType createRecChkOrdKeysType() {
        return new RecChkOrdKeysType();
    }

    /**
     * Create an instance of {@link RecChkOrdRecType }
     * 
     */
    public RecChkOrdRecType createRecChkOrdRecType() {
        return new RecChkOrdRecType();
    }

    /**
     * Create an instance of {@link RecChkOrdRefType }
     * 
     */
    public RecChkOrdRefType createRecChkOrdRefType() {
        return new RecChkOrdRefType();
    }

    /**
     * Create an instance of {@link RecChkOrdSelType }
     * 
     */
    public RecChkOrdSelType createRecChkOrdSelType() {
        return new RecChkOrdSelType();
    }

    /**
     * Create an instance of {@link RecChkOrdStatusType }
     * 
     */
    public RecChkOrdStatusType createRecChkOrdStatusType() {
        return new RecChkOrdStatusType();
    }

    /**
     * Create an instance of {@link RecChkOrdStatusRecType }
     * 
     */
    public RecChkOrdStatusRecType createRecChkOrdStatusRecType() {
        return new RecChkOrdStatusRecType();
    }

    /**
     * Create an instance of {@link RecCountLimitType }
     * 
     */
    public RecCountLimitType createRecCountLimitType() {
        return new RecCountLimitType();
    }

    /**
     * Create an instance of {@link RecordCountLimitType }
     * 
     */
    public RecordCountLimitType createRecordCountLimitType() {
        return new RecordCountLimitType();
    }

    /**
     * Create an instance of {@link RecCtrlInType }
     * 
     */
    public RecCtrlInType createRecCtrlInType() {
        return new RecCtrlInType();
    }

    /**
     * Create an instance of {@link RecCtrlOutType }
     * 
     */
    public RecCtrlOutType createRecCtrlOutType() {
        return new RecCtrlOutType();
    }

    /**
     * Create an instance of {@link RecPmtEnvrType }
     * 
     */
    public RecPmtEnvrType createRecPmtEnvrType() {
        return new RecPmtEnvrType();
    }

    /**
     * Create an instance of {@link RecPmtInfoType }
     * 
     */
    public RecPmtInfoType createRecPmtInfoType() {
        return new RecPmtInfoType();
    }

    /**
     * Create an instance of {@link RecPmtKeysType }
     * 
     */
    public RecPmtKeysType createRecPmtKeysType() {
        return new RecPmtKeysType();
    }

    /**
     * Create an instance of {@link RecPmtRecType }
     * 
     */
    public RecPmtRecType createRecPmtRecType() {
        return new RecPmtRecType();
    }

    /**
     * Create an instance of {@link RecPmtRefType }
     * 
     */
    public RecPmtRefType createRecPmtRefType() {
        return new RecPmtRefType();
    }

    /**
     * Create an instance of {@link RecPmtSelType }
     * 
     */
    public RecPmtSelType createRecPmtSelType() {
        return new RecPmtSelType();
    }

    /**
     * Create an instance of {@link RecPmtStatusType }
     * 
     */
    public RecPmtStatusType createRecPmtStatusType() {
        return new RecPmtStatusType();
    }

    /**
     * Create an instance of {@link RecPmtStatusRecType }
     * 
     */
    public RecPmtStatusRecType createRecPmtStatusRecType() {
        return new RecPmtStatusRecType();
    }

    /**
     * Create an instance of {@link RecXferEnvrType }
     * 
     */
    public RecXferEnvrType createRecXferEnvrType() {
        return new RecXferEnvrType();
    }

    /**
     * Create an instance of {@link RecXferRefType }
     * 
     */
    public RecXferRefType createRecXferRefType() {
        return new RecXferRefType();
    }

    /**
     * Create an instance of {@link RecXferStatusType }
     * 
     */
    public RecXferStatusType createRecXferStatusType() {
        return new RecXferStatusType();
    }

    /**
     * Create an instance of {@link RecXferStatusRecType }
     * 
     */
    public RecXferStatusRecType createRecXferStatusRecType() {
        return new RecXferStatusRecType();
    }

    /**
     * Create an instance of {@link RefDataType }
     * 
     */
    public RefDataType createRefDataType() {
        return new RefDataType();
    }

    /**
     * Create an instance of {@link RegPmtType }
     * 
     */
    public RegPmtType createRegPmtType() {
        return new RegPmtType();
    }

    /**
     * Create an instance of {@link RelatedForExDealRefType }
     * 
     */
    public RelatedForExDealRefType createRelatedForExDealRefType() {
        return new RelatedForExDealRefType();
    }

    /**
     * Create an instance of {@link RelPartyKeysType }
     * 
     */
    public RelPartyKeysType createRelPartyKeysType() {
        return new RelPartyKeysType();
    }

    /**
     * Create an instance of {@link RemitAddrType }
     * 
     */
    public RemitAddrType createRemitAddrType() {
        return new RemitAddrType();
    }

    /**
     * Create an instance of {@link RemitDetailType }
     * 
     */
    public RemitDetailType createRemitDetailType() {
        return new RemitDetailType();
    }

    /**
     * Create an instance of {@link RemitEnvrType }
     * 
     */
    public RemitEnvrType createRemitEnvrType() {
        return new RemitEnvrType();
    }

    /**
     * Create an instance of {@link RemitInfoType }
     * 
     */
    public RemitInfoType createRemitInfoType() {
        return new RemitInfoType();
    }

    /**
     * Create an instance of {@link RemitInstructionType }
     * 
     */
    public RemitInstructionType createRemitInstructionType() {
        return new RemitInstructionType();
    }

    /**
     * Create an instance of {@link RemitKeysType }
     * 
     */
    public RemitKeysType createRemitKeysType() {
        return new RemitKeysType();
    }

    /**
     * Create an instance of {@link RemitRecType }
     * 
     */
    public RemitRecType createRemitRecType() {
        return new RemitRecType();
    }

    /**
     * Create an instance of {@link RemitRefType }
     * 
     */
    public RemitRefType createRemitRefType() {
        return new RemitRefType();
    }

    /**
     * Create an instance of {@link RemitSelType }
     * 
     */
    public RemitSelType createRemitSelType() {
        return new RemitSelType();
    }

    /**
     * Create an instance of {@link RemitStatusType }
     * 
     */
    public RemitStatusType createRemitStatusType() {
        return new RemitStatusType();
    }

    /**
     * Create an instance of {@link RemitStatusRecType }
     * 
     */
    public RemitStatusRecType createRemitStatusRecType() {
        return new RemitStatusRecType();
    }

    /**
     * Create an instance of {@link RequestedForExRateType }
     * 
     */
    public RequestedForExRateType createRequestedForExRateType() {
        return new RequestedForExRateType();
    }

    /**
     * Create an instance of {@link ResidenceCountryType }
     * 
     */
    public ResidenceCountryType createResidenceCountryType() {
        return new ResidenceCountryType();
    }

    /**
     * Create an instance of {@link RetailPurchItemDetailType }
     * 
     */
    public RetailPurchItemDetailType createRetailPurchItemDetailType() {
        return new RetailPurchItemDetailType();
    }

    /**
     * Create an instance of {@link RevReasonCodeType }
     * 
     */
    public RevReasonCodeType createRevReasonCodeType() {
        return new RevReasonCodeType();
    }

    /**
     * Create an instance of {@link SPRefIdCorrectType }
     * 
     */
    public SPRefIdCorrectType createSPRefIdCorrectType() {
        return new SPRefIdCorrectType();
    }

    /**
     * Create an instance of {@link SecEncryptRefType }
     * 
     */
    public SecEncryptRefType createSecEncryptRefType() {
        return new SecEncryptRefType();
    }

    /**
     * Create an instance of {@link SecObjEnvrType }
     * 
     */
    public SecObjEnvrType createSecObjEnvrType() {
        return new SecObjEnvrType();
    }

    /**
     * Create an instance of {@link SecObjInfoType }
     * 
     */
    public SecObjInfoType createSecObjInfoType() {
        return new SecObjInfoType();
    }

    /**
     * Create an instance of {@link SecObjKeysType }
     * 
     */
    public SecObjKeysType createSecObjKeysType() {
        return new SecObjKeysType();
    }

    /**
     * Create an instance of {@link SecObjRecType }
     * 
     */
    public SecObjRecType createSecObjRecType() {
        return new SecObjRecType();
    }

    /**
     * Create an instance of {@link SecObjRefType }
     * 
     */
    public SecObjRefType createSecObjRefType() {
        return new SecObjRefType();
    }

    /**
     * Create an instance of {@link SecObjSelType }
     * 
     */
    public SecObjSelType createSecObjSelType() {
        return new SecObjSelType();
    }

    /**
     * Create an instance of {@link SecObjStatusType }
     * 
     */
    public SecObjStatusType createSecObjStatusType() {
        return new SecObjStatusType();
    }

    /**
     * Create an instance of {@link SecObjStatusRecType }
     * 
     */
    public SecObjStatusRecType createSecObjStatusRecType() {
        return new SecObjStatusRecType();
    }

    /**
     * Create an instance of {@link SecSignRefType }
     * 
     */
    public SecSignRefType createSecSignRefType() {
        return new SecSignRefType();
    }

    /**
     * Create an instance of {@link SecTokenType }
     * 
     */
    public SecTokenType createSecTokenType() {
        return new SecTokenType();
    }

    /**
     * Create an instance of {@link SecTokenCertType }
     * 
     */
    public SecTokenCertType createSecTokenCertType() {
        return new SecTokenCertType();
    }

    /**
     * Create an instance of {@link SecTokenICCType }
     * 
     */
    public SecTokenICCType createSecTokenICCType() {
        return new SecTokenICCType();
    }

    /**
     * Create an instance of {@link SecTokenIssuedIdentType }
     * 
     */
    public SecTokenIssuedIdentType createSecTokenIssuedIdentType() {
        return new SecTokenIssuedIdentType();
    }

    /**
     * Create an instance of {@link SecTokenKeyType }
     * 
     */
    public SecTokenKeyType createSecTokenKeyType() {
        return new SecTokenKeyType();
    }

    /**
     * Create an instance of {@link SecTokenMagCardType }
     * 
     */
    public SecTokenMagCardType createSecTokenMagCardType() {
        return new SecTokenMagCardType();
    }

    /**
     * Create an instance of {@link SecTokenObjectType }
     * 
     */
    public SecTokenObjectType createSecTokenObjectType() {
        return new SecTokenObjectType();
    }

    /**
     * Create an instance of {@link SecTokenPartyType }
     * 
     */
    public SecTokenPartyType createSecTokenPartyType() {
        return new SecTokenPartyType();
    }

    /**
     * Create an instance of {@link SelRangeDtType }
     * 
     */
    public SelRangeDtType createSelRangeDtType() {
        return new SelRangeDtType();
    }

    /**
     * Create an instance of {@link SettlementDataType }
     * 
     */
    public SettlementDataType createSettlementDataType() {
        return new SettlementDataType();
    }

    /**
     * Create an instance of {@link SignatureAmtLimitType }
     * 
     */
    public SignatureAmtLimitType createSignatureAmtLimitType() {
        return new SignatureAmtLimitType();
    }

    /**
     * Create an instance of {@link SignatureReqdType }
     * 
     */
    public SignatureReqdType createSignatureReqdType() {
        return new SignatureReqdType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link StdPayeeEnvrType }
     * 
     */
    public StdPayeeEnvrType createStdPayeeEnvrType() {
        return new StdPayeeEnvrType();
    }

    /**
     * Create an instance of {@link StdPayeeIdType }
     * 
     */
    public StdPayeeIdType createStdPayeeIdType() {
        return new StdPayeeIdType();
    }

    /**
     * Create an instance of {@link StdPayeeInfoType }
     * 
     */
    public StdPayeeInfoType createStdPayeeInfoType() {
        return new StdPayeeInfoType();
    }

    /**
     * Create an instance of {@link StdPayeeKeysType }
     * 
     */
    public StdPayeeKeysType createStdPayeeKeysType() {
        return new StdPayeeKeysType();
    }

    /**
     * Create an instance of {@link StdPayeeRecType }
     * 
     */
    public StdPayeeRecType createStdPayeeRecType() {
        return new StdPayeeRecType();
    }

    /**
     * Create an instance of {@link StdPayeeRefType }
     * 
     */
    public StdPayeeRefType createStdPayeeRefType() {
        return new StdPayeeRefType();
    }

    /**
     * Create an instance of {@link StdPayeeSelType }
     * 
     */
    public StdPayeeSelType createStdPayeeSelType() {
        return new StdPayeeSelType();
    }

    /**
     * Create an instance of {@link StdPayeeStatusType }
     * 
     */
    public StdPayeeStatusType createStdPayeeStatusType() {
        return new StdPayeeStatusType();
    }

    /**
     * Create an instance of {@link StdPayeeStatusRecType }
     * 
     */
    public StdPayeeStatusRecType createStdPayeeStatusRecType() {
        return new StdPayeeStatusRecType();
    }

    /**
     * Create an instance of {@link StmtImgType }
     * 
     */
    public StmtImgType createStmtImgType() {
        return new StmtImgType();
    }

    /**
     * Create an instance of {@link StmtRunningBalType }
     * 
     */
    public StmtRunningBalType createStmtRunningBalType() {
        return new StmtRunningBalType();
    }

    /**
     * Create an instance of {@link StmtSummAmtType }
     * 
     */
    public StmtSummAmtType createStmtSummAmtType() {
        return new StmtSummAmtType();
    }

    /**
     * Create an instance of {@link StmtTimeFrameType }
     * 
     */
    public StmtTimeFrameType createStmtTimeFrameType() {
        return new StmtTimeFrameType();
    }

    /**
     * Create an instance of {@link StopChkAuthType }
     * 
     */
    public StopChkAuthType createStopChkAuthType() {
        return new StopChkAuthType();
    }

    /**
     * Create an instance of {@link StopChkEnvrType }
     * 
     */
    public StopChkEnvrType createStopChkEnvrType() {
        return new StopChkEnvrType();
    }

    /**
     * Create an instance of {@link StopChkRefType }
     * 
     */
    public StopChkRefType createStopChkRefType() {
        return new StopChkRefType();
    }

    /**
     * Create an instance of {@link StopChkStatusRecType }
     * 
     */
    public StopChkStatusRecType createStopChkStatusRecType() {
        return new StopChkStatusRecType();
    }

    /**
     * Create an instance of {@link SubAcctRefType }
     * 
     */
    public SubAcctRefType createSubAcctRefType() {
        return new SubAcctRefType();
    }

    /**
     * Create an instance of {@link SupplyingCountryType }
     * 
     */
    public SupplyingCountryType createSupplyingCountryType() {
        return new SupplyingCountryType();
    }

    /**
     * Create an instance of {@link SvcAcctEnvrType }
     * 
     */
    public SvcAcctEnvrType createSvcAcctEnvrType() {
        return new SvcAcctEnvrType();
    }

    /**
     * Create an instance of {@link SvcAcctInfoType }
     * 
     */
    public SvcAcctInfoType createSvcAcctInfoType() {
        return new SvcAcctInfoType();
    }

    /**
     * Create an instance of {@link SvcAcctKeysType }
     * 
     */
    public SvcAcctKeysType createSvcAcctKeysType() {
        return new SvcAcctKeysType();
    }

    /**
     * Create an instance of {@link SvcAcctRecType }
     * 
     */
    public SvcAcctRecType createSvcAcctRecType() {
        return new SvcAcctRecType();
    }

    /**
     * Create an instance of {@link SvcAcctRefType }
     * 
     */
    public SvcAcctRefType createSvcAcctRefType() {
        return new SvcAcctRefType();
    }

    /**
     * Create an instance of {@link SvcAcctSelType }
     * 
     */
    public SvcAcctSelType createSvcAcctSelType() {
        return new SvcAcctSelType();
    }

    /**
     * Create an instance of {@link SvcAcctStatusType }
     * 
     */
    public SvcAcctStatusType createSvcAcctStatusType() {
        return new SvcAcctStatusType();
    }

    /**
     * Create an instance of {@link SvcAcctStatusRecType }
     * 
     */
    public SvcAcctStatusRecType createSvcAcctStatusRecType() {
        return new SvcAcctStatusRecType();
    }

    /**
     * Create an instance of {@link SvcProfEnvrType }
     * 
     */
    public SvcProfEnvrType createSvcProfEnvrType() {
        return new SvcProfEnvrType();
    }

    /**
     * Create an instance of {@link SvcProfInfoType }
     * 
     */
    public SvcProfInfoType createSvcProfInfoType() {
        return new SvcProfInfoType();
    }

    /**
     * Create an instance of {@link SvcProfKeysType }
     * 
     */
    public SvcProfKeysType createSvcProfKeysType() {
        return new SvcProfKeysType();
    }

    /**
     * Create an instance of {@link SvcProfRecType }
     * 
     */
    public SvcProfRecType createSvcProfRecType() {
        return new SvcProfRecType();
    }

    /**
     * Create an instance of {@link SvcProfRefType }
     * 
     */
    public SvcProfRefType createSvcProfRefType() {
        return new SvcProfRefType();
    }

    /**
     * Create an instance of {@link SvcProfSelType }
     * 
     */
    public SvcProfSelType createSvcProfSelType() {
        return new SvcProfSelType();
    }

    /**
     * Create an instance of {@link SvcProfStatusType }
     * 
     */
    public SvcProfStatusType createSvcProfStatusType() {
        return new SvcProfStatusType();
    }

    /**
     * Create an instance of {@link SvcProfStatusRecType }
     * 
     */
    public SvcProfStatusRecType createSvcProfStatusRecType() {
        return new SvcProfStatusRecType();
    }

    /**
     * Create an instance of {@link TaxCountryType }
     * 
     */
    public TaxCountryType createTaxCountryType() {
        return new TaxCountryType();
    }

    /**
     * Create an instance of {@link TaxDataType }
     * 
     */
    public TaxDataType createTaxDataType() {
        return new TaxDataType();
    }

    /**
     * Create an instance of {@link TaxResidenceCountryType }
     * 
     */
    public TaxResidenceCountryType createTaxResidenceCountryType() {
        return new TaxResidenceCountryType();
    }

    /**
     * Create an instance of {@link TaxWithheldDataType }
     * 
     */
    public TaxWithheldDataType createTaxWithheldDataType() {
        return new TaxWithheldDataType();
    }

    /**
     * Create an instance of {@link TerminalObjEnvrType }
     * 
     */
    public TerminalObjEnvrType createTerminalObjEnvrType() {
        return new TerminalObjEnvrType();
    }

    /**
     * Create an instance of {@link TerminalObjInfoType }
     * 
     */
    public TerminalObjInfoType createTerminalObjInfoType() {
        return new TerminalObjInfoType();
    }

    /**
     * Create an instance of {@link TerminalObjKeysType }
     * 
     */
    public TerminalObjKeysType createTerminalObjKeysType() {
        return new TerminalObjKeysType();
    }

    /**
     * Create an instance of {@link TerminalObjRecType }
     * 
     */
    public TerminalObjRecType createTerminalObjRecType() {
        return new TerminalObjRecType();
    }

    /**
     * Create an instance of {@link TerminalObjRefType }
     * 
     */
    public TerminalObjRefType createTerminalObjRefType() {
        return new TerminalObjRefType();
    }

    /**
     * Create an instance of {@link TerminalObjSelType }
     * 
     */
    public TerminalObjSelType createTerminalObjSelType() {
        return new TerminalObjSelType();
    }

    /**
     * Create an instance of {@link TerminalObjStatusType }
     * 
     */
    public TerminalObjStatusType createTerminalObjStatusType() {
        return new TerminalObjStatusType();
    }

    /**
     * Create an instance of {@link TerminalObjStatusRecType }
     * 
     */
    public TerminalObjStatusRecType createTerminalObjStatusRecType() {
        return new TerminalObjStatusRecType();
    }

    /**
     * Create an instance of {@link TerminalSPObjEnvrType }
     * 
     */
    public TerminalSPObjEnvrType createTerminalSPObjEnvrType() {
        return new TerminalSPObjEnvrType();
    }

    /**
     * Create an instance of {@link TerminalSPObjInfoType }
     * 
     */
    public TerminalSPObjInfoType createTerminalSPObjInfoType() {
        return new TerminalSPObjInfoType();
    }

    /**
     * Create an instance of {@link TerminalSPObjKeysType }
     * 
     */
    public TerminalSPObjKeysType createTerminalSPObjKeysType() {
        return new TerminalSPObjKeysType();
    }

    /**
     * Create an instance of {@link TerminalSPObjRecType }
     * 
     */
    public TerminalSPObjRecType createTerminalSPObjRecType() {
        return new TerminalSPObjRecType();
    }

    /**
     * Create an instance of {@link TerminalSPObjRefType }
     * 
     */
    public TerminalSPObjRefType createTerminalSPObjRefType() {
        return new TerminalSPObjRefType();
    }

    /**
     * Create an instance of {@link TerminalSPObjSelType }
     * 
     */
    public TerminalSPObjSelType createTerminalSPObjSelType() {
        return new TerminalSPObjSelType();
    }

    /**
     * Create an instance of {@link TerminalSPObjStatusType }
     * 
     */
    public TerminalSPObjStatusType createTerminalSPObjStatusType() {
        return new TerminalSPObjStatusType();
    }

    /**
     * Create an instance of {@link TerminalSPObjStatusRecType }
     * 
     */
    public TerminalSPObjStatusRecType createTerminalSPObjStatusRecType() {
        return new TerminalSPObjStatusRecType();
    }

    /**
     * Create an instance of {@link TimeFrameType }
     * 
     */
    public TimeFrameType createTimeFrameType() {
        return new TimeFrameType();
    }

    /**
     * Create an instance of {@link TotalCurAmtType }
     * 
     */
    public TotalCurAmtType createTotalCurAmtType() {
        return new TotalCurAmtType();
    }

    /**
     * Create an instance of {@link TotalCompositeCurAmtType }
     * 
     */
    public TotalCompositeCurAmtType createTotalCompositeCurAmtType() {
        return new TotalCompositeCurAmtType();
    }

    /**
     * Create an instance of {@link TrnImgType }
     * 
     */
    public TrnImgType createTrnImgType() {
        return new TrnImgType();
    }

    /**
     * Create an instance of {@link TrnTypeType }
     * 
     */
    public TrnTypeType createTrnTypeType() {
        return new TrnTypeType();
    }

    /**
     * Create an instance of {@link XferEnvrType }
     * 
     */
    public XferEnvrType createXferEnvrType() {
        return new XferEnvrType();
    }

    /**
     * Create an instance of {@link XferPayeeType }
     * 
     */
    public XferPayeeType createXferPayeeType() {
        return new XferPayeeType();
    }

    /**
     * Create an instance of {@link XferSelType }
     * 
     */
    public XferSelType createXferSelType() {
        return new XferSelType();
    }

    /**
     * Create an instance of {@link XferStatusType }
     * 
     */
    public XferStatusType createXferStatusType() {
        return new XferStatusType();
    }

    /**
     * Create an instance of {@link XferStatusRecType }
     * 
     */
    public XferStatusRecType createXferStatusRecType() {
        return new XferStatusRecType();
    }

    /**
     * Create an instance of {@link MediaAcctAdjInfoType }
     * 
     */
    public MediaAcctAdjInfoType createMediaAcctAdjInfoType() {
        return new MediaAcctAdjInfoType();
    }

    /**
     * Create an instance of {@link PartyAcctRelAuthType }
     * 
     */
    public PartyAcctRelAuthType createPartyAcctRelAuthType() {
        return new PartyAcctRelAuthType();
    }

    /**
     * Create an instance of {@link PartyCardRelAuthType }
     * 
     */
    public PartyCardRelAuthType createPartyCardRelAuthType() {
        return new PartyCardRelAuthType();
    }

    /**
     * Create an instance of {@link AlertSelType }
     * 
     */
    public AlertSelType createAlertSelType() {
        return new AlertSelType();
    }

    /**
     * Create an instance of {@link AlertStatusType }
     * 
     */
    public AlertStatusType createAlertStatusType() {
        return new AlertStatusType();
    }

    /**
     * Create an instance of {@link AlertEnvrType }
     * 
     */
    public AlertEnvrType createAlertEnvrType() {
        return new AlertEnvrType();
    }

    /**
     * Create an instance of {@link TimeRangeType }
     * 
     */
    public TimeRangeType createTimeRangeType() {
        return new TimeRangeType();
    }

    /**
     * Create an instance of {@link AlertStatusRecType }
     * 
     */
    public AlertStatusRecType createAlertStatusRecType() {
        return new AlertStatusRecType();
    }

    /**
     * Create an instance of {@link PINDataType }
     * 
     */
    public PINDataType createPINDataType() {
        return new PINDataType();
    }

    /**
     * Create an instance of {@link CryptPINType }
     * 
     */
    public CryptPINType createCryptPINType() {
        return new CryptPINType();
    }

    /**
     * Create an instance of {@link ForExQuoteAuthType }
     * 
     */
    public ForExQuoteAuthType createForExQuoteAuthType() {
        return new ForExQuoteAuthType();
    }

    /**
     * Create an instance of {@link TrnRefType }
     * 
     */
    public TrnRefType createTrnRefType() {
        return new TrnRefType();
    }

    /**
     * Create an instance of {@link BankSvcChkSumRefType }
     * 
     */
    public BankSvcChkSumRefType createBankSvcChkSumRefType() {
        return new BankSvcChkSumRefType();
    }

    /**
     * Create an instance of {@link XxxAuthType }
     * 
     */
    public XxxAuthType createXxxAuthType() {
        return new XxxAuthType();
    }

    /**
     * Create an instance of {@link FeeOvrdAmtType }
     * 
     */
    public FeeOvrdAmtType createFeeOvrdAmtType() {
        return new FeeOvrdAmtType();
    }

    /**
     * Create an instance of {@link MediaAcctAddRqType }
     * 
     */
    public MediaAcctAddRqType createMediaAcctAddRqType() {
        return new MediaAcctAddRqType();
    }

    /**
     * Create an instance of {@link MediaAcctAddRsType }
     * 
     */
    public MediaAcctAddRsType createMediaAcctAddRsType() {
        return new MediaAcctAddRsType();
    }

    /**
     * Create an instance of {@link MediaAcctAudRqType }
     * 
     */
    public MediaAcctAudRqType createMediaAcctAudRqType() {
        return new MediaAcctAudRqType();
    }

    /**
     * Create an instance of {@link MediaAcctModRqType }
     * 
     */
    public MediaAcctModRqType createMediaAcctModRqType() {
        return new MediaAcctModRqType();
    }

    /**
     * Create an instance of {@link MediaAcctModRsType }
     * 
     */
    public MediaAcctModRsType createMediaAcctModRsType() {
        return new MediaAcctModRsType();
    }

    /**
     * Create an instance of {@link PartyDetailType }
     * 
     */
    public PartyDetailType createPartyDetailType() {
        return new PartyDetailType();
    }

    /**
     * Create an instance of {@link PmtBatchStatInqRqType }
     * 
     */
    public PmtBatchStatInqRqType createPmtBatchStatInqRqType() {
        return new PmtBatchStatInqRqType();
    }

    /**
     * Create an instance of {@link ToAcctRefType }
     * 
     */
    public ToAcctRefType createToAcctRefType() {
        return new ToAcctRefType();
    }

    /**
     * Create an instance of {@link AcctStatusModRqType }
     * 
     */
    public AcctStatusModRqType createAcctStatusModRqType() {
        return new AcctStatusModRqType();
    }

    /**
     * Create an instance of {@link AcctStatusModRsType }
     * 
     */
    public AcctStatusModRsType createAcctStatusModRsType() {
        return new AcctStatusModRsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaCashDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaCashData")
    public JAXBElement<MediaCashDataType> createMediaCashData(MediaCashDataType value) {
        return new JAXBElement<MediaCashDataType>(_MediaCashData_QNAME, MediaCashDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnInfo")
    public JAXBElement<AcctTrnInfoType> createAcctTrnInfo(AcctTrnInfoType value) {
        return new JAXBElement<AcctTrnInfoType>(_AcctTrnInfo_QNAME, AcctTrnInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStatusRec")
    public JAXBElement<AcctStatusRecType> createAcctStatusRec(AcctStatusRecType value) {
        return new JAXBElement<AcctStatusRecType>(_AcctStatusRec_QNAME, AcctStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelSel")
    public JAXBElement<PartyCardRelSelType> createPartyCardRelSel(PartyCardRelSelType value) {
        return new JAXBElement<PartyCardRelSelType>(_PartyCardRelSel_QNAME, PartyCardRelSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkInfo")
    public JAXBElement<StopChkInfoType> createStopChkInfo(StopChkInfoType value) {
        return new JAXBElement<StopChkInfoType>(_StopChkInfo_QNAME, StopChkInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkSel")
    public JAXBElement<StopChkSelType> createStopChkSel(StopChkSelType value) {
        return new JAXBElement<StopChkSelType>(_StopChkSel_QNAME, StopChkSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkKeys")
    public JAXBElement<StopChkKeysType> createStopChkKeys(StopChkKeysType value) {
        return new JAXBElement<StopChkKeysType>(_StopChkKeys_QNAME, StopChkKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkStatus")
    public JAXBElement<StopChkStatusType> createStopChkStatus(StopChkStatusType value) {
        return new JAXBElement<StopChkStatusType>(_StopChkStatus_QNAME, StopChkStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchangeRate")
    public JAXBElement<ExchangeRateType> createExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_ExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueInfo")
    public JAXBElement<ChkIssueInfoType> createChkIssueInfo(ChkIssueInfoType value) {
        return new JAXBElement<ChkIssueInfoType>(_ChkIssueInfo_QNAME, ChkIssueInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkImgDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkImgData")
    public JAXBElement<ChkImgDataType> createChkImgData(ChkImgDataType value) {
        return new JAXBElement<ChkImgDataType>(_ChkImgData_QNAME, ChkImgDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnEnvr")
    public JAXBElement<AcctTrnEnvrType> createAcctTrnEnvr(AcctTrnEnvrType value) {
        return new JAXBElement<AcctTrnEnvrType>(_AcctTrnEnvr_QNAME, AcctTrnEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditInfo")
    public JAXBElement<CreditInfoType> createCreditInfo(CreditInfoType value) {
        return new JAXBElement<CreditInfoType>(_CreditInfo_QNAME, CreditInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PersonData")
    public JAXBElement<PersonDataType> createPersonData(PersonDataType value) {
        return new JAXBElement<PersonDataType>(_PersonData_QNAME, PersonDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaBalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaBal")
    public JAXBElement<MediaBalType> createMediaBal(MediaBalType value) {
        return new JAXBElement<MediaBalType>(_MediaBal_QNAME, MediaBalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenLoginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenLogin")
    public JAXBElement<SecTokenLoginType> createSecTokenLogin(SecTokenLoginType value) {
        return new JAXBElement<SecTokenLoginType>(_SecTokenLogin_QNAME, SecTokenLoginType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FinancialData")
    public JAXBElement<FinancialDataType> createFinancialData(FinancialDataType value) {
        return new JAXBElement<FinancialDataType>(_FinancialData_QNAME, FinancialDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenSecretAnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenSecretAnswer")
    public JAXBElement<SecTokenSecretAnswerType> createSecTokenSecretAnswer(SecTokenSecretAnswerType value) {
        return new JAXBElement<SecTokenSecretAnswerType>(_SecTokenSecretAnswer_QNAME, SecTokenSecretAnswerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgPartyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgPartyInfo")
    public JAXBElement<OrgPartyInfoType> createOrgPartyInfo(OrgPartyInfoType value) {
        return new JAXBElement<OrgPartyInfoType>(_OrgPartyInfo_QNAME, OrgPartyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgCategoryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgCategoryCode")
    public JAXBElement<OrgCategoryCodeType> createOrgCategoryCode(OrgCategoryCodeType value) {
        return new JAXBElement<OrgCategoryCodeType>(_OrgCategoryCode_QNAME, OrgCategoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntRateDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntRateData")
    public JAXBElement<IntRateDataType> createIntRateData(IntRateDataType value) {
        return new JAXBElement<IntRateDataType>(_IntRateData_QNAME, IntRateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntDistAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntDistAcctRef")
    public JAXBElement<IntDistAcctRefType> createIntDistAcctRef(IntDistAcctRefType value) {
        return new JAXBElement<IntDistAcctRefType>(_IntDistAcctRef_QNAME, IntDistAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkDetail")
    public JAXBElement<ChkDetailType> createChkDetail(ChkDetailType value) {
        return new JAXBElement<ChkDetailType>(_ChkDetail_QNAME, ChkDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAcctDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAcctData")
    public JAXBElement<CreditAcctDataType> createCreditAcctData(CreditAcctDataType value) {
        return new JAXBElement<CreditAcctDataType>(_CreditAcctData_QNAME, CreditAcctDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FromAcctRef")
    public JAXBElement<FromAcctRefType> createFromAcctRef(FromAcctRefType value) {
        return new JAXBElement<FromAcctRefType>(_FromAcctRef_QNAME, FromAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPrefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPref")
    public JAXBElement<PartyPrefType> createPartyPref(PartyPrefType value) {
        return new JAXBElement<PartyPrefType>(_PartyPref_QNAME, PartyPrefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Employment")
    public JAXBElement<EmploymentType> createEmployment(EmploymentType value) {
        return new JAXBElement<EmploymentType>(_Employment_QNAME, EmploymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyKeys")
    public JAXBElement<PartyKeysType> createPartyKeys(PartyKeysType value) {
        return new JAXBElement<PartyKeysType>(_PartyKeys_QNAME, PartyKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelKeys")
    public JAXBElement<PartyPartyRelKeysType> createPartyPartyRelKeys(PartyPartyRelKeysType value) {
        return new JAXBElement<PartyPartyRelKeysType>(_PartyPartyRelKeys_QNAME, PartyPartyRelKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardKeys")
    public JAXBElement<CardKeysType> createCardKeys(CardKeysType value) {
        return new JAXBElement<CardKeysType>(_CardKeys_QNAME, CardKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelKeys")
    public JAXBElement<PartyAcctRelKeysType> createPartyAcctRelKeys(PartyAcctRelKeysType value) {
        return new JAXBElement<PartyAcctRelKeysType>(_PartyAcctRelKeys_QNAME, PartyAcctRelKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctKeys")
    public JAXBElement<AcctKeysType> createAcctKeys(AcctKeysType value) {
        return new JAXBElement<AcctKeysType>(_AcctKeys_QNAME, AcctKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnSel")
    public JAXBElement<AcctTrnSelType> createAcctTrnSel(AcctTrnSelType value) {
        return new JAXBElement<AcctTrnSelType>(_AcctTrnSel_QNAME, AcctTrnSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelPartyRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelPartyRef")
    public JAXBElement<RelPartyRefType> createRelPartyRef(RelPartyRefType value) {
        return new JAXBElement<RelPartyRefType>(_RelPartyRef_QNAME, RelPartyRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelRec")
    public JAXBElement<CardAcctRelRecType> createCardAcctRelRec(CardAcctRelRecType value) {
        return new JAXBElement<CardAcctRelRecType>(_CardAcctRelRec_QNAME, CardAcctRelRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAuth")
    public JAXBElement<CardAuthType> createCardAuth(CardAuthType value) {
        return new JAXBElement<CardAuthType>(_CardAuth_QNAME, CardAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardStatus")
    public JAXBElement<CardStatusType> createCardStatus(CardStatusType value) {
        return new JAXBElement<CardStatusType>(_CardStatus_QNAME, CardStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardInfo")
    public JAXBElement<CardInfoType> createCardInfo(CardInfoType value) {
        return new JAXBElement<CardInfoType>(_CardInfo_QNAME, CardInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelInfo")
    public JAXBElement<PartyPartyRelInfoType> createPartyPartyRelInfo(PartyPartyRelInfoType value) {
        return new JAXBElement<PartyPartyRelInfoType>(_PartyPartyRelInfo_QNAME, PartyPartyRelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTaxDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTaxData")
    public JAXBElement<AcctTaxDataType> createAcctTaxData(AcctTaxDataType value) {
        return new JAXBElement<AcctTaxDataType>(_AcctTaxData_QNAME, AcctTaxDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetInfo")
    public JAXBElement<ForExRateSheetInfoType> createForExRateSheetInfo(ForExRateSheetInfoType value) {
        return new JAXBElement<ForExRateSheetInfoType>(_ForExRateSheetInfo_QNAME, ForExRateSheetInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferInfo")
    public JAXBElement<XferInfoType> createXferInfo(XferInfoType value) {
        return new JAXBElement<XferInfoType>(_XferInfo_QNAME, XferInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferKeys")
    public JAXBElement<XferKeysType> createXferKeys(XferKeysType value) {
        return new JAXBElement<XferKeysType>(_XferKeys_QNAME, XferKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetCurRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetCurRate")
    public JAXBElement<ForExRateSheetCurRateType> createForExRateSheetCurRate(ForExRateSheetCurRateType value) {
        return new JAXBElement<ForExRateSheetCurRateType>(_ForExRateSheetCurRate_QNAME, ForExRateSheetCurRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CredentialsRqHdr")
    public JAXBElement<CredentialsRqHdrType> createCredentialsRqHdr(CredentialsRqHdrType value) {
        return new JAXBElement<CredentialsRqHdrType>(_CredentialsRqHdr_QNAME, CredentialsRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MsgRqHdr")
    public JAXBElement<MsgRqHdrType> createMsgRqHdr(MsgRqHdrType value) {
        return new JAXBElement<MsgRqHdrType>(_MsgRqHdr_QNAME, MsgRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MsgRsHdr")
    public JAXBElement<MsgRsHdrType> createMsgRsHdr(MsgRsHdrType value) {
        return new JAXBElement<MsgRsHdrType>(_MsgRsHdr_QNAME, MsgRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CredentialsRsHdr")
    public JAXBElement<CredentialsRsHdrType> createCredentialsRsHdr(CredentialsRsHdrType value) {
        return new JAXBElement<CredentialsRsHdrType>(_CredentialsRsHdr_QNAME, CredentialsRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenCard")
    public JAXBElement<SecTokenCardType> createSecTokenCard(SecTokenCardType value) {
        return new JAXBElement<SecTokenCardType>(_SecTokenCard_QNAME, SecTokenCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelSel")
    public JAXBElement<PartyPartyRelSelType> createPartyPartyRelSel(PartyPartyRelSelType value) {
        return new JAXBElement<PartyPartyRelSelType>(_PartyPartyRelSel_QNAME, PartyPartyRelSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurAmtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurAmtRange")
    public JAXBElement<CurAmtRangeType> createCurAmtRange(CurAmtRangeType value) {
        return new JAXBElement<CurAmtRangeType>(_CurAmtRange_QNAME, CurAmtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DtRange")
    public JAXBElement<DtRangeType> createDtRange(DtRangeType value) {
        return new JAXBElement<DtRangeType>(_DtRange_QNAME, DtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAuth")
    public JAXBElement<PartyAuthType> createPartyAuth(PartyAuthType value) {
        return new JAXBElement<PartyAuthType>(_PartyAuth_QNAME, PartyAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContextRqHdr")
    public JAXBElement<ContextRqHdrType> createContextRqHdr(ContextRqHdrType value) {
        return new JAXBElement<ContextRqHdrType>(_ContextRqHdr_QNAME, ContextRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContextRsHdr")
    public JAXBElement<ContextRsHdrType> createContextRsHdr(ContextRsHdrType value) {
        return new JAXBElement<ContextRsHdrType>(_ContextRsHdr_QNAME, ContextRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Interface")
    public JAXBElement<InterfaceType> createInterface(InterfaceType value) {
        return new JAXBElement<InterfaceType>(_Interface_QNAME, InterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTrnDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NetworkTrnData")
    public JAXBElement<NetworkTrnDataType> createNetworkTrnData(NetworkTrnDataType value) {
        return new JAXBElement<NetworkTrnDataType>(_NetworkTrnData_QNAME, NetworkTrnDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnualIncomeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AnnualIncome")
    public JAXBElement<AnnualIncomeType> createAnnualIncome(AnnualIncomeType value) {
        return new JAXBElement<AnnualIncomeType>(_AnnualIncome_QNAME, AnnualIncomeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AdditionalStatus")
    public JAXBElement<AdditionalStatusType> createAdditionalStatus(AdditionalStatusType value) {
        return new JAXBElement<AdditionalStatusType>(_AdditionalStatus_QNAME, AdditionalStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RqUID")
    public JAXBElement<String> createRqUID(String value) {
        return new JAXBElement<String>(_RqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostAddr")
    public JAXBElement<PostAddrType> createPostAddr(PostAddrType value) {
        return new JAXBElement<PostAddrType>(_PostAddr_QNAME, PostAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuedIdent")
    public JAXBElement<IssuedIdentType> createIssuedIdent(IssuedIdentType value) {
        return new JAXBElement<IssuedIdentType>(_IssuedIdent_QNAME, IssuedIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntDispDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntDispData")
    public JAXBElement<IntDispDataType> createIntDispData(IntDispDataType value) {
        return new JAXBElement<IntDispDataType>(_IntDispData_QNAME, IntDispDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelData")
    public JAXBElement<PartyAcctRelDataType> createPartyAcctRelData(PartyAcctRelDataType value) {
        return new JAXBElement<PartyAcctRelDataType>(_PartyAcctRelData_QNAME, PartyAcctRelDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USATaxIdCertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "USA.TaxIdCert")
    public JAXBElement<USATaxIdCertType> createUSATaxIdCert(USATaxIdCertType value) {
        return new JAXBElement<USATaxIdCertType>(_USATaxIdCert_QNAME, USATaxIdCertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartySel")
    public JAXBElement<PartySelType> createPartySel(PartySelType value) {
        return new JAXBElement<PartySelType>(_PartySel_QNAME, PartySelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPartyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PersonPartyInfo")
    public JAXBElement<PersonPartyInfoType> createPersonPartyInfo(PersonPartyInfoType value) {
        return new JAXBElement<PersonPartyInfoType>(_PersonPartyInfo_QNAME, PersonPartyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyInfo")
    public JAXBElement<PartyInfoType> createPartyInfo(PartyInfoType value) {
        return new JAXBElement<PartyInfoType>(_PartyInfo_QNAME, PartyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctInfo")
    public JAXBElement<AcctInfoType> createAcctInfo(AcctInfoType value) {
        return new JAXBElement<AcctInfoType>(_AcctInfo_QNAME, AcctInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStatus")
    public JAXBElement<AcctStatusType> createAcctStatus(AcctStatusType value) {
        return new JAXBElement<AcctStatusType>(_AcctStatus_QNAME, AcctStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelInfo")
    public JAXBElement<PartyAcctRelInfoType> createPartyAcctRelInfo(PartyAcctRelInfoType value) {
        return new JAXBElement<PartyAcctRelInfoType>(_PartyAcctRelInfo_QNAME, PartyAcctRelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelRec")
    public JAXBElement<PartyAcctRelRecType> createPartyAcctRelRec(PartyAcctRelRecType value) {
        return new JAXBElement<PartyAcctRelRecType>(_PartyAcctRelRec_QNAME, PartyAcctRelRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelSel")
    public JAXBElement<PartyAcctRelSelType> createPartyAcctRelSel(PartyAcctRelSelType value) {
        return new JAXBElement<PartyAcctRelSelType>(_PartyAcctRelSel_QNAME, PartyAcctRelSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferInfo")
    public JAXBElement<RecXferInfoType> createRecXferInfo(RecXferInfoType value) {
        return new JAXBElement<RecXferInfoType>(_RecXferInfo_QNAME, RecXferInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferKeys")
    public JAXBElement<RecXferKeysType> createRecXferKeys(RecXferKeysType value) {
        return new JAXBElement<RecXferKeysType>(_RecXferKeys_QNAME, RecXferKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PhoneNum")
    public JAXBElement<PhoneNumType> createPhoneNum(PhoneNumType value) {
        return new JAXBElement<PhoneNumType>(_PhoneNum_QNAME, PhoneNumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditMediaChkDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditMediaChkData")
    public JAXBElement<CreditMediaChkDataType> createCreditMediaChkData(CreditMediaChkDataType value) {
        return new JAXBElement<CreditMediaChkDataType>(_CreditMediaChkData_QNAME, CreditMediaChkDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAcctDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAcctData")
    public JAXBElement<DepAcctDataType> createDepAcctData(DepAcctDataType value) {
        return new JAXBElement<DepAcctDataType>(_DepAcctData_QNAME, DepAcctDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurrenceRule")
    public JAXBElement<RecurrenceRuleType> createRecurrenceRule(RecurrenceRuleType value) {
        return new JAXBElement<RecurrenceRuleType>(_RecurrenceRule_QNAME, RecurrenceRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurRule")
    public JAXBElement<RecurRuleType> createRecurRule(RecurRuleType value) {
        return new JAXBElement<RecurRuleType>(_RecurRule_QNAME, RecurRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkData")
    public JAXBElement<ChkDataType> createChkData(ChkDataType value) {
        return new JAXBElement<ChkDataType>(_ChkData_QNAME, ChkDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctSummary")
    public JAXBElement<MediaAcctSummaryType> createMediaAcctSummary(MediaAcctSummaryType value) {
        return new JAXBElement<MediaAcctSummaryType>(_MediaAcctSummary_QNAME, MediaAcctSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctRec")
    public JAXBElement<AcctRecType> createAcctRec(AcctRecType value) {
        return new JAXBElement<AcctRecType>(_AcctRec_QNAME, AcctRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnRec")
    public JAXBElement<AcctTrnRecType> createAcctTrnRec(AcctTrnRecType value) {
        return new JAXBElement<AcctTrnRecType>(_AcctTrnRec_QNAME, AcctTrnRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRec")
    public JAXBElement<PartyRecType> createPartyRec(PartyRecType value) {
        return new JAXBElement<PartyRecType>(_PartyRec_QNAME, PartyRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyIdent")
    public JAXBElement<PartyIdentType> createPartyIdent(PartyIdentType value) {
        return new JAXBElement<PartyIdentType>(_PartyIdent_QNAME, PartyIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelRec")
    public JAXBElement<PartyPartyRelRecType> createPartyPartyRelRec(PartyPartyRelRecType value) {
        return new JAXBElement<PartyPartyRelRecType>(_PartyPartyRelRec_QNAME, PartyPartyRelRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferRec")
    public JAXBElement<RecXferRecType> createRecXferRec(RecXferRecType value) {
        return new JAXBElement<RecXferRecType>(_RecXferRec_QNAME, RecXferRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkRec")
    public JAXBElement<StopChkRecType> createStopChkRec(StopChkRecType value) {
        return new JAXBElement<StopChkRecType>(_StopChkRec_QNAME, StopChkRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardRec")
    public JAXBElement<CardRecType> createCardRec(CardRecType value) {
        return new JAXBElement<CardRecType>(_CardRec_QNAME, CardRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferRec")
    public JAXBElement<XferRecType> createXferRec(XferRecType value) {
        return new JAXBElement<XferRecType>(_XferRec_QNAME, XferRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctStatusRec")
    public JAXBElement<MediaAcctStatusRecType> createMediaAcctStatusRec(MediaAcctStatusRecType value) {
        return new JAXBElement<MediaAcctStatusRecType>(_MediaAcctStatusRec_QNAME, MediaAcctStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctRec")
    public JAXBElement<MediaAcctRecType> createMediaAcctRec(MediaAcctRecType value) {
        return new JAXBElement<MediaAcctRecType>(_MediaAcctRec_QNAME, MediaAcctRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelRec")
    public JAXBElement<PartyCardRelRecType> createPartyCardRelRec(PartyCardRelRecType value) {
        return new JAXBElement<PartyCardRelRecType>(_PartyCardRelRec_QNAME, PartyCardRelRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAuthRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAuthRec")
    public JAXBElement<PartyAuthRecType> createPartyAuthRec(PartyAuthRecType value) {
        return new JAXBElement<PartyAuthRecType>(_PartyAuthRec_QNAME, PartyAuthRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetRec")
    public JAXBElement<ForExRateSheetRecType> createForExRateSheetRec(ForExRateSheetRecType value) {
        return new JAXBElement<ForExRateSheetRecType>(_ForExRateSheetRec_QNAME, ForExRateSheetRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertInfo")
    public JAXBElement<AlertInfoType> createAlertInfo(AlertInfoType value) {
        return new JAXBElement<AlertInfoType>(_AlertInfo_QNAME, AlertInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertKeys")
    public JAXBElement<AlertKeysType> createAlertKeys(AlertKeysType value) {
        return new JAXBElement<AlertKeysType>(_AlertKeys_QNAME, AlertKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertRec")
    public JAXBElement<AlertRecType> createAlertRec(AlertRecType value) {
        return new JAXBElement<AlertRecType>(_AlertRec_QNAME, AlertRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertAmt")
    public JAXBElement<AlertAmtType> createAlertAmt(AlertAmtType value) {
        return new JAXBElement<AlertAmtType>(_AlertAmt_QNAME, AlertAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtInstruction")
    public JAXBElement<PmtInstructionType> createPmtInstruction(PmtInstructionType value) {
        return new JAXBElement<PmtInstructionType>(_PmtInstruction_QNAME, PmtInstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtRec")
    public JAXBElement<PmtRecType> createPmtRec(PmtRecType value) {
        return new JAXBElement<PmtRecType>(_PmtRec_QNAME, PmtRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtInfo")
    public JAXBElement<PmtInfoType> createPmtInfo(PmtInfoType value) {
        return new JAXBElement<PmtInfoType>(_PmtInfo_QNAME, PmtInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtKeys")
    public JAXBElement<PmtKeysType> createPmtKeys(PmtKeysType value) {
        return new JAXBElement<PmtKeysType>(_PmtKeys_QNAME, PmtKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteRec")
    public JAXBElement<ForExQuoteRecType> createForExQuoteRec(ForExQuoteRecType value) {
        return new JAXBElement<ForExQuoteRecType>(_ForExQuoteRec_QNAME, ForExQuoteRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueRec")
    public JAXBElement<ChkIssueRecType> createChkIssueRec(ChkIssueRecType value) {
        return new JAXBElement<ChkIssueRecType>(_ChkIssueRec_QNAME, ChkIssueRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueMiscDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueMiscData")
    public JAXBElement<ChkIssueMiscDataType> createChkIssueMiscData(ChkIssueMiscDataType value) {
        return new JAXBElement<ChkIssueMiscDataType>(_ChkIssueMiscData_QNAME, ChkIssueMiscDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueKeyDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueKeyData")
    public JAXBElement<ChkIssueKeyDataType> createChkIssueKeyData(ChkIssueKeyDataType value) {
        return new JAXBElement<ChkIssueKeyDataType>(_ChkIssueKeyData_QNAME, ChkIssueKeyDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueIdent")
    public JAXBElement<String> createChkIssueIdent(String value) {
        return new JAXBElement<String>(_ChkIssueIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueAuth")
    public JAXBElement<ChkIssueAuthType> createChkIssueAuth(ChkIssueAuthType value) {
        return new JAXBElement<ChkIssueAuthType>(_ChkIssueAuth_QNAME, ChkIssueAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetAuth")
    public JAXBElement<ForExRateSheetAuthType> createForExRateSheetAuth(ForExRateSheetAuthType value) {
        return new JAXBElement<ForExRateSheetAuthType>(_ForExRateSheetAuth_QNAME, ForExRateSheetAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DefaultDrawerInd")
    public JAXBElement<Boolean> createDefaultDrawerInd(Boolean value) {
        return new JAXBElement<Boolean>(_DefaultDrawerInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyIdentType")
    public JAXBElement<String> createPartyIdentType(String value) {
        return new JAXBElement<String>(_PartyIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyIdentValue")
    public JAXBElement<String> createPartyIdentValue(String value) {
        return new JAXBElement<String>(_PartyIdentValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferKeyDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferKeyData")
    public JAXBElement<RecXferKeyDataType> createRecXferKeyData(RecXferKeyDataType value) {
        return new JAXBElement<RecXferKeyDataType>(_RecXferKeyData_QNAME, RecXferKeyDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctFromKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctFromKeys")
    public JAXBElement<AcctFromKeysType> createAcctFromKeys(AcctFromKeysType value) {
        return new JAXBElement<AcctFromKeysType>(_AcctFromKeys_QNAME, AcctFromKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctToKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctToKeys")
    public JAXBElement<AcctToKeysType> createAcctToKeys(AcctToKeysType value) {
        return new JAXBElement<AcctToKeysType>(_AcctToKeys_QNAME, AcctToKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NotAvailableInd")
    public JAXBElement<Boolean> createNotAvailableInd(Boolean value) {
        return new JAXBElement<Boolean>(_NotAvailableInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferAuth")
    public JAXBElement<RecXferAuthType> createRecXferAuth(RecXferAuthType value) {
        return new JAXBElement<RecXferAuthType>(_RecXferAuth_QNAME, RecXferAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferAuth")
    public JAXBElement<XferAuthType> createXferAuth(XferAuthType value) {
        return new JAXBElement<XferAuthType>(_XferAuth_QNAME, XferAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcceptReqd")
    public JAXBElement<Boolean> createAcceptReqd(Boolean value) {
        return new JAXBElement<Boolean>(_AcceptReqd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctAmtType")
    public JAXBElement<String> createAcctAmtType(String value) {
        return new JAXBElement<String>(_AcctAmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctBalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctBal")
    public JAXBElement<AcctBalType> createAcctBal(AcctBalType value) {
        return new JAXBElement<AcctBalType>(_AcctBal_QNAME, AcctBalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctCur")
    public JAXBElement<String> createAcctCur(String value) {
        return new JAXBElement<String>(_AcctCur_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctEnvr")
    public JAXBElement<AcctEnvrType> createAcctEnvr(AcctEnvrType value) {
        return new JAXBElement<AcctEnvrType>(_AcctEnvr_QNAME, AcctEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctId")
    public JAXBElement<String> createAcctId(String value) {
        return new JAXBElement<String>(_AcctId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctIdent")
    public JAXBElement<AcctIdentType> createAcctIdent(AcctIdentType value) {
        return new JAXBElement<AcctIdentType>(_AcctIdent_QNAME, AcctIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctIdentType")
    public JAXBElement<String> createAcctIdentType(String value) {
        return new JAXBElement<String>(_AcctIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctIdentValue")
    public JAXBElement<String> createAcctIdentValue(String value) {
        return new JAXBElement<String>(_AcctIdentValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctKey")
    public JAXBElement<String> createAcctKey(String value) {
        return new JAXBElement<String>(_AcctKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctList")
    public JAXBElement<AcctListType> createAcctList(AcctListType value) {
        return new JAXBElement<AcctListType>(_AcctList_QNAME, AcctListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctMask")
    public JAXBElement<String> createAcctMask(String value) {
        return new JAXBElement<String>(_AcctMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctPayAcct")
    public JAXBElement<String> createAcctPayAcct(String value) {
        return new JAXBElement<String>(_AcctPayAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctPayAcctId")
    public JAXBElement<String> createAcctPayAcctId(String value) {
        return new JAXBElement<String>(_AcctPayAcctId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctPeriodDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctPeriodData")
    public JAXBElement<AcctPeriodDataType> createAcctPeriodData(AcctPeriodDataType value) {
        return new JAXBElement<AcctPeriodDataType>(_AcctPeriodData_QNAME, AcctPeriodDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctPeriodType")
    public JAXBElement<String> createAcctPeriodType(String value) {
        return new JAXBElement<String>(_AcctPeriodType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctRef")
    public JAXBElement<AcctRefType> createAcctRef(AcctRefType value) {
        return new JAXBElement<AcctRefType>(_AcctRef_QNAME, AcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctSel")
    public JAXBElement<AcctSelType> createAcctSel(AcctSelType value) {
        return new JAXBElement<AcctSelType>(_AcctSel_QNAME, AcctSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctAuth")
    public JAXBElement<AcctAuthType> createAcctAuth(AcctAuthType value) {
        return new JAXBElement<AcctAuthType>(_AcctAuth_QNAME, AcctAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStatusCode")
    public JAXBElement<String> createAcctStatusCode(String value) {
        return new JAXBElement<String>(_AcctStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtEnvr")
    public JAXBElement<AcctStmtEnvrType> createAcctStmtEnvr(AcctStmtEnvrType value) {
        return new JAXBElement<AcctStmtEnvrType>(_AcctStmtEnvr_QNAME, AcctStmtEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtId")
    public JAXBElement<String> createAcctStmtId(String value) {
        return new JAXBElement<String>(_AcctStmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtInfo")
    public JAXBElement<AcctStmtInfoType> createAcctStmtInfo(AcctStmtInfoType value) {
        return new JAXBElement<AcctStmtInfoType>(_AcctStmtInfo_QNAME, AcctStmtInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtKeys")
    public JAXBElement<AcctStmtKeysType> createAcctStmtKeys(AcctStmtKeysType value) {
        return new JAXBElement<AcctStmtKeysType>(_AcctStmtKeys_QNAME, AcctStmtKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtRec")
    public JAXBElement<AcctStmtRecType> createAcctStmtRec(AcctStmtRecType value) {
        return new JAXBElement<AcctStmtRecType>(_AcctStmtRec_QNAME, AcctStmtRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtRef")
    public JAXBElement<AcctStmtRefType> createAcctStmtRef(AcctStmtRefType value) {
        return new JAXBElement<AcctStmtRefType>(_AcctStmtRef_QNAME, AcctStmtRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtSel")
    public JAXBElement<AcctStmtSelType> createAcctStmtSel(AcctStmtSelType value) {
        return new JAXBElement<AcctStmtSelType>(_AcctStmtSel_QNAME, AcctStmtSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtStatus")
    public JAXBElement<AcctStmtStatusType> createAcctStmtStatus(AcctStmtStatusType value) {
        return new JAXBElement<AcctStmtStatusType>(_AcctStmtStatus_QNAME, AcctStmtStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtStatusCode")
    public JAXBElement<AcctStmtStatusCodeType> createAcctStmtStatusCode(AcctStmtStatusCodeType value) {
        return new JAXBElement<AcctStmtStatusCodeType>(_AcctStmtStatusCode_QNAME, AcctStmtStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStmtStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctStmtStatusRec")
    public JAXBElement<AcctStmtStatusRecType> createAcctStmtStatusRec(AcctStmtStatusRecType value) {
        return new JAXBElement<AcctStmtStatusRecType>(_AcctStmtStatusRec_QNAME, AcctStmtStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTaxType")
    public JAXBElement<String> createAcctTaxType(String value) {
        return new JAXBElement<String>(_AcctTaxType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTitle")
    public JAXBElement<String> createAcctTitle(String value) {
        return new JAXBElement<String>(_AcctTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgEnvr")
    public JAXBElement<AcctTrnImgEnvrType> createAcctTrnImgEnvr(AcctTrnImgEnvrType value) {
        return new JAXBElement<AcctTrnImgEnvrType>(_AcctTrnImgEnvr_QNAME, AcctTrnImgEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgId")
    public JAXBElement<String> createAcctTrnImgId(String value) {
        return new JAXBElement<String>(_AcctTrnImgId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgInfo")
    public JAXBElement<AcctTrnImgInfoType> createAcctTrnImgInfo(AcctTrnImgInfoType value) {
        return new JAXBElement<AcctTrnImgInfoType>(_AcctTrnImgInfo_QNAME, AcctTrnImgInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgKeys")
    public JAXBElement<AcctTrnImgKeysType> createAcctTrnImgKeys(AcctTrnImgKeysType value) {
        return new JAXBElement<AcctTrnImgKeysType>(_AcctTrnImgKeys_QNAME, AcctTrnImgKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgRec")
    public JAXBElement<AcctTrnImgRecType> createAcctTrnImgRec(AcctTrnImgRecType value) {
        return new JAXBElement<AcctTrnImgRecType>(_AcctTrnImgRec_QNAME, AcctTrnImgRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgRef")
    public JAXBElement<AcctTrnImgRefType> createAcctTrnImgRef(AcctTrnImgRefType value) {
        return new JAXBElement<AcctTrnImgRefType>(_AcctTrnImgRef_QNAME, AcctTrnImgRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgSel")
    public JAXBElement<AcctTrnImgSelType> createAcctTrnImgSel(AcctTrnImgSelType value) {
        return new JAXBElement<AcctTrnImgSelType>(_AcctTrnImgSel_QNAME, AcctTrnImgSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgStatus")
    public JAXBElement<AcctTrnImgStatusType> createAcctTrnImgStatus(AcctTrnImgStatusType value) {
        return new JAXBElement<AcctTrnImgStatusType>(_AcctTrnImgStatus_QNAME, AcctTrnImgStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgStatusCode")
    public JAXBElement<AcctTrnImgStatusCodeType> createAcctTrnImgStatusCode(AcctTrnImgStatusCodeType value) {
        return new JAXBElement<AcctTrnImgStatusCodeType>(_AcctTrnImgStatusCode_QNAME, AcctTrnImgStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnImgStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnImgStatusRec")
    public JAXBElement<AcctTrnImgStatusRecType> createAcctTrnImgStatusRec(AcctTrnImgStatusRecType value) {
        return new JAXBElement<AcctTrnImgStatusRecType>(_AcctTrnImgStatusRec_QNAME, AcctTrnImgStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnAuth")
    public JAXBElement<AcctTrnAuthType> createAcctTrnAuth(AcctTrnAuthType value) {
        return new JAXBElement<AcctTrnAuthType>(_AcctTrnAuth_QNAME, AcctTrnAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnId")
    public JAXBElement<String> createAcctTrnId(String value) {
        return new JAXBElement<String>(_AcctTrnId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnKeys")
    public JAXBElement<AcctTrnKeysType> createAcctTrnKeys(AcctTrnKeysType value) {
        return new JAXBElement<AcctTrnKeysType>(_AcctTrnKeys_QNAME, AcctTrnKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnLimit")
    public JAXBElement<AcctTrnLimitType> createAcctTrnLimit(AcctTrnLimitType value) {
        return new JAXBElement<AcctTrnLimitType>(_AcctTrnLimit_QNAME, AcctTrnLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnRef")
    public JAXBElement<AcctTrnRefType> createAcctTrnRef(AcctTrnRefType value) {
        return new JAXBElement<AcctTrnRefType>(_AcctTrnRef_QNAME, AcctTrnRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnStatus")
    public JAXBElement<AcctTrnStatusType> createAcctTrnStatus(AcctTrnStatusType value) {
        return new JAXBElement<AcctTrnStatusType>(_AcctTrnStatus_QNAME, AcctTrnStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnStatusCode")
    public JAXBElement<String> createAcctTrnStatusCode(String value) {
        return new JAXBElement<String>(_AcctTrnStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnUse")
    public JAXBElement<String> createAcctTrnUse(String value) {
        return new JAXBElement<String>(_AcctTrnUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnStatusRec")
    public JAXBElement<AcctTrnStatusRecType> createAcctTrnStatusRec(AcctTrnStatusRecType value) {
        return new JAXBElement<AcctTrnStatusRecType>(_AcctTrnStatusRec_QNAME, AcctTrnStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctType")
    public JAXBElement<AcctTypeType> createAcctType(AcctTypeType value) {
        return new JAXBElement<AcctTypeType>(_AcctType_QNAME, AcctTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTypeSource")
    public JAXBElement<String> createAcctTypeSource(String value) {
        return new JAXBElement<String>(_AcctTypeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTypeValue")
    public JAXBElement<String> createAcctTypeValue(String value) {
        return new JAXBElement<String>(_AcctTypeValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctUse")
    public JAXBElement<String> createAcctUse(String value) {
        return new JAXBElement<String>(_AcctUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Addr1")
    public JAXBElement<String> createAddr1(String value) {
        return new JAXBElement<String>(_Addr1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Addr2")
    public JAXBElement<String> createAddr2(String value) {
        return new JAXBElement<String>(_Addr2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Addr3")
    public JAXBElement<String> createAddr3(String value) {
        return new JAXBElement<String>(_Addr3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Addr4")
    public JAXBElement<String> createAddr4(String value) {
        return new JAXBElement<String>(_Addr4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AddrType")
    public JAXBElement<String> createAddrType(String value) {
        return new JAXBElement<String>(_AddrType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AdjType")
    public JAXBElement<String> createAdjType(String value) {
        return new JAXBElement<String>(_AdjType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AffinityName")
    public JAXBElement<String> createAffinityName(String value) {
        return new JAXBElement<String>(_AffinityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AgentIdent")
    public JAXBElement<String> createAgentIdent(String value) {
        return new JAXBElement<String>(_AgentIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AgentType")
    public JAXBElement<String> createAgentType(String value) {
        return new JAXBElement<String>(_AgentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Aging")
    public JAXBElement<String> createAging(String value) {
        return new JAXBElement<String>(_Aging_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AllDayEvent")
    public JAXBElement<Boolean> createAllDayEvent(Boolean value) {
        return new JAXBElement<Boolean>(_AllDayEvent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AllocateAllowed")
    public JAXBElement<Boolean> createAllocateAllowed(Boolean value) {
        return new JAXBElement<Boolean>(_AllocateAllowed_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Amt")
    public JAXBElement<BigDecimal> createAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AppIdent")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppIdent(byte[] value) {
        return new JAXBElement<byte[]>(_AppIdent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AppPan")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppPan(byte[] value) {
        return new JAXBElement<byte[]>(_AppPan_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AppPanSeq")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppPanSeq(byte[] value) {
        return new JAXBElement<byte[]>(_AppPanSeq_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ApprovalIdent")
    public JAXBElement<String> createApprovalIdent(String value) {
        return new JAXBElement<String>(_ApprovalIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ArtWorkIdent")
    public JAXBElement<String> createArtWorkIdent(String value) {
        return new JAXBElement<String>(_ArtWorkIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AsyncRqUID")
    public JAXBElement<String> createAsyncRqUID(String value) {
        return new JAXBElement<String>(_AsyncRqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AsyncRsData")
    public JAXBElement<AsyncRsDataType> createAsyncRsData(AsyncRsDataType value) {
        return new JAXBElement<AsyncRsDataType>(_AsyncRsData_QNAME, AsyncRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AuthRsCode")
    public JAXBElement<String> createAuthRsCode(String value) {
        return new JAXBElement<String>(_AuthRsCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AutoReissue")
    public JAXBElement<Boolean> createAutoReissue(Boolean value) {
        return new JAXBElement<Boolean>(_AutoReissue_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AutoReplacement")
    public JAXBElement<Boolean> createAutoReplacement(Boolean value) {
        return new JAXBElement<Boolean>(_AutoReplacement_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AvailDt")
    public JAXBElement<String> createAvailDt(String value) {
        return new JAXBElement<String>(_AvailDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BBAN")
    public JAXBElement<String> createBBAN(String value) {
        return new JAXBElement<String>(_BBAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BalAmt")
    public JAXBElement<BalAmtType> createBalAmt(BalAmtType value) {
        return new JAXBElement<BalAmtType>(_BalAmt_QNAME, BalAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BalType")
    public JAXBElement<BalTypeType> createBalType(BalTypeType value) {
        return new JAXBElement<BalTypeType>(_BalType_QNAME, BalTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BalTypeSource")
    public JAXBElement<String> createBalTypeSource(String value) {
        return new JAXBElement<String>(_BalTypeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BalTypeValues")
    public JAXBElement<String> createBalTypeValues(String value) {
        return new JAXBElement<String>(_BalTypeValues_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSum")
    public JAXBElement<BankSvcChkSumType> createBankSvcChkSum(BankSvcChkSumType value) {
        return new JAXBElement<BankSvcChkSumType>(_BankSvcChkSum_QNAME, BankSvcChkSumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumEnvr")
    public JAXBElement<BankSvcChkSumEnvrType> createBankSvcChkSumEnvr(BankSvcChkSumEnvrType value) {
        return new JAXBElement<BankSvcChkSumEnvrType>(_BankSvcChkSumEnvr_QNAME, BankSvcChkSumEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumId")
    public JAXBElement<String> createBankSvcChkSumId(String value) {
        return new JAXBElement<String>(_BankSvcChkSumId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumInfo")
    public JAXBElement<BankSvcChkSumInfoType> createBankSvcChkSumInfo(BankSvcChkSumInfoType value) {
        return new JAXBElement<BankSvcChkSumInfoType>(_BankSvcChkSumInfo_QNAME, BankSvcChkSumInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumKeys")
    public JAXBElement<BankSvcChkSumKeysType> createBankSvcChkSumKeys(BankSvcChkSumKeysType value) {
        return new JAXBElement<BankSvcChkSumKeysType>(_BankSvcChkSumKeys_QNAME, BankSvcChkSumKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumRec")
    public JAXBElement<BankSvcChkSumRecType> createBankSvcChkSumRec(BankSvcChkSumRecType value) {
        return new JAXBElement<BankSvcChkSumRecType>(_BankSvcChkSumRec_QNAME, BankSvcChkSumRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumSel")
    public JAXBElement<BankSvcChkSumSelType> createBankSvcChkSumSel(BankSvcChkSumSelType value) {
        return new JAXBElement<BankSvcChkSumSelType>(_BankSvcChkSumSel_QNAME, BankSvcChkSumSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumStatus")
    public JAXBElement<BankSvcChkSumStatusType> createBankSvcChkSumStatus(BankSvcChkSumStatusType value) {
        return new JAXBElement<BankSvcChkSumStatusType>(_BankSvcChkSumStatus_QNAME, BankSvcChkSumStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumStatusCode")
    public JAXBElement<String> createBankSvcChkSumStatusCode(String value) {
        return new JAXBElement<String>(_BankSvcChkSumStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankSvcChkSumStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumStatusRec")
    public JAXBElement<BankSvcChkSumStatusRecType> createBankSvcChkSumStatusRec(BankSvcChkSumStatusRecType value) {
        return new JAXBElement<BankSvcChkSumStatusRecType>(_BankSvcChkSumStatusRec_QNAME, BankSvcChkSumStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumType")
    public JAXBElement<String> createBankSvcChkSumType(String value) {
        return new JAXBElement<String>(_BankSvcChkSumType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BankSvcChkSumValue")
    public JAXBElement<BigDecimal> createBankSvcChkSumValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BankSvcChkSumValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BaseAuth")
    public JAXBElement<BaseAuthType> createBaseAuth(BaseAuthType value) {
        return new JAXBElement<BaseAuthType>(_BaseAuth_QNAME, BaseAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BaseCurAmt")
    public JAXBElement<BigDecimal> createBaseCurAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BaseCurAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseCurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BaseCurCode")
    public JAXBElement<BaseCurCodeType> createBaseCurCode(BaseCurCodeType value) {
        return new JAXBElement<BaseCurCodeType>(_BaseCurCode_QNAME, BaseCurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BaseKeys")
    public JAXBElement<BaseKeysType> createBaseKeys(BaseKeysType value) {
        return new JAXBElement<BaseKeysType>(_BaseKeys_QNAME, BaseKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BaseEnvr")
    public JAXBElement<BaseEnvrType> createBaseEnvr(BaseEnvrType value) {
        return new JAXBElement<BaseEnvrType>(_BaseEnvr_QNAME, BaseEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BatchData")
    public JAXBElement<BatchDataType> createBatchData(BatchDataType value) {
        return new JAXBElement<BatchDataType>(_BatchData_QNAME, BatchDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BidOffer")
    public JAXBElement<BidOfferType> createBidOffer(BidOfferType value) {
        return new JAXBElement<BidOfferType>(_BidOffer_QNAME, BidOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillEnvr")
    public JAXBElement<BillEnvrType> createBillEnvr(BillEnvrType value) {
        return new JAXBElement<BillEnvrType>(_BillEnvr_QNAME, BillEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillDt")
    public JAXBElement<XMLGregorianCalendar> createBillDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillId")
    public JAXBElement<String> createBillId(String value) {
        return new JAXBElement<String>(_BillId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillInfo")
    public JAXBElement<BillInfoType> createBillInfo(BillInfoType value) {
        return new JAXBElement<BillInfoType>(_BillInfo_QNAME, BillInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillKeys")
    public JAXBElement<BillKeysType> createBillKeys(BillKeysType value) {
        return new JAXBElement<BillKeysType>(_BillKeys_QNAME, BillKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillRec")
    public JAXBElement<BillRecType> createBillRec(BillRecType value) {
        return new JAXBElement<BillRecType>(_BillRec_QNAME, BillRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillRef")
    public JAXBElement<BillRefType> createBillRef(BillRefType value) {
        return new JAXBElement<BillRefType>(_BillRef_QNAME, BillRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSel")
    public JAXBElement<BillSelType> createBillSel(BillSelType value) {
        return new JAXBElement<BillSelType>(_BillSel_QNAME, BillSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillStatus")
    public JAXBElement<BillStatusType> createBillStatus(BillStatusType value) {
        return new JAXBElement<BillStatusType>(_BillStatus_QNAME, BillStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillStatusCode")
    public JAXBElement<String> createBillStatusCode(String value) {
        return new JAXBElement<String>(_BillStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillStatusRec")
    public JAXBElement<BillStatusRecType> createBillStatusRec(BillStatusRecType value) {
        return new JAXBElement<BillStatusRecType>(_BillStatusRec_QNAME, BillStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillRefData")
    public JAXBElement<String> createBillRefData(String value) {
        return new JAXBElement<String>(_BillRefData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillRetAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillRetAddr")
    public JAXBElement<BillRetAddrType> createBillRetAddr(BillRetAddrType value) {
        return new JAXBElement<BillRetAddrType>(_BillRetAddr_QNAME, BillRetAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillType")
    public JAXBElement<String> createBillType(String value) {
        return new JAXBElement<String>(_BillType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerContact")
    public JAXBElement<BillerContactType> createBillerContact(BillerContactType value) {
        return new JAXBElement<BillerContactType>(_BillerContact_QNAME, BillerContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerId")
    public JAXBElement<BillerIdType> createBillerId(BillerIdType value) {
        return new JAXBElement<BillerIdType>(_BillerId_QNAME, BillerIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerKeys")
    public JAXBElement<BillerKeysType> createBillerKeys(BillerKeysType value) {
        return new JAXBElement<BillerKeysType>(_BillerKeys_QNAME, BillerKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerNum")
    public JAXBElement<String> createBillerNum(String value) {
        return new JAXBElement<String>(_BillerNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerPayInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerPayInfo")
    public JAXBElement<BillerPayInfoType> createBillerPayInfo(BillerPayInfoType value) {
        return new JAXBElement<BillerPayInfoType>(_BillerPayInfo_QNAME, BillerPayInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerPayeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillerPayee")
    public JAXBElement<BillerPayeeType> createBillerPayee(BillerPayeeType value) {
        return new JAXBElement<BillerPayeeType>(_BillerPayee_QNAME, BillerPayeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillingAcct")
    public JAXBElement<String> createBillingAcct(String value) {
        return new JAXBElement<String>(_BillingAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillingMethod")
    public JAXBElement<BillingMethodType> createBillingMethod(BillingMethodType value) {
        return new JAXBElement<BillingMethodType>(_BillingMethod_QNAME, BillingMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BinData")
    public JAXBElement<byte[]> createBinData(byte[] value) {
        return new JAXBElement<byte[]>(_BinData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillStmtDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillStmtData")
    public JAXBElement<BillStmtDataType> createBillStmtData(BillStmtDataType value) {
        return new JAXBElement<BillStmtDataType>(_BillStmtData_QNAME, BillStmtDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSummAmt")
    public JAXBElement<BillSummAmtType> createBillSummAmt(BillSummAmtType value) {
        return new JAXBElement<BillSummAmtType>(_BillSummAmt_QNAME, BillSummAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSummAmtCode")
    public JAXBElement<String> createBillSummAmtCode(String value) {
        return new JAXBElement<String>(_BillSummAmtCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSummAmtIdent")
    public JAXBElement<String> createBillSummAmtIdent(String value) {
        return new JAXBElement<String>(_BillSummAmtIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummAmtTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSummAmtType")
    public JAXBElement<BillSummAmtTypeType> createBillSummAmtType(BillSummAmtTypeType value) {
        return new JAXBElement<BillSummAmtTypeType>(_BillSummAmtType_QNAME, BillSummAmtTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummSubAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillSummSubAmt")
    public JAXBElement<BillSummSubAmtType> createBillSummSubAmt(BillSummSubAmtType value) {
        return new JAXBElement<BillSummSubAmtType>(_BillSummSubAmt_QNAME, BillSummSubAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BinLength")
    public JAXBElement<Long> createBinLength(Long value) {
        return new JAXBElement<Long>(_BinLength_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Binary")
    public JAXBElement<BinaryType> createBinary(BinaryType value) {
        return new JAXBElement<BinaryType>(_Binary_QNAME, BinaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Binary128Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Binary128")
    public JAXBElement<Binary128Type> createBinary128(Binary128Type value) {
        return new JAXBElement<Binary128Type>(_Binary128_QNAME, Binary128Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BirthDt")
    public JAXBElement<XMLGregorianCalendar> createBirthDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BirthDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BirthPlace")
    public JAXBElement<String> createBirthPlace(String value) {
        return new JAXBElement<String>(_BirthPlace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BranchIdent")
    public JAXBElement<String> createBranchIdent(String value) {
        return new JAXBElement<String>(_BranchIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BranchName")
    public JAXBElement<String> createBranchName(String value) {
        return new JAXBElement<String>(_BranchName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Brand")
    public JAXBElement<String> createBrand(String value) {
        return new JAXBElement<String>(_Brand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuySellIndicatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BuySellIndicator")
    public JAXBElement<BuySellIndicatorType> createBuySellIndicator(BuySellIndicatorType value) {
        return new JAXBElement<BuySellIndicatorType>(_BuySellIndicator_QNAME, BuySellIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CampaignIdent")
    public JAXBElement<String> createCampaignIdent(String value) {
        return new JAXBElement<String>(_CampaignIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CLABE")
    public JAXBElement<String> createCLABE(String value) {
        return new JAXBElement<String>(_CLABE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CSPRefIdent")
    public JAXBElement<String> createCSPRefIdent(String value) {
        return new JAXBElement<String>(_CSPRefIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CSPhoneNum")
    public JAXBElement<String> createCSPhoneNum(String value) {
        return new JAXBElement<String>(_CSPhoneNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CalException")
    public JAXBElement<CalExceptionType> createCalException(CalExceptionType value) {
        return new JAXBElement<CalExceptionType>(_CalException_QNAME, CalExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctPriority")
    public JAXBElement<Long> createCardAcctPriority(Long value) {
        return new JAXBElement<Long>(_CardAcctPriority_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAuthRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAuthRec")
    public JAXBElement<CardAuthRecType> createCardAuthRec(CardAuthRecType value) {
        return new JAXBElement<CardAuthRecType>(_CardAuthRec_QNAME, CardAuthRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelEnvr")
    public JAXBElement<CardAcctRelEnvrType> createCardAcctRelEnvr(CardAcctRelEnvrType value) {
        return new JAXBElement<CardAcctRelEnvrType>(_CardAcctRelEnvr_QNAME, CardAcctRelEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelAuth")
    public JAXBElement<CardAcctRelAuthType> createCardAcctRelAuth(CardAcctRelAuthType value) {
        return new JAXBElement<CardAcctRelAuthType>(_CardAcctRelAuth_QNAME, CardAcctRelAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelId")
    public JAXBElement<String> createCardAcctRelId(String value) {
        return new JAXBElement<String>(_CardAcctRelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelInfo")
    public JAXBElement<CardAcctRelInfoType> createCardAcctRelInfo(CardAcctRelInfoType value) {
        return new JAXBElement<CardAcctRelInfoType>(_CardAcctRelInfo_QNAME, CardAcctRelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelKeys")
    public JAXBElement<CardAcctRelKeysType> createCardAcctRelKeys(CardAcctRelKeysType value) {
        return new JAXBElement<CardAcctRelKeysType>(_CardAcctRelKeys_QNAME, CardAcctRelKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelRef")
    public JAXBElement<CardAcctRelRefType> createCardAcctRelRef(CardAcctRelRefType value) {
        return new JAXBElement<CardAcctRelRefType>(_CardAcctRelRef_QNAME, CardAcctRelRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelSel")
    public JAXBElement<CardAcctRelSelType> createCardAcctRelSel(CardAcctRelSelType value) {
        return new JAXBElement<CardAcctRelSelType>(_CardAcctRelSel_QNAME, CardAcctRelSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelStatus")
    public JAXBElement<CardAcctRelStatusType> createCardAcctRelStatus(CardAcctRelStatusType value) {
        return new JAXBElement<CardAcctRelStatusType>(_CardAcctRelStatus_QNAME, CardAcctRelStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelStatusCode")
    public JAXBElement<String> createCardAcctRelStatusCode(String value) {
        return new JAXBElement<String>(_CardAcctRelStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAcctRelStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardAcctRelStatusRec")
    public JAXBElement<CardAcctRelStatusRecType> createCardAcctRelStatusRec(CardAcctRelStatusRecType value) {
        return new JAXBElement<CardAcctRelStatusRecType>(_CardAcctRelStatusRec_QNAME, CardAcctRelStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardCategory")
    public JAXBElement<String> createCardCategory(String value) {
        return new JAXBElement<String>(_CardCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardChipDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardChipData")
    public JAXBElement<CardChipDataType> createCardChipData(CardChipDataType value) {
        return new JAXBElement<CardChipDataType>(_CardChipData_QNAME, CardChipDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardEmbossNum")
    public JAXBElement<String> createCardEmbossNum(String value) {
        return new JAXBElement<String>(_CardEmbossNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardEnvr")
    public JAXBElement<CardEnvrType> createCardEnvr(CardEnvrType value) {
        return new JAXBElement<CardEnvrType>(_CardEnvr_QNAME, CardEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardId")
    public JAXBElement<String> createCardId(String value) {
        return new JAXBElement<String>(_CardId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardMagDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardMagData")
    public JAXBElement<CardMagDataType> createCardMagData(CardMagDataType value) {
        return new JAXBElement<CardMagDataType>(_CardMagData_QNAME, CardMagDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardNum")
    public JAXBElement<String> createCardNum(String value) {
        return new JAXBElement<String>(_CardNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPrefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardPref")
    public JAXBElement<CardPrefType> createCardPref(CardPrefType value) {
        return new JAXBElement<CardPrefType>(_CardPref_QNAME, CardPrefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPrefTrnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardPrefTrn")
    public JAXBElement<CardPrefTrnType> createCardPrefTrn(CardPrefTrnType value) {
        return new JAXBElement<CardPrefTrnType>(_CardPrefTrn_QNAME, CardPrefTrnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardRef")
    public JAXBElement<CardRefType> createCardRef(CardRefType value) {
        return new JAXBElement<CardRefType>(_CardRef_QNAME, CardRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardSel")
    public JAXBElement<CardSelType> createCardSel(CardSelType value) {
        return new JAXBElement<CardSelType>(_CardSel_QNAME, CardSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardSeqNum")
    public JAXBElement<String> createCardSeqNum(String value) {
        return new JAXBElement<String>(_CardSeqNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardStatusRec")
    public JAXBElement<CardStatusRecType> createCardStatusRec(CardStatusRecType value) {
        return new JAXBElement<CardStatusRecType>(_CardStatusRec_QNAME, CardStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardStatusAction")
    public JAXBElement<String> createCardStatusAction(String value) {
        return new JAXBElement<String>(_CardStatusAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardStatusCode")
    public JAXBElement<String> createCardStatusCode(String value) {
        return new JAXBElement<String>(_CardStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardTechnology")
    public JAXBElement<String> createCardTechnology(String value) {
        return new JAXBElement<String>(_CardTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTrnLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardTrnLimit")
    public JAXBElement<CardTrnLimitType> createCardTrnLimit(CardTrnLimitType value) {
        return new JAXBElement<CardTrnLimitType>(_CardTrnLimit_QNAME, CardTrnLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardType")
    public JAXBElement<String> createCardType(String value) {
        return new JAXBElement<String>(_CardType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardUpdateRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardUpdateRec")
    public JAXBElement<CardUpdateRecType> createCardUpdateRec(CardUpdateRecType value) {
        return new JAXBElement<CardUpdateRecType>(_CardUpdateRec_QNAME, CardUpdateRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardUpdateRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardUpdateRsHdr")
    public JAXBElement<CardUpdateRsHdrType> createCardUpdateRsHdr(CardUpdateRsHdrType value) {
        return new JAXBElement<CardUpdateRsHdrType>(_CardUpdateRsHdr_QNAME, CardUpdateRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardVerifyType")
    public JAXBElement<String> createCardVerifyType(String value) {
        return new JAXBElement<String>(_CardVerifyType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CardVrfyData")
    public JAXBElement<String> createCardVrfyData(String value) {
        return new JAXBElement<String>(_CardVrfyData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CashAmt")
    public JAXBElement<CashAmtType> createCashAmt(CashAmtType value) {
        return new JAXBElement<CashAmtType>(_CashAmt_QNAME, CashAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CashQuality")
    public JAXBElement<String> createCashQuality(String value) {
        return new JAXBElement<String>(_CashQuality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CashSerialNum")
    public JAXBElement<String> createCashSerialNum(String value) {
        return new JAXBElement<String>(_CashSerialNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashSignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CashSignature")
    public JAXBElement<CashSignatureType> createCashSignature(CashSignatureType value) {
        return new JAXBElement<CashSignatureType>(_CashSignature_QNAME, CashSignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CashValidity")
    public JAXBElement<String> createCashValidity(String value) {
        return new JAXBElement<String>(_CashValidity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Certificate")
    public JAXBElement<CertificateType> createCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_Certificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChargeRegulation")
    public JAXBElement<String> createChargeRegulation(String value) {
        return new JAXBElement<String>(_ChargeRegulation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptId")
    public JAXBElement<String> createChkAcceptId(String value) {
        return new JAXBElement<String>(_ChkAcceptId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptEnvr")
    public JAXBElement<ChkAcceptEnvrType> createChkAcceptEnvr(ChkAcceptEnvrType value) {
        return new JAXBElement<ChkAcceptEnvrType>(_ChkAcceptEnvr_QNAME, ChkAcceptEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptInfo")
    public JAXBElement<ChkAcceptInfoType> createChkAcceptInfo(ChkAcceptInfoType value) {
        return new JAXBElement<ChkAcceptInfoType>(_ChkAcceptInfo_QNAME, ChkAcceptInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptKeys")
    public JAXBElement<ChkAcceptKeysType> createChkAcceptKeys(ChkAcceptKeysType value) {
        return new JAXBElement<ChkAcceptKeysType>(_ChkAcceptKeys_QNAME, ChkAcceptKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptRec")
    public JAXBElement<ChkAcceptRecType> createChkAcceptRec(ChkAcceptRecType value) {
        return new JAXBElement<ChkAcceptRecType>(_ChkAcceptRec_QNAME, ChkAcceptRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptRef")
    public JAXBElement<ChkAcceptRefType> createChkAcceptRef(ChkAcceptRefType value) {
        return new JAXBElement<ChkAcceptRefType>(_ChkAcceptRef_QNAME, ChkAcceptRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptSel")
    public JAXBElement<ChkAcceptSelType> createChkAcceptSel(ChkAcceptSelType value) {
        return new JAXBElement<ChkAcceptSelType>(_ChkAcceptSel_QNAME, ChkAcceptSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptStatus")
    public JAXBElement<ChkAcceptStatusType> createChkAcceptStatus(ChkAcceptStatusType value) {
        return new JAXBElement<ChkAcceptStatusType>(_ChkAcceptStatus_QNAME, ChkAcceptStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptStatusCode")
    public JAXBElement<String> createChkAcceptStatusCode(String value) {
        return new JAXBElement<String>(_ChkAcceptStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkAcceptStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptStatusRec")
    public JAXBElement<ChkAcceptStatusRecType> createChkAcceptStatusRec(ChkAcceptStatusRecType value) {
        return new JAXBElement<ChkAcceptStatusRecType>(_ChkAcceptStatusRec_QNAME, ChkAcceptStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkAcceptType")
    public JAXBElement<String> createChkAcceptType(String value) {
        return new JAXBElement<String>(_ChkAcceptType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkCourtesyAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkCourtesyAmt")
    public JAXBElement<ChkCourtesyAmtType> createChkCourtesyAmt(ChkCourtesyAmtType value) {
        return new JAXBElement<ChkCourtesyAmtType>(_ChkCourtesyAmt_QNAME, ChkCourtesyAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkBkStyleId")
    public JAXBElement<String> createChkBkStyleId(String value) {
        return new JAXBElement<String>(_ChkBkStyleId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkEnteredAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkEnteredAmt")
    public JAXBElement<ChkEnteredAmtType> createChkEnteredAmt(ChkEnteredAmtType value) {
        return new JAXBElement<ChkEnteredAmtType>(_ChkEnteredAmt_QNAME, ChkEnteredAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkImgBackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkImgBack")
    public JAXBElement<ChkImgBackType> createChkImgBack(ChkImgBackType value) {
        return new JAXBElement<ChkImgBackType>(_ChkImgBack_QNAME, ChkImgBackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkImgFrontType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkImgFront")
    public JAXBElement<ChkImgFrontType> createChkImgFront(ChkImgFrontType value) {
        return new JAXBElement<ChkImgFrontType>(_ChkImgFront_QNAME, ChkImgFrontType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueEnvr")
    public JAXBElement<ChkIssueEnvrType> createChkIssueEnvr(ChkIssueEnvrType value) {
        return new JAXBElement<ChkIssueEnvrType>(_ChkIssueEnvr_QNAME, ChkIssueEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueId")
    public JAXBElement<String> createChkIssueId(String value) {
        return new JAXBElement<String>(_ChkIssueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueKeys")
    public JAXBElement<ChkIssueKeysType> createChkIssueKeys(ChkIssueKeysType value) {
        return new JAXBElement<ChkIssueKeysType>(_ChkIssueKeys_QNAME, ChkIssueKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueRef")
    public JAXBElement<ChkIssueRefType> createChkIssueRef(ChkIssueRefType value) {
        return new JAXBElement<ChkIssueRefType>(_ChkIssueRef_QNAME, ChkIssueRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueSel")
    public JAXBElement<ChkIssueSelType> createChkIssueSel(ChkIssueSelType value) {
        return new JAXBElement<ChkIssueSelType>(_ChkIssueSel_QNAME, ChkIssueSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueStatus")
    public JAXBElement<ChkIssueStatusType> createChkIssueStatus(ChkIssueStatusType value) {
        return new JAXBElement<ChkIssueStatusType>(_ChkIssueStatus_QNAME, ChkIssueStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueStatusCode")
    public JAXBElement<String> createChkIssueStatusCode(String value) {
        return new JAXBElement<String>(_ChkIssueStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkIssueStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkIssueStatusRec")
    public JAXBElement<ChkIssueStatusRecType> createChkIssueStatusRec(ChkIssueStatusRecType value) {
        return new JAXBElement<ChkIssueStatusRecType>(_ChkIssueStatusRec_QNAME, ChkIssueStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNum")
    public JAXBElement<String> createChkNum(String value) {
        return new JAXBElement<String>(_ChkNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNumPrefix")
    public JAXBElement<String> createChkNumPrefix(String value) {
        return new JAXBElement<String>(_ChkNumPrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNumEnd")
    public JAXBElement<String> createChkNumEnd(String value) {
        return new JAXBElement<String>(_ChkNumEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkNumRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNumRange")
    public JAXBElement<ChkNumRangeType> createChkNumRange(ChkNumRangeType value) {
        return new JAXBElement<ChkNumRangeType>(_ChkNumRange_QNAME, ChkNumRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNumStart")
    public JAXBElement<String> createChkNumStart(String value) {
        return new JAXBElement<String>(_ChkNumStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkNumSuffix")
    public JAXBElement<String> createChkNumSuffix(String value) {
        return new JAXBElement<String>(_ChkNumSuffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdEnvr")
    public JAXBElement<ChkOrdEnvrType> createChkOrdEnvr(ChkOrdEnvrType value) {
        return new JAXBElement<ChkOrdEnvrType>(_ChkOrdEnvr_QNAME, ChkOrdEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdId")
    public JAXBElement<String> createChkOrdId(String value) {
        return new JAXBElement<String>(_ChkOrdId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdInfo")
    public JAXBElement<ChkOrdInfoType> createChkOrdInfo(ChkOrdInfoType value) {
        return new JAXBElement<ChkOrdInfoType>(_ChkOrdInfo_QNAME, ChkOrdInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdKeys")
    public JAXBElement<ChkOrdKeysType> createChkOrdKeys(ChkOrdKeysType value) {
        return new JAXBElement<ChkOrdKeysType>(_ChkOrdKeys_QNAME, ChkOrdKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdRec")
    public JAXBElement<ChkOrdRecType> createChkOrdRec(ChkOrdRecType value) {
        return new JAXBElement<ChkOrdRecType>(_ChkOrdRec_QNAME, ChkOrdRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdRef")
    public JAXBElement<ChkOrdRefType> createChkOrdRef(ChkOrdRefType value) {
        return new JAXBElement<ChkOrdRefType>(_ChkOrdRef_QNAME, ChkOrdRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdSel")
    public JAXBElement<ChkOrdSelType> createChkOrdSel(ChkOrdSelType value) {
        return new JAXBElement<ChkOrdSelType>(_ChkOrdSel_QNAME, ChkOrdSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdStatus")
    public JAXBElement<ChkOrdStatusType> createChkOrdStatus(ChkOrdStatusType value) {
        return new JAXBElement<ChkOrdStatusType>(_ChkOrdStatus_QNAME, ChkOrdStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdStatusCode")
    public JAXBElement<String> createChkOrdStatusCode(String value) {
        return new JAXBElement<String>(_ChkOrdStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkOrdStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkOrdStatusRec")
    public JAXBElement<ChkOrdStatusRecType> createChkOrdStatusRec(ChkOrdStatusRecType value) {
        return new JAXBElement<ChkOrdStatusRecType>(_ChkOrdStatusRec_QNAME, ChkOrdStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Chksum")
    public JAXBElement<ChksumType> createChksum(ChksumType value) {
        return new JAXBElement<ChksumType>(_Chksum_QNAME, ChksumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumEnvr")
    public JAXBElement<ChksumEnvrType> createChksumEnvr(ChksumEnvrType value) {
        return new JAXBElement<ChksumEnvrType>(_ChksumEnvr_QNAME, ChksumEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumId")
    public JAXBElement<String> createChksumId(String value) {
        return new JAXBElement<String>(_ChksumId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumInfo")
    public JAXBElement<ChksumInfoType> createChksumInfo(ChksumInfoType value) {
        return new JAXBElement<ChksumInfoType>(_ChksumInfo_QNAME, ChksumInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumKeys")
    public JAXBElement<ChksumKeysType> createChksumKeys(ChksumKeysType value) {
        return new JAXBElement<ChksumKeysType>(_ChksumKeys_QNAME, ChksumKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumRec")
    public JAXBElement<ChksumRecType> createChksumRec(ChksumRecType value) {
        return new JAXBElement<ChksumRecType>(_ChksumRec_QNAME, ChksumRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumRef")
    public JAXBElement<ChksumRefType> createChksumRef(ChksumRefType value) {
        return new JAXBElement<ChksumRefType>(_ChksumRef_QNAME, ChksumRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumSel")
    public JAXBElement<ChksumSelType> createChksumSel(ChksumSelType value) {
        return new JAXBElement<ChksumSelType>(_ChksumSel_QNAME, ChksumSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumStatus")
    public JAXBElement<ChksumStatusType> createChksumStatus(ChksumStatusType value) {
        return new JAXBElement<ChksumStatusType>(_ChksumStatus_QNAME, ChksumStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumStatusCode")
    public JAXBElement<String> createChksumStatusCode(String value) {
        return new JAXBElement<String>(_ChksumStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChksumStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumStatusRec")
    public JAXBElement<ChksumStatusRecType> createChksumStatusRec(ChksumStatusRecType value) {
        return new JAXBElement<ChksumStatusRecType>(_ChksumStatusRec_QNAME, ChksumStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumType")
    public JAXBElement<String> createChksumType(String value) {
        return new JAXBElement<String>(_ChksumType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChksumValue")
    public JAXBElement<BigDecimal> createChksumValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ChksumValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkPrintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkPrint")
    public JAXBElement<ChkPrintType> createChkPrint(ChkPrintType value) {
        return new JAXBElement<ChkPrintType>(_ChkPrint_QNAME, ChkPrintType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkText")
    public JAXBElement<String> createChkText(String value) {
        return new JAXBElement<String>(_ChkText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ChkURL")
    public JAXBElement<String> createChkURL(String value) {
        return new JAXBElement<String>(_ChkURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearingLangCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClearingLangCode")
    public JAXBElement<ClearingLangCodeType> createClearingLangCode(ClearingLangCodeType value) {
        return new JAXBElement<ClearingLangCodeType>(_ClearingLangCode_QNAME, ClearingLangCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientAppType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientApp")
    public JAXBElement<ClientAppType> createClientApp(ClientAppType value) {
        return new JAXBElement<ClientAppType>(_ClientApp_QNAME, ClientAppType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientBusinessDt")
    public JAXBElement<String> createClientBusinessDt(String value) {
        return new JAXBElement<String>(_ClientBusinessDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientChgCode")
    public JAXBElement<String> createClientChgCode(String value) {
        return new JAXBElement<String>(_ClientChgCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientCreateDt")
    public JAXBElement<String> createClientCreateDt(String value) {
        return new JAXBElement<String>(_ClientCreateDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientDt")
    public JAXBElement<String> createClientDt(String value) {
        return new JAXBElement<String>(_ClientDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClientTerminalSeqNum")
    public JAXBElement<String> createClientTerminalSeqNum(String value) {
        return new JAXBElement<String>(_ClientTerminalSeqNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CloseDt")
    public JAXBElement<XMLGregorianCalendar> createCloseDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CloseDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClosedDt")
    public JAXBElement<XMLGregorianCalendar> createClosedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClosedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ClubAcctIdent")
    public JAXBElement<String> createClubAcctIdent(String value) {
        return new JAXBElement<String>(_ClubAcctIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CollateralDesc")
    public JAXBElement<String> createCollateralDesc(String value) {
        return new JAXBElement<String>(_CollateralDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CollatingSequence")
    public JAXBElement<String> createCollatingSequence(String value) {
        return new JAXBElement<String>(_CollatingSequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtEnvr")
    public JAXBElement<CompRemitStmtEnvrType> createCompRemitStmtEnvr(CompRemitStmtEnvrType value) {
        return new JAXBElement<CompRemitStmtEnvrType>(_CompRemitStmtEnvr_QNAME, CompRemitStmtEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtId")
    public JAXBElement<String> createCompRemitStmtId(String value) {
        return new JAXBElement<String>(_CompRemitStmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtInfo")
    public JAXBElement<CompRemitStmtInfoType> createCompRemitStmtInfo(CompRemitStmtInfoType value) {
        return new JAXBElement<CompRemitStmtInfoType>(_CompRemitStmtInfo_QNAME, CompRemitStmtInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtKeys")
    public JAXBElement<CompRemitStmtKeysType> createCompRemitStmtKeys(CompRemitStmtKeysType value) {
        return new JAXBElement<CompRemitStmtKeysType>(_CompRemitStmtKeys_QNAME, CompRemitStmtKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtRec")
    public JAXBElement<CompRemitStmtRecType> createCompRemitStmtRec(CompRemitStmtRecType value) {
        return new JAXBElement<CompRemitStmtRecType>(_CompRemitStmtRec_QNAME, CompRemitStmtRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtRef")
    public JAXBElement<CompRemitStmtRefType> createCompRemitStmtRef(CompRemitStmtRefType value) {
        return new JAXBElement<CompRemitStmtRefType>(_CompRemitStmtRef_QNAME, CompRemitStmtRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtSel")
    public JAXBElement<CompRemitStmtSelType> createCompRemitStmtSel(CompRemitStmtSelType value) {
        return new JAXBElement<CompRemitStmtSelType>(_CompRemitStmtSel_QNAME, CompRemitStmtSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtStatus")
    public JAXBElement<CompRemitStmtStatusType> createCompRemitStmtStatus(CompRemitStmtStatusType value) {
        return new JAXBElement<CompRemitStmtStatusType>(_CompRemitStmtStatus_QNAME, CompRemitStmtStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtStatusCode")
    public JAXBElement<CompRemitStmtStatusCodeType> createCompRemitStmtStatusCode(CompRemitStmtStatusCodeType value) {
        return new JAXBElement<CompRemitStmtStatusCodeType>(_CompRemitStmtStatusCode_QNAME, CompRemitStmtStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompRemitStmtStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompRemitStmtStatusRec")
    public JAXBElement<CompRemitStmtStatusRecType> createCompRemitStmtStatusRec(CompRemitStmtStatusRecType value) {
        return new JAXBElement<CompRemitStmtStatusRecType>(_CompRemitStmtStatusRec_QNAME, CompRemitStmtStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompositeCurAmt")
    public JAXBElement<CompositeCurAmtType> createCompositeCurAmt(CompositeCurAmtType value) {
        return new JAXBElement<CompositeCurAmtType>(_CompositeCurAmt_QNAME, CompositeCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompositeCurAmtIdent")
    public JAXBElement<String> createCompositeCurAmtIdent(String value) {
        return new JAXBElement<String>(_CompositeCurAmtIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CompositeCurAmtType")
    public JAXBElement<String> createCompositeCurAmtType(String value) {
        return new JAXBElement<String>(_CompositeCurAmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContactName")
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(_ContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContactType")
    public JAXBElement<String> createContactType(String value) {
        return new JAXBElement<String>(_ContactType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContentType")
    public JAXBElement<String> createContentType(String value) {
        return new JAXBElement<String>(_ContentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContraCurAmt")
    public JAXBElement<BigDecimal> createContraCurAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContraCurAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContraCurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ContraCurCode")
    public JAXBElement<ContraCurCodeType> createContraCurCode(ContraCurCodeType value) {
        return new JAXBElement<ContraCurCodeType>(_ContraCurCode_QNAME, ContraCurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrectActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CorrectAction")
    public JAXBElement<CorrectActionType> createCorrectAction(CorrectActionType value) {
        return new JAXBElement<CorrectActionType>(_CorrectAction_QNAME, CorrectActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CorrespondenceIdent")
    public JAXBElement<String> createCorrespondenceIdent(String value) {
        return new JAXBElement<String>(_CorrespondenceIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Count")
    public JAXBElement<Long> createCount(Long value) {
        return new JAXBElement<Long>(_Count_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterpartyDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CounterpartyData")
    public JAXBElement<CounterpartyDataType> createCounterpartyData(CounterpartyDataType value) {
        return new JAXBElement<CounterpartyDataType>(_CounterpartyData_QNAME, CounterpartyDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CountryCode")
    public JAXBElement<CountryCodeType> createCountryCode(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_CountryCode_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CountryCodeSource")
    public JAXBElement<String> createCountryCodeSource(String value) {
        return new JAXBElement<String>(_CountryCodeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CountryCodeValue")
    public JAXBElement<String> createCountryCodeValue(String value) {
        return new JAXBElement<String>(_CountryCodeValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CountyDistrict")
    public JAXBElement<String> createCountyDistrict(String value) {
        return new JAXBElement<String>(_CountyDistrict_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CoverMngrm")
    public JAXBElement<String> createCoverMngrm(String value) {
        return new JAXBElement<String>(_CoverMngrm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CoverStyleIdent")
    public JAXBElement<String> createCoverStyleIdent(String value) {
        return new JAXBElement<String>(_CoverStyleIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreateRefIdent")
    public JAXBElement<String> createCreateRefIdent(String value) {
        return new JAXBElement<String>(_CreateRefIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreatedDt")
    public JAXBElement<String> createCreatedDt(String value) {
        return new JAXBElement<String>(_CreatedDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthEnvr")
    public JAXBElement<CreditAthEnvrType> createCreditAthEnvr(CreditAthEnvrType value) {
        return new JAXBElement<CreditAthEnvrType>(_CreditAthEnvr_QNAME, CreditAthEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthId")
    public JAXBElement<String> createCreditAthId(String value) {
        return new JAXBElement<String>(_CreditAthId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthInfo")
    public JAXBElement<CreditAthInfoType> createCreditAthInfo(CreditAthInfoType value) {
        return new JAXBElement<CreditAthInfoType>(_CreditAthInfo_QNAME, CreditAthInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthKeys")
    public JAXBElement<CreditAthKeysType> createCreditAthKeys(CreditAthKeysType value) {
        return new JAXBElement<CreditAthKeysType>(_CreditAthKeys_QNAME, CreditAthKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthRec")
    public JAXBElement<CreditAthRecType> createCreditAthRec(CreditAthRecType value) {
        return new JAXBElement<CreditAthRecType>(_CreditAthRec_QNAME, CreditAthRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthRef")
    public JAXBElement<CreditAthRefType> createCreditAthRef(CreditAthRefType value) {
        return new JAXBElement<CreditAthRefType>(_CreditAthRef_QNAME, CreditAthRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthSel")
    public JAXBElement<CreditAthSelType> createCreditAthSel(CreditAthSelType value) {
        return new JAXBElement<CreditAthSelType>(_CreditAthSel_QNAME, CreditAthSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthStatus")
    public JAXBElement<CreditAthStatusType> createCreditAthStatus(CreditAthStatusType value) {
        return new JAXBElement<CreditAthStatusType>(_CreditAthStatus_QNAME, CreditAthStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAthStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthStatusRec")
    public JAXBElement<CreditAthStatusRecType> createCreditAthStatusRec(CreditAthStatusRecType value) {
        return new JAXBElement<CreditAthStatusRecType>(_CreditAthStatusRec_QNAME, CreditAthStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAthType")
    public JAXBElement<String> createCreditAthType(String value) {
        return new JAXBElement<String>(_CreditAthType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditAuth")
    public JAXBElement<CreditAuthType> createCreditAuth(CreditAuthType value) {
        return new JAXBElement<CreditAuthType>(_CreditAuth_QNAME, CreditAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditEnvr")
    public JAXBElement<CreditEnvrType> createCreditEnvr(CreditEnvrType value) {
        return new JAXBElement<CreditEnvrType>(_CreditEnvr_QNAME, CreditEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditHeldAmtExpDt")
    public JAXBElement<String> createCreditHeldAmtExpDt(String value) {
        return new JAXBElement<String>(_CreditHeldAmtExpDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditId")
    public JAXBElement<String> createCreditId(String value) {
        return new JAXBElement<String>(_CreditId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditKeys")
    public JAXBElement<CreditKeysType> createCreditKeys(CreditKeysType value) {
        return new JAXBElement<CreditKeysType>(_CreditKeys_QNAME, CreditKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditMediaCashDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditMediaCashData")
    public JAXBElement<CreditMediaCashDataType> createCreditMediaCashData(CreditMediaCashDataType value) {
        return new JAXBElement<CreditMediaCashDataType>(_CreditMediaCashData_QNAME, CreditMediaCashDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditMediaItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditMediaItem")
    public JAXBElement<CreditMediaItemType> createCreditMediaItem(CreditMediaItemType value) {
        return new JAXBElement<CreditMediaItemType>(_CreditMediaItem_QNAME, CreditMediaItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditMediaItemIdent")
    public JAXBElement<String> createCreditMediaItemIdent(String value) {
        return new JAXBElement<String>(_CreditMediaItemIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditRec")
    public JAXBElement<CreditRecType> createCreditRec(CreditRecType value) {
        return new JAXBElement<CreditRecType>(_CreditRec_QNAME, CreditRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditRef")
    public JAXBElement<CreditRefType> createCreditRef(CreditRefType value) {
        return new JAXBElement<CreditRefType>(_CreditRef_QNAME, CreditRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditSel")
    public JAXBElement<CreditSelType> createCreditSel(CreditSelType value) {
        return new JAXBElement<CreditSelType>(_CreditSel_QNAME, CreditSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditStatus")
    public JAXBElement<CreditStatusType> createCreditStatus(CreditStatusType value) {
        return new JAXBElement<CreditStatusType>(_CreditStatus_QNAME, CreditStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditStatusCode")
    public JAXBElement<String> createCreditStatusCode(String value) {
        return new JAXBElement<String>(_CreditStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditStatusRec")
    public JAXBElement<CreditStatusRecType> createCreditStatusRec(CreditStatusRecType value) {
        return new JAXBElement<CreditStatusRecType>(_CreditStatusRec_QNAME, CreditStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditStmtDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditStmtData")
    public JAXBElement<CreditStmtDataType> createCreditStmtData(CreditStmtDataType value) {
        return new JAXBElement<CreditStmtDataType>(_CreditStmtData_QNAME, CreditStmtDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CreditType")
    public JAXBElement<String> createCreditType(String value) {
        return new JAXBElement<String>(_CreditType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptPswdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CryptPswd")
    public JAXBElement<CryptPswdType> createCryptPswd(CryptPswdType value) {
        return new JAXBElement<CryptPswdType>(_CryptPswd_QNAME, CryptPswdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptSecretType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CryptSecret")
    public JAXBElement<CryptSecretType> createCryptSecret(CryptSecretType value) {
        return new JAXBElement<CryptSecretType>(_CryptSecret_QNAME, CryptSecretType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CryptType")
    public JAXBElement<String> createCryptType(String value) {
        return new JAXBElement<String>(_CryptType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurAmt")
    public JAXBElement<CurAmtType> createCurAmt(CurAmtType value) {
        return new JAXBElement<CurAmtType>(_CurAmt_QNAME, CurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurCode")
    public JAXBElement<CurCodeType> createCurCode(CurCodeType value) {
        return new JAXBElement<CurCodeType>(_CurCode_QNAME, CurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurRecLimit")
    public JAXBElement<Long> createCurRecLimit(Long value) {
        return new JAXBElement<Long>(_CurRecLimit_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurrencyAmount")
    public JAXBElement<CurrencyAmountType> createCurrencyAmount(CurrencyAmountType value) {
        return new JAXBElement<CurrencyAmountType>(_CurrencyAmount_QNAME, CurrencyAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeType> createCurrencyCode(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_CurrencyCode_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurrencyCodeType")
    public JAXBElement<String> createCurrencyCodeType(String value) {
        return new JAXBElement<String>(_CurrencyCodeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurrencyCodeValue")
    public JAXBElement<String> createCurrencyCodeValue(String value) {
        return new JAXBElement<String>(_CurrencyCodeValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CurCodeValue")
    public JAXBElement<String> createCurCodeValue(String value) {
        return new JAXBElement<String>(_CurCodeValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Cursor")
    public JAXBElement<CursorType> createCursor(CursorType value) {
        return new JAXBElement<CursorType>(_Cursor_QNAME, CursorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscEnvr")
    public JAXBElement<CustDiscEnvrType> createCustDiscEnvr(CustDiscEnvrType value) {
        return new JAXBElement<CustDiscEnvrType>(_CustDiscEnvr_QNAME, CustDiscEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscId")
    public JAXBElement<String> createCustDiscId(String value) {
        return new JAXBElement<String>(_CustDiscId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscInfo")
    public JAXBElement<CustDiscInfoType> createCustDiscInfo(CustDiscInfoType value) {
        return new JAXBElement<CustDiscInfoType>(_CustDiscInfo_QNAME, CustDiscInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscKeys")
    public JAXBElement<CustDiscKeysType> createCustDiscKeys(CustDiscKeysType value) {
        return new JAXBElement<CustDiscKeysType>(_CustDiscKeys_QNAME, CustDiscKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscRec")
    public JAXBElement<CustDiscRecType> createCustDiscRec(CustDiscRecType value) {
        return new JAXBElement<CustDiscRecType>(_CustDiscRec_QNAME, CustDiscRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscRef")
    public JAXBElement<CustDiscRefType> createCustDiscRef(CustDiscRefType value) {
        return new JAXBElement<CustDiscRefType>(_CustDiscRef_QNAME, CustDiscRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscSel")
    public JAXBElement<CustDiscSelType> createCustDiscSel(CustDiscSelType value) {
        return new JAXBElement<CustDiscSelType>(_CustDiscSel_QNAME, CustDiscSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscStatus")
    public JAXBElement<CustDiscStatusType> createCustDiscStatus(CustDiscStatusType value) {
        return new JAXBElement<CustDiscStatusType>(_CustDiscStatus_QNAME, CustDiscStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscStatusCode")
    public JAXBElement<CustDiscStatusCodeType> createCustDiscStatusCode(CustDiscStatusCodeType value) {
        return new JAXBElement<CustDiscStatusCodeType>(_CustDiscStatusCode_QNAME, CustDiscStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustDiscStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustDiscStatusRec")
    public JAXBElement<CustDiscStatusRecType> createCustDiscStatusRec(CustDiscStatusRecType value) {
        return new JAXBElement<CustDiscStatusRecType>(_CustDiscStatusRec_QNAME, CustDiscStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustLangPref")
    public JAXBElement<String> createCustLangPref(String value) {
        return new JAXBElement<String>(_CustLangPref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeEnvr")
    public JAXBElement<CustPayeeEnvrType> createCustPayeeEnvr(CustPayeeEnvrType value) {
        return new JAXBElement<CustPayeeEnvrType>(_CustPayeeEnvr_QNAME, CustPayeeEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeId")
    public JAXBElement<String> createCustPayeeId(String value) {
        return new JAXBElement<String>(_CustPayeeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeInfo")
    public JAXBElement<CustPayeeInfoType> createCustPayeeInfo(CustPayeeInfoType value) {
        return new JAXBElement<CustPayeeInfoType>(_CustPayeeInfo_QNAME, CustPayeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeKeys")
    public JAXBElement<CustPayeeKeysType> createCustPayeeKeys(CustPayeeKeysType value) {
        return new JAXBElement<CustPayeeKeysType>(_CustPayeeKeys_QNAME, CustPayeeKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeRec")
    public JAXBElement<CustPayeeRecType> createCustPayeeRec(CustPayeeRecType value) {
        return new JAXBElement<CustPayeeRecType>(_CustPayeeRec_QNAME, CustPayeeRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeRef")
    public JAXBElement<CustPayeeRefType> createCustPayeeRef(CustPayeeRefType value) {
        return new JAXBElement<CustPayeeRefType>(_CustPayeeRef_QNAME, CustPayeeRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeSel")
    public JAXBElement<CustPayeeSelType> createCustPayeeSel(CustPayeeSelType value) {
        return new JAXBElement<CustPayeeSelType>(_CustPayeeSel_QNAME, CustPayeeSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeStatus")
    public JAXBElement<CustPayeeStatusType> createCustPayeeStatus(CustPayeeStatusType value) {
        return new JAXBElement<CustPayeeStatusType>(_CustPayeeStatus_QNAME, CustPayeeStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeStatusCode")
    public JAXBElement<CustPayeeStatusCodeType> createCustPayeeStatusCode(CustPayeeStatusCodeType value) {
        return new JAXBElement<CustPayeeStatusCodeType>(_CustPayeeStatusCode_QNAME, CustPayeeStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustPayeeStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustPayeeStatusRec")
    public JAXBElement<CustPayeeStatusRecType> createCustPayeeStatusRec(CustPayeeStatusRecType value) {
        return new JAXBElement<CustPayeeStatusRecType>(_CustPayeeStatusRec_QNAME, CustPayeeStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcEnvr")
    public JAXBElement<CustSvcEnvrType> createCustSvcEnvr(CustSvcEnvrType value) {
        return new JAXBElement<CustSvcEnvrType>(_CustSvcEnvr_QNAME, CustSvcEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcId")
    public JAXBElement<CustSvcIdType> createCustSvcId(CustSvcIdType value) {
        return new JAXBElement<CustSvcIdType>(_CustSvcId_QNAME, CustSvcIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcInfo")
    public JAXBElement<CustSvcInfoType> createCustSvcInfo(CustSvcInfoType value) {
        return new JAXBElement<CustSvcInfoType>(_CustSvcInfo_QNAME, CustSvcInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcKeys")
    public JAXBElement<CustSvcKeysType> createCustSvcKeys(CustSvcKeysType value) {
        return new JAXBElement<CustSvcKeysType>(_CustSvcKeys_QNAME, CustSvcKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcRec")
    public JAXBElement<CustSvcRecType> createCustSvcRec(CustSvcRecType value) {
        return new JAXBElement<CustSvcRecType>(_CustSvcRec_QNAME, CustSvcRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcRef")
    public JAXBElement<CustSvcRefType> createCustSvcRef(CustSvcRefType value) {
        return new JAXBElement<CustSvcRefType>(_CustSvcRef_QNAME, CustSvcRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcSel")
    public JAXBElement<CustSvcSelType> createCustSvcSel(CustSvcSelType value) {
        return new JAXBElement<CustSvcSelType>(_CustSvcSel_QNAME, CustSvcSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcStatus")
    public JAXBElement<CustSvcStatusType> createCustSvcStatus(CustSvcStatusType value) {
        return new JAXBElement<CustSvcStatusType>(_CustSvcStatus_QNAME, CustSvcStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcStatusCode")
    public JAXBElement<CustSvcStatusCodeType> createCustSvcStatusCode(CustSvcStatusCodeType value) {
        return new JAXBElement<CustSvcStatusCodeType>(_CustSvcStatusCode_QNAME, CustSvcStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustSvcStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CustSvcStatusRec")
    public JAXBElement<CustSvcStatusRecType> createCustSvcStatusRec(CustSvcStatusRecType value) {
        return new JAXBElement<CustSvcStatusRecType>(_CustSvcStatusRec_QNAME, CustSvcStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DayOfMonth")
    public JAXBElement<String> createDayOfMonth(String value) {
        return new JAXBElement<String>(_DayOfMonth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayOfWeekType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DayOfWeek")
    public JAXBElement<DayOfWeekType> createDayOfWeek(DayOfWeekType value) {
        return new JAXBElement<DayOfWeekType>(_DayOfWeek_QNAME, DayOfWeekType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DaysCall")
    public JAXBElement<Long> createDaysCall(Long value) {
        return new JAXBElement<Long>(_DaysCall_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DaysToEPost")
    public JAXBElement<Long> createDaysToEPost(Long value) {
        return new JAXBElement<Long>(_DaysToEPost_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DaysToPay")
    public JAXBElement<Long> createDaysToPay(Long value) {
        return new JAXBElement<Long>(_DaysToPay_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthEnvr")
    public JAXBElement<DebitAthEnvrType> createDebitAthEnvr(DebitAthEnvrType value) {
        return new JAXBElement<DebitAthEnvrType>(_DebitAthEnvr_QNAME, DebitAthEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthId")
    public JAXBElement<String> createDebitAthId(String value) {
        return new JAXBElement<String>(_DebitAthId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthInfo")
    public JAXBElement<DebitAthInfoType> createDebitAthInfo(DebitAthInfoType value) {
        return new JAXBElement<DebitAthInfoType>(_DebitAthInfo_QNAME, DebitAthInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthKeys")
    public JAXBElement<DebitAthKeysType> createDebitAthKeys(DebitAthKeysType value) {
        return new JAXBElement<DebitAthKeysType>(_DebitAthKeys_QNAME, DebitAthKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthSel")
    public JAXBElement<DebitAthSelType> createDebitAthSel(DebitAthSelType value) {
        return new JAXBElement<DebitAthSelType>(_DebitAthSel_QNAME, DebitAthSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthStatus")
    public JAXBElement<DebitAthStatusType> createDebitAthStatus(DebitAthStatusType value) {
        return new JAXBElement<DebitAthStatusType>(_DebitAthStatus_QNAME, DebitAthStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAthStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthStatusRec")
    public JAXBElement<DebitAthStatusRecType> createDebitAthStatusRec(DebitAthStatusRecType value) {
        return new JAXBElement<DebitAthStatusRecType>(_DebitAthStatusRec_QNAME, DebitAthStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitAthType")
    public JAXBElement<String> createDebitAthType(String value) {
        return new JAXBElement<String>(_DebitAthType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitEnvr")
    public JAXBElement<DebitEnvrType> createDebitEnvr(DebitEnvrType value) {
        return new JAXBElement<DebitEnvrType>(_DebitEnvr_QNAME, DebitEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitId")
    public JAXBElement<String> createDebitId(String value) {
        return new JAXBElement<String>(_DebitId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitInfo")
    public JAXBElement<DebitInfoType> createDebitInfo(DebitInfoType value) {
        return new JAXBElement<DebitInfoType>(_DebitInfo_QNAME, DebitInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitKeys")
    public JAXBElement<DebitKeysType> createDebitKeys(DebitKeysType value) {
        return new JAXBElement<DebitKeysType>(_DebitKeys_QNAME, DebitKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitRec")
    public JAXBElement<DebitRecType> createDebitRec(DebitRecType value) {
        return new JAXBElement<DebitRecType>(_DebitRec_QNAME, DebitRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitRef")
    public JAXBElement<DebitRefType> createDebitRef(DebitRefType value) {
        return new JAXBElement<DebitRefType>(_DebitRef_QNAME, DebitRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitSel")
    public JAXBElement<DebitSelType> createDebitSel(DebitSelType value) {
        return new JAXBElement<DebitSelType>(_DebitSel_QNAME, DebitSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitStatus")
    public JAXBElement<DebitStatusType> createDebitStatus(DebitStatusType value) {
        return new JAXBElement<DebitStatusType>(_DebitStatus_QNAME, DebitStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitStatusCode")
    public JAXBElement<String> createDebitStatusCode(String value) {
        return new JAXBElement<String>(_DebitStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitStatusRec")
    public JAXBElement<DebitStatusRecType> createDebitStatusRec(DebitStatusRecType value) {
        return new JAXBElement<DebitStatusRecType>(_DebitStatusRec_QNAME, DebitStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DebitType")
    public JAXBElement<String> createDebitType(String value) {
        return new JAXBElement<String>(_DebitType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebtorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Debtor")
    public JAXBElement<DebtorType> createDebtor(DebtorType value) {
        return new JAXBElement<DebtorType>(_Debtor_QNAME, DebtorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeceasedDt")
    public JAXBElement<XMLGregorianCalendar> createDeceasedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeceasedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeliveryDestination")
    public JAXBElement<String> createDeliveryDestination(String value) {
        return new JAXBElement<String>(_DeliveryDestination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSvcAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "delete.SvcAcctId")
    public JAXBElement<DeleteSvcAcctIdType> createDeleteSvcAcctId(DeleteSvcAcctIdType value) {
        return new JAXBElement<DeleteSvcAcctIdType>(_DeleteSvcAcctId_QNAME, DeleteSvcAcctIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DelElements")
    public JAXBElement<String> createDelElements(String value) {
        return new JAXBElement<String>(_DelElements_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeliveryInstruction")
    public JAXBElement<String> createDeliveryInstruction(String value) {
        return new JAXBElement<String>(_DeliveryInstruction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelinqAgingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DelinqAging")
    public JAXBElement<DelinqAgingType> createDelinqAging(DelinqAgingType value) {
        return new JAXBElement<DelinqAgingType>(_DelinqAging_QNAME, DelinqAgingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeliveryMedia")
    public JAXBElement<String> createDeliveryMedia(String value) {
        return new JAXBElement<String>(_DeliveryMedia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeliveryMethod")
    public JAXBElement<String> createDeliveryMethod(String value) {
        return new JAXBElement<String>(_DeliveryMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DeliveryDt")
    public JAXBElement<XMLGregorianCalendar> createDeliveryDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeliveryDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppEnvr")
    public JAXBElement<DepAppEnvrType> createDepAppEnvr(DepAppEnvrType value) {
        return new JAXBElement<DepAppEnvrType>(_DepAppEnvr_QNAME, DepAppEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppId")
    public JAXBElement<String> createDepAppId(String value) {
        return new JAXBElement<String>(_DepAppId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppInfo")
    public JAXBElement<DepAppInfoType> createDepAppInfo(DepAppInfoType value) {
        return new JAXBElement<DepAppInfoType>(_DepAppInfo_QNAME, DepAppInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppKeys")
    public JAXBElement<DepAppKeysType> createDepAppKeys(DepAppKeysType value) {
        return new JAXBElement<DepAppKeysType>(_DepAppKeys_QNAME, DepAppKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppRec")
    public JAXBElement<DepAppRecType> createDepAppRec(DepAppRecType value) {
        return new JAXBElement<DepAppRecType>(_DepAppRec_QNAME, DepAppRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppRef")
    public JAXBElement<DepAppRefType> createDepAppRef(DepAppRefType value) {
        return new JAXBElement<DepAppRefType>(_DepAppRef_QNAME, DepAppRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppSel")
    public JAXBElement<DepAppSelType> createDepAppSel(DepAppSelType value) {
        return new JAXBElement<DepAppSelType>(_DepAppSel_QNAME, DepAppSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppStatus")
    public JAXBElement<DepAppStatusType> createDepAppStatus(DepAppStatusType value) {
        return new JAXBElement<DepAppStatusType>(_DepAppStatus_QNAME, DepAppStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppStatusCode")
    public JAXBElement<DepAppStatusCodeType> createDepAppStatusCode(DepAppStatusCodeType value) {
        return new JAXBElement<DepAppStatusCodeType>(_DepAppStatusCode_QNAME, DepAppStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppStatusRec")
    public JAXBElement<DepAppStatusRecType> createDepAppStatusRec(DepAppStatusRecType value) {
        return new JAXBElement<DepAppStatusRecType>(_DepAppStatusRec_QNAME, DepAppStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepApplicantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepApplicant")
    public JAXBElement<DepApplicantType> createDepApplicant(DepApplicantType value) {
        return new JAXBElement<DepApplicantType>(_DepApplicant_QNAME, DepApplicantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepApplicantAcctRel")
    public JAXBElement<String> createDepApplicantAcctRel(String value) {
        return new JAXBElement<String>(_DepApplicantAcctRel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppAcctIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepAppAcctIdent")
    public JAXBElement<DepAppAcctIdentType> createDepAppAcctIdent(DepAppAcctIdentType value) {
        return new JAXBElement<DepAppAcctIdentType>(_DepAppAcctIdent_QNAME, DepAppAcctIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdEnvr")
    public JAXBElement<DepBkOrdEnvrType> createDepBkOrdEnvr(DepBkOrdEnvrType value) {
        return new JAXBElement<DepBkOrdEnvrType>(_DepBkOrdEnvr_QNAME, DepBkOrdEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdId")
    public JAXBElement<String> createDepBkOrdId(String value) {
        return new JAXBElement<String>(_DepBkOrdId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdInfo")
    public JAXBElement<DepBkOrdInfoType> createDepBkOrdInfo(DepBkOrdInfoType value) {
        return new JAXBElement<DepBkOrdInfoType>(_DepBkOrdInfo_QNAME, DepBkOrdInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdKeys")
    public JAXBElement<DepBkOrdKeysType> createDepBkOrdKeys(DepBkOrdKeysType value) {
        return new JAXBElement<DepBkOrdKeysType>(_DepBkOrdKeys_QNAME, DepBkOrdKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdRec")
    public JAXBElement<DepBkOrdRecType> createDepBkOrdRec(DepBkOrdRecType value) {
        return new JAXBElement<DepBkOrdRecType>(_DepBkOrdRec_QNAME, DepBkOrdRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdRef")
    public JAXBElement<DepBkOrdRefType> createDepBkOrdRef(DepBkOrdRefType value) {
        return new JAXBElement<DepBkOrdRefType>(_DepBkOrdRef_QNAME, DepBkOrdRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdSel")
    public JAXBElement<DepBkOrdSelType> createDepBkOrdSel(DepBkOrdSelType value) {
        return new JAXBElement<DepBkOrdSelType>(_DepBkOrdSel_QNAME, DepBkOrdSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdStatus")
    public JAXBElement<DepBkOrdStatusType> createDepBkOrdStatus(DepBkOrdStatusType value) {
        return new JAXBElement<DepBkOrdStatusType>(_DepBkOrdStatus_QNAME, DepBkOrdStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdStatusCode")
    public JAXBElement<String> createDepBkOrdStatusCode(String value) {
        return new JAXBElement<String>(_DepBkOrdStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBkOrdStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkOrdStatusRec")
    public JAXBElement<DepBkOrdStatusRecType> createDepBkOrdStatusRec(DepBkOrdStatusRecType value) {
        return new JAXBElement<DepBkOrdStatusRecType>(_DepBkOrdStatusRec_QNAME, DepBkOrdStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DepBkStyleIdent")
    public JAXBElement<String> createDepBkStyleIdent(String value) {
        return new JAXBElement<String>(_DepBkStyleIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Dependents")
    public JAXBElement<Long> createDependents(Long value) {
        return new JAXBElement<Long>(_Dependents_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Design")
    public JAXBElement<String> createDesign(String value) {
        return new JAXBElement<String>(_Design_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DfltPmtDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DfltPmtData")
    public JAXBElement<DfltPmtDataType> createDfltPmtData(DfltPmtDataType value) {
        return new JAXBElement<DfltPmtDataType>(_DfltPmtData_QNAME, DfltPmtDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Discount")
    public JAXBElement<DiscountType> createDiscount(DiscountType value) {
        return new JAXBElement<DiscountType>(_Discount_QNAME, DiscountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocCtrlInType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DocCtrlIn")
    public JAXBElement<DocCtrlInType> createDocCtrlIn(DocCtrlInType value) {
        return new JAXBElement<DocCtrlInType>(_DocCtrlIn_QNAME, DocCtrlInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocCtrlOutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DocCtrlOut")
    public JAXBElement<DocCtrlOutType> createDocCtrlOut(DocCtrlOutType value) {
        return new JAXBElement<DocCtrlOutType>(_DocCtrlOut_QNAME, DocCtrlOutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DocumentVerifyType")
    public JAXBElement<String> createDocumentVerifyType(String value) {
        return new JAXBElement<String>(_DocumentVerifyType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DueDt")
    public JAXBElement<XMLGregorianCalendar> createDueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Duration")
    public JAXBElement<DurationType> createDuration(DurationType value) {
        return new JAXBElement<DurationType>(_Duration_QNAME, DurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Unit")
    public JAXBElement<String> createUnit(String value) {
        return new JAXBElement<String>(_Unit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevAlmAlarmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAlmAlarm")
    public JAXBElement<DevAlmAlarmType> createDevAlmAlarm(DevAlmAlarmType value) {
        return new JAXBElement<DevAlmAlarmType>(_DevAlmAlarm_QNAME, DevAlmAlarmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAlmOperation")
    public JAXBElement<String> createDevAlmOperation(String value) {
        return new JAXBElement<String>(_DevAlmOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAlmType")
    public JAXBElement<String> createDevAlmType(String value) {
        return new JAXBElement<String>(_DevAlmType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevAppComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAppComponent")
    public JAXBElement<DevAppComponentType> createDevAppComponent(DevAppComponentType value) {
        return new JAXBElement<DevAppComponentType>(_DevAppComponent_QNAME, DevAppComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAppNormalOperation")
    public JAXBElement<Boolean> createDevAppNormalOperation(Boolean value) {
        return new JAXBElement<Boolean>(_DevAppNormalOperation_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevAppOperation")
    public JAXBElement<String> createDevAppOperation(String value) {
        return new JAXBElement<String>(_DevAppOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamOperation")
    public JAXBElement<String> createDevCamOperation(String value) {
        return new JAXBElement<String>(_DevCamOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamStatusArea")
    public JAXBElement<String> createDevCamStatusArea(String value) {
        return new JAXBElement<String>(_DevCamStatusArea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCamStatusMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamStatusMedia")
    public JAXBElement<DevCamStatusMediaType> createDevCamStatusMedia(DevCamStatusMediaType value) {
        return new JAXBElement<DevCamStatusMediaType>(_DevCamStatusMedia_QNAME, DevCamStatusMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamStatusPictures")
    public JAXBElement<Long> createDevCamStatusPictures(Long value) {
        return new JAXBElement<Long>(_DevCamStatusPictures_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCamStatusStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamStatusState")
    public JAXBElement<DevCamStatusStateType> createDevCamStatusState(DevCamStatusStateType value) {
        return new JAXBElement<DevCamStatusStateType>(_DevCamStatusState_QNAME, DevCamStatusStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCamType")
    public JAXBElement<String> createDevCamType(String value) {
        return new JAXBElement<String>(_DevCamType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmBinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBin")
    public JAXBElement<DevCdmBinType> createDevCdmBin(DevCdmBinType value) {
        return new JAXBElement<DevCdmBinType>(_DevCdmBin_QNAME, DevCdmBinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinCount")
    public JAXBElement<Long> createDevCdmBinCount(Long value) {
        return new JAXBElement<Long>(_DevCdmBinCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmBinCurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinCurCode")
    public JAXBElement<DevCdmBinCurCodeType> createDevCdmBinCurCode(DevCdmBinCurCodeType value) {
        return new JAXBElement<DevCdmBinCurCodeType>(_DevCdmBinCurCode_QNAME, DevCdmBinCurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinDenomination")
    public JAXBElement<BigDecimal> createDevCdmBinDenomination(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DevCdmBinDenomination_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinMaxCount")
    public JAXBElement<Long> createDevCdmBinMaxCount(Long value) {
        return new JAXBElement<Long>(_DevCdmBinMaxCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmBinMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinMedia")
    public JAXBElement<DevCdmBinMediaType> createDevCdmBinMedia(DevCdmBinMediaType value) {
        return new JAXBElement<DevCdmBinMediaType>(_DevCdmBinMedia_QNAME, DevCdmBinMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinNum")
    public JAXBElement<Long> createDevCdmBinNum(Long value) {
        return new JAXBElement<Long>(_DevCdmBinNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmBinStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinStatus")
    public JAXBElement<DevCdmBinStatusType> createDevCdmBinStatus(DevCdmBinStatusType value) {
        return new JAXBElement<DevCdmBinStatusType>(_DevCdmBinStatus_QNAME, DevCdmBinStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmBinType")
    public JAXBElement<String> createDevCdmBinType(String value) {
        return new JAXBElement<String>(_DevCdmBinType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmCashUnits")
    public JAXBElement<String> createDevCdmCashUnits(String value) {
        return new JAXBElement<String>(_DevCdmCashUnits_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmIntermediateStacker")
    public JAXBElement<String> createDevCdmIntermediateStacker(String value) {
        return new JAXBElement<String>(_DevCdmIntermediateStacker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmOperation")
    public JAXBElement<String> createDevCdmOperation(String value) {
        return new JAXBElement<String>(_DevCdmOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmPosition")
    public JAXBElement<DevCdmPositionType> createDevCdmPosition(DevCdmPositionType value) {
        return new JAXBElement<DevCdmPositionType>(_DevCdmPosition_QNAME, DevCdmPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmPositionLocation")
    public JAXBElement<String> createDevCdmPositionLocation(String value) {
        return new JAXBElement<String>(_DevCdmPositionLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmPositionStatus")
    public JAXBElement<String> createDevCdmPositionStatus(String value) {
        return new JAXBElement<String>(_DevCdmPositionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCdmSafeDoorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmSafeDoor")
    public JAXBElement<DevCdmSafeDoorType> createDevCdmSafeDoor(DevCdmSafeDoorType value) {
        return new JAXBElement<DevCdmSafeDoorType>(_DevCdmSafeDoor_QNAME, DevCdmSafeDoorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmShutter")
    public JAXBElement<String> createDevCdmShutter(String value) {
        return new JAXBElement<String>(_DevCdmShutter_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmTransport")
    public JAXBElement<String> createDevCdmTransport(String value) {
        return new JAXBElement<String>(_DevCdmTransport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmTransportItems")
    public JAXBElement<String> createDevCdmTransportItems(String value) {
        return new JAXBElement<String>(_DevCdmTransportItems_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCdmType")
    public JAXBElement<String> createDevCdmType(String value) {
        return new JAXBElement<String>(_DevCdmType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevChkImageEnabled")
    public JAXBElement<Boolean> createDevChkImageEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_DevChkImageEnabled_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevChkInkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevChkInk")
    public JAXBElement<DevChkInkType> createDevChkInk(DevChkInkType value) {
        return new JAXBElement<DevChkInkType>(_DevChkInk_QNAME, DevChkInkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevChkMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevChkMedia")
    public JAXBElement<DevChkMediaType> createDevChkMedia(DevChkMediaType value) {
        return new JAXBElement<DevChkMediaType>(_DevChkMedia_QNAME, DevChkMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevChkOperation")
    public JAXBElement<String> createDevChkOperation(String value) {
        return new JAXBElement<String>(_DevChkOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevChkType")
    public JAXBElement<String> createDevChkType(String value) {
        return new JAXBElement<String>(_DevChkType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCimBinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBin")
    public JAXBElement<DevCimBinType> createDevCimBin(DevCimBinType value) {
        return new JAXBElement<DevCimBinType>(_DevCimBin_QNAME, DevCimBinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinCount")
    public JAXBElement<Long> createDevCimBinCount(Long value) {
        return new JAXBElement<Long>(_DevCimBinCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCimBinCurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinCurCode")
    public JAXBElement<DevCimBinCurCodeType> createDevCimBinCurCode(DevCimBinCurCodeType value) {
        return new JAXBElement<DevCimBinCurCodeType>(_DevCimBinCurCode_QNAME, DevCimBinCurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinDenomination")
    public JAXBElement<BigDecimal> createDevCimBinDenomination(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DevCimBinDenomination_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinMaxCount")
    public JAXBElement<Long> createDevCimBinMaxCount(Long value) {
        return new JAXBElement<Long>(_DevCimBinMaxCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinNum")
    public JAXBElement<Long> createDevCimBinNum(Long value) {
        return new JAXBElement<Long>(_DevCimBinNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCimBinStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinStatus")
    public JAXBElement<DevCimBinStatusType> createDevCimBinStatus(DevCimBinStatusType value) {
        return new JAXBElement<DevCimBinStatusType>(_DevCimBinStatus_QNAME, DevCimBinStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimBinType")
    public JAXBElement<String> createDevCimBinType(String value) {
        return new JAXBElement<String>(_DevCimBinType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimCashUnits")
    public JAXBElement<String> createDevCimCashUnits(String value) {
        return new JAXBElement<String>(_DevCimCashUnits_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimDropBox")
    public JAXBElement<String> createDevCimDropBox(String value) {
        return new JAXBElement<String>(_DevCimDropBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimIntermediateStacker")
    public JAXBElement<String> createDevCimIntermediateStacker(String value) {
        return new JAXBElement<String>(_DevCimIntermediateStacker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimNoteReader")
    public JAXBElement<String> createDevCimNoteReader(String value) {
        return new JAXBElement<String>(_DevCimNoteReader_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimOperation")
    public JAXBElement<String> createDevCimOperation(String value) {
        return new JAXBElement<String>(_DevCimOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevCimPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimPosition")
    public JAXBElement<DevCimPositionType> createDevCimPosition(DevCimPositionType value) {
        return new JAXBElement<DevCimPositionType>(_DevCimPosition_QNAME, DevCimPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimPositionLocation")
    public JAXBElement<String> createDevCimPositionLocation(String value) {
        return new JAXBElement<String>(_DevCimPositionLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimPositionStatus")
    public JAXBElement<String> createDevCimPositionStatus(String value) {
        return new JAXBElement<String>(_DevCimPositionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimSafeDoor")
    public JAXBElement<String> createDevCimSafeDoor(String value) {
        return new JAXBElement<String>(_DevCimSafeDoor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimShutter")
    public JAXBElement<String> createDevCimShutter(String value) {
        return new JAXBElement<String>(_DevCimShutter_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimStackerItems")
    public JAXBElement<String> createDevCimStackerItems(String value) {
        return new JAXBElement<String>(_DevCimStackerItems_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimTransport")
    public JAXBElement<String> createDevCimTransport(String value) {
        return new JAXBElement<String>(_DevCimTransport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimTransportItems")
    public JAXBElement<String> createDevCimTransportItems(String value) {
        return new JAXBElement<String>(_DevCimTransportItems_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevCimType")
    public JAXBElement<String> createDevCimType(String value) {
        return new JAXBElement<String>(_DevCimType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepContainer")
    public JAXBElement<DevDepContainerType> createDevDepContainer(DevDepContainerType value) {
        return new JAXBElement<DevDepContainerType>(_DevDepContainer_QNAME, DevDepContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepEnvelopeDispenserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepEnvelopeDispenser")
    public JAXBElement<DevDepEnvelopeDispenserType> createDevDepEnvelopeDispenser(DevDepEnvelopeDispenserType value) {
        return new JAXBElement<DevDepEnvelopeDispenserType>(_DevDepEnvelopeDispenser_QNAME, DevDepEnvelopeDispenserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepEnvelopeSupplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepEnvelopeSupply")
    public JAXBElement<DevDepEnvelopeSupplyType> createDevDepEnvelopeSupply(DevDepEnvelopeSupplyType value) {
        return new JAXBElement<DevDepEnvelopeSupplyType>(_DevDepEnvelopeSupply_QNAME, DevDepEnvelopeSupplyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepNumOfDeposits")
    public JAXBElement<Long> createDevDepNumOfDeposits(Long value) {
        return new JAXBElement<Long>(_DevDepNumOfDeposits_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepOperation")
    public JAXBElement<String> createDevDepOperation(String value) {
        return new JAXBElement<String>(_DevDepOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepPrinterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepPrinter")
    public JAXBElement<DevDepPrinterType> createDevDepPrinter(DevDepPrinterType value) {
        return new JAXBElement<DevDepPrinterType>(_DevDepPrinter_QNAME, DevDepPrinterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepShutterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepShutter")
    public JAXBElement<DevDepShutterType> createDevDepShutter(DevDepShutterType value) {
        return new JAXBElement<DevDepShutterType>(_DevDepShutter_QNAME, DevDepShutterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepTonerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepToner")
    public JAXBElement<DevDepTonerType> createDevDepToner(DevDepTonerType value) {
        return new JAXBElement<DevDepTonerType>(_DevDepToner_QNAME, DevDepTonerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDepTransportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepTransport")
    public JAXBElement<DevDepTransportType> createDevDepTransport(DevDepTransportType value) {
        return new JAXBElement<DevDepTransportType>(_DevDepTransport_QNAME, DevDepTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDepType")
    public JAXBElement<String> createDevDepType(String value) {
        return new JAXBElement<String>(_DevDepType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetail")
    public JAXBElement<DevDetailType> createDevDetail(DevDetailType value) {
        return new JAXBElement<DevDetailType>(_DevDetail_QNAME, DevDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailAlmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailAlm")
    public JAXBElement<DevDetailAlmType> createDevDetailAlm(DevDetailAlmType value) {
        return new JAXBElement<DevDetailAlmType>(_DevDetailAlm_QNAME, DevDetailAlmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailAppType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailApp")
    public JAXBElement<DevDetailAppType> createDevDetailApp(DevDetailAppType value) {
        return new JAXBElement<DevDetailAppType>(_DevDetailApp_QNAME, DevDetailAppType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailCamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailCam")
    public JAXBElement<DevDetailCamType> createDevDetailCam(DevDetailCamType value) {
        return new JAXBElement<DevDetailCamType>(_DevDetailCam_QNAME, DevDetailCamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailCdmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailCdm")
    public JAXBElement<DevDetailCdmType> createDevDetailCdm(DevDetailCdmType value) {
        return new JAXBElement<DevDetailCdmType>(_DevDetailCdm_QNAME, DevDetailCdmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailChkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailChk")
    public JAXBElement<DevDetailChkType> createDevDetailChk(DevDetailChkType value) {
        return new JAXBElement<DevDetailChkType>(_DevDetailChk_QNAME, DevDetailChkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailCimType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailCim")
    public JAXBElement<DevDetailCimType> createDevDetailCim(DevDetailCimType value) {
        return new JAXBElement<DevDetailCimType>(_DevDetailCim_QNAME, DevDetailCimType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailDepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailDep")
    public JAXBElement<DevDetailDepType> createDevDetailDep(DevDetailDepType value) {
        return new JAXBElement<DevDetailDepType>(_DevDetailDep_QNAME, DevDetailDepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailIdcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailIdc")
    public JAXBElement<DevDetailIdcType> createDevDetailIdc(DevDetailIdcType value) {
        return new JAXBElement<DevDetailIdcType>(_DevDetailIdc_QNAME, DevDetailIdcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailPINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailPIN")
    public JAXBElement<DevDetailPINType> createDevDetailPIN(DevDetailPINType value) {
        return new JAXBElement<DevDetailPINType>(_DevDetailPIN_QNAME, DevDetailPINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailPtrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailPtr")
    public JAXBElement<DevDetailPtrType> createDevDetailPtr(DevDetailPtrType value) {
        return new JAXBElement<DevDetailPtrType>(_DevDetailPtr_QNAME, DevDetailPtrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailSiuType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailSiu")
    public JAXBElement<DevDetailSiuType> createDevDetailSiu(DevDetailSiuType value) {
        return new JAXBElement<DevDetailSiuType>(_DevDetailSiu_QNAME, DevDetailSiuType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailTtuType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailTtu")
    public JAXBElement<DevDetailTtuType> createDevDetailTtu(DevDetailTtuType value) {
        return new JAXBElement<DevDetailTtuType>(_DevDetailTtu_QNAME, DevDetailTtuType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevDetailVdmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevDetailVdm")
    public JAXBElement<DevDetailVdmType> createDevDetailVdm(DevDetailVdmType value) {
        return new JAXBElement<DevDetailVdmType>(_DevDetailVdm_QNAME, DevDetailVdmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevEnvr")
    public JAXBElement<DevEnvrType> createDevEnvr(DevEnvrType value) {
        return new JAXBElement<DevEnvrType>(_DevEnvr_QNAME, DevEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevHealthLevel")
    public JAXBElement<String> createDevHealthLevel(String value) {
        return new JAXBElement<String>(_DevHealthLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevId")
    public JAXBElement<String> createDevId(String value) {
        return new JAXBElement<String>(_DevId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcCards")
    public JAXBElement<Long> createDevIdcCards(Long value) {
        return new JAXBElement<Long>(_DevIdcCards_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevIdcChipPowerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcChipPower")
    public JAXBElement<DevIdcChipPowerType> createDevIdcChipPower(DevIdcChipPowerType value) {
        return new JAXBElement<DevIdcChipPowerType>(_DevIdcChipPower_QNAME, DevIdcChipPowerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevIdcMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcMedia")
    public JAXBElement<DevIdcMediaType> createDevIdcMedia(DevIdcMediaType value) {
        return new JAXBElement<DevIdcMediaType>(_DevIdcMedia_QNAME, DevIdcMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcOperation")
    public JAXBElement<String> createDevIdcOperation(String value) {
        return new JAXBElement<String>(_DevIdcOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevIdcRetainBinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcRetainBin")
    public JAXBElement<DevIdcRetainBinType> createDevIdcRetainBin(DevIdcRetainBinType value) {
        return new JAXBElement<DevIdcRetainBinType>(_DevIdcRetainBin_QNAME, DevIdcRetainBinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevIdcRetainedCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcRetainedCard")
    public JAXBElement<DevIdcRetainedCardType> createDevIdcRetainedCard(DevIdcRetainedCardType value) {
        return new JAXBElement<DevIdcRetainedCardType>(_DevIdcRetainedCard_QNAME, DevIdcRetainedCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevIdcSecurityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcSecurity")
    public JAXBElement<DevIdcSecurityType> createDevIdcSecurity(DevIdcSecurityType value) {
        return new JAXBElement<DevIdcSecurityType>(_DevIdcSecurity_QNAME, DevIdcSecurityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevIdcType")
    public JAXBElement<String> createDevIdcType(String value) {
        return new JAXBElement<String>(_DevIdcType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevInfo")
    public JAXBElement<DevInfoType> createDevInfo(DevInfoType value) {
        return new JAXBElement<DevInfoType>(_DevInfo_QNAME, DevInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevKeys")
    public JAXBElement<DevKeysType> createDevKeys(DevKeysType value) {
        return new JAXBElement<DevKeysType>(_DevKeys_QNAME, DevKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevName")
    public JAXBElement<String> createDevName(String value) {
        return new JAXBElement<String>(_DevName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPINEncStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPINEncStat")
    public JAXBElement<DevPINEncStatType> createDevPINEncStat(DevPINEncStatType value) {
        return new JAXBElement<DevPINEncStatType>(_DevPINEncStat_QNAME, DevPINEncStatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPINOperation")
    public JAXBElement<String> createDevPINOperation(String value) {
        return new JAXBElement<String>(_DevPINOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPINType")
    public JAXBElement<String> createDevPINType(String value) {
        return new JAXBElement<String>(_DevPINType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPlatformDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPlatformData")
    public JAXBElement<DevPlatformDataType> createDevPlatformData(DevPlatformDataType value) {
        return new JAXBElement<DevPlatformDataType>(_DevPlatformData_QNAME, DevPlatformDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPlatformSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPlatformSource")
    public JAXBElement<DevPlatformSourceType> createDevPlatformSource(DevPlatformSourceType value) {
        return new JAXBElement<DevPlatformSourceType>(_DevPlatformSource_QNAME, DevPlatformSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPlatformXfsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPlatformXfs")
    public JAXBElement<DevPlatformXfsType> createDevPlatformXfs(DevPlatformXfsType value) {
        return new JAXBElement<DevPlatformXfsType>(_DevPlatformXfs_QNAME, DevPlatformXfsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrInkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrInk")
    public JAXBElement<DevPtrInkType> createDevPtrInk(DevPtrInkType value) {
        return new JAXBElement<DevPtrInkType>(_DevPtrInk_QNAME, DevPtrInkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrLampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrLamp")
    public JAXBElement<DevPtrLampType> createDevPtrLamp(DevPtrLampType value) {
        return new JAXBElement<DevPtrLampType>(_DevPtrLamp_QNAME, DevPtrLampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrMedia")
    public JAXBElement<DevPtrMediaType> createDevPtrMedia(DevPtrMediaType value) {
        return new JAXBElement<DevPtrMediaType>(_DevPtrMedia_QNAME, DevPtrMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrOperation")
    public JAXBElement<String> createDevPtrOperation(String value) {
        return new JAXBElement<String>(_DevPtrOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrRetractBinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrRetractBin")
    public JAXBElement<DevPtrRetractBinType> createDevPtrRetractBin(DevPtrRetractBinType value) {
        return new JAXBElement<DevPtrRetractBinType>(_DevPtrRetractBin_QNAME, DevPtrRetractBinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrRetractBinStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrRetractBinStatus")
    public JAXBElement<DevPtrRetractBinStatusType> createDevPtrRetractBinStatus(DevPtrRetractBinStatusType value) {
        return new JAXBElement<DevPtrRetractBinStatusType>(_DevPtrRetractBinStatus_QNAME, DevPtrRetractBinStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrSupplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrSupply")
    public JAXBElement<DevPtrSupplyType> createDevPtrSupply(DevPtrSupplyType value) {
        return new JAXBElement<DevPtrSupplyType>(_DevPtrSupply_QNAME, DevPtrSupplyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrSupplyLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrSupplyLevel")
    public JAXBElement<DevPtrSupplyLevelType> createDevPtrSupplyLevel(DevPtrSupplyLevelType value) {
        return new JAXBElement<DevPtrSupplyLevelType>(_DevPtrSupplyLevel_QNAME, DevPtrSupplyLevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrSupplyLocation")
    public JAXBElement<String> createDevPtrSupplyLocation(String value) {
        return new JAXBElement<String>(_DevPtrSupplyLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevPtrTonerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrToner")
    public JAXBElement<DevPtrTonerType> createDevPtrToner(DevPtrTonerType value) {
        return new JAXBElement<DevPtrTonerType>(_DevPtrToner_QNAME, DevPtrTonerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevPtrType")
    public JAXBElement<String> createDevPtrType(String value) {
        return new JAXBElement<String>(_DevPtrType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevRec")
    public JAXBElement<DevRecType> createDevRec(DevRecType value) {
        return new JAXBElement<DevRecType>(_DevRec_QNAME, DevRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevRef")
    public JAXBElement<DevRefType> createDevRef(DevRefType value) {
        return new JAXBElement<DevRefType>(_DevRef_QNAME, DevRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSel")
    public JAXBElement<DevSelType> createDevSel(DevSelType value) {
        return new JAXBElement<DevSelType>(_DevSel_QNAME, DevSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuAmberLedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAmberLed")
    public JAXBElement<DevSiuAmberLedType> createDevSiuAmberLed(DevSiuAmberLedType value) {
        return new JAXBElement<DevSiuAmberLedType>(_DevSiuAmberLed_QNAME, DevSiuAmberLedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAmbientLight")
    public JAXBElement<String> createDevSiuAmbientLight(String value) {
        return new JAXBElement<String>(_DevSiuAmbientLight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAudibleAlarm")
    public JAXBElement<String> createDevSiuAudibleAlarm(String value) {
        return new JAXBElement<String>(_DevSiuAudibleAlarm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAudio")
    public JAXBElement<String> createDevSiuAudio(String value) {
        return new JAXBElement<String>(_DevSiuAudio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuAuxiliaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAuxiliary")
    public JAXBElement<DevSiuAuxiliaryType> createDevSiuAuxiliary(DevSiuAuxiliaryType value) {
        return new JAXBElement<DevSiuAuxiliaryType>(_DevSiuAuxiliary_QNAME, DevSiuAuxiliaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuAuxiliaryStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuAuxiliaryStatus")
    public JAXBElement<DevSiuAuxiliaryStatusType> createDevSiuAuxiliaryStatus(DevSiuAuxiliaryStatusType value) {
        return new JAXBElement<DevSiuAuxiliaryStatusType>(_DevSiuAuxiliaryStatus_QNAME, DevSiuAuxiliaryStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuCabinet")
    public JAXBElement<String> createDevSiuCabinet(String value) {
        return new JAXBElement<String>(_DevSiuCabinet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuCdmGuidelight")
    public JAXBElement<String> createDevSiuCdmGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuCdmGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuChkGuidelight")
    public JAXBElement<String> createDevSiuChkGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuChkGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuCimGuidelight")
    public JAXBElement<String> createDevSiuCimGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuCimGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuCoinInGuidelight")
    public JAXBElement<String> createDevSiuCoinInGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuCoinInGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuCoinOutGuidelight")
    public JAXBElement<String> createDevSiuCoinOutGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuCoinOutGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuDepGuidelight")
    public JAXBElement<String> createDevSiuDepGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuDepGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuDocumentGuidelight")
    public JAXBElement<String> createDevSiuDocumentGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuDocumentGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuDoorStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuDoorStatus")
    public JAXBElement<DevSiuDoorStatusType> createDevSiuDoorStatus(DevSiuDoorStatusType value) {
        return new JAXBElement<DevSiuDoorStatusType>(_DevSiuDoorStatus_QNAME, DevSiuDoorStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuDoorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuDoors")
    public JAXBElement<DevSiuDoorsType> createDevSiuDoors(DevSiuDoorsType value) {
        return new JAXBElement<DevSiuDoorsType>(_DevSiuDoors_QNAME, DevSiuDoorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuEnhancedAudio")
    public JAXBElement<String> createDevSiuEnhancedAudio(String value) {
        return new JAXBElement<String>(_DevSiuEnhancedAudio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuFasciaLight")
    public JAXBElement<String> createDevSiuFasciaLight(String value) {
        return new JAXBElement<String>(_DevSiuFasciaLight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuGreenLedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuGreenLed")
    public JAXBElement<DevSiuGreenLedType> createDevSiuGreenLed(DevSiuGreenLedType value) {
        return new JAXBElement<DevSiuGreenLedType>(_DevSiuGreenLed_QNAME, DevSiuGreenLedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuGuidelightStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuGuidelightStatus")
    public JAXBElement<DevSiuGuidelightStatusType> createDevSiuGuidelightStatus(DevSiuGuidelightStatusType value) {
        return new JAXBElement<DevSiuGuidelightStatusType>(_DevSiuGuidelightStatus_QNAME, DevSiuGuidelightStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuGuidelightsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuGuidelights")
    public JAXBElement<DevSiuGuidelightsType> createDevSiuGuidelights(DevSiuGuidelightsType value) {
        return new JAXBElement<DevSiuGuidelightsType>(_DevSiuGuidelights_QNAME, DevSiuGuidelightsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuHeat")
    public JAXBElement<String> createDevSiuHeat(String value) {
        return new JAXBElement<String>(_DevSiuHeat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuHeating")
    public JAXBElement<String> createDevSiuHeating(String value) {
        return new JAXBElement<String>(_DevSiuHeating_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuIdcGuidelight")
    public JAXBElement<String> createDevSiuIdcGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuIdcGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuIndicatorStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuIndicatorStatus")
    public JAXBElement<DevSiuIndicatorStatusType> createDevSiuIndicatorStatus(DevSiuIndicatorStatusType value) {
        return new JAXBElement<DevSiuIndicatorStatusType>(_DevSiuIndicatorStatus_QNAME, DevSiuIndicatorStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuIndicatorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuIndicators")
    public JAXBElement<DevSiuIndicatorsType> createDevSiuIndicators(DevSiuIndicatorsType value) {
        return new JAXBElement<DevSiuIndicatorsType>(_DevSiuIndicators_QNAME, DevSiuIndicatorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuIntTamper")
    public JAXBElement<String> createDevSiuIntTamper(String value) {
        return new JAXBElement<String>(_DevSiuIntTamper_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuOpenClose")
    public JAXBElement<String> createDevSiuOpenClose(String value) {
        return new JAXBElement<String>(_DevSiuOpenClose_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuOperation")
    public JAXBElement<String> createDevSiuOperation(String value) {
        return new JAXBElement<String>(_DevSiuOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuOperatorSwitch")
    public JAXBElement<String> createDevSiuOperatorSwitch(String value) {
        return new JAXBElement<String>(_DevSiuOperatorSwitch_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuPassbookGuidelight")
    public JAXBElement<String> createDevSiuPassbookGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuPassbookGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuProximity")
    public JAXBElement<String> createDevSiuProximity(String value) {
        return new JAXBElement<String>(_DevSiuProximity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuReceiptGuidelight")
    public JAXBElement<String> createDevSiuReceiptGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuReceiptGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuRedLedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuRedLed")
    public JAXBElement<DevSiuRedLedType> createDevSiuRedLed(DevSiuRedLedType value) {
        return new JAXBElement<DevSiuRedLedType>(_DevSiuRedLed_QNAME, DevSiuRedLedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuRemoteStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuRemoteStatus")
    public JAXBElement<DevSiuRemoteStatusType> createDevSiuRemoteStatus(DevSiuRemoteStatusType value) {
        return new JAXBElement<DevSiuRemoteStatusType>(_DevSiuRemoteStatus_QNAME, DevSiuRemoteStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuSafe")
    public JAXBElement<String> createDevSiuSafe(String value) {
        return new JAXBElement<String>(_DevSiuSafe_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuScannerGuidelight")
    public JAXBElement<String> createDevSiuScannerGuidelight(String value) {
        return new JAXBElement<String>(_DevSiuScannerGuidelight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuSeismic")
    public JAXBElement<String> createDevSiuSeismic(String value) {
        return new JAXBElement<String>(_DevSiuSeismic_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuSensorStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuSensorStatus")
    public JAXBElement<DevSiuSensorStatusType> createDevSiuSensorStatus(DevSiuSensorStatusType value) {
        return new JAXBElement<DevSiuSensorStatusType>(_DevSiuSensorStatus_QNAME, DevSiuSensorStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuSensorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuSensors")
    public JAXBElement<DevSiuSensorsType> createDevSiuSensors(DevSiuSensorsType value) {
        return new JAXBElement<DevSiuSensorsType>(_DevSiuSensors_QNAME, DevSiuSensorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuTamper")
    public JAXBElement<String> createDevSiuTamper(String value) {
        return new JAXBElement<String>(_DevSiuTamper_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevSiuTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuType")
    public JAXBElement<DevSiuTypeType> createDevSiuType(DevSiuTypeType value) {
        return new JAXBElement<DevSiuTypeType>(_DevSiuType_QNAME, DevSiuTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuUps")
    public JAXBElement<String> createDevSiuUps(String value) {
        return new JAXBElement<String>(_DevSiuUps_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuVandalShield")
    public JAXBElement<String> createDevSiuVandalShield(String value) {
        return new JAXBElement<String>(_DevSiuVandalShield_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevSiuVolume")
    public JAXBElement<Long> createDevSiuVolume(Long value) {
        return new JAXBElement<Long>(_DevSiuVolume_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevStatus")
    public JAXBElement<DevStatusType> createDevStatus(DevStatusType value) {
        return new JAXBElement<DevStatusType>(_DevStatus_QNAME, DevStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevStatusCode")
    public JAXBElement<DevStatusCodeType> createDevStatusCode(DevStatusCodeType value) {
        return new JAXBElement<DevStatusCodeType>(_DevStatusCode_QNAME, DevStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevStatusRec")
    public JAXBElement<DevStatusRecType> createDevStatusRec(DevStatusRecType value) {
        return new JAXBElement<DevStatusRecType>(_DevStatusRec_QNAME, DevStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevTtuKbdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevTtuKbd")
    public JAXBElement<DevTtuKbdType> createDevTtuKbd(DevTtuKbdType value) {
        return new JAXBElement<DevTtuKbdType>(_DevTtuKbd_QNAME, DevTtuKbdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevTtuKbdLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevTtuKbdLock")
    public JAXBElement<DevTtuKbdLockType> createDevTtuKbdLock(DevTtuKbdLockType value) {
        return new JAXBElement<DevTtuKbdLockType>(_DevTtuKbdLock_QNAME, DevTtuKbdLockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevTtuLedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevTtuLed")
    public JAXBElement<DevTtuLedType> createDevTtuLed(DevTtuLedType value) {
        return new JAXBElement<DevTtuLedType>(_DevTtuLed_QNAME, DevTtuLedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevTtuOperation")
    public JAXBElement<String> createDevTtuOperation(String value) {
        return new JAXBElement<String>(_DevTtuOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevTtuType")
    public JAXBElement<String> createDevTtuType(String value) {
        return new JAXBElement<String>(_DevTtuType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevVdmOperation")
    public JAXBElement<String> createDevVdmOperation(String value) {
        return new JAXBElement<String>(_DevVdmOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevVdmServiceStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DevVdmServiceState")
    public JAXBElement<DevVdmServiceStateType> createDevVdmServiceState(DevVdmServiceStateType value) {
        return new JAXBElement<DevVdmServiceStateType>(_DevVdmServiceState_QNAME, DevVdmServiceStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscEnvr")
    public JAXBElement<DiscEnvrType> createDiscEnvr(DiscEnvrType value) {
        return new JAXBElement<DiscEnvrType>(_DiscEnvr_QNAME, DiscEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscId")
    public JAXBElement<String> createDiscId(String value) {
        return new JAXBElement<String>(_DiscId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscInfo")
    public JAXBElement<DiscInfoType> createDiscInfo(DiscInfoType value) {
        return new JAXBElement<DiscInfoType>(_DiscInfo_QNAME, DiscInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscKeys")
    public JAXBElement<DiscKeysType> createDiscKeys(DiscKeysType value) {
        return new JAXBElement<DiscKeysType>(_DiscKeys_QNAME, DiscKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscRec")
    public JAXBElement<DiscRecType> createDiscRec(DiscRecType value) {
        return new JAXBElement<DiscRecType>(_DiscRec_QNAME, DiscRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscRef")
    public JAXBElement<DiscRefType> createDiscRef(DiscRefType value) {
        return new JAXBElement<DiscRefType>(_DiscRef_QNAME, DiscRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscSel")
    public JAXBElement<DiscSelType> createDiscSel(DiscSelType value) {
        return new JAXBElement<DiscSelType>(_DiscSel_QNAME, DiscSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscStatus")
    public JAXBElement<DiscStatusType> createDiscStatus(DiscStatusType value) {
        return new JAXBElement<DiscStatusType>(_DiscStatus_QNAME, DiscStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscStatusCode")
    public JAXBElement<DiscStatusCodeType> createDiscStatusCode(DiscStatusCodeType value) {
        return new JAXBElement<DiscStatusCodeType>(_DiscStatusCode_QNAME, DiscStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscStatusRec")
    public JAXBElement<DiscStatusRecType> createDiscStatusRec(DiscStatusRecType value) {
        return new JAXBElement<DiscStatusRecType>(_DiscStatusRec_QNAME, DiscStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DiscURL")
    public JAXBElement<String> createDiscURL(String value) {
        return new JAXBElement<String>(_DiscURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DueDtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "DueDtRange")
    public JAXBElement<DueDtRangeType> createDueDtRange(DueDtRangeType value) {
        return new JAXBElement<DueDtRangeType>(_DueDtRange_QNAME, DueDtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EducationLevel")
    public JAXBElement<String> createEducationLevel(String value) {
        return new JAXBElement<String>(_EducationLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMVRqDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EMVRqData")
    public JAXBElement<EMVRqDataType> createEMVRqData(EMVRqDataType value) {
        return new JAXBElement<EMVRqDataType>(_EMVRqData_QNAME, EMVRqDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EMVRqRawData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createEMVRqRawData(byte[] value) {
        return new JAXBElement<byte[]>(_EMVRqRawData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMVRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EMVRsData")
    public JAXBElement<EMVRsDataType> createEMVRsData(EMVRsDataType value) {
        return new JAXBElement<EMVRsDataType>(_EMVRsData_QNAME, EMVRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EMVRsRawData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createEMVRsRawData(byte[] value) {
        return new JAXBElement<byte[]>(_EMVRsRawData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EffDt")
    public JAXBElement<String> createEffDt(String value) {
        return new JAXBElement<String>(_EffDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffTimeFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EffTimeFrame")
    public JAXBElement<EffTimeFrameType> createEffTimeFrame(EffTimeFrameType value) {
        return new JAXBElement<EffTimeFrameType>(_EffTimeFrame_QNAME, EffTimeFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EmailAddr")
    public JAXBElement<String> createEmailAddr(String value) {
        return new JAXBElement<String>(_EmailAddr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EmailType")
    public JAXBElement<String> createEmailType(String value) {
        return new JAXBElement<String>(_EmailType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EmploymentType")
    public JAXBElement<String> createEmploymentType(String value) {
        return new JAXBElement<String>(_EmploymentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EndDt")
    public JAXBElement<String> createEndDt(String value) {
        return new JAXBElement<String>(_EndDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EndPageNum")
    public JAXBElement<Long> createEndPageNum(Long value) {
        return new JAXBElement<Long>(_EndPageNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EndSectName")
    public JAXBElement<String> createEndSectName(String value) {
        return new JAXBElement<String>(_EndSectName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Environment")
    public JAXBElement<String> createEnvironment(String value) {
        return new JAXBElement<String>(_Environment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EstablishedDt")
    public JAXBElement<XMLGregorianCalendar> createEstablishedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EstablishedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExceptionType")
    public JAXBElement<String> createExceptionType(String value) {
        return new JAXBElement<String>(_ExceptionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchConvertRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchConvertRule")
    public JAXBElement<ExchConvertRuleType> createExchConvertRule(ExchConvertRuleType value) {
        return new JAXBElement<ExchConvertRuleType>(_ExchConvertRule_QNAME, ExchConvertRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchMktConvertRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchMktConvertRule")
    public JAXBElement<ExchMktConvertRuleType> createExchMktConvertRule(ExchMktConvertRuleType value) {
        return new JAXBElement<ExchMktConvertRuleType>(_ExchMktConvertRule_QNAME, ExchMktConvertRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchMktRatePrecision")
    public JAXBElement<Long> createExchMktRatePrecision(Long value) {
        return new JAXBElement<Long>(_ExchMktRatePrecision_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchRate")
    public JAXBElement<BigDecimal> createExchRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExchRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchRateInvertPrec")
    public JAXBElement<Long> createExchRateInvertPrec(Long value) {
        return new JAXBElement<Long>(_ExchRateInvertPrec_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExchRatePrecision")
    public JAXBElement<Long> createExchRatePrecision(Long value) {
        return new JAXBElement<Long>(_ExchRatePrecision_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExpDt")
    public JAXBElement<String> createExpDt(String value) {
        return new JAXBElement<String>(_ExpDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExpectedAvailDt")
    public JAXBElement<String> createExpectedAvailDt(String value) {
        return new JAXBElement<String>(_ExpectedAvailDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExpectedOpenDt")
    public JAXBElement<String> createExpectedOpenDt(String value) {
        return new JAXBElement<String>(_ExpectedOpenDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtAcctBalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExtAcctBal")
    public JAXBElement<ExtAcctBalType> createExtAcctBal(ExtAcctBalType value) {
        return new JAXBElement<ExtAcctBalType>(_ExtAcctBal_QNAME, ExtAcctBalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ExtBalType")
    public JAXBElement<String> createExtBalType(String value) {
        return new JAXBElement<String>(_ExtBalType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FIData")
    public JAXBElement<FIDataType> createFIData(FIDataType value) {
        return new JAXBElement<FIDataType>(_FIData_QNAME, FIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FIIdent")
    public JAXBElement<String> createFIIdent(String value) {
        return new JAXBElement<String>(_FIIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FIIdentType")
    public JAXBElement<String> createFIIdentType(String value) {
        return new JAXBElement<String>(_FIIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FSPayeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FSPayee")
    public JAXBElement<FSPayeeType> createFSPayee(FSPayeeType value) {
        return new JAXBElement<FSPayeeType>(_FSPayee_QNAME, FSPayeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FamilyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<String>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Fee")
    public JAXBElement<FeeType> createFee(FeeType value) {
        return new JAXBElement<FeeType>(_Fee_QNAME, FeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeChargeAllocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FeeChargeAlloc")
    public JAXBElement<FeeChargeAllocType> createFeeChargeAlloc(FeeChargeAllocType value) {
        return new JAXBElement<FeeChargeAllocType>(_FeeChargeAlloc_QNAME, FeeChargeAllocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FeeRqHdr")
    public JAXBElement<FeeRqHdrType> createFeeRqHdr(FeeRqHdrType value) {
        return new JAXBElement<FeeRqHdrType>(_FeeRqHdr_QNAME, FeeRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FeeRsHdr")
    public JAXBElement<FeeRsHdrType> createFeeRsHdr(FeeRsHdrType value) {
        return new JAXBElement<FeeRsHdrType>(_FeeRsHdr_QNAME, FeeRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FeeType")
    public JAXBElement<String> createFeeType(String value) {
        return new JAXBElement<String>(_FeeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FieldSelect")
    public JAXBElement<String> createFieldSelect(String value) {
        return new JAXBElement<String>(_FieldSelect_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FinancialAmt")
    public JAXBElement<FinancialAmtType> createFinancialAmt(FinancialAmtType value) {
        return new JAXBElement<FinancialAmtType>(_FinancialAmt_QNAME, FinancialAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FinancialReportsURL")
    public JAXBElement<String> createFinancialReportsURL(String value) {
        return new JAXBElement<String>(_FinancialReportsURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FinancialSubType")
    public JAXBElement<String> createFinancialSubType(String value) {
        return new JAXBElement<String>(_FinancialSubType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FinancialType")
    public JAXBElement<String> createFinancialType(String value) {
        return new JAXBElement<String>(_FinancialType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FiscalYearEnd")
    public JAXBElement<XMLGregorianCalendar> createFiscalYearEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FiscalYearEnd_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FixingDateEndDt")
    public JAXBElement<String> createFixingDateEndDt(String value) {
        return new JAXBElement<String>(_FixingDateEndDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FixingDateStartDt")
    public JAXBElement<String> createFixingDateStartDt(String value) {
        return new JAXBElement<String>(_FixingDateStartDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FixingDt")
    public JAXBElement<String> createFixingDt(String value) {
        return new JAXBElement<String>(_FixingDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FontIdent")
    public JAXBElement<String> createFontIdent(String value) {
        return new JAXBElement<String>(_FontIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealEnvr")
    public JAXBElement<ForExDealEnvrType> createForExDealEnvr(ForExDealEnvrType value) {
        return new JAXBElement<ForExDealEnvrType>(_ForExDealEnvr_QNAME, ForExDealEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealId")
    public JAXBElement<String> createForExDealId(String value) {
        return new JAXBElement<String>(_ForExDealId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealIdent")
    public JAXBElement<String> createForExDealIdent(String value) {
        return new JAXBElement<String>(_ForExDealIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealInfo")
    public JAXBElement<ForExDealInfoType> createForExDealInfo(ForExDealInfoType value) {
        return new JAXBElement<ForExDealInfoType>(_ForExDealInfo_QNAME, ForExDealInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealRec")
    public JAXBElement<ForExDealRecType> createForExDealRec(ForExDealRecType value) {
        return new JAXBElement<ForExDealRecType>(_ForExDealRec_QNAME, ForExDealRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealRef")
    public JAXBElement<ForExDealRefType> createForExDealRef(ForExDealRefType value) {
        return new JAXBElement<ForExDealRefType>(_ForExDealRef_QNAME, ForExDealRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealStatus")
    public JAXBElement<ForExDealStatusType> createForExDealStatus(ForExDealStatusType value) {
        return new JAXBElement<ForExDealStatusType>(_ForExDealStatus_QNAME, ForExDealStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealStatusCode")
    public JAXBElement<ForExDealStatusCodeType> createForExDealStatusCode(ForExDealStatusCodeType value) {
        return new JAXBElement<ForExDealStatusCodeType>(_ForExDealStatusCode_QNAME, ForExDealStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealKeys")
    public JAXBElement<ForExDealKeysType> createForExDealKeys(ForExDealKeysType value) {
        return new JAXBElement<ForExDealKeysType>(_ForExDealKeys_QNAME, ForExDealKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealSel")
    public JAXBElement<ForExDealSelType> createForExDealSel(ForExDealSelType value) {
        return new JAXBElement<ForExDealSelType>(_ForExDealSel_QNAME, ForExDealSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExDealStatusRec")
    public JAXBElement<ForExDealStatusRecType> createForExDealStatusRec(ForExDealStatusRecType value) {
        return new JAXBElement<ForExDealStatusRecType>(_ForExDealStatusRec_QNAME, ForExDealStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExHomeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExHomeRate")
    public JAXBElement<ForExHomeRateType> createForExHomeRate(ForExHomeRateType value) {
        return new JAXBElement<ForExHomeRateType>(_ForExHomeRate_QNAME, ForExHomeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteId")
    public JAXBElement<String> createForExQuoteId(String value) {
        return new JAXBElement<String>(_ForExQuoteId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteIdent")
    public JAXBElement<String> createForExQuoteIdent(String value) {
        return new JAXBElement<String>(_ForExQuoteIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteKeys")
    public JAXBElement<ForExQuoteKeysType> createForExQuoteKeys(ForExQuoteKeysType value) {
        return new JAXBElement<ForExQuoteKeysType>(_ForExQuoteKeys_QNAME, ForExQuoteKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteEnvr")
    public JAXBElement<ForExQuoteEnvrType> createForExQuoteEnvr(ForExQuoteEnvrType value) {
        return new JAXBElement<ForExQuoteEnvrType>(_ForExQuoteEnvr_QNAME, ForExQuoteEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteInfo")
    public JAXBElement<ForExQuoteInfoType> createForExQuoteInfo(ForExQuoteInfoType value) {
        return new JAXBElement<ForExQuoteInfoType>(_ForExQuoteInfo_QNAME, ForExQuoteInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteRef")
    public JAXBElement<ForExQuoteRefType> createForExQuoteRef(ForExQuoteRefType value) {
        return new JAXBElement<ForExQuoteRefType>(_ForExQuoteRef_QNAME, ForExQuoteRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteSel")
    public JAXBElement<ForExQuoteSelType> createForExQuoteSel(ForExQuoteSelType value) {
        return new JAXBElement<ForExQuoteSelType>(_ForExQuoteSel_QNAME, ForExQuoteSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteStatus")
    public JAXBElement<ForExQuoteStatusType> createForExQuoteStatus(ForExQuoteStatusType value) {
        return new JAXBElement<ForExQuoteStatusType>(_ForExQuoteStatus_QNAME, ForExQuoteStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteStatusCode")
    public JAXBElement<String> createForExQuoteStatusCode(String value) {
        return new JAXBElement<String>(_ForExQuoteStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteStatusRec")
    public JAXBElement<ForExQuoteStatusRecType> createForExQuoteStatusRec(ForExQuoteStatusRecType value) {
        return new JAXBElement<ForExQuoteStatusRecType>(_ForExQuoteStatusRec_QNAME, ForExQuoteStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteType")
    public JAXBElement<String> createForExQuoteType(String value) {
        return new JAXBElement<String>(_ForExQuoteType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateProviderName")
    public JAXBElement<String> createForExRateProviderName(String value) {
        return new JAXBElement<String>(_ForExRateProviderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetEnvr")
    public JAXBElement<ForExRateSheetEnvrType> createForExRateSheetEnvr(ForExRateSheetEnvrType value) {
        return new JAXBElement<ForExRateSheetEnvrType>(_ForExRateSheetEnvr_QNAME, ForExRateSheetEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetId")
    public JAXBElement<String> createForExRateSheetId(String value) {
        return new JAXBElement<String>(_ForExRateSheetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetIdent")
    public JAXBElement<String> createForExRateSheetIdent(String value) {
        return new JAXBElement<String>(_ForExRateSheetIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetKeys")
    public JAXBElement<ForExRateSheetKeysType> createForExRateSheetKeys(ForExRateSheetKeysType value) {
        return new JAXBElement<ForExRateSheetKeysType>(_ForExRateSheetKeys_QNAME, ForExRateSheetKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetRef")
    public JAXBElement<ForExRateSheetRefType> createForExRateSheetRef(ForExRateSheetRefType value) {
        return new JAXBElement<ForExRateSheetRefType>(_ForExRateSheetRef_QNAME, ForExRateSheetRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetStatus")
    public JAXBElement<ForExRateSheetStatusType> createForExRateSheetStatus(ForExRateSheetStatusType value) {
        return new JAXBElement<ForExRateSheetStatusType>(_ForExRateSheetStatus_QNAME, ForExRateSheetStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetStatusCode")
    public JAXBElement<String> createForExRateSheetStatusCode(String value) {
        return new JAXBElement<String>(_ForExRateSheetStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateSheetStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateSheetStatusRec")
    public JAXBElement<ForExRateSheetStatusRecType> createForExRateSheetStatusRec(ForExRateSheetStatusRecType value) {
        return new JAXBElement<ForExRateSheetStatusRecType>(_ForExRateSheetStatusRec_QNAME, ForExRateSheetStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExRateTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExRateType")
    public JAXBElement<ForExRateTypeType> createForExRateType(ForExRateTypeType value) {
        return new JAXBElement<ForExRateTypeType>(_ForExRateType_QNAME, ForExRateTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExValDt")
    public JAXBElement<String> createForExValDt(String value) {
        return new JAXBElement<String>(_ForExValDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExValDtTimeFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExValDtTimeFrame")
    public JAXBElement<ForExValDtTimeFrameType> createForExValDtTimeFrame(ForExValDtTimeFrameType value) {
        return new JAXBElement<ForExValDtTimeFrameType>(_ForExValDtTimeFrame_QNAME, ForExValDtTimeFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExValDtTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExValDtType")
    public JAXBElement<ForExValDtTypeType> createForExValDtType(ForExValDtTypeType value) {
        return new JAXBElement<ForExValDtTypeType>(_ForExValDtType_QNAME, ForExValDtTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForwardPts")
    public JAXBElement<BigDecimal> createForwardPts(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForwardPts_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Freq")
    public JAXBElement<String> createFreq(String value) {
        return new JAXBElement<String>(_Freq_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FormImg")
    public JAXBElement<FormImgType> createFormImg(FormImgType value) {
        return new JAXBElement<FormImgType>(_FormImg_QNAME, FormImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FullName")
    public JAXBElement<String> createFullName(String value) {
        return new JAXBElement<String>(_FullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FundingDueDt")
    public JAXBElement<String> createFundingDueDt(String value) {
        return new JAXBElement<String>(_FundingDueDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FundingMethod")
    public JAXBElement<String> createFundingMethod(String value) {
        return new JAXBElement<String>(_FundingMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "FundingPriority")
    public JAXBElement<String> createFundingPriority(String value) {
        return new JAXBElement<String>(_FundingPriority_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Gender")
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GTIN")
    public JAXBElement<String> createGTIN(String value) {
        return new JAXBElement<String>(_GTIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GivenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GovIssuedIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GovIssuedIdent")
    public JAXBElement<GovIssuedIdentType> createGovIssuedIdent(GovIssuedIdentType value) {
        return new JAXBElement<GovIssuedIdentType>(_GovIssuedIdent_QNAME, GovIssuedIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GovLevel")
    public JAXBElement<String> createGovLevel(String value) {
        return new JAXBElement<String>(_GovLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GovOrgName")
    public JAXBElement<String> createGovOrgName(String value) {
        return new JAXBElement<String>(_GovOrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "GraceEndDt")
    public JAXBElement<XMLGregorianCalendar> createGraceEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GraceEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "HomeOwnership")
    public JAXBElement<String> createHomeOwnership(String value) {
        return new JAXBElement<String>(_HomeOwnership_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "HighCurAmt")
    public JAXBElement<HighCurAmtType> createHighCurAmt(HighCurAmtType value) {
        return new JAXBElement<HighCurAmtType>(_HighCurAmt_QNAME, HighCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "HistRetentionDays")
    public JAXBElement<Long> createHistRetentionDays(Long value) {
        return new JAXBElement<Long>(_HistRetentionDays_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "HomeCurAmt")
    public JAXBElement<BigDecimal> createHomeCurAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HomeCurAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeCurCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "HomeCurCode")
    public JAXBElement<HomeCurCodeType> createHomeCurCode(HomeCurCodeType value) {
        return new JAXBElement<HomeCurCodeType>(_HomeCurCode_QNAME, HomeCurCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IBAN")
    public JAXBElement<String> createIBAN(String value) {
        return new JAXBElement<String>(_IBAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateEnvr")
    public JAXBElement<ICCUpdateEnvrType> createICCUpdateEnvr(ICCUpdateEnvrType value) {
        return new JAXBElement<ICCUpdateEnvrType>(_ICCUpdateEnvr_QNAME, ICCUpdateEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateId")
    public JAXBElement<String> createICCUpdateId(String value) {
        return new JAXBElement<String>(_ICCUpdateId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateInfo")
    public JAXBElement<ICCUpdateInfoType> createICCUpdateInfo(ICCUpdateInfoType value) {
        return new JAXBElement<ICCUpdateInfoType>(_ICCUpdateInfo_QNAME, ICCUpdateInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateRec")
    public JAXBElement<ICCUpdateRecType> createICCUpdateRec(ICCUpdateRecType value) {
        return new JAXBElement<ICCUpdateRecType>(_ICCUpdateRec_QNAME, ICCUpdateRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateStatus")
    public JAXBElement<ICCUpdateStatusType> createICCUpdateStatus(ICCUpdateStatusType value) {
        return new JAXBElement<ICCUpdateStatusType>(_ICCUpdateStatus_QNAME, ICCUpdateStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateStatusCode")
    public JAXBElement<String> createICCUpdateStatusCode(String value) {
        return new JAXBElement<String>(_ICCUpdateStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateKeys")
    public JAXBElement<ICCUpdateKeysType> createICCUpdateKeys(ICCUpdateKeysType value) {
        return new JAXBElement<ICCUpdateKeysType>(_ICCUpdateKeys_QNAME, ICCUpdateKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateRef")
    public JAXBElement<ICCUpdateRefType> createICCUpdateRef(ICCUpdateRefType value) {
        return new JAXBElement<ICCUpdateRefType>(_ICCUpdateRef_QNAME, ICCUpdateRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateSel")
    public JAXBElement<ICCUpdateSelType> createICCUpdateSel(ICCUpdateSelType value) {
        return new JAXBElement<ICCUpdateSelType>(_ICCUpdateSel_QNAME, ICCUpdateSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICCUpdateStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ICCUpdateStatusRec")
    public JAXBElement<ICCUpdateStatusRecType> createICCUpdateStatusRec(ICCUpdateStatusRecType value) {
        return new JAXBElement<ICCUpdateStatusRecType>(_ICCUpdateStatusRec_QNAME, ICCUpdateStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentCharacterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentCharacterData")
    public JAXBElement<IdentCharacterDataType> createIdentCharacterData(IdentCharacterDataType value) {
        return new JAXBElement<IdentCharacterDataType>(_IdentCharacterData_QNAME, IdentCharacterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentConditions")
    public JAXBElement<String> createIdentConditions(String value) {
        return new JAXBElement<String>(_IdentConditions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentImg")
    public JAXBElement<IdentImgType> createIdentImg(IdentImgType value) {
        return new JAXBElement<IdentImgType>(_IdentImg_QNAME, IdentImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentPrevReadMethod")
    public JAXBElement<String> createIdentPrevReadMethod(String value) {
        return new JAXBElement<String>(_IdentPrevReadMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentPrevServiceCode")
    public JAXBElement<String> createIdentPrevServiceCode(String value) {
        return new JAXBElement<String>(_IdentPrevServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentProgram")
    public JAXBElement<String> createIdentProgram(String value) {
        return new JAXBElement<String>(_IdentProgram_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentReadMethod")
    public JAXBElement<String> createIdentReadMethod(String value) {
        return new JAXBElement<String>(_IdentReadMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentServiceCode")
    public JAXBElement<String> createIdentServiceCode(String value) {
        return new JAXBElement<String>(_IdentServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentType")
    public JAXBElement<String> createIdentType(String value) {
        return new JAXBElement<String>(_IdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentVerifyEntity")
    public JAXBElement<String> createIdentVerifyEntity(String value) {
        return new JAXBElement<String>(_IdentVerifyEntity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentVerifyMethod")
    public JAXBElement<String> createIdentVerifyMethod(String value) {
        return new JAXBElement<String>(_IdentVerifyMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IdentVerifyResults")
    public JAXBElement<String> createIdentVerifyResults(String value) {
        return new JAXBElement<String>(_IdentVerifyResults_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ImageURL")
    public JAXBElement<String> createImageURL(String value) {
        return new JAXBElement<String>(_ImageURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ImmediateXfer")
    public JAXBElement<Boolean> createImmediateXfer(Boolean value) {
        return new JAXBElement<Boolean>(_ImmediateXfer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InitialAmount")
    public JAXBElement<InitialAmountType> createInitialAmount(InitialAmountType value) {
        return new JAXBElement<InitialAmountType>(_InitialAmount_QNAME, InitialAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvItemId")
    public JAXBElement<String> createInvItemId(String value) {
        return new JAXBElement<String>(_InvItemId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ImmediatePmt")
    public JAXBElement<Boolean> createImmediatePmt(Boolean value) {
        return new JAXBElement<Boolean>(_ImmediatePmt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ImmigrationStatus")
    public JAXBElement<String> createImmigrationStatus(String value) {
        return new JAXBElement<String>(_ImmigrationStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ImportDt")
    public JAXBElement<XMLGregorianCalendar> createImportDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IncEndrsmntStmp")
    public JAXBElement<Boolean> createIncEndrsmntStmp(Boolean value) {
        return new JAXBElement<Boolean>(_IncEndrsmntStmp_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IncSecSigLine")
    public JAXBElement<Boolean> createIncSecSigLine(Boolean value) {
        return new JAXBElement<Boolean>(_IncSecSigLine_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Index")
    public JAXBElement<Long> createIndex(Long value) {
        return new JAXBElement<Long>(_Index_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IndustIdent")
    public JAXBElement<IndustIdentType> createIndustIdent(IndustIdentType value) {
        return new JAXBElement<IndustIdentType>(_IndustIdent_QNAME, IndustIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IndustNum")
    public JAXBElement<String> createIndustNum(String value) {
        return new JAXBElement<String>(_IndustNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntAPR")
    public JAXBElement<BigDecimal> createIntAPR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IntAPR_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntAPY")
    public JAXBElement<BigDecimal> createIntAPY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IntAPY_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntDisposition")
    public JAXBElement<String> createIntDisposition(String value) {
        return new JAXBElement<String>(_IntDisposition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InterestRate")
    public JAXBElement<BigDecimal> createInterestRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InterestRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestRateYieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InterestRateYield")
    public JAXBElement<InterestRateYieldType> createInterestRateYield(InterestRateYieldType value) {
        return new JAXBElement<InterestRateYieldType>(_InterestRateYield_QNAME, InterestRateYieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InterchangeServiceCode")
    public JAXBElement<String> createInterchangeServiceCode(String value) {
        return new JAXBElement<String>(_InterchangeServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InterfaceName")
    public JAXBElement<String> createInterfaceName(String value) {
        return new JAXBElement<String>(_InterfaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InterfaceVersion")
    public JAXBElement<String> createInterfaceVersion(String value) {
        return new JAXBElement<String>(_InterfaceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntermediaryDepAcctType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IntermediaryDepAcct")
    public JAXBElement<IntermediaryDepAcctType> createIntermediaryDepAcct(IntermediaryDepAcctType value) {
        return new JAXBElement<IntermediaryDepAcctType>(_IntermediaryDepAcct_QNAME, IntermediaryDepAcctType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvalidPinAttempts")
    public JAXBElement<Long> createInvalidPinAttempts(Long value) {
        return new JAXBElement<Long>(_InvalidPinAttempts_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceAdjType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceAdj")
    public JAXBElement<InvoiceAdjType> createInvoiceAdj(InvoiceAdjType value) {
        return new JAXBElement<InvoiceAdjType>(_InvoiceAdj_QNAME, InvoiceAdjType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceAdjNum")
    public JAXBElement<String> createInvoiceAdjNum(String value) {
        return new JAXBElement<String>(_InvoiceAdjNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceData")
    public JAXBElement<InvoiceDataType> createInvoiceData(InvoiceDataType value) {
        return new JAXBElement<InvoiceDataType>(_InvoiceData_QNAME, InvoiceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceLineItem")
    public JAXBElement<InvoiceLineItemType> createInvoiceLineItem(InvoiceLineItemType value) {
        return new JAXBElement<InvoiceLineItemType>(_InvoiceLineItem_QNAME, InvoiceLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceLineItemNum")
    public JAXBElement<String> createInvoiceLineItemNum(String value) {
        return new JAXBElement<String>(_InvoiceLineItemNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceNum")
    public JAXBElement<String> createInvoiceNum(String value) {
        return new JAXBElement<String>(_InvoiceNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePremiumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoicePremium")
    public JAXBElement<InvoicePremiumType> createInvoicePremium(InvoicePremiumType value) {
        return new JAXBElement<InvoicePremiumType>(_InvoicePremium_QNAME, InvoicePremiumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceReceiverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceReceiver")
    public JAXBElement<InvoiceReceiverType> createInvoiceReceiver(InvoiceReceiverType value) {
        return new JAXBElement<InvoiceReceiverType>(_InvoiceReceiver_QNAME, InvoiceReceiverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceSender")
    public JAXBElement<InvoiceSenderType> createInvoiceSender(InvoiceSenderType value) {
        return new JAXBElement<InvoiceSenderType>(_InvoiceSender_QNAME, InvoiceSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceType")
    public JAXBElement<String> createInvoiceType(String value) {
        return new JAXBElement<String>(_InvoiceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "InvoiceVouchNum")
    public JAXBElement<String> createInvoiceVouchNum(String value) {
        return new JAXBElement<String>(_InvoiceVouchNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssueDt")
    public JAXBElement<String> createIssueDt(String value) {
        return new JAXBElement<String>(_IssueDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuedIdentType")
    public JAXBElement<String> createIssuedIdentType(String value) {
        return new JAXBElement<String>(_IssuedIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuedIdentValue")
    public JAXBElement<String> createIssuedIdentValue(String value) {
        return new JAXBElement<String>(_IssuedIdentValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuedLoc")
    public JAXBElement<String> createIssuedLoc(String value) {
        return new JAXBElement<String>(_IssuedLoc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Issuer")
    public JAXBElement<String> createIssuer(String value) {
        return new JAXBElement<String>(_Issuer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerName")
    public JAXBElement<String> createIssuerName(String value) {
        return new JAXBElement<String>(_IssuerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerPostScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerPostScriptData")
    public JAXBElement<IssuerPostScriptDataType> createIssuerPostScriptData(IssuerPostScriptDataType value) {
        return new JAXBElement<IssuerPostScriptDataType>(_IssuerPostScriptData_QNAME, IssuerPostScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerPreScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerPreScriptData")
    public JAXBElement<IssuerPreScriptDataType> createIssuerPreScriptData(IssuerPreScriptDataType value) {
        return new JAXBElement<IssuerPreScriptDataType>(_IssuerPreScriptData_QNAME, IssuerPreScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerScriptCmd")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssuerScriptCmd(byte[] value) {
        return new JAXBElement<byte[]>(_IssuerScriptCmd_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerScriptData")
    public JAXBElement<IssuerScriptDataType> createIssuerScriptData(IssuerScriptDataType value) {
        return new JAXBElement<IssuerScriptDataType>(_IssuerScriptData_QNAME, IssuerScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerScriptIdent")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssuerScriptIdent(byte[] value) {
        return new JAXBElement<byte[]>(_IssuerScriptIdent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerScriptResult")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssuerScriptResult(byte[] value) {
        return new JAXBElement<byte[]>(_IssuerScriptResult_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerScriptResultDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "IssuerScriptResultData")
    public JAXBElement<IssuerScriptResultDataType> createIssuerScriptResultData(IssuerScriptResultDataType value) {
        return new JAXBElement<IssuerScriptResultDataType>(_IssuerScriptResultData_QNAME, IssuerScriptResultDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "JobTitle")
    public JAXBElement<String> createJobTitle(String value) {
        return new JAXBElement<String>(_JobTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOCLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LOCLimit")
    public JAXBElement<LOCLimitType> createLOCLimit(LOCLimitType value) {
        return new JAXBElement<LOCLimitType>(_LOCLimit_QNAME, LOCLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOCLoanDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LOCLoanData")
    public JAXBElement<LOCLoanDataType> createLOCLoanData(LOCLoanDataType value) {
        return new JAXBElement<LOCLoanDataType>(_LOCLoanData_QNAME, LOCLoanDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastContactDt")
    public JAXBElement<String> createLastContactDt(String value) {
        return new JAXBElement<String>(_LastContactDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastOccurInd")
    public JAXBElement<Boolean> createLastOccurInd(Boolean value) {
        return new JAXBElement<Boolean>(_LastOccurInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastOccurenceDt")
    public JAXBElement<String> createLastOccurenceDt(String value) {
        return new JAXBElement<String>(_LastOccurenceDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastPrivacyNoteDt")
    public JAXBElement<XMLGregorianCalendar> createLastPrivacyNoteDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastPrivacyNoteDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastUpdateDt")
    public JAXBElement<String> createLastUpdateDt(String value) {
        return new JAXBElement<String>(_LastUpdateDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LastUpdateRqUID")
    public JAXBElement<String> createLastUpdateRqUID(String value) {
        return new JAXBElement<String>(_LastUpdateRqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LegalForm")
    public JAXBElement<String> createLegalForm(String value) {
        return new JAXBElement<String>(_LegalForm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LegalName")
    public JAXBElement<String> createLegalName(String value) {
        return new JAXBElement<String>(_LegalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LegalNameInd")
    public JAXBElement<Boolean> createLegalNameInd(Boolean value) {
        return new JAXBElement<Boolean>(_LegalNameInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LegalRptCode")
    public JAXBElement<String> createLegalRptCode(String value) {
        return new JAXBElement<String>(_LegalRptCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LimitCount")
    public JAXBElement<Long> createLimitCount(Long value) {
        return new JAXBElement<Long>(_LimitCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LimitResetDt")
    public JAXBElement<String> createLimitResetDt(String value) {
        return new JAXBElement<String>(_LimitResetDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LimitPosition")
    public JAXBElement<String> createLimitPosition(String value) {
        return new JAXBElement<String>(_LimitPosition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LimitType")
    public JAXBElement<String> createLimitType(String value) {
        return new JAXBElement<String>(_LimitType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Locator")
    public JAXBElement<LocatorType> createLocator(LocatorType value) {
        return new JAXBElement<LocatorType>(_Locator_QNAME, LocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LockboxAcctIdent")
    public JAXBElement<String> createLockboxAcctIdent(String value) {
        return new JAXBElement<String>(_LockboxAcctIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockboxDepIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LockboxDepIdent")
    public JAXBElement<LockboxDepIdentType> createLockboxDepIdent(LockboxDepIdentType value) {
        return new JAXBElement<LockboxDepIdentType>(_LockboxDepIdent_QNAME, LockboxDepIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LockboxURL")
    public JAXBElement<String> createLockboxURL(String value) {
        return new JAXBElement<String>(_LockboxURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LoginAuthority")
    public JAXBElement<String> createLoginAuthority(String value) {
        return new JAXBElement<String>(_LoginAuthority_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LoginIdent")
    public JAXBElement<LoginIdentType> createLoginIdent(LoginIdentType value) {
        return new JAXBElement<LoginIdentType>(_LoginIdent_QNAME, LoginIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LoginName")
    public JAXBElement<String> createLoginName(String value) {
        return new JAXBElement<String>(_LoginName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LongText")
    public JAXBElement<String> createLongText(String value) {
        return new JAXBElement<String>(_LongText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "LowCurAmt")
    public JAXBElement<LowCurAmtType> createLowCurAmt(LowCurAmtType value) {
        return new JAXBElement<LowCurAmtType>(_LowCurAmt_QNAME, LowCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MCC")
    public JAXBElement<String> createMCC(String value) {
        return new JAXBElement<String>(_MCC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MacValue")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createMacValue(byte[] value) {
        return new JAXBElement<byte[]>(_MacValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MacVariant")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createMacVariant(byte[] value) {
        return new JAXBElement<byte[]>(_MacVariant_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateData")
    public JAXBElement<MagCardUpdateDataType> createMagCardUpdateData(MagCardUpdateDataType value) {
        return new JAXBElement<MagCardUpdateDataType>(_MagCardUpdateData_QNAME, MagCardUpdateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateEnvr")
    public JAXBElement<MagCardUpdateEnvrType> createMagCardUpdateEnvr(MagCardUpdateEnvrType value) {
        return new JAXBElement<MagCardUpdateEnvrType>(_MagCardUpdateEnvr_QNAME, MagCardUpdateEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateId")
    public JAXBElement<String> createMagCardUpdateId(String value) {
        return new JAXBElement<String>(_MagCardUpdateId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateInfo")
    public JAXBElement<MagCardUpdateInfoType> createMagCardUpdateInfo(MagCardUpdateInfoType value) {
        return new JAXBElement<MagCardUpdateInfoType>(_MagCardUpdateInfo_QNAME, MagCardUpdateInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateRec")
    public JAXBElement<MagCardUpdateRecType> createMagCardUpdateRec(MagCardUpdateRecType value) {
        return new JAXBElement<MagCardUpdateRecType>(_MagCardUpdateRec_QNAME, MagCardUpdateRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateStatus")
    public JAXBElement<MagCardUpdateStatusType> createMagCardUpdateStatus(MagCardUpdateStatusType value) {
        return new JAXBElement<MagCardUpdateStatusType>(_MagCardUpdateStatus_QNAME, MagCardUpdateStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateStatusCode")
    public JAXBElement<String> createMagCardUpdateStatusCode(String value) {
        return new JAXBElement<String>(_MagCardUpdateStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateKeys")
    public JAXBElement<MagCardUpdateKeysType> createMagCardUpdateKeys(MagCardUpdateKeysType value) {
        return new JAXBElement<MagCardUpdateKeysType>(_MagCardUpdateKeys_QNAME, MagCardUpdateKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateRef")
    public JAXBElement<MagCardUpdateRefType> createMagCardUpdateRef(MagCardUpdateRefType value) {
        return new JAXBElement<MagCardUpdateRefType>(_MagCardUpdateRef_QNAME, MagCardUpdateRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateSel")
    public JAXBElement<MagCardUpdateSelType> createMagCardUpdateSel(MagCardUpdateSelType value) {
        return new JAXBElement<MagCardUpdateSelType>(_MagCardUpdateSel_QNAME, MagCardUpdateSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MagCardUpdateStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagCardUpdateStatusRec")
    public JAXBElement<MagCardUpdateStatusRecType> createMagCardUpdateStatusRec(MagCardUpdateStatusRecType value) {
        return new JAXBElement<MagCardUpdateStatusRecType>(_MagCardUpdateStatusRec_QNAME, MagCardUpdateStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagData1")
    public JAXBElement<String> createMagData1(String value) {
        return new JAXBElement<String>(_MagData1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagData2")
    public JAXBElement<String> createMagData2(String value) {
        return new JAXBElement<String>(_MagData2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MagData3")
    public JAXBElement<String> createMagData3(String value) {
        return new JAXBElement<String>(_MagData3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ManualMicr")
    public JAXBElement<Boolean> createManualMicr(Boolean value) {
        return new JAXBElement<Boolean>(_ManualMicr_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaritalStat")
    public JAXBElement<String> createMaritalStat(String value) {
        return new JAXBElement<String>(_MaritalStat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MarriedName")
    public JAXBElement<String> createMarriedName(String value) {
        return new JAXBElement<String>(_MarriedName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MatchedRecCount")
    public JAXBElement<Long> createMatchedRecCount(Long value) {
        return new JAXBElement<Long>(_MatchedRecCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaternalName")
    public JAXBElement<String> createMaternalName(String value) {
        return new JAXBElement<String>(_MaternalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaturityDt")
    public JAXBElement<XMLGregorianCalendar> createMaturityDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MaturityDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaxCurAmt")
    public JAXBElement<MaxCurAmtType> createMaxCurAmt(MaxCurAmtType value) {
        return new JAXBElement<MaxCurAmtType>(_MaxCurAmt_QNAME, MaxCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaxRecLimit")
    public JAXBElement<Long> createMaxRecLimit(Long value) {
        return new JAXBElement<Long>(_MaxRecLimit_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctEnvr")
    public JAXBElement<MediaAcctEnvrType> createMediaAcctEnvr(MediaAcctEnvrType value) {
        return new JAXBElement<MediaAcctEnvrType>(_MediaAcctEnvr_QNAME, MediaAcctEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ActionSummary")
    public JAXBElement<ActionSummaryType> createActionSummary(ActionSummaryType value) {
        return new JAXBElement<ActionSummaryType>(_ActionSummary_QNAME, ActionSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MiscIdent")
    public JAXBElement<String> createMiscIdent(String value) {
        return new JAXBElement<String>(_MiscIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AttributeName")
    public JAXBElement<String> createAttributeName(String value) {
        return new JAXBElement<String>(_AttributeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BinNum")
    public JAXBElement<Long> createBinNum(Long value) {
        return new JAXBElement<Long>(_BinNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Scope")
    public JAXBElement<String> createScope(String value) {
        return new JAXBElement<String>(_Scope_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ActionType")
    public JAXBElement<String> createActionType(String value) {
        return new JAXBElement<String>(_ActionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ActionLoginName")
    public JAXBElement<String> createActionLoginName(String value) {
        return new JAXBElement<String>(_ActionLoginName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ActionDate")
    public JAXBElement<String> createActionDate(String value) {
        return new JAXBElement<String>(_ActionDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctAuth")
    public JAXBElement<MediaAcctAuthType> createMediaAcctAuth(MediaAcctAuthType value) {
        return new JAXBElement<MediaAcctAuthType>(_MediaAcctAuth_QNAME, MediaAcctAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctId")
    public JAXBElement<String> createMediaAcctId(String value) {
        return new JAXBElement<String>(_MediaAcctId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctIdent")
    public JAXBElement<String> createMediaAcctIdent(String value) {
        return new JAXBElement<String>(_MediaAcctIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctInfo")
    public JAXBElement<MediaAcctInfoType> createMediaAcctInfo(MediaAcctInfoType value) {
        return new JAXBElement<MediaAcctInfoType>(_MediaAcctInfo_QNAME, MediaAcctInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctKeys")
    public JAXBElement<MediaAcctKeysType> createMediaAcctKeys(MediaAcctKeysType value) {
        return new JAXBElement<MediaAcctKeysType>(_MediaAcctKeys_QNAME, MediaAcctKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctRef")
    public JAXBElement<MediaAcctRefType> createMediaAcctRef(MediaAcctRefType value) {
        return new JAXBElement<MediaAcctRefType>(_MediaAcctRef_QNAME, MediaAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctSel")
    public JAXBElement<MediaAcctSelType> createMediaAcctSel(MediaAcctSelType value) {
        return new JAXBElement<MediaAcctSelType>(_MediaAcctSel_QNAME, MediaAcctSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctStatus")
    public JAXBElement<MediaAcctStatusType> createMediaAcctStatus(MediaAcctStatusType value) {
        return new JAXBElement<MediaAcctStatusType>(_MediaAcctStatus_QNAME, MediaAcctStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctStatusCode")
    public JAXBElement<String> createMediaAcctStatusCode(String value) {
        return new JAXBElement<String>(_MediaAcctStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctSyncRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctSyncRq")
    public JAXBElement<MediaAcctSyncRqType> createMediaAcctSyncRq(MediaAcctSyncRqType value) {
        return new JAXBElement<MediaAcctSyncRqType>(_MediaAcctSyncRq_QNAME, MediaAcctSyncRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctType")
    public JAXBElement<String> createMediaAcctType(String value) {
        return new JAXBElement<String>(_MediaAcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaItem")
    public JAXBElement<MediaItemType> createMediaItem(MediaItemType value) {
        return new JAXBElement<MediaItemType>(_MediaItem_QNAME, MediaItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaItemSubType")
    public JAXBElement<String> createMediaItemSubType(String value) {
        return new JAXBElement<String>(_MediaItemSubType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaItemType")
    public JAXBElement<String> createMediaItemType(String value) {
        return new JAXBElement<String>(_MediaItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaTotal")
    public JAXBElement<MediaTotalType> createMediaTotal(MediaTotalType value) {
        return new JAXBElement<MediaTotalType>(_MediaTotal_QNAME, MediaTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaTotalType")
    public JAXBElement<String> createMediaTotalType(String value) {
        return new JAXBElement<String>(_MediaTotalType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MemberSinceDt")
    public JAXBElement<String> createMemberSinceDt(String value) {
        return new JAXBElement<String>(_MemberSinceDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NextTrnIdent")
    public JAXBElement<Long> createNextTrnIdent(Long value) {
        return new JAXBElement<Long>(_NextTrnIdent_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BusinessDt")
    public JAXBElement<String> createBusinessDt(String value) {
        return new JAXBElement<String>(_BusinessDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxLimitAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MaxLimitAmt")
    public JAXBElement<MaxLimitAmtType> createMaxLimitAmt(MaxLimitAmtType value) {
        return new JAXBElement<MaxLimitAmtType>(_MaxLimitAmt_QNAME, MaxLimitAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinLimitAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MinLimitAmt")
    public JAXBElement<MinLimitAmtType> createMinLimitAmt(MinLimitAmtType value) {
        return new JAXBElement<MinLimitAmtType>(_MinLimitAmt_QNAME, MinLimitAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Memo")
    public JAXBElement<String> createMemo(String value) {
        return new JAXBElement<String>(_Memo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Method")
    public JAXBElement<MethodType> createMethod(MethodType value) {
        return new JAXBElement<MethodType>(_Method_QNAME, MethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MicrReadIntegrity")
    public JAXBElement<String> createMicrReadIntegrity(String value) {
        return new JAXBElement<String>(_MicrReadIntegrity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MicrUnformatted")
    public JAXBElement<String> createMicrUnformatted(String value) {
        return new JAXBElement<String>(_MicrUnformatted_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MiddleName")
    public JAXBElement<String> createMiddleName(String value) {
        return new JAXBElement<String>(_MiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MilitaryRank")
    public JAXBElement<String> createMilitaryRank(String value) {
        return new JAXBElement<String>(_MilitaryRank_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinAmtDueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MinAmtDue")
    public JAXBElement<MinAmtDueType> createMinAmtDue(MinAmtDueType value) {
        return new JAXBElement<MinAmtDueType>(_MinAmtDue_QNAME, MinAmtDueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MinCurAmt")
    public JAXBElement<MinCurAmtType> createMinCurAmt(MinCurAmtType value) {
        return new JAXBElement<MinCurAmtType>(_MinCurAmt_QNAME, MinCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinPmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MinPmt")
    public JAXBElement<MinPmtType> createMinPmt(MinPmtType value) {
        return new JAXBElement<MinPmtType>(_MinPmt_QNAME, MinPmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MktgImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MktgImg")
    public JAXBElement<MktgImgType> createMktgImg(MktgImgType value) {
        return new JAXBElement<MktgImgType>(_MktgImg_QNAME, MktgImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MktgMaterialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MktgMaterial")
    public JAXBElement<MktgMaterialType> createMktgMaterial(MktgMaterialType value) {
        return new JAXBElement<MktgMaterialType>(_MktgMaterial_QNAME, MktgMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MktgText")
    public JAXBElement<String> createMktgText(String value) {
        return new JAXBElement<String>(_MktgText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MktgURL")
    public JAXBElement<String> createMktgURL(String value) {
        return new JAXBElement<String>(_MktgURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Month")
    public JAXBElement<Long> createMonth(Long value) {
        return new JAXBElement<Long>(_Month_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MotherMaidenName")
    public JAXBElement<String> createMotherMaidenName(String value) {
        return new JAXBElement<String>(_MotherMaidenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgAuthCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MsgAuthCode")
    public JAXBElement<MsgAuthCodeType> createMsgAuthCode(MsgAuthCodeType value) {
        return new JAXBElement<MsgAuthCodeType>(_MsgAuthCode_QNAME, MsgAuthCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MsgRecDt")
    public JAXBElement<XMLGregorianCalendar> createMsgRecDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MsgRecDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MsgType")
    public JAXBElement<String> createMsgType(String value) {
        return new JAXBElement<String>(_MsgType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NAICS")
    public JAXBElement<String> createNAICS(String value) {
        return new JAXBElement<String>(_NAICS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NamePrefix")
    public JAXBElement<String> createNamePrefix(String value) {
        return new JAXBElement<String>(_NamePrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NameSpace")
    public JAXBElement<String> createNameSpace(String value) {
        return new JAXBElement<String>(_NameSpace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NameSuffix")
    public JAXBElement<String> createNameSuffix(String value) {
        return new JAXBElement<String>(_NameSuffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Nationality")
    public JAXBElement<String> createNationality(String value) {
        return new JAXBElement<String>(_Nationality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NetworkOwner")
    public JAXBElement<String> createNetworkOwner(String value) {
        return new JAXBElement<String>(_NetworkOwner_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NetworkRefIdent")
    public JAXBElement<String> createNetworkRefIdent(String value) {
        return new JAXBElement<String>(_NetworkRefIdent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewForExRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NewForExRate")
    public JAXBElement<NewForExRateType> createNewForExRate(NewForExRateType value) {
        return new JAXBElement<NewForExRateType>(_NewForExRate_QNAME, NewForExRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NextDt")
    public JAXBElement<String> createNextDt(String value) {
        return new JAXBElement<String>(_NextDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NextIssueDt")
    public JAXBElement<String> createNextIssueDt(String value) {
        return new JAXBElement<String>(_NextIssueDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextPmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NextPmt")
    public JAXBElement<NextPmtType> createNextPmt(NextPmtType value) {
        return new JAXBElement<NextPmtType>(_NextPmt_QNAME, NextPmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Nickname")
    public JAXBElement<String> createNickname(String value) {
        return new JAXBElement<String>(_Nickname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NotifyReqd")
    public JAXBElement<Boolean> createNotifyReqd(Boolean value) {
        return new JAXBElement<Boolean>(_NotifyReqd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NumEmployees")
    public JAXBElement<Long> createNumEmployees(Long value) {
        return new JAXBElement<Long>(_NumEmployees_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NumSignatureReqd")
    public JAXBElement<Long> createNumSignatureReqd(Long value) {
        return new JAXBElement<Long>(_NumSignatureReqd_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Occurrences")
    public JAXBElement<Long> createOccurrences(Long value) {
        return new JAXBElement<Long>(_Occurrences_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OEDCode")
    public JAXBElement<String> createOEDCode(String value) {
        return new JAXBElement<String>(_OEDCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OEDInstitution")
    public JAXBElement<String> createOEDInstitution(String value) {
        return new JAXBElement<String>(_OEDInstitution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OEDRelationship")
    public JAXBElement<String> createOEDRelationship(String value) {
        return new JAXBElement<String>(_OEDRelationship_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Occupation")
    public JAXBElement<String> createOccupation(String value) {
        return new JAXBElement<String>(_Occupation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OccupationalStatus")
    public JAXBElement<String> createOccupationalStatus(String value) {
        return new JAXBElement<String>(_OccupationalStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OnError")
    public JAXBElement<OnErrorType> createOnError(OnErrorType value) {
        return new JAXBElement<OnErrorType>(new QName("urn:ifxforum-org:XSD:1", "OnError"), OnErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnWarningType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OnWarning")
    public JAXBElement<OnWarningType> createOnWarning(OnWarningType value) {
        return new JAXBElement<OnWarningType>(new QName("urn:ifxforum-org:XSD:1", "OnWarning"), OnWarningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OpenDt")
    public JAXBElement<XMLGregorianCalendar> createOpenDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "OpenDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRqUID")
    public JAXBElement<String> createOperRqUID(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OperRqUID"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRq")
    public JAXBElement<OperRqType> createOperRq(OperRqType value) {
        return new JAXBElement<OperRqType>(new QName("urn:ifxforum-org:XSD:1", "OperRq"), OperRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRs")
    public JAXBElement<OperRsType> createOperRs(OperRsType value) {
        return new JAXBElement<OperRsType>(new QName("urn:ifxforum-org:XSD:1", "OperRs"), OperRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperRulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRules")
    public JAXBElement<OperRulesType> createOperRules(OperRulesType value) {
        return new JAXBElement<OperRulesType>(new QName("urn:ifxforum-org:XSD:1", "OperRules"), OperRulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRqHdr")
    public JAXBElement<OperRqHdrType> createOperRqHdr(OperRqHdrType value) {
        return new JAXBElement<OperRqHdrType>(new QName("urn:ifxforum-org:XSD:1", "OperRqHdr"), OperRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OperRsHdr")
    public JAXBElement<OperRsHdrType> createOperRsHdr(OperRsHdrType value) {
        return new JAXBElement<OperRsHdrType>(new QName("urn:ifxforum-org:XSD:1", "OperRsHdr"), OperRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Org")
    public JAXBElement<String> createOrg(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Org"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgCatIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgCatIdent")
    public JAXBElement<OrgCatIdentType> createOrgCatIdent(OrgCatIdentType value) {
        return new JAXBElement<OrgCatIdentType>(new QName("urn:ifxforum-org:XSD:1", "OrgCatIdent"), OrgCatIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgCatIdentSource")
    public JAXBElement<String> createOrgCatIdentSource(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OrgCatIdentSource"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgCatIdentValue")
    public JAXBElement<String> createOrgCatIdentValue(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OrgCatIdentValue"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgCategory")
    public JAXBElement<OrgCategoryType> createOrgCategory(OrgCategoryType value) {
        return new JAXBElement<OrgCategoryType>(new QName("urn:ifxforum-org:XSD:1", "OrgCategory"), OrgCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgData")
    public JAXBElement<OrgDataType> createOrgData(OrgDataType value) {
        return new JAXBElement<OrgDataType>(new QName("urn:ifxforum-org:XSD:1", "OrgData"), OrgDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgEstablishDt")
    public JAXBElement<XMLGregorianCalendar> createOrgEstablishDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "OrgEstablishDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgIdent")
    public JAXBElement<OrgIdentType> createOrgIdent(OrgIdentType value) {
        return new JAXBElement<OrgIdentType>(new QName("urn:ifxforum-org:XSD:1", "OrgIdent"), OrgIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgName")
    public JAXBElement<OrgNameType> createOrgName(OrgNameType value) {
        return new JAXBElement<OrgNameType>(new QName("urn:ifxforum-org:XSD:1", "OrgName"), OrgNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrgPhone")
    public JAXBElement<String> createOrgPhone(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OrgPhone"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrigDt")
    public JAXBElement<XMLGregorianCalendar> createOrigDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "OrigDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OrigIssueDt")
    public JAXBElement<String> createOrigIssueDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OrigIssueDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OriginatingBank")
    public JAXBElement<String> createOriginatingBank(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OriginatingBank"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OriginatingBranch")
    public JAXBElement<String> createOriginatingBranch(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OriginatingBranch"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OriginationDt")
    public JAXBElement<XMLGregorianCalendar> createOriginationDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "OriginationDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OriginatorName")
    public JAXBElement<String> createOriginatorName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OriginatorName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OriginatorType")
    public JAXBElement<Long> createOriginatorType(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "OriginatorType"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OvrSigText")
    public JAXBElement<String> createOvrSigText(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "OvrSigText"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverdraftFundingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OverdraftFunding")
    public JAXBElement<OverdraftFundingType> createOverdraftFunding(OverdraftFundingType value) {
        return new JAXBElement<OverdraftFundingType>(new QName("urn:ifxforum-org:XSD:1", "OverdraftFunding"), OverdraftFundingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OwnerInd")
    public JAXBElement<Boolean> createOwnerInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "OwnerInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "OwnerPercent")
    public JAXBElement<BigDecimal> createOwnerPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "OwnerPercent"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageNumRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PageNumRange")
    public JAXBElement<PageNumRangeType> createPageNumRange(PageNumRangeType value) {
        return new JAXBElement<PageNumRangeType>(new QName("urn:ifxforum-org:XSD:1", "PageNumRange"), PageNumRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelDesc")
    public JAXBElement<String> createPartyAcctRelDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelEnvr")
    public JAXBElement<PartyAcctRelEnvrType> createPartyAcctRelEnvr(PartyAcctRelEnvrType value) {
        return new JAXBElement<PartyAcctRelEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelEnvr"), PartyAcctRelEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelId")
    public JAXBElement<String> createPartyAcctRelId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelRef")
    public JAXBElement<PartyAcctRelRefType> createPartyAcctRelRef(PartyAcctRelRefType value) {
        return new JAXBElement<PartyAcctRelRefType>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelRef"), PartyAcctRelRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelStatus")
    public JAXBElement<PartyAcctRelStatusType> createPartyAcctRelStatus(PartyAcctRelStatusType value) {
        return new JAXBElement<PartyAcctRelStatusType>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelStatus"), PartyAcctRelStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelStatusCode")
    public JAXBElement<String> createPartyAcctRelStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelStatusRec")
    public JAXBElement<PartyAcctRelStatusRecType> createPartyAcctRelStatusRec(PartyAcctRelStatusRecType value) {
        return new JAXBElement<PartyAcctRelStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelStatusRec"), PartyAcctRelStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelType")
    public JAXBElement<String> createPartyAcctRelType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelEnvr")
    public JAXBElement<PartyCardRelEnvrType> createPartyCardRelEnvr(PartyCardRelEnvrType value) {
        return new JAXBElement<PartyCardRelEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelEnvr"), PartyCardRelEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelId")
    public JAXBElement<String> createPartyCardRelId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelInfo")
    public JAXBElement<PartyCardRelInfoType> createPartyCardRelInfo(PartyCardRelInfoType value) {
        return new JAXBElement<PartyCardRelInfoType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelInfo"), PartyCardRelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelKeys")
    public JAXBElement<PartyCardRelKeysType> createPartyCardRelKeys(PartyCardRelKeysType value) {
        return new JAXBElement<PartyCardRelKeysType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelKeys"), PartyCardRelKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelRef")
    public JAXBElement<PartyCardRelRefType> createPartyCardRelRef(PartyCardRelRefType value) {
        return new JAXBElement<PartyCardRelRefType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelRef"), PartyCardRelRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelStatus")
    public JAXBElement<PartyCardRelStatusType> createPartyCardRelStatus(PartyCardRelStatusType value) {
        return new JAXBElement<PartyCardRelStatusType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelStatus"), PartyCardRelStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelStatusCode")
    public JAXBElement<String> createPartyCardRelStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelStatusRec")
    public JAXBElement<PartyCardRelStatusRecType> createPartyCardRelStatusRec(PartyCardRelStatusRecType value) {
        return new JAXBElement<PartyCardRelStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelStatusRec"), PartyCardRelStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelType")
    public JAXBElement<String> createPartyCardRelType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PINBlock")
    public JAXBElement<String> createPINBlock(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PINBlock"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSAgentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSAgent")
    public JAXBElement<POSAgentType> createPOSAgent(POSAgentType value) {
        return new JAXBElement<POSAgentType>(new QName("urn:ifxforum-org:XSD:1", "POSAgent"), POSAgentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSAttended")
    public JAXBElement<Boolean> createPOSAttended(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "POSAttended"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSCapabilities")
    public JAXBElement<POSCapabilitiesType> createPOSCapabilities(POSCapabilitiesType value) {
        return new JAXBElement<POSCapabilitiesType>(new QName("urn:ifxforum-org:XSD:1", "POSCapabilities"), POSCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSCaptureCapability")
    public JAXBElement<Boolean> createPOSCaptureCapability(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "POSCaptureCapability"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSEntryCapability")
    public JAXBElement<String> createPOSEntryCapability(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "POSEntryCapability"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSLocation")
    public JAXBElement<String> createPOSLocation(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "POSLocation"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSOperation")
    public JAXBElement<String> createPOSOperation(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "POSOperation"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSOutCapabilities")
    public JAXBElement<String> createPOSOutCapabilities(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "POSOutCapabilities"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSSecurityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSSecurity")
    public JAXBElement<POSSecurityType> createPOSSecurity(POSSecurityType value) {
        return new JAXBElement<POSSecurityType>(new QName("urn:ifxforum-org:XSD:1", "POSSecurity"), POSSecurityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "POSVerifyCapability")
    public JAXBElement<String> createPOSVerifyCapability(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "POSVerifyCapability"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PSSCATSecLevel")
    public JAXBElement<String> createPSSCATSecLevel(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PSSCATSecLevel"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PSSMsgEncryption")
    public JAXBElement<String> createPSSMsgEncryption(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PSSMsgEncryption"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PSSMsgMAC")
    public JAXBElement<String> createPSSMsgMAC(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PSSMsgMAC"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PSSNetworkType")
    public JAXBElement<String> createPSSNetworkType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PSSNetworkType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageCountLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PageCountLimit")
    public JAXBElement<PageCountLimitType> createPageCountLimit(PageCountLimitType value) {
        return new JAXBElement<PageCountLimitType>(new QName("urn:ifxforum-org:XSD:1", "PageCountLimit"), PageCountLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PageType")
    public JAXBElement<String> createPageType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PageType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PaidBy")
    public JAXBElement<PaidByType> createPaidBy(PaidByType value) {
        return new JAXBElement<PaidByType>(new QName("urn:ifxforum-org:XSD:1", "PaidBy"), PaidByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PaidDt")
    public JAXBElement<XMLGregorianCalendar> createPaidDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "PaidDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PaidCurAmt")
    public JAXBElement<PaidCurAmtType> createPaidCurAmt(PaidCurAmtType value) {
        return new JAXBElement<PaidCurAmtType>(new QName("urn:ifxforum-org:XSD:1", "PaidCurAmt"), PaidCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidDtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PaidDtRange")
    public JAXBElement<PaidDtRangeType> createPaidDtRange(PaidDtRangeType value) {
        return new JAXBElement<PaidDtRangeType>(new QName("urn:ifxforum-org:XSD:1", "PaidDtRange"), PaidDtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyEnvr")
    public JAXBElement<PartyEnvrType> createPartyEnvr(PartyEnvrType value) {
        return new JAXBElement<PartyEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PartyEnvr"), PartyEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyData")
    public JAXBElement<PartyDataType> createPartyData(PartyDataType value) {
        return new JAXBElement<PartyDataType>(new QName("urn:ifxforum-org:XSD:1", "PartyData"), PartyDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRef")
    public JAXBElement<PartyRefType> createPartyRef(PartyRefType value) {
        return new JAXBElement<PartyRefType>(new QName("urn:ifxforum-org:XSD:1", "PartyRef"), PartyRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyStatusRec")
    public JAXBElement<PartyStatusRecType> createPartyStatusRec(PartyStatusRecType value) {
        return new JAXBElement<PartyStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PartyStatusRec"), PartyStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyStatus")
    public JAXBElement<PartyStatusType> createPartyStatus(PartyStatusType value) {
        return new JAXBElement<PartyStatusType>(new QName("urn:ifxforum-org:XSD:1", "PartyStatus"), PartyStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyStatusCode")
    public JAXBElement<String> createPartyStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRelName")
    public JAXBElement<String> createPartyRelName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyRelName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRelRole")
    public JAXBElement<String> createPartyRelRole(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyRelRole"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRelType")
    public JAXBElement<String> createPartyRelType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyRelType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyRole")
    public JAXBElement<String> createPartyRole(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyRole"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelAuth")
    public JAXBElement<PartyPartyRelAuthType> createPartyPartyRelAuth(PartyPartyRelAuthType value) {
        return new JAXBElement<PartyPartyRelAuthType>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelAuth"), PartyPartyRelAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelEnvr")
    public JAXBElement<PartyPartyRelEnvrType> createPartyPartyRelEnvr(PartyPartyRelEnvrType value) {
        return new JAXBElement<PartyPartyRelEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelEnvr"), PartyPartyRelEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelId")
    public JAXBElement<String> createPartyPartyRelId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelRef")
    public JAXBElement<PartyPartyRelRefType> createPartyPartyRelRef(PartyPartyRelRefType value) {
        return new JAXBElement<PartyPartyRelRefType>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelRef"), PartyPartyRelRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelStatus")
    public JAXBElement<PartyPartyRelStatusType> createPartyPartyRelStatus(PartyPartyRelStatusType value) {
        return new JAXBElement<PartyPartyRelStatusType>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelStatus"), PartyPartyRelStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelStatusCode")
    public JAXBElement<String> createPartyPartyRelStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPartyRelStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyPartyRelStatusRec")
    public JAXBElement<PartyPartyRelStatusRecType> createPartyPartyRelStatusRec(PartyPartyRelStatusRecType value) {
        return new JAXBElement<PartyPartyRelStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PartyPartyRelStatusRec"), PartyPartyRelStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkFormat")
    public JAXBElement<String> createPassbkFormat(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PassbkFormat"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyId")
    public JAXBElement<String> createPartyId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PartyId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkEnvr")
    public JAXBElement<PassbkEnvrType> createPassbkEnvr(PassbkEnvrType value) {
        return new JAXBElement<PassbkEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PassbkEnvr"), PassbkEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkId")
    public JAXBElement<String> createPassbkId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PassbkId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkInfo")
    public JAXBElement<PassbkInfoType> createPassbkInfo(PassbkInfoType value) {
        return new JAXBElement<PassbkInfoType>(new QName("urn:ifxforum-org:XSD:1", "PassbkInfo"), PassbkInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkKeys")
    public JAXBElement<PassbkKeysType> createPassbkKeys(PassbkKeysType value) {
        return new JAXBElement<PassbkKeysType>(new QName("urn:ifxforum-org:XSD:1", "PassbkKeys"), PassbkKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkLastBalPrintedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkLastBalPrinted")
    public JAXBElement<PassbkLastBalPrintedType> createPassbkLastBalPrinted(PassbkLastBalPrintedType value) {
        return new JAXBElement<PassbkLastBalPrintedType>(new QName("urn:ifxforum-org:XSD:1", "PassbkLastBalPrinted"), PassbkLastBalPrintedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkLastItemPrinted")
    public JAXBElement<String> createPassbkLastItemPrinted(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PassbkLastItemPrinted"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkLinesPerPage")
    public JAXBElement<Long> createPassbkLinesPerPage(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PassbkLinesPerPage"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkNewItemsToPrint")
    public JAXBElement<Long> createPassbkNewItemsToPrint(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PassbkNewItemsToPrint"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkNextLine")
    public JAXBElement<Long> createPassbkNextLine(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PassbkNextLine"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkNextPage")
    public JAXBElement<Long> createPassbkNextPage(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PassbkNextPage"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkPagesPerBook")
    public JAXBElement<Long> createPassbkPagesPerBook(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PassbkPagesPerBook"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkRec")
    public JAXBElement<PassbkRecType> createPassbkRec(PassbkRecType value) {
        return new JAXBElement<PassbkRecType>(new QName("urn:ifxforum-org:XSD:1", "PassbkRec"), PassbkRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkRef")
    public JAXBElement<PassbkRefType> createPassbkRef(PassbkRefType value) {
        return new JAXBElement<PassbkRefType>(new QName("urn:ifxforum-org:XSD:1", "PassbkRef"), PassbkRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkSel")
    public JAXBElement<PassbkSelType> createPassbkSel(PassbkSelType value) {
        return new JAXBElement<PassbkSelType>(new QName("urn:ifxforum-org:XSD:1", "PassbkSel"), PassbkSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkStatus")
    public JAXBElement<PassbkStatusType> createPassbkStatus(PassbkStatusType value) {
        return new JAXBElement<PassbkStatusType>(new QName("urn:ifxforum-org:XSD:1", "PassbkStatus"), PassbkStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkStatusCode")
    public JAXBElement<PassbkStatusCodeType> createPassbkStatusCode(PassbkStatusCodeType value) {
        return new JAXBElement<PassbkStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PassbkStatusCode"), PassbkStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkStatusRec")
    public JAXBElement<PassbkStatusRecType> createPassbkStatusRec(PassbkStatusRecType value) {
        return new JAXBElement<PassbkStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PassbkStatusRec"), PassbkStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemDetail")
    public JAXBElement<PassbkItemDetailType> createPassbkItemDetail(PassbkItemDetailType value) {
        return new JAXBElement<PassbkItemDetailType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemDetail"), PassbkItemDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemEnvr")
    public JAXBElement<PassbkItemEnvrType> createPassbkItemEnvr(PassbkItemEnvrType value) {
        return new JAXBElement<PassbkItemEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemEnvr"), PassbkItemEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemId")
    public JAXBElement<String> createPassbkItemId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemInfo")
    public JAXBElement<PassbkItemInfoType> createPassbkItemInfo(PassbkItemInfoType value) {
        return new JAXBElement<PassbkItemInfoType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemInfo"), PassbkItemInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemKeys")
    public JAXBElement<PassbkItemKeysType> createPassbkItemKeys(PassbkItemKeysType value) {
        return new JAXBElement<PassbkItemKeysType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemKeys"), PassbkItemKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemRec")
    public JAXBElement<PassbkItemRecType> createPassbkItemRec(PassbkItemRecType value) {
        return new JAXBElement<PassbkItemRecType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemRec"), PassbkItemRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemRef")
    public JAXBElement<PassbkItemRefType> createPassbkItemRef(PassbkItemRefType value) {
        return new JAXBElement<PassbkItemRefType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemRef"), PassbkItemRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemSel")
    public JAXBElement<PassbkItemSelType> createPassbkItemSel(PassbkItemSelType value) {
        return new JAXBElement<PassbkItemSelType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemSel"), PassbkItemSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemStatus")
    public JAXBElement<PassbkItemStatusType> createPassbkItemStatus(PassbkItemStatusType value) {
        return new JAXBElement<PassbkItemStatusType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemStatus"), PassbkItemStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemStatusCode")
    public JAXBElement<PassbkItemStatusCodeType> createPassbkItemStatusCode(PassbkItemStatusCodeType value) {
        return new JAXBElement<PassbkItemStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemStatusCode"), PassbkItemStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassbkItemStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PassbkItemStatusRec")
    public JAXBElement<PassbkItemStatusRecType> createPassbkItemStatusRec(PassbkItemStatusRecType value) {
        return new JAXBElement<PassbkItemStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PassbkItemStatusRec"), PassbkItemStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PaternalName")
    public JAXBElement<String> createPaternalName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PaternalName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PayeeCountry")
    public JAXBElement<String> createPayeeCountry(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PayeeCountry"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PersonIdentType")
    public JAXBElement<String> createPersonIdentType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PersonIdentType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PersonIndicator")
    public JAXBElement<Boolean> createPersonIndicator(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PersonIndicator"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Phone"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PhoneType")
    public JAXBElement<String> createPhoneType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PhoneType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PhotoInd")
    public JAXBElement<Boolean> createPhotoInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PhotoInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnvr")
    public JAXBElement<PmtEnvrType> createPmtEnvr(PmtEnvrType value) {
        return new JAXBElement<PmtEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnvr"), PmtEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtFormat")
    public JAXBElement<String> createPmtFormat(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtFormat"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtId")
    public JAXBElement<String> createPmtId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInstType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtInst")
    public JAXBElement<PmtInstType> createPmtInst(PmtInstType value) {
        return new JAXBElement<PmtInstType>(new QName("urn:ifxforum-org:XSD:1", "PmtInst"), PmtInstType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInstTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtInstType")
    public JAXBElement<PmtInstTypeType> createPmtInstType(PmtInstTypeType value) {
        return new JAXBElement<PmtInstTypeType>(new QName("urn:ifxforum-org:XSD:1", "PmtInstType"), PmtInstTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtLegalRptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtLegalRpt")
    public JAXBElement<PmtLegalRptType> createPmtLegalRpt(PmtLegalRptType value) {
        return new JAXBElement<PmtLegalRptType>(new QName("urn:ifxforum-org:XSD:1", "PmtLegalRpt"), PmtLegalRptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtLegalRptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtLegalRptData")
    public JAXBElement<PmtLegalRptDataType> createPmtLegalRptData(PmtLegalRptDataType value) {
        return new JAXBElement<PmtLegalRptDataType>(new QName("urn:ifxforum-org:XSD:1", "PmtLegalRptData"), PmtLegalRptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtRef")
    public JAXBElement<PmtRefType> createPmtRef(PmtRefType value) {
        return new JAXBElement<PmtRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtRef"), PmtRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtRefIdent")
    public JAXBElement<String> createPmtRefIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtRefIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtRemitRefIdent")
    public JAXBElement<String> createPmtRemitRefIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtRemitRefIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtSel")
    public JAXBElement<PmtSelType> createPmtSel(PmtSelType value) {
        return new JAXBElement<PmtSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtSel"), PmtSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatus")
    public JAXBElement<PmtStatusType> createPmtStatus(PmtStatusType value) {
        return new JAXBElement<PmtStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatus"), PmtStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatusCode")
    public JAXBElement<String> createPmtStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatStatusCode")
    public JAXBElement<PmtStatStatusCodeType> createPmtStatStatusCode(PmtStatStatusCodeType value) {
        return new JAXBElement<PmtStatStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatStatusCode"), PmtStatStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatusRec")
    public JAXBElement<PmtStatusRecType> createPmtStatusRec(PmtStatusRecType value) {
        return new JAXBElement<PmtStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatusRec"), PmtStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtSummAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtSummAmt")
    public JAXBElement<PmtSummAmtType> createPmtSummAmt(PmtSummAmtType value) {
        return new JAXBElement<PmtSummAmtType>(new QName("urn:ifxforum-org:XSD:1", "PmtSummAmt"), PmtSummAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthEnvr")
    public JAXBElement<PmtAthEnvrType> createPmtAthEnvr(PmtAthEnvrType value) {
        return new JAXBElement<PmtAthEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthEnvr"), PmtAthEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthId")
    public JAXBElement<String> createPmtAthId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtAthId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthInfo")
    public JAXBElement<PmtAthInfoType> createPmtAthInfo(PmtAthInfoType value) {
        return new JAXBElement<PmtAthInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthInfo"), PmtAthInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthKeys")
    public JAXBElement<PmtAthKeysType> createPmtAthKeys(PmtAthKeysType value) {
        return new JAXBElement<PmtAthKeysType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthKeys"), PmtAthKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthRec")
    public JAXBElement<PmtAthRecType> createPmtAthRec(PmtAthRecType value) {
        return new JAXBElement<PmtAthRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthRec"), PmtAthRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthRef")
    public JAXBElement<PmtAthRefType> createPmtAthRef(PmtAthRefType value) {
        return new JAXBElement<PmtAthRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthRef"), PmtAthRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthSel")
    public JAXBElement<PmtAthSelType> createPmtAthSel(PmtAthSelType value) {
        return new JAXBElement<PmtAthSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthSel"), PmtAthSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthStatus")
    public JAXBElement<PmtAthStatusType> createPmtAthStatus(PmtAthStatusType value) {
        return new JAXBElement<PmtAthStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthStatus"), PmtAthStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthStatusCode")
    public JAXBElement<String> createPmtAthStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtAthStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtAthStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtAthStatusRec")
    public JAXBElement<PmtAthStatusRecType> createPmtAthStatusRec(PmtAthStatusRecType value) {
        return new JAXBElement<PmtAthStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtAthStatusRec"), PmtAthStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchEnvr")
    public JAXBElement<PmtBatchEnvrType> createPmtBatchEnvr(PmtBatchEnvrType value) {
        return new JAXBElement<PmtBatchEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchEnvr"), PmtBatchEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchId")
    public JAXBElement<String> createPmtBatchId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchInfo")
    public JAXBElement<PmtBatchInfoType> createPmtBatchInfo(PmtBatchInfoType value) {
        return new JAXBElement<PmtBatchInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchInfo"), PmtBatchInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchKeys")
    public JAXBElement<PmtBatchKeysType> createPmtBatchKeys(PmtBatchKeysType value) {
        return new JAXBElement<PmtBatchKeysType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchKeys"), PmtBatchKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchRec")
    public JAXBElement<PmtBatchRecType> createPmtBatchRec(PmtBatchRecType value) {
        return new JAXBElement<PmtBatchRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchRec"), PmtBatchRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchRef")
    public JAXBElement<PmtBatchRefType> createPmtBatchRef(PmtBatchRefType value) {
        return new JAXBElement<PmtBatchRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchRef"), PmtBatchRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchSel")
    public JAXBElement<PmtBatchSelType> createPmtBatchSel(PmtBatchSelType value) {
        return new JAXBElement<PmtBatchSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchSel"), PmtBatchSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatus")
    public JAXBElement<PmtBatchStatusType> createPmtBatchStatus(PmtBatchStatusType value) {
        return new JAXBElement<PmtBatchStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatus"), PmtBatchStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatusCode")
    public JAXBElement<PmtBatchStatusCodeType> createPmtBatchStatusCode(PmtBatchStatusCodeType value) {
        return new JAXBElement<PmtBatchStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatusCode"), PmtBatchStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatusRec")
    public JAXBElement<PmtBatchStatusRecType> createPmtBatchStatusRec(PmtBatchStatusRecType value) {
        return new JAXBElement<PmtBatchStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatusRec"), PmtBatchStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatStatusCode")
    public JAXBElement<PmtBatchStatStatusCodeType> createPmtBatchStatStatusCode(PmtBatchStatStatusCodeType value) {
        return new JAXBElement<PmtBatchStatStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatStatusCode"), PmtBatchStatStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatEnvr")
    public JAXBElement<PmtBatchStatEnvrType> createPmtBatchStatEnvr(PmtBatchStatEnvrType value) {
        return new JAXBElement<PmtBatchStatEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatEnvr"), PmtBatchStatEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatId")
    public JAXBElement<String> createPmtBatchStatId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatInfo")
    public JAXBElement<PmtBatchStatInfoType> createPmtBatchStatInfo(PmtBatchStatInfoType value) {
        return new JAXBElement<PmtBatchStatInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatInfo"), PmtBatchStatInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatKeys")
    public JAXBElement<PmtBatchStatKeysType> createPmtBatchStatKeys(PmtBatchStatKeysType value) {
        return new JAXBElement<PmtBatchStatKeysType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatKeys"), PmtBatchStatKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatRec")
    public JAXBElement<PmtBatchStatRecType> createPmtBatchStatRec(PmtBatchStatRecType value) {
        return new JAXBElement<PmtBatchStatRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatRec"), PmtBatchStatRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatRef")
    public JAXBElement<PmtBatchStatRefType> createPmtBatchStatRef(PmtBatchStatRefType value) {
        return new JAXBElement<PmtBatchStatRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatRef"), PmtBatchStatRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatSel")
    public JAXBElement<PmtBatchStatSelType> createPmtBatchStatSel(PmtBatchStatSelType value) {
        return new JAXBElement<PmtBatchStatSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatSel"), PmtBatchStatSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatStatus")
    public JAXBElement<PmtBatchStatStatusType> createPmtBatchStatStatus(PmtBatchStatStatusType value) {
        return new JAXBElement<PmtBatchStatStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatStatus"), PmtBatchStatStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchStatStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtBatchStatStatusRec")
    public JAXBElement<PmtBatchStatStatusRecType> createPmtBatchStatStatusRec(PmtBatchStatStatusRecType value) {
        return new JAXBElement<PmtBatchStatStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtBatchStatStatusRec"), PmtBatchStatStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclEnvr")
    public JAXBElement<PmtEnclEnvrType> createPmtEnclEnvr(PmtEnclEnvrType value) {
        return new JAXBElement<PmtEnclEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclEnvr"), PmtEnclEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclId")
    public JAXBElement<String> createPmtEnclId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclInfo")
    public JAXBElement<PmtEnclInfoType> createPmtEnclInfo(PmtEnclInfoType value) {
        return new JAXBElement<PmtEnclInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclInfo"), PmtEnclInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclKeys")
    public JAXBElement<PmtEnclKeysType> createPmtEnclKeys(PmtEnclKeysType value) {
        return new JAXBElement<PmtEnclKeysType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclKeys"), PmtEnclKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclPayeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclPayee")
    public JAXBElement<PmtEnclPayeeType> createPmtEnclPayee(PmtEnclPayeeType value) {
        return new JAXBElement<PmtEnclPayeeType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclPayee"), PmtEnclPayeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclPayeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclPayeeInfo")
    public JAXBElement<PmtEnclPayeeInfoType> createPmtEnclPayeeInfo(PmtEnclPayeeInfoType value) {
        return new JAXBElement<PmtEnclPayeeInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclPayeeInfo"), PmtEnclPayeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclRec")
    public JAXBElement<PmtEnclRecType> createPmtEnclRec(PmtEnclRecType value) {
        return new JAXBElement<PmtEnclRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclRec"), PmtEnclRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclRef")
    public JAXBElement<PmtEnclRefType> createPmtEnclRef(PmtEnclRefType value) {
        return new JAXBElement<PmtEnclRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclRef"), PmtEnclRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclSel")
    public JAXBElement<PmtEnclSelType> createPmtEnclSel(PmtEnclSelType value) {
        return new JAXBElement<PmtEnclSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclSel"), PmtEnclSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclStatus")
    public JAXBElement<PmtEnclStatusType> createPmtEnclStatus(PmtEnclStatusType value) {
        return new JAXBElement<PmtEnclStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclStatus"), PmtEnclStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclStatusCode")
    public JAXBElement<PmtEnclStatusCodeType> createPmtEnclStatusCode(PmtEnclStatusCodeType value) {
        return new JAXBElement<PmtEnclStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclStatusCode"), PmtEnclStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtEnclStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclStatusRec")
    public JAXBElement<PmtEnclStatusRecType> createPmtEnclStatusRec(PmtEnclStatusRecType value) {
        return new JAXBElement<PmtEnclStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclStatusRec"), PmtEnclStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtEnclType")
    public JAXBElement<String> createPmtEnclType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtEnclType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatEnvr")
    public JAXBElement<PmtStatEnvrType> createPmtStatEnvr(PmtStatEnvrType value) {
        return new JAXBElement<PmtStatEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatEnvr"), PmtStatEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatId")
    public JAXBElement<String> createPmtStatId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PmtStatId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatInfo")
    public JAXBElement<PmtStatInfoType> createPmtStatInfo(PmtStatInfoType value) {
        return new JAXBElement<PmtStatInfoType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatInfo"), PmtStatInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatKeys")
    public JAXBElement<PmtStatKeysType> createPmtStatKeys(PmtStatKeysType value) {
        return new JAXBElement<PmtStatKeysType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatKeys"), PmtStatKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatRec")
    public JAXBElement<PmtStatRecType> createPmtStatRec(PmtStatRecType value) {
        return new JAXBElement<PmtStatRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatRec"), PmtStatRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatRef")
    public JAXBElement<PmtStatRefType> createPmtStatRef(PmtStatRefType value) {
        return new JAXBElement<PmtStatRefType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatRef"), PmtStatRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatSel")
    public JAXBElement<PmtStatSelType> createPmtStatSel(PmtStatSelType value) {
        return new JAXBElement<PmtStatSelType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatSel"), PmtStatSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatStatus")
    public JAXBElement<PmtStatStatusType> createPmtStatStatus(PmtStatStatusType value) {
        return new JAXBElement<PmtStatStatusType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatStatus"), PmtStatStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PmtStatStatusRec")
    public JAXBElement<PmtStatStatusRecType> createPmtStatStatusRec(PmtStatStatusRecType value) {
        return new JAXBElement<PmtStatStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PmtStatStatusRec"), PmtStatStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfServiceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PointOfServiceData")
    public JAXBElement<PointOfServiceDataType> createPointOfServiceData(PointOfServiceDataType value) {
        return new JAXBElement<PointOfServiceDataType>(new QName("urn:ifxforum-org:XSD:1", "PointOfServiceData"), PointOfServiceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PostalCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostedDt")
    public JAXBElement<XMLGregorianCalendar> createPostedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "PostedDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionEnvr")
    public JAXBElement<PostingSessionEnvrType> createPostingSessionEnvr(PostingSessionEnvrType value) {
        return new JAXBElement<PostingSessionEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionEnvr"), PostingSessionEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionId")
    public JAXBElement<String> createPostingSessionId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionInfo")
    public JAXBElement<PostingSessionInfoType> createPostingSessionInfo(PostingSessionInfoType value) {
        return new JAXBElement<PostingSessionInfoType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionInfo"), PostingSessionInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionKeys")
    public JAXBElement<PostingSessionKeysType> createPostingSessionKeys(PostingSessionKeysType value) {
        return new JAXBElement<PostingSessionKeysType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionKeys"), PostingSessionKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionRec")
    public JAXBElement<PostingSessionRecType> createPostingSessionRec(PostingSessionRecType value) {
        return new JAXBElement<PostingSessionRecType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionRec"), PostingSessionRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionRef")
    public JAXBElement<PostingSessionRefType> createPostingSessionRef(PostingSessionRefType value) {
        return new JAXBElement<PostingSessionRefType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionRef"), PostingSessionRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionSel")
    public JAXBElement<PostingSessionSelType> createPostingSessionSel(PostingSessionSelType value) {
        return new JAXBElement<PostingSessionSelType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionSel"), PostingSessionSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionStatus")
    public JAXBElement<PostingSessionStatusType> createPostingSessionStatus(PostingSessionStatusType value) {
        return new JAXBElement<PostingSessionStatusType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionStatus"), PostingSessionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionStatusCode")
    public JAXBElement<String> createPostingSessionStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingSessionStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PostingSessionStatusRec")
    public JAXBElement<PostingSessionStatusRecType> createPostingSessionStatusRec(PostingSessionStatusRecType value) {
        return new JAXBElement<PostingSessionStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PostingSessionStatusRec"), PostingSessionStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PhysicalLocIdent")
    public JAXBElement<String> createPhysicalLocIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PhysicalLocIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PhysicalLocName")
    public JAXBElement<String> createPhysicalLocName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PhysicalLocName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsAction")
    public JAXBElement<BigDecimal> createPlatformXfsAction(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsAction"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsAppId")
    public JAXBElement<String> createPlatformXfsAppId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsAppId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsCmdCode")
    public JAXBElement<BigDecimal> createPlatformXfsCmdCode(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsCmdCode"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsCmdHResult")
    public JAXBElement<Long> createPlatformXfsCmdHResult(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsCmdHResult"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsDesc")
    public JAXBElement<String> createPlatformXfsDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsEventId")
    public JAXBElement<BigDecimal> createPlatformXfsEventId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsEventId"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsLogicalName")
    public JAXBElement<String> createPlatformXfsLogicalName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsLogicalName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsPhysicalName")
    public JAXBElement<String> createPlatformXfsPhysicalName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsPhysicalName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsRequestId")
    public JAXBElement<BigDecimal> createPlatformXfsRequestId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsRequestId"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsState")
    public JAXBElement<BigDecimal> createPlatformXfsState(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsState"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsTimestamp")
    public JAXBElement<String> createPlatformXfsTimestamp(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsTimestamp"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PlatformXfsWkstName")
    public JAXBElement<String> createPlatformXfsWkstName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PlatformXfsWkstName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrcDt")
    public JAXBElement<XMLGregorianCalendar> createPrcDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "PrcDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcDtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrcDtRange")
    public JAXBElement<PrcDtRangeType> createPrcDtRange(PrcDtRangeType value) {
        return new JAXBElement<PrcDtRangeType>(new QName("urn:ifxforum-org:XSD:1", "PrcDtRange"), PrcDtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PreferredBank")
    public JAXBElement<String> createPreferredBank(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PreferredBank"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PreferredBranch")
    public JAXBElement<String> createPreferredBranch(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PreferredBranch"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PreferredInd")
    public JAXBElement<Boolean> createPreferredInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PreferredInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PreferredName")
    public JAXBElement<String> createPreferredName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PreferredName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrenoteReqd")
    public JAXBElement<Boolean> createPrenoteReqd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PrenoteReqd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrefetchURL")
    public JAXBElement<String> createPrefetchURL(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PrefetchURL"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepayPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrepayPenalty")
    public JAXBElement<PrepayPenaltyType> createPrepayPenalty(PrepayPenaltyType value) {
        return new JAXBElement<PrepayPenaltyType>(new QName("urn:ifxforum-org:XSD:1", "PrepayPenalty"), PrepayPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrePaidPurchItemDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrePaidPurchItemDetail")
    public JAXBElement<PrePaidPurchItemDetailType> createPrePaidPurchItemDetail(PrePaidPurchItemDetailType value) {
        return new JAXBElement<PrePaidPurchItemDetailType>(new QName("urn:ifxforum-org:XSD:1", "PrePaidPurchItemDetail"), PrePaidPurchItemDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrePaidUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrePaidUnits")
    public JAXBElement<PrePaidUnitsType> createPrePaidUnits(PrePaidUnitsType value) {
        return new JAXBElement<PrePaidUnitsType>(new QName("urn:ifxforum-org:XSD:1", "PrePaidUnits"), PrePaidUnitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrePaidValue")
    public JAXBElement<BigDecimal> createPrePaidValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "PrePaidValue"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PresAcctId")
    public JAXBElement<PresAcctIdType> createPresAcctId(PresAcctIdType value) {
        return new JAXBElement<PresAcctIdType>(new QName("urn:ifxforum-org:XSD:1", "PresAcctId"), PresAcctIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrintReceipt")
    public JAXBElement<Boolean> createPrintReceipt(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PrintReceipt"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PriorNameInd")
    public JAXBElement<Boolean> createPriorNameInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PriorNameInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PrimaryAcctInd")
    public JAXBElement<Boolean> createPrimaryAcctInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "PrimaryAcctInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ProcessConcurrent")
    public JAXBElement<Boolean> createProcessConcurrent(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "ProcessConcurrent"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ProcessControl")
    public JAXBElement<String> createProcessControl(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ProcessControl"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ProductIdent")
    public JAXBElement<String> createProductIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ProductIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyClientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ProxyClient")
    public JAXBElement<ProxyClientType> createProxyClient(ProxyClientType value) {
        return new JAXBElement<ProxyClientType>(new QName("urn:ifxforum-org:XSD:1", "ProxyClient"), ProxyClientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Pswd")
    public JAXBElement<String> createPswd(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Pswd"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemDesc")
    public JAXBElement<String> createPurchItemDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PurchItemDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemDetail")
    public JAXBElement<PurchItemDetailType> createPurchItemDetail(PurchItemDetailType value) {
        return new JAXBElement<PurchItemDetailType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemDetail"), PurchItemDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemEnvr")
    public JAXBElement<PurchItemEnvrType> createPurchItemEnvr(PurchItemEnvrType value) {
        return new JAXBElement<PurchItemEnvrType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemEnvr"), PurchItemEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemId")
    public JAXBElement<String> createPurchItemId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PurchItemId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemInfo")
    public JAXBElement<PurchItemInfoType> createPurchItemInfo(PurchItemInfoType value) {
        return new JAXBElement<PurchItemInfoType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemInfo"), PurchItemInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemKeys")
    public JAXBElement<PurchItemKeysType> createPurchItemKeys(PurchItemKeysType value) {
        return new JAXBElement<PurchItemKeysType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemKeys"), PurchItemKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemRec")
    public JAXBElement<PurchItemRecType> createPurchItemRec(PurchItemRecType value) {
        return new JAXBElement<PurchItemRecType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemRec"), PurchItemRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemRef")
    public JAXBElement<PurchItemRefType> createPurchItemRef(PurchItemRefType value) {
        return new JAXBElement<PurchItemRefType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemRef"), PurchItemRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemSel")
    public JAXBElement<PurchItemSelType> createPurchItemSel(PurchItemSelType value) {
        return new JAXBElement<PurchItemSelType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemSel"), PurchItemSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemStatus")
    public JAXBElement<PurchItemStatusType> createPurchItemStatus(PurchItemStatusType value) {
        return new JAXBElement<PurchItemStatusType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemStatus"), PurchItemStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemStatusCode")
    public JAXBElement<String> createPurchItemStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PurchItemStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchItemStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurchItemStatusRec")
    public JAXBElement<PurchItemStatusRecType> createPurchItemStatusRec(PurchItemStatusRecType value) {
        return new JAXBElement<PurchItemStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "PurchItemStatusRec"), PurchItemStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PurposeDesc")
    public JAXBElement<String> createPurposeDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PurposeDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "QuerySelect")
    public JAXBElement<String> createQuerySelect(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "QuerySelect"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Rate")
    public JAXBElement<BigDecimal> createRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "Rate"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdEnvr")
    public JAXBElement<RecChkOrdEnvrType> createRecChkOrdEnvr(RecChkOrdEnvrType value) {
        return new JAXBElement<RecChkOrdEnvrType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdEnvr"), RecChkOrdEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdId")
    public JAXBElement<String> createRecChkOrdId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdInfo")
    public JAXBElement<RecChkOrdInfoType> createRecChkOrdInfo(RecChkOrdInfoType value) {
        return new JAXBElement<RecChkOrdInfoType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdInfo"), RecChkOrdInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdKeys")
    public JAXBElement<RecChkOrdKeysType> createRecChkOrdKeys(RecChkOrdKeysType value) {
        return new JAXBElement<RecChkOrdKeysType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdKeys"), RecChkOrdKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdRec")
    public JAXBElement<RecChkOrdRecType> createRecChkOrdRec(RecChkOrdRecType value) {
        return new JAXBElement<RecChkOrdRecType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdRec"), RecChkOrdRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdRef")
    public JAXBElement<RecChkOrdRefType> createRecChkOrdRef(RecChkOrdRefType value) {
        return new JAXBElement<RecChkOrdRefType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdRef"), RecChkOrdRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdSel")
    public JAXBElement<RecChkOrdSelType> createRecChkOrdSel(RecChkOrdSelType value) {
        return new JAXBElement<RecChkOrdSelType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdSel"), RecChkOrdSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdStatus")
    public JAXBElement<RecChkOrdStatusType> createRecChkOrdStatus(RecChkOrdStatusType value) {
        return new JAXBElement<RecChkOrdStatusType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdStatus"), RecChkOrdStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdStatusCode")
    public JAXBElement<RecChkOrdStatusCodeType> createRecChkOrdStatusCode(RecChkOrdStatusCodeType value) {
        return new JAXBElement<RecChkOrdStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdStatusCode"), RecChkOrdStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecChkOrdStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecChkOrdStatusRec")
    public JAXBElement<RecChkOrdStatusRecType> createRecChkOrdStatusRec(RecChkOrdStatusRecType value) {
        return new JAXBElement<RecChkOrdStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "RecChkOrdStatusRec"), RecChkOrdStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecCountLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecCountLimit")
    public JAXBElement<RecCountLimitType> createRecCountLimit(RecCountLimitType value) {
        return new JAXBElement<RecCountLimitType>(new QName("urn:ifxforum-org:XSD:1", "RecCountLimit"), RecCountLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordCountLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecordCountLimit")
    public JAXBElement<RecordCountLimitType> createRecordCountLimit(RecordCountLimitType value) {
        return new JAXBElement<RecordCountLimitType>(new QName("urn:ifxforum-org:XSD:1", "RecordCountLimit"), RecordCountLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecCtrlInType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecCtrlIn")
    public JAXBElement<RecCtrlInType> createRecCtrlIn(RecCtrlInType value) {
        return new JAXBElement<RecCtrlInType>(new QName("urn:ifxforum-org:XSD:1", "RecCtrlIn"), RecCtrlInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecCtrlOutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecCtrlOut")
    public JAXBElement<RecCtrlOutType> createRecCtrlOut(RecCtrlOutType value) {
        return new JAXBElement<RecCtrlOutType>(new QName("urn:ifxforum-org:XSD:1", "RecCtrlOut"), RecCtrlOutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ReceivingMethod")
    public JAXBElement<String> createReceivingMethod(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ReceivingMethod"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecievingMethod")
    public JAXBElement<String> createRecievingMethod(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecievingMethod"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtEnvr")
    public JAXBElement<RecPmtEnvrType> createRecPmtEnvr(RecPmtEnvrType value) {
        return new JAXBElement<RecPmtEnvrType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtEnvr"), RecPmtEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtId")
    public JAXBElement<String> createRecPmtId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecPmtId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtInfo")
    public JAXBElement<RecPmtInfoType> createRecPmtInfo(RecPmtInfoType value) {
        return new JAXBElement<RecPmtInfoType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtInfo"), RecPmtInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtKeys")
    public JAXBElement<RecPmtKeysType> createRecPmtKeys(RecPmtKeysType value) {
        return new JAXBElement<RecPmtKeysType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtKeys"), RecPmtKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtRec")
    public JAXBElement<RecPmtRecType> createRecPmtRec(RecPmtRecType value) {
        return new JAXBElement<RecPmtRecType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtRec"), RecPmtRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtRef")
    public JAXBElement<RecPmtRefType> createRecPmtRef(RecPmtRefType value) {
        return new JAXBElement<RecPmtRefType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtRef"), RecPmtRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtSel")
    public JAXBElement<RecPmtSelType> createRecPmtSel(RecPmtSelType value) {
        return new JAXBElement<RecPmtSelType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtSel"), RecPmtSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtStatus")
    public JAXBElement<RecPmtStatusType> createRecPmtStatus(RecPmtStatusType value) {
        return new JAXBElement<RecPmtStatusType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtStatus"), RecPmtStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtStatusCode")
    public JAXBElement<RecPmtStatusCodeType> createRecPmtStatusCode(RecPmtStatusCodeType value) {
        return new JAXBElement<RecPmtStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtStatusCode"), RecPmtStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecPmtStatusRec")
    public JAXBElement<RecPmtStatusRecType> createRecPmtStatusRec(RecPmtStatusRecType value) {
        return new JAXBElement<RecPmtStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "RecPmtStatusRec"), RecPmtStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecSelect")
    public JAXBElement<String> createRecSelect(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecSelect"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferEnvr")
    public JAXBElement<RecXferEnvrType> createRecXferEnvr(RecXferEnvrType value) {
        return new JAXBElement<RecXferEnvrType>(new QName("urn:ifxforum-org:XSD:1", "RecXferEnvr"), RecXferEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferId")
    public JAXBElement<String> createRecXferId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecXferId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferRef")
    public JAXBElement<RecXferRefType> createRecXferRef(RecXferRefType value) {
        return new JAXBElement<RecXferRefType>(new QName("urn:ifxforum-org:XSD:1", "RecXferRef"), RecXferRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferStatus")
    public JAXBElement<RecXferStatusType> createRecXferStatus(RecXferStatusType value) {
        return new JAXBElement<RecXferStatusType>(new QName("urn:ifxforum-org:XSD:1", "RecXferStatus"), RecXferStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferStatusCode")
    public JAXBElement<String> createRecXferStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecXferStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecXferStatusRec")
    public JAXBElement<RecXferStatusRecType> createRecXferStatusRec(RecXferStatusRecType value) {
        return new JAXBElement<RecXferStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "RecXferStatusRec"), RecXferStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurEndDate")
    public JAXBElement<XMLGregorianCalendar> createRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "RecurEndDate"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurInstance")
    public JAXBElement<Long> createRecurInstance(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "RecurInstance"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurInterval")
    public JAXBElement<Long> createRecurInterval(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "RecurInterval"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurStartDate")
    public JAXBElement<XMLGregorianCalendar> createRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "RecurStartDate"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurrenceType")
    public JAXBElement<String> createRecurrenceType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RecurrenceType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RefData")
    public JAXBElement<RefDataType> createRefData(RefDataType value) {
        return new JAXBElement<RefDataType>(new QName("urn:ifxforum-org:XSD:1", "RefData"), RefDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RefDesc")
    public JAXBElement<String> createRefDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RefDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RefIdent")
    public JAXBElement<String> createRefIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RefIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RefType")
    public JAXBElement<String> createRefType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RefType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegPmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RegPmt")
    public JAXBElement<RegPmtType> createRegPmt(RegPmtType value) {
        return new JAXBElement<RegPmtType>(new QName("urn:ifxforum-org:XSD:1", "RegPmt"), RegPmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelatedCreditRef")
    public JAXBElement<String> createRelatedCreditRef(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RelatedCreditRef"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedForExDealRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelatedForExDealRef")
    public JAXBElement<RelatedForExDealRefType> createRelatedForExDealRef(RelatedForExDealRefType value) {
        return new JAXBElement<RelatedForExDealRefType>(new QName("urn:ifxforum-org:XSD:1", "RelatedForExDealRef"), RelatedForExDealRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelEstablishDt")
    public JAXBElement<String> createRelEstablishDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RelEstablishDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelPartyKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelPartyKeys")
    public JAXBElement<RelPartyKeysType> createRelPartyKeys(RelPartyKeysType value) {
        return new JAXBElement<RelPartyKeysType>(new QName("urn:ifxforum-org:XSD:1", "RelPartyKeys"), RelPartyKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelPartyRole")
    public JAXBElement<String> createRelPartyRole(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RelPartyRole"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RegistrationAuthority")
    public JAXBElement<String> createRegistrationAuthority(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RegistrationAuthority"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RegistrationNumber")
    public JAXBElement<String> createRegistrationNumber(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RegistrationNumber"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RelationshipMgr")
    public JAXBElement<String> createRelationshipMgr(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RelationshipMgr"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemainRecCount")
    public JAXBElement<Long> createRemainRecCount(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "RemainRecCount"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemainingPmtCount")
    public JAXBElement<Long> createRemainingPmtCount(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "RemainingPmtCount"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitAddr")
    public JAXBElement<RemitAddrType> createRemitAddr(RemitAddrType value) {
        return new JAXBElement<RemitAddrType>(new QName("urn:ifxforum-org:XSD:1", "RemitAddr"), RemitAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitDetail")
    public JAXBElement<RemitDetailType> createRemitDetail(RemitDetailType value) {
        return new JAXBElement<RemitDetailType>(new QName("urn:ifxforum-org:XSD:1", "RemitDetail"), RemitDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitEnvr")
    public JAXBElement<RemitEnvrType> createRemitEnvr(RemitEnvrType value) {
        return new JAXBElement<RemitEnvrType>(new QName("urn:ifxforum-org:XSD:1", "RemitEnvr"), RemitEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitId")
    public JAXBElement<String> createRemitId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RemitId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitInfo")
    public JAXBElement<RemitInfoType> createRemitInfo(RemitInfoType value) {
        return new JAXBElement<RemitInfoType>(new QName("urn:ifxforum-org:XSD:1", "RemitInfo"), RemitInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitAdviceRefId")
    public JAXBElement<String> createRemitAdviceRefId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RemitAdviceRefId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitInstruction")
    public JAXBElement<RemitInstructionType> createRemitInstruction(RemitInstructionType value) {
        return new JAXBElement<RemitInstructionType>(new QName("urn:ifxforum-org:XSD:1", "RemitInstruction"), RemitInstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitKeys")
    public JAXBElement<RemitKeysType> createRemitKeys(RemitKeysType value) {
        return new JAXBElement<RemitKeysType>(new QName("urn:ifxforum-org:XSD:1", "RemitKeys"), RemitKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitName")
    public JAXBElement<String> createRemitName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RemitName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitRec")
    public JAXBElement<RemitRecType> createRemitRec(RemitRecType value) {
        return new JAXBElement<RemitRecType>(new QName("urn:ifxforum-org:XSD:1", "RemitRec"), RemitRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitRef")
    public JAXBElement<RemitRefType> createRemitRef(RemitRefType value) {
        return new JAXBElement<RemitRefType>(new QName("urn:ifxforum-org:XSD:1", "RemitRef"), RemitRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitRefIdent")
    public JAXBElement<String> createRemitRefIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RemitRefIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitSel")
    public JAXBElement<RemitSelType> createRemitSel(RemitSelType value) {
        return new JAXBElement<RemitSelType>(new QName("urn:ifxforum-org:XSD:1", "RemitSel"), RemitSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitStatus")
    public JAXBElement<RemitStatusType> createRemitStatus(RemitStatusType value) {
        return new JAXBElement<RemitStatusType>(new QName("urn:ifxforum-org:XSD:1", "RemitStatus"), RemitStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitStatusCode")
    public JAXBElement<RemitStatusCodeType> createRemitStatusCode(RemitStatusCodeType value) {
        return new JAXBElement<RemitStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "RemitStatusCode"), RemitStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemitStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RemitStatusRec")
    public JAXBElement<RemitStatusRecType> createRemitStatusRec(RemitStatusRecType value) {
        return new JAXBElement<RemitStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "RemitStatusRec"), RemitStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RenewalOption")
    public JAXBElement<String> createRenewalOption(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RenewalOption"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResponsibleBranch")
    public JAXBElement<String> createResponsibleBranch(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ResponsibleBranch"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ReplacementDt")
    public JAXBElement<String> createReplacementDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ReplacementDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedForExRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RequestedForExRate")
    public JAXBElement<RequestedForExRateType> createRequestedForExRate(RequestedForExRateType value) {
        return new JAXBElement<RequestedForExRateType>(new QName("urn:ifxforum-org:XSD:1", "RequestedForExRate"), RequestedForExRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedOperationModeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RequestedOperationMode")
    public JAXBElement<RequestedOperationModeType> createRequestedOperationMode(RequestedOperationModeType value) {
        return new JAXBElement<RequestedOperationModeType>(new QName("urn:ifxforum-org:XSD:1", "RequestedOperationMode"), RequestedOperationModeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResetAuth")
    public JAXBElement<String> createResetAuth(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ResetAuth"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResponsibleBank")
    public JAXBElement<String> createResponsibleBank(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ResponsibleBank"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResolvePendingDt")
    public JAXBElement<XMLGregorianCalendar> createResolvePendingDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "ResolvePendingDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResourceLocator")
    public JAXBElement<String> createResourceLocator(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ResourceLocator"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidenceCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ResidenceCountry")
    public JAXBElement<ResidenceCountryType> createResidenceCountry(ResidenceCountryType value) {
        return new JAXBElement<ResidenceCountryType>(new QName("urn:ifxforum-org:XSD:1", "ResidenceCountry"), ResidenceCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RetirementPlanIdent")
    public JAXBElement<String> createRetirementPlanIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RetirementPlanIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailPurchItemDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RetailPurchItemDetail")
    public JAXBElement<RetailPurchItemDetailType> createRetailPurchItemDetail(RetailPurchItemDetailType value) {
        return new JAXBElement<RetailPurchItemDetailType>(new QName("urn:ifxforum-org:XSD:1", "RetailPurchItemDetail"), RetailPurchItemDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevReasonCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RevReasonCode")
    public JAXBElement<RevReasonCodeType> createRevReasonCode(RevReasonCodeType value) {
        return new JAXBElement<RevReasonCodeType>(new QName("urn:ifxforum-org:XSD:1", "RevReasonCode"), RevReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RevReasonCodeSource")
    public JAXBElement<String> createRevReasonCodeSource(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RevReasonCodeSource"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RevReasonCodeValue")
    public JAXBElement<String> createRevReasonCodeValue(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "RevReasonCodeValue"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SIC")
    public JAXBElement<String> createSIC(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SIC"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SPName")
    public JAXBElement<String> createSPName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SPName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPRefIdCorrectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SPRefIdCorrect")
    public JAXBElement<SPRefIdCorrectType> createSPRefIdCorrect(SPRefIdCorrectType value) {
        return new JAXBElement<SPRefIdCorrectType>(new QName("urn:ifxforum-org:XSD:1", "SPRefIdCorrect"), SPRefIdCorrectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SPRefIdent")
    public JAXBElement<String> createSPRefIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SPRefIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SalesSlipRefNum")
    public JAXBElement<String> createSalesSlipRefNum(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SalesSlipRefNum"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecEncryptRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecEncryptRef")
    public JAXBElement<SecEncryptRefType> createSecEncryptRef(SecEncryptRefType value) {
        return new JAXBElement<SecEncryptRefType>(new QName("urn:ifxforum-org:XSD:1", "SecEncryptRef"), SecEncryptRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjDesc")
    public JAXBElement<String> createSecObjDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjEnvr")
    public JAXBElement<SecObjEnvrType> createSecObjEnvr(SecObjEnvrType value) {
        return new JAXBElement<SecObjEnvrType>(new QName("urn:ifxforum-org:XSD:1", "SecObjEnvr"), SecObjEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjId")
    public JAXBElement<String> createSecObjId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjInfo")
    public JAXBElement<SecObjInfoType> createSecObjInfo(SecObjInfoType value) {
        return new JAXBElement<SecObjInfoType>(new QName("urn:ifxforum-org:XSD:1", "SecObjInfo"), SecObjInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjInitAction")
    public JAXBElement<String> createSecObjInitAction(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjInitAction"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjKeyChkValue")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createSecObjKeyChkValue(byte[] value) {
        return new JAXBElement<byte[]>(new QName("urn:ifxforum-org:XSD:1", "SecObjKeyChkValue"), byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjKeys")
    public JAXBElement<SecObjKeysType> createSecObjKeys(SecObjKeysType value) {
        return new JAXBElement<SecObjKeysType>(new QName("urn:ifxforum-org:XSD:1", "SecObjKeys"), SecObjKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjPurpose")
    public JAXBElement<String> createSecObjPurpose(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjPurpose"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjRec")
    public JAXBElement<SecObjRecType> createSecObjRec(SecObjRecType value) {
        return new JAXBElement<SecObjRecType>(new QName("urn:ifxforum-org:XSD:1", "SecObjRec"), SecObjRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjRef")
    public JAXBElement<SecObjRefType> createSecObjRef(SecObjRefType value) {
        return new JAXBElement<SecObjRefType>(new QName("urn:ifxforum-org:XSD:1", "SecObjRef"), SecObjRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjSel")
    public JAXBElement<SecObjSelType> createSecObjSel(SecObjSelType value) {
        return new JAXBElement<SecObjSelType>(new QName("urn:ifxforum-org:XSD:1", "SecObjSel"), SecObjSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjStatus")
    public JAXBElement<SecObjStatusType> createSecObjStatus(SecObjStatusType value) {
        return new JAXBElement<SecObjStatusType>(new QName("urn:ifxforum-org:XSD:1", "SecObjStatus"), SecObjStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjStatusCode")
    public JAXBElement<SecObjStatusCodeType> createSecObjStatusCode(SecObjStatusCodeType value) {
        return new JAXBElement<SecObjStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "SecObjStatusCode"), SecObjStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecObjStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjStatusRec")
    public JAXBElement<SecObjStatusRecType> createSecObjStatusRec(SecObjStatusRecType value) {
        return new JAXBElement<SecObjStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "SecObjStatusRec"), SecObjStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjType")
    public JAXBElement<String> createSecObjType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjUse")
    public JAXBElement<String> createSecObjUse(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecObjUse"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecObjValue")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createSecObjValue(byte[] value) {
        return new JAXBElement<byte[]>(new QName("urn:ifxforum-org:XSD:1", "SecObjValue"), byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecSignRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecSignRef")
    public JAXBElement<SecSignRefType> createSecSignRef(SecSignRefType value) {
        return new JAXBElement<SecSignRefType>(new QName("urn:ifxforum-org:XSD:1", "SecSignRef"), SecSignRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecToken")
    public JAXBElement<SecTokenType> createSecToken(SecTokenType value) {
        return new JAXBElement<SecTokenType>(new QName("urn:ifxforum-org:XSD:1", "SecToken"), SecTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenCertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenCert")
    public JAXBElement<SecTokenCertType> createSecTokenCert(SecTokenCertType value) {
        return new JAXBElement<SecTokenCertType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenCert"), SecTokenCertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenICCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenICC")
    public JAXBElement<SecTokenICCType> createSecTokenICC(SecTokenICCType value) {
        return new JAXBElement<SecTokenICCType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenICC"), SecTokenICCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenIssuedIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenIssuedIdent")
    public JAXBElement<SecTokenIssuedIdentType> createSecTokenIssuedIdent(SecTokenIssuedIdentType value) {
        return new JAXBElement<SecTokenIssuedIdentType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenIssuedIdent"), SecTokenIssuedIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenKey")
    public JAXBElement<SecTokenKeyType> createSecTokenKey(SecTokenKeyType value) {
        return new JAXBElement<SecTokenKeyType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenKey"), SecTokenKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenMagCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenMagCard")
    public JAXBElement<SecTokenMagCardType> createSecTokenMagCard(SecTokenMagCardType value) {
        return new JAXBElement<SecTokenMagCardType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenMagCard"), SecTokenMagCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenObject")
    public JAXBElement<SecTokenObjectType> createSecTokenObject(SecTokenObjectType value) {
        return new JAXBElement<SecTokenObjectType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenObject"), SecTokenObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecTokenPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecTokenParty")
    public JAXBElement<SecTokenPartyType> createSecTokenParty(SecTokenPartyType value) {
        return new JAXBElement<SecTokenPartyType>(new QName("urn:ifxforum-org:XSD:1", "SecTokenParty"), SecTokenPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecondaryName")
    public JAXBElement<String> createSecondaryName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecondaryName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Secret")
    public JAXBElement<String> createSecret(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Secret"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SecretIdent")
    public JAXBElement<String> createSecretIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SecretIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelRangeDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SelRangeDt")
    public JAXBElement<SelRangeDtType> createSelRangeDt(SelRangeDtType value) {
        return new JAXBElement<SelRangeDtType>(new QName("urn:ifxforum-org:XSD:1", "SelRangeDt"), SelRangeDtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SentPageCount")
    public JAXBElement<Long> createSentPageCount(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "SentPageCount"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SentRecCount")
    public JAXBElement<Long> createSentRecCount(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "SentRecCount"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SeqNum")
    public JAXBElement<Long> createSeqNum(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "SeqNum"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ServerDt")
    public JAXBElement<String> createServerDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ServerDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ServerStatusCode")
    public JAXBElement<String> createServerStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ServerStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ServerTerminalSeqNum")
    public JAXBElement<String> createServerTerminalSeqNum(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ServerTerminalSeqNum"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ServiceLevel")
    public JAXBElement<String> createServiceLevel(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ServiceLevel"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessKey")
    public JAXBElement<String> createSessKey(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SessKey"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessionDt")
    public JAXBElement<String> createSessionDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SessionDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessionLocIdent")
    public JAXBElement<String> createSessionLocIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SessionLocIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessionLocName")
    public JAXBElement<String> createSessionLocName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SessionLocName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessionLogin")
    public JAXBElement<String> createSessionLogin(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SessionLogin"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SessionPostingDt")
    public JAXBElement<XMLGregorianCalendar> createSessionPostingDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "SessionPostingDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SettleInd")
    public JAXBElement<Boolean> createSettleInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "SettleInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SettlementData")
    public JAXBElement<SettlementDataType> createSettlementData(SettlementDataType value) {
        return new JAXBElement<SettlementDataType>(new QName("urn:ifxforum-org:XSD:1", "SettlementData"), SettlementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SettlementIdent")
    public JAXBElement<String> createSettlementIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SettlementIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SettlementMethod")
    public JAXBElement<String> createSettlementMethod(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SettlementMethod"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ShortDesc")
    public JAXBElement<String> createShortDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ShortDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeverityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Severity")
    public JAXBElement<SeverityType> createSeverity(SeverityType value) {
        return new JAXBElement<SeverityType>(new QName("urn:ifxforum-org:XSD:1", "Severity"), SeverityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureAmtLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SignatureAmtLimit")
    public JAXBElement<SignatureAmtLimitType> createSignatureAmtLimit(SignatureAmtLimitType value) {
        return new JAXBElement<SignatureAmtLimitType>(new QName("urn:ifxforum-org:XSD:1", "SignatureAmtLimit"), SignatureAmtLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SignatureCode")
    public JAXBElement<String> createSignatureCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SignatureCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureReqdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SignatureReqd")
    public JAXBElement<SignatureReqdType> createSignatureReqd(SignatureReqdType value) {
        return new JAXBElement<SignatureReqdType>(new QName("urn:ifxforum-org:XSD:1", "SignatureReqd"), SignatureReqdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SignatureTransaction")
    public JAXBElement<String> createSignatureTransaction(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SignatureTransaction"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SigningInstruction")
    public JAXBElement<String> createSigningInstruction(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SigningInstruction"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SkipNextN")
    public JAXBElement<Long> createSkipNextN(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "SkipNextN"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SmallBankNoteDenom")
    public JAXBElement<BigDecimal> createSmallBankNoteDenom(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "SmallBankNoteDenom"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SpecialHandling")
    public JAXBElement<String> createSpecialHandling(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SpecialHandling"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SpouseName")
    public JAXBElement<String> createSpouseName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SpouseName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StartDt")
    public JAXBElement<String> createStartDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StartDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StartSession")
    public JAXBElement<Boolean> createStartSession(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "StartSession"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StartPageNum")
    public JAXBElement<Long> createStartPageNum(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "StartPageNum"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StartSectName")
    public JAXBElement<String> createStartSectName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StartSectName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StateProv")
    public JAXBElement<String> createStateProv(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StateProv"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(new QName("urn:ifxforum-org:XSD:1", "Status"), StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StatusCode")
    public JAXBElement<Long> createStatusCode(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "StatusCode"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StatusDesc")
    public JAXBElement<String> createStatusDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StatusDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StatusModBy")
    public JAXBElement<String> createStatusModBy(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StatusModBy"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StatusReason")
    public JAXBElement<String> createStatusReason(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StatusReason"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeEnvr")
    public JAXBElement<StdPayeeEnvrType> createStdPayeeEnvr(StdPayeeEnvrType value) {
        return new JAXBElement<StdPayeeEnvrType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeEnvr"), StdPayeeEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeId")
    public JAXBElement<StdPayeeIdType> createStdPayeeId(StdPayeeIdType value) {
        return new JAXBElement<StdPayeeIdType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeId"), StdPayeeIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeInfo")
    public JAXBElement<StdPayeeInfoType> createStdPayeeInfo(StdPayeeInfoType value) {
        return new JAXBElement<StdPayeeInfoType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeInfo"), StdPayeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeKeys")
    public JAXBElement<StdPayeeKeysType> createStdPayeeKeys(StdPayeeKeysType value) {
        return new JAXBElement<StdPayeeKeysType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeKeys"), StdPayeeKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeRec")
    public JAXBElement<StdPayeeRecType> createStdPayeeRec(StdPayeeRecType value) {
        return new JAXBElement<StdPayeeRecType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeRec"), StdPayeeRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeRef")
    public JAXBElement<StdPayeeRefType> createStdPayeeRef(StdPayeeRefType value) {
        return new JAXBElement<StdPayeeRefType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeRef"), StdPayeeRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeSel")
    public JAXBElement<StdPayeeSelType> createStdPayeeSel(StdPayeeSelType value) {
        return new JAXBElement<StdPayeeSelType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeSel"), StdPayeeSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeStatus")
    public JAXBElement<StdPayeeStatusType> createStdPayeeStatus(StdPayeeStatusType value) {
        return new JAXBElement<StdPayeeStatusType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeStatus"), StdPayeeStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeStatusCode")
    public JAXBElement<StdPayeeStatusCodeType> createStdPayeeStatusCode(StdPayeeStatusCodeType value) {
        return new JAXBElement<StdPayeeStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeStatusCode"), StdPayeeStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StdPayeeStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StdPayeeStatusRec")
    public JAXBElement<StdPayeeStatusRecType> createStdPayeeStatusRec(StdPayeeStatusRecType value) {
        return new JAXBElement<StdPayeeStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "StdPayeeStatusRec"), StdPayeeStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtDt")
    public JAXBElement<XMLGregorianCalendar> createStmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "StmtDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtGroup")
    public JAXBElement<String> createStmtGroup(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StmtGroup"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StmtImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtImg")
    public JAXBElement<StmtImgType> createStmtImg(StmtImgType value) {
        return new JAXBElement<StmtImgType>(new QName("urn:ifxforum-org:XSD:1", "StmtImg"), StmtImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StmtRunningBalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtRunningBal")
    public JAXBElement<StmtRunningBalType> createStmtRunningBal(StmtRunningBalType value) {
        return new JAXBElement<StmtRunningBalType>(new QName("urn:ifxforum-org:XSD:1", "StmtRunningBal"), StmtRunningBalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StmtSummAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtSummAmt")
    public JAXBElement<StmtSummAmtType> createStmtSummAmt(StmtSummAmtType value) {
        return new JAXBElement<StmtSummAmtType>(new QName("urn:ifxforum-org:XSD:1", "StmtSummAmt"), StmtSummAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtSummType")
    public JAXBElement<String> createStmtSummType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StmtSummType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StmtTimeFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtTimeFrame")
    public JAXBElement<StmtTimeFrameType> createStmtTimeFrame(StmtTimeFrameType value) {
        return new JAXBElement<StmtTimeFrameType>(new QName("urn:ifxforum-org:XSD:1", "StmtTimeFrame"), StmtTimeFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StmtType")
    public JAXBElement<String> createStmtType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StmtType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkAuth")
    public JAXBElement<StopChkAuthType> createStopChkAuth(StopChkAuthType value) {
        return new JAXBElement<StopChkAuthType>(new QName("urn:ifxforum-org:XSD:1", "StopChkAuth"), StopChkAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkEnvr")
    public JAXBElement<StopChkEnvrType> createStopChkEnvr(StopChkEnvrType value) {
        return new JAXBElement<StopChkEnvrType>(new QName("urn:ifxforum-org:XSD:1", "StopChkEnvr"), StopChkEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkId")
    public JAXBElement<String> createStopChkId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StopChkId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkRef")
    public JAXBElement<StopChkRefType> createStopChkRef(StopChkRefType value) {
        return new JAXBElement<StopChkRefType>(new QName("urn:ifxforum-org:XSD:1", "StopChkRef"), StopChkRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkStatusCode")
    public JAXBElement<String> createStopChkStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "StopChkStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StopChkStatusRec")
    public JAXBElement<StopChkStatusRecType> createStopChkStatusRec(StopChkStatusRecType value) {
        return new JAXBElement<StopChkStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "StopChkStatusRec"), StopChkStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SubAcctRef")
    public JAXBElement<SubAcctRefType> createSubAcctRef(SubAcctRefType value) {
        return new JAXBElement<SubAcctRefType>(new QName("urn:ifxforum-org:XSD:1", "SubAcctRef"), SubAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectPassCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SubjectPassCode")
    public JAXBElement<SubjectPassCodeType> createSubjectPassCode(SubjectPassCodeType value) {
        return new JAXBElement<SubjectPassCodeType>(new QName("urn:ifxforum-org:XSD:1", "SubjectPassCode"), SubjectPassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectPswdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SubjectPswd")
    public JAXBElement<SubjectPswdType> createSubjectPswd(SubjectPswdType value) {
        return new JAXBElement<SubjectPswdType>(new QName("urn:ifxforum-org:XSD:1", "SubjectPswd"), SubjectPswdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SubjectRole")
    public JAXBElement<String> createSubjectRole(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SubjectRole"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SupplRptCode")
    public JAXBElement<String> createSupplRptCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SupplRptCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyingCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SupplyingCountry")
    public JAXBElement<SupplyingCountryType> createSupplyingCountry(SupplyingCountryType value) {
        return new JAXBElement<SupplyingCountryType>(new QName("urn:ifxforum-org:XSD:1", "SupplyingCountry"), SupplyingCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctEnvr")
    public JAXBElement<SvcAcctEnvrType> createSvcAcctEnvr(SvcAcctEnvrType value) {
        return new JAXBElement<SvcAcctEnvrType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctEnvr"), SvcAcctEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctInfo")
    public JAXBElement<SvcAcctInfoType> createSvcAcctInfo(SvcAcctInfoType value) {
        return new JAXBElement<SvcAcctInfoType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctInfo"), SvcAcctInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctKeys")
    public JAXBElement<SvcAcctKeysType> createSvcAcctKeys(SvcAcctKeysType value) {
        return new JAXBElement<SvcAcctKeysType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctKeys"), SvcAcctKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctRec")
    public JAXBElement<SvcAcctRecType> createSvcAcctRec(SvcAcctRecType value) {
        return new JAXBElement<SvcAcctRecType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctRec"), SvcAcctRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctRef")
    public JAXBElement<SvcAcctRefType> createSvcAcctRef(SvcAcctRefType value) {
        return new JAXBElement<SvcAcctRefType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctRef"), SvcAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctSel")
    public JAXBElement<SvcAcctSelType> createSvcAcctSel(SvcAcctSelType value) {
        return new JAXBElement<SvcAcctSelType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctSel"), SvcAcctSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctStatus")
    public JAXBElement<SvcAcctStatusType> createSvcAcctStatus(SvcAcctStatusType value) {
        return new JAXBElement<SvcAcctStatusType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctStatus"), SvcAcctStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctStatusCode")
    public JAXBElement<SvcAcctStatusCodeType> createSvcAcctStatusCode(SvcAcctStatusCodeType value) {
        return new JAXBElement<SvcAcctStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctStatusCode"), SvcAcctStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcAcctStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcAcctStatusRec")
    public JAXBElement<SvcAcctStatusRecType> createSvcAcctStatusRec(SvcAcctStatusRecType value) {
        return new JAXBElement<SvcAcctStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "SvcAcctStatusRec"), SvcAcctStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcName")
    public JAXBElement<String> createSvcName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SvcName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcIdent")
    public JAXBElement<String> createSvcIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SvcIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfEnvr")
    public JAXBElement<SvcProfEnvrType> createSvcProfEnvr(SvcProfEnvrType value) {
        return new JAXBElement<SvcProfEnvrType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfEnvr"), SvcProfEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfId")
    public JAXBElement<String> createSvcProfId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SvcProfId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfInfo")
    public JAXBElement<SvcProfInfoType> createSvcProfInfo(SvcProfInfoType value) {
        return new JAXBElement<SvcProfInfoType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfInfo"), SvcProfInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfKeys")
    public JAXBElement<SvcProfKeysType> createSvcProfKeys(SvcProfKeysType value) {
        return new JAXBElement<SvcProfKeysType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfKeys"), SvcProfKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfRec")
    public JAXBElement<SvcProfRecType> createSvcProfRec(SvcProfRecType value) {
        return new JAXBElement<SvcProfRecType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfRec"), SvcProfRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfRef")
    public JAXBElement<SvcProfRefType> createSvcProfRef(SvcProfRefType value) {
        return new JAXBElement<SvcProfRefType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfRef"), SvcProfRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfSel")
    public JAXBElement<SvcProfSelType> createSvcProfSel(SvcProfSelType value) {
        return new JAXBElement<SvcProfSelType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfSel"), SvcProfSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfStatus")
    public JAXBElement<SvcProfStatusType> createSvcProfStatus(SvcProfStatusType value) {
        return new JAXBElement<SvcProfStatusType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfStatus"), SvcProfStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfStatusCode")
    public JAXBElement<SvcProfStatusCodeType> createSvcProfStatusCode(SvcProfStatusCodeType value) {
        return new JAXBElement<SvcProfStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfStatusCode"), SvcProfStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcProfStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProfStatusRec")
    public JAXBElement<SvcProfStatusRecType> createSvcProfStatusRec(SvcProfStatusRecType value) {
        return new JAXBElement<SvcProfStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "SvcProfStatusRec"), SvcProfStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxCountry")
    public JAXBElement<TaxCountryType> createTaxCountry(TaxCountryType value) {
        return new JAXBElement<TaxCountryType>(new QName("urn:ifxforum-org:XSD:1", "TaxCountry"), TaxCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxData")
    public JAXBElement<TaxDataType> createTaxData(TaxDataType value) {
        return new JAXBElement<TaxDataType>(new QName("urn:ifxforum-org:XSD:1", "TaxData"), TaxDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxExempt")
    public JAXBElement<String> createTaxExempt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TaxExempt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxIdent")
    public JAXBElement<String> createTaxIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TaxIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxIdentType")
    public JAXBElement<String> createTaxIdentType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TaxIdentType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxProvince")
    public JAXBElement<String> createTaxProvince(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TaxProvince"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxResidenceCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxResidenceCountry")
    public JAXBElement<TaxResidenceCountryType> createTaxResidenceCountry(TaxResidenceCountryType value) {
        return new JAXBElement<TaxResidenceCountryType>(new QName("urn:ifxforum-org:XSD:1", "TaxResidenceCountry"), TaxResidenceCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxType")
    public JAXBElement<String> createTaxType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TaxType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxWithheldDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxWithheldData")
    public JAXBElement<TaxWithheldDataType> createTaxWithheldData(TaxWithheldDataType value) {
        return new JAXBElement<TaxWithheldDataType>(new QName("urn:ifxforum-org:XSD:1", "TaxWithheldData"), TaxWithheldDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxWithholding")
    public JAXBElement<Boolean> createTaxWithholding(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "TaxWithholding"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TaxYear")
    public JAXBElement<Long> createTaxYear(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "TaxYear"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Term")
    public JAXBElement<TermType> createTerm(TermType value) {
        return new JAXBElement<TermType>(new QName("urn:ifxforum-org:XSD:1", "Term"), TermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TermUnits")
    public JAXBElement<TermUnitsType> createTermUnits(TermUnitsType value) {
        return new JAXBElement<TermUnitsType>(new QName("urn:ifxforum-org:XSD:1", "TermUnits"), TermUnitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalIdent")
    public JAXBElement<String> createTerminalIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TerminalIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjEnvr")
    public JAXBElement<TerminalObjEnvrType> createTerminalObjEnvr(TerminalObjEnvrType value) {
        return new JAXBElement<TerminalObjEnvrType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjEnvr"), TerminalObjEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjId")
    public JAXBElement<String> createTerminalObjId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjInfo")
    public JAXBElement<TerminalObjInfoType> createTerminalObjInfo(TerminalObjInfoType value) {
        return new JAXBElement<TerminalObjInfoType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjInfo"), TerminalObjInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjKeys")
    public JAXBElement<TerminalObjKeysType> createTerminalObjKeys(TerminalObjKeysType value) {
        return new JAXBElement<TerminalObjKeysType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjKeys"), TerminalObjKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjRec")
    public JAXBElement<TerminalObjRecType> createTerminalObjRec(TerminalObjRecType value) {
        return new JAXBElement<TerminalObjRecType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjRec"), TerminalObjRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjRef")
    public JAXBElement<TerminalObjRefType> createTerminalObjRef(TerminalObjRefType value) {
        return new JAXBElement<TerminalObjRefType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjRef"), TerminalObjRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjSel")
    public JAXBElement<TerminalObjSelType> createTerminalObjSel(TerminalObjSelType value) {
        return new JAXBElement<TerminalObjSelType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjSel"), TerminalObjSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjStatus")
    public JAXBElement<TerminalObjStatusType> createTerminalObjStatus(TerminalObjStatusType value) {
        return new JAXBElement<TerminalObjStatusType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjStatus"), TerminalObjStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjStatusCode")
    public JAXBElement<TerminalObjStatusCodeType> createTerminalObjStatusCode(TerminalObjStatusCodeType value) {
        return new JAXBElement<TerminalObjStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjStatusCode"), TerminalObjStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalObjStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalObjStatusRec")
    public JAXBElement<TerminalObjStatusRecType> createTerminalObjStatusRec(TerminalObjStatusRecType value) {
        return new JAXBElement<TerminalObjStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "TerminalObjStatusRec"), TerminalObjStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjEnvr")
    public JAXBElement<TerminalSPObjEnvrType> createTerminalSPObjEnvr(TerminalSPObjEnvrType value) {
        return new JAXBElement<TerminalSPObjEnvrType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjEnvr"), TerminalSPObjEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjId")
    public JAXBElement<String> createTerminalSPObjId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjInfo")
    public JAXBElement<TerminalSPObjInfoType> createTerminalSPObjInfo(TerminalSPObjInfoType value) {
        return new JAXBElement<TerminalSPObjInfoType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjInfo"), TerminalSPObjInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjKeys")
    public JAXBElement<TerminalSPObjKeysType> createTerminalSPObjKeys(TerminalSPObjKeysType value) {
        return new JAXBElement<TerminalSPObjKeysType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjKeys"), TerminalSPObjKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjRec")
    public JAXBElement<TerminalSPObjRecType> createTerminalSPObjRec(TerminalSPObjRecType value) {
        return new JAXBElement<TerminalSPObjRecType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjRec"), TerminalSPObjRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjRef")
    public JAXBElement<TerminalSPObjRefType> createTerminalSPObjRef(TerminalSPObjRefType value) {
        return new JAXBElement<TerminalSPObjRefType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjRef"), TerminalSPObjRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjSel")
    public JAXBElement<TerminalSPObjSelType> createTerminalSPObjSel(TerminalSPObjSelType value) {
        return new JAXBElement<TerminalSPObjSelType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjSel"), TerminalSPObjSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjStatus")
    public JAXBElement<TerminalSPObjStatusType> createTerminalSPObjStatus(TerminalSPObjStatusType value) {
        return new JAXBElement<TerminalSPObjStatusType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjStatus"), TerminalSPObjStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjStatusCode")
    public JAXBElement<TerminalSPObjStatusCodeType> createTerminalSPObjStatusCode(TerminalSPObjStatusCodeType value) {
        return new JAXBElement<TerminalSPObjStatusCodeType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjStatusCode"), TerminalSPObjStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalSPObjStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalSPObjStatusRec")
    public JAXBElement<TerminalSPObjStatusRecType> createTerminalSPObjStatusRec(TerminalSPObjStatusRecType value) {
        return new JAXBElement<TerminalSPObjStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "TerminalSPObjStatusRec"), TerminalSPObjStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TerminalType")
    public JAXBElement<String> createTerminalType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TerminalType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TimeFrame")
    public JAXBElement<TimeFrameType> createTimeFrame(TimeFrameType value) {
        return new JAXBElement<TimeFrameType>(new QName("urn:ifxforum-org:XSD:1", "TimeFrame"), TimeFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ToAcctRef")
    public JAXBElement<AcctRefType> createToAcctRef(AcctRefType value) {
        return new JAXBElement<AcctRefType>(new QName("urn:ifxforum-org:XSD:1", "ToAcctRef"), AcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Token"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TotalCurAmt")
    public JAXBElement<TotalCurAmtType> createTotalCurAmt(TotalCurAmtType value) {
        return new JAXBElement<TotalCurAmtType>(new QName("urn:ifxforum-org:XSD:1", "TotalCurAmt"), TotalCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCompositeCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TotalCompositeCurAmt")
    public JAXBElement<TotalCompositeCurAmtType> createTotalCompositeCurAmt(TotalCompositeCurAmtType value) {
        return new JAXBElement<TotalCompositeCurAmtType>(new QName("urn:ifxforum-org:XSD:1", "TotalCompositeCurAmt"), TotalCompositeCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TotalPmtCount")
    public JAXBElement<Long> createTotalPmtCount(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "TotalPmtCount"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TranDt")
    public JAXBElement<XMLGregorianCalendar> createTranDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "TranDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Trk2EquivData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createTrk2EquivData(byte[] value) {
        return new JAXBElement<byte[]>(new QName("urn:ifxforum-org:XSD:1", "Trk2EquivData"), byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnAuthIdent")
    public JAXBElement<String> createTrnAuthIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnAuthIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnImg")
    public JAXBElement<TrnImgType> createTrnImg(TrnImgType value) {
        return new JAXBElement<TrnImgType>(new QName("urn:ifxforum-org:XSD:1", "TrnImg"), TrnImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnRqUID")
    public JAXBElement<String> createTrnRqUID(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnRqUID"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnSrc")
    public JAXBElement<String> createTrnSrc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnSrc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnSubType")
    public JAXBElement<String> createTrnSubType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnSubType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnType")
    public JAXBElement<TrnTypeType> createTrnType(TrnTypeType value) {
        return new JAXBElement<TrnTypeType>(new QName("urn:ifxforum-org:XSD:1", "TrnType"), TrnTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnTypeSource")
    public JAXBElement<String> createTrnTypeSource(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnTypeSource"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TrnTypeValue")
    public JAXBElement<String> createTrnTypeValue(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "TrnTypeValue"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TruncatedInd")
    public JAXBElement<Boolean> createTruncatedInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "TruncatedInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "UPIC")
    public JAXBElement<String> createUPIC(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "UPIC"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "USA.TaxIdCertCode")
    public JAXBElement<String> createUSATaxIdCertCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "USA.TaxIdCertCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "USA.TaxIdCertDate")
    public JAXBElement<XMLGregorianCalendar> createUSATaxIdCertDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "USA.TaxIdCertDate"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "UTCOffset")
    public JAXBElement<Long> createUTCOffset(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "UTCOffset"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "UpDt")
    public JAXBElement<XMLGregorianCalendar> createUpDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "UpDt"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ValidFromDt")
    public JAXBElement<String> createValidFromDt(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ValidFromDt"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "Version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "Version"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "VoucherTypeIdent")
    public JAXBElement<String> createVoucherTypeIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "VoucherTypeIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ViewDtlPref")
    public JAXBElement<String> createViewDtlPref(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "ViewDtlPref"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "WaiveFeeInd")
    public JAXBElement<Boolean> createWaiveFeeInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "WaiveFeeInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "WebEnrollURL")
    public JAXBElement<String> createWebEnrollURL(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "WebEnrollURL"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferEnvr")
    public JAXBElement<XferEnvrType> createXferEnvr(XferEnvrType value) {
        return new JAXBElement<XferEnvrType>(new QName("urn:ifxforum-org:XSD:1", "XferEnvr"), XferEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferId")
    public JAXBElement<String> createXferId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "XferId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferPayeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferPayee")
    public JAXBElement<XferPayeeType> createXferPayee(XferPayeeType value) {
        return new JAXBElement<XferPayeeType>(new QName("urn:ifxforum-org:XSD:1", "XferPayee"), XferPayeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferSel")
    public JAXBElement<XferSelType> createXferSel(XferSelType value) {
        return new JAXBElement<XferSelType>(new QName("urn:ifxforum-org:XSD:1", "XferSel"), XferSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferStatus")
    public JAXBElement<XferStatusType> createXferStatus(XferStatusType value) {
        return new JAXBElement<XferStatusType>(new QName("urn:ifxforum-org:XSD:1", "XferStatus"), XferStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferStatusCode")
    public JAXBElement<String> createXferStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "XferStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "XferStatusRec")
    public JAXBElement<XferStatusRecType> createXferStatusRec(XferStatusRecType value) {
        return new JAXBElement<XferStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "XferStatusRec"), XferStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaItemIdent")
    public JAXBElement<String> createMediaItemIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "MediaItemIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SerialNumStart")
    public JAXBElement<String> createSerialNumStart(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SerialNumStart"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SerialNumEnd")
    public JAXBElement<String> createSerialNumEnd(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SerialNumEnd"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAcctAdjInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaAcctAdjInfo")
    public JAXBElement<MediaAcctAdjInfoType> createMediaAcctAdjInfo(MediaAcctAdjInfoType value) {
        return new JAXBElement<MediaAcctAdjInfoType>(new QName("urn:ifxforum-org:XSD:1", "MediaAcctAdjInfo"), MediaAcctAdjInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MediaTrnType")
    public JAXBElement<String> createMediaTrnType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "MediaTrnType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "MeasureUnit")
    public JAXBElement<String> createMeasureUnit(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "MeasureUnit"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyAcctRelAuth")
    public JAXBElement<PartyAcctRelAuthType> createPartyAcctRelAuth(PartyAcctRelAuthType value) {
        return new JAXBElement<PartyAcctRelAuthType>(new QName("urn:ifxforum-org:XSD:1", "PartyAcctRelAuth"), PartyAcctRelAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCardRelAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PartyCardRelAuth")
    public JAXBElement<PartyCardRelAuthType> createPartyCardRelAuth(PartyCardRelAuthType value) {
        return new JAXBElement<PartyCardRelAuthType>(new QName("urn:ifxforum-org:XSD:1", "PartyCardRelAuth"), PartyCardRelAuthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "BillPayInd")
    public JAXBElement<Boolean> createBillPayInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "BillPayInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AcctTrnIdent")
    public JAXBElement<String> createAcctTrnIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AcctTrnIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NotAvailInd")
    public JAXBElement<Boolean> createNotAvailInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "NotAvailInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "NewElements")
    public JAXBElement<String> createNewElements(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "NewElements"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "UpdElements")
    public JAXBElement<String> createUpdElements(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "UpdElements"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertSel")
    public JAXBElement<AlertSelType> createAlertSel(AlertSelType value) {
        return new JAXBElement<AlertSelType>(new QName("urn:ifxforum-org:XSD:1", "AlertSel"), AlertSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertStatus")
    public JAXBElement<AlertStatusType> createAlertStatus(AlertStatusType value) {
        return new JAXBElement<AlertStatusType>(new QName("urn:ifxforum-org:XSD:1", "AlertStatus"), AlertStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertEnvrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertEnvr")
    public JAXBElement<AlertEnvrType> createAlertEnvr(AlertEnvrType value) {
        return new JAXBElement<AlertEnvrType>(new QName("urn:ifxforum-org:XSD:1", "AlertEnvr"), AlertEnvrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertType")
    public JAXBElement<String> createAlertType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertIdent")
    public JAXBElement<String> createAlertIdent(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertIdent"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertDesc")
    public JAXBElement<String> createAlertDesc(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertDesc"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertUse")
    public JAXBElement<String> createAlertUse(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertUse"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SelectInd")
    public JAXBElement<Boolean> createSelectInd(Boolean value) {
        return new JAXBElement<Boolean>(new QName("urn:ifxforum-org:XSD:1", "SelectInd"), Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertPercent")
    public JAXBElement<BigDecimal> createAlertPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:ifxforum-org:XSD:1", "AlertPercent"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TimeRange")
    public JAXBElement<TimeRangeType> createTimeRange(TimeRangeType value) {
        return new JAXBElement<TimeRangeType>(new QName("urn:ifxforum-org:XSD:1", "TimeRange"), TimeRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertId")
    public JAXBElement<String> createAlertId(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertId"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertStatusCode")
    public JAXBElement<String> createAlertStatusCode(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AlertStatusCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "StartTime")
    public JAXBElement<XMLGregorianCalendar> createStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "StartTime"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "EndTime")
    public JAXBElement<XMLGregorianCalendar> createEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "EndTime"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "RecurType")
    public JAXBElement<RecurTypeType> createRecurType(RecurTypeType value) {
        return new JAXBElement<RecurTypeType>(new QName("urn:ifxforum-org:XSD:1", "RecurType"), RecurTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "TimeOfDay")
    public JAXBElement<XMLGregorianCalendar> createTimeOfDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:ifxforum-org:XSD:1", "TimeOfDay"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AdjDays")
    public JAXBElement<Long> createAdjDays(Long value) {
        return new JAXBElement<Long>(new QName("urn:ifxforum-org:XSD:1", "AdjDays"), Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AdjDaysBasis")
    public JAXBElement<String> createAdjDaysBasis(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AdjDaysBasis"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AlertStatusRec")
    public JAXBElement<AlertStatusRecType> createAlertStatusRec(AlertStatusRecType value) {
        return new JAXBElement<AlertStatusRecType>(new QName("urn:ifxforum-org:XSD:1", "AlertStatusRec"), AlertStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PINData")
    public JAXBElement<PINDataType> createPINData(PINDataType value) {
        return new JAXBElement<PINDataType>(new QName("urn:ifxforum-org:XSD:1", "PINData"), PINDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "PIN"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptPINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "CryptPIN")
    public JAXBElement<CryptPINType> createCryptPIN(CryptPINType value) {
        return new JAXBElement<CryptPINType>(new QName("urn:ifxforum-org:XSD:1", "CryptPIN"), CryptPINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "SvcProviderName")
    public JAXBElement<String> createSvcProviderName(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "SvcProviderName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "AthServiceType")
    public JAXBElement<String> createAthServiceType(String value) {
        return new JAXBElement<String>(new QName("urn:ifxforum-org:XSD:1", "AthServiceType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExQuoteAuthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ifxforum-org:XSD:1", name = "ForExQuoteAuth")
    public JAXBElement<ForExQuoteAuthType> createForExQuoteAuth(ForExQuoteAuthType value) {
        return new JAXBElement<ForExQuoteAuthType>(new QName("urn:ifxforum-org:XSD:1", "ForExQuoteAuth"), ForExQuoteAuthType.class, null, value);
    }

}
