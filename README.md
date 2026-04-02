# BMCounter - Modified Version

## Changes Made

### Images Updated
- **Logo**: Replaced with new logo image (1000340678.jpg)
- **App Splash**: Updated splash screen (1000340679.jpg)
- **Cell Reference**: Added new cell reference image (1000340677.jpg)
- **App Icons**: Updated all launcher icons (mipmap-hdpi, mdpi, xhdpi, xxhdpi, xxxhdpi)

### Colors Updated
- Changed primary color scheme from teal to purple
- Accent colors: #9C27B0 (purple) and #7B1FA2 (dark purple)
- Launcher background: #9C27B0

## Building the APK

### Prerequisites
- JDK 17 or higher
- Android SDK (API 33)
- Gradle 8.0+

### Build Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YassineKAMAR/app.git
   cd app
   ```

2. **Build the debug APK**:
   ```bash
   ./gradlew assembleDebug
   ```

3. **Build the release APK** (requires signing):
   ```bash
   ./gradlew assembleRelease
   ```

4. **Find the APK**:
   - Debug APK: `build/outputs/apk/debug/app-debug.apk`
   - Release APK: `build/outputs/apk/release/app-release.apk`

## Project Structure

```
.
├── build.gradle              # Main build configuration
├── settings.gradle           # Project settings
├── gradlew                   # Gradle wrapper script (Unix)
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
└── src/
    └── main/
        ├── AndroidManifest.xml
        ├── assets/
        │   └── flutter_assets/
        │       └── assets/
        │           └── images/      # Updated images here
        └── res/
            ├── values/
            │   └── colors.xml       # Updated colors
            └── mipmap-*/
                └── ic_launcher.png  # Updated launcher icons
```

## Download Links

- **GitHub Repository**: https://github.com/YassineKAMAR/app
- **Clone URL**: `git clone https://github.com/YassineKAMAR/app.git`

## Notes

- The app uses Flutter framework
- Minimum SDK: API 21 (Android 5.0)
- Target SDK: API 33 (Android 13)
- Version: 2.0.0 (versionCode 3)
