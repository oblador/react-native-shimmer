# react-native-shimmer

Simple shimmering effect in React Native. Based on [Shimmer](https://github.com/facebook/Shimmer).

![Shimmer](https://github.com/facebook/Shimmer/blob/master/shimmer.gif?raw=true)

## Installation

`$ yarn add react-native-shimmer`

### Option: With `react-native link`

`$ react-native link react-native-shimmer`

### Option: Manually

Add `ios/RNShimmer.xcodeproj` to **Libraries** and add `libRNShimmer.a` to **Link Binary With Libraries** under **Build Phases**. [More info and screenshots about how to do this is available in the React Native documentation](http://facebook.github.io/react-native/docs/linking-libraries-ios.html#content).

### Option: With [CocoaPods](https://cocoapods.org/)

Add the following to your `Podfile` and run `pod update`:

```
pod 'react-native-shimmer', :path => 'node_modules/react-native-shimmer'
```

## Usage

NOTE: `Shimmer` may only have one child and currently doesn't work with `View`.

```js
import Shimmer from 'react-native-shimmer';

<Shimmer>
  <Text>Loading...</Text>
</Shimmer>
```

### Properties

| Prop | Description | Default |
|---|---|---|
|**`animating`**|Wether or not to show shimmering effect. |`true`|
|**`direction`**|The direction of shimmering animation, valid values are `up`, `down`, `left`, `right`. |`right`|
|**`pauseDuration`**|The time interval between shimmerings in milliseconds. |`400`|
|**`animationOpacity`**|The opacity of the content while it is shimmering. |`0.5`|
|**`opacity`**|The opacity of the content before it is shimmering. |`1`|
|**`speed`**|The speed of shimmering, in points per second. |`230`|
|**`highlightLength`**|The highlight length of shimmering. Range of 0–1. |`1`|
|**`beginFadeDuration`**|The duration of the fade used when shimmer begins. |`0.1`|
|**`endFadeDuration`**|The duration of the fade used when shimmer ends. |`0.3`|

## License

[MIT License](http://opensource.org/licenses/mit-license.html). Shimmer is under BSD license. © Joel Arvidsson 2016-now
