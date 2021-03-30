#import "FlutterPluginUploadTestPlugin.h"
#if __has_include(<flutter_plugin_upload_test/flutter_plugin_upload_test-Swift.h>)
#import <flutter_plugin_upload_test/flutter_plugin_upload_test-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "flutter_plugin_upload_test-Swift.h"
#endif

@implementation FlutterPluginUploadTestPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterPluginUploadTestPlugin registerWithRegistrar:registrar];
}
@end
