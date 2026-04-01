package com.revenuecat.purchases.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(p pVar, byte[] byteArray) {
        q.f(pVar, "<this>");
        q.f(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
