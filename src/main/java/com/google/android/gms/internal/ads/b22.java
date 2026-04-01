package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class b22 extends i80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eq1 f5577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg0 f5578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q12 f5579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mx2 f5580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5582g;

    public b22(Context context, q12 q12Var, vg0 vg0Var, eq1 eq1Var, mx2 mx2Var) {
        this.f5576a = context;
        this.f5577b = eq1Var;
        this.f5578c = vg0Var;
        this.f5579d = q12Var;
        this.f5580e = mx2Var;
    }

    public static void P5(Context context, eq1 eq1Var, mx2 mx2Var, q12 q12Var, String str, String str2, Map map) {
        String strB;
        String str3 = true != g2.t.q().x(context) ? "offline" : "online";
        if (((Boolean) h2.y.c().b(ns.r8)).booleanValue() || eq1Var == null) {
            lx2 lx2VarB = lx2.b(str2);
            lx2VarB.a("gqi", str);
            lx2VarB.a("device_connectivity", str3);
            lx2VarB.a("event_timestamp", String.valueOf(g2.t.b().a()));
            for (Map.Entry entry : map.entrySet()) {
                lx2VarB.a((String) entry.getKey(), (String) entry.getValue());
            }
            strB = mx2Var.b(lx2VarB);
        } else {
            dq1 dq1VarA = eq1Var.a();
            dq1VarA.b("gqi", str);
            dq1VarA.b("action", str2);
            dq1VarA.b("device_connectivity", str3);
            dq1VarA.b("event_timestamp", String.valueOf(g2.t.b().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                dq1VarA.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            strB = dq1VarA.f();
        }
        q12Var.h(new s12(g2.t.b().a(), str, strB, 2));
    }

    private static String W5(int i8, String str) {
        Resources resourcesD = g2.t.q().d();
        return resourcesD == null ? str : resourcesD.getString(i8);
    }

    private final void X5(String str, String str2, Map map) {
        P5(this.f5576a, this.f5577b, this.f5580e, this.f5579d, str, str2, map);
    }

    private final void Y5(final Activity activity, final i2.s sVar) {
        g2.t.r();
        if (androidx.core.app.o0.b(activity).a()) {
            z();
            Z5(activity, sVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                X5(this.f5581f, "asnpdi", mb3.d());
                return;
            }
            g2.t.r();
            AlertDialog.Builder builderJ = j2.k2.j(activity);
            builderJ.setTitle(W5(e2.b.f21360f, "Allow app to send you notifications?")).setPositiveButton(W5(e2.b.f21358d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.t12
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f14913a.Q5(activity, sVar, dialogInterface, i8);
                }
            }).setNegativeButton(W5(e2.b.f21359e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.u12
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f15440a.R5(sVar, dialogInterface, i8);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.v12
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f15960a.S5(sVar, dialogInterface);
                }
            });
            builderJ.create().show();
            X5(this.f5581f, "rtsdi", mb3.d());
        }
    }

    private final void Z5(Activity activity, final i2.s sVar) {
        String strW5 = W5(e2.b.f21364j, "You'll get a notification with the link when you're back online");
        g2.t.r();
        AlertDialog.Builder builderJ = j2.k2.j(activity);
        builderJ.setMessage(strW5).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.z12
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i2.s sVar2 = sVar;
                if (sVar2 != null) {
                    sVar2.k();
                }
            }
        });
        AlertDialog alertDialogCreate = builderJ.create();
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new a22(this, alertDialogCreate, timer, sVar), 3000L);
    }

    private static final PendingIntent a6(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return o53.a(context, 0, intent, o53.f12369a | 1073741824, 0);
    }

    private final void z() {
        try {
            g2.t.r();
            if (j2.k2.Z(this.f5576a).zzf(g3.b.k3(this.f5576a), this.f5582g, this.f5581f)) {
                return;
            }
        } catch (RemoteException e8) {
            qg0.e("Failed to schedule offline notification poster.", e8);
        }
        this.f5579d.d(this.f5581f);
        X5(this.f5581f, "offline_notification_worker_not_scheduled", mb3.d());
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void D0(g3.a aVar) {
        e22 e22Var = (e22) g3.b.H0(aVar);
        final Activity activityA = e22Var.a();
        final i2.s sVarB = e22Var.b();
        this.f5581f = e22Var.c();
        this.f5582g = e22Var.d();
        if (((Boolean) h2.y.c().b(ns.k8)).booleanValue()) {
            Y5(activityA, sVarB);
            return;
        }
        X5(this.f5581f, "dialog_impression", mb3.d());
        g2.t.r();
        AlertDialog.Builder builderJ = j2.k2.j(activityA);
        builderJ.setTitle(W5(e2.b.f21367m, "Open ad when you're back online.")).setMessage(W5(e2.b.f21366l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(W5(e2.b.f21363i, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.w12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f16589a.T5(activityA, sVarB, dialogInterface, i8);
            }
        }).setNegativeButton(W5(e2.b.f21365k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.x12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f17012a.U5(sVarB, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.y12
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f17551a.V5(sVarB, dialogInterface);
            }
        });
        builderJ.create().show();
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void I0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zX = g2.t.q().x(this.f5576a);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zX ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f5576a.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f5576a.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            X5(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f5579d.getWritableDatabase();
                if (c == 1) {
                    this.f5579d.q(writableDatabase, this.f5578c, stringExtra2);
                } else {
                    q12.w(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e8) {
                qg0.d("Failed to get writable offline buffering database: ".concat(e8.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void K1(String[] strArr, int[] iArr, g3.a aVar) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (strArr[i8].equals("android.permission.POST_NOTIFICATIONS")) {
                e22 e22Var = (e22) g3.b.H0(aVar);
                Activity activityA = e22Var.a();
                i2.s sVarB = e22Var.b();
                HashMap map = new HashMap();
                if (iArr[i8] == 0) {
                    map.put("dialog_action", "confirm");
                    z();
                    Z5(activityA, sVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (sVarB != null) {
                        sVarB.k();
                    }
                }
                X5(this.f5581f, "asnpdc", map);
                return;
            }
        }
    }

    final /* synthetic */ void Q5(Activity activity, i2.s sVar, DialogInterface dialogInterface, int i8) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        X5(this.f5581f, "rtsdc", map);
        activity.startActivity(g2.t.s().f(activity));
        z();
        if (sVar != null) {
            sVar.k();
        }
    }

    final /* synthetic */ void R5(i2.s sVar, DialogInterface dialogInterface, int i8) {
        this.f5579d.d(this.f5581f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        X5(this.f5581f, "rtsdc", map);
        if (sVar != null) {
            sVar.k();
        }
    }

    final /* synthetic */ void S5(i2.s sVar, DialogInterface dialogInterface) {
        this.f5579d.d(this.f5581f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        X5(this.f5581f, "rtsdc", map);
        if (sVar != null) {
            sVar.k();
        }
    }

    final /* synthetic */ void T5(Activity activity, i2.s sVar, DialogInterface dialogInterface, int i8) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        X5(this.f5581f, "dialog_click", map);
        Y5(activity, sVar);
    }

    final /* synthetic */ void U5(i2.s sVar, DialogInterface dialogInterface, int i8) {
        this.f5579d.d(this.f5581f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        X5(this.f5581f, "dialog_click", map);
        if (sVar != null) {
            sVar.k();
        }
    }

    final /* synthetic */ void V5(i2.s sVar, DialogInterface dialogInterface) {
        this.f5579d.d(this.f5581f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        X5(this.f5581f, "dialog_click", map);
        if (sVar != null) {
            sVar.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void l1(g3.a aVar, String str, String str2) {
        String str3;
        Context context = (Context) g3.b.H0(aVar);
        g2.t.s().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        p.d dVarN = new p.d(context, "offline_notification_channel").i(W5(e2.b.f21362h, "View the ad you saved when you were offline")).h(W5(e2.b.f21361g, "Tap to open ad")).e(true).j(a6(context, "offline_notification_dismissed", str2, str)).g(a6(context, "offline_notification_clicked", str2, str)).n(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str2, 54321, dVarN.b());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e8) {
            map.put("notification_not_shown_reason", e8.getMessage());
            str3 = "offline_notification_failed";
        }
        X5(str2, str3, map);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void o() {
        final vg0 vg0Var = this.f5578c;
        this.f5579d.j(new dw2() { // from class: com.google.android.gms.internal.ads.j12
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                q12.c(vg0Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
