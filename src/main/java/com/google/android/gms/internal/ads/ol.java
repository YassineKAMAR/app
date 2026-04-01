package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12528a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ml f12529b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12530c = false;

    public final Activity a() {
        synchronized (this.f12528a) {
            ml mlVar = this.f12529b;
            if (mlVar == null) {
                return null;
            }
            return mlVar.a();
        }
    }

    public final Context b() {
        synchronized (this.f12528a) {
            ml mlVar = this.f12529b;
            if (mlVar == null) {
                return null;
            }
            return mlVar.b();
        }
    }

    public final void c(nl nlVar) {
        synchronized (this.f12528a) {
            if (this.f12529b == null) {
                this.f12529b = new ml();
            }
            this.f12529b.f(nlVar);
        }
    }

    public final void d(Context context) {
        synchronized (this.f12528a) {
            if (!this.f12530c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    qg0.g("Can not cast Context to Application");
                    return;
                }
                if (this.f12529b == null) {
                    this.f12529b = new ml();
                }
                this.f12529b.g(application, context);
                this.f12530c = true;
            }
        }
    }

    public final void e(nl nlVar) {
        synchronized (this.f12528a) {
            ml mlVar = this.f12529b;
            if (mlVar == null) {
                return;
            }
            mlVar.h(nlVar);
        }
    }
}
