package c2;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import z1.o;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f3411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView.ScaleType f3412b;

    public b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f3412b = scaleType;
    }

    public void setMediaContent(o oVar) {
        this.f3411a = oVar;
    }
}
