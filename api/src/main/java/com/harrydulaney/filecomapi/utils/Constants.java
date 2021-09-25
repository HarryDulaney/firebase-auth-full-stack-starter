package com.harrydulaney.filecomapi.utils;


import java.util.concurrent.TimeUnit;

/**
 * Global Application Constants
 *
 * @author HGDIV
 */
public class Constants {

    /* ------------------------------------------ Message Key Constants -------------------------------------------------- */
    static final String OPEN_CONVERTER = "OPEN_CONVERTER";
    static final String OPEN_PREFERENCES = "OPEN_PREFS";
    public static final String FRESH_START = "NEW_START_CONDITION";

    /* ------------------------------------------ UserPreferences Key Constants ---------------------------------------------- */

    public static final String NEW_USER_KEY = "NEW_USER_KEY";
    public static final String DIR_PATH_KEY = "SOURCE_PATH";
    public static final String DIR_WRITE_PATH_KEY = "WRITE_PATH";
    public static final String EXCEL_PREF_KEY = "EXCEL_PREF";
    public static final String DOC_TYPE_KEY = "DOC_PREF";
    public static final String IMG_TYPE_KEY = "IMG_PREF";
    public static final String SOURCE_POLICY_KEY = "SOURCE_POLICY";
    public static final String BACKGROUND_COLOR = "DEFAULT_BG_COLOR";
    public static final String GUI_COLOR_THEME = "COLOR_THEME";

    /* ----------------------------------------- Misc Controller Keys ---------------------------------------------------- */
    public static final String PROJECT_SOURCE_DELETE_KEY = "Delete";
    public static final String PROJECT_SOURCE_SAVE_KEY = "Save";

    public static final String DOCX2PDF = "docx -> pdf";
    //    static final String PDFtxt2DOCX = "pdf -> (EXTRACT TEXT) -> docx";
    public static final String CLONE_PDF_TO_DOCX = "pdf -> docx (Windows Only)";

    public static final String LIGHT_THEME_ID = "light.theme.default";
    public static final String DARK_THEME_ID = "dark.theme.dark";


    /* ----------------------------------------- URLs ---------------------------------------------------- */

    public static final String ABOUT_FILE_COMMANDER = "https://harrydulaney.com/file-commander";
    public static final String ISSUES_PAGE = "https://www.github.com/HarryDulaney/file-commander/issues";
    public static final String GITHUB_MAIN = "https://www.github.com/HarryDulaney/file-commander";
    public static final String DEVELOPER_INFO = "https://harrydulaney.com";

    /* ----------------------------------------- Cookies  ---------------------------------------------------- */
    public static final boolean CHECK_REVOKED = true;
    public static final String SESSION_COOKIE = "session-file-com";
    public static final boolean STRICT_SERVER_SESSION_ENABLED = true;
    public static final String PARENT_COOKIE_PATH = "/";
    public static final boolean COOKIE_HTTP_ONLY_LOCAL = false;
    public static final boolean COOKIE_HTTP_ONLY_PROD = true;
    public static final boolean COOKIE_HTTP_ONLY_TEST = true;


    /* ----------------------------------------- Content Types (Files) ---------------------------------------------------- */


}

