import PropTypes from "prop-types";
import React, { Component } from "react";
import { ViewProps } from "react-native";
import requireNativeComponent from "react-native/Libraries/ReactNative/requireNativeComponent";

export interface ShimmerProps extends ViewProps {
  animating?: boolean;
  direction?: "up" | "down" | "left" | "right";
  duration?: number;
  pauseDuration?: number;
  animationOpacity?: number;
  opacity?: number;
  tilt?: number;
  intensity?: number;
  highlightLength?: number;
  beginFadeDuration?: number;
  endFadeDuration?: number;
}

export default class Shimmer extends Component<ShimmerProps> {
  static propTypes = {
    animating: PropTypes.bool,
    direction: PropTypes.oneOf(["up", "down", "left", "right"]),
    duration: PropTypes.number,
    pauseDuration: PropTypes.number,
    animationOpacity: PropTypes.number,
    opacity: PropTypes.number,
    tilt: PropTypes.number,
    intensity: PropTypes.number,
    highlightLength: PropTypes.number,
    beginFadeDuration: PropTypes.number,
    endFadeDuration: PropTypes.number,
  };

  static defaultProps = {
    animating: true,
    animationOpacity: 1,
    duration: 1000,
    opacity: 0.5,
    tilt: 0,
    pauseDuration: 400,
    beginFadeDuration: 0,
    endFadeDuration: 0,
  };

  render() {
    const { direction, opacity, ...props } = this.props;
    return (
      <RNShimmeringView
        shimmeringOpacity={opacity}
        shimmeringDirection={direction}
        {...props}
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
