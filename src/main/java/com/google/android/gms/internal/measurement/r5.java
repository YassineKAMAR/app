package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class r5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static HashMap<String, String> f19123h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Object f19128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f19129n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f19116a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f19117b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f19118c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f19119d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f19120e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ContentResolver f19121f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f19122g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Boolean> f19124i = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Integer> f19125j = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap<String, Long> f19126k = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap<String, Float> f19127l = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String[] f19130o = new String[0];

    public interface a<T extends Map<String, String>> {
        T b(int i8);
    }

    public interface b {
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (r5.class) {
            if (f19123h == null) {
                f19120e.set(false);
                f19123h = new HashMap<>(16, 1.0f);
                f19128m = new Object();
                f19129n = false;
                contentResolver.registerContentObserver(f19116a, true, new u5(null));
            } else if (f19120e.getAndSet(false)) {
                f19123h.clear();
                f19124i.clear();
                f19125j.clear();
                f19126k.clear();
                f19127l.clear();
                f19128m = new Object();
                f19129n = false;
            }
            Object obj = f19128m;
            if (f19123h.containsKey(str)) {
                String str3 = f19123h.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : f19130o) {
                if (str.startsWith(str4)) {
                    if (!f19129n) {
                        HashMap<String, String> map = (HashMap) b(contentResolver, f19130o, new t5());
                        if (map != null) {
                            if (!map.isEmpty()) {
                                Set<String> setKeySet = map.keySet();
                                setKeySet.removeAll(f19124i.keySet());
                                setKeySet.removeAll(f19125j.keySet());
                                setKeySet.removeAll(f19126k.keySet());
                                setKeySet.removeAll(f19127l.keySet());
                            }
                            if (!map.isEmpty()) {
                                if (f19123h.isEmpty()) {
                                    f19123h = map;
                                } else {
                                    f19123h.putAll(map);
                                }
                            }
                            f19129n = true;
                        }
                        if (f19123h.containsKey(str)) {
                            String str5 = f19123h.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(f19116a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    d(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                d(obj, str, string);
                if (string != null) {
                    return string;
                }
                return null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, a<T> aVar) {
        Cursor cursorQuery = contentResolver.query(f19117b, null, null, strArr, null);
        if (cursorQuery == null) {
            return null;
        }
        T t7 = (T) aVar.b(cursorQuery.getCount());
        while (cursorQuery.moveToNext()) {
            try {
                t7.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return t7;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (r5.class) {
            if (obj == f19128m) {
                f19123h.put(str, str2);
            }
        }
    }
}
