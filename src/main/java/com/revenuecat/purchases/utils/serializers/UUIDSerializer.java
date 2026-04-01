package com.revenuecat.purchases.utils.serializers;

import i7.b;
import java.util.UUID;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class UUIDSerializer implements b<UUID> {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final f descriptor = i.a("UUID", e.i.f24258a);

    private UUIDSerializer() {
    }

    @Override // i7.a
    public UUID deserialize(l7.e decoder) {
        q.f(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.n());
        q.e(uuidFromString, "fromString(decoder.decodeString())");
        return uuidFromString;
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, UUID value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        String string = value.toString();
        q.e(string, "value.toString()");
        encoder.F(string);
    }
}
