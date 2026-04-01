package x2;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.p;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27257c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f27255e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f27256f = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27254d = f.f27262a;

    public static e m() {
        return f27256f;
    }

    @Override // x2.f
    public Intent b(Context context, int i8, String str) {
        return super.b(context, i8, str);
    }

    @Override // x2.f
    public PendingIntent c(Context context, int i8, int i9) {
        return super.c(context, i8, i9);
    }

    @Override // x2.f
    public final String e(int i8) {
        return super.e(i8);
    }

    @Override // x2.f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // x2.f
    public int h(Context context, int i8) {
        return super.h(context, i8);
    }

    @Override // x2.f
    public final boolean j(int i8) {
        return super.j(i8);
    }

    public Dialog k(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i8, a3.d0.b(activity, b(activity, i8, "d"), i9), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.p() ? bVar.n() : c(context, bVar.g(), 0);
    }

    public boolean n(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i8, i9, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i8) {
        t(context, i8, null, d(context, i8, 0, "n"));
    }

    final Dialog p(Context context, int i8, a3.d0 d0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(a3.a0.d(context, i8));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = a3.a0.c(context, i8);
        if (strC != null) {
            builder.setPositiveButton(strC, d0Var);
        }
        String strG = a3.a0.g(context, i8);
        if (strG != null) {
            builder.setTitle(strG);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i8)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(a3.a0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final z2.q r(Context context, z2.p pVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        z2.q qVar = new z2.q(pVar);
        context.registerReceiver(qVar, intentFilter);
        qVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return qVar;
        }
        pVar.a();
        qVar.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                l.u1(dialog, onCancelListener).t1(((androidx.fragment.app.d) activity).s(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void t(Context context, int i8, String str, PendingIntent pendingIntent) {
        int i9;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i8), null), new IllegalArgumentException());
        if (i8 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i8 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = a3.a0.f(context, i8);
        String strE = a3.a0.e(context, i8);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) a3.o.j(context.getSystemService("notification"));
        p.d dVarO = new p.d(context).l(true).e(true).i(strF).o(new p.b().h(strE));
        if (e3.i.f(context)) {
            a3.o.m(e3.m.e());
            dVarO.n(context.getApplicationInfo().icon).m(2);
            if (e3.i.g(context)) {
                dVarO.a(w2.a.f27090a, resources.getString(w2.b.f27105o), pendingIntent);
            } else {
                dVarO.g(pendingIntent);
            }
        } else {
            dVarO.n(R.drawable.stat_sys_warning).p(resources.getString(w2.b.f27098h)).q(System.currentTimeMillis()).g(pendingIntent).h(strE);
        }
        if (e3.m.i()) {
            a3.o.m(e3.m.i());
            synchronized (f27255e) {
                str2 = this.f27257c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = a3.a0.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strB, 4));
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarO.f(str2);
        }
        Notification notificationB = dVarO.b();
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            i.f27268b.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, notificationB);
    }

    final void u(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, z2.e eVar, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i8, a3.d0.c(eVar, b(activity, i8, "d"), 2), onCancelListener);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i8) {
        PendingIntent pendingIntentL;
        if (f3.b.a(context) || (pendingIntentL = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.g(), null, k3.e.a(context, 0, GoogleApiActivity.a(context, pendingIntentL, i8, true), k3.e.f24205a | 134217728));
        return true;
    }
}
