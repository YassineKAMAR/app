package r;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f25817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25819c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f25820d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25821e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<b> f25822f = new ArrayList<>();

    static class a {
        public double a(float f8) {
            throw null;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f25824b;
    }

    public float a(float f8) {
        return (float) this.f25817a.a(f8);
    }

    public String toString() {
        String str = this.f25818b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f25822f.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f25823a + " , " + decimalFormat.format(r3.f25824b) + "] ";
        }
        return str;
    }
}
