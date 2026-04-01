package com.revenuecat.purchases.paywalls.events;

import i7.b;
import i7.o;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.g2;
import m7.i;
import m7.j0;
import m7.r1;
import m7.s0;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallPostReceiptData$$serializer implements j0<PaywallPostReceiptData> {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 5);
        r1Var.l("session_id", false);
        r1Var.l("paywall_revision", false);
        r1Var.l("display_mode", false);
        r1Var.l("dark_mode", false);
        r1Var.l("locale", false);
        descriptor = r1Var;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        return new b[]{g2Var, s0.f25011a, g2Var, i.f24935a, g2Var};
    }

    @Override // i7.a
    public PaywallPostReceiptData deserialize(e decoder) {
        String str;
        boolean zW;
        String strP;
        String str2;
        int i8;
        int i9;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            String strP2 = cVarC.p(descriptor2, 0);
            int i10 = cVarC.i(descriptor2, 1);
            String strP3 = cVarC.p(descriptor2, 2);
            str = strP2;
            zW = cVarC.w(descriptor2, 3);
            strP = cVarC.p(descriptor2, 4);
            str2 = strP3;
            i8 = i10;
            i9 = 31;
        } else {
            String strP4 = null;
            String strP5 = null;
            String strP6 = null;
            boolean zW2 = false;
            int i11 = 0;
            int i12 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    strP4 = cVarC.p(descriptor2, 0);
                    i12 |= 1;
                } else if (iS == 1) {
                    i11 = cVarC.i(descriptor2, 1);
                    i12 |= 2;
                } else if (iS == 2) {
                    strP6 = cVarC.p(descriptor2, 2);
                    i12 |= 4;
                } else if (iS == 3) {
                    zW2 = cVarC.w(descriptor2, 3);
                    i12 |= 8;
                } else {
                    if (iS != 4) {
                        throw new o(iS);
                    }
                    strP5 = cVarC.p(descriptor2, 4);
                    i12 |= 16;
                }
            }
            str = strP4;
            zW = zW2;
            strP = strP5;
            str2 = strP6;
            i8 = i11;
            i9 = i12;
        }
        cVarC.d(descriptor2);
        return new PaywallPostReceiptData(i9, str, i8, str2, zW, strP, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallPostReceiptData value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallPostReceiptData.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
