package com.jluzh.evan.design.pattern.behavioral.strategy;

/**
 * @author EvanHuang
 * @date 10/28/2018 1:30 PM
 * @since
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
