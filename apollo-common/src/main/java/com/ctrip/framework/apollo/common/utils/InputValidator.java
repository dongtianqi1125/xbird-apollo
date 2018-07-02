package com.ctrip.framework.apollo.common.utils;

import com.ctrip.framework.apollo.core.utils.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface InputValidator {
  String INVALID_CLUSTER_NAMESPACE_MESSAGE = "只允许输入数字，字母和符号 - _ .";
  String INVALID_NAMESPACE_NAMESPACE_MESSAGE = "不允许以.json, .yml, .yaml, .xml, .properties结尾";
  String CLUSTER_NAMESPACE_VALIDATOR = "[0-9a-zA-Z_.-]+";
  String APP_NAMESPACE_VALIDATOR = "[a-zA-Z0-9._-]+(?<!\\.(json|yml|yaml|xml|properties))$";
  Pattern CLUSTER_NAMESPACE_PATTERN = Pattern.compile(CLUSTER_NAMESPACE_VALIDATOR);
  Pattern APP_NAMESPACE_PATTERN = Pattern.compile(APP_NAMESPACE_VALIDATOR);

  public static boolean isValidClusterNamespace(String input) {
    Matcher matcher = CLUSTER_NAMESPACE_PATTERN.matcher(input);
    return matcher.matches();
  }

  public static boolean isValidAppNamespace(String name) {
    if (StringUtils.isEmpty(name)) {
      return false;
    }
    return CLUSTER_NAMESPACE_PATTERN.matcher(name).matches()
        && APP_NAMESPACE_PATTERN.matcher(name).matches();
  }
}
