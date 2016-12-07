package com.zjgt.paySys.common.citic;

public class CiticConfig {
	// 占位符
	public static final String EMPTY = "";
	// 中信url
	public static final String URL = "citic.url";
	// 中信主体账户
	public static final String ACCOUNT_MAIN = "citic.account.main";
	// 中信主体账户名称
	public static final String ACCOUNT_MAIN_NAME = "citic.account.main.name";	
	// 中信资金初始化账户
	public static final String ACCOUNT_INIT = "citic.account.init";
	// 中信资金初始化账户名称
	public static final String ACCOUNT_INIT_NAME = "citic.account.init.name";	
	// 中信公共调账账户
	public static final String ACCOUNT_ADJUSTMENTS = "citic.account.adjustments";
	// 中信公共调账账户名称
	public static final String ACCOUNT_ADJUSTMENTS_NAME = "citic.account.adjustments.name";	
	// 中信公共计息收费账户
	public static final String ACCOUNT_INTERESTCHARGES = "citic.account.interestCharges";
	// 中信公共计息收费账户名称
	public static final String ACCOUNT_INTERESTCHARGES_NAME = "citic.account.interestCharges.name";	
	// 中信登录名
	public static final String ACCOUNT_USERNAME = "citic.account.userName";
	// 公司虚拟子账户
	public static final String COMPANY_ACCOUNT_NO = "citic.company.account.no";
	// 公司虚拟子账户名称
	public static final String COMPANY_ACCOUNT_NAME = "citic.company.account.name";
	// 公司虚拟子账户用户id
	public static final String COMPANY_USER_ID = "citic.company.user.id";		
	// 交易成功
	public static final String TRADE_STATUS_AAAAAAA = "AAAAAAA";
	// 经办成功待审核
	public static final String TRADE_STATUS_AAAAAAB = "AAAAAAB";
	// 预约支付成功
	public static final String TRADE_STATUS_AAAAAAC = "AAAAAAC";
	// 现金管理代理收款信息查询交易专用，表示扣款方审核通过，扣款成功
	public static final String TRADE_STATUS_AAAAAAD = "AAAAAAD";
	// 已提交银行处理，需稍后使用“交易状态查询”进行查询
	public static final String TRADE_STATUS_AAAAAAE = "AAAAAAE";
	// 资金初始化
	public static final String ACTION_DLFNDINI = "DLFNDINI";
	// 交易状态查询
	public static final String ACTION_DLCIDSTT = "DLCIDSTT";
	// 会员注册
	public static final String ACTION_DLBREGSN = "DLBREGSN";
	// 商户附属账户余额查询
	public static final String ACTION_DLSBALQR = "DLSBALQR";
	// 强制转账
	public static final String ACTION_DLMDETRN = "DLMDETRN";
	// 平台出金
	public static final String ACTION_DLFCSOUT = "DLFCSOUT";
	// 商户附属账户交易明细查询
	public static final String ACTION_DLSTRNDT = "DLSTRNDT";
	// 商户附属账户冻结信息查询
	public static final String ACTION_DLSFRZQR = "DLSFRZQR";
	// 非登录打印明细查询
	public static final String ACTION_DLPTDTQY = "DLPTDTQY";
	// 对外支付
	public static final String ACTION_DLOUTTRN = "DLOUTTRN";
	// 附属账户参数管理
	public static final String ACTION_DLSBAMAN = "DLSBAMAN";
	// 在线销户
	public static final String ACTION_DLOLCACC = "DLOLCACC";
	// 调帐入款
	public static final String ACTION_DLTRSFIN = "DLTRSFIN";
	// 错帐调回
	public static final String ACTION_DLWFDRTN = "DLWFDRTN";
	// 附属账户签约状态查询
	public static final String ACTION_DLSASQRY = "DLSASQRY";	
	// 附属账户手续费查询
	public static final String ACTION_DLSAFQRY = "DLSAFQRY";
	// 手工结息
	public static final String ACTION_DLIRTSTL = "DLIRTSTL";	
	// 注册接口mngNode字段固定值
	public static final String REGISTER_MNGNODE = "citic.register.mngnode";
	// 注册接口branch字段固定值
	public static final String REGISTER_BRANCH = "citic.register.branch";
	// success
	public static final String OK = "10000";
	// error
	public static final String ERROR = "10001";
	// 处理中
	public static final String HANDLING = "10002";				
}
