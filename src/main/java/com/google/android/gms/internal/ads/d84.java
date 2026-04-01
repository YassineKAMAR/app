package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class d84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedHashMap f6617a;

    d84(int i8) {
        this.f6617a = f84.b(i8);
    }

    final d84 a(Object obj, w84 w84Var) {
        r84.a(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        r84.a(w84Var, "provider");
        this.f6617a.put(obj, w84Var);
        return this;
    }
}
