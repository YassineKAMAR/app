package f5;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
class b implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vibrator f21782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21784c;

    b(Vibrator vibrator) {
        this.f21782a = vibrator;
        this.f21783b = vibrator.hasVibrator();
        this.f21784c = Build.VERSION.SDK_INT < 26;
    }

    private void a(int i8) {
        if (this.f21783b) {
            if (this.f21784c) {
                this.f21782a.vibrate(i8);
            } else {
                this.f21782a.vibrate(VibrationEffect.createOneShot(i8, -1));
            }
        }
    }

    @Override // s5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        int iIntValue;
        String str = jVar.f26252a;
        str.hashCode();
        switch (str) {
            case "success":
                iIntValue = 50;
                a(iIntValue);
                dVar.a(null);
                break;
            case "selection":
                a(3);
                dVar.a(null);
                break;
            case "impact":
                a(1);
                dVar.a(null);
                break;
            case "medium":
                iIntValue = 40;
                a(iIntValue);
                dVar.a(null);
                break;
            case "canVibrate":
                dVar.a(Boolean.valueOf(this.f21783b));
                break;
            case "error":
                iIntValue = 500;
                a(iIntValue);
                dVar.a(null);
                break;
            case "heavy":
                iIntValue = 100;
                a(iIntValue);
                dVar.a(null);
                break;
            case "light":
                iIntValue = 10;
                a(iIntValue);
                dVar.a(null);
                break;
            case "vibrate":
                iIntValue = ((Integer) jVar.a("duration")).intValue();
                a(iIntValue);
                dVar.a(null);
                break;
            case "warning":
                iIntValue = 250;
                a(iIntValue);
                dVar.a(null);
                break;
            default:
                dVar.c();
                break;
        }
    }
}
