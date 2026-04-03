# 🗺️ Diagramme - Workflow de l'APK BMCounter

## 📍 Où Trouver l'APK: Carte Complète

```
┌─────────────────────────────────────────────────────────────────────┐
│                         DÉPÔT GITHUB                                 │
│  (https://github.com/votre-utilisateur/BMCounter)                   │
│                                                                      │
│  ┌────────────────────────────────────────────────────────────┐    │
│  │  📁 Fichiers Versionnés (dans Git)                         │    │
│  │  ├── .github/workflows/build-apk.yml  ← Workflow Actions  │    │
│  │  ├── .gitignore                       ← Ignore build/     │    │
│  │  ├── src/                             ← Code source       │    │
│  │  ├── build.gradle                                          │    │
│  │  ├── README.md                                             │    │
│  │  └── APK_LOCATION_GUIDE.md                                 │    │
│  └────────────────────────────────────────────────────────────┘    │
│                                                                      │
│  ┌────────────────────────────────────────────────────────────┐    │
│  │  ❌ PAS dans Git (ignoré par .gitignore)                   │    │
│  │  └── build/                                                 │    │
│  │      └── outputs/                                           │    │
│  │          └── apk/                                           │    │
│  │              └── debug/                                     │    │
│  │                  └── BMCounter-debug.apk  ← VOUS CHERCHEZ  │    │
│  │                                               CECI !        │    │
│  └────────────────────────────────────────────────────────────┘    │
│                                                                      │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              │ git push
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                    GITHUB ACTIONS (CI/CD)                            │
│  (Onglet "Actions" dans GitHub)                                      │
│                                                                      │
│  1. ⚡ Déclenché automatiquement à chaque push                       │
│  2. 🏗️  Serveur Ubuntu construit l'APK                               │
│  3. 📦 APK sauvegardé comme "Artifact"                               │
│  4. ✅ Disponible pendant 30 jours                                   │
│                                                                      │
│  ┌────────────────────────────────────────────┐                     │
│  │  📥 Artifacts (TÉLÉCHARGEABLES)            │                     │
│  │  └── BMCounter-debug-apk.zip               │                     │
│  │      └── BMCounter-debug.apk  ← VOTRE APK! │                     │
│  └────────────────────────────────────────────┘                     │
│                                                                      │
└─────────────────────────────────────────────────────────────────────┘

```

---

## 🔄 Flux de Travail Complet

### Scénario 1: Obtenir l'APK via GitHub Actions

```
┌──────────────┐
│   VOUS       │
│ (Développeur)│
└──────┬───────┘
       │
       │ 1. Modifier le code
       │
       ▼
┌──────────────┐
│  Git Commit  │
└──────┬───────┘
       │
       │ 2. git push
       │
       ▼
┌─────────────────────┐
│  GitHub Repository  │
└──────┬──────────────┘
       │
       │ 3. Déclenche automatiquement
       │
       ▼
┌─────────────────────────┐
│  GitHub Actions         │
│  - Setup JDK 17         │
│  - Setup Android SDK    │
│  - Run: ./gradlew       │
│    assembleDebug        │
└──────┬──────────────────┘
       │
       │ 4. Génère l'APK
       │
       ▼
┌─────────────────────────┐
│  Artifact Storage       │
│  BMCounter-debug-apk    │
│  (Gardé 30 jours)       │
└──────┬──────────────────┘
       │
       │ 5. Vous téléchargez
       │
       ▼
┌──────────────┐
│  VOUS        │
│ (APK prêt!)  │
└──────────────┘
```

**Temps total: 5-10 minutes (automatique)**

---

### Scénario 2: Construire l'APK Localement

```
┌──────────────┐
│   VOUS       │
└──────┬───────┘
       │
       │ 1. git clone
       │
       ▼
┌─────────────────────┐
│  Dépôt Local        │
│  (votre ordinateur) │
└──────┬──────────────┘
       │
       │ 2. ./gradlew assembleDebug
       │
       ▼
┌─────────────────────────┐
│  Build Process          │
│  - Compile sources      │
│  - Package resources    │
│  - Generate APK         │
└──────┬──────────────────┘
       │
       │ 3. Crée le dossier build/
       │
       ▼
┌──────────────────────────────┐
│  build/outputs/apk/debug/    │
│  └── BMCounter-debug.apk     │
└──────┬───────────────────────┘
       │
       │ 4. APK disponible localement
       │
       ▼
┌──────────────┐
│  VOUS        │
│ (APK prêt!)  │
└──────────────┘
```

