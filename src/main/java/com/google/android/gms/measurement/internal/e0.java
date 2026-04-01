package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.ae;
import com.google.android.gms.internal.measurement.bd;
import com.google.android.gms.internal.measurement.dg;
import com.google.android.gms.internal.measurement.ef;
import com.google.android.gms.internal.measurement.eg;
import com.google.android.gms.internal.measurement.ge;
import com.google.android.gms.internal.measurement.gf;
import com.google.android.gms.internal.measurement.hd;
import com.google.android.gms.internal.measurement.he;
import com.google.android.gms.internal.measurement.id;
import com.google.android.gms.internal.measurement.kg;
import com.google.android.gms.internal.measurement.lf;
import com.google.android.gms.internal.measurement.lg;
import com.google.android.gms.internal.measurement.me;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.nd;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.qg;
import com.google.android.gms.internal.measurement.rf;
import com.google.android.gms.internal.measurement.rg;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.sf;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.te;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.xf;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.gms.internal.measurement.yf;
import com.google.android.gms.internal.measurement.zd;
import com.google.android.gms.internal.measurement.ze;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final h4<Boolean> A0;
    public static final h4<Boolean> B0;
    public static final h4<Boolean> C0;
    public static final h4<Boolean> D0;
    public static final h4<Boolean> E0;
    public static final h4<Boolean> F0;
    public static final h4<Boolean> G0;
    public static final h4<Integer> H;
    public static final h4<Boolean> H0;
    public static final h4<Integer> I;
    public static final h4<Boolean> I0;
    public static final h4<Integer> J;
    public static final h4<Boolean> J0;
    public static final h4<Integer> K;
    public static final h4<Boolean> K0;
    public static final h4<Long> L;
    public static final h4<Boolean> L0;
    public static final h4<Boolean> M;
    public static final h4<Boolean> M0;
    public static final h4<String> N;
    public static final h4<Boolean> N0;
    public static final h4<Long> O;
    public static final h4<Boolean> O0;
    public static final h4<Integer> P;
    private static final h4<Boolean> P0;
    public static final h4<Double> Q;
    public static final h4<Boolean> Q0;
    public static final h4<Integer> R;
    public static final h4<Boolean> R0;
    public static final h4<Integer> S;
    public static final h4<Boolean> S0;
    private static final h4<Integer> T;
    public static final h4<Boolean> T0;
    public static final h4<Integer> U;
    public static final h4<Boolean> U0;
    public static final h4<Long> V;
    public static final h4<Boolean> V0;
    public static final h4<Long> W;
    public static final h4<Boolean> W0;
    public static final h4<Integer> X;
    public static final h4<Boolean> X0;
    public static final h4<String> Y;
    public static final h4<Boolean> Y0;
    public static final h4<String> Z;
    public static final h4<Boolean> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h4<String> f19922a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final h4<Boolean> f19923a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h4<String> f19925b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static h4<Boolean> f19926b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h4<String> f19928c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h4<String> f19930d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h4<String> f19932e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h4<Boolean> f19934f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h4<Boolean> f19936g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h4<Boolean> f19938h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h4<Boolean> f19940i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h4<Boolean> f19942j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h4<Boolean> f19944k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h4<Boolean> f19946l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h4<Boolean> f19948m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h4<Boolean> f19950n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h4<Boolean> f19952o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h4<Boolean> f19954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h4<Boolean> f19956q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h4<Integer> f19958r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final h4<Boolean> f19960s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final h4<Boolean> f19962t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h4<Boolean> f19964u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h4<Boolean> f19966v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h4<Boolean> f19968w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h4<Boolean> f19970x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h4<Boolean> f19972y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final h4<Boolean> f19974z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<h4<?>> f19921a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<h4<?>> f19924b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h4<Long> f19927c = a("measurement.ad_id_cache_time", 10000L, 10000L, new g4() { // from class: com.google.android.gms.measurement.internal.g0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.a());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h4<Long> f19929d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new g4() { // from class: com.google.android.gms.measurement.internal.k0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.w());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h4<Long> f19931e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new g4() { // from class: com.google.android.gms.measurement.internal.x0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.J());
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h4<Long> f19933f = a("measurement.config.cache_time", 86400000L, 3600000L, new g4() { // from class: com.google.android.gms.measurement.internal.j1
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.y());
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h4<String> f19935g = a("measurement.config.url_scheme", "https", "https", new g4() { // from class: com.google.android.gms.measurement.internal.v1
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return id.n();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h4<String> f19937h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new g4() { // from class: com.google.android.gms.measurement.internal.i2
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return id.m();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h4<Integer> f19939i = a("measurement.upload.max_bundles", 100, 100, new g4() { // from class: com.google.android.gms.measurement.internal.u2
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.U());
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h4<Integer> f19941j = a("measurement.upload.max_batch_size", 65536, 65536, new g4() { // from class: com.google.android.gms.measurement.internal.h3
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.i());
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h4<Integer> f19943k = a("measurement.upload.max_bundle_size", 65536, 65536, new g4() { // from class: com.google.android.gms.measurement.internal.t3
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.T());
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h4<Integer> f19945l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new g4() { // from class: com.google.android.gms.measurement.internal.i0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.d());
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h4<Integer> f19947m = a("measurement.upload.max_events_per_day", 100000, 100000, new g4() { // from class: com.google.android.gms.measurement.internal.s0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.e());
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h4<Integer> f19949n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new g4() { // from class: com.google.android.gms.measurement.internal.c1
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.c());
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h4<Integer> f19951o = a("measurement.upload.max_public_events_per_day", 50000, 50000, new g4() { // from class: com.google.android.gms.measurement.internal.p1
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.f());
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h4<Integer> f19953p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new g4() { // from class: com.google.android.gms.measurement.internal.z1
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.b());
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h4<Integer> f19955q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new g4() { // from class: com.google.android.gms.measurement.internal.m2
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.h());
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h4<Integer> f19957r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new g4() { // from class: com.google.android.gms.measurement.internal.v2
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.C());
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h4<String> f19959s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new g4() { // from class: com.google.android.gms.measurement.internal.j3
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return id.u();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h4<Long> f19961t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new g4() { // from class: com.google.android.gms.measurement.internal.s3
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.Q());
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h4<Long> f19963u = a("measurement.upload.window_interval", 3600000L, 3600000L, new g4() { // from class: com.google.android.gms.measurement.internal.f0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.l());
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h4<Long> f19965v = a("measurement.upload.interval", 3600000L, 3600000L, new g4() { // from class: com.google.android.gms.measurement.internal.h0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.S());
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h4<Long> f19967w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new g4() { // from class: com.google.android.gms.measurement.internal.j0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.K());
        }
    });

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h4<Long> f19969x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new g4() { // from class: com.google.android.gms.measurement.internal.m0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.z());
        }
    });

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h4<Long> f19971y = a("measurement.upload.minimum_delay", 500L, 500L, new g4() { // from class: com.google.android.gms.measurement.internal.l0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.I());
        }
    });

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h4<Long> f19973z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new g4() { // from class: com.google.android.gms.measurement.internal.o0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.H());
        }
    });
    public static final h4<Long> A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new g4() { // from class: com.google.android.gms.measurement.internal.n0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.N());
        }
    });
    public static final h4<Long> B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new g4() { // from class: com.google.android.gms.measurement.internal.q0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.L());
        }
    });
    public static final h4<Long> C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new g4() { // from class: com.google.android.gms.measurement.internal.p0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.R());
        }
    });
    public static final h4<Long> D = a("measurement.upload.retry_time", 1800000L, 1800000L, new g4() { // from class: com.google.android.gms.measurement.internal.r0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.k());
        }
    });
    public static final h4<Integer> E = a("measurement.upload.retry_count", 6, 6, new g4() { // from class: com.google.android.gms.measurement.internal.u0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.j());
        }
    });
    public static final h4<Long> F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new g4() { // from class: com.google.android.gms.measurement.internal.t0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Long.valueOf(id.g());
        }
    });
    public static final h4<Integer> G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new g4() { // from class: com.google.android.gms.measurement.internal.v0
        @Override // com.google.android.gms.measurement.internal.g4
        public final Object j() {
            return Integer.valueOf((int) id.A());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(RCHTTPStatusCodes.SUCCESS);
        H = a("measurement.audience.filter_result_max_count", numValueOf, numValueOf, new g4() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.E());
            }
        });
        I = a("measurement.upload.max_public_user_properties", 25, 25, null);
        J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        K = a("measurement.upload.max_public_event_params", 25, 25, null);
        L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new g4() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Long.valueOf(id.M());
            }
        });
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(gf.e());
            }
        });
        N = a("measurement.test.string_flag", "---", "---", new g4() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return gf.d();
            }
        });
        O = a("measurement.test.long_flag", -1L, -1L, new g4() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Long.valueOf(gf.c());
            }
        });
        P = a("measurement.test.int_flag", -2, -2, new g4() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) gf.b());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", dValueOf, dValueOf, new g4() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Double.valueOf(gf.a());
            }
        });
        R = a("measurement.experiment.max_ids", 50, 50, new g4() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.D());
            }
        });
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new g4() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.F());
            }
        });
        T = a("measurement.upload.max_event_parameter_value_length", 100, 100, new g4() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.B());
            }
        });
        U = a("measurement.max_bundles_per_iteration", 100, 100, new g4() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.x());
            }
        });
        V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new g4() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Long.valueOf(id.O());
            }
        });
        W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new g4() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Long.valueOf(id.P());
            }
        });
        X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, new g4() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) id.G());
            }
        });
        Y = a("measurement.rb.attribution.uri_scheme", "https", "https", new g4() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.t();
            }
        });
        Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", new g4() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.q();
            }
        });
        f19922a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", new g4() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.r();
            }
        });
        f19925b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", new g4() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.p();
            }
        });
        f19928c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", new g4() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.v();
            }
        });
        f19930d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", new g4() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.o();
            }
        });
        f19932e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", new g4() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return id.s();
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f19934f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(lf.a());
            }
        });
        f19936g0 = a("measurement.quality.checksum", bool, bool, null);
        f19938h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.a2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ge.c());
            }
        });
        f19940i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.c2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ge.b());
            }
        });
        f19942j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ge.d());
            }
        });
        f19944k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(qg.a());
            }
        });
        f19946l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ze.a());
            }
        });
        f19948m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ef.a());
            }
        });
        f19950n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(lg.b());
            }
        });
        f19952o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.h2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(rg.a());
            }
        });
        f19954p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(zd.b());
            }
        });
        f19956q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(me.b());
            }
        });
        f19958r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new g4() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Integer.valueOf((int) nd.a());
            }
        });
        f19960s0 = a("measurement.client.click_identifier_control.dev", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.o2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(bd.a());
            }
        });
        f19962t0 = a("measurement.service.click_identifier_control", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.n2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(hd.a());
            }
        });
        f19964u0 = a("measurement.service.store_null_safelist", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.q2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ud.b());
            }
        });
        f19966v0 = a("measurement.service.store_safelist", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.p2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ud.c());
            }
        });
        f19968w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.s2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(yf.c());
            }
        });
        f19970x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.r2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(yf.b());
            }
        });
        f19972y0 = a("measurement.session_stitching_token_enabled", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.t2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(yf.d());
            }
        });
        f19974z0 = a("measurement.sgtm.client.dev", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.w2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(kg.b());
            }
        });
        A0 = a("measurement.sgtm.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.z2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(kg.c());
            }
        });
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.x2
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(rf.a());
            }
        });
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(rf.b());
            }
        });
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(xf.b());
            }
        });
        E0 = a("measurement.sfmc.client", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.d3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(eg.b());
            }
        });
        F0 = a("measurement.sfmc.service", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(eg.c());
            }
        });
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.f3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(se.b());
            }
        });
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.e3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(he.b());
            }
        });
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.g3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ye.b());
            }
        });
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.i3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ye.c());
            }
        });
        K0 = a("measurement.remove_app_background.client", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.l3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(sf.b());
            }
        });
        L0 = a("measurement.rb.attribution.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.k3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(mf.d());
            }
        });
        M0 = a("measurement.rb.attribution.client2", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.n3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(mf.b());
            }
        });
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.m3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(mf.f());
            }
        });
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.p3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(mf.e());
            }
        });
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.o3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(mf.c());
            }
        });
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.r3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(dg.a());
            }
        });
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new g4() { // from class: com.google.android.gms.measurement.internal.q3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ae.b());
            }
        });
        S0 = a("measurement.dma_consent.client", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.v3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.b());
            }
        });
        T0 = a("measurement.dma_consent.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.d());
            }
        });
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.c());
            }
        });
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.e());
            }
        });
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.a4
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.f());
            }
        });
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(td.g());
            }
        });
        Y0 = a("measurement.service.deferred_first_open", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.c4
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(od.b());
            }
        });
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.b4
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ne.b());
            }
        });
        f19923a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.e4
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(ne.c());
            }
        });
        f19926b1 = a("measurement.increase_param_lengths", bool, bool, new g4() { // from class: com.google.android.gms.measurement.internal.d4
            @Override // com.google.android.gms.measurement.internal.g4
            public final Object j() {
                return Boolean.valueOf(te.b());
            }
        });
    }

    private static <V> h4<V> a(String str, V v7, V v8, g4<V> g4Var) {
        h4<V> h4Var = new h4<>(str, v7, v8, g4Var);
        f19921a.add(h4Var);
        return h4Var;
    }

    public static Map<String, String> c(Context context) {
        com.google.android.gms.internal.measurement.y5 y5VarB = com.google.android.gms.internal.measurement.y5.b(context.getContentResolver(), com.google.android.gms.internal.measurement.l6.a("com.google.android.gms.measurement"), new Runnable() { // from class: p3.f
            @Override // java.lang.Runnable
            public final void run() {
                o6.m();
            }
        });
        return y5VarB == null ? Collections.emptyMap() : y5VarB.c();
    }
}
