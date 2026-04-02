# Modifications Summary - Hematology Laboratory App

## Changes Made

### 1. Logo and Images
- **Main Logo**: Copied to `src/main/res/drawable/logo.jpg`
- **Splash Logo**: Copied to `src/main/res/drawable/splash_logo.jpg`
- **Icon**: Copied to `src/main/res/drawable/icon.jpg`

### 2. Color Scheme Updates (src/main/res/values/colors.xml)
Updated the app's color theme to match the medical/hematology laboratory branding:

- **Primary Color**: #B91E2E (Deep Red/Burgundy - matches the lab logo)
- **Primary Dark**: #8B1722 (Darker Red)
- **Accent Color**: #B91E2E (Deep Red/Burgundy)
- **Secondary Color**: #FFFFFF (White)
- **Launcher Background**: #B91E2E (Deep Red/Burgundy)

Changed from the original teal/orange colors to medical-themed red/burgundy colors that match the Hematology Laboratory branding.

### 3. Configuration Files Created
- `settings.gradle`: Project settings
- `gradle.properties`: Gradle build properties
- `local.properties`: Local SDK configuration

## Application Details
- **Package Name**: hokudai.kazusasa.BMCounter
- **Application ID**: hokudai.kazusasa.BMCounter
- **Version Name**: 2.0.0
- **Version Code**: 3
- **Target SDK**: 33
- **Min SDK**: 21

## Logo Branding
The new logos represent "LABORATOIRE D'HEMATOLOGIE" (Hematology Laboratory) for:
- CENTRE HOSPITALIER UNIVERSITAIRE GENERALE MOHAMMED VI
- GST (TANGER-TETOUAN-AL HOCEIMA)

## How to Build the APK

### Prerequisites
- Android SDK installed
- Gradle 7.5 or higher
- JDK 17

### Build Commands
```bash
# Make sure you're in the project directory
cd /path/to/BMCounter

# Build debug APK
./gradlew assembleDebug

# The APK will be located at:
# build/outputs/apk/debug/app-debug.apk
```

### Alternative Build (if gradlew is not available)
```bash
# Initialize Gradle wrapper
gradle wrapper --gradle-version=7.5

# Then build
./gradlew assembleDebug
```

## Source Code Repository
The modified source code is ready to be uploaded to GitHub. The repository will contain:
- Updated color scheme
- New logo images
- All original app functionality
- Build configuration files

## Notes
- All original app features are preserved
- Only visual elements (colors and logos) have been modified
- The app is ready for compilation on a machine with Android SDK and Gradle installed
