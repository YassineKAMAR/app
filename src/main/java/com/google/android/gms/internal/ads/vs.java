package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class vs {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f16444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Context f16445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f16446f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AtomicBoolean f16448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f16449i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue f16441a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final LinkedHashMap f16442b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f16443c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashSet f16447g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(vs vsVar) throws Throwable {
        while (true) {
            try {
                gt gtVar = (gt) vsVar.f16441a.take();
                et etVarA = gtVar.a();
                if (!TextUtils.isEmpty(etVarA.b())) {
                    vsVar.g(vsVar.b(vsVar.f16442b, gtVar.b()), etVarA);
                }
            } catch (InterruptedException e8) {
                qg0.h("CsiReporter:reporter interrupted", e8);
                return;
            }
        }
    }

    private final void g(Map map, et etVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f16444d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (etVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(etVar.b())) {
                sb.append("&it=");
                sb.append(etVar.b());
            }
            if (!TextUtils.isEmpty(etVar.a())) {
                sb.append("&blat=");
                sb.append(etVar.a());
            }
            string = sb.toString();
        }
        if (!this.f16448h.get()) {
            g2.t.r();
            j2.k2.k(this.f16445e, this.f16446f, string);
            return;
        }
        File file = this.f16449i;
        if (file == null) {
            qg0.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        qg0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileOutputStream = fileOutputStream2;
                    qg0.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            qg0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            qg0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public final bt a(String str) {
        bt btVar = (bt) this.f16443c.get(str);
        return btVar != null ? btVar : bt.f6021a;
    }

    final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f16445e = context;
        this.f16446f = str;
        this.f16444d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f16448h = atomicBoolean;
        atomicBoolean.set(((Boolean) du.f7017c.e()).booleanValue());
        if (this.f16448h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f16449i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f16442b.put((String) entry.getKey(), (String) entry.getValue());
        }
        eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.us
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                vs.c(this.f15834a);
            }
        });
        Map map2 = this.f16443c;
        bt btVar = bt.f6022b;
        map2.put("action", btVar);
        this.f16443c.put("ad_format", btVar);
        this.f16443c.put("e", bt.f6023c);
    }

    public final void e(String str) throws Throwable {
        if (this.f16447g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(com.amazon.a.a.o.b.I, this.f16446f);
        linkedHashMap.put("ue", str);
        g(b(this.f16442b, linkedHashMap), null);
    }

    public final boolean f(gt gtVar) {
        return this.f16441a.offer(gtVar);
    }
}
