package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import java.util.Map;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v3 {

    class a implements n.w<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f23627b;

        a(ArrayList arrayList, a.e eVar) {
            this.f23626a = arrayList;
            this.f23627b = eVar;
        }

        @Override // io.flutter.plugins.webviewflutter.n.w
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f23626a.add(0, str);
            this.f23627b.a(this.f23626a);
        }
    }

    public static /* synthetic */ void A(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.g(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static void B(s5.c cVar, final n.j0 j0Var) {
        s5.a aVar = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", a());
        if (j0Var != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.v2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.b(j0Var, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        s5.a aVar2 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", a());
        if (j0Var != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.x2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.c(j0Var, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        s5.a aVar3 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", a());
        if (j0Var != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.e3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.n(j0Var, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        s5.a aVar4 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", a());
        if (j0Var != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.f3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.u(j0Var, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        s5.a aVar5 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", a());
        if (j0Var != null) {
            aVar5.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.h3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.v(j0Var, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        s5.a aVar6 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", a());
        if (j0Var != null) {
            aVar6.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.i3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.w(j0Var, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        s5.a aVar7 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", a());
        if (j0Var != null) {
            aVar7.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.j3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.x(j0Var, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        s5.a aVar8 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", a());
        if (j0Var != null) {
            aVar8.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.k3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.y(j0Var, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
        s5.a aVar9 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", a());
        if (j0Var != null) {
            aVar9.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.z(j0Var, obj, eVar);
                }
            });
        } else {
            aVar9.e(null);
        }
        s5.a aVar10 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", a());
        if (j0Var != null) {
            aVar10.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.A(j0Var, obj, eVar);
                }
            });
        } else {
            aVar10.e(null);
        }
        s5.a aVar11 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", a());
        if (j0Var != null) {
            aVar11.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.g3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.d(j0Var, obj, eVar);
                }
            });
        } else {
            aVar11.e(null);
        }
        s5.a aVar12 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", a());
        if (j0Var != null) {
            aVar12.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.n3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.e(j0Var, obj, eVar);
                }
            });
        } else {
            aVar12.e(null);
        }
        s5.a aVar13 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", a());
        if (j0Var != null) {
            aVar13.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.o3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.f(j0Var, obj, eVar);
                }
            });
        } else {
            aVar13.e(null);
        }
        s5.a aVar14 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", a());
        if (j0Var != null) {
            aVar14.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.p3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.g(j0Var, obj, eVar);
                }
            });
        } else {
            aVar14.e(null);
        }
        s5.a aVar15 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", a());
        if (j0Var != null) {
            aVar15.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.q3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.h(j0Var, obj, eVar);
                }
            });
        } else {
            aVar15.e(null);
        }
        s5.a aVar16 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", a());
        if (j0Var != null) {
            aVar16.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.r3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.i(j0Var, obj, eVar);
                }
            });
        } else {
            aVar16.e(null);
        }
        s5.a aVar17 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", a());
        if (j0Var != null) {
            aVar17.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.j(j0Var, obj, eVar);
                }
            });
        } else {
            aVar17.e(null);
        }
        s5.a aVar18 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", a());
        if (j0Var != null) {
            aVar18.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.t3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.k(j0Var, obj, eVar);
                }
            });
        } else {
            aVar18.e(null);
        }
        s5.a aVar19 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", a());
        if (j0Var != null) {
            aVar19.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.u3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.l(j0Var, obj, eVar);
                }
            });
        } else {
            aVar19.e(null);
        }
        s5.a aVar20 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", a());
        if (j0Var != null) {
            aVar20.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.w2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.m(j0Var, obj, eVar);
                }
            });
        } else {
            aVar20.e(null);
        }
        s5.a aVar21 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", a());
        if (j0Var != null) {
            aVar21.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.y2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.o(j0Var, obj, eVar);
                }
            });
        } else {
            aVar21.e(null);
        }
        s5.a aVar22 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", a());
        if (j0Var != null) {
            aVar22.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.z2
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.p(j0Var, obj, eVar);
                }
            });
        } else {
            aVar22.e(null);
        }
        s5.a aVar23 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", a());
        if (j0Var != null) {
            aVar23.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.a3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.q(j0Var, obj, eVar);
                }
            });
        } else {
            aVar23.e(null);
        }
        s5.a aVar24 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", a());
        if (j0Var != null) {
            aVar24.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.b3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.r(j0Var, obj, eVar);
                }
            });
        } else {
            aVar24.e(null);
        }
        s5.a aVar25 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", a());
        if (j0Var != null) {
            aVar25.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.c3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.s(j0Var, obj, eVar);
                }
            });
        } else {
            aVar25.e(null);
        }
        s5.a aVar26 = new s5.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", a());
        if (j0Var != null) {
            aVar26.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.d3
                @Override // s5.a.d
                public final void a(Object obj, a.e eVar) {
                    v3.t(j0Var, obj, eVar);
                }
            });
        } else {
            aVar26.e(null);
        }
    }

    public static s5.i<Object> a() {
        return n.k0.f23541d;
    }

    public static /* synthetic */ void b(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.a(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        String str3 = (String) arrayList2.get(3);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.c(lValueOf, str, str2, str3);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.p(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Boolean bool = (Boolean) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.i(lValueOf, bool);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(n.j0 j0Var, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        j0Var.j(number == null ? null : Long.valueOf(number.longValue()), (String) arrayList2.get(1), new a(arrayList, eVar));
    }

    public static /* synthetic */ void g(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.o(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Number number3 = (Number) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.k(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Number number3 = (Number) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.y(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void j(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.b(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.m(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void l(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.n(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void m(n.j0 j0Var, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            j0Var.e((Boolean) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void n(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        String str3 = (String) arrayList2.get(3);
        String str4 = (String) arrayList2.get(4);
        String str5 = (String) arrayList2.get(5);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.r(lValueOf, str, str2, str3, str4, str5);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void o(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.z(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void p(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.d(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void q(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.l(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void r(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.u(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void s(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.f(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void t(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.t(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void u(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        Map<String, String> map = (Map) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.h(lValueOf, str, map);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void v(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        byte[] bArr = (byte[]) arrayList2.get(2);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.x(lValueOf, str, bArr);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void w(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.w(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void x(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.v(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void y(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        arrayList.add(0, j0Var.q(lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void z(n.j0 j0Var, Object obj, a.e eVar) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        j0Var.s(lValueOf);
        arrayList.add(0, null);
        eVar.a(arrayList);
    }
}
