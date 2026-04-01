package com.android.billingclient.api;

import com.android.billingclient.api.f;
import com.revenuecat.purchases.google.ErrorsKt;

/* JADX INFO: loaded from: classes.dex */
final class z {
    static final f A;
    static final f B;
    static final f C;
    static final f D;
    static final f E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f4651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final f f4652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final f f4653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final f f4654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f4655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final f f4656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final f f4657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final f f4658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final f f4659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final f f4660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final f f4661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final f f4662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final f f4663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final f f4664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final f f4665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final f f4666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final f f4667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final f f4668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final f f4669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final f f4670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final f f4671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final f f4672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final f f4673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final f f4674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final f f4675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final f f4676z;

    static {
        f.a aVarC = f.c();
        aVarC.c(3);
        aVarC.b(ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE);
        f4651a = aVarC.a();
        f.a aVarC2 = f.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f4652b = aVarC2.a();
        f.a aVarC3 = f.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f4653c = aVarC3.a();
        f.a aVarC4 = f.c();
        aVarC4.c(5);
        aVarC4.b("Client is already in the process of connecting to billing service.");
        f4654d = aVarC4.a();
        f.a aVarC5 = f.c();
        aVarC5.c(5);
        aVarC5.b("The list of SKUs can't be empty.");
        f4655e = aVarC5.a();
        f.a aVarC6 = f.c();
        aVarC6.c(5);
        aVarC6.b("SKU type can't be empty.");
        f4656f = aVarC6.a();
        f.a aVarC7 = f.c();
        aVarC7.c(5);
        aVarC7.b("Product type can't be empty.");
        f4657g = aVarC7.a();
        f.a aVarC8 = f.c();
        aVarC8.c(-2);
        aVarC8.b("Client does not support extra params.");
        f4658h = aVarC8.a();
        f.a aVarC9 = f.c();
        aVarC9.c(5);
        aVarC9.b("Invalid purchase token.");
        f4659i = aVarC9.a();
        f.a aVarC10 = f.c();
        aVarC10.c(6);
        aVarC10.b("An internal error occurred.");
        f4660j = aVarC10.a();
        f.a aVarC11 = f.c();
        aVarC11.c(5);
        aVarC11.b("SKU can't be null.");
        f4661k = aVarC11.a();
        f.a aVarC12 = f.c();
        aVarC12.c(0);
        f4662l = aVarC12.a();
        f.a aVarC13 = f.c();
        aVarC13.c(-1);
        aVarC13.b("Service connection is disconnected.");
        f4663m = aVarC13.a();
        f.a aVarC14 = f.c();
        aVarC14.c(2);
        aVarC14.b("Timeout communicating with service.");
        f4664n = aVarC14.a();
        f.a aVarC15 = f.c();
        aVarC15.c(-2);
        aVarC15.b("Client does not support subscriptions.");
        f4665o = aVarC15.a();
        f.a aVarC16 = f.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions update.");
        f4666p = aVarC16.a();
        f.a aVarC17 = f.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support get purchase history.");
        f4667q = aVarC17.a();
        f.a aVarC18 = f.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support price change confirmation.");
        f4668r = aVarC18.a();
        f.a aVarC19 = f.c();
        aVarC19.c(-2);
        aVarC19.b("Play Store version installed does not support cross selling products.");
        f4669s = aVarC19.a();
        f.a aVarC20 = f.c();
        aVarC20.c(-2);
        aVarC20.b("Client does not support multi-item purchases.");
        f4670t = aVarC20.a();
        f.a aVarC21 = f.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support offer_id_token.");
        f4671u = aVarC21.a();
        f.a aVarC22 = f.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support ProductDetails.");
        f4672v = aVarC22.a();
        f.a aVarC23 = f.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support in-app messages.");
        f4673w = aVarC23.a();
        f.a aVarC24 = f.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support user choice billing.");
        f4674x = aVarC24.a();
        f.a aVarC25 = f.c();
        aVarC25.c(5);
        aVarC25.b("Unknown feature");
        f4675y = aVarC25.a();
        f.a aVarC26 = f.c();
        aVarC26.c(-2);
        aVarC26.b("Play Store version installed does not support get billing config.");
        f4676z = aVarC26.a();
        f.a aVarC27 = f.c();
        aVarC27.c(-2);
        aVarC27.b("Query product details with serialized docid is not supported.");
        A = aVarC27.a();
        f.a aVarC28 = f.c();
        aVarC28.c(4);
        aVarC28.b("Item is unavailable for purchase.");
        B = aVarC28.a();
        f.a aVarC29 = f.c();
        aVarC29.c(-2);
        aVarC29.b("Query product details with developer specified account is not supported.");
        C = aVarC29.a();
        f.a aVarC30 = f.c();
        aVarC30.c(-2);
        aVarC30.b("Play Store version installed does not support alternative billing only.");
        D = aVarC30.a();
        f.a aVarC31 = f.c();
        aVarC31.c(5);
        aVarC31.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        E = aVarC31.a();
    }

    static f a(int i8, String str) {
        f.a aVarC = f.c();
        aVarC.c(i8);
        aVarC.b(str);
        return aVarC.a();
    }
}
