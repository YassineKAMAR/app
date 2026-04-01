package j2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.bt1;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.ft1;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ft1 f24056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f24058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f24060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PointF f24063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PointF f24064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f24065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Runnable f24066l;

    public v(Context context) {
        this.f24061g = 0;
        this.f24066l = new Runnable() { // from class: j2.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f23977a.g();
            }
        };
        this.f24055a = context;
        this.f24062h = ViewConfiguration.get(context).getScaledTouchSlop();
        g2.t.v().b();
        this.f24065k = g2.t.v().a();
        this.f24056b = g2.t.u().a();
    }

    public v(Context context, String str) {
        this(context);
        this.f24057c = str;
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        bt1 bt1Var = bt1.NONE;
        int iOrdinal = this.f24056b.a().ordinal();
        final int i8 = iOrdinal != 1 ? iOrdinal != 2 ? iU : iU3 : iU2;
        g2.t.r();
        AlertDialog.Builder builderJ = k2.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i8);
        builderJ.setTitle("Setup gesture");
        builderJ.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i8, new DialogInterface.OnClickListener() { // from class: j2.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                atomicInteger.set(i9);
            }
        });
        builderJ.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: j2.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f24031a.r();
            }
        });
        builderJ.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: j2.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f24036a.h(atomicInteger, i8, iU2, iU3, dialogInterface, i9);
            }
        });
        builderJ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: j2.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f24047a.r();
            }
        });
        builderJ.create().show();
    }

    private final boolean t(float f8, float f9, float f10, float f11) {
        return Math.abs(this.f24063i.x - f8) < ((float) this.f24062h) && Math.abs(this.f24063i.y - f9) < ((float) this.f24062h) && Math.abs(this.f24064j.x - f10) < ((float) this.f24062h) && Math.abs(this.f24064j.y - f11) < ((float) this.f24062h);
    }

    private static final int u(List list, String str, boolean z7) {
        if (!z7) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.f24055a);
    }

    final /* synthetic */ void b() {
        s(this.f24055a);
    }

    final /* synthetic */ void c(lg3 lg3Var) {
        if (g2.t.u().j(this.f24055a, this.f24058d, this.f24059e)) {
            lg3Var.execute(new Runnable() { // from class: j2.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24016a.b();
                }
            });
        } else {
            g2.t.u().d(this.f24055a, this.f24058d, this.f24059e);
        }
    }

    final /* synthetic */ void d(lg3 lg3Var) {
        if (g2.t.u().j(this.f24055a, this.f24058d, this.f24059e)) {
            lg3Var.execute(new Runnable() { // from class: j2.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24013a.f();
                }
            });
        } else {
            g2.t.u().d(this.f24055a, this.f24058d, this.f24059e);
        }
    }

    final /* synthetic */ void e() {
        g2.t.u().c(this.f24055a);
    }

    final /* synthetic */ void f() {
        g2.t.u().c(this.f24055a);
    }

    final /* synthetic */ void g() {
        this.f24061g = 4;
        r();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i8, int i9, int i10, DialogInterface dialogInterface, int i11) {
        ft1 ft1Var;
        bt1 bt1Var;
        if (atomicInteger.get() != i8) {
            if (atomicInteger.get() == i9) {
                ft1Var = this.f24056b;
                bt1Var = bt1.SHAKE;
            } else if (atomicInteger.get() == i10) {
                ft1Var = this.f24056b;
                bt1Var = bt1.FLICK;
            } else {
                ft1Var = this.f24056b;
                bt1Var = bt1.NONE;
            }
            ft1Var.l(bt1Var);
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i8) {
        g2.t.r();
        k2.s(this.f24055a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i8, int i9, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (i13 != i8) {
            if (i13 == i9) {
                qg0.b("Debug mode [Creative Preview] selected.");
                eh0.f7322a.execute(new Runnable() { // from class: j2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23981a.l();
                    }
                });
                return;
            }
            if (i13 == i10) {
                qg0.b("Debug mode [Troubleshooting] selected.");
                eh0.f7322a.execute(new Runnable() { // from class: j2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23971a.k();
                    }
                });
                return;
            }
            if (i13 == i11) {
                ft1 ft1Var = this.f24056b;
                final lg3 lg3Var = eh0.f7326e;
                lg3 lg3Var2 = eh0.f7322a;
                if (ft1Var.p()) {
                    lg3Var.execute(new Runnable() { // from class: j2.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24054a.e();
                        }
                    });
                    return;
                } else {
                    lg3Var2.execute(new Runnable() { // from class: j2.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23963a.d(lg3Var);
                        }
                    });
                    return;
                }
            }
            if (i13 == i12) {
                ft1 ft1Var2 = this.f24056b;
                final lg3 lg3Var3 = eh0.f7326e;
                lg3 lg3Var4 = eh0.f7322a;
                if (ft1Var2.p()) {
                    lg3Var3.execute(new Runnable() { // from class: j2.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23958a.a();
                        }
                    });
                    return;
                } else {
                    lg3Var4.execute(new Runnable() { // from class: j2.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24006a.c(lg3Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f24055a instanceof Activity)) {
            qg0.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f24057c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            g2.t.r();
            Map mapO = k2.o(uriBuild);
            for (String str3 : mapO.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapO.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        g2.t.r();
        AlertDialog.Builder builderJ = k2.j(this.f24055a);
        builderJ.setMessage(str2);
        builderJ.setTitle("Ad Information");
        builderJ.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: j2.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
                this.f23989a.i(str2, dialogInterface2, i14);
            }
        });
        builderJ.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: j2.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
            }
        });
        builderJ.create().show();
    }

    final /* synthetic */ void k() {
        z zVarU = g2.t.u();
        String str = this.f24058d;
        String str2 = this.f24059e;
        String str3 = this.f24060f;
        boolean zM = zVarU.m();
        Context context = this.f24055a;
        zVarU.h(zVarU.j(context, str, str2));
        if (!zVarU.m()) {
            zVarU.d(context, str, str2);
            return;
        }
        if (!zM && !TextUtils.isEmpty(str3)) {
            zVarU.e(context, str2, str3, str);
        }
        qg0.b("Device is linked for debug signals.");
        zVarU.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        z zVarU = g2.t.u();
        Context context = this.f24055a;
        String str = this.f24058d;
        String str2 = this.f24059e;
        if (!zVarU.k(context, str, str2)) {
            zVarU.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zVarU.f24081f)) {
            qg0.b("Creative is not pushed for this device.");
            zVarU.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zVarU.f24081f)) {
            qg0.b("The app is not linked for creative preview.");
            zVarU.d(context, str, str2);
        } else if ("0".equals(zVarU.f24081f)) {
            qg0.b("Device is linked for in app preview.");
            zVarU.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f24061g = 0;
            this.f24063i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i8 = this.f24061g;
        if (i8 == -1) {
            return;
        }
        if (i8 == 0) {
            if (actionMasked == 5) {
                this.f24061g = 5;
                this.f24064j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f24065k.postDelayed(this.f24066l, ((Long) h2.y.c().b(ns.f12245z4)).longValue());
                return;
            }
            return;
        }
        if (i8 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z7 = false;
                for (int i9 = 0; i9 < historySize; i9++) {
                    z7 |= !t(motionEvent.getHistoricalX(0, i9), motionEvent.getHistoricalY(0, i9), motionEvent.getHistoricalX(1, i9), motionEvent.getHistoricalY(1, i9));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z7) {
                    return;
                }
            }
            this.f24061g = -1;
            this.f24065k.removeCallbacks(this.f24066l);
        }
    }

    public final void n(String str) {
        this.f24058d = str;
    }

    public final void o(String str) {
        this.f24059e = str;
    }

    public final void p(String str) {
        this.f24057c = str;
    }

    public final void q(String str) {
        this.f24060f = str;
    }

    public final void r() {
        try {
            if (!(this.f24055a instanceof Activity)) {
                qg0.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(g2.t.u().b())) {
                str = "Creative preview";
            }
            String str2 = true != g2.t.u().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.U8)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            g2.t.r();
            AlertDialog.Builder builderJ = k2.j(this.f24055a);
            builderJ.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: j2.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f24018a.j(iU, iU2, iU3, iU4, iU5, dialogInterface, i8);
                }
            });
            builderJ.create().show();
        } catch (WindowManager.BadTokenException e8) {
            v1.l("", e8);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f24057c);
        sb.append(",DebugSignal: ");
        sb.append(this.f24060f);
        sb.append(",AFMA Version: ");
        sb.append(this.f24059e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f24058d);
        sb.append("}");
        return sb.toString();
    }
}
