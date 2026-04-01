package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases_flutter.R;
import i7.b;
import i7.o;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.c1;
import m7.g2;
import m7.i;
import m7.j0;
import m7.r1;
import m7.s0;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallBackendEvent$$serializer implements j0<PaywallBackendEvent> {
    public static final PaywallBackendEvent$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallBackendEvent$$serializer paywallBackendEvent$$serializer = new PaywallBackendEvent$$serializer();
        INSTANCE = paywallBackendEvent$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallBackendEvent", paywallBackendEvent$$serializer, 11);
        r1Var.l("id", false);
        r1Var.l("version", false);
        r1Var.l("type", false);
        r1Var.l(Backend.APP_USER_ID, false);
        r1Var.l("session_id", false);
        r1Var.l("offering_id", false);
        r1Var.l("paywall_revision", false);
        r1Var.l(DiagnosticsEntry.Event.TIMESTAMP_KEY, false);
        r1Var.l("display_mode", false);
        r1Var.l("dark_mode", false);
        r1Var.l("locale", false);
        descriptor = r1Var;
    }

    private PaywallBackendEvent$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        s0 s0Var = s0.f25011a;
        return new b[]{g2Var, s0Var, g2Var, g2Var, g2Var, g2Var, s0Var, c1.f24890a, g2Var, i.f24935a, g2Var};
    }

    @Override // i7.a
    public PaywallBackendEvent deserialize(e decoder) {
        String strP;
        boolean z7;
        String str;
        int i8;
        String str2;
        int i9;
        long j8;
        int i10;
        String str3;
        String str4;
        String str5;
        String str6;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i11 = 0;
        if (cVarC.y()) {
            String strP2 = cVarC.p(descriptor2, 0);
            int i12 = cVarC.i(descriptor2, 1);
            String strP3 = cVarC.p(descriptor2, 2);
            String strP4 = cVarC.p(descriptor2, 3);
            String strP5 = cVarC.p(descriptor2, 4);
            String strP6 = cVarC.p(descriptor2, 5);
            int i13 = cVarC.i(descriptor2, 6);
            long jH = cVarC.h(descriptor2, 7);
            String strP7 = cVarC.p(descriptor2, 8);
            boolean zW = cVarC.w(descriptor2, 9);
            str = strP2;
            strP = cVarC.p(descriptor2, 10);
            z7 = zW;
            str2 = strP7;
            i10 = i13;
            str4 = strP6;
            str5 = strP4;
            str6 = strP5;
            str3 = strP3;
            i9 = i12;
            j8 = jH;
            i8 = 2047;
        } else {
            String strP8 = null;
            String strP9 = null;
            String strP10 = null;
            String strP11 = null;
            String strP12 = null;
            String strP13 = null;
            long jH2 = 0;
            boolean zW2 = false;
            int i14 = 0;
            int i15 = 0;
            boolean z8 = true;
            String strP14 = null;
            while (z8) {
                int iS = cVarC.s(descriptor2);
                switch (iS) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z8 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        strP8 = cVarC.p(descriptor2, 0);
                        continue;
                    case 1:
                        i15 = cVarC.i(descriptor2, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        strP13 = cVarC.p(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        strP11 = cVarC.p(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        strP12 = cVarC.p(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        strP10 = cVarC.p(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        i14 = cVarC.i(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        jH2 = cVarC.h(descriptor2, 7);
                        i11 |= 128;
                        break;
                    case 8:
                        strP9 = cVarC.p(descriptor2, 8);
                        i11 |= 256;
                        break;
                    case 9:
                        zW2 = cVarC.w(descriptor2, 9);
                        i11 |= 512;
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        strP14 = cVarC.p(descriptor2, 10);
                        i11 |= 1024;
                        break;
                    default:
                        throw new o(iS);
                }
            }
            strP = strP14;
            z7 = zW2;
            str = strP8;
            i8 = i11;
            str2 = strP9;
            i9 = i15;
            j8 = jH2;
            String str7 = strP13;
            i10 = i14;
            str3 = str7;
            String str8 = strP12;
            str4 = strP10;
            str5 = strP11;
            str6 = str8;
        }
        cVarC.d(descriptor2);
        return new PaywallBackendEvent(i8, str, i9, str3, str5, str6, str4, i10, j8, str2, z7, strP, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallBackendEvent value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallBackendEvent.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
