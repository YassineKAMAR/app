package i2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import j2.k2;

/* JADX INFO: loaded from: classes.dex */
final class q extends j2.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f22517c;

    /* synthetic */ q(s sVar, p pVar) {
        this.f22517c = sVar;
    }

    @Override // j2.b0
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapA = g2.t.w().a(Integer.valueOf(this.f22517c.f22520b.f4738o.f21972f));
        if (bitmapA != null) {
            g2.t.r();
            s sVar = this.f22517c;
            g2.j jVar = sVar.f22520b.f4738o;
            boolean z7 = jVar.f21970d;
            float f8 = jVar.f21971e;
            Activity activity = sVar.f22519a;
            if (!z7 || f8 <= 0.0f || f8 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth(), bitmapA.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f8);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
                }
            }
            k2.f23991k.post(new Runnable() { // from class: i2.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22515a.f22517c.f22519a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
