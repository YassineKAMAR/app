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
public final class PaywallData$Configuration$Images$$serializer implements j0<PaywallData.Configuration.Images> {
    public static final PaywallData$Configuration$Images$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = new PaywallData$Configuration$Images$$serializer();
        INSTANCE = paywallData$Configuration$Images$$serializer;
        r1 r1Var = new r1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images", paywallData$Configuration$Images$$serializer, 3);
        r1Var.l("header", true);
        r1Var.l("background", true);
        r1Var.l("icon", true);
        descriptor = r1Var;
    }

    private PaywallData$Configuration$Images$$serializer() {
    }

    @Override // m7.j0
    public b<?>[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new b[]{a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer), a.s(emptyStringToNullSerializer)};
    }

    @Override // i7.a
    public PaywallData.Configuration.Images deserialize(e decoder) {
        Object objX;
        int i8;
        Object objX2;
        Object objX3;
        q.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = decoder.c(descriptor2);
        if (cVarC.y()) {
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            objX = cVarC.x(descriptor2, 0, emptyStringToNullSerializer, null);
            objX2 = cVarC.x(descriptor2, 1, emptyStringToNullSerializer, null);
            objX3 = cVarC.x(descriptor2, 2, emptyStringToNullSerializer, null);
            i8 = 7;
        } else {
            Object objX4 = null;
            Object objX5 = null;
            Object objX6 = null;
            int i9 = 0;
            boolean z7 = true;
            while (z7) {
                int iS = cVarC.s(descriptor2);
                if (iS == -1) {
                    z7 = false;
                } else if (iS == 0) {
                    objX4 = cVarC.x(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, objX4);
                    i9 |= 1;
                } else if (iS == 1) {
                    objX5 = cVarC.x(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objX5);
                    i9 |= 2;
                } else {
                    if (iS != 2) {
                        throw new o(iS);
                    }
                    objX6 = cVarC.x(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objX6);
                    i9 |= 4;
                }
            }
            objX = objX4;
            i8 = i9;
            objX2 = objX5;
            objX3 = objX6;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.Images(i8, (String) objX, (String) objX2, (String) objX3, (b2) null);
    }

    @Override // i7.b, i7.j, i7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // i7.j
    public void serialize(l7.f encoder, PaywallData.Configuration.Images value) {
        q.f(encoder, "encoder");
        q.f(value, "value");
        f descriptor2 = getDescriptor();
        d dVarC = encoder.c(descriptor2);
        PaywallData.Configuration.Images.write$Self(value, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // m7.j0
    public b<?>[] typeParametersSerializers() {
        return j0.a.a(this);
    }
}
