package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3683b = 31536000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3684e = new com.amazon.a.a.o.c("ShutdownPrompt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3685f = "https://www.amazon.com/appstore-error-help";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3686g = "badcert";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f3687h = "1.1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f3688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f3689j;

    private static class a extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.a.a.a.a f3690a;

        private a(com.amazon.a.a.a.a aVar) {
            this.f3690a = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f3690a);
        }
    }

    private static class b extends AsyncTask<Intent, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.amazon.a.a.a.a f3692b;

        private b(Context context, com.amazon.a.a.a.a aVar) {
            this.f3691a = context;
            this.f3692b = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Intent... intentArr) {
            this.f3691a.startActivity(intentArr[0]);
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f3692b);
        }
    }

    public g(c cVar) {
        super(cVar, h.a.EXTENDED);
        f3684e.a("new ShutdownPrompt called!");
    }

    private final Intent a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(f3685f);
        PackageManager packageManager = context.getPackageManager();
        a(sb, "?k=", f3687h);
        a(sb, "&m=", ((h) this).f3695c.e());
        a(sb, "&ec=", String.valueOf(((h) this).f3695c.g()));
        String str = (String) this.f3689j.a(com.amazon.a.a.m.c.f3749f);
        if (str != null) {
            a(sb, "&t=", str);
            a(sb, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f3689j.a(com.amazon.a.a.m.c.f3750g);
        if (str2 != null) {
            a(sb, "&c=", str2);
        }
        String str3 = (String) this.f3689j.a(com.amazon.a.a.m.c.f3747d);
        if (str3 != null) {
            a(sb, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            a(sb, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            a(sb, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            a(sb, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            a(sb, "&bn=", str7);
        }
        a(sb, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        a(sb, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        a(sb, "&p=", packageName);
        a(sb, "&pv=", packageName, packageManager);
        a(sb, "&l=", n());
        String strB = b(context);
        if (!TextUtils.isEmpty(strB)) {
            a(sb, "&mc=", strB);
        }
        String string = sb.toString();
        f3684e.a("Starting browser for uri " + string);
        return new Intent("android.intent.action.VIEW", Uri.parse(string));
    }

    private Intent a(Context context, String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName() + "&ref=" + str));
    }

    private void a(Context context, Intent intent) {
        if (b(context, intent)) {
            new b(context, this.f3688i).execute(intent);
        } else {
            f3684e.b("Could not start activity, nothing resolves for the given data.");
            b(this.f3688i);
        }
    }

    private void a(String str) {
        f3684e.a("Attempting to deep link to appstore.");
        Activity activityA = this.f3688i.a();
        a(activityA, a(activityA, str));
    }

    private final void a(StringBuilder sb, String str, String str2) {
        try {
            String strEncode = URLEncoder.encode(str2, "UTF-8");
            sb.append(str);
            sb.append(strEncode);
        } catch (UnsupportedEncodingException e8) {
            f3684e.b("Failed to URL-encode argument", e8);
        }
    }

    private final void a(StringBuilder sb, String str, String str2, PackageManager packageManager) {
        try {
            a(sb, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            f3684e.b("Could not find information for package " + str2);
        }
    }

    private String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            f3684e.a("tm was null!");
            return null;
        }
        com.amazon.a.a.o.c cVar = f3684e;
        cVar.a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState == 5) {
            return telephonyManager.getSimOperator();
        }
        cVar.a("SIM not ready, returning null.  State was " + simState);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.amazon.a.a.a.a aVar) {
        com.amazon.a.a.o.c cVar = f3684e;
        cVar.a("doShutdown()");
        cVar.c("Killing application");
        System.exit(0);
    }

    private boolean b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    @Override // com.amazon.a.a.i.h
    protected void a(int i8) {
        com.amazon.a.a.o.c cVar = f3684e;
        cVar.a("doAction(" + i8 + ")");
        c.a[] aVarArrC = ((h) this).f3695c.c();
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = i8 < aVarArrC.length ? aVarArrC[i8] : aVar;
        if (aVar2 == c.a.HELP) {
            cVar.a("doAction() help");
            m();
        } else if (aVar2 == c.a.DEEPLINK) {
            cVar.a("doAction() deeplink");
            a(f3686g);
        } else if (aVar2 == aVar) {
            b(this.f3688i);
        }
    }

    @Override // com.amazon.a.a.i.h
    protected boolean a(c.a aVar) {
        if (aVar == c.a.DEFAULT) {
            return true;
        }
        Intent intentA = null;
        Activity activityA = this.f3688i.a();
        if (aVar == c.a.DEEPLINK) {
            intentA = a(activityA, f3686g);
        } else if (aVar == c.a.HELP) {
            intentA = a((Context) activityA);
        }
        if (intentA != null) {
            return b(activityA, intentA);
        }
        f3684e.b("Unexpected action " + aVar + ", could not create intent.");
        return false;
    }

    @Override // com.amazon.a.a.e.a
    public void b() {
        this.f3688i.g();
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return f3683b;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        a(0);
    }

    protected void m() {
        com.amazon.a.a.o.c cVar = f3684e;
        cVar.a("Store contains " + this.f3689j.toString());
        if (!((h) this).f3695c.i()) {
            cVar.a("Should not show fixup");
            new a(this.f3688i).execute(new Void[0]);
        } else {
            cVar.a("Should show fixup");
            Activity activityA = this.f3688i.a();
            a(activityA, a((Context) activityA));
            cVar.a("Attempted to start browser.");
        }
    }

    public String toString() {
        return "ShutdownPrompt";
    }
}
