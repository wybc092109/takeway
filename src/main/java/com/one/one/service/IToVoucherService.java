package com.one.one.service;

import com.one.one.dto.Result;
import com.one.one.entity.ToVoucher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YQ
 * @since 2022-12-11
 */
public interface IToVoucherService extends IService<ToVoucher> {

    Result allVoucher();
}
