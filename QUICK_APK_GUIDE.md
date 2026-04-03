# 🎯 Guide Rapide - Où Trouver l'APK BMCounter

## ❓ Question: Où est `build/outputs/apk/debug/BMCounter-debug.apk` dans GitHub?

## ✅ Réponse Courte

**L'APK n'est PAS dans GitHub!** Le dossier `build/` est ignoré par Git.

---

## 🚀 Solutions Rapides

### 1️⃣ Méthode Recommandée: GitHub Actions

```
GitHub → Onglet "Actions" → Workflow "Build Android APK" → Télécharger l'artefact
```

### 2️⃣ Construire Localement

```bash
git clone <votre-repo>
cd BMCounter
./gradlew assembleDebug
# APK créé dans: build/outputs/apk/debug/BMCounter-debug.apk
```

### 3️⃣ Via Releases (si configuré)

```
GitHub → Onglet "Releases" → Télécharger l'APK
```

---

## 📂 Structure du Dépôt GitHub

### ✅ Ce qui EST dans GitHub:
```
BMCounter/
├── .github/workflows/build-apk.yml  ← Configuration pour construire l'APK
├── .gitignore                       ← Ignore le dossier build/
├── src/                             ← Code source
├── build.gradle                     ← Configuration Gradle
├── README.md
└── uploads/
```

### ❌ Ce qui N'EST PAS dans GitHub:
```
build/                               ← IGNORÉ PAR GIT
└── outputs/
    └── apk/
        └── debug/
            └── BMCounter-debug.apk  ← Généré localement ou par Actions
```

---

## 🔄 Workflow Automatique GitHub Actions

Le fichier `.github/workflows/build-apk.yml` configure GitHub pour:

1. **Déclencher** automatiquement à chaque push sur `main`/`master`
2. **Construire** l'APK sur les serveurs GitHub
3. **Stocker** l'APK comme artefact téléchargeable (30 jours)

### Comment utiliser:

```
1. Pushez votre code vers GitHub
2. Allez dans l'onglet "Actions" 
3. Attendez que le workflow se termine (✅)
4. Cliquez sur le workflow terminé
5. Téléchargez "BMCounter-debug-apk" dans la section Artifacts
```

---

## 📊 Comparaison des Méthodes

| Méthode | Difficulté | Prérequis | Temps |
|---------|-----------|-----------|-------|
| **GitHub Actions** | ⭐ Facile | Aucun | 5-10 min (automatique) |
| **Build Local** | ⭐⭐ Moyen | Android SDK, JDK 17 | 5-15 min |
| **Releases** | ⭐ Facile | Version publiée | Instantané |

---

## 💡 Résumé en 1 Phrase

> Le fichier APK n'existe pas dans le dépôt GitHub car `build/` est ignoré par Git - vous devez soit le construire localement avec `./gradlew assembleDebug`, soit le télécharger depuis l'onglet **Actions** de GitHub après qu'il soit automatiquement construit.

---

## 📚 Documentation Complète

- **Guide détaillé:** [APK_LOCATION_GUIDE.md](APK_LOCATION_GUIDE.md)
- **Instructions de build:** [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)
- **README principal:** [README.md](README.md)

---

## 🆘 Besoin d'Aide?

**Problème:** Je ne vois pas l'onglet "Actions" dans GitHub
**Solution:** Les GitHub Actions doivent être activées dans les paramètres du dépôt

**Problème:** Le workflow échoue
**Solution:** Vérifiez que `build.gradle` et `settings.gradle` sont corrects

**Problème:** `./gradlew` ne fonctionne pas
**Solution:** Exécutez d'abord `gradle wrapper --gradle-version=7.5`
