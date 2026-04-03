# Comment trouver l'APK BMCounter sur GitHub

## ⚠️ Important: L'APK n'est PAS dans le code source

Le fichier `build/outputs/apk/debug/BMCounter-debug.apk` **n'existe pas directement dans le dépôt GitHub** car:
- Le répertoire `build/` contient des fichiers générés automatiquement
- Ces fichiers ne sont pas versionnés dans Git (ignorés via `.gitignore`)
- L'APK est construit automatiquement par GitHub Actions

## 📦 Où télécharger l'APK ?

### Option 1: Télécharger depuis GitHub Actions (Recommandé)

1. Allez sur le dépôt GitHub: https://github.com/YassineKAMAR/app
2. Cliquez sur l'onglet **"Actions"** en haut
3. Sélectionnez le workflow **"Build Android APK"**
4. Cliquez sur l'exécution la plus récente (celle avec une coche verte ✓)
5. Descendez jusqu'à la section **"Artifacts"**
6. Téléchargez **"BMCounter-debug-apk"**
7. Décompressez le fichier ZIP téléchargé
8. Vous trouverez `BMCounter-debug.apk` à l'intérieur

### Option 2: Télécharger depuis les Releases (Si créées)

1. Allez sur le dépôt GitHub: https://github.com/YassineKAMAR/app
2. Cliquez sur **"Releases"** dans la barre latérale droite
3. Téléchargez `BMCounter-debug.apk` depuis la dernière release

### Option 3: Construire localement

Si vous voulez construire l'APK vous-même:

```bash
# Cloner le dépôt
git clone https://github.com/YassineKAMAR/app.git
cd app

# Construire l'APK
./gradlew assembleDebug

# L'APK sera créé dans:
# build/outputs/apk/debug/app-debug.apk
```

## 🔄 Déclenchement automatique du build

Le workflow GitHub Actions se déclenche automatiquement:
- ✅ À chaque push sur la branche `main` ou `master`
- ✅ À chaque Pull Request
- ✅ Manuellement depuis l'onglet Actions (bouton "Run workflow")

## 📋 Fichiers créés dans ce projet

Les fichiers suivants ont été ajoutés pour automatiser la construction de l'APK:

1. **`.gitignore`** - Empêche les fichiers de build d'être commités
2. **`.github/workflows/build-apk.yml`** - Workflow qui construit l'APK automatiquement
3. **`COMMENT_TROUVER_APK.md`** - Ce fichier de documentation

## ⏱️ Durée de conservation

Les artifacts GitHub Actions sont conservés pendant **90 jours** par défaut.

## 🏷️ Créer une Release avec l'APK

Pour créer une release permanente avec l'APK:

```bash
# Créer un tag
git tag v2.0.0
git push origin v2.0.0
```

Le workflow créera automatiquement une release GitHub avec l'APK attaché.

## 📱 Installation de l'APK

Une fois l'APK téléchargé:
1. Transférez `BMCounter-debug.apk` sur votre appareil Android
2. Activez "Sources inconnues" dans les paramètres Android
3. Ouvrez le fichier APK pour l'installer

---

**Note**: Ce système a été mis en place le 2026-04-03 pour faciliter la distribution de l'application.
