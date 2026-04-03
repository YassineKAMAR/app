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

## Construction de l'APK

## Où trouver l'APK sur GitHub

- **Releases GitHub**: Téléchargez l'APK depuis l'onglet *Releases* (s'il est publié). Le fichier est généralement nommé `app-debug.apk` ou `BMCounter-debug.apk`.
- **Dépôt GitHub**: Les APK ne sont pas stockés dans le dépôt Git par défaut. Il faut le générer localement via Gradle.

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
# (peut aussi être nommé BMCounter-debug.apk selon la configuration)
```

### Alternative (si gradlew n'est pas disponible)

```bash
# Initialiser le wrapper Gradle
gradle wrapper --gradle-version=7.5

# Puis construire
./gradlew assembleDebug
```

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
