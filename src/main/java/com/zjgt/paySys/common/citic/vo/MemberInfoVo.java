package com.zjgt.paySys.common.citic.vo;

import com.zjgt.paySys.common.citic.bean.Stream;

public class MemberInfoVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public MemberInfoVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public MemberInfoVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}
	
	/**
	 * 附属账号char(19)
	 */
	private String subAccNo;
	/**
	 * 附属账户名称varchar(122)
	 */
	private String subAccNm;
	/**
	 * 附属账户类型char(2)，03：一般交易账号；04：保证金帐
	 */
	private String accType;	
	/**
	 * 状态char(1)，0：正常；1：待审核；2：注销；3：审核拒绝
	 */
	private String status;
	/**
	 * 是否计算利息标示char(1)，0：不计息 1：不分段计息 2：分段计息
	 */
	private String calInterestFlag;
	/**
	 * 默认计息利率decimal(9,7)
	 */
	private String interestRate;
	/**
	 * 手续费收取方式char(1)，空：不收取；1：实时收取；2：月末累计
	 */
	private String feeType;	
	/**
	 * 是否允许透支char(1)，0：不允许；1：限额透支；2：全额透支
	 */
	private String overFlag;		
	/**
	 * 透支额度decimal(15,2)
	 */
	private String overAmt;
	/**
	 * 透支利率decimal(9,7)
	 */
	private String overRate;
	/**
	 * 自动分配利息标示char(1)，0：否；1；是
	 */
	private String autoAssignInterestFlag;
	/**
	 * 自动分配手续费标示char(1)-
	 */
	private String autoAssignTranFeeFlag;
	/**
	 * 会员签约中心char(6)
	 */
	private String centerNo;
	/**
	 * 会员签约中心名称varchar(122)
	 */
	private String centerNm;
	/**
	 * 实名制更换char(1)，0：账户名与账号全不换；1：账户名与账号全换；2：换账户名；3：换账号
	 */
	private String realNameParm;
	/**
	 * 附属账户凭证打印更换char(1)， 0：全部显示；1：显示附属账户名和账号；2：显示实体账户名和账号；3：显示附属账户名和实体账号；4：显示实体账户名和附属账号
	 */
	private String subAccPrintParm;

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getSubAccNm() {
		return subAccNm;
	}

	public String getAccType() {
		return accType;
	}

	public String getStatus() {
		return status;
	}

	public String getCalInterestFlag() {
		return calInterestFlag;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public String getFeeType() {
		return feeType;
	}

	public String getOverFlag() {
		return overFlag;
	}

	public String getOverAmt() {
		return overAmt;
	}

	public String getOverRate() {
		return overRate;
	}

	public String getAutoAssignInterestFlag() {
		return autoAssignInterestFlag;
	}

	public String getAutoAssignTranFeeFlag() {
		return autoAssignTranFeeFlag;
	}

	public String getCenterNo() {
		return centerNo;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public String getRealNameParm() {
		return realNameParm;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCalInterestFlag(String calInterestFlag) {
		this.calInterestFlag = calInterestFlag;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public void setOverFlag(String overFlag) {
		this.overFlag = overFlag;
	}

	public void setOverAmt(String overAmt) {
		this.overAmt = overAmt;
	}

	public void setOverRate(String overRate) {
		this.overRate = overRate;
	}

	public void setAutoAssignInterestFlag(String autoAssignInterestFlag) {
		this.autoAssignInterestFlag = autoAssignInterestFlag;
	}

	public void setAutoAssignTranFeeFlag(String autoAssignTranFeeFlag) {
		this.autoAssignTranFeeFlag = autoAssignTranFeeFlag;
	}

	public void setCenterNo(String centerNo) {
		this.centerNo = centerNo;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public void setRealNameParm(String realNameParm) {
		this.realNameParm = realNameParm;
	}

	public String getSubAccPrintParm() {
		return subAccPrintParm;
	}

	public void setSubAccPrintParm(String subAccPrintParm) {
		this.subAccPrintParm = subAccPrintParm;
	}
	
}
