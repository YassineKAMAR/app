package com.revenuecat.purchases.paywalls;

import i7.b;
import j7.a;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class EmptyStringToNullSerializer implements b<String> {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final b<String> delegate = a.s(a.G(c0.f24298a));
    private static final f descriptor = i.a("EmptyStringToNullSerializer", e.i.f24258a);

    private EmptyStringToNullSerializer() {
    }

    @Override // i7.a
    public String deserialize(l7.e decoder) {
        q.f(decoder, "decoder");
        String strDeserialize = delegate.deserialize(decoder);
        if (strDeserialize == null || !(!v.p(strDeserialize))) {
            return null;
        }
        return strDeserialize;
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, String str) {
        q.f(encoder, "encoder");
        if (str == null) {
            str = "";
        }
        encoder.F(str);
    }
}
