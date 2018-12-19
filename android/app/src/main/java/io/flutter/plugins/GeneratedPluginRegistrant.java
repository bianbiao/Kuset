package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.github.ponnamkarthik.flutterwebview.FlutterwebviewPlugin;
import com.flutter_webview_plugin.FlutterWebviewPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterwebviewPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.flutterwebview.FlutterwebviewPlugin"));
    FlutterWebviewPlugin.registerWith(registry.registrarFor("com.flutter_webview_plugin.FlutterWebviewPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
