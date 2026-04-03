# BMCounter - Hematology Laboratory App

Application mobile pour le Laboratoire d'Hématologie du Centre Hospitalier Universitaire Générale Mohammed VI (GST - Tanger-Tétouan-Al Hoceima).

## Description

Cette application est personnalisée pour le laboratoire d'hématologie avec:
- Logo du laboratoire médical
- Thème de couleurs médicales (rouge/bordeaux)
- Interface adaptée pour les professionnels de santé

## Caractéristiques

- **Package**: hokudai.kazusasa.BMCounter
- **Version**: 2.0.0 (Code: 3)
- **SDK Cible**: Android 13 (API 33)
- **SDK Minimum**: Android 5.0 (API 21)

## Couleurs du Thème

- **Couleur Principale**: #B91E2E (Rouge/Bordeaux)
- **Couleur Foncée**: #8B1722 (Rouge Foncé)
- **Couleur Accent**: #B91E2E
- **Couleur Secondaire**: #FFFFFF (Blanc)

## 📦 Où Trouver l'APK ?

### ⚠️ Important: Le fichier APK n'est PAS dans le dépôt GitHub

Le fichier **`build/outputs/apk/debug/BMCounter-debug.apk`** n'est **PAS stocké dans GitHub** car le dossier `build/` est ignoré par Git (voir `.gitignore`).

### 🎯 3 Façons d'Obtenir l'APK

#### Option 1: Construire Localement 🔨

```bash
# 1. Cloner le dépôt
git clone https://github.com/votre-utilisateur/BMCounter.git
cd BMCounter

# 2. Construire l'APK
./gradlew assembleDebug

# 3. L'APK sera disponible à:
# build/outputs/apk/debug/BMCounter-debug.apk
```

#### Option 2: Télécharger depuis GitHub Actions 📥

**C'est la méthode la plus simple si GitHub Actions est configuré!**

1. Allez sur l'onglet **Actions** dans GitHub
2. Cliquez sur le workflow "Build Android APK"
3. Sélectionnez la dernière exécution réussie (✅)
4. Téléchargez l'artefact **BMCounter-debug-apk**
5. Décompressez le fichier ZIP pour obtenir l'APK

L'APK est automatiquement construit à chaque push sur `main`/`master` !

#### Option 3: Télécharger depuis Releases 🚀

Si une release a été publiée:
1. Allez dans l'onglet **Releases**
2. Trouvez la dernière version
3. Téléchargez le fichier APK attaché

### 🛠️ Construction de l'APK (Détails)

#### Prérequis
- Android SDK installé
- Gradle 7.5 ou supérieur
- JDK 17

#### Commandes de Construction

```bash
# Assurez-vous d'être dans le répertoire du projet
cd /path/to/BMCounter

# Construire l'APK de débogage
./gradlew assembleDebug

# Construire l'APK de release
./gradlew assembleRelease

# L'APK de debug sera situé à:
# build/outputs/apk/debug/BMCounter-debug.apk

# L'APK de release sera situé à:
# build/outputs/apk/release/BMCounter-release.apk
```

#### Alternative (si gradlew n'est pas disponible)

```bash
# Initialiser le wrapper Gradle
gradle wrapper --gradle-version=7.5

# Puis construire
./gradlew assembleDebug
```

#### Vérifier que l'APK a été créé

```bash
# Rechercher tous les APKs
find . -name "*.apk" -type f

# Afficher les détails
ls -lh build/outputs/apk/debug/*.apk
```

### 📍 Emplacement Exact de l'APK

```
votre-repo/
├── build/                           ← IGNORÉ PAR GIT
│   └── outputs/
│       └── apk/
│           ├── debug/
│           │   └── BMCounter-debug.apk      ← APK ICI
│           └── release/
│               └── BMCounter-release.apk    ← APK RELEASE ICI
```

### 🔄 GitHub Actions (CI/CD)

Ce projet inclut un workflow GitHub Actions (`.github/workflows/build-apk.yml`) qui:
- ✅ Construit automatiquement l'APK à chaque push
- ✅ Télécharge l'APK comme artefact
- ✅ Garde les artefacts pendant 30 jours
- ✅ Affiche les informations de build

**Pour activer:** Le workflow s'active automatiquement dès que vous poussez vers GitHub!

## Structure du Projet

```
BMCounter/
├── src/main/
│   ├── AndroidManifest.xml
│   ├── res/
│   │   ├── drawable/
│   │   │   ├── logo.jpg
│   │   │   ├── splash_logo.jpg
│   │   │   └── icon.jpg
│   │   ├── values/
│   │   │   └── colors.xml
│   │   └── mipmap-*/
│   │       └── ic_launcher.png
│   └── assets/
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Images et Branding

Les images du logo représentent:
- **Laboratoire d'Hématologie**
- **Centre Hospitalier Universitaire Générale Mohammed VI**
- **GST (Tanger-Tétouan-Al Hoceima)**

## Modifications Effectuées

1. ✅ Ajout des nouveaux logos dans les ressources drawable
2. ✅ Mise à jour du schéma de couleurs pour correspondre au thème médical
3. ✅ Configuration des icônes de lancement
4. ✅ Préparation des fichiers de configuration Gradle

## License

Ce projet est sous licence propriétaire pour le Centre Hospitalier Universitaire Générale Mohammed VI.

## Contact

Pour toute question concernant cette application, veuillez contacter l'administration du CHU Mohammed VI.
