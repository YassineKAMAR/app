package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public class SerializationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializationException(String message, Throwable th) {
        super(message, th);
        q.f(message, "message");
    }

    public /* synthetic */ SerializationException(String str, Throwable th, int i8, j jVar) {
        this(str, (i8 & 2) != 0 ? null : th);
    }
}
