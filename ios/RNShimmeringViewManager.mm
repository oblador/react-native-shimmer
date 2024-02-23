//
//  RNShimmeringViewManager.mm
//  RNShimmer
//
//  Created by Joel Arvidsson on 2016-03-03.
//  Copyright © 2016 Joel Arvidsson. All rights reserved.
//

#import "RNShimmeringViewManager.h"
#import "FBShimmering.h"

#ifdef RCT_NEW_ARCH_ENABLED
#import "RNShimmer.h"
#else
#import "RNShimmeringView.h"
#endif

@implementation RCTConvert(FBShimmering)

RCT_ENUM_CONVERTER(FBShimmerDirection, (@{
  @"right": @(FBShimmerDirectionRight),
  @"left": @(FBShimmerDirectionLeft),
  @"up": @(FBShimmerDirectionUp),
  @"down": @(FBShimmerDirectionDown),
}), FBShimmerDirectionRight, integerValue)

RCT_CUSTOM_CONVERTER(CFTimeInterval, CFTimeInterval, [self double:json] / 1000.0)

@end

@implementation RNShimmeringViewManager

#ifdef RCT_NEW_ARCH_ENABLED
RCT_EXPORT_MODULE()
- (RNShimmer *)view
{
  return [RNShimmer new];
}
#else
RCT_EXPORT_MODULE()
- (RNShimmeringView *)view
{
  return [RNShimmeringView new];
}
#endif

RCT_REMAP_VIEW_PROPERTY(animating, shimmering, BOOL)
RCT_EXPORT_VIEW_PROPERTY(shimmeringDirection, FBShimmerDirection)
RCT_REMAP_VIEW_PROPERTY(duration, shimmeringDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(pauseDuration, shimmeringPauseDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(animationOpacity, shimmeringAnimationOpacity, CGFloat)
RCT_EXPORT_VIEW_PROPERTY(shimmeringOpacity, CGFloat)
RCT_REMAP_VIEW_PROPERTY(speed, shimmeringSpeed, CGFloat)
RCT_REMAP_VIEW_PROPERTY(highlightLength, shimmeringHighlightLength, CGFloat)
RCT_REMAP_VIEW_PROPERTY(beginFadeDuration, shimmeringBeginFadeDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(endFadeDuration, shimmeringEndFadeDuration, CFTimeInterval)

@end