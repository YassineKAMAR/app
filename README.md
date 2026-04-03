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

## 📥 Télécharger l'APK

**L'APK n'est pas stocké dans le dépôt Git.** Pour télécharger l'application:

👉 **[Consultez le guide de téléchargement complet](COMMENT_TROUVER_APK.md)**

### Méthode Rapide

1. Allez dans l'onglet **[Actions](https://github.com/YassineKAMAR/app/actions)** sur GitHub
2. Cliquez sur le workflow **"Build Android APK"** le plus récent
3. Téléchargez l'artifact **"BMCounter-debug-apk"**
4. Décompressez le fichier ZIP pour obtenir `BMCounter-debug.apk`

## Construction de l'APK (Local)

### Prérequis
- Android SDK installé
- Gradle 7.5 ou supérieur
- JDK 17

### Commandes de Construction

```bash
# Assurez-vous d'être dans le répertoire du projet
cd /path/to/BMCounter

# Construire l'APK de débogage
./gradlew assembleDebug

# L'APK sera situé à:
# build/outputs/apk/debug/app-debug.apk
```

### Alternative (si gradlew n'est pas disponible)

```bash
# Initialiser le wrapper Gradle
gradle wrapper --gradle-version=7.5

# Puis construire
./gradlew assembleDebug
```

## 🤖 Build Automatique

Un workflow GitHub Actions construit automatiquement l'APK à chaque push. L'APK est disponible comme artifact pendant 90 jours.

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
