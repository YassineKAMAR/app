package com.revenuecat.purchases.utils.serializers;

import i7.b;
import java.util.Date;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.q;
import l7.e;

/* JADX INFO: loaded from: classes.dex */
public final class DateSerializer implements b<Date> {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // i7.a
    public Date deserialize(e decoder) {
        q.f(decoder, "decoder");
        return new Date(decoder.q());
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return i.a("Date", e.g.f24256a);
    }

    @Override // i7.j
    public void serialize(l7.f encoder, Date value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        encoder.B(value.getTime());
    }
}
