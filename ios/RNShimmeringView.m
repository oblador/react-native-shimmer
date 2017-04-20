//
//  RNShimmeringView.m
//  RNShimmer
//
//  Created by Joel Arvidsson on 2016-03-03.
//  Copyright © 2016 Joel Arvidsson. All rights reserved.
//

#import "RNShimmeringView.h"
#import <React/RCTAssert.h>

@implementation RNShimmeringView

- (void)insertReactSubview:(UIView *)subview atIndex:(NSInteger)atIndex
{
  RCTAssert(self.contentView == nil, @"RNShimmeringView may only contain a single subview");
  self.contentView = subview;
}

- (void)removeReactSubview:(UIView *)subview
{
  RCTAssert(self.contentView == subview, @"Attempted to remove non-existent subview");
  self.contentView = nil;
  [subview removeFromSuperview];
}

- (NSArray<UIView *> *)reactSubviews
{
  return self.contentView ? @[self.contentView] : @[];
}

@end
