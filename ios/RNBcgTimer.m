
#import "RNBcgTimer.h"

@implementation RNBcgTimer

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(changeStatus:(BOOL *)status)
{
    NSUserDefaults* def = [[NSUserDefaults alloc] init];
    [def setBool:status forKey:@"status"];
    [def synchronize];
}

@end
  
