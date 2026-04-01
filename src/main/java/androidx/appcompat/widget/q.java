package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1080c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f1082b;

    q(ProgressBar progressBar) {
        this.f1081a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable d(Drawable drawable, boolean z7) {
        if (drawable instanceof androidx.core.graphics.drawable.j) {
            androidx.core.graphics.drawable.j jVar = (androidx.core.graphics.drawable.j) drawable;
            Drawable drawableB = jVar.b();
            if (drawableB != null) {
                jVar.a(d(drawableB, z7));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    int id = layerDrawable.getId(i8);
                    drawableArr[i8] = d(layerDrawable.getDrawable(i8), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    layerDrawable2.setId(i9, layerDrawable.getId(i9));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1082b == null) {
                    this.f1082b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i8 = 0; i8 < numberOfFrames; i8++) {
            Drawable drawableD = d(animationDrawable.getFrame(i8), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i8));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f1082b;
    }

    void c(AttributeSet attributeSet, int i8) {
        l1 l1VarU = l1.u(this.f1081a.getContext(), attributeSet, f1080c, i8, 0);
        Drawable drawableG = l1VarU.g(0);
        if (drawableG != null) {
            this.f1081a.setIndeterminateDrawable(e(drawableG));
        }
        Drawable drawableG2 = l1VarU.g(1);
        if (drawableG2 != null) {
            this.f1081a.setProgressDrawable(d(drawableG2, false));
        }
        l1VarU.v();
    }
}
