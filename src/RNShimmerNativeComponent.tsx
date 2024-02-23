import type { HostComponent, ViewProps } from "react-native";
import type {
  Float,
  Int32,
  WithDefault,
} from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

export interface NativeProps extends ViewProps {
  animating?: WithDefault<boolean, true>;
  animationOpacity?: WithDefault<Float, 1>;
  duration?: WithDefault<Int32, 1000>;
  pauseDuration?: WithDefault<Int32, 400>;
  shimmeringDirection?: WithDefault<"right" | "left" | "up" | "down", "right">;
  shimmeringOpacity?: WithDefault<Float, 0.5>;

  highlightLength?: WithDefault<Float, 1>; // ios only
  beginFadeDuration?: WithDefault<Float, 0>; // ios only
  endFadeDuration?: WithDefault<Float, 0>; // ios only

  intensity?: WithDefault<Float, 0>; // android only
  tilt?: WithDefault<Float, 0>; // android only
}

export default codegenNativeComponent<NativeProps>(
  "RNShimmeringView"
) as HostComponent<NativeProps>;
