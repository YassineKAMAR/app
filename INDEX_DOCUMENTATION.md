# 📚 Index de la Documentation - BMCounter

## 🎯 Vous Cherchez l'APK?

### 👉 Commencez ici: [`GUIDE_RAPIDE_APK.md`](GUIDE_RAPIDE_APK.md)

**Guide visuel rapide en 1 page pour obtenir l'APK**

---

## 📖 Documentation Complète

### 🔍 Trouver et Obtenir l'APK

| Fichier | Description | Pour Qui? |
|---------|-------------|-----------|
| **[GUIDE_RAPIDE_APK.md](GUIDE_RAPIDE_APK.md)** | ⭐ **COMMENCEZ ICI** - Guide rapide visuel | Tout le monde |
| **[OU_TROUVER_APK.md](OU_TROUVER_APK.md)** | Explication complète et détaillée | Développeurs & utilisateurs |
| **[PUBLIER_RELEASE.md](PUBLIER_RELEASE.md)** | Comment publier l'APK sur GitHub | Mainteneurs du projet |

### 🔨 Compilation et Build

| Fichier | Description | Pour Qui? |
|---------|-------------|-----------|
| **[BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)** | Instructions complètes de compilation | Développeurs |
| [build.gradle](build.gradle) | Configuration Gradle du projet | Développeurs |
| [settings.gradle](settings.gradle) | Paramètres Gradle | Développeurs |

### 📋 Informations Projet

| Fichier | Description | Pour Qui? |
|---------|-------------|-----------|
| **[README.md](README.md)** | Vue d'ensemble du projet | Tout le monde |
| [MODIFICATIONS_SUMMARY.md](MODIFICATIONS_SUMMARY.md) | Résumé des modifications antérieures | Développeurs |
| [RESUME_MODIFICATIONS.md](RESUME_MODIFICATIONS.md) | Résumé des modifications APK/GitHub | Développeurs |

### ⚙️ Automatisation (GitHub Actions)

| Fichier | Description | Déclenchement |
|---------|-------------|---------------|
| [.github/workflows/build-apk.yml](.github/workflows/build-apk.yml) | Compile l'APK automatiquement | Chaque push/PR |
| [.github/workflows/release-apk.yml](.github/workflows/release-apk.yml) | Crée une release avec APK | Création d'un tag |

### 🚫 Configuration Git

| Fichier | Description |
|---------|-------------|
| [.gitignore](.gitignore) | Exclut les fichiers de build (APK, etc.) |
| [.gitattributes](.gitattributes) | Normalisation des fins de ligne |

---

## 🗺️ Plan de Navigation

### Scénario 1: "Je veux juste télécharger l'APK"
```
1. GUIDE_RAPIDE_APK.md
2. → GitHub Releases (lien fourni)
3. → Télécharger et installer
```

### Scénario 2: "Je veux compiler le projet moi-même"
```
1. BUILD_INSTRUCTIONS.md
2. → Installer prérequis (JDK 17, Android SDK)
3. → Compiler avec Gradle
4. → APK dans build/outputs/apk/debug/
```

### Scénario 3: "Je veux publier une nouvelle version"
```
1. PUBLIER_RELEASE.md
2. → Créer un tag Git (ex: v1.0.0)
3. → git push origin v1.0.0
4. → GitHub Actions compile et publie automatiquement
```

### Scénario 4: "Je ne comprends pas pourquoi l'APK n'est pas dans Git"
```
1. OU_TROUVER_APK.md
2. → Explication des bonnes pratiques
3. → Alternatives pour obtenir l'APK
```

---

## 📊 Structure du Projet

```
BMCounter/
│
├── 📱 APPLICATION ANDROID
│   ├── src/                          # Code source Java/Kotlin
│   ├── build.gradle                  # Configuration de build
│   ├── settings.gradle               # Paramètres projet
│   └── gradle.properties             # Propriétés Gradle
│
├── 📚 DOCUMENTATION UTILISATEUR
│   ├── README.md                     # ⭐ Vue d'ensemble
│   ├── GUIDE_RAPIDE_APK.md          # ⭐ Guide rapide APK
│   └── INDEX_DOCUMENTATION.md        # ⭐ Ce fichier
│
├── 🔧 DOCUMENTATION DÉVELOPPEUR
│   ├── BUILD_INSTRUCTIONS.md         # Instructions de compilation
│   ├── OU_TROUVER_APK.md            # Où trouver l'APK (détaillé)
│   ├── PUBLIER_RELEASE.md           # Guide de publication
│   ├── MODIFICATIONS_SUMMARY.md      # Historique des modifications
│   └── RESUME_MODIFICATIONS.md       # Résumé modifications récentes
│
├── ⚙️ AUTOMATISATION CI/CD
│   └── .github/workflows/
│       ├── build-apk.yml            # Build automatique
│       └── release-apk.yml          # Release automatique
│
└── 🚫 CONFIGURATION GIT
    ├── .gitignore                    # Exclusions Git
    └── .gitattributes                # Attributs Git
```

---

## 🎓 Concepts Importants

### Pourquoi l'APK n'est PAS dans Git?

1. **Fichiers binaires volumineux** → Alourdissent le dépôt
2. **Fichiers générés** → Peuvent être recompilés à tout moment
3. **Bonnes pratiques** → Seul le code source est versionné
4. **GitHub Releases** → Endroit approprié pour distribuer les binaires

### Où Trouver l'APK?

| Emplacement | Disponibilité | Usage |
|-------------|---------------|-------|
| ❌ Dépôt Git | NON | Code source seulement |
| ✅ GitHub Releases | Oui (après publication) | Distribution officielle |
| ✅ GitHub Actions | Oui (30 jours) | Builds automatiques |
| ✅ Compilation locale | Toujours | Développement |

---

## 🚀 Démarrage Rapide

### Pour les Utilisateurs Finaux
1. Lisez: [GUIDE_RAPIDE_APK.md](GUIDE_RAPIDE_APK.md)
2. Allez sur: GitHub Releases
3. Téléchargez l'APK
4. Installez sur Android

### Pour les Développeurs
1. Clonez le dépôt
2. Lisez: [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)
3. Installez les prérequis
4. Compilez avec `./gradlew assembleDebug`

### Pour les Mainteneurs
1. Lisez: [PUBLIER_RELEASE.md](PUBLIER_RELEASE.md)
2. Créez un tag: `git tag v1.0.0`
3. Poussez: `git push origin v1.0.0`
4. GitHub Actions publie automatiquement

---

## 📞 Support

- **Questions générales**: Lisez le [README.md](README.md)
- **Problèmes de build**: Voir [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)
- **Trouver l'APK**: Voir [GUIDE_RAPIDE_APK.md](GUIDE_RAPIDE_APK.md)
- **Contact**: Administration CHU Mohammed VI

---

## ✅ Checklist de Vérification

Avant de publier une version:
- [ ] Code compilé sans erreurs
- [ ] Tests passés
- [ ] Version mise à jour dans `build.gradle`
- [ ] Tag Git créé (ex: v1.0.0)
- [ ] GitHub Actions a compilé avec succès
- [ ] Release créée sur GitHub
- [ ] APK attaché à la release
- [ ] Notes de version rédigées
- [ ] APK testé sur un appareil réel

---

**Date de création**: 2026-04-03
**Dernière mise à jour**: 2026-04-03
**Version de la documentation**: 1.0
