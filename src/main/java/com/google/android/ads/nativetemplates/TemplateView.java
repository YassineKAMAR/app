package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.a;
import io.flutter.plugins.googlemobileads.k0;
import io.flutter.plugins.googlemobileads.l0;
import io.flutter.plugins.googlemobileads.m0;
import k1.a;

/* JADX INFO: loaded from: classes.dex */
public final class TemplateView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f4687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.ads.nativead.a f4688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeAdView f4689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f4690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f4691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RatingBar f4692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f4693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f4694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaView f4695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Button f4696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ConstraintLayout f4697l;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    private boolean a(com.google.android.gms.ads.nativead.a aVar) {
        return !TextUtils.isEmpty(aVar.i()) && TextUtils.isEmpty(aVar.b());
    }

    private void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable colorDrawableV = this.f4687b.v();
        if (colorDrawableV != null) {
            this.f4697l.setBackground(colorDrawableV);
            TextView textView13 = this.f4690e;
            if (textView13 != null) {
                textView13.setBackground(colorDrawableV);
            }
            TextView textView14 = this.f4691f;
            if (textView14 != null) {
                textView14.setBackground(colorDrawableV);
            }
            TextView textView15 = this.f4693h;
            if (textView15 != null) {
                textView15.setBackground(colorDrawableV);
            }
        }
        Typeface typefaceY = this.f4687b.y();
        if (typefaceY != null && (textView12 = this.f4690e) != null) {
            textView12.setTypeface(typefaceY);
        }
        Typeface typefaceC = this.f4687b.C();
        if (typefaceC != null && (textView11 = this.f4691f) != null) {
            textView11.setTypeface(typefaceC);
        }
        Typeface typefaceG = this.f4687b.G();
        if (typefaceG != null && (textView10 = this.f4693h) != null) {
            textView10.setTypeface(typefaceG);
        }
        Typeface typefaceT = this.f4687b.t();
        if (typefaceT != null && (button4 = this.f4696k) != null) {
            button4.setTypeface(typefaceT);
        }
        if (this.f4687b.z() != null && (textView9 = this.f4690e) != null) {
            textView9.setTextColor(this.f4687b.z().intValue());
        }
        if (this.f4687b.D() != null && (textView8 = this.f4691f) != null) {
            textView8.setTextColor(this.f4687b.D().intValue());
        }
        if (this.f4687b.H() != null && (textView7 = this.f4693h) != null) {
            textView7.setTextColor(this.f4687b.H().intValue());
        }
        if (this.f4687b.u() != null && (button3 = this.f4696k) != null) {
            button3.setTextColor(this.f4687b.u().intValue());
        }
        float fS = this.f4687b.s();
        if (fS > 0.0f && (button2 = this.f4696k) != null) {
            button2.setTextSize(fS);
        }
        float fX = this.f4687b.x();
        if (fX > 0.0f && (textView6 = this.f4690e) != null) {
            textView6.setTextSize(fX);
        }
        float fB = this.f4687b.B();
        if (fB > 0.0f && (textView5 = this.f4691f) != null) {
            textView5.setTextSize(fB);
        }
        float F = this.f4687b.F();
        if (F > 0.0f && (textView4 = this.f4693h) != null) {
            textView4.setTextSize(F);
        }
        ColorDrawable colorDrawableR = this.f4687b.r();
        if (colorDrawableR != null && (button = this.f4696k) != null) {
            button.setBackground(colorDrawableR);
        }
        ColorDrawable colorDrawableW = this.f4687b.w();
        if (colorDrawableW != null && (textView3 = this.f4690e) != null) {
            textView3.setBackground(colorDrawableW);
        }
        ColorDrawable colorDrawableA = this.f4687b.A();
        if (colorDrawableA != null && (textView2 = this.f4691f) != null) {
            textView2.setBackground(colorDrawableA);
        }
        ColorDrawable colorDrawableE = this.f4687b.E();
        if (colorDrawableE != null && (textView = this.f4693h) != null) {
            textView.setBackground(colorDrawableE);
        }
        invalidate();
        requestLayout();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.f23305z0, 0, 0);
        try {
            this.f4686a = typedArrayObtainStyledAttributes.getResourceId(m0.A0, l0.f23244a);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f4686a, this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c() {
        this.f4688c.a();
    }

    public NativeAdView getNativeAdView() {
        return this.f4689d;
    }

    public String getTemplateTypeName() {
        int i8 = this.f4686a;
        return i8 == l0.f23244a ? "medium_template" : i8 == l0.f23245b ? "small_template" : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4689d = (NativeAdView) findViewById(k0.f23222f);
        this.f4690e = (TextView) findViewById(k0.f23223g);
        this.f4691f = (TextView) findViewById(k0.f23225i);
        this.f4693h = (TextView) findViewById(k0.f23218b);
        RatingBar ratingBar = (RatingBar) findViewById(k0.f23224h);
        this.f4692g = ratingBar;
        ratingBar.setEnabled(false);
        this.f4696k = (Button) findViewById(k0.f23219c);
        this.f4694i = (ImageView) findViewById(k0.f23220d);
        this.f4695j = (MediaView) findViewById(k0.f23221e);
        this.f4697l = (ConstraintLayout) findViewById(k0.f23217a);
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.a aVar) {
        this.f4688c = aVar;
        String strI = aVar.i();
        String strB = aVar.b();
        String strE = aVar.e();
        String strC = aVar.c();
        String strD = aVar.d();
        Double dH = aVar.h();
        a.b bVarF = aVar.f();
        this.f4689d.setCallToActionView(this.f4696k);
        this.f4689d.setHeadlineView(this.f4690e);
        this.f4689d.setMediaView(this.f4695j);
        this.f4691f.setVisibility(0);
        if (a(aVar)) {
            this.f4689d.setStoreView(this.f4691f);
        } else if (TextUtils.isEmpty(strB)) {
            strI = "";
        } else {
            this.f4689d.setAdvertiserView(this.f4691f);
            strI = strB;
        }
        this.f4690e.setText(strE);
        this.f4696k.setText(strD);
        if (dH == null || dH.doubleValue() <= 0.0d) {
            this.f4691f.setText(strI);
            this.f4691f.setVisibility(0);
            this.f4692g.setVisibility(8);
        } else {
            this.f4691f.setVisibility(8);
            this.f4692g.setVisibility(0);
            this.f4692g.setRating(dH.floatValue());
            this.f4689d.setStarRatingView(this.f4692g);
        }
        ImageView imageView = this.f4694i;
        if (bVarF != null) {
            imageView.setVisibility(0);
            this.f4694i.setImageDrawable(bVarF.a());
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = this.f4693h;
        if (textView != null) {
            textView.setText(strC);
            this.f4689d.setBodyView(this.f4693h);
        }
        this.f4689d.setNativeAd(aVar);
    }

    public void setStyles(k1.a aVar) {
        this.f4687b = aVar;
        b();
    }
}
