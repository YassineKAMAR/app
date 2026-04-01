package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import i7.b;
import i7.o;
import java.net.URL;
import java.util.Map;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.b2;
import m7.g2;
import m7.j0;
import m7.r1;
import m7.s0;
import m7.w0;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallData$$serializer implements j0<PaywallData> {
    public static final PaywallData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 5);
        r1Var.l("template_name", false);
        r1Var.l("config", false);
        r1Var.l("asset_base_url", false);
        r1Var.l("revision", true);
        r1Var.l("localized_strings", false);
        descriptor = r1Var;
    }

    private PaywallData$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        return new b[]{g2Var, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, s0.f25011a, new w0(g2Var, PaywallData$LocalizedConfiguration$$serializer.INSTANCE)};
    }

    @Override // i7.a
    public PaywallData deserialize(e decoder) {
        int i8;
        int i9;
        String str;
        Object objC;
        Object objC2;
        Object objC3;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i10 = 0;
        if (cVarC.y()) {
            String strP = cVarC.p(descriptor2, 0);
            objC = cVarC.C(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, null);
            objC2 = cVarC.C(descriptor2, 2, URLSerializer.INSTANCE, null);
            int i11 = cVarC.i(descriptor2, 3);
            objC3 = cVarC.C(descriptor2, 4, new w0(g2.f24923a, PaywallData$LocalizedConfiguration$$serializer.INSTANCE), null);
            str = strP;
            i8 = i11;
            i9 = 31;
        } else {
            String strP2 = null;
            Object objC4 = null;
            Object objC5 = null;
            Object objC6 = null;
            int i12 = 0;
            int i13 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS != 0) {
                    if (iS == 1) {
                        objC4 = cVarC.C(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, objC4);
                        i13 |= 2;
                    } else if (iS == 2) {
                        objC5 = cVarC.C(descriptor2, 2, URLSerializer.INSTANCE, objC5);
                        i13 |= 4;
                    } else if (iS == 3) {
                        i12 = cVarC.i(descriptor2, 3);
                        i13 |= 8;
                    } else {
                        if (iS != 4) {
                            throw new o(iS);
                        }
                        objC6 = cVarC.C(descriptor2, 4, new w0(g2.f24923a, PaywallData$LocalizedConfiguration$$serializer.INSTANCE), objC6);
                        i13 |= 16;
                    }
                    i10 = 0;
                } else {
                    strP2 = cVarC.p(descriptor2, i10);
                    i13 |= 1;
                }
            }
            i8 = i12;
            i9 = i13;
            str = strP2;
            objC = objC4;
            objC2 = objC5;
            objC3 = objC6;
        }
        cVarC.d(descriptor2);
        return new PaywallData(i9, str, (PaywallData.Configuration) objC, (URL) objC2, i8, (Map) objC3, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
