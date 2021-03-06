package com.wuweibi.bullet.business;

import com.wuweibi.bullet.entity.api.Result;

import java.math.BigDecimal;

/**
 *
 * 订单支付的
 *
 * @author marker
 *
 */
public interface OrderPayBiz {

    /**
     * 计算价格
     * @param domainId
     * @param time 天
     * @return
     */
    Result calculate(Long domainId, Integer time);


    /**
     * 余额支付
     * @param userId
     * @param domainId
     * @param payMoney
     * @param dueTime
     * @return
     */
    Result balancePay(Long userId, Long domainId, BigDecimal payMoney, Long dueTime);

}
