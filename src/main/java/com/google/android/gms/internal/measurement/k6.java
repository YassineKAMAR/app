package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k6 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile u3.g<i6> f18874a;

        private a() {
        }

        public static u3.g<i6> a(Context context) {
            u3.g<i6> gVar;
            u3.g<i6> gVarC;
            synchronized (a.class) {
                gVar = f18874a;
                if (gVar == null) {
                    new k6();
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (w5.a() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        gVarC = k6.c(context);
                    } else {
                        gVarC = u3.g.a();
                    }
                    gVar = gVarC;
                    f18874a = gVar;
                }
            }
            return gVar;
        }
    }

    private static i6 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                p.h hVar = new p.h();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        d6 d6Var = new d6(hVar);
                        bufferedReader.close();
                        return d6Var;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strB = b(strArrSplit[0]);
                        String strDecode = Uri.decode(b(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strB2 = b(strArrSplit[2]);
                            strDecode2 = Uri.decode(strB2);
                            if (strDecode2.length() < 1024 || strDecode2 == strB2) {
                                map.put(strB2, strDecode2);
                            }
                        }
                        if (!hVar.containsKey(strB)) {
                            hVar.put(strB, new p.h());
                        }
                        ((p.h) hVar.get(strB)).put(strDecode, strDecode2);
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    static u3.g<i6> c(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            u3.g<File> gVarD = d(context);
            return gVarD.c() ? u3.g.d(a(context, gVarD.b())) : u3.g.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static u3.g<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? u3.g.d(file) : u3.g.a();
        } catch (RuntimeException e8) {
            Log.e("HermeticFileOverrides", "no data dir", e8);
            return u3.g.a();
        }
    }
}
