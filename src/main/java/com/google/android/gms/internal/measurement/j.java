package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f18818a;

    public j(Double d8) {
        if (d8 == null) {
            this.f18818a = Double.valueOf(Double.NaN);
        } else {
            this.f18818a = d8;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f18818a.equals(((j) obj).f18818a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        if ("toString".equals(str)) {
            return new t(n());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", n(), str));
    }

    public final int hashCode() {
        return this.f18818a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return new j(this.f18818a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return this.f18818a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        if (Double.isNaN(this.f18818a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f18818a.doubleValue())) {
            return this.f18818a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f18818a.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i8 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i8 >= 0 || i8 <= -7) && (i8 < 0 || i8 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.valueOf((Double.isNaN(this.f18818a.doubleValue()) || this.f18818a.doubleValue() == 0.0d) ? false : true);
    }

    public final String toString() {
        return n();
    }
}
