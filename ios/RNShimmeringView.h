//
//  RNShimmeringView.h
//  RNShimmer
//
//  Created by Joel Arvidsson on 2016-03-03.
//  Copyright © 2016 Joel Arvidsson. All rights reserved.
//

#import "FBShimmeringView.h"

@interface RNShimmeringView : FBShimmeringView

#ifdef RCT_NEW_ARCH_ENABLED
- (CFTimeInterval)getShimmeringDuration;
- (void)setShimmeringDuration:(CFTimeInterval)shimmeringDuration;
#endif

@end
