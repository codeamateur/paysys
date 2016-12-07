package com.zjgt.paySys.common.citic.vo;

public class DealDetailVo {
	
	/**
	 * 附属账号varchar(19)
	 */
	private String subAccNo;
	/**
	 * 交易类型varchar(2)
	 */
	private String TRANTYPE;
	/**
	 * 交易日期char(8)
	 */
	private String TRANDATE;
	/**
	 * 交易时间char(6)
	 */
	private String TRANTIME;
	/**
	 * 柜员交易号varchar(14)
	 */
	private String HOSTFLW;
	/**
	 * 交易序号varchar(13)
	 */
	private String HOSTSEQ;
	/**
	 * 对方账号varchar(19)-
	 */
	private String OPPACCNO;
	/**
	 * 对方账户名称varchar(122)
	 */
	private String OPPACCNAME;
	/**
	 * 对方开户行名称varchar(122)
	 */
	private String OPPBRANCHNAME;
	/**
	 * 借贷标志varchar (1) D：借，C：贷
	 */
	private String CDFG;
	/**
	 * 交易金额decimal(15,2)
	 */
	private String TRANAMT;
	/**
	 * 账户余额decimal(15,2)
	 */
	private String ACCBAL;
	/**
	 * 手续费金额decimal(15,2)
	 */
	private String XTSFAM;
	/**
	 * 摘要varchar(102)
	 */
	private String RESUME;

	/**
	 * 对方支付联行号varchar(20)
	 */
	private String OPPBANKNO;

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getTRANTYPE() {
		return TRANTYPE;
	}

	public String getTRANDATE() {
		return TRANDATE;
	}

	public String getTRANTIME() {
		return TRANTIME;
	}

	public String getHOSTFLW() {
		return HOSTFLW;
	}

	public String getHOSTSEQ() {
		return HOSTSEQ;
	}

	public String getOPPACCNO() {
		return OPPACCNO;
	}

	public String getOPPACCNAME() {
		return OPPACCNAME;
	}

	public String getOPPBRANCHNAME() {
		return OPPBRANCHNAME;
	}

	public String getCDFG() {
		return CDFG;
	}

	public String getTRANAMT() {
		return TRANAMT;
	}

	public String getACCBAL() {
		return ACCBAL;
	}

	public String getXTSFAM() {
		return XTSFAM;
	}

	public String getRESUME() {
		return RESUME;
	}

	public String getOPPBANKNO() {
		return OPPBANKNO;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setTRANTYPE(String tRANTYPE) {
		TRANTYPE = tRANTYPE;
	}

	public void setTRANDATE(String tRANDATE) {
		TRANDATE = tRANDATE;
	}

	public void setTRANTIME(String tRANTIME) {
		TRANTIME = tRANTIME;
	}

	public void setHOSTFLW(String hOSTFLW) {
		HOSTFLW = hOSTFLW;
	}

	public void setHOSTSEQ(String hOSTSEQ) {
		HOSTSEQ = hOSTSEQ;
	}

	public void setOPPACCNO(String oPPACCNO) {
		OPPACCNO = oPPACCNO;
	}

	public void setOPPACCNAME(String oPPACCNAME) {
		OPPACCNAME = oPPACCNAME;
	}

	public void setOPPBRANCHNAME(String oPPBRANCHNAME) {
		OPPBRANCHNAME = oPPBRANCHNAME;
	}

	public void setCDFG(String cDFG) {
		CDFG = cDFG;
	}

	public void setTRANAMT(String tRANAMT) {
		TRANAMT = tRANAMT;
	}

	public void setACCBAL(String aCCBAL) {
		ACCBAL = aCCBAL;
	}

	public void setXTSFAM(String xTSFAM) {
		XTSFAM = xTSFAM;
	}

	public void setRESUME(String rESUME) {
		RESUME = rESUME;
	}

	public void setOPPBANKNO(String oPPBANKNO) {
		OPPBANKNO = oPPBANKNO;
	}
	
	
}
