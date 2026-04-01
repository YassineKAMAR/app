package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y extends u6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AccountManager f20689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f20690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20691g;

    y(w5 w5Var) {
        super(w5Var);
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean q() {
        Calendar calendar = Calendar.getInstance();
        this.f20687c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f20688d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    final long s() {
        i();
        return this.f20691g;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    public final long v() {
        l();
        return this.f20687c;
    }

    public final String w() {
        l();
        return this.f20688d;
    }

    final void x() {
        i();
        this.f20690f = null;
        this.f20691g = 0L;
    }

    final boolean y() {
        i();
        long jA = k().a();
        if (jA - this.f20691g > 86400000) {
            this.f20690f = null;
        }
        Boolean bool = this.f20690f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.a.a(j(), "android.permission.GET_ACCOUNTS") != 0) {
            t().N().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f20689e == null) {
                this.f20689e = AccountManager.get(j());
            }
            try {
                Account[] result = this.f20689e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f20690f = Boolean.TRUE;
                    this.f20691g = jA;
                    return true;
                }
                Account[] result2 = this.f20689e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f20690f = Boolean.TRUE;
                    this.f20691g = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e8) {
                t().I().b("Exception checking account types", e8);
            }
        }
        this.f20691g = jA;
        this.f20690f = Boolean.FALSE;
        return false;
    }
}
