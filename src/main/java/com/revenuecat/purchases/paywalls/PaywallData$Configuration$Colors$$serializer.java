package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.PaywallColor;
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
public final class PaywallData$Configuration$Colors$$serializer implements j0<PaywallData.Configuration.Colors> {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 10);
        r1Var.l("background", false);
        r1Var.l("text_1", false);
        r1Var.l("text_2", true);
        r1Var.l("text_3", true);
        r1Var.l("call_to_action_background", false);
        r1Var.l("call_to_action_foreground", false);
        r1Var.l("call_to_action_secondary_background", true);
        r1Var.l("accent_1", true);
        r1Var.l("accent_2", true);
        r1Var.l("accent_3", true);
        descriptor = r1Var;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{serializer, serializer, a.s(serializer), a.s(serializer), serializer, serializer, a.s(serializer), a.s(serializer), a.s(serializer), a.s(serializer)};
    }

    @Override // i7.a
    public PaywallData.Configuration.Colors deserialize(e decoder) {
        Object objX;
        Object objC;
        Object objC2;
        int i8;
        Object objX2;
        Object objX3;
        Object objX4;
        Object objC3;
        Object objX5;
        Object objC4;
        Object objX6;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i9 = 9;
        Object objC5 = null;
        if (cVarC.y()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            objC4 = cVarC.C(descriptor2, 0, serializer, null);
            Object objC6 = cVarC.C(descriptor2, 1, serializer, null);
            objX6 = cVarC.x(descriptor2, 2, serializer, null);
            objX5 = cVarC.x(descriptor2, 3, serializer, null);
            Object objC7 = cVarC.C(descriptor2, 4, serializer, null);
            objC3 = cVarC.C(descriptor2, 5, serializer, null);
            objX4 = cVarC.x(descriptor2, 6, serializer, null);
            Object objX7 = cVarC.x(descriptor2, 7, serializer, null);
            objX3 = cVarC.x(descriptor2, 8, serializer, null);
            objX2 = cVarC.x(descriptor2, 9, serializer, null);
            objC2 = objC6;
            objC = objC7;
            objX = objX7;
            i8 = 1023;
        } else {
            Object objX8 = null;
            Object objX9 = null;
            Object objX10 = null;
            objX = null;
            Object objC8 = null;
            Object objX11 = null;
            objC = null;
            objC2 = null;
            Object objX12 = null;
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
                        objC5 = cVarC.C(descriptor2, 0, PaywallColor.Serializer.INSTANCE, objC5);
                        i10 |= 1;
                        i9 = 9;
                        break;
                    case 1:
                        objC2 = cVarC.C(descriptor2, 1, PaywallColor.Serializer.INSTANCE, objC2);
                        i10 |= 2;
                        i9 = 9;
                        break;
                    case 2:
                        objX12 = cVarC.x(descriptor2, 2, PaywallColor.Serializer.INSTANCE, objX12);
                        i10 |= 4;
                        i9 = 9;
                        break;
                    case 3:
                        objX11 = cVarC.x(descriptor2, 3, PaywallColor.Serializer.INSTANCE, objX11);
                        i10 |= 8;
                        i9 = 9;
                        break;
                    case 4:
                        objC = cVarC.C(descriptor2, 4, PaywallColor.Serializer.INSTANCE, objC);
                        i10 |= 16;
                        i9 = 9;
                        break;
                    case 5:
                        objC8 = cVarC.C(descriptor2, 5, PaywallColor.Serializer.INSTANCE, objC8);
                        i10 |= 32;
                        i9 = 9;
                        break;
                    case 6:
                        objX10 = cVarC.x(descriptor2, 6, PaywallColor.Serializer.INSTANCE, objX10);
                        i10 |= 64;
                        i9 = 9;
                        break;
                    case 7:
                        objX = cVarC.x(descriptor2, 7, PaywallColor.Serializer.INSTANCE, objX);
                        i10 |= 128;
                        i9 = 9;
                        break;
                    case 8:
                        objX9 = cVarC.x(descriptor2, 8, PaywallColor.Serializer.INSTANCE, objX9);
                        i10 |= 256;
                        break;
                    case 9:
                        objX8 = cVarC.x(descriptor2, i9, PaywallColor.Serializer.INSTANCE, objX8);
                        i10 |= 512;
                        break;
                    default:
                        throw new o(iS);
                }
            }
            i8 = i10;
            objX2 = objX8;
            objX3 = objX9;
            objX4 = objX10;
            objC3 = objC8;
            objX5 = objX11;
            objC4 = objC5;
            objX6 = objX12;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.Colors(i8, (PaywallColor) objC4, (PaywallColor) objC2, (PaywallColor) objX6, (PaywallColor) objX5, (PaywallColor) objC, (PaywallColor) objC3, (PaywallColor) objX4, (PaywallColor) objX, (PaywallColor) objX3, (PaywallColor) objX2, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.Configuration.Colors value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.Configuration.Colors.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
