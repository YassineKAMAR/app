package com.revenuecat.purchases.paywalls;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.PaywallData;
import i7.o;
import j7.a;
import java.util.List;
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
public final class PaywallData$LocalizedConfiguration$$serializer implements j0<PaywallData.LocalizedConfiguration> {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 10);
        r1Var.l(b.S, false);
        r1Var.l("subtitle", true);
        r1Var.l("call_to_action", false);
        r1Var.l("call_to_action_with_intro_offer", true);
        r1Var.l("call_to_action_with_multiple_intro_offers", true);
        r1Var.l("offer_details", true);
        r1Var.l("offer_details_with_intro_offer", true);
        r1Var.l("offer_details_with_multiple_intro_offers", true);
        r1Var.l("offer_name", true);
        r1Var.l("features", true);
        descriptor = r1Var;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // m7.j0
    public i7.b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new i7.b[]{g2Var, a.s(emptyStringToNullSerializer), g2Var, a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), new m7.f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE)};
    }

    @Override // i7.a
    public PaywallData.LocalizedConfiguration deserialize(e decoder) {
        Object objX;
        Object objX2;
        Object objX3;
        Object objX4;
        Object objC;
        Object objX5;
        Object objX6;
        Object objX7;
        String str;
        String str2;
        int i8;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i9 = 9;
        String strP = null;
        if (cVarC.y()) {
            String strP2 = cVarC.p(descriptor2, 0);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            Object objX8 = cVarC.x(descriptor2, 1, emptyStringToNullSerializer, null);
            String strP3 = cVarC.p(descriptor2, 2);
            Object objX9 = cVarC.x(descriptor2, 3, emptyStringToNullSerializer, null);
            Object objX10 = cVarC.x(descriptor2, 4, emptyStringToNullSerializer, null);
            Object objX11 = cVarC.x(descriptor2, 5, emptyStringToNullSerializer, null);
            objX6 = cVarC.x(descriptor2, 6, emptyStringToNullSerializer, null);
            objX7 = cVarC.x(descriptor2, 7, emptyStringToNullSerializer, null);
            objX5 = cVarC.x(descriptor2, 8, emptyStringToNullSerializer, null);
            objC = cVarC.C(descriptor2, 9, new m7.f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), null);
            objX2 = objX9;
            objX4 = objX8;
            str = strP2;
            objX3 = objX10;
            str2 = strP3;
            objX = objX11;
            i8 = 1023;
        } else {
            Object objC2 = null;
            Object objX12 = null;
            Object objX13 = null;
            Object objX14 = null;
            objX = null;
            objX2 = null;
            objX3 = null;
            objX4 = null;
            String strP4 = null;
            int i10 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                switch (iS) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        i9 = 9;
                        z7 = false;
                        break;
                    case 0:
                        strP = cVarC.p(descriptor2, 0);
                        i10 |= 1;
                        i9 = 9;
                        break;
                    case 1:
                        objX4 = cVarC.x(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objX4);
                        i10 |= 2;
                        i9 = 9;
                        break;
                    case 2:
                        strP4 = cVarC.p(descriptor2, 2);
                        i10 |= 4;
                        i9 = 9;
                        break;
                    case 3:
                        objX2 = cVarC.x(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objX2);
                        i10 |= 8;
                        i9 = 9;
                        break;
                    case 4:
                        objX3 = cVarC.x(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objX3);
                        i10 |= 16;
                        i9 = 9;
                        break;
                    case 5:
                        objX = cVarC.x(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, objX);
                        i10 |= 32;
                        i9 = 9;
                        break;
                    case 6:
                        objX13 = cVarC.x(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, objX13);
                        i10 |= 64;
                        i9 = 9;
                        break;
                    case 7:
                        objX14 = cVarC.x(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, objX14);
                        i10 |= 128;
                        i9 = 9;
                        break;
                    case 8:
                        objX12 = cVarC.x(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, objX12);
                        i10 |= 256;
                        break;
                    case 9:
                        objC2 = cVarC.C(descriptor2, i9, new m7.f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), objC2);
                        i10 |= 512;
                        break;
                    default:
                        throw new o(iS);
                }
            }
            objC = objC2;
            objX5 = objX12;
            objX6 = objX13;
            objX7 = objX14;
            str = strP;
            str2 = strP4;
            i8 = i10;
        }
        cVarC.d(descriptor2);
        return new PaywallData.LocalizedConfiguration(i8, str, (String) objX4, str2, (String) objX2, (String) objX3, (String) objX, (String) objX6, (String) objX7, (String) objX5, (List) objC, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.LocalizedConfiguration value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public i7.b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
