package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
final class d extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewGroup f23135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23136i;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != d.this.f23136i) {
                d dVar = d.this;
                dVar.f23204b.s(dVar.f23147a, measuredHeight);
            }
            d.this.f23136i = measuredHeight;
        }
    }

    d(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, c cVar) {
        super(i8, aVar, str, Collections.singletonList(new m(z1.h.f27631p)), iVar, cVar);
        this.f23136i = -1;
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.g
    public void a() {
        a2.b bVar = this.f23209g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new a());
            this.f23204b.m(this.f23147a, this.f23209g.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.e
    void b() {
        a2.b bVar = this.f23209g;
        if (bVar != null) {
            bVar.a();
            this.f23209g = null;
        }
        ViewGroup viewGroup = this.f23135h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f23135h = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.e
    io.flutter.plugin.platform.k c() {
        if (this.f23209g == null) {
            return null;
        }
        ViewGroup viewGroup = this.f23135h;
        if (viewGroup != null) {
            return new b0(viewGroup);
        }
        ScrollView scrollViewH = h();
        if (scrollViewH == null) {
            return null;
        }
        scrollViewH.setClipChildren(false);
        scrollViewH.setVerticalScrollBarEnabled(false);
        scrollViewH.setHorizontalScrollBarEnabled(false);
        this.f23135h = scrollViewH;
        scrollViewH.addView(this.f23209g);
        return new b0(this.f23209g);
    }

    ScrollView h() {
        if (this.f23204b.f() != null) {
            return new ScrollView(this.f23204b.f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }
}
