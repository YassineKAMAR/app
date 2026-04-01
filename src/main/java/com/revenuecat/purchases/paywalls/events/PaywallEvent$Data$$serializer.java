package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import i7.b;
import i7.o;
import java.util.UUID;
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
public final class PaywallEvent$Data$$serializer implements j0<PaywallEvent.Data> {
    public static final PaywallEvent$Data$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallEvent$Data$$serializer paywallEvent$Data$$serializer = new PaywallEvent$Data$$serializer();
        INSTANCE = paywallEvent$Data$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.events.PaywallEvent.Data", paywallEvent$Data$$serializer, 6);
        r1Var.l("offeringIdentifier", false);
        r1Var.l("paywallRevision", false);
        r1Var.l("sessionIdentifier", false);
        r1Var.l("displayMode", false);
        r1Var.l("localeIdentifier", false);
        r1Var.l("darkMode", false);
        descriptor = r1Var;
    }

    private PaywallEvent$Data$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        return new b[]{g2Var, s0.f25011a, UUIDSerializer.INSTANCE, g2Var, g2Var, i.f24935a};
    }

    @Override // i7.a
    public PaywallEvent.Data deserialize(e decoder) {
        boolean zW;
        Object objC;
        String str;
        String str2;
        int i8;
        int i9;
        String str3;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            String strP = cVarC.p(descriptor2, 0);
            int i10 = cVarC.i(descriptor2, 1);
            objC = cVarC.C(descriptor2, 2, UUIDSerializer.INSTANCE, null);
            String strP2 = cVarC.p(descriptor2, 3);
            String strP3 = cVarC.p(descriptor2, 4);
            str3 = strP;
            zW = cVarC.w(descriptor2, 5);
            str = strP2;
            str2 = strP3;
            i8 = i10;
            i9 = 63;
        } else {
            String strP4 = null;
            Object objC2 = null;
            String strP5 = null;
            String strP6 = null;
            boolean zW2 = false;
            int i11 = 0;
            int i12 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                switch (iS) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z7 = false;
                        continue;
                    case 0:
                        strP4 = cVarC.p(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        i12 = cVarC.i(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        objC2 = cVarC.C(descriptor2, 2, UUIDSerializer.INSTANCE, objC2);
                        i11 |= 4;
                        break;
                    case 3:
                        strP5 = cVarC.p(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        strP6 = cVarC.p(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        zW2 = cVarC.w(descriptor2, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new o(iS);
                }
            }
            zW = zW2;
            objC = objC2;
            str = strP5;
            str2 = strP6;
            i8 = i12;
            i9 = i11;
            str3 = strP4;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent.Data(i9, str3, i8, (UUID) objC, str, str2, zW, null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallEvent.Data value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallEvent.Data.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
