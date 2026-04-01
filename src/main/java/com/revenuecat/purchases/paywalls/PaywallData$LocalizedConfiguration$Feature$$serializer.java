package com.revenuecat.purchases.paywalls;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.PaywallData;
import i7.o;
import j7.a;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.b2;
import m7.g2;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements j0<PaywallData.LocalizedConfiguration.Feature> {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        r1Var.l(b.S, false);
        r1Var.l("content", true);
        r1Var.l("icon_id", true);
        descriptor = r1Var;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    @Override // m7.j0
    public i7.b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        return new i7.b[]{g2Var, a.s(g2Var), a.s(g2Var)};
    }

    @Override // i7.a
    public PaywallData.LocalizedConfiguration.Feature deserialize(e decoder) {
        Object objX;
        String str;
        Object objX2;
        int i8;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        String strP = null;
        if (cVarC.y()) {
            String strP2 = cVarC.p(descriptor2, 0);
            g2 g2Var = g2.f24923a;
            objX = cVarC.x(descriptor2, 1, g2Var, null);
            objX2 = cVarC.x(descriptor2, 2, g2Var, null);
            str = strP2;
            i8 = 7;
        } else {
            Object objX3 = null;
            Object objX4 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    strP = cVarC.p(descriptor2, 0);
                    i9 |= 1;
                } else if (iS == 1) {
                    objX3 = cVarC.x(descriptor2, 1, g2.f24923a, objX3);
                    i9 |= 2;
                } else {
                    if (iS != 2) {
                        throw new o(iS);
                    }
                    objX4 = cVarC.x(descriptor2, 2, g2.f24923a, objX4);
                    i9 |= 4;
                }
            }
            objX = objX3;
            str = strP;
            objX2 = objX4;
            i8 = i9;
        }
        cVarC.d(descriptor2);
        return new PaywallData.LocalizedConfiguration.Feature(i8, str, (String) objX, (String) objX2, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.LocalizedConfiguration.Feature value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public i7.b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
