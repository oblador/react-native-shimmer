import PropTypes from "prop-types";
import React, { Component } from "react";
import requireNativeComponent from "react-native/Libraries/ReactNative/requireNativeComponent";
import { ShimmerProps } from "..";


export default class Shimmer extends Component<ShimmerProps> {
  static propTypes = {
    animating: PropTypes.bool,
    animationOpacity: PropTypes.number,
    duration: PropTypes.number,
    pauseDuration: PropTypes.number,
    shimmeringDirection: PropTypes.oneOf(["up", "down", "left", "right"]),
    shimmeringOpacity: PropTypes.number,
    highlightLength: PropTypes.number,
    beginFadeDuration: PropTypes.number,
    endFadeDuration: PropTypes.number,
    tilt: PropTypes.number,
    intensity: PropTypes.number,
  };

  static defaultProps = {
    animating: true,
    animationOpacity: 1,
    duration: 1000,
    pauseDuration: 400,
    shimmeringOpacity: 0.5,
    shimmeringDirection: "right",
    highlightLength: 1,
    beginFadeDuration: 0,
    endFadeDuration: 0,
    tilt: 0,
    intensity: 0,
  };

  render() {
    return (
      <RNShimmeringView
        {...this.props}
      />
    );
  }
}

const RNShimmeringView = requireNativeComponent("RNShimmeringView", Shimmer, {
    nativeOnly: {
      shimmeringDirection: true,
      shimmeringOpacity: true,
    },
  });
