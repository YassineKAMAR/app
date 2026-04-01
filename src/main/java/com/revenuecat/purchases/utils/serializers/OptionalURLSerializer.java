package com.revenuecat.purchases.utils.serializers;

import i7.b;
import j7.a;
import java.net.MalformedURLException;
import java.net.URL;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class OptionalURLSerializer implements b<URL> {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final b<URL> delegate = a.s(URLSerializer.INSTANCE);
    private static final f descriptor = i.a("URL?", e.i.f24258a);

    private OptionalURLSerializer() {
    }

    @Override // i7.a
    public URL deserialize(l7.e decoder) {
        q.f(decoder, "decoder");
        try {
            return delegate.deserialize(decoder);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, URL url) {
        q.f(encoder, "encoder");
        if (url == null) {
            encoder.F("");
        } else {
            delegate.serialize(encoder, url);
        }
    }
}
