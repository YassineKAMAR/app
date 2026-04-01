package io.flutter.embedding.android;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Matrix f22601f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterRenderer f22602a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22604c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22606e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, float[]> f22605d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f22603b = c0.a();

    public c(FlutterRenderer flutterRenderer, boolean z7) {
        this.f22602a = flutterRenderer;
        this.f22604c = z7;
    }

    private void a(MotionEvent motionEvent, int i8, int i9, int i10, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i8, i9, i10, matrix, byteBuffer, null);
    }

    private void b(MotionEvent motionEvent, int i8, int i9, int i10, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        long buttonState;
        long j8;
        double d8;
        double max;
        double min;
        double d9;
        double d10;
        double dG;
        InputDevice.MotionRange motionRange;
        int i11 = -1;
        if (i9 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i8);
        int iF = f(motionEvent.getToolType(i8));
        float[] fArr = {motionEvent.getX(i8), motionEvent.getY(i8)};
        matrix.mapPoints(fArr);
        if (iF == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && i9 == 4) {
                this.f22605d.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            buttonState = iF == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = this.f22605d.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            int iE = e(i9);
            if (iE == -1) {
                return;
            } else {
                i11 = iE;
            }
        }
        long jD = this.f22604c ? this.f22603b.c(motionEvent).d() : 0L;
        int i12 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        int i13 = i11;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jD);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i13);
            j8 = 4;
        } else {
            byteBuffer.putLong(i9);
            j8 = iF;
        }
        byteBuffer.putLong(j8);
        byteBuffer.putLong(i12);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = this.f22605d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            d8 = fArr2[1];
        } else {
            byteBuffer.putDouble(fArr[0]);
            d8 = fArr[1];
        }
        byteBuffer.putDouble(d8);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i8));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            max = 1.0d;
            min = 0.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (iF == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i8));
            d9 = 0.0d;
        } else {
            d9 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(motionEvent.getSize(i8));
        byteBuffer.putDouble(motionEvent.getToolMajor(i8));
        byteBuffer.putDouble(motionEvent.getToolMinor(i8));
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i8));
        if (iF == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i8));
        } else {
            byteBuffer.putDouble(d9);
        }
        byteBuffer.putLong(i10);
        if (i12 == 1) {
            double dC = 48.0d;
            if (context != null) {
                dC = c(context);
                dG = g(context);
            } else {
                dG = 48.0d;
            }
            double d11 = dC * ((double) (-motionEvent.getAxisValue(10, i8)));
            double d12 = dG * ((double) (-motionEvent.getAxisValue(9, i8)));
            byteBuffer.putDouble(d11);
            byteBuffer.putDouble(d12);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = this.f22605d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d10 = 0.0d;
        } else {
            d10 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d10);
        if (zContainsKey && i13 == 9) {
            this.f22605d.remove(Integer.valueOf(pointerId));
        }
    }

    private float c(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : i(context);
    }

    private int d(int i8) {
        if (i8 == 0) {
            return 4;
        }
        if (i8 == 1) {
            return 6;
        }
        if (i8 == 5) {
            return 4;
        }
        if (i8 == 6) {
            return 6;
        }
        if (i8 == 2) {
            return 5;
        }
        if (i8 == 7) {
            return 3;
        }
        if (i8 == 3) {
            return 0;
        }
        return i8 == 8 ? 3 : -1;
    }

    private int e(int i8) {
        if (i8 == 4) {
            return 7;
        }
        if (i8 == 5) {
            return 8;
        }
        return (i8 == 6 || i8 == 0) ? 9 : -1;
    }

    private int f(int i8) {
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 2;
        }
        if (i8 != 3) {
            return i8 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    @TargetApi(26)
    private float h(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int i(Context context) {
        if (this.f22606e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f22606e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f22606e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean z7 = motionEvent.isFromSource(2);
        boolean z8 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z7 || !z8) {
            return false;
        }
        int iD = d(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), iD, 0, f22601f, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 280 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f22602a.l(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f22601f);
    }

    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int iD = d(motionEvent.getActionMasked());
        boolean z7 = actionMasked == 0 || actionMasked == 5;
        boolean z8 = !z7 && (actionMasked == 1 || actionMasked == 6);
        if (z7) {
            a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
        } else {
            int i8 = 0;
            if (z8) {
                while (i8 < pointerCount) {
                    if (i8 != motionEvent.getActionIndex() && motionEvent.getToolType(i8) == 1) {
                        a(motionEvent, i8, 5, 1, matrix, byteBufferAllocateDirect);
                    }
                    i8++;
                }
                a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
            } else {
                while (i8 < pointerCount) {
                    a(motionEvent, i8, iD, 0, matrix, byteBufferAllocateDirect);
                    i8++;
                }
            }
        }
        if (byteBufferAllocateDirect.position() % 280 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f22602a.l(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }
}
