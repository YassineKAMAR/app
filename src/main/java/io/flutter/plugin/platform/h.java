package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.s1;
import java.io.FileNotFoundException;
import java.util.List;
import r5.j;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f22946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.j f22947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f22948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.C0165j f22949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final j.h f22951f;

    class a implements j.h {
        a() {
        }

        @Override // r5.j.h
        public CharSequence a(j.e eVar) {
            return h.this.q(eVar);
        }

        @Override // r5.j.h
        public void b() {
            h.this.s();
        }

        @Override // r5.j.h
        public void c(List<j.l> list) {
            h.this.z(list);
        }

        @Override // r5.j.h
        public void d(String str) {
            h.this.u(str);
        }

        @Override // r5.j.h
        public void e(j.i iVar) {
            h.this.r(iVar);
        }

        @Override // r5.j.h
        public void f(boolean z7) {
            h.this.v(z7);
        }

        @Override // r5.j.h
        public void g(j.C0165j c0165j) {
            h.this.B(c0165j);
        }

        @Override // r5.j.h
        public void h(j.c cVar) {
            h.this.w(cVar);
        }

        @Override // r5.j.h
        public void i(j.k kVar) {
            h.this.y(kVar);
        }

        @Override // r5.j.h
        public void j(j.g gVar) {
            h.this.D(gVar);
        }

        @Override // r5.j.h
        public void k() {
            h.this.x();
        }

        @Override // r5.j.h
        public void l() {
            h.this.t();
        }

        @Override // r5.j.h
        public void m(int i8) {
            h.this.A(i8);
        }

        @Override // r5.j.h
        public boolean n() {
            return h.this.o();
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22953a;

        b(View view) {
            this.f22953a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i8) {
            r5.j jVar;
            boolean z7;
            if ((i8 & 4) == 0) {
                jVar = h.this.f22947b;
                z7 = true;
            } else {
                jVar = h.this.f22947b;
                z7 = false;
            }
            jVar.m(z7);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i8) {
            this.f22953a.post(new Runnable() { // from class: io.flutter.plugin.platform.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22958a.b(i8);
                }
            });
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f22957c;

        static {
            int[] iArr = new int[j.d.values().length];
            f22957c = iArr;
            try {
                iArr[j.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22957c[j.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[j.l.values().length];
            f22956b = iArr2;
            try {
                iArr2[j.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22956b[j.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[j.g.values().length];
            f22955a = iArr3;
            try {
                iArr3[j.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22955a[j.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22955a[j.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22955a[j.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22955a[j.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean b();

        void f(boolean z7);
    }

    public h(Activity activity, r5.j jVar, d dVar) {
        a aVar = new a();
        this.f22951f = aVar;
        this.f22946a = activity;
        this.f22947b = jVar;
        jVar.l(aVar);
        this.f22948c = dVar;
        this.f22950e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i8) {
        this.f22946a.setRequestedOrientation(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void B(j.C0165j c0165j) {
        Window window = this.f22946a.getWindow();
        s1 s1Var = new s1(window, window.getDecorView());
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i8 >= 23) {
            j.d dVar = c0165j.f25984b;
            if (dVar != null) {
                int i9 = c.f22957c[dVar.ordinal()];
                if (i9 == 1) {
                    s1Var.b(true);
                } else if (i9 == 2) {
                    s1Var.b(false);
                }
            }
            Integer num = c0165j.f25983a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = c0165j.f25985c;
        if (bool != null && i8 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i8 >= 26) {
            j.d dVar2 = c0165j.f25987e;
            if (dVar2 != null) {
                int i10 = c.f22957c[dVar2.ordinal()];
                if (i10 == 1) {
                    s1Var.a(true);
                } else if (i10 == 2) {
                    s1Var.a(false);
                }
            }
            Integer num2 = c0165j.f25986d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c0165j.f25988f;
        if (num3 != null && i8 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0165j.f25989g;
        if (bool2 != null && i8 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f22949d = c0165j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f22946a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence q(j.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f22946a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null && eVar != j.e.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f22946a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.f22946a);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e8) {
            g5.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(j.i iVar) {
        if (iVar == j.i.CLICK) {
            this.f22946a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        d dVar = this.f22948c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f22946a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).h().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str) {
        ((ClipboardManager) this.f22946a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z7) {
        this.f22948c.f(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(j.c cVar) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 28 && i8 > 21) {
            this.f22946a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f25958b, (Bitmap) null, cVar.f25957a));
        }
        if (i8 >= 28) {
            this.f22946a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f25958b, 0, cVar.f25957a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        View decorView = this.f22946a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(j.k kVar) {
        int i8;
        if (kVar == j.k.LEAN_BACK) {
            i8 = 1798;
        } else if (kVar == j.k.IMMERSIVE) {
            i8 = 3846;
        } else if (kVar == j.k.IMMERSIVE_STICKY) {
            i8 = 5894;
        } else if (kVar != j.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i8 = 1792;
        }
        this.f22950e = i8;
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(List<j.l> list) {
        int i8 = list.size() == 0 ? 5894 : 1798;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int i10 = c.f22956b[list.get(i9).ordinal()];
            if (i10 == 1) {
                i8 &= -5;
            } else if (i10 == 2) {
                i8 = i8 & (-513) & (-3);
            }
        }
        this.f22950e = i8;
        C();
    }

    public void C() {
        this.f22946a.getWindow().getDecorView().setSystemUiVisibility(this.f22950e);
        j.C0165j c0165j = this.f22949d;
        if (c0165j != null) {
            B(c0165j);
        }
    }

    void D(j.g gVar) {
        int i8;
        View decorView = this.f22946a.getWindow().getDecorView();
        int i9 = c.f22955a[gVar.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    i10 = 4;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i8 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i10);
            return;
        }
        i8 = 0;
        decorView.performHapticFeedback(i8);
    }

    public void p() {
        this.f22947b.l(null);
    }
}
