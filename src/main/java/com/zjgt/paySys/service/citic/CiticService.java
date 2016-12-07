package com.zjgt.paySys.service.citic;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface CiticService {

	public String initializeFund(@WebParam(name = "invokeUser") String invokeUser,
			@WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "subAccNm") String subAccNm,
			@WebParam(name = "tranAmt") String tranAmt, @WebParam(name = "memo") String memo);

	public String register(@WebParam(name = "invokeUser") String invokeUser,@WebParam(name = "subAccNm") String subAccNm, @WebParam(name = "vtlCustNm") String vtlCustNm, @WebParam(name = "legalPersonNm") String legalPersonNm,
			@WebParam(name = "custCertType") String custCertType, @WebParam(name = "custCertNo") String custCertNo, @WebParam(name = "commAddress") String commAddress, @WebParam(name = "contactName") String contactName, @WebParam(name = "contactPhone") String contactPhone,
			@WebParam(name = "mailAddress") String mailAddress);

	public String queryStatus(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "clientID") String clientID, @WebParam(name = "type") String type);

	public String queryBalanceAccount(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo);

	public String transfer(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "payAccNo") String payAccNo, @WebParam(name = "tranType") String tranType, @WebParam(name = "recvAccNo") String recvAccNo, @WebParam(name = "recvAccNm") String recvAccNm,
			@WebParam(name = "tranAmt") String tranAmt, @WebParam(name = "freezeNo") String freezeNo, @WebParam(name = "memo") String memo);

	public String queryFreeze(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "startDate") String startDate, @WebParam(name = "endDate") String endDate);

	public String withdrawMoney(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "accountNo") String accountNo, @WebParam(name = "recvAccNo") String recvAccNo, @WebParam(name = "recvAccNm") String recvAccNm, @WebParam(name = "tranAmt") String tranAmt,
			@WebParam(name = "sameBank") String sameBank, @WebParam(name = "recvTgfi") String recvTgfi, @WebParam(name = "recvBankNm") String recvBankNm, @WebParam(name = "memo") String memo);

	public String externalPay(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "payType") String payType, @WebParam(name = "recBankNo") String recBankNo, @WebParam(name = "payAccNo") String payAccNo, @WebParam(name = "recAccountNo") String recAccountNo,
			@WebParam(name = "recAccountName") String recAccountName, @WebParam(name = "recOpenBankName") String recOpenBankName, @WebParam(name = "recOpenBankCode") String recOpenBankCode, @WebParam(name = "citicbankFlag") String citicbankFlag,
			@WebParam(name = "cityFlag") String cityFlag, @WebParam(name = "tranAmount") String tranAmount, @WebParam(name = "zhaiYao") String zhaiYao, @WebParam(name = "memo") String memo);

	public String queryListForDeal(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "queryType") String queryType, @WebParam(name = "startDate") String startDate,
			@WebParam(name = "endDate") String endDate, @WebParam(name = "tranType") String tranType, @WebParam(name = "startRecord") String startRecord, @WebParam(name = "pageNumber") String pageNumber);

	public String queryListForPrint(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "startDate") String startDate, @WebParam(name = "endDate") String endDate,
			@WebParam(name = "startRecord") String startRecord, @WebParam(name = "pageNumber") String pageNumber);

	public String manageAccount(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "subAccNm") String subAccNm, @WebParam(name = "autoAssignTranFeeFlag") String autoAssignTranFeeFlag,
			@WebParam(name = "feeType") String feeType);

	public String accountCancellation(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo);

	public String deposit(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "recvAccNo") String recvAccNo, @WebParam(name = "recvAccNm") String recvAccNm, @WebParam(name = "tranAmt") String tranAmt, @WebParam(name = "hostDate") String hostDate,
			@WebParam(name = "hostFlw") String hostFlw, @WebParam(name = "hostSeq") String hostSeq, @WebParam(name = "memo") String memo);

	public String depositBack(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "payAccNo") String payAccNo, @WebParam(name = "tranAmt") String tranAmt, @WebParam(name = "hostDate") String hostDate, @WebParam(name = "hostFlw") String hostFlw,
			@WebParam(name = "hostSeq") String hostSeq, @WebParam(name = "memo") String memo);

	public String queryMemberInfo(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "stt") String stt, @WebParam(name = "startDate") String startDate, @WebParam(name = "endDate") String endDate);

	public String queryHandlingCharge(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "tranDate") String tranDate);

	public String findFreezeNo(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo, @WebParam(name = "startDate") String startDate, @WebParam(name = "endDate") String endDate);
	
	public String manualKnot(@WebParam(name = "invokeUser") String invokeUser, @WebParam(name = "subAccNo") String subAccNo);

}