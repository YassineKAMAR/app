package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class zi0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f18244a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Display f18246c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f18249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f18250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private yi0 f18251h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f18247d = new float[9];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f18248e = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18245b = new Object();

    zi0(Context context) {
        this.f18244a = (SensorManager) context.getSystemService("sensor");
        this.f18246c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    final void a(yi0 yi0Var) {
        this.f18251h = yi0Var;
    }

    final void b() {
        if (this.f18250g != null) {
            return;
        }
        Sensor defaultSensor = this.f18244a.getDefaultSensor(11);
        if (defaultSensor == null) {
            qg0.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        e53 e53Var = new e53(handlerThread.getLooper());
        this.f18250g = e53Var;
        if (this.f18244a.registerListener(this, defaultSensor, 0, e53Var)) {
            return;
        }
        qg0.d("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f18250g == null) {
            return;
        }
        this.f18244a.unregisterListener(this);
        this.f18250g.post(new xi0(this));
        this.f18250g = null;
    }

    final boolean d(float[] fArr) {
        synchronized (this.f18245b) {
            float[] fArr2 = this.f18249f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f18245b) {
            if (this.f18249f == null) {
                this.f18249f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f18247d, fArr);
        int rotation = this.f18246c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f18247d, 2, 129, this.f18248e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f18247d, 129, 130, this.f18248e);
        } else if (rotation != 3) {
            System.arraycopy(this.f18247d, 0, this.f18248e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f18247d, 130, 1, this.f18248e);
        }
        float[] fArr2 = this.f18248e;
        float f8 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f8;
        float f9 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f9;
        float f10 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f10;
        synchronized (this.f18245b) {
            System.arraycopy(this.f18248e, 0, this.f18249f, 0, 9);
        }
        yi0 yi0Var = this.f18251h;
        if (yi0Var != null) {
            yi0Var.j();
        }
    }
}
