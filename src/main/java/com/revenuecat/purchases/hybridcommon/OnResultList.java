package com.revenuecat.purchases.hybridcommon;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface OnResultList {
    void onError(ErrorContainer errorContainer);

    void onReceived(List<Map<String, ?>> list);
}
