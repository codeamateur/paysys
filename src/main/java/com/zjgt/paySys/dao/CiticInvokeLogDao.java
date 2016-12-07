package com.zjgt.paySys.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zjgt.paySys.entity.CiticInvokeLog;

public interface CiticInvokeLogDao extends PagingAndSortingRepository<CiticInvokeLog, String>, JpaSpecificationExecutor<CiticInvokeLog>{
	
}