**Temps total: 5-15 minutes (selon votre machine)**

---

## 🎯 Guide Visuel: Comment Télécharger depuis GitHub Actions

```
1. Ouvrez votre navigateur
   │
   ▼
2. Allez sur: https://github.com/votre-utilisateur/BMCounter
   │
   ▼
3. Cliquez sur l'onglet "Actions"
   │
   ┌────────────────────────────────────┐
   │ Code  Issues  Pull requests  ►Actions│
   └────────────────────────────────────┘
   │
   ▼
4. Voir la liste des workflows
   │
   ┌────────────────────────────────────────────┐
   │ Workflows:                                  │
   │ ┌────────────────────────────────────────┐ │
   │ │ ✅ Build Android APK                   │ │
   │ │    main - Fix colors (#123)            │ │
   │ │    2 minutes ago                       │ │
   │ └────────────────────────────────────────┘ │
   └────────────────────────────────────────────┘
   │
   ▼
5. Cliquez sur le workflow ✅ (terminé avec succès)
   │
   ▼
6. Descendez à la section "Artifacts"
   │
   ┌────────────────────────────────────────────┐
   │ Artifacts                                   │
   │ ┌────────────────────────────────────────┐ │
   │ │ 📦 BMCounter-debug-apk                 │ │
   │ │    Expires in 29 days                  │ │
   │ │    [Download]  ← CLIQUEZ ICI!          │ │
   │ └────────────────────────────────────────┘ │
   └────────────────────────────────────────────┘
   │
   ▼
7. Décompressez le fichier .zip
   │
   ▼
8. Obtenez BMCounter-debug.apk ! 🎉
```

---

## 📊 Comparaison des Emplacements

| Emplacement | L'APK y est? | Comment y accéder? |
|-------------|--------------|-------------------|
| **GitHub (dépôt de code)** | ❌ Non | N/A (ignoré par .gitignore) |
| **GitHub Actions (Artifacts)** | ✅ Oui | Actions → Workflow → Download Artifact |
| **GitHub Releases** | ⚠️ Si publié | Releases → Version → Download APK |
| **Ordinateur local (après build)** | ✅ Oui | `build/outputs/apk/debug/` |
| **Android Studio (après build)** | ✅ Oui | Project view → app → build → outputs → apk |

---

## 🎓 Analogie Simple

Pensez au dépôt GitHub comme à une **recette de cuisine**:

```
┌─────────────────────────────────────────────┐
│  GitHub Dépôt = RECETTE                     │
│  ├── Ingrédients (code source)              │
│  ├── Instructions (build.gradle)            │
│  └── Méthode (workflow GitHub Actions)      │
│                                              │
│  ❌ Pas de gâteau fini dans la recette!     │
└─────────────────────────────────────────────┘
                    │
                    │ Cuisiner (Build)
                    ▼
┌─────────────────────────────────────────────┐
│  APK = GÂTEAU FINI                          │
│  build/outputs/apk/debug/BMCounter.apk      │
│                                              │
│  ✅ Créé en suivant la recette!             │
└─────────────────────────────────────────────┘
```

**La recette (code) est dans GitHub.**  
**Le gâteau fini (APK) est créé quand vous "cuisinez" (build).**

Vous ne mettez pas le gâteau fini dans le livre de recettes!  
De même, on ne met pas l'APK dans le dépôt Git.

---

## ✅ Checklist Finale

Avant de chercher l'APK, vérifiez:

- [ ] J'ai compris que l'APK n'est **PAS** dans le dépôt GitHub
- [ ] J'ai compris que `build/` est ignoré par `.gitignore`
- [ ] Je sais que je peux obtenir l'APK via **GitHub Actions**
- [ ] OU je sais que je peux le construire **localement**
- [ ] J'ai vérifié que `.github/workflows/build-apk.yml` existe
- [ ] J'ai poussé mon code vers GitHub (si j'utilise Actions)
- [ ] J'ai attendu que le workflow se termine (si j'utilise Actions)

---

## 🎯 TL;DR (Résumé Ultra-Court)

```
Q: Où est build/outputs/apk/debug/BMCounter-debug.apk dans GitHub?

A: NULLE PART ❌

   Pourquoi? → build/ est ignoré par Git
   
   Solution? → Onglet "Actions" dans GitHub (télécharger Artifact)
            OU
            → Build local: ./gradlew assembleDebug
```

---

**🎉 Vous savez maintenant exactement où et comment obtenir votre APK!**
