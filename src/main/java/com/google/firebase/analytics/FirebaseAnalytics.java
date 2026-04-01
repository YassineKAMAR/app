package com.google.firebase.analytics;

import a3.o;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.g2;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3.c0;
import s3.h;
import s3.k;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f20766c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2 f20767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f20768b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(g2 g2Var) {
        o.j(g2Var);
        this.f20767a = g2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f20766c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f20766c == null) {
                    f20766c = new FirebaseAnalytics(g2.f(context));
                }
            }
        }
        return f20766c;
    }

    @Keep
    public static c0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        g2 g2VarG = g2.g(context, null, null, null, bundle);
        if (g2VarG == null) {
            return null;
        }
        return new c(g2VarG);
    }

    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f20768b == null) {
                this.f20768b = new com.google.firebase.analytics.b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f20768b;
        }
        return executorService;
    }

    public final h<String> a() {
        try {
            return k.c(l(), new com.google.firebase.analytics.a(this));
        } catch (RuntimeException e8) {
            this.f20767a.j(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return k.d(e8);
        }
    }

    public final h<Long> b() {
        try {
            return k.c(l(), new d(this));
        } catch (RuntimeException e8) {
            this.f20767a.j(5, "Failed to schedule task for getSessionId", null, null, null);
            return k.d(e8);
        }
    }

    public final void c(String str, Bundle bundle) {
        this.f20767a.t(str, bundle);
    }

    public final void d() {
        this.f20767a.T();
    }

    public final void e(boolean z7) {
        this.f20767a.r(Boolean.valueOf(z7));
    }

    public final void f(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f20767a.H(bundle);
    }

    public final void g(Bundle bundle) {
        this.f20767a.M(bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) k.b(com.google.firebase.installations.b.n().l(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long j8) {
        this.f20767a.k(j8);
    }

    public final void i(String str) {
        this.f20767a.N(str);
    }

    public final void j(String str, String str2) {
        this.f20767a.D(str, str2);
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f20767a.l(activity, str, str2);
    }
}
