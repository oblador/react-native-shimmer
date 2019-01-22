import * as React from "react";
import { ViewProps } from "react-native";

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

export default class Shimmer extends React.Component<ShimmerProps> {}
