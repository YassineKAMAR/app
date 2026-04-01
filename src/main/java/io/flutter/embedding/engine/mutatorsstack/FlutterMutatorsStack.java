package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Matrix f22791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Rect f22792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f22793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f22794d;

        public a(Matrix matrix) {
            this.f22794d = b.TRANSFORM;
            this.f22791a = matrix;
        }

        public a(Rect rect) {
            this.f22794d = b.CLIP_RECT;
            this.f22792b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f22794d = b.CLIP_RRECT;
            this.f22792b = rect;
            this.f22793c = fArr;
        }

        public Matrix a() {
            return this.f22791a;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i8, int i9, int i10, int i11, float[] fArr) {
        Rect rect = new Rect(i8, i9, i10, i11);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i8, int i9, int i10, int i11) {
        Rect rect = new Rect(i8, i9, i10, i11);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
