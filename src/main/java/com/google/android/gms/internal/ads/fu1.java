package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f8060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Sensor f8061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private eu1 f8064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8065g;

    fu1(Context context) {
        this.f8059a = context;
    }

    public final void a() {
        synchronized (this) {
            if (this.f8065g) {
                SensorManager sensorManager = this.f8060b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f8061c);
                    j2.v1.k("Stopped listening for shake gestures.");
                }
                this.f8065g = false;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) h2.y.c().b(ns.J8)).booleanValue()) {
                if (this.f8060b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f8059a.getSystemService("sensor");
                    this.f8060b = sensorManager2;
                    if (sensorManager2 == null) {
                        qg0.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f8061c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f8065g && (sensorManager = this.f8060b) != null && (sensor = this.f8061c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f8062d = g2.t.b().a() - ((long) ((Integer) h2.y.c().b(ns.L8)).intValue());
                    this.f8065g = true;
                    j2.v1.k("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c(eu1 eu1Var) {
        this.f8064f = eu1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) h2.y.c().b(ns.J8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10))) < ((Float) h2.y.c().b(ns.K8)).floatValue()) {
                return;
            }
            long jA = g2.t.b().a();
            if (this.f8062d + ((long) ((Integer) h2.y.c().b(ns.L8)).intValue()) > jA) {
                return;
            }
            if (this.f8062d + ((long) ((Integer) h2.y.c().b(ns.M8)).intValue()) < jA) {
                this.f8063e = 0;
            }
            j2.v1.k("Shake detected.");
            this.f8062d = jA;
            int i8 = this.f8063e + 1;
            this.f8063e = i8;
            eu1 eu1Var = this.f8064f;
            if (eu1Var != null) {
                if (i8 == ((Integer) h2.y.c().b(ns.N8)).intValue()) {
                    ft1 ft1Var = (ft1) eu1Var;
                    ft1Var.h(new ct1(ft1Var), et1.GESTURE);
                }
            }
        }
    }
}
