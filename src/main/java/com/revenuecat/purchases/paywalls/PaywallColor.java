package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import android.os.Build;
import i7.b;
import java.util.Arrays;
import java.util.Locale;
import k7.e;
import k7.f;
import k7.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallColor {
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    public static final class Serializer implements b<PaywallColor> {
        public static final Serializer INSTANCE = new Serializer();
        private static final f descriptor = i.a("PaywallColor", e.i.f24258a);

        private Serializer() {
        }

        @Override // i7.a
        public PaywallColor deserialize(l7.e decoder) {
            q.f(decoder, "decoder");
            return new PaywallColor(decoder.n());
        }

        @Override // i7.b, i7.j, i7.a
        public f getDescriptor() {
            return descriptor;
        }

        @Override // i7.j
        public void serialize(l7.f encoder, PaywallColor value) {
            q.f(encoder, "encoder");
            q.f(value, "value");
            encoder.F(value.toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallColor(int i8) {
        c0 c0Var = c0.f24298a;
        String str = String.format(Locale.US, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i8)}, 1));
        q.e(str, "format(locale, format, *args)");
        this(str, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(i8) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallColor(String stringRepresentation) {
        this(stringRepresentation, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(Color.parseColor(stringRepresentation)) : null);
        q.f(stringRepresentation, "stringRepresentation");
    }

    public PaywallColor(String stringRepresentation, Color color) {
        q.f(stringRepresentation, "stringRepresentation");
        this.stringRepresentation = stringRepresentation;
        this.underlyingColor = color;
        this.colorInt = Color.parseColor(stringRepresentation);
    }

    public static /* synthetic */ PaywallColor copy$default(PaywallColor paywallColor, String str, Color color, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = paywallColor.stringRepresentation;
        }
        if ((i8 & 2) != 0) {
            color = paywallColor.underlyingColor;
        }
        return paywallColor.copy(str, color);
    }

    public final String component1() {
        return this.stringRepresentation;
    }

    public final Color component2() {
        return this.underlyingColor;
    }

    public final PaywallColor copy(String stringRepresentation, Color color) {
        q.f(stringRepresentation, "stringRepresentation");
        return new PaywallColor(stringRepresentation, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) obj;
        return q.b(this.stringRepresentation, paywallColor.stringRepresentation) && q.b(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int iHashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }
}
