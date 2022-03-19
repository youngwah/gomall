package com.real.gomall.member.feign;

import com.real.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gomall-coupon")
public interface CouponFeignService {
    // 远程服务的url
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
