package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f8513b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimationDrawable f8514a;

    public gv(Context context, fv fvVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        a3.o.j(fvVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f8513b, null, null));
        shapeDrawable.getPaint().setColor(fvVar.p());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(fvVar.q())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(fvVar.q());
            textView.setTextColor(fvVar.m());
            textView.setTextSize(fvVar.P5());
            h2.v.b();
            int iB = jg0.B(context, 4);
            h2.v.b();
            textView.setPadding(iB, 0, jg0.B(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listQ5 = fvVar.Q5();
        if (listQ5 != null && listQ5.size() > 1) {
            this.f8514a = new AnimationDrawable();
            Iterator it = listQ5.iterator();
            while (it.hasNext()) {
                try {
                    this.f8514a.addFrame((Drawable) g3.b.H0(((jv) it.next()).n()), fvVar.k());
                } catch (Exception e8) {
                    qg0.e("Error while getting drawable.", e8);
                }
            }
            imageView.setBackground(this.f8514a);
        } else if (listQ5.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) g3.b.H0(((jv) listQ5.get(0)).n()));
            } catch (Exception e9) {
                qg0.e("Error while getting drawable.", e9);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f8514a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
