# 🔗 Lien pour Télécharger l'APK BMCounter

## 📱 Liens Directs de Téléchargement

### Option 1: GitHub Releases (RECOMMANDÉ) ⭐
**Lien direct vers les releases:**
```
https://github.com/YassineKAMAR/app/releases
```

**Lien de téléchargement direct de la dernière version:**
```
https://github.com/YassineKAMAR/app/releases/latest/download/app-debug.apk
```

> ⚠️ **Note**: Pour que ce lien fonctionne, une release doit d'abord être créée. Voir la section "Créer une Release" ci-dessous.

---

### Option 2: GitHub Actions Artifacts
**Lien vers les workflows:**
```
https://github.com/YassineKAMAR/app/actions
```

**Comment télécharger:**
1. Allez sur: https://github.com/YassineKAMAR/app/actions
2. Cliquez sur le workflow "Build Android APK" le plus récent (avec coche verte ✅)
3. Scrollez vers le bas jusqu'à la section "Artifacts"
4. Téléchargez "BMCounter-debug.zip"
5. Décompressez le fichier ZIP pour obtenir l'APK

> ⚠️ **Durée de vie**: Les artifacts sont conservés pendant 30 jours

---

## 🚀 Créer une Release (pour publier l'APK)

Si aucune release n'existe encore, voici comment en créer une:

### Méthode Automatique (Recommandée)

```bash
# 1. Créez un tag de version
git tag -a v1.0.0 -m "Version 1.0.0 - BMCounter"

# 2. Poussez le tag vers GitHub
git push origin v1.0.0

# 3. GitHub Actions va automatiquement:
#    ✅ Compiler l'APK
#    ✅ Créer la release
#    ✅ Attacher l'APK à la release
```

Après quelques minutes, l'APK sera disponible sur:
```
https://github.com/YassineKAMAR/app/releases/download/v1.0.0/app-debug.apk
```

---

## 💻 Déploiement Local

### Option A: Cloner et Compiler sur Votre Machine

#### Prérequis
- Git installé
- JDK 17 (Java Development Kit)
- Android SDK (API 34)
- Gradle 7.5+

#### Instructions

```bash
# 1. Cloner le projet
git clone https://github.com/YassineKAMAR/app.git
cd app

# 2. Créer le wrapper Gradle (si nécessaire)
gradle wrapper --gradle-version=7.5
chmod +x gradlew

# 3. Compiler l'APK
./gradlew assembleDebug

# 4. L'APK sera situé à:
# build/outputs/apk/debug/app-debug.apk
```

#### Localisation de l'APK après compilation:
```
app/
└── build/
    └── outputs/
        └── apk/
            └── debug/
                └── app-debug.apk  👈 FICHIER APK ICI
```

---

### Option B: Télécharger et Installer Directement

#### Sur Windows

1. **Téléchargez l'APK** depuis GitHub Releases:
   ```
   https://github.com/YassineKAMAR/app/releases/latest
   ```

2. **Transférez l'APK vers votre appareil Android:**
   - Via USB: Connectez votre téléphone et copiez le fichier
   - Via email: Envoyez-vous l'APK par email
   - Via cloud: Uploadez sur Google Drive/Dropbox

3. **Installez l'APK sur Android:**
   - Activez "Sources inconnues" dans Paramètres → Sécurité
   - Ouvrez le fichier APK
   - Appuyez sur "Installer"

#### Sur Mac/Linux

```bash
# Télécharger l'APK via la ligne de commande
curl -L -o BMCounter.apk https://github.com/YassineKAMAR/app/releases/latest/download/app-debug.apk

# Transférer via ADB (si appareil connecté)
adb install BMCounter.apk
```

---

## 📋 Installation sur Android (Méthode Détaillée)

### 1. Activer l'Installation depuis des Sources Inconnues

**Sur Android 8.0 et supérieur:**
- Paramètres → Sécurité → Installer des apps inconnues
- Sélectionnez votre navigateur/gestionnaire de fichiers
- Activez "Autoriser cette source"

