package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import i7.b;
import i7.o;
import j7.a;
import java.net.URL;
import java.util.List;
import k7.f;
import kotlin.jvm.internal.q;
import l7.c;
import l7.d;
import l7.e;
import m7.b2;
import m7.g2;
import m7.i;
import m7.j0;
import m7.r1;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallData$Configuration$$serializer implements j0<PaywallData.Configuration> {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 9);
        r1Var.l("packages", false);
        r1Var.l("default_package", true);
        r1Var.l("images_webp", true);
        r1Var.l("images", true);
        r1Var.l("blurred_background_image", true);
        r1Var.l("display_restore_purchases", true);
        r1Var.l("tos_url", true);
        r1Var.l("privacy_url", true);
        r1Var.l("colors", false);
        descriptor = r1Var;
    }

    private PaywallData$Configuration$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        g2 g2Var = g2.f24923a;
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        i iVar = i.f24935a;
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        return new b[]{new m7.f(g2Var), a.s(g2Var), a.s(paywallData$Configuration$Images$$serializer), a.s(paywallData$Configuration$Images$$serializer), iVar, iVar, a.s(optionalURLSerializer), a.s(optionalURLSerializer), PaywallData$Configuration$ColorInformation$$serializer.INSTANCE};
    }

    @Override // i7.a
    public PaywallData.Configuration deserialize(e decoder) {
        Object objX;
        Object objX2;
        Object objX3;
        Object objC;
        Object objX4;
        Object objX5;
        boolean z7;
        int i8;
        boolean z8;
        Object objC2;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        int i9 = 7;
        int i10 = 6;
        if (cVarC.y()) {
            g2 g2Var = g2.f24923a;
            objC2 = cVarC.C(descriptor2, 0, new m7.f(g2Var), null);
            Object objX6 = cVarC.x(descriptor2, 1, g2Var, null);
            PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
            objX5 = cVarC.x(descriptor2, 2, paywallData$Configuration$Images$$serializer, null);
            Object objX7 = cVarC.x(descriptor2, 3, paywallData$Configuration$Images$$serializer, null);
            boolean zW = cVarC.w(descriptor2, 4);
            boolean zW2 = cVarC.w(descriptor2, 5);
            OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
            objX4 = cVarC.x(descriptor2, 6, optionalURLSerializer, null);
            objX3 = cVarC.x(descriptor2, 7, optionalURLSerializer, null);
            objC = cVarC.C(descriptor2, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, null);
            z8 = zW2;
            z7 = zW;
            objX2 = objX6;
            objX = objX7;
            i8 = 511;
        } else {
            Object objX8 = null;
            Object objC3 = null;
            Object objX9 = null;
            objX = null;
            Object objX10 = null;
            Object objC4 = null;
            objX2 = null;
            boolean zW3 = false;
            boolean zW4 = false;
            int i11 = 0;
            boolean z9 = true;
            while (z9) {
                int iS = cVarC.s(descriptor2);
                switch (iS) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        i10 = 6;
                        z9 = false;
                        break;
                    case 0:
                        objC4 = cVarC.C(descriptor2, 0, new m7.f(g2.f24923a), objC4);
                        i11 |= 1;
                        i9 = 7;
                        i10 = 6;
                        break;
                    case 1:
                        objX2 = cVarC.x(descriptor2, 1, g2.f24923a, objX2);
                        i11 |= 2;
                        i9 = 7;
                        i10 = 6;
                        break;
                    case 2:
                        objX10 = cVarC.x(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, objX10);
                        i11 |= 4;
                        i9 = 7;
                        i10 = 6;
                        break;
                    case 3:
                        objX = cVarC.x(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, objX);
                        i11 |= 8;
                        i9 = 7;
                        i10 = 6;
                        break;
                    case 4:
                        i11 |= 16;
                        zW4 = cVarC.w(descriptor2, 4);
                        break;
                    case 5:
                        zW3 = cVarC.w(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        objX9 = cVarC.x(descriptor2, i10, OptionalURLSerializer.INSTANCE, objX9);
                        i11 |= 64;
                        break;
                    case 7:
                        objX8 = cVarC.x(descriptor2, i9, OptionalURLSerializer.INSTANCE, objX8);
                        i11 |= 128;
                        break;
                    case 8:
                        objC3 = cVarC.C(descriptor2, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, objC3);
                        i11 |= 256;
                        break;
                    default:
                        throw new o(iS);
                }
            }
            objX3 = objX8;
            objC = objC3;
            objX4 = objX9;
            objX5 = objX10;
            z7 = zW4;
            i8 = i11;
            z8 = zW3;
            objC2 = objC4;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration(i8, (List) objC2, (String) objX2, (PaywallData.Configuration.Images) objX5, (PaywallData.Configuration.Images) objX, z7, z8, (URL) objX4, (URL) objX3, (PaywallData.Configuration.ColorInformation) objC, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.Configuration value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.Configuration.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
