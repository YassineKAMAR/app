package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class qs1 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f13746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sensor f13747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13748c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f13749d = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13750e = g2.t.b().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13751f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13752g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13753h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ps1 f13754i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13755j = false;

    qs1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f13746a = sensorManager;
        if (sensorManager != null) {
            this.f13747b = sensorManager.getDefaultSensor(4);
        } else {
            this.f13747b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f13755j && (sensorManager = this.f13746a) != null && (sensor = this.f13747b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f13755j = false;
                j2.v1.k("Stopped listening for flick gestures.");
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) h2.y.c().b(ns.O8)).booleanValue()) {
                if (!this.f13755j && (sensorManager = this.f13746a) != null && (sensor = this.f13747b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f13755j = true;
                    j2.v1.k("Listening for flick gestures.");
                }
                if (this.f13746a == null || this.f13747b == null) {
                    qg0.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c(ps1 ps1Var) {
        this.f13754i = ps1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) h2.y.c().b(ns.O8)).booleanValue()) {
            long jA = g2.t.b().a();
            if (this.f13750e + ((long) ((Integer) h2.y.c().b(ns.Q8)).intValue()) < jA) {
                this.f13751f = 0;
                this.f13750e = jA;
                this.f13752g = false;
                this.f13753h = false;
                this.f13748c = this.f13749d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f13749d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f13749d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f8 = this.f13748c;
            fs fsVar = ns.P8;
            if (fFloatValue > f8 + ((Float) h2.y.c().b(fsVar)).floatValue()) {
                this.f13748c = this.f13749d.floatValue();
                this.f13753h = true;
            } else if (this.f13749d.floatValue() < this.f13748c - ((Float) h2.y.c().b(fsVar)).floatValue()) {
                this.f13748c = this.f13749d.floatValue();
                this.f13752g = true;
            }
            if (this.f13749d.isInfinite()) {
                this.f13749d = Float.valueOf(0.0f);
                this.f13748c = 0.0f;
            }
            if (this.f13752g && this.f13753h) {
                j2.v1.k("Flick detected.");
                this.f13750e = jA;
                int i8 = this.f13751f + 1;
                this.f13751f = i8;
                this.f13752g = false;
                this.f13753h = false;
                ps1 ps1Var = this.f13754i;
                if (ps1Var != null) {
                    if (i8 == ((Integer) h2.y.c().b(ns.R8)).intValue()) {
                        ft1 ft1Var = (ft1) ps1Var;
                        ft1Var.h(new dt1(ft1Var), et1.GESTURE);
                    }
                }
            }
        }
    }
}
