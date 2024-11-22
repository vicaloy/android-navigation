# 📱 Android Multi-Module Project with Deep Links and Bottom Navigation

This repository demonstrates an Android multi-module application that uses deep links for navigation between modules and features a Bottom Navigation component implemented with XML. This structure enhances modularity and ensures smooth navigation within the app.

## 🚀 Features

- Multi-Module Architecture
Organized into multiple modules for better code separation, reusability, and scalability.
Deep Link Navigation

- Seamless deep linking between different modules and activities.
Bottom Navigation

- Provides an intuitive and user-friendly navigation experience using Bottom Navigation View in XML.

## 🔗 Testing Deep Links

Open your terminal and navigate to the Android SDK's platform-tools directory:
- cd /Users/victoriaaloy/Library/Android/sdk/platform-tools

Execute the ADB command to test deep links:
- ./adb -d shell am start -W -a android.intent.action.VIEW -d "deeplink://feature1" com.example.app  

Replace "deeplink://feature1" with the actual deep link URL for the specific feature.
Replace com.example.app with your app's package name.
