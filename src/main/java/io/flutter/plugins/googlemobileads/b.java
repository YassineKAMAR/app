package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.i;
import io.flutter.plugins.googlemobileads.l;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
class b extends s5.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f23126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final m.a f23127e = new m.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j0 f23128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f23129g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23130a;

        static {
            int[] iArr = new int[o.b.values().length];
            f23130a = iArr;
            try {
                iArr[o.b.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23130a[o.b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    b(Context context, c0 c0Var) {
        this.f23126d = context;
        this.f23129g = c0Var;
    }

    private static Boolean q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    @Override // s5.s
    protected Object g(byte b8, ByteBuffer byteBuffer) {
        switch (b8) {
            case -128:
                return new m(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new l.a().n((List) g(byteBuffer.get(), byteBuffer)).l((String) g(byteBuffer.get(), byteBuffer)).r(q(g(byteBuffer.get(), byteBuffer))).q((List) g(byteBuffer.get(), byteBuffer)).m((Integer) g(byteBuffer.get(), byteBuffer)).o((String) g(byteBuffer.get(), byteBuffer)).p(this.f23128f).k((Map) g(byteBuffer.get(), byteBuffer)).s(this.f23129g.a()).a();
            case -126:
                return new m.c();
            case -125:
            case -109:
            default:
                return super.g(b8, byteBuffer);
            case -124:
                return new d0.b((Integer) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -123:
                return new e.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (e.C0127e) g(byteBuffer.get(), byteBuffer));
            case -122:
                i.b bVar = new i.b();
                bVar.n((List) g(byteBuffer.get(), byteBuffer));
                bVar.l((String) g(byteBuffer.get(), byteBuffer));
                bVar.u((Map) g(byteBuffer.get(), byteBuffer));
                bVar.v((Map) g(byteBuffer.get(), byteBuffer));
                bVar.r((Boolean) g(byteBuffer.get(), byteBuffer));
                bVar.q((List) g(byteBuffer.get(), byteBuffer));
                bVar.m((Integer) g(byteBuffer.get(), byteBuffer));
                bVar.w((String) g(byteBuffer.get(), byteBuffer));
                bVar.o((String) g(byteBuffer.get(), byteBuffer));
                bVar.p(this.f23128f);
                bVar.k((Map) g(byteBuffer.get(), byteBuffer));
                bVar.s(this.f23129g.a());
                return bVar.a();
            case -121:
                String str = (String) g(byteBuffer.get(), byteBuffer);
                str.hashCode();
                if (str.equals("ready")) {
                    return o.b.READY;
                }
                if (str.equals("notReady")) {
                    return o.b.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", str));
            case -120:
                return new o((o.b) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (Number) g(byteBuffer.get(), byteBuffer));
            case -119:
                return new t((Map<String, o>) g(byteBuffer.get(), byteBuffer));
            case -118:
                return new f0((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -117:
                return new e.a(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -116:
                return new e.C0127e((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (List) g(byteBuffer.get(), byteBuffer), (e.b) g(byteBuffer.get(), byteBuffer), (Map) g(byteBuffer.get(), byteBuffer));
            case -115:
                return new e.b((String) g(byteBuffer.get(), byteBuffer), ((Long) g(byteBuffer.get(), byteBuffer)).longValue(), (String) g(byteBuffer.get(), byteBuffer), (Map) g(byteBuffer.get(), byteBuffer), (e.a) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -114:
                return new m.b(this.f23126d, this.f23127e, (String) g(byteBuffer.get(), byteBuffer), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new m.e();
            case -112:
                return new z((Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer), (g0) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -111:
                return new g0((Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -110:
                Integer num = (Integer) g(byteBuffer.get(), byteBuffer);
                return new m.d(this.f23127e, this.f23126d, num.intValue(), (Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer));
            case -108:
                v.a aVar = new v.a();
                aVar.b((String) g(byteBuffer.get(), byteBuffer));
                aVar.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.d(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.e((List) g(byteBuffer.get(), byteBuffer));
                return aVar.a();
            case -107:
                return new w5.b((w5.d) g(byteBuffer.get(), byteBuffer), (ColorDrawable) g(byteBuffer.get(), byteBuffer), (w5.c) g(byteBuffer.get(), byteBuffer), (w5.c) g(byteBuffer.get(), byteBuffer), (w5.c) g(byteBuffer.get(), byteBuffer), (w5.c) g(byteBuffer.get(), byteBuffer));
            case -106:
                return new w5.c((ColorDrawable) g(byteBuffer.get(), byteBuffer), (ColorDrawable) g(byteBuffer.get(), byteBuffer), (w5.a) g(byteBuffer.get(), byteBuffer), (Double) g(byteBuffer.get(), byteBuffer));
            case -105:
                return w5.a.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -104:
                return w5.d.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -103:
                return new ColorDrawable(Color.argb(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue()));
        }
    }

    @Override // s5.s
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object objC;
        Enum r52;
        String str;
        Object objE;
        l lVar;
        if (obj instanceof m) {
            t(byteArrayOutputStream, (m) obj);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(-122);
            i iVar = (i) obj;
            p(byteArrayOutputStream, iVar.f());
            p(byteArrayOutputStream, iVar.d());
            p(byteArrayOutputStream, iVar.l());
            p(byteArrayOutputStream, iVar.m());
            p(byteArrayOutputStream, iVar.i());
            p(byteArrayOutputStream, iVar.h());
            p(byteArrayOutputStream, iVar.e());
            objE = iVar.n();
            lVar = iVar;
        } else {
            if (!(obj instanceof l)) {
                if (obj instanceof d0.b) {
                    byteArrayOutputStream.write(-124);
                    d0.b bVar = (d0.b) obj;
                    p(byteArrayOutputStream, bVar.f23145a);
                    objC = bVar.f23146b;
                } else if (obj instanceof e.b) {
                    byteArrayOutputStream.write(-115);
                    e.b bVar2 = (e.b) obj;
                    p(byteArrayOutputStream, bVar2.f());
                    p(byteArrayOutputStream, Long.valueOf(bVar2.i()));
                    p(byteArrayOutputStream, bVar2.g());
                    p(byteArrayOutputStream, bVar2.e());
                    p(byteArrayOutputStream, bVar2.h());
                    p(byteArrayOutputStream, bVar2.d());
                    p(byteArrayOutputStream, bVar2.a());
                    p(byteArrayOutputStream, bVar2.c());
                    objC = bVar2.b();
                } else if (obj instanceof e.C0127e) {
                    byteArrayOutputStream.write(-116);
                    e.C0127e c0127e = (e.C0127e) obj;
                    p(byteArrayOutputStream, c0127e.e());
                    p(byteArrayOutputStream, c0127e.c());
                    p(byteArrayOutputStream, c0127e.a());
                    p(byteArrayOutputStream, c0127e.b());
                    objC = c0127e.d();
                } else if (obj instanceof e.c) {
                    byteArrayOutputStream.write(-123);
                    e.c cVar = (e.c) obj;
                    p(byteArrayOutputStream, Integer.valueOf(cVar.f23160a));
                    p(byteArrayOutputStream, cVar.f23161b);
                    p(byteArrayOutputStream, cVar.f23162c);
                    objC = cVar.f23163d;
                } else if (obj instanceof e.a) {
                    byteArrayOutputStream.write(-117);
                    e.a aVar = (e.a) obj;
                    p(byteArrayOutputStream, Integer.valueOf(aVar.f23148a));
                    p(byteArrayOutputStream, aVar.f23149b);
                    objC = aVar.f23150c;
                } else {
                    if (obj instanceof o.b) {
                        byteArrayOutputStream.write(-121);
                        o.b bVar3 = (o.b) obj;
                        int i8 = a.f23130a[bVar3.ordinal()];
                        if (i8 == 1) {
                            str = "notReady";
                        } else {
                            if (i8 != 2) {
                                throw new IllegalArgumentException(String.format("Unable to handle state: %s", bVar3));
                            }
                            str = "ready";
                        }
                        p(byteArrayOutputStream, str);
                        return;
                    }
                    if (obj instanceof o) {
                        byteArrayOutputStream.write(-120);
                        o oVar = (o) obj;
                        p(byteArrayOutputStream, oVar.f23309a);
                        p(byteArrayOutputStream, oVar.f23310b);
                        objC = oVar.f23311c;
                    } else if (obj instanceof t) {
                        byteArrayOutputStream.write(-119);
                        objC = ((t) obj).f23333a;
                    } else if (obj instanceof f0) {
                        byteArrayOutputStream.write(-118);
                        f0 f0Var = (f0) obj;
                        p(byteArrayOutputStream, f0Var.c());
                        objC = f0Var.b();
                    } else if (obj instanceof z) {
                        byteArrayOutputStream.write(-112);
                        z zVar = (z) obj;
                        p(byteArrayOutputStream, zVar.f23364a);
                        p(byteArrayOutputStream, zVar.f23365b);
                        p(byteArrayOutputStream, zVar.f23366c);
                        p(byteArrayOutputStream, zVar.f23367d);
                        p(byteArrayOutputStream, zVar.f23368e);
                        objC = zVar.f23369f;
                    } else if (obj instanceof z1.v) {
                        byteArrayOutputStream.write(-108);
                        z1.v vVar = (z1.v) obj;
                        p(byteArrayOutputStream, vVar.a());
                        p(byteArrayOutputStream, Integer.valueOf(vVar.c()));
                        p(byteArrayOutputStream, Integer.valueOf(vVar.d()));
                        objC = vVar.e();
                    } else if (obj instanceof g0) {
                        byteArrayOutputStream.write(-111);
                        g0 g0Var = (g0) obj;
                        p(byteArrayOutputStream, g0Var.f23180a);
                        p(byteArrayOutputStream, g0Var.f23181b);
                        objC = g0Var.f23182c;
                    } else if (obj instanceof w5.b) {
                        byteArrayOutputStream.write(-107);
                        w5.b bVar4 = (w5.b) obj;
                        p(byteArrayOutputStream, bVar4.g());
                        p(byteArrayOutputStream, bVar4.d());
                        p(byteArrayOutputStream, bVar4.c());
                        p(byteArrayOutputStream, bVar4.e());
                        p(byteArrayOutputStream, bVar4.f());
                        objC = bVar4.h();
                    } else {
                        if (obj instanceof w5.a) {
                            byteArrayOutputStream.write(-105);
                            r52 = (w5.a) obj;
                        } else if (obj instanceof w5.d) {
                            byteArrayOutputStream.write(-104);
                            r52 = (w5.d) obj;
                        } else {
                            if (!(obj instanceof w5.c)) {
                                if (!(obj instanceof ColorDrawable)) {
                                    super.p(byteArrayOutputStream, obj);
                                    return;
                                }
                                byteArrayOutputStream.write(-103);
                                int color = ((ColorDrawable) obj).getColor();
                                p(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
                                p(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
                                p(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
                                p(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
                                return;
                            }
                            byteArrayOutputStream.write(-106);
                            w5.c cVar2 = (w5.c) obj;
                            p(byteArrayOutputStream, cVar2.d());
                            p(byteArrayOutputStream, cVar2.a());
                            p(byteArrayOutputStream, cVar2.b());
                            objC = cVar2.c();
                        }
                        objC = Integer.valueOf(r52.ordinal());
                    }
                }
                p(byteArrayOutputStream, objC);
            }
            byteArrayOutputStream.write(-127);
            l lVar2 = (l) obj;
            p(byteArrayOutputStream, lVar2.f());
            p(byteArrayOutputStream, lVar2.d());
            p(byteArrayOutputStream, lVar2.i());
            p(byteArrayOutputStream, lVar2.h());
            objE = lVar2.e();
            lVar = lVar2;
        }
        p(byteArrayOutputStream, objE);
        p(byteArrayOutputStream, lVar.g());
        objC = lVar.c();
        p(byteArrayOutputStream, objC);
    }

    void r(Context context) {
        this.f23126d = context;
    }

    void s(j0 j0Var) {
        this.f23128f = j0Var;
    }

    protected void t(ByteArrayOutputStream byteArrayOutputStream, m mVar) {
        int i8;
        int i9;
        Integer numValueOf;
        if (mVar instanceof m.d) {
            m.d dVar = (m.d) mVar;
            byteArrayOutputStream.write(-110);
            p(byteArrayOutputStream, Integer.valueOf(dVar.f23249b));
            p(byteArrayOutputStream, dVar.f23253e);
            numValueOf = dVar.f23252d;
        } else {
            if (!(mVar instanceof m.b)) {
                if (mVar instanceof m.e) {
                    i9 = -113;
                } else if (mVar instanceof m.c) {
                    i9 = -126;
                } else {
                    byteArrayOutputStream.write(-128);
                    p(byteArrayOutputStream, Integer.valueOf(mVar.f23249b));
                    i8 = mVar.f23250c;
                }
                byteArrayOutputStream.write(i9);
                return;
            }
            byteArrayOutputStream.write(-114);
            m.b bVar = (m.b) mVar;
            p(byteArrayOutputStream, bVar.f23251d);
            i8 = bVar.f23249b;
            numValueOf = Integer.valueOf(i8);
        }
        p(byteArrayOutputStream, numValueOf);
    }
}
