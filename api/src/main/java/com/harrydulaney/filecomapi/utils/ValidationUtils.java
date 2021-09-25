package com.harrydulaney.filecomapi.utils;

import com.harrydulaney.filecomapi.model.UserPreferences;

/**
 * Utility class for validating object fields are initialized
 *
 * @author HGDIV
 */
public class ValidationUtils {

  private ValidationUtils() {
  }

  /**
   * @param userPreferences The current UserPreferences
   * @return true if fields have been initialized
   */
  public static boolean validateUserPaths(UserPreferences userPreferences) {
    return ((userPreferences.getSourceFilePolicy() != null) &
      (userPreferences.getImgPreference() != null) &
      (userPreferences.getWriteDirectoryPath() != null) &
      (userPreferences.getDirectoryPath() != null) &
      (userPreferences.getDocPreference() != null) &
      (userPreferences.getExcelPreference() != null) &
      (userPreferences.getReplaceBgColor() != null));
  }

  /**
   * @param userPreferences The current UserPreferences
   * @return true if UserPreferences fields are initialized
   */
  public static boolean validateUser(UserPreferences userPreferences) {
    return ((userPreferences.getDocPreference() != null) & (userPreferences.getExcelPreference() != null))
      && ((userPreferences.getImgPreference() != null) & (userPreferences.getDirectoryPath() != null))
      && ((userPreferences.getWriteDirectoryPath() != null) & (userPreferences.getSourceFilePolicy() != null));

  }


}
