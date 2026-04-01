package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f19846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f19847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Boolean f19848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Boolean f19849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Long f19850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f19851f;

    c(String str, int i8) {
        this.f19846a = str;
        this.f19847b = i8;
    }

    static Boolean b(double d8, com.google.android.gms.internal.measurement.x3 x3Var) {
        try {
            return h(new BigDecimal(d8), x3Var, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j8, com.google.android.gms.internal.measurement.x3 x3Var) {
        try {
            return h(new BigDecimal(j8), x3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    static Boolean e(String str, com.google.android.gms.internal.measurement.x3 x3Var) {
        if (!db.f0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), x3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, z3.a aVar, boolean z7, String str2, List<String> list, String str3, n4 n4Var) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        if (aVar == z3.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && aVar != z3.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (sb.f20491a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z7 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (n4Var != null) {
                        n4Var.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    static Boolean g(String str, com.google.android.gms.internal.measurement.z3 z3Var, n4 n4Var) {
        List<String> list;
        a3.o.j(z3Var);
        if (str == null || !z3Var.N() || z3Var.F() == z3.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        z3.a aVarF = z3Var.F();
        z3.a aVar = z3.a.IN_LIST;
        if (aVarF == aVar) {
            if (z3Var.m() == 0) {
                return null;
            }
        } else if (!z3Var.M()) {
            return null;
        }
        z3.a aVarF2 = z3Var.F();
        boolean zK = z3Var.K();
        String strI = (zK || aVarF2 == z3.a.REGEXP || aVarF2 == aVar) ? z3Var.I() : z3Var.I().toUpperCase(Locale.ENGLISH);
        if (z3Var.m() == 0) {
            list = null;
        } else {
            List<String> listJ = z3Var.J();
            if (!zK) {
                ArrayList arrayList = new ArrayList(listJ.size());
                Iterator<String> it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listJ = Collections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        return f(str, aVarF2, zK, strI, list, aVarF2 == z3.a.REGEXP ? strI : null, n4Var);
    }

    private static Boolean h(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.x3 x3Var, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        a3.o.j(x3Var);
        if (x3Var.M() && x3Var.F() != x3.b.UNKNOWN_COMPARISON_TYPE) {
            x3.b bVarF = x3Var.F();
            x3.b bVar = x3.b.BETWEEN;
            if (bVarF == bVar) {
                if (!x3Var.Q() || !x3Var.P()) {
                    return null;
                }
            } else if (!x3Var.N()) {
                return null;
            }
            x3.b bVarF2 = x3Var.F();
            if (x3Var.F() == bVar) {
                if (db.f0(x3Var.K()) && db.f0(x3Var.J())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(x3Var.K());
                        bigDecimal4 = new BigDecimal(x3Var.J());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!db.f0(x3Var.I())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(x3Var.I());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (bVarF2 == bVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i8 = sb.f20492b[bVarF2.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d8 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
