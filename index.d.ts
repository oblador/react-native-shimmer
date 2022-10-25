import React from 'react';
import { ViewProps } from "react-native";

export interface ShimmerProps extends ViewProps {
  animating?: boolean;
  animationOpacity?: number;
  duration?: number;
  pauseDuration?: number;
  shimmeringDirection?: "up" | "down" | "left" | "right";
  shimmeringOpacity?: number;

  highlightLength?: number; // ios only
  beginFadeDuration?: number; // ios only
  endFadeDuration?: number; // ios only

  intensity?: number; // android only
  tilt?: number; // android only
}

export default class Shimmer extends React.Component<ShimmerProps> {}
