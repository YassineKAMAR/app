package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.paywalls.PaywallData;
import i7.b;
import i7.o;
import j7.a;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.b2;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallData$Configuration$ColorInformation$$serializer implements j0<PaywallData.Configuration.ColorInformation> {
    public static final PaywallData$Configuration$ColorInformation$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$Configuration$ColorInformation$$serializer paywallData$Configuration$ColorInformation$$serializer = new PaywallData$Configuration$ColorInformation$$serializer();
        INSTANCE = paywallData$Configuration$ColorInformation$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation", paywallData$Configuration$ColorInformation$$serializer, 2);
        r1Var.l("light", false);
        r1Var.l("dark", true);
        descriptor = r1Var;
    }

    private PaywallData$Configuration$ColorInformation$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
        return new b[]{paywallData$Configuration$Colors$$serializer, a.s(paywallData$Configuration$Colors$$serializer)};
    }

    @Override // i7.a
    public PaywallData.Configuration.ColorInformation deserialize(e decoder) {
        Object objX;
        Object objC;
        int i8;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
            objC = cVarC.C(descriptor2, 0, paywallData$Configuration$Colors$$serializer, null);
            objX = cVarC.x(descriptor2, 1, paywallData$Configuration$Colors$$serializer, null);
            i8 = 3;
        } else {
            objX = null;
            Object objC2 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    objC2 = cVarC.C(descriptor2, 0, PaywallData$Configuration$Colors$$serializer.INSTANCE, objC2);
                    i9 |= 1;
                } else {
                    if (iS != 1) {
                        throw new o(iS);
                    }
                    objX = cVarC.x(descriptor2, 1, PaywallData$Configuration$Colors$$serializer.INSTANCE, objX);
                    i9 |= 2;
                }
            }
            objC = objC2;
            i8 = i9;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.ColorInformation(i8, (PaywallData.Configuration.Colors) objC, (PaywallData.Configuration.Colors) objX, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.Configuration.ColorInformation value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.Configuration.ColorInformation.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
