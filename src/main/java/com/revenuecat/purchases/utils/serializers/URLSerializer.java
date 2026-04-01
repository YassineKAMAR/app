package com.revenuecat.purchases.utils.serializers;

import i7.b;
import java.net.URL;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class URLSerializer implements b<URL> {
    public static final URLSerializer INSTANCE = new URLSerializer();
    private static final f descriptor = i.a("URL", e.i.f24258a);

    private URLSerializer() {
    }

    @Override // i7.a
    public URL deserialize(l7.e decoder) {
        q.f(decoder, "decoder");
        return new URL(decoder.n());
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, URL value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        String string = value.toString();
        q.e(string, "value.toString()");
        encoder.F(string);
    }
}
