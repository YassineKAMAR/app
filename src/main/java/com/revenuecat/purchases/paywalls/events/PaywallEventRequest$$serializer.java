package com.revenuecat.purchases.paywalls.events;

import i7.b;
import i7.o;
import java.util.List;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallEventRequest$$serializer implements j0<PaywallEventRequest> {
    public static final PaywallEventRequest$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallEventRequest$$serializer paywallEventRequest$$serializer = new PaywallEventRequest$$serializer();
        INSTANCE = paywallEventRequest$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallEventRequest", paywallEventRequest$$serializer, 1);
        r1Var.l("events", false);
        descriptor = r1Var;
    }

    private PaywallEventRequest$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        return new b[]{new m7.f(PaywallBackendEvent$$serializer.INSTANCE)};
    }

    @Override // i7.a
    public PaywallEventRequest deserialize(e decoder) {
        Object objC;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i8 = 1;
        if (cVarC.y()) {
            objC = cVarC.C(descriptor2, 0, new m7.f(PaywallBackendEvent$$serializer.INSTANCE), null);
        } else {
            objC = null;
            int i9 = 0;
            while (i8 != 0) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    i8 = 0;
                } else {
                    if (iS != 0) {
                        throw new o(iS);
                    }
                    objC = cVarC.C(descriptor2, 0, new m7.f(PaywallBackendEvent$$serializer.INSTANCE), objC);
                    i9 |= 1;
                }
            }
            i8 = i9;
        }
        cVarC.d(descriptor2);
        return new PaywallEventRequest(i8, (List) objC, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallEventRequest value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallEventRequest.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
