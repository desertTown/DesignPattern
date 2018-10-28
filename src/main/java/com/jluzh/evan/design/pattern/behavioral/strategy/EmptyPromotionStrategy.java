package com.jluzh.evan.design.pattern.behavioral.strategy;

/**
 * @author EvanHuang
 * @date 10/28/2018 1:48 PM
 * @since
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
