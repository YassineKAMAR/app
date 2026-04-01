package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import i7.b;
import i7.o;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.f0;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallEvent$$serializer implements j0<PaywallEvent> {
    public static final PaywallEvent$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        r1Var.l("creationData", false);
        r1Var.l("data", false);
        r1Var.l("type", false);
        descriptor = r1Var;
    }

    private PaywallEvent$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        return new b[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEvent$Data$$serializer.INSTANCE, f0.a("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values())};
    }

    @Override // i7.a
    public PaywallEvent deserialize(e decoder) {
        Object objC;
        int i8;
        Object objC2;
        Object objC3;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            objC = cVarC.C(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, null);
            objC2 = cVarC.C(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, null);
            objC3 = cVarC.C(descriptor2, 2, f0.a("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values()), null);
            i8 = 7;
        } else {
            objC = null;
            Object objC4 = null;
            Object objC5 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    objC = cVarC.C(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, objC);
                    i9 |= 1;
                } else if (iS == 1) {
                    objC4 = cVarC.C(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, objC4);
                    i9 |= 2;
                } else {
                    if (iS != 2) {
                        throw new o(iS);
                    }
                    objC5 = cVarC.C(descriptor2, 2, f0.a("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values()), objC5);
                    i9 |= 4;
                }
            }
            i8 = i9;
            objC2 = objC4;
            objC3 = objC5;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent(i8, (PaywallEvent.CreationData) objC, (PaywallEvent.Data) objC2, (PaywallEventType) objC3, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallEvent value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallEvent.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
