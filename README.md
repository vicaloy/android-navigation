# navigation-android

Para probar los deeplinks

Abrir terminal y dirigirse al sdk de Android para ejecuar comandos con adb

cd /Users/victoriaaloy/Library/Android/sdk
cd platform-tools
./adb -d shell
am start -W -a android.intent.action.VIEW -d "deeplink" appId
