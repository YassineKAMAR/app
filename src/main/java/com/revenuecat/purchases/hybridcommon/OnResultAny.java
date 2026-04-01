package com.revenuecat.purchases.hybridcommon;

/* JADX INFO: loaded from: classes.dex */
public interface OnResultAny<T> {
    void onError(ErrorContainer errorContainer);

    void onReceived(T t7);
}
