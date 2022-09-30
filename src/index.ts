const isFabricEnabled = global.nativeFabricUIManager != null;

const shimmer = isFabricEnabled
  ? require("./RNShimmerNativeComponent").default
  : require("./RNShimmer").default;

export default shimmer;
