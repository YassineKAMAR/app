package b5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n {

    class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f3353b;

        a(o oVar, i iVar) {
            this.f3353b = oVar;
            this.f3352a = iVar;
        }

        @Override // b5.j
        public int a() {
            return this.f3352a.f3330c;
        }

        @Override // b5.j
        public boolean b() {
            return this.f3352a.F();
        }
    }

    public static void a(o oVar, i iVar, Runnable runnable) {
        oVar.c(new k(iVar == null ? null : new a(oVar, iVar), runnable));
    }

    public static o b(String str, int i8, int i9) {
        return i8 == 1 ? new s(str, i9) : new q(str, i8, i9);
    }
}
