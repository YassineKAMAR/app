package com.revenuecat.purchases.common.verification;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 extends r implements l<e6.r<? extends String, ? extends String>, CharSequence> {
    public static final SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 INSTANCE = new SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1();

    SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(e6.r<String, String> it) {
        q.f(it, "it");
        return it.c();
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ CharSequence invoke(e6.r<? extends String, ? extends String> rVar) {
        return invoke2((e6.r<String, String>) rVar);
    }
}
