package com.custom.ledcover.ledback.sdk.cover;

public class ScoverState {
    public static final int COLOR_BLACK = 1;
    public static final int COLOR_BLUE = 5;
    public static final int COLOR_BLUSH_PINK = 8;
    public static final int COLOR_CARBON_METAL = 6;
    public static final int COLOR_CHARCOAL = 10;
    public static final int COLOR_CHARCOAL_GRAY = 10;
    public static final int COLOR_CLASSIC_WHITE = 2;
    public static final int COLOR_DEFAULT = 0;
    public static final int COLOR_GOLD = 7;
    public static final int COLOR_GRAYISH_BLUE = 9;
    public static final int COLOR_GREEN = 11;
    public static final int COLOR_INDIGO_BLUE = 5;
    public static final int COLOR_JET_BLACK = 1;
    public static final int COLOR_MAGENTA = 3;
    public static final int COLOR_MINT = 9;
    public static final int COLOR_MINT_BLUE = 9;
    public static final int COLOR_MUSTARD_YELLOW = 12;
    public static final int COLOR_NAVY = 4;
    public static final int COLOR_OATMEAL = 12;
    public static final int COLOR_OATMEAL_BEIGE = 12;
    public static final int COLOR_ORANGE = 13;
    public static final int COLOR_PEAKCOCK_GREEN = 11;
    public static final int COLOR_PEARL_WHITE = 2;
    public static final int COLOR_PINK = 8;
    public static final int COLOR_PLUM = 3;
    public static final int COLOR_PLUM_RED = 3;
    public static final int COLOR_ROSE_GOLD = 7;
    public static final int COLOR_SILVER = 6;
    public static final int COLOR_SOFT_PINK = 8;
    public static final int COLOR_WHITE = 2;
    public static final int COLOR_WILD_ORANGE = 13;
    public static final int COLOR_YELLOW = 12;
    public static final boolean COVER_ATTACHED = true;
    public static final boolean COVER_DETACHED = false;
    public static final int FOTA_MODE_NONE = 0;
    public static final int MODEL_DEFAULT = 0;
    public static final boolean SWITCH_STATE_COVER_CLOSE = false;
    public static final boolean SWITCH_STATE_COVER_OPEN = true;
    private static final String TAG = "ScoverState";
    public static final int TYPE_ALCANTARA_COVER = 12;
    public static final int TYPE_BRAND_MONBLANC_COVER = 100;
    public static final int TYPE_CLEAR_COVER = 8;
    public static final int TYPE_CLEAR_SIDE_VIEW_COVER = 15;
    public static final int TYPE_FLIP_COVER = 0;
    public static final int TYPE_GAMEPACK_COVER = 13;
    public static final int TYPE_HEALTH_COVER = 4;
    public static final int TYPE_KEYBOARD_KOR_COVER = 9;
    public static final int TYPE_KEYBOARD_US_COVER = 10;
    public static final int TYPE_LED_BACK_COVER = 14;
    public static final int TYPE_LED_COVER = 7;
    public static final int TYPE_MINI_SVIEW_WALLET_COVER = 16;
    public static final int TYPE_NEON_COVER = 11;
    public static final int TYPE_NFC_SMART_COVER = 255;
    public static final int TYPE_NONE = 2;
    public static final int TYPE_SVIEW_CHARGER_COVER = 3;
    public static final int TYPE_SVIEW_COVER = 1;
    public static final int TYPE_S_CHARGER_COVER = 5;
    public static final int TYPE_S_VIEW_WALLET_COVER = 6;
    public boolean attached;
    public int color;
    private boolean fakeCover;
    private int fotaMode;
    private int heightPixel;
    public int model;
    private boolean switchState;
    public int type;
    private int widthPixel;

    public ScoverState() {
        this.switchState = true;
        this.type = 2;
        this.color = 0;
        this.widthPixel = 0;
        this.heightPixel = 0;
        this.attached = false;
        this.model = 0;
        this.fakeCover = false;
        this.fotaMode = 0;
    }

    public ScoverState(boolean z, int i, int i2, int i3, int i4) {
        this.switchState = z;
        this.type = i;
        this.color = i2;
        this.widthPixel = i3;
        this.heightPixel = i4;
        this.attached = false;
        this.model = 0;
        this.fakeCover = false;
        this.fotaMode = 0;
    }

    public ScoverState(boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.switchState = z;
        this.type = i;
        this.color = i2;
        this.widthPixel = i3;
        this.heightPixel = i4;
        this.attached = z2;
        this.model = 0;
        this.fakeCover = false;
        this.fotaMode = 0;
    }

    public ScoverState(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5) {
        this.switchState = z;
        this.type = i;
        this.color = i2;
        this.widthPixel = i3;
        this.heightPixel = i4;
        this.attached = z2;
        this.model = i5;
        this.fakeCover = false;
        this.fotaMode = 0;
    }

    public ScoverState(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, boolean z3) {
        this.switchState = z;
        this.type = i;
        this.color = i2;
        this.widthPixel = i3;
        this.heightPixel = i4;
        this.attached = z2;
        this.model = i5;
        this.fakeCover = z3;
        this.fotaMode = 0;
    }

    public ScoverState(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, boolean z3, int i6) {
        this.switchState = z;
        this.type = i;
        this.color = i2;
        this.widthPixel = i3;
        this.heightPixel = i4;
        this.attached = z2;
        this.model = i5;
        this.fakeCover = z3;
        this.fotaMode = i6;
    }

    public boolean getSwitchState() {
        return this.switchState;
    }

    public int getType() {
        return this.type;
    }

    public int getColor() {
        return this.color;
    }

    public int getWindowWidth() {
        return this.widthPixel;
    }

    public int getWindowHeight() {
        return this.heightPixel;
    }

    public boolean getAttachState() {
        return this.attached;
    }

    public int getModel() {
        return this.model;
    }

    public boolean isFakeCover() {
        return this.fakeCover;
    }

    public int getFotaMode() {
        return this.fotaMode;
    }

    public String toString() {
        return String.format("ScoverState(switchState=%b type=%d color=%d widthPixel=%d heightPixel=%d attached=%b fakeCover=%b fotaMode=%d)", new Object[]{Boolean.valueOf(this.switchState), Integer.valueOf(this.type), Integer.valueOf(this.color), Integer.valueOf(this.widthPixel), Integer.valueOf(this.heightPixel), Boolean.valueOf(this.attached), Boolean.valueOf(this.fakeCover), Integer.valueOf(this.fotaMode)});
    }
}
