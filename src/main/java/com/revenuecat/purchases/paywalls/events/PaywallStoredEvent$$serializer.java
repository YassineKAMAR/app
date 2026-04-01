package com.revenuecat.purchases.paywalls.events;

import i7.b;
import i7.o;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.g2;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallStoredEvent$$serializer implements j0<PaywallStoredEvent> {
    public static final PaywallStoredEvent$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallStoredEvent$$serializer paywallStoredEvent$$serializer = new PaywallStoredEvent$$serializer();
        INSTANCE = paywallStoredEvent$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallStoredEvent", paywallStoredEvent$$serializer, 2);
        r1Var.l("event", false);
        r1Var.l("userID", false);
        descriptor = r1Var;
    }

    private PaywallStoredEvent$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        return new b[]{PaywallEvent$$serializer.INSTANCE, g2.f24923a};
    }

    @Override // i7.a
    public PaywallStoredEvent deserialize(e decoder) {
        Object objC;
        String strP;
        int i8;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            objC = cVarC.C(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, null);
            strP = cVarC.p(descriptor2, 1);
            i8 = 3;
        } else {
            objC = null;
            String strP2 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    objC = cVarC.C(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, objC);
                    i9 |= 1;
                } else {
                    if (iS != 1) {
                        throw new o(iS);
                    }
                    strP2 = cVarC.p(descriptor2, 1);
                    i9 |= 2;
                }
            }
            strP = strP2;
            i8 = i9;
        }
        cVarC.d(descriptor2);
        return new PaywallStoredEvent(i8, (PaywallEvent) objC, strP, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallStoredEvent value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallStoredEvent.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
