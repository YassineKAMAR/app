package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e43 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f7119f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k33 f7123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7124e;

    public e43(Context context, int i8, k33 k33Var, boolean z7) {
        this.f7124e = false;
        this.f7120a = context;
        this.f7122c = Integer.toString(i8 - 1);
        this.f7121b = context.getSharedPreferences("pcvmspf", 0);
        this.f7123d = k33Var;
        this.f7124e = z7;
    }

    private final File e(String str) {
        return new File(new File(this.f7120a.getDir("pccache", 0), this.f7122c), str);
    }

    private static String f(fk fkVar) {
        hk hkVarP = ik.P();
        hkVarP.y(fkVar.O().V());
        hkVarP.u(fkVar.O().U());
        hkVarP.v(fkVar.O().M());
        hkVarP.x(fkVar.O().O());
        hkVarP.w(fkVar.O().N());
        return e3.j.a(((ik) hkVarP.q()).g());
    }

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.f7122c));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.f7122c));
    }

    private final void i(int i8, long j8) {
        this.f7123d.c(i8, j8);
    }

    private final void j(int i8, long j8, String str) {
        this.f7123d.a(i8, j8, str);
    }

    private final ik k(int i8) {
        SharedPreferences sharedPreferences;
        String strG;
        int i9;
        if (i8 == 1) {
            sharedPreferences = this.f7121b;
            strG = h();
        } else {
            sharedPreferences = this.f7121b;
            strG = g();
        }
        String string = sharedPreferences.getString(strG, null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrC = e3.j.c(string);
            rz3 rz3Var = rz3.f14393b;
            return ik.T(rz3.L(bArrC, 0, bArrC.length), this.f7124e ? m04.a() : m04.b());
        } catch (m14 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i9 = 2029;
            i(i9, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i9 = 2032;
            i(i9, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean a(fk fkVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f7119f) {
            if (!y33.e(new File(e(fkVar.O().V()), "pcbc"), fkVar.P().a())) {
                i(4020, jCurrentTimeMillis);
                return false;
            }
            String strF = f(fkVar);
            SharedPreferences.Editor editorEdit = this.f7121b.edit();
            editorEdit.putString(h(), strF);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                i(5015, jCurrentTimeMillis);
            } else {
                i(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean b(fk fkVar, d43 d43Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f7119f) {
            ik ikVarK = k(1);
            String strV = fkVar.O().V();
            if (ikVarK != null && ikVarK.V().equals(strV)) {
                i(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileE = e(strV);
            if (fileE.exists()) {
                j(4023, jCurrentTimeMillis2, "d:" + (true != fileE.isDirectory() ? "0" : "1") + ",f:" + (true != fileE.isFile() ? "0" : "1"));
                i(4015, jCurrentTimeMillis2);
            } else if (!fileE.mkdirs()) {
                j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileE.canWrite() ? "0" : "1"));
                i(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileE2 = e(strV);
            File file = new File(fileE2, "pcam.jar");
            File file2 = new File(fileE2, "pcbc");
            if (!y33.e(file, fkVar.Q().a())) {
                i(4016, jCurrentTimeMillis);
                return false;
            }
            if (!y33.e(file2, fkVar.P().a())) {
                i(4017, jCurrentTimeMillis);
                return false;
            }
            if (d43Var != null && !d43Var.a(file)) {
                i(4018, jCurrentTimeMillis);
                y33.d(fileE2);
                return false;
            }
            String strF = f(fkVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.f7121b.getString(h(), null);
            SharedPreferences.Editor editorEdit = this.f7121b.edit();
            editorEdit.putString(h(), strF);
            if (string != null) {
                editorEdit.putString(g(), string);
            }
            if (!editorEdit.commit()) {
                i(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            ik ikVarK2 = k(1);
            if (ikVarK2 != null) {
                hashSet.add(ikVarK2.V());
            }
            ik ikVarK3 = k(2);
            if (ikVarK3 != null) {
                hashSet.add(ikVarK3.V());
            }
            for (File file3 : new File(this.f7120a.getDir("pccache", 0), this.f7122c).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    y33.d(file3);
                }
            }
            i(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final w33 c(int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f7119f) {
            ik ikVarK = k(1);
            if (ikVarK == null) {
                i(4022, jCurrentTimeMillis);
                return null;
            }
            File fileE = e(ikVarK.V());
            File file = new File(fileE, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileE, "pcam");
            }
            File file2 = new File(fileE, "pcbc");
            File file3 = new File(fileE, "pcopt");
            i(5016, jCurrentTimeMillis);
            return new w33(ikVarK, file, file2, file3);
        }
    }

    public final boolean d(int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f7119f) {
            ik ikVarK = k(1);
            if (ikVarK == null) {
                i(4025, jCurrentTimeMillis);
                return false;
            }
            File fileE = e(ikVarK.V());
            if (!new File(fileE, "pcam.jar").exists()) {
                i(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileE, "pcbc").exists()) {
                i(5019, jCurrentTimeMillis);
                return true;
            }
            i(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
