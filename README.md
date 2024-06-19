# React Native Turbo Module Example

This project is a demonstration of a simple Turbo Module embedded in a React Native TypeScript App.

![Turbo Module Demo](https://github.com/anishamalde/RNTurboModuleDemo/assets/39306477/5ca36051-9cf8-48ba-b949-b22c2b80317f)

You can find the step-by-step guide the implementation [here.](https://dev.to/anishamalde/a-guide-to-turbo-modules-in-react-native-for-android-fire-os-1d45?preview=1df280c8e301fa74edfe5805e809f0907bc90a6a56684d890bcde13d6953e31b66cd52b550e4217e0a13f73683f94d5ce7630b38458e5384fd799aa0)

## 👩‍💻 Installing the app

1. Clone the demo app repository:
   `git clone https://github.com/AmazonAppDev/reactnative-turbo-module-demo`

Within the folder you will find 2 subfolders:

- RTNDeviceName which is a Turbo Module that returns the Native device name
- TMDemo which is a TS app that implements the TurboModule and displays the device name

1. From the TMDemo folder, install the dependencies by running:

```
yarn
```

This installs all the dependencies.

2. From the TMDemo folder, add the TurboModule to your app by running:

```
yarn add ../RTNDeviceName
```

3. From the TMDemo/android/app/ directory, generate a debug keystore by running:

```
keytool -genkey -v -keystore debug.keystore -storepass android -alias androiddebugkey -keypass android -keyalg RSA -keysize 2048 -validity 10000
```

## 💻 Running the demo

1. Connect your Android Device / Fire tablet device following these [instructions](https://developer.amazon.com/docs/fire-tablets/connecting-adb-to-device.html).
2. From the TMDemo folder, run the app using the command:

```
yarn android
```

## Get support

If you found a bug or want to suggest a new [feature/use case/sample], please [file an issue](../../issues).

If you have questions, comments, or need help with code, we're here to help:

- on Twitter at [@AmazonAppDev](https://twitter.com/AmazonAppDev)
- on Stack Overflow at the [amazon-appstore](https://stackoverflow.com/questions/tagged/amazon-appstore) tag

### Stay updated

Get the most up to date Amazon Appstore developer news, product releases, tutorials, and more:

- 📣 Follow [@AmazonAppDev](https://twitter.com/AmazonAppDev) and [our team](https://twitter.com/i/lists/1580293569897984000) on [Twitter](https://twitter.com/AmazonAppDev)

- 📺 Subscribe to our [Youtube channel](https://www.youtube.com/amazonappstoredevelopers)
