# react-native-shimmer

Simple shimmering effect in React Native. Based on [Shimmer](https://github.com/facebook/Shimmer)/[shimmer-android](https://github.com/facebook/shimmer-android).

![Shimmer](https://github.com/facebook/Shimmer/blob/master/shimmer.gif?raw=true)

## Installation

```sh
yarn add react-native-shimmer
cd ios && pod install
```

<details>
  <summary>Installation for React Native <= 0.59</summary>

### Option: With [CocoaPods](https://cocoapods.org/)

Add the following to your `Podfile` and run `pod update`:

```
pod 'react-native-shimmer', :path => 'node_modules/react-native-shimmer'
```

### Option: With `react-native link`

`$ react-native link react-native-shimmer`

### Option: Manually

#### iOS

Add `ios/RNShimmer.xcodeproj` to **Libraries** and add `libRNShimmer.a` to **Link Binary With Libraries** under **Build Phases**. [More info and screenshots about how to do this is available in the React Native documentation](http://facebook.github.io/react-native/docs/linking-libraries-ios.html#content).

#### Android

- Edit `android/settings.gradle` to look like this (without the +):

```diff
rootProject.name = 'MyApp'

include ':app'

+ include ':react-native-shimmer'
+ project(':react-native-shimmer').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-shimmer/android')
```

- Edit `android/app/build.gradle` (note: **app** folder) to look like this:

```diff
apply plugin: 'com.android.application'

android {
  ...
}

dependencies {
  compile fileTree(dir: 'libs', include: ['*.jar'])
  compile "com.android.support:appcompat-v7:23.0.1"
  compile "com.facebook.react:react-native:+"  // From node_modules
+ compile project(':react-native-shimmer')
}
```

- Edit your `MainApplication.java` (deep in `android/app/src/main/java/...`) to look like this (note **two** places to edit):

```diff
package com.myapp;

+ import com.oblador.shimmer.RNShimmerPackage;

....

  @Override
  protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
      new MainReactPackage()
+   , new RNShimmerPackage()
    );
  }

}
```
</details>

## Usage

NOTE: `Shimmer` may only have one child.

```js
import Shimmer from 'react-native-shimmer';

<Shimmer>
  <Text>Loading...</Text>
</Shimmer>;
```

### Properties

| Prop                    | Description                                                                            | Default |
| ----------------------- | -------------------------------------------------------------------------------------- | ------- |
| **`animating`**         | Whether or not to show shimmering effect.                                              | `true`  |
| **`direction`**         | The direction of shimmering animation, valid values are `up`, `down`, `left`, `right`. | `right` |
| **`duration`**          | The shimmering animation duration in milliseconds.                                     | `1000`  |
| **`pauseDuration`**     | The time interval between shimmerings in milliseconds.                                 | `400`   |
| **`animationOpacity`**  | The opacity of the content while it is shimmering.                                     | `1`     |
| **`opacity`**           | The opacity of the content before it is shimmering.                                    | `0.5`   |
| **`highlightLength`**   | The highlight length of shimmering. Range of 0–1. _iOS only_                           | `1`     |
| **`beginFadeDuration`** | The duration of the fade used when shimmer begins. _iOS only_                          | `0`     |
| **`endFadeDuration`**   | The duration of the fade used when shimmer ends. _iOS only_                            | `0`     |
| **`tilt`**              | The tilt angle of the highlight, in degrees. _Android only_                            | `0`     |
| **`intensity`**         | The intensity of the highlight mask. Range of 0–1. _Android only_                      | `0`     |

## License

[MIT License](http://opensource.org/licenses/mit-license.html). Shimmer is under BSD license. © Joel Arvidsson 2016 - present