**Sur Android 7.0 et inférieur:**
- Paramètres → Sécurité
- Activez "Sources inconnues"

### 2. Installer l'APK

1. Téléchargez le fichier `.apk`
2. Ouvrez le fichier depuis:
   - Notifications de téléchargement
   - Application "Fichiers" ou "Mes fichiers"
   - Dossier "Téléchargements"
3. Appuyez sur "Installer"
4. Attendez la fin de l'installation
5. Appuyez sur "Ouvrir" pour lancer l'app

### 3. Vérifier l'Installation

- Allez dans: Paramètres → Applications → BMCounter
- Vous verrez:
  - **Package**: hokudai.kazusasa.BMCounter
  - **Version**: 2.0.0

---

## 🔧 Déploiement pour Développement

### Déploiement en Mode Debug

```bash
# 1. Connectez votre appareil Android en USB
# 2. Activez le "Débogage USB" sur l'appareil
# 3. Compilez et installez directement:

cd /chemin/vers/app
./gradlew installDebug

# L'APK sera compilé et installé automatiquement
```

### Déploiement avec ADB

```bash
# Compiler l'APK
./gradlew assembleDebug

# Installer via ADB
adb install -r build/outputs/apk/debug/app-debug.apk

# -r permet de réinstaller en écrasant la version existante
```

### Logs en Temps Réel

```bash
# Voir les logs de l'application
adb logcat | grep BMCounter
```

---

## 📊 Tableau Récapitulatif des Options

| Méthode | Complexité | Temps | Prérequis | Idéal pour |
|---------|------------|-------|-----------|------------|
| **GitHub Releases** | ⭐ Facile | 2 min | Navigateur | Utilisateurs finaux |
| **GitHub Actions** | ⭐⭐ Moyen | 3 min | Compte GitHub | Testeurs |
| **Compiler Localement** | ⭐⭐⭐ Avancé | 15-30 min | JDK, Android SDK | Développeurs |
| **ADB Install** | ⭐⭐ Moyen | 5 min | ADB, USB | Développement |

---

## ❓ Questions Fréquentes

### Q: Où est le lien de téléchargement direct?
**R**: Une fois qu'une release est créée, le lien sera:
```
https://github.com/YassineKAMAR/app/releases/latest/download/app-debug.apk
```

### Q: Comment créer la première release?
**R**: Exécutez ces commandes:
```bash
git tag -a v1.0.0 -m "Version 1.0.0"
git push origin v1.0.0
```
GitHub Actions créera automatiquement la release avec l'APK.

### Q: L'APK est-il sûr?
**R**: Oui, si téléchargé depuis:
- ✅ https://github.com/YassineKAMAR/app/releases
- ✅ https://github.com/YassineKAMAR/app/actions (artifacts)
- ✅ Compilé localement depuis le code source

### Q: Pourquoi "Sources inconnues"?
**R**: L'app n'est pas publiée sur Google Play Store. Android exige cette autorisation pour installer des APK depuis d'autres sources.

### Q: Comment mettre à jour l'app?
**R**: Téléchargez et installez la nouvelle version de l'APK. Android remplacera automatiquement l'ancienne version.

### Q: Puis-je installer sur plusieurs appareils?
**R**: Oui! Téléchargez l'APK et installez-le sur autant d'appareils Android que nécessaire.

---

## 🎯 Liens Rapides

| Ressource | Lien |
|-----------|------|
| **Dépôt GitHub** | https://github.com/YassineKAMAR/app |
| **Releases** | https://github.com/YassineKAMAR/app/releases |
| **Actions/Workflows** | https://github.com/YassineKAMAR/app/actions |
| **Code Source** | https://github.com/YassineKAMAR/app/tree/main |

---

## 📞 Support

Pour toute question ou problème:
1. Consultez la documentation dans le dépôt
2. Vérifiez les logs GitHub Actions
3. Contactez l'administration du CHU Mohammed VI

---

**Dernière mise à jour**: 2026-04-03  
**Version du document**: 1.0
