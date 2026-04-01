package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import i7.b;
import i7.o;
import java.util.Date;
import java.util.UUID;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallEvent$CreationData$$serializer implements j0<PaywallEvent.CreationData> {
    public static final PaywallEvent$CreationData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallEvent$CreationData$$serializer paywallEvent$CreationData$$serializer = new PaywallEvent$CreationData$$serializer();
        INSTANCE = paywallEvent$CreationData$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData", paywallEvent$CreationData$$serializer, 2);
        r1Var.l("id", false);
        r1Var.l("date", false);
        descriptor = r1Var;
    }

    private PaywallEvent$CreationData$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        return new b[]{UUIDSerializer.INSTANCE, DateSerializer.INSTANCE};
    }

    @Override // i7.a
    public PaywallEvent.CreationData deserialize(e decoder) {
        Object objC;
        Object objC2;
        int i8;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            objC = cVarC.C(descriptor2, 0, UUIDSerializer.INSTANCE, null);
            objC2 = cVarC.C(descriptor2, 1, DateSerializer.INSTANCE, null);
            i8 = 3;
        } else {
            objC = null;
            Object objC3 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    objC = cVarC.C(descriptor2, 0, UUIDSerializer.INSTANCE, objC);
                    i9 |= 1;
                } else {
                    if (iS != 1) {
                        throw new o(iS);
                    }
                    objC3 = cVarC.C(descriptor2, 1, DateSerializer.INSTANCE, objC3);
                    i9 |= 2;
                }
            }
            objC2 = objC3;
            i8 = i9;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent.CreationData(i8, (UUID) objC, (Date) objC2, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallEvent.CreationData value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallEvent.CreationData.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
