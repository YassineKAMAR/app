package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b3.b;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.y4;
import com.google.android.gms.internal.measurement.yf;
import com.google.android.gms.measurement.internal.y6;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class db extends ua {
    db(va vaVar) {
        super(vaVar);
    }

    private final Bundle B(Map<String, Object> map, boolean z7) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z7) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    arrayList2.add(B((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    static com.google.android.gms.internal.measurement.y4 E(com.google.android.gms.internal.measurement.w4 w4Var, String str) {
        for (com.google.android.gms.internal.measurement.y4 y4Var : w4Var.b0()) {
            if (y4Var.b0().equals(str)) {
                return y4Var;
            }
        }
        return null;
    }

    static <BuilderT extends com.google.android.gms.internal.measurement.pa> BuilderT F(BuilderT buildert, byte[] bArr) {
        com.google.android.gms.internal.measurement.l8 l8VarA = com.google.android.gms.internal.measurement.l8.a();
        return l8VarA != null ? (BuilderT) buildert.g(bArr, l8VarA) : (BuilderT) buildert.b(bArr);
    }

    private static String L(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j8 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i8 << 6) + i9;
                if (i10 < bitSet.length()) {
                    if (bitSet.get(i10)) {
                        j8 |= 1 << i9;
                    }
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    private static void P(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f3942a);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    static void R(w4.a aVar, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.y4> listH = aVar.H();
        int i8 = 0;
        while (true) {
            if (i8 >= listH.size()) {
                i8 = -1;
                break;
            } else if (str.equals(listH.get(i8).b0())) {
                break;
            } else {
                i8++;
            }
        }
        y4.a aVarX = com.google.android.gms.internal.measurement.y4.Y().x(str);
        if (obj instanceof Long) {
            aVarX.u(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarX.z((String) obj);
        } else if (obj instanceof Double) {
            aVarX.t(((Double) obj).doubleValue());
        }
        if (i8 >= 0) {
            aVar.u(i8, aVarX);
        } else {
            aVar.x(aVarX);
        }
    }

    private static void V(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
    }

    private final void W(StringBuilder sb, int i8, com.google.android.gms.internal.measurement.w3 w3Var) {
        if (w3Var == null) {
            return;
        }
        V(sb, i8);
        sb.append("filter {\n");
        if (w3Var.N()) {
            Z(sb, i8, "complement", Boolean.valueOf(w3Var.M()));
        }
        if (w3Var.P()) {
            Z(sb, i8, "param_name", c().f(w3Var.L()));
        }
        if (w3Var.Q()) {
            int i9 = i8 + 1;
            com.google.android.gms.internal.measurement.z3 z3VarK = w3Var.K();
            if (z3VarK != null) {
                V(sb, i9);
                sb.append("string_filter");
                sb.append(" {\n");
                if (z3VarK.N()) {
                    Z(sb, i9, "match_type", z3VarK.F().name());
                }
                if (z3VarK.M()) {
                    Z(sb, i9, "expression", z3VarK.I());
                }
                if (z3VarK.L()) {
                    Z(sb, i9, "case_sensitive", Boolean.valueOf(z3VarK.K()));
                }
                if (z3VarK.m() > 0) {
                    V(sb, i9 + 1);
                    sb.append("expression_list {\n");
                    for (String str : z3VarK.J()) {
                        V(sb, i9 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                V(sb, i9);
                sb.append("}\n");
            }
        }
        if (w3Var.O()) {
            X(sb, i8 + 1, "number_filter", w3Var.J());
        }
        V(sb, i8);
        sb.append("}\n");
    }

    private static void X(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.x3 x3Var) {
        if (x3Var == null) {
            return;
        }
        V(sb, i8);
        sb.append(str);
        sb.append(" {\n");
        if (x3Var.M()) {
            Z(sb, i8, "comparison_type", x3Var.F().name());
        }
        if (x3Var.O()) {
            Z(sb, i8, "match_as_float", Boolean.valueOf(x3Var.L()));
        }
        if (x3Var.N()) {
            Z(sb, i8, "comparison_value", x3Var.I());
        }
        if (x3Var.Q()) {
            Z(sb, i8, "min_comparison_value", x3Var.K());
        }
        if (x3Var.P()) {
            Z(sb, i8, "max_comparison_value", x3Var.J());
        }
        V(sb, i8);
        sb.append("}\n");
    }

    private static void Y(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.d5 d5Var) {
        if (d5Var == null) {
            return;
        }
        V(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (d5Var.I() != 0) {
            V(sb, 4);
            sb.append("results: ");
            int i9 = 0;
            for (Long l8 : d5Var.Y()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (d5Var.Q() != 0) {
            V(sb, 4);
            sb.append("status: ");
            int i11 = 0;
            for (Long l9 : d5Var.a0()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (d5Var.m() != 0) {
            V(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.v4 v4Var : d5Var.X()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                sb.append(v4Var.N() ? Integer.valueOf(v4Var.m()) : null);
                sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb.append(v4Var.M() ? Long.valueOf(v4Var.J()) : null);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (d5Var.M() != 0) {
            V(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.e5 e5Var : d5Var.Z()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                sb.append(e5Var.O() ? Integer.valueOf(e5Var.J()) : null);
                sb.append(": [");
                Iterator<Long> it = e5Var.N().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i17 = i18;
                }
                sb.append("]");
                i15 = i16;
            }
            sb.append("}\n");
        }
        V(sb, 3);
        sb.append("}\n");
    }

    private static void Z(StringBuilder sb, int i8, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V(sb, i8 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void a0(StringBuilder sb, int i8, List<com.google.android.gms.internal.measurement.y4> list) {
        if (list == null) {
            return;
        }
        int i9 = i8 + 1;
        for (com.google.android.gms.internal.measurement.y4 y4Var : list) {
            if (y4Var != null) {
                V(sb, i9);
                sb.append("param {\n");
                Z(sb, i9, "name", y4Var.h0() ? c().f(y4Var.b0()) : null);
                Z(sb, i9, "string_value", y4Var.i0() ? y4Var.c0() : null);
                Z(sb, i9, "int_value", y4Var.g0() ? Long.valueOf(y4Var.W()) : null);
                Z(sb, i9, "double_value", y4Var.e0() ? Double.valueOf(y4Var.F()) : null);
                if (y4Var.U() > 0) {
                    a0(sb, i9, y4Var.d0());
                }
                V(sb, i9);
                sb.append("}\n");
            }
        }
    }

    static boolean c0(d0 d0Var, lb lbVar) {
        a3.o.j(d0Var);
        a3.o.j(lbVar);
        return (TextUtils.isEmpty(lbVar.f20211b) && TextUtils.isEmpty(lbVar.f20226q)) ? false : true;
    }

    static boolean d0(List<Long> list, int i8) {
        if (i8 < (list.size() << 6)) {
            return ((1 << (i8 % 64)) & list.get(i8 / 64).longValue()) != 0;
        }
        return false;
    }

    static Object e0(com.google.android.gms.internal.measurement.w4 w4Var, String str) {
        com.google.android.gms.internal.measurement.y4 y4VarE = E(w4Var, str);
        if (y4VarE == null) {
            return null;
        }
        if (y4VarE.i0()) {
            return y4VarE.c0();
        }
        if (y4VarE.g0()) {
            return Long.valueOf(y4VarE.W());
        }
        if (y4VarE.e0()) {
            return Double.valueOf(y4VarE.F());
        }
        if (y4VarE.U() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.y4> listD0 = y4VarE.d0();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.y4 y4Var : listD0) {
            if (y4Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.y4 y4Var2 : y4Var.d0()) {
                    if (y4Var2.i0()) {
                        bundle.putString(y4Var2.b0(), y4Var2.c0());
                    } else if (y4Var2.g0()) {
                        bundle.putLong(y4Var2.b0(), y4Var2.W());
                    } else if (y4Var2.e0()) {
                        bundle.putDouble(y4Var2.b0(), y4Var2.F());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean f0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static int y(b5.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i8 = 0; i8 < aVar.G(); i8++) {
            if (str.equals(aVar.B0(i8).Y())) {
                return i8;
            }
        }
        return -1;
    }

    final long A(byte[] bArr) {
        a3.o.j(bArr);
        f().i();
        MessageDigest messageDigestT0 = ib.T0();
        if (messageDigestT0 != null) {
            return ib.B(messageDigestT0.digest(bArr));
        }
        t().G().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T C(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            t().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final com.google.android.gms.internal.measurement.w4 D(w wVar) {
        w4.a aVarW = com.google.android.gms.internal.measurement.w4.Y().w(wVar.f20608e);
        for (String str : wVar.f20609f) {
            y4.a aVarX = com.google.android.gms.internal.measurement.y4.Y().x(str);
            Object objV = wVar.f20609f.v(str);
            a3.o.j(objV);
            S(aVarX, objV);
            aVarW.x(aVarX);
        }
        return (com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) aVarW.d());
    }

    final d0 G(com.google.android.gms.internal.measurement.e eVar) {
        Object obj;
        Bundle bundleB = B(eVar.g(), true);
        String string = (!bundleB.containsKey("_o") || (obj = bundleB.get("_o")) == null) ? "app" : obj.toString();
        String strB = p3.r.b(eVar.e());
        if (strB == null) {
            strB = eVar.e();
        }
        return new d0(strB, new z(bundleB), string, eVar.a());
    }

    @TargetApi(30)
    final na H(String str, com.google.android.gms.internal.measurement.b5 b5Var, w4.a aVar, String str2) {
        String strValueOf;
        String strValueOf2;
        int iIndexOf;
        if (!mf.a() || !a().B(str, e0.L0)) {
            return null;
        }
        long jA = k().a();
        String[] strArrSplit = a().z(str, e0.f19932e0).split(com.amazon.a.a.o.b.f.f3942a);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            str3.getClass();
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        ta taVarR = r();
        String strQ = taVarR.o().Q(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(taVarR.a().z(str, e0.Y));
        builder.authority(TextUtils.isEmpty(strQ) ? taVarR.a().z(str, e0.Z) : strQ + "." + taVarR.a().z(str, e0.Z));
        builder.path(taVarR.a().z(str, e0.f19922a0));
        P(builder, "gmp_app_id", b5Var.j0(), setUnmodifiableSet);
        P(builder, "gmp_version", "82001", setUnmodifiableSet);
        String strI3 = b5Var.I3();
        f fVarA = a();
        h4<Boolean> h4Var = e0.O0;
        String str4 = "";
        if (fVarA.B(str, h4Var) && o().a0(str)) {
            strI3 = "";
        }
        P(builder, "app_instance_id", strI3, setUnmodifiableSet);
        P(builder, "rdid", b5Var.s0(), setUnmodifiableSet);
        P(builder, "bundle_id", b5Var.H3(), setUnmodifiableSet);
        String strG = aVar.G();
        String strA = p3.r.a(strG);
        if (!TextUtils.isEmpty(strA)) {
            strG = strA;
        }
        P(builder, "app_event_name", strG, setUnmodifiableSet);
        P(builder, "app_version", String.valueOf(b5Var.H0()), setUnmodifiableSet);
        String strQ0 = b5Var.q0();
        if (!a().B(str, h4Var) || !o().e0(str)) {
            str4 = strQ0;
        } else if (a().B(str, e0.B0)) {
            if (!TextUtils.isEmpty(strQ0) && (iIndexOf = strQ0.indexOf(".")) != -1) {
                strQ0 = strQ0.substring(0, iIndexOf);
            }
            str4 = strQ0;
        }
        P(builder, "os_version", str4, setUnmodifiableSet);
        P(builder, DiagnosticsEntry.Event.TIMESTAMP_KEY, String.valueOf(aVar.E()), setUnmodifiableSet);
        if (b5Var.A0()) {
            P(builder, "lat", "1", setUnmodifiableSet);
        }
        P(builder, "privacy_sandbox_version", String.valueOf(b5Var.m()), setUnmodifiableSet);
        P(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        P(builder, "trigger_uri_timestamp", String.valueOf(jA), setUnmodifiableSet);
        if (str2 != null) {
            P(builder, "request_uuid", str2, setUnmodifiableSet);
        }
        List<com.google.android.gms.internal.measurement.y4> listH = aVar.H();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.y4 y4Var : listH) {
            String strB0 = y4Var.b0();
            if (y4Var.e0()) {
                strValueOf2 = String.valueOf(y4Var.F());
            } else if (y4Var.f0()) {
                strValueOf2 = String.valueOf(y4Var.Q());
            } else if (y4Var.i0()) {
                strValueOf2 = y4Var.c0();
            } else if (y4Var.g0()) {
                strValueOf2 = String.valueOf(y4Var.W());
            }
            bundle.putString(strB0, strValueOf2);
        }
        Q(builder, a().z(str, e0.f19930d0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.f5> listX0 = b5Var.x0();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.f5 f5Var : listX0) {
            String strY = f5Var.Y();
            if (f5Var.a0()) {
                strValueOf = String.valueOf(f5Var.F());
            } else if (f5Var.b0()) {
                strValueOf = String.valueOf(f5Var.N());
            } else if (f5Var.e0()) {
                strValueOf = f5Var.Z();
            } else if (f5Var.c0()) {
                strValueOf = String.valueOf(f5Var.T());
            }
            bundle2.putString(strY, strValueOf);
        }
        Q(builder, a().z(str, e0.f19928c0).split("\\|"), bundle2, setUnmodifiableSet);
        if (td.a() && a().q(e0.T0)) {
            P(builder, "dma", b5Var.z0() ? "1" : "0", setUnmodifiableSet);
            if (!b5Var.f0().isEmpty()) {
                P(builder, "dma_cps", b5Var.f0(), setUnmodifiableSet);
            }
        }
        return new na(builder.build().toString(), jA, 1);
    }

    final String I(com.google.android.gms.internal.measurement.v3 v3Var) {
        if (v3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (v3Var.U()) {
            Z(sb, 0, "filter_id", Integer.valueOf(v3Var.K()));
        }
        Z(sb, 0, "event_name", c().c(v3Var.O()));
        String strL = L(v3Var.Q(), v3Var.R(), v3Var.S());
        if (!strL.isEmpty()) {
            Z(sb, 0, "filter_type", strL);
        }
        if (v3Var.T()) {
            X(sb, 1, "event_count_filter", v3Var.N());
        }
        if (v3Var.m() > 0) {
            sb.append("  filters {\n");
            Iterator<com.google.android.gms.internal.measurement.w3> it = v3Var.P().iterator();
            while (it.hasNext()) {
                W(sb, 2, it.next());
            }
        }
        V(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String J(com.google.android.gms.internal.measurement.y3 y3Var) {
        if (y3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (y3Var.O()) {
            Z(sb, 0, "filter_id", Integer.valueOf(y3Var.m()));
        }
        Z(sb, 0, "property_name", c().g(y3Var.K()));
        String strL = L(y3Var.L(), y3Var.M(), y3Var.N());
        if (!strL.isEmpty()) {
            Z(sb, 0, "filter_type", strL);
        }
        W(sb, 1, y3Var.H());
        sb.append("}\n");
        return sb.toString();
    }

    final String K(com.google.android.gms.internal.measurement.a5 a5Var) {
        com.google.android.gms.internal.measurement.t4 t4VarD3;
        if (a5Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.b5 b5Var : a5Var.K()) {
            if (b5Var != null) {
                V(sb, 1);
                sb.append("bundle {\n");
                if (b5Var.d1()) {
                    Z(sb, 1, "protocol_version", Integer.valueOf(b5Var.Y1()));
                }
                if (yf.a() && a().B(b5Var.H3(), e0.f19972y0) && b5Var.g1()) {
                    Z(sb, 1, "session_stitching_token", b5Var.t0());
                }
                Z(sb, 1, "platform", b5Var.r0());
                if (b5Var.Y0()) {
                    Z(sb, 1, "gmp_version", Long.valueOf(b5Var.h3()));
                }
                if (b5Var.l1()) {
                    Z(sb, 1, "uploading_gmp_version", Long.valueOf(b5Var.A3()));
                }
                if (b5Var.W0()) {
                    Z(sb, 1, "dynamite_version", Long.valueOf(b5Var.U2()));
                }
                if (b5Var.F0()) {
                    Z(sb, 1, "config_version", Long.valueOf(b5Var.G2()));
                }
                Z(sb, 1, "gmp_app_id", b5Var.j0());
                Z(sb, 1, "admob_app_id", b5Var.G3());
                Z(sb, 1, "app_id", b5Var.H3());
                Z(sb, 1, "app_version", b5Var.c0());
                if (b5Var.C0()) {
                    Z(sb, 1, "app_version_major", Integer.valueOf(b5Var.H0()));
                }
                Z(sb, 1, "firebase_instance_id", b5Var.i0());
                if (b5Var.V0()) {
                    Z(sb, 1, "dev_cert_hash", Long.valueOf(b5Var.N2()));
                }
                Z(sb, 1, "app_store", b5Var.J3());
                if (b5Var.k1()) {
                    Z(sb, 1, "upload_timestamp_millis", Long.valueOf(b5Var.x3()));
                }
                if (b5Var.h1()) {
                    Z(sb, 1, "start_timestamp_millis", Long.valueOf(b5Var.r3()));
                }
                if (b5Var.X0()) {
                    Z(sb, 1, "end_timestamp_millis", Long.valueOf(b5Var.b3()));
                }
                if (b5Var.c1()) {
                    Z(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(b5Var.o3()));
                }
                if (b5Var.b1()) {
                    Z(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(b5Var.l3()));
                }
                Z(sb, 1, "app_instance_id", b5Var.I3());
                Z(sb, 1, "resettable_device_id", b5Var.s0());
                Z(sb, 1, "ds_id", b5Var.h0());
                if (b5Var.a1()) {
                    Z(sb, 1, "limited_ad_tracking", Boolean.valueOf(b5Var.A0()));
                }
                Z(sb, 1, "os_version", b5Var.q0());
                Z(sb, 1, "device_model", b5Var.g0());
                Z(sb, 1, "user_default_language", b5Var.u0());
                if (b5Var.j1()) {
                    Z(sb, 1, "time_zone_offset_minutes", Integer.valueOf(b5Var.q2()));
                }
                if (b5Var.E0()) {
                    Z(sb, 1, "bundle_sequential_index", Integer.valueOf(b5Var.m1()));
                }
                if (b5Var.f1()) {
                    Z(sb, 1, "service_upload", Boolean.valueOf(b5Var.B0()));
                }
                Z(sb, 1, "health_monitor", b5Var.p0());
                if (b5Var.e1()) {
                    Z(sb, 1, "retry_counter", Integer.valueOf(b5Var.i2()));
                }
                if (b5Var.T0()) {
                    Z(sb, 1, "consent_signals", b5Var.e0());
                }
                if (b5Var.Z0()) {
                    Z(sb, 1, "is_dma_region", Boolean.valueOf(b5Var.z0()));
                }
                if (b5Var.U0()) {
                    Z(sb, 1, "core_platform_services", b5Var.f0());
                }
                if (b5Var.G0()) {
                    Z(sb, 1, "consent_diagnostics", b5Var.d0());
                }
                if (b5Var.i1()) {
                    Z(sb, 1, "target_os_version", Long.valueOf(b5Var.u3()));
                }
                if (mf.a() && a().B(b5Var.H3(), e0.L0)) {
                    Z(sb, 1, "ad_services_version", Integer.valueOf(b5Var.m()));
                    if (b5Var.D0() && (t4VarD3 = b5Var.D3()) != null) {
                        V(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Z(sb, 2, "eligible", Boolean.valueOf(t4VarD3.W()));
                        Z(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t4VarD3.a0()));
                        Z(sb, 2, "pre_r", Boolean.valueOf(t4VarD3.b0()));
                        Z(sb, 2, "r_extensions_too_old", Boolean.valueOf(t4VarD3.c0()));
                        Z(sb, 2, "adservices_extension_too_old", Boolean.valueOf(t4VarD3.T()));
                        Z(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(t4VarD3.Q()));
                        Z(sb, 2, "measurement_manager_disabled", Boolean.valueOf(t4VarD3.Z()));
                        V(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<com.google.android.gms.internal.measurement.f5> listX0 = b5Var.x0();
                if (listX0 != null) {
                    for (com.google.android.gms.internal.measurement.f5 f5Var : listX0) {
                        if (f5Var != null) {
                            V(sb, 2);
                            sb.append("user_property {\n");
                            Z(sb, 2, "set_timestamp_millis", f5Var.d0() ? Long.valueOf(f5Var.V()) : null);
                            Z(sb, 2, "name", c().g(f5Var.Y()));
                            Z(sb, 2, "string_value", f5Var.Z());
                            Z(sb, 2, "int_value", f5Var.c0() ? Long.valueOf(f5Var.T()) : null);
                            Z(sb, 2, "double_value", f5Var.a0() ? Double.valueOf(f5Var.F()) : null);
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.u4> listV0 = b5Var.v0();
                b5Var.H3();
                if (listV0 != null) {
                    for (com.google.android.gms.internal.measurement.u4 u4Var : listV0) {
                        if (u4Var != null) {
                            V(sb, 2);
                            sb.append("audience_membership {\n");
                            if (u4Var.S()) {
                                Z(sb, 2, "audience_id", Integer.valueOf(u4Var.m()));
                            }
                            if (u4Var.T()) {
                                Z(sb, 2, "new_audience", Boolean.valueOf(u4Var.R()));
                            }
                            Y(sb, 2, "current_data", u4Var.P());
                            if (u4Var.U()) {
                                Y(sb, 2, "previous_data", u4Var.Q());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.w4> listW0 = b5Var.w0();
                if (listW0 != null) {
                    for (com.google.android.gms.internal.measurement.w4 w4Var : listW0) {
                        if (w4Var != null) {
                            V(sb, 2);
                            sb.append("event {\n");
                            Z(sb, 2, "name", c().c(w4Var.a0()));
                            if (w4Var.e0()) {
                                Z(sb, 2, "timestamp_millis", Long.valueOf(w4Var.X()));
                            }
                            if (w4Var.d0()) {
                                Z(sb, 2, "previous_timestamp_millis", Long.valueOf(w4Var.W()));
                            }
                            if (w4Var.c0()) {
                                Z(sb, 2, "count", Integer.valueOf(w4Var.m()));
                            }
                            if (w4Var.S() != 0) {
                                a0(sb, 2, w4Var.b0());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                V(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> N(List<Long> list, List<Integer> list2) {
        int i8;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                t().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    t().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i9 = size2;
            i8 = size;
            size = i9;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i8);
    }

    final Map<String, Object> O(Bundle bundle, boolean z7) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z8 = obj instanceof Parcelable[];
            if (z8 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z7) {
                    ArrayList arrayList = new ArrayList();
                    if (z8) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(O((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj2 = arrayList2.get(i8);
                            i8++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(O((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(O((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void S(y4.a aVar, Object obj) {
        a3.o.j(obj);
        aVar.C().A().y().B();
        if (obj instanceof String) {
            aVar.z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.u(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.t(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            t().G().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                y4.a aVarY = com.google.android.gms.internal.measurement.y4.Y();
                for (String str : bundle.keySet()) {
                    y4.a aVarX = com.google.android.gms.internal.measurement.y4.Y().x(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarX.u(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarX.z((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarX.t(((Double) obj2).doubleValue());
                    }
                    aVarY.v(aVarX);
                }
                if (aVarY.s() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.y4) ((com.google.android.gms.internal.measurement.y8) aVarY.d()));
                }
            }
        }
        aVar.w(arrayList);
    }

    final void T(b5.a aVar) {
        t().K().a("Checking account type status for ad personalization signals");
        if (h0(aVar.T0())) {
            t().F().a("Turning off ad personalization due to account type");
            com.google.android.gms.internal.measurement.f5 f5Var = (com.google.android.gms.internal.measurement.f5) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.f5.W().v("_npa").x(b().s()).u(1L).d());
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= aVar.G()) {
                    break;
                }
                if ("_npa".equals(aVar.B0(i8).Y())) {
                    aVar.w(i8, f5Var);
                    z7 = true;
                    break;
                }
                i8++;
            }
            if (!z7) {
                aVar.C(f5Var);
            }
            if (td.a() && a().q(e0.T0)) {
                k kVarB = k.b(aVar.V0());
                kVarB.d(y6.a.AD_PERSONALIZATION, j.CHILD_ACCOUNT);
                aVar.g0(kVarB.toString());
            }
        }
    }

    final void U(f5.a aVar, Object obj) {
        a3.o.j(obj);
        aVar.z().w().s();
        if (obj instanceof String) {
            aVar.y((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.u(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.t(((Double) obj).doubleValue());
        } else {
            t().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    final boolean b0(long j8, long j9) {
        return j8 == 0 || j9 <= 0 || Math.abs(k().a() - j8) > j9;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    final byte[] g0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            t().G().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    final boolean h0(String str) {
        a3.o.j(str);
        r5 r5VarD0 = n().D0(str);
        return r5VarD0 != null && b().y() && r5VarD0.q() && o().V(str);
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    final byte[] i0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i8 = gZIPInputStream.read(bArr2);
                if (i8 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i8);
            }
        } catch (IOException e8) {
            t().G().b("Failed to ungzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    final List<Integer> j0() {
        Map<String, String> mapC = e0.c(this.f20461b.j());
        if (mapC == null || mapC.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = e0.R.a(null).intValue();
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i8 = Integer.parseInt(entry.getValue());
                    if (i8 != 0) {
                        arrayList.add(Integer.valueOf(i8));
                        if (arrayList.size() >= iIntValue) {
                            t().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e8) {
                    t().L().b("Experiment ID NumberFormatException", e8);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
