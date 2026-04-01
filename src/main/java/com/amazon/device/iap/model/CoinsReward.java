package com.amazon.device.iap.model;

/* JADX INFO: loaded from: classes.dex */
public final class CoinsReward {
    private final int amount;

    protected CoinsReward(int i8) {
        this.amount = i8;
    }

    protected static final CoinsReward from(int i8) {
        if (i8 > 0) {
            return new CoinsReward(i8);
        }
        return null;
    }

    public int getAmount() {
        return this.amount;
    }
}
