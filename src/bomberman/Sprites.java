package bomberman;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;

public class Sprites {

    private Image classicGroundSprite;
    private int classicGroundSpritePositionx = 367;
    private int classicGroundSpritePositionY = 110;
    private int classicGroundSpriteWidth = 16;
    private int classicGroundSpriteHeight = 16;

    private Image wallBlockSprite;
    private int spritePositionX2 = 415;

    public Image getBluePlayerSprite5() {
        return this.bluePlayerSprite5;
    }

    public Image getBluePlayerSprite6() {
        return this.bluePlayerSprite6;
    }

    public Image getBluePlayerSprite7() {
        return this.bluePlayerSprite7;
    }

    public Image getBluePlayerSprite8() {
        return this.bluePlayerSprite8;
    }

    public Image getBluePlayerSprite9() {
        return this.bluePlayerSprite9;
    }

    public Image getFlameEndDownSprite2() {
        return this.flameEndDownSprite2;
    }

    public Image getFlameEndDownSprite3() {
        return this.flameEndDownSprite3;
    }

    public Image getFlameEndDownSprite4() {
        return this.flameEndDownSprite4;
    }

    public Image getFlameEndLeftSprite1() {
        return this.flameEndLeftSprite1;
    }

    private int spritePositionY2 = 110;
    private int spriteWidth2 = 16;
    private int spriteHeight2 = 16;


    private Image whitePlayerSpriteOne;
    private int whitePlayerSprite1PositionX = 3;
    private int whitePlayerSprite1PositionY = 0;
    private int whitePlayerSprite1Width = 17;
    private int whitePlayerSprite1Height = 23;

    private Image whitePlayerSprite2;
    private int whitePlayerSprite2PositionX = 29;
    private int whitePlayerSprite2PositionY = 0;
    private int whitePlayerSprite2Width = 17;
    private int whitePlayerSprite2Height = 22;

    private Image whitePlayerSprite3;
    private int whitePlayerSprite3PositionX = 50;
    private int whitePlayerSprite3PositionY = 0;
    private int whitePlayerSprite3Width = 17;
    private int whitePlayerSprite3Height = 23;

    private Image whitePlayerSprite4;
    private int whitePlayerSprite4PositionX = 73;
    private int whitePlayerSprite4PositionY = 0;
    private int whitePlayerSprite4Width = 18;
    private int whitePlayerSprite4Height = 22;

    private Image whitePlayerSprite5;
    private int whitePlayerSprite5PositionX = 99;
    private int whitePlayerSprite5PositionY = 0;
    private int whitePlayerSprite5Width = 17;
    private int whitePlayerSprite5Height = 22;

    private Image whitePlayerSprite6;
    private int whitePlayerSprite6PositionX = 122;
    private int whitePlayerSprite6PositionY = 0;
    private int whitePlayerSprite6Width = 17;
    private int whitePlayerSprite6Height = 22;

    private Image whitePlayerSprite7;
    private int whitePlayerSprite7PositionX = 148;
    private int whitePlayerSprite7PositionY = 0;
    private int whitePlayerSprite7Width = 18;
    private int whitePlayerSprite7Height = 22;

    private Image whitePlayerSprite8;
    private int whitePlayerSprite8PositionX = 171;
    private int whitePlayerSprite8PositionY = 0;
    private int whitePlayerSprite8Width = 18;
    private int whitePlayerSprite8Height = 22;

    private Image whitePlayerSprite9;
    private int whitePlayerSprite9PositionX = 194;
    private int whitePlayerSprite9PositionY = 0;
    private int whitePlayerSprite9Width = 17;
    private int whitePlayerSprite9Height = 22;

    public Image getWhitePlayerSprite10() {
        return this.whitePlayerSprite10;
    }

    private Image whitePlayerSprite10;
    private int whitePlayerSprite10PositionX = 219;
    private int whitePlayerSprite10PositionY = 0;
    private int whitePlayerSprite10Width = 17;
    private int whitePlayerSprite10Height = 23;

    private Image whitePlayerSprite11;
    private int whitePlayerSprite11PositionX = 242;
    private int whitePlayerSprite11PositionY = 0;
    private int whitePlayerSprite11Width = 17;
    private int whitePlayerSprite11Height = 23;

    private Image whitePlayerSprite12;
    private int whitePlayerSprite12PositionX = 268;
    private int whitePlayerSprite12PositionY = 0;
    private int whitePlayerSprite12Width = 17;
    private int whitePlayerSprite12Height = 23;

    private Image whitePlayerSprite13;
    private int whitePlayerSprite13PositionX = 290;
    private int whitePlayerSprite13PositionY = 0;
    private int whitePlayerSprite13Width = 17;
    private int whitePlayerSprite13Height = 22;

    private Image whitePlayerSprite14;
    private int whitePlayerSprite14PositionX = 2;
    private int whitePlayerSprite14PositionY = 25;
    private int whitePlayerSprite14Width = 21;
    private int whitePlayerSprite14Height = 22;

    private Image whitePlayerSprite15;
    private int whitePlayerSprite15PositionX = 26;
    private int whitePlayerSprite15PositionY = 25;
    private int whitePlayerSprite15Width = 21;
    private int whitePlayerSprite15Height = 22;

    private Image whitePlayerSprite16;
    private int whitePlayerSprite16PositionX = 50;
    private int whitePlayerSprite16PositionY = 25;
    private int whitePlayerSprite16Width = 21;
    private int whitePlayerSprite16Height = 22;

    private Image whitePlayerSprite17;
    private int whitePlayerSprite17PositionX = 75;
    private int whitePlayerSprite17PositionY = 26;
    private int whitePlayerSprite17Width = 19;
    private int whitePlayerSprite17Height = 20;

    private Image whitePlayerSprite18;
    private int whitePlayerSprite18PositionX = 98;
    private int whitePlayerSprite18PositionY = 26;
    private int whitePlayerSprite18Width = 19;
    private int whitePlayerSprite18Height = 20;

    private Image whitePlayerSprite19;
    private int whitePlayerSprite19PositionX = 120;
    private int whitePlayerSprite19PositionY = 26;
    private int whitePlayerSprite19Width = 19;
    private int whitePlayerSprite19Height = 20;

    private Image whitePlayerSprite20;
    private int whitePlayerSprite20PositionX = 145;
    private int whitePlayerSprite20PositionY = 26;
    private int whitePlayerSprite20Width = 21;
    private int whitePlayerSprite20Height = 20;


    private Image bluePlayerSprite1;
    private int bluePlayerSprite1PositionX = 196;
    private int bluePlayerSprite1PositionY = 292;
    private int bluePlayerSprite1Width = 17;
    private int bluePlayerSprite1Height = 22;

    private Image bluePlayerSprite2;
    private int bluePlayerSprite2PositionX = 220;
    private int bluePlayerSprite2PositionY = 292;
    private int bluePlayerSprite2Width = 17;
    private int bluePlayerSprite2Height = 22;

    private Image bluePlayerSprite3;
    private int bluePlayerSprite3PositionX = 242;
    private int bluePlayerSprite3PositionY = 292;
    private int bluePlayerSprite3Width = 17;
    private int bluePlayerSprite3Height = 22;

    private Image bluePlayerSprite4;
    private int bluePlayerSprite4PositionX = 265;
    private int bluePlayerSprite4PositionY = 292;
    private int bluePlayerSprite4Width = 18;
    private int bluePlayerSprite4Height = 22;

    private Image bluePlayerSprite5;
    private int bluePlayerSprite5PositionX = 292;
    private int bluePlayerSprite5PositionY = 293;
    private int bluePlayerSprite5Width = 17;
    private int bluePlayerSprite5Height = 22;

    private Image bluePlayerSprite6;
    private int bluePlayerSprite6PositionX = 2;
    private int bluePlayerSprite6PositionY = 317;
    private int bluePlayerSprite6Width = 18;
    private int bluePlayerSprite6Height = 22;

    private Image bluePlayerSprite7;
    private int bluePlayerSprite7PositionX = 26;
    private int bluePlayerSprite7PositionY = 316;
    private int bluePlayerSprite7Width = 18;
    private int bluePlayerSprite7Height = 22;

    private Image bluePlayerSprite8;
    private int bluePlayerSprite8PositionX = 50;
    private int bluePlayerSprite8PositionY = 316;
    private int bluePlayerSprite8Width = 18;
    private int bluePlayerSprite8Height = 22;

    private Image bluePlayerSprite9;
    private int bluePlayerSprite9PositionX = 74;
    private int bluePlayerSprite9PositionY = 316;
    private int bluePlayerSprite9Width = 16;
    private int bluePlayerSprite9Height = 22;

    private Image bluePlayerSprite10;
    private int bluePlayerSprite10PositionX = 99;
    private int bluePlayerSprite10PositionY = 316;
    private int bluePlayerSprite10Width = 17;
    private int bluePlayerSprite10Height = 22;

    private Image bluePlayerSprite11;
    private int bluePlayerSprite11PositionX = 122;
    private int bluePlayerSprite11PositionY = 316;
    private int bluePlayerSprite11Width = 17;
    private int bluePlayerSprite11Height = 22;

    private Image bluePlayerSprite12;
    private int bluePlayerSprite12PositionX = 148;
    private int bluePlayerSprite12PositionY = 316;
    private int bluePlayerSprite12Width = 17;
    private int bluePlayerSprite12Height = 22;

    private Image bluePlayerSprite13;
    private int bluePlayerSprite13PositionX = 170;
    private int bluePlayerSprite13PositionY = 316;
    private int bluePlayerSprite13Width = 18;
    private int bluePlayerSprite13Height = 22;

    private Image bluePlayerSprite14;
    private int bluePlayerSprite14PositionX = 194;
    private int bluePlayerSprite14PositionY = 314;
    private int bluePlayerSprite14Width = 21;
    private int bluePlayerSprite14Height = 22;


    private Image bluePlayerSprite15;
    private int bluePlayerSprite15PositionX = 218;
    private int bluePlayerSprite15PositionY = 314;
    private int bluePlayerSprite15Width = 21;
    private int bluePlayerSprite15Height = 22;

    private Image bluePlayerSprite16;
    private int bluePlayerSprite16PositionX = 242;
    private int bluePlayerSprite16PositionY = 314;
    private int bluePlayerSprite16Width = 21;
    private int bluePlayerSprite16Height = 22;

    private Image bluePlayerSprite17;
    private int bluePlayerSprite17PositionX = 266;
    private int bluePlayerSprite17PositionY = 318;
    private int bluePlayerSprite17Width = 19;
    private int bluePlayerSprite17Height = 20;

    private Image bluePlayerSprite18;
    private int bluePlayerSprite18PositionX = 290;
    private int bluePlayerSprite18PositionY = 318;
    private int bluePlayerSprite18Width = 19;
    private int bluePlayerSprite18Height = 20;

    private Image bluePlayerSprite19;
    private int bluePlayerSprite19PositionX = 266;
    private int bluePlayerSprite19PositionY = 344;
    private int bluePlayerSprite19Width = 21;
    private int bluePlayerSprite19Height = 19;

    private Image bluePlayerSprite20;
    private int bluePlayerSprite20PositionX = 290;
    private int bluePlayerSprite20PositionY = 344;
    private int bluePlayerSprite20Width = 21;
    private int bluePlayerSprite20Height = 20;

    private Image greenPlayerSprite1;
    private int greenPlayerSprite1PositionX = 171;
    private int greenPlayerSprite1PositionY = 220;
    private int greenPlayerSprite1Width = 17;
    private int greenPlayerSprite1Height = 22;

    private Image greenPlayerSprite2;
    private int greenPlayerSprite2PositionX = 196;
    private int greenPlayerSprite2PositionY = 220;
    private int greenPlayerSprite2Width = 17;
    private int greenPlayerSprite2Height = 22;

    private Image greenPlayerSprite3;
    private int greenPlayerSprite3PositionX = 218;
    private int greenPlayerSprite3PositionY = 220;
    private int greenPlayerSprite3Width = 17;
    private int greenPlayerSprite3Height = 22;

    private Image greenPlayerSprite4;
    private int greenPlayerSprite4PositionX = 241;
    private int greenPlayerSprite4PositionY = 220;
    private int greenPlayerSprite4Width = 17;
    private int greenPlayerSprite4Height = 22;

    private Image greenPlayerSprite5;
    private int greenPlayerSprite5PositionX = 267;
    private int greenPlayerSprite5PositionY = 220;
    private int greenPlayerSprite5Width = 17;
    private int greenPlayerSprite5Height = 22;

    private Image greenPlayerSprite6;
    private int greenPlayerSprite6PositionX = 290;
    private int greenPlayerSprite6PositionY = 220;
    private int greenPlayerSprite6Width = 17;
    private int greenPlayerSprite6Height = 22;

    private Image greenPlayerSprite7;
    private int greenPlayerSprite7PositionX = 2;
    private int greenPlayerSprite7PositionY = 244;
    private int greenPlayerSprite7Width = 17;
    private int greenPlayerSprite7Height = 22;

    private Image greenPlayerSprite8;
    private int greenPlayerSprite8PositionX = 26;
    private int greenPlayerSprite8PositionY = 244;
    private int greenPlayerSprite8Width = 17;
    private int greenPlayerSprite8Height = 22;

    private Image greenPlayerSprite9;
    private int greenPlayerSprite9PositionX = 49;
    private int greenPlayerSprite9PositionY = 244;
    private int greenPlayerSprite9Width = 17;
    private int greenPlayerSprite9Height = 22;

    private Image greenPlayerSprite10;
    private int greenPlayerSprite10PositionX = 75;
    private int greenPlayerSprite10PositionY = 244;
    private int greenPlayerSprite10Width = 17;
    private int greenPlayerSprite10Height = 22;

    private Image greenPlayerSprite11;
    private int greenPlayerSprite11PositionX = 98;
    private int greenPlayerSprite11PositionY = 244;
    private int greenPlayerSprite11Width = 17;
    private int greenPlayerSprite11Height = 22;

    private Image greenPlayerSprite12;
    private int greenPlayerSprite12PositionX = 123;
    private int greenPlayerSprite12PositionY = 244;
    private int greenPlayerSprite12Width = 17;
    private int greenPlayerSprite12Height = 22;

    private Image greenPlayerSprite13;
    private int greenPlayerSprite13PositionX = 146;
    private int greenPlayerSprite13PositionY = 244;
    private int greenPlayerSprite13Width = 21;
    private int greenPlayerSprite13Height = 20;

    private Image greenPlayerSprite14;
    private int greenPlayerSprite14PositionX = 168;
    private int greenPlayerSprite14PositionY = 244;
    private int greenPlayerSprite14Width = 21;
    private int greenPlayerSprite14Height = 20;

    private Image greenPlayerSprite15;
    private int greenPlayerSprite15PositionX = 193;
    private int greenPlayerSprite15PositionY = 244;
    private int greenPlayerSprite15Width = 21;
    private int greenPlayerSprite15Height = 20;

    private Image greenPlayerSprite16;
    private int greenPlayerSprite16PositionX = 217;
    private int greenPlayerSprite16PositionY = 244;
    private int greenPlayerSprite16Width = 21;
    private int greenPlayerSprite16Height = 20;

    private Image greenPlayerSprite17;
    private int greenPlayerSprite17PositionX = 242;
    private int greenPlayerSprite17PositionY = 244;
    private int greenPlayerSprite17Width = 21;
    private int greenPlayerSprite17Height = 20;

    private Image greenPlayerSprite18;
    private int greenPlayerSprite18PositionX = 265;
    private int greenPlayerSprite18PositionY = 244;
    private int greenPlayerSprite18Width = 21;
    private int greenPlayerSprite18Height = 20;

    private Image greenPlayerSprite19;
    private int greenPlayerSprite19PositionX = 289;
    private int greenPlayerSprite19PositionY = 244;
    private int greenPlayerSprite19Width = 21;
    private int greenPlayerSprite19Height = 20;

    private Image greenPlayerSprite20;
    private int greenPlayerSprite20PositionX = 1;
    private int greenPlayerSprite20PositionY = 269;
    private int greenPlayerSprite20Width = 21;
    private int greenPlayerSprite20Height = 20;

    private Image yellowPlayerSprite1;
    private int yellowPlayerSprite1PositionX = 771;
    private int yellowPlayerSprite1PositionY = 406;
    private int yellowPlayerSprite1Width = 15;
    private int yellowPlayerSprite1Height = 21;

    private Image yellowPlayerSprite2;
    private int yellowPlayerSprite2PositionX = 787;
    private int yellowPlayerSprite2PositionY = 406;
    private int yellowPlayerSprite2Width = 16;
    private int yellowPlayerSprite2Height = 21;

    private Image yellowPlayerSprite3;
    private int yellowPlayerSprite3PositionX = 804;
    private int yellowPlayerSprite3PositionY = 406;
    private int yellowPlayerSprite3Width = 15;
    private int yellowPlayerSprite3Height = 21;

    private Image yellowPlayerSprite4;
    private int yellowPlayerSprite4PositionX = 819;
    private int yellowPlayerSprite4PositionY = 406;
    private int yellowPlayerSprite4Width = 16;
    private int yellowPlayerSprite4Height = 21;

    private Image yellowPlayerSprite5;
    private int yellowPlayerSprite5PositionX = 835;
    private int yellowPlayerSprite5PositionY = 406;
    private int yellowPlayerSprite5Width = 16;
    private int yellowPlayerSprite5Height = 21;

    private Image yellowPlayerSprite6;
    private int yellowPlayerSprite6PositionX = 851;
    private int yellowPlayerSprite6PositionY = 405;
    private int yellowPlayerSprite6Width = 16;
    private int yellowPlayerSprite6Height = 22;

    private Image yellowPlayerSprite7;
    private int yellowPlayerSprite7PositionX = 868;
    private int yellowPlayerSprite7PositionY = 405;
    private int yellowPlayerSprite7Width = 14;
    private int yellowPlayerSprite7Height = 22;

    private Image yellowPlayerSprite8;
    private int yellowPlayerSprite8PositionX = 883;
    private int yellowPlayerSprite8PositionY = 405;
    private int yellowPlayerSprite8Width = 16;
    private int yellowPlayerSprite8Height = 22;

    private Image yellowPlayerSprite9;
    private int yellowPlayerSprite9PositionX = 899;
    private int yellowPlayerSprite9PositionY = 405;
    private int yellowPlayerSprite9Width = 16;
    private int yellowPlayerSprite9Height = 22;

    private Image yellowPlayerSprite10;
    private int yellowPlayerSprite10PositionX = 915;
    private int yellowPlayerSprite10PositionY = 405;
    private int yellowPlayerSprite10Width = 16;
    private int yellowPlayerSprite10Height = 22;

    private Image yellowPlayerSprite11;
    private int yellowPlayerSprite11PositionX = 931;
    private int yellowPlayerSprite11PositionY = 405;
    private int yellowPlayerSprite11Width = 16;
    private int yellowPlayerSprite11Height = 22;

    private Image yellowPlayerSprite12;
    private int yellowPlayerSprite12PositionX = 947;
    private int yellowPlayerSprite12PositionY = 405;
    private int yellowPlayerSprite12Width = 16;
    private int yellowPlayerSprite12Height = 22;

    private Image yellowPlayerSprite13;
    private int yellowPlayerSprite13PositionX = 772;
    private int yellowPlayerSprite13PositionY = 495;
    private int yellowPlayerSprite13Width = 21;
    private int yellowPlayerSprite13Height = 20;

    private Image yellowPlayerSprite14;
    private int yellowPlayerSprite14PositionX = 803;
    private int yellowPlayerSprite14PositionY = 495;
    private int yellowPlayerSprite14Width = 21;
    private int yellowPlayerSprite14Height = 20;

    private Image yellowPlayerSprite15;
    private int yellowPlayerSprite15PositionX = 835;
    private int yellowPlayerSprite15PositionY = 495;
    private int yellowPlayerSprite15Width = 21;
    private int yellowPlayerSprite15Height = 20;

    private Image yellowPlayerSprite16;
    private int yellowPlayerSprite16PositionX = 867;
    private int yellowPlayerSprite16PositionY = 495;
    private int yellowPlayerSprite16Width = 21;
    private int yellowPlayerSprite16Height = 20;

    private Image yellowPlayerSprite17;
    private int yellowPlayerSprite17PositionX = 900;
    private int yellowPlayerSprite17PositionY = 495;
    private int yellowPlayerSprite17Width = 21;
    private int yellowPlayerSprite17Height = 20;

    private Image yellowPlayerSprite18;
    private int yellowPlayerSprite18PositionX = 932;
    private int yellowPlayerSprite18PositionY = 495;
    private int yellowPlayerSprite18Width = 21;
    private int yellowPlayerSprite18Height = 20;

    private Image yellowPlayerSprite19;
    private int yellowPlayerSprite19PositionX = 643;
    private int yellowPlayerSprite19PositionY = 520;
    private int yellowPlayerSprite19Width = 21;
    private int yellowPlayerSprite19Height = 20;

    private Image yellowPlayerSprite20;
    private int yellowPlayerSprite20PositionX = 675;
    private int yellowPlayerSprite20PositionY = 520;
    private int yellowPlayerSprite20Width = 21;
    private int yellowPlayerSprite20Height = 20;

    private Image flameEndUpSprite1;
    private int flameEndUpSprite1PositionX = 326;
    private int flameEndUpSprite1PositionY = 16;
    private int flameEndUpSprite1Width = 16;
    private int flameEndUpSprite1Height = 16;

    private Image flameEndUpSprite2;
    private int flameEndUpSprite2PositionX = 342;
    private int flameEndUpSprite2PositionY = 16;
    private int flameEndUpSprite2Width = 16;
    private int flameEndUpSprite2Height = 16;

    private Image flameEndUpSprite3;
    private int flameEndUpSprite3PositionX = 358;
    private int flameEndUpSprite3PositionY = 16;
    private int flameEndUpSprite3Width = 16;
    private int flameEndUpSprite3Height = 16;

    private Image flameEndUpSprite4;
    private int flameEndUpSprite4PositionX = 374;
    private int flameEndUpSprite4PositionY = 16;
    private int flameEndUpSprite4Width = 16;
    private int flameEndUpSprite4Height = 16;

    private Image flameEndRightSprite1;
    private int flameEndRightSprite1PositionX = 390;
    private int flameEndRightSprite1PositionY = 16;
    private int flameEndRightSprite1Width = 16;
    private int flameEndRightSprite1Height = 16;

    private Image flameEndRightSprite2;
    private int flameEndRightSprite2PositionX = 406;
    private int flameEndRightSprite2PositionY = 16;
    private int flameEndRightSprite2Width = 16;
    private int flameEndRightSprite2Height = 16;

    private Image flameEndRightSprite3;
    private int flameEndRightSprite3PositionX = 422;
    private int flameEndRightSprite3PositionY = 16;
    private int flameEndRightSprite3Width = 16;
    private int flameEndRightSprite3Height = 16;

    private Image flameEndRightSprite4;
    private int flameEndRightSprite4PositionX = 438;
    private int flameEndRightSprite4PositionY = 16;
    private int flameEndRightSprite4Width = 16;
    private int flameEndRightSprite4Height = 16;

    private Image flameEndDownSprite1;
    private int flameEndDownSprite1PositionX = 454;
    private int flameEndDownSprite1PositionY = 16;
    private int flameEndDownSprite1Width = 16;
    private int flameEndDownSprite1Height = 16;

    private Image flameEndDownSprite2;
    private int flameEndDownSprite2PositionX = 470;
    private int flameEndDownSprite2PositionY = 16;
    private int flameEndDownSprite2Width = 16;
    private int flameEndDownSprite2Height = 16;

    private Image flameEndDownSprite3;
    private int flameEndDownSprite3PositionX = 486;
    private int flameEndDownSprite3PositionY = 16;
    private int flameEndDownSprite3Width = 16;
    private int flameEndDownSprite3Height = 16;

    private Image flameEndDownSprite4;
    private int flameEndDownSprite4PositionX = 502;
    private int flameEndDownSprite4PositionY = 16;
    private int flameEndDownSprite4Width = 16;
    private int flameEndDownSprite4Height = 16;

    private Image flameEndLeftSprite1;
    private int flameEndLeftSprite1PositionX = 518;
    private int flameEndLeftSprite1PositionY = 16;
    private int flameEndLeftSprite1Width = 16;
    private int flameEndLeftSprite1Height = 16;

    private Image flameEndLeftSprite2;
    private int flameEndLeftSprite2PositionX = 534;
    private int flameEndLeftSprite2PositionY = 16;
    private int flameEndLeftSprite2Width = 16;
    private int flameEndLeftSprite2Height = 16;

    private Image flameEndLeftSprite3;
    private int flameEndLeftSprite3PositionX = 550;
    private int flameEndLeftSprite3PositionY = 16;
    private int flameEndLeftSprite3Width = 16;
    private int flameEndLeftSprite3Height = 16;

    private Image flameEndLeftSprite4;
    private int flameEndLeftSprite4PositionX = 566;
    private int flameEndLeftSprite4PositionY = 16;
    private int flameEndLeftSprite4Width = 16;
    private int flameEndLeftSprite4Height = 16;

    private Image bombPowerUpSprite;
    private int bombPowerUpSpritePositionX = 518;
    private int bombPowerUpSpritePositionY = 0;
    private int bombPowerUpSpriteWidth = 16;
    private int bombPowerUpSpriteHeight = 16;

    private Image speedPowerUpSprite;
    private int speedPowerUpSpritePositionX = 48;
    private int speedPowerUpSpritePositionY = 48;
    private int speedPowerUpSpriteWidth = 16;
    private int speedPowerUpSpriteHeight = 16;

    private Image wallBreakableWaterLevelExplodedSprite2;
    private int wallBreakableWaterLevelSpriteExploded2PositionX = 512;
    private int wallBreakableWaterLevelSpriteExploded2PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded2Width = 16;
    private int wallBreakableWaterLevelSpriteExploded2Height = 16;


    private Image wallBreakableWaterLevelExplodedSprite3;
    private int wallBreakableWaterLevelSpriteExploded3PositionX = 528;
    private int wallBreakableWaterLevelSpriteExploded3PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded3Width = 16;
    private int wallBreakableWaterLevelSpriteExploded3Height = 16;


    private Image wallBreakableWaterLevelExplodedSprite4;
    private int wallBreakableWaterLevelSpriteExploded4PositionX = 544;
    private int wallBreakableWaterLevelSpriteExploded4PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded4Width = 16;
    private int wallBreakableWaterLevelSpriteExploded4Height = 16;

    private Image wallBreakableWaterLevelExplodedSprite5;
    private int wallBreakableWaterLevelSpriteExploded5PositionX = 560;
    private int wallBreakableWaterLevelSpriteExploded5PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded5Width = 16;
    private int wallBreakableWaterLevelSpriteExploded5Height = 16;

    private Image wallBreakableWaterLevelExplodedSprite6;
    private int wallBreakableWaterLevelSpriteExploded6PositionX = 576;
    private int wallBreakableWaterLevelSpriteExploded6PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded6Width = 16;
    private int wallBreakableWaterLevelSpriteExploded6Height = 16;


    private Image wallBreakableWaterLevelExplodedSprite7;
    private int wallBreakableWaterLevelSpriteExploded7PositionX = 592;
    private int wallBreakableWaterLevelSpriteExploded7PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded7Width = 16;
    private int wallBreakableWaterLevelSpriteExploded7Height = 16;


    public Image getBombPowerUpSprite2() {
        return this.bombPowerUpSprite2;
    }

    private Image bombPowerUpSprite2;
    private int bombPowerUpSprite2PositionX = 16;
    private int bombPowerUpSprite2PositionY = 48;
    private int bombPowerUpSprite2Width = 16;
    private int bombPowerUpSprite2Height = 16;

    private Image flamePowerUpSprite;
    private int flamePowerUpSpritePositionX = 534;
    private int flamePowerUpSpritePositionY = 0;
    private int flamePowerUpSpriteWidth = 16;
    private int flamePowerUpSpriteHeight = 16;

    private Image flamePowerUpSprite2;
    private int flamePowerUpSprite2PositionX = 0;
    private int flamePowerUpSprite2PositionY = 48;
    private int flamePowerUpSprite2Width = 16;
    private int flamePowerUpSprite2Height = 16;

    private Image verticalFlameSprite1;
    private int verticalFlameSprite1PositionX = 582;
    private int verticalFlameSprite1PositionY = 16;
    private int verticalFlameSprite1Width = 16;
    private int verticalFlameSprite1Height = 16;

    private Image verticalFlameSprite2;
    private int verticalFlameSprite2PositionX = 598;
    private int verticalFlameSprite2PositionY = 16;
    private int verticalFlameSprite2Width = 16;
    private int verticalFlameSprite2Height = 16;

    private Image verticalFlameSprite3;
    private int verticalFlameSprite3PositionX = 614;
    private int verticalFlameSprite3PositionY = 16;
    private int verticalFlameSprite3Width = 16;
    private int verticalFlameSprite3Height = 16;

    private Image verticalFlameSprite4;
    private int verticalFlameSprite4PositionX = 630;
    private int verticalFlameSprite4PositionY = 16;
    private int verticalFlameSprite4Width = 16;
    private int verticalFlameSprite4Height = 16;

    public Image getGroundBlueSprite() {
        return this.groundBlueSprite;
    }

    private Image groundBlueSprite;
    private int groundBlueSprite4PositionX = 689;
    private int groundBlueSprite4PositionY = 44;
    private int groundBlueSprite4Width = 16;
    private int groundBlueSprite4Height = 16;

    public Image getGroundWaterSprite1() {
        return this.groundWaterSprite1;
    }

    private Image groundWaterSprite1;
    private int groundWaterSprite1PositionX = 368;
    private int groundWaterSprite1PositionY = 176;
    private int groundWaterSprite1Width = 16;
    private int groundWaterSprite1Height = 16;

    public Image getWhitePlayerSprite11() {
        return this.whitePlayerSprite11;
    }

    public Image getWhitePlayerSprite12() {
        return this.whitePlayerSprite12;
    }

    public Image getWhitePlayerSprite13() {
        return this.whitePlayerSprite13;
    }

    public Image getFlameEndUpSprite1() {
        return this.flameEndUpSprite1;
    }

    public Image getFlameEndUpSprite2() {
        return this.flameEndUpSprite2;
    }

    public Image getFlameEndUpSprite3() {
        return this.flameEndUpSprite3;
    }

    public Image getFlameEndUpSprite4() {
        return this.flameEndUpSprite4;
    }

    public Image getFlameEndRightSprite1() {
        return this.flameEndRightSprite1;
    }

    public Image getFlameEndRightSprite2() {
        return this.flameEndRightSprite2;
    }

    public Image getFlameEndRightSprite3() {
        return this.flameEndRightSprite3;
    }

    public Image getFlameEndRightSprite4() {
        return this.flameEndRightSprite4;
    }

    public Image getFlameEndDownSprite1() {
        return this.flameEndDownSprite1;
    }

    public Image getFlameEndLeftSprite2() {
        return this.flameEndLeftSprite2;
    }

    public Image getFlameEndLeftSprite3() {
        return this.flameEndLeftSprite3;
    }

    public Image getFlameEndLeftSprite4() {
        return this.flameEndLeftSprite4;
    }

    public Image getBombPowerUpSprite() {
        return this.bombPowerUpSprite;
    }

    public Image getFlamePowerUpSprite() {
        return this.flamePowerUpSprite;
    }

    public Image getFlamePowerUpSprite2() {
        return this.flamePowerUpSprite2;
    }

    public Image getVerticalFlameSprite1() {
        return this.verticalFlameSprite1;
    }

    public Image getVerticalFlameSprite2() {
        return this.verticalFlameSprite2;
    }

    public Image getVerticalFlameSprite3() {
        return this.verticalFlameSprite3;
    }

    public Image getVerticalFlameSprite4() {
        return this.verticalFlameSprite4;
    }

    public Image getExplosionFlameSprite1() {
        return this.explosionFlameSprite1;
    }

    public Image getExplosionFlameSprite2() {
        return this.explosionFlameSprite2;
    }

    public Image getExplosionFlameSprite3() {
        return this.explosionFlameSprite3;
    }

    public Image getExplosionFlameSprite5() {
        return this.explosionFlameSprite5;
    }

    public Image getBombSprite1() {
        return this.bombSprite1;
    }

    public Image getBombSprite2() {
        return this.bombSprite2;
    }

    public Image getBombSprite3() {
        return this.bombSprite3;
    }

    public Image getWhitePlayerSpriteOne() {
        return this.whitePlayerSpriteOne;
    }

    public Image getWhitePlayerSprite2() {
        return this.whitePlayerSprite2;
    }

    public Image getWhitePlayerSprite3() {
        return this.whitePlayerSprite3;
    }

    public Image getWhitePlayerSprite4() {
        return this.whitePlayerSprite4;
    }

    public Image getWhitePlayerSprite5() {
        return this.whitePlayerSprite5;
    }

    public Image getWhitePlayerSprite6() {
        return this.whitePlayerSprite6;
    }

    public Image getWhitePlayerSprite7() {
        return this.whitePlayerSprite7;
    }

    public Image getWhitePlayerSprite8() {
        return this.whitePlayerSprite8;
    }

    public Image getWhitePlayerSprite9() {
        return this.whitePlayerSprite9;
    }

    public Image getWhitePlayerSprite14() {
        return this.whitePlayerSprite14;
    }

    public Image getWhitePlayerSprite15() {
        return this.whitePlayerSprite15;
    }

    public Image getWhitePlayerSprite16() {
        return this.whitePlayerSprite16;
    }

    public Image getWhitePlayerSprite17() {
        return this.whitePlayerSprite17;
    }

    public Image getClassicGroundSprite() {
        return this.classicGroundSprite;
    }

    public Image getWallBlockSprite() {
        return this.wallBlockSprite;
    }

    public Image getGreenPlayerSprite1() {
        return this.greenPlayerSprite1;
    }

    public Image getGreenPlayerSprite2() {
        return this.greenPlayerSprite2;
    }

    public Image getGreenPlayerSprite3() {
        return this.greenPlayerSprite3;
    }

    public Image getGreenPlayerSprite4() {
        return this.greenPlayerSprite4;
    }

    public Image getGreenPlayerSprite5() {
        return this.greenPlayerSprite5;
    }

    public Image getGreenPlayerSprite6() {
        return this.greenPlayerSprite6;
    }

    public Image getGreenPlayerSprite7() {
        return this.greenPlayerSprite7;
    }

    public Image getGreenPlayerSprite8() {
        return this.greenPlayerSprite8;
    }

    public Image getGreenPlayerSprite9() {
        return this.greenPlayerSprite9;
    }

    public Image getGreenPlayerSprite10() {
        return this.greenPlayerSprite10;
    }

    public Image getGreenPlayerSprite11() {
        return this.greenPlayerSprite11;
    }

    public Image getGreenPlayerSprite12() {
        return this.greenPlayerSprite12;
    }

    public Image getGreenPlayerSprite13() {
        return this.greenPlayerSprite13;
    }

    public Image getGreenPlayerSprite14() {
        return this.greenPlayerSprite14;
    }

    public Image getGreenPlayerSprite15() {
        return this.greenPlayerSprite15;
    }

    public Image getGreenPlayerSprite16() {
        return this.greenPlayerSprite16;
    }

    public Image getGreenPlayerSprite17() {
        return this.greenPlayerSprite17;
    }

    public Image getGreenPlayerSprite18() {
        return this.greenPlayerSprite18;
    }

    public Image getGreenPlayerSprite19() {
        return this.greenPlayerSprite19;
    }

    public Image getGreenPlayerSprite20() {
        return this.greenPlayerSprite20;
    }

    public Image getHorizontalFlameSprite1() {
        return this.horizontalFlameSprite1;
    }

    public Image getHorizontalFlameSprite2() {
        return this.horizontalFlameSprite2;
    }

    public Image getHorizontalFlameSprite3() {
        return this.horizontalFlameSprite3;
    }

    public Image getHorizontalFlameSprite4() {
        return this.horizontalFlameSprite4;
    }

    public Image getWhitePlayerSprite18() {
        return this.whitePlayerSprite18;
    }

    public Image getWhitePlayerSprite19() {
        return this.whitePlayerSprite19;
    }

    public Image getWhitePlayerSprite20() {
        return this.whitePlayerSprite20;
    }

    public Image getBluePlayerSprite1() {
        return this.bluePlayerSprite1;
    }

    public Image getBluePlayerSprite2() {
        return this.bluePlayerSprite2;
    }

    public Image getBluePlayerSprite3() {
        return this.bluePlayerSprite3;
    }

    public Image getBluePlayerSprite4() {
        return this.bluePlayerSprite4;
    }

    public Image getBluePlayerSprite10() {
        return this.bluePlayerSprite10;
    }

    public Image getBluePlayerSprite11() {
        return this.bluePlayerSprite11;
    }

    public Image getBluePlayerSprite12() {
        return this.bluePlayerSprite12;
    }

    public Image getBluePlayerSprite13() {
        return this.bluePlayerSprite13;
    }

    public Image getBluePlayerSprite14() {
        return this.bluePlayerSprite14;
    }

    public Image getBluePlayerSprite15() {
        return this.bluePlayerSprite15;
    }

    public Image getBluePlayerSprite16() {
        return this.bluePlayerSprite16;
    }

    public Image getBluePlayerSprite17() {
        return this.bluePlayerSprite17;
    }

    public Image getBluePlayerSprite18() {
        return this.bluePlayerSprite18;
    }

    public Image getBluePlayerSprite19() {
        return this.bluePlayerSprite19;
    }

    public Image getBluePlayerSprite20() {
        return this.bluePlayerSprite20;
    }

    public Image getYellowPlayerSprite1() {
        return this.yellowPlayerSprite1;
    }

    public Image getYellowPlayerSprite2() {
        return this.yellowPlayerSprite2;
    }

    public Image getYellowPlayerSprite3() {
        return this.yellowPlayerSprite3;
    }

    public Image getYellowPlayerSprite4() {
        return this.yellowPlayerSprite4;
    }

    public Image getYellowPlayerSprite5() {
        return this.yellowPlayerSprite5;
    }

    public Image getYellowPlayerSprite6() {
        return this.yellowPlayerSprite6;
    }

    public Image getYellowPlayerSprite7() {
        return this.yellowPlayerSprite7;
    }

    public Image getYellowPlayerSprite8() {
        return this.yellowPlayerSprite8;
    }

    public Image getYellowPlayerSprite9() {
        return this.yellowPlayerSprite9;
    }

    public Image getYellowPlayerSprite10() {
        return this.yellowPlayerSprite10;
    }

    public Image getYellowPlayerSprite11() {
        return this.yellowPlayerSprite11;
    }

    public Image getYellowPlayerSprite12() {
        return this.yellowPlayerSprite12;
    }

    public Image getYellowPlayerSprite13() {
        return this.yellowPlayerSprite13;
    }

    public Image getYellowPlayerSprite14() {
        return this.yellowPlayerSprite14;
    }

    public Image getYellowPlayerSprite15() {
        return this.yellowPlayerSprite15;
    }

    public Image getYellowPlayerSprite16() {
        return this.yellowPlayerSprite16;
    }

    public Image getYellowPlayerSprite17() {
        return this.yellowPlayerSprite17;
    }

    public Image getYellowPlayerSprite18() {
        return this.yellowPlayerSprite18;
    }

    public Image getYellowPlayerSprite19() {
        return this.yellowPlayerSprite19;
    }

    public Image getYellowPlayerSprite20() {
        return this.yellowPlayerSprite20;
    }

    private Image explosionFlameSprite1;
    private int explosionFlameSprite1PositionX = 390;
    private int explosionFlameSprite1PositionY = 32;
    private int explosionFlameSprite1Width = 16;
    private int explosionFlameSprite1Height = 16;

    private Image explosionFlameSprite2;
    private int explosionFlameSprite2PositionX = 406;
    private int explosionFlameSprite2PositionY = 32;
    private int explosionFlameSprite2Width = 16;
    private int explosionFlameSprite2Height = 16;

    private Image explosionFlameSprite3;
    private int explosionFlameSprite3PositionX = 422;
    private int explosionFlameSprite3PositionY = 32;
    private int explosionFlameSprite3Width = 16;
    private int explosionFlameSprite3Height = 16;

    private Image explosionFlameSprite4;
    private int explosionFlameSprite4PositionX = 439;
    private int explosionFlameSprite4PositionY = 32;
    private int explosionFlameSprite4Width = 16;
    private int explosionFlameSprite4Height = 16;

    private Image explosionFlameSprite5;
    private int explosionFlameSprite5PositionX =  454;
    private int explosionFlameSprite5PositionY = 32;
    private int explosionFlameSprite5Width = 16;
    private int explosionFlameSprite5Height = 16;

    private Image horizontalFlameSprite1;
    private int horizontalFlameSprite1PositionX = 326;
    private int horizontalFlameSprite1PositionY = 32;
    private int horizontalFlameSprite1Width = 16;
    private int horizontalFlameSprite1Height = 16;

    private Image horizontalFlameSprite2;
    private int horizontalFlameSprite2PositionX = 342;
    private int horizontalFlameSprite2PositionY = 32;
    private int horizontalFlameSprite2Width = 16;
    private int horizontalFlameSprite2Height = 16;

    private Image horizontalFlameSprite3;
    private int horizontalFlameSprite3PositionX = 358;
    private int horizontalFlameSprite3PositionY = 32;
    private int horizontalFlameSprite3Width = 16;
    private int horizontalFlameSprite3Height = 16;

    private Image horizontalFlameSprite4;
    private int horizontalFlameSprite4PositionX = 374;
    private int horizontalFlameSprite4PositionY = 32;
    private int horizontalFlameSprite4Width = 16;
    private int horizontalFlameSprite4Height = 16;

    private Image bombSprite1;
    private int bombSprite1PositionX = 470;
    private int bombSprite1PositionY = 0;
    private int bombSprite1Width = 16;
    private int bombSprite1Height = 16;

    private Image bombSprite2;
    private int bombSprite2PositionX = 486;
    private int bombSprite2PositionY = 0;
    private int bombSprite2Width = 16;
    private int bombSprite2Height = 16;

    private Image bombSprite3;
    private int bombSprite3PositionX = 502;
    private int bombSprite3PositionY = 0;
    private int bombSprite3Width = 16;
    private int bombSprite3Height = 16;

    public Image getArenaUpperLeftCornerSprite() {
        return this.arenaUpperLeftCornerSprite;
    }

    private Image arenaUpperLeftCornerSprite;
    private int arenaUpperLeftCornerSpritePositionX = 431;
    private int arenaUpperLeftCornerSpritePositionY = 110;
    private int arenaUpperLeftCornerSpriteWidth = 16;
    private int arenaUpperLeftCornerSpriteHeight = 16;


    public Image getArenaUpperWallSprite() {
        return this.arenaUpperWallSprite;
    }

    public Image getArenaLeftWallSprite() {
        return this.arenaLeftWallSprite;
    }

    public Image getArenaDownLeftCornerSprite() {
        return this.arenaDownLeftCornerSprite;
    }

    public Image getArenaDownRightCornerSprite() {
        return this.arenaDownRightCornerSprite;
    }

    public Image getArenaDownWallSprite() {
        return this.arenaDownWallSprite;
    }

    public Image getArenaRightWallSprite() {
        return this.arenaRightWallSprite;
    }

    private Image arenaUpperWallSprite;
    private int arenaUpperWallSpritePositionX = 456;
    private int arenaUpperWallSpritePositionY = 110;
    private int arenaUpperWallSpriteWidth = 16;
    private int arenaUpperWallSpriteHeight = 16;

    private Image arenaLeftWallSprite;
    private int arenaLeftWallSpritePositionX = 623;
    private int arenaLeftWallSpritePositionY = 110;
    private int arenaLeftWallSpriteWidth = 16;
    private int arenaLeftWallSpriteHeight = 16;

    private Image arenaDownLeftCornerSprite;
    private int arenaDownLeftCornerSpritePositionX = 543;
    private int arenaDownLeftCornerSpritePositionY = 110;
    private int arenaDownLeftCornerSpriteWidth = 16;
    private int arenaDownLeftCornerSpriteHeight = 16;


    private Image arenaDownRightCornerSprite;
    private int arenaDownRightCornerSpritePositionX = 599;
    private int arenaDownRightCornerSpritePositionY = 110;
    private int arenaDownRightCornerSpriteWidth = 16;
    private int arenaDownRightCornerSpriteHeight = 16;

    private Image arenaDownWallSprite;
    private int arenaDownWallSpritePositionX = 572;
    private int arenaDownWallSpritePositionY = 110;
    private int arenaDownWallSpriteWidth = 16;
    private int arenaDownWallSpriteHeight = 16;


    private Image arenaRightWallSprite;
    private int arenaRightWallSpritePositionX = 495;
    private int arenaRightWallSpritePositionY = 110;
    private int arenaRightWallSpriteWidth = 16;
    private int arenaRightWallSpriteHeight = 16;

    public Image getArenaUpperRightCornerSprite() {
        return this.arenaUpperRightCornerSprite;
    }

    private Image arenaUpperRightCornerSprite;
    private int arenaUpperRightCornerSpritePositionX = 479;
    private int arenaUpperRightCornerSpritePositionY = 110;
    private int arenaUpperRightCornerSpriteWidth = 16;
    private int arenaUpperRightCornerSpriteHeight = 16;


    private Image wallBreakableWaterLevelSprite;
    private int wallBreakableWaterLevelSpritePositionX = 399;
    private int wallBreakableWaterLevelSpritePositionY = 176;
    private int wallBreakableWaterLevelSpriteWidth = 16;
    private int wallBreakableWaterLevelSpriteHeight = 16;

    private Image playerStandingInWaterSprite1;
    private int playerStandingInWaterSprite1PositionX = 362;
    private int playerStandingInWaterSprite1PositionY = 383;
    private int playerStandingInWaterSprite1Width = 16;
    private int playerStandingInWaterSprite1Height = 5;

    private Image playerStandingInWaterSprite2;
    private int playerStandingInWaterSprite2PositionX = 378;
    private int playerStandingInWaterSprite2PositionY = 383;
    private int playerStandingInWaterSprite2Width = 16;
    private int playerStandingInWaterSprite2Height = 5;


    private Image playerRunningInWaterSprite1;
    private int playerRunningInWaterSprite1PositionX = 315;
    private int playerRunningInWaterSprite1PositionY = 385;
    private int playerRunningInWaterSprite1Width = 16;
    private int playerRunningInWaterSprite1Height = 8;


    private Image playerRunningInWaterSprite2;
    private int playerRunningInWaterSprite2PositionX = 331;
    private int playerRunningInWaterSprite2PositionY = 176;
    private int playerRunningInWaterSprite2Width = 16;
    private int playerRunningInWaterSprite2Height = 8;


    private Image playerRunningInWaterSprite3;
    private int playerRunningInWaterSprite3PositionX = 347;
    private int playerRunningInWaterSprite3PositionY = 176;
    private int playerRunningInWaterSprite3Width = 16;
    private int playerRunningInWaterSprite3Height = 8;

    public Image getWallBreakableWaterLevelSprite() {
        return this.wallBreakableWaterLevelSprite;
    }

    public Image getWallBreakableWaterLevelExplodedSprite1() {
        return this.wallBreakableWaterLevelExplodedSprite1;
    }

    public Image getWallBreakableWaterLevelExplodedSprite2() {
        return this.wallBreakableWaterLevelExplodedSprite2;
    }

    public Image getWallBreakableWaterLevelExplodedSprite3() {
        return this.wallBreakableWaterLevelExplodedSprite3;
    }

    public Image getWallBreakableWaterLevelExplodedSprite4() {
        return this.wallBreakableWaterLevelExplodedSprite4;
    }

    public Image getWallBreakableWaterLevelExplodedSprite5() {
        return this.wallBreakableWaterLevelExplodedSprite5;
    }

    public Image getWallBreakableWaterLevelExplodedSprite6() {
        return this.wallBreakableWaterLevelExplodedSprite6;
    }

    public Image getWallBreakableWaterLevelExplodedSprite7() {
        return this.wallBreakableWaterLevelExplodedSprite7;
    }

    private Image wallBreakableWaterLevelExplodedSprite1;
    private int wallBreakableWaterLevelSpriteExploded1PositionX = 496;
    private int wallBreakableWaterLevelSpriteExploded1PositionY = 192;
    private int wallBreakableWaterLevelSpriteExploded1Width = 16;
    private int wallBreakableWaterLevelSpriteExploded1Height = 16;

    public Image getSpeedPowerUpSprite() {
        return this.speedPowerUpSprite;
    }


    public Image getWaterLevelWallSprite() {
        return this.waterLevelWallSprite;
    }

    private Image waterLevelWallSprite;
    private int waterLevelWallSpritePositionX = 415;
    private int waterLevelWallSpritePositionY = 176;
    private int waterLevelWallSpriteWidth = 16;
    private int waterLevelWallSpriteHeight = 16;


    public Image getPlayerStandingInWaterSprite1() {
        return this.playerStandingInWaterSprite1;
    }

    public Image getPlayerRunningInWaterSprite1() {
        return this.playerRunningInWaterSprite1;
    }

    public Image getPlayerRunningInWaterSprite2() {
        return this.playerRunningInWaterSprite2;
    }

    public Image getPlayerRunningInWaterSprite3() {
        return this.playerRunningInWaterSprite3;
    }


    public Image getWallBreakableClassicLevelSprite() {
        return this.wallBreakableClassicLevelSprite;
    }

    public Image getWallBreakableClassicLevelExplodedSprite1() {
        return this.wallBreakableClassicLevelExplodedSprite1;
    }

    public Image getWallBreakableClassicLevelExplodedSprite2() {
        return this.wallBreakableClassicLevelExplodedSprite2;
    }

    public Image getWallBreakableClassicLevelExplodedSprite3() {
        return this.wallBreakableClassicLevelExplodedSprite3;
    }

    public Image getWallBreakableClassicLevelExplodedSprite4() {
        return this.wallBreakableClassicLevelExplodedSprite4;
    }

    public Image getWallBreakableClassicLevelExplodedSprite5() {
        return this.wallBreakableClassicLevelExplodedSprite5;
    }

    public Image getWallBreakableClassicLevelExplodedSprite6() {
        return this.wallBreakableClassicLevelExplodedSprite6;
    }

    public Image getWallBreakableClassicLevelExplodedSprite7() {
        return this.wallBreakableClassicLevelExplodedSprite7;
    }

    private Image wallBreakableClassicLevelSprite;
    private int wallBreakableClassicLevelSprite1PositionX = 399;
    private int wallBreakableClassicLevelSprite1PositionY = 110;
    private int wallBreakableClassicLevelSprite1Width = 16;
    private int wallBreakableClassicLevelSprite1Height = 16;


    private Image wallBreakableClassicLevelExplodedSprite1;
    private int wallBreakableClassicLevelExplodedSprite1PositionX = 496;
    private int wallBreakableClassicLevelExplodedSprite1PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite1Width = 16;
    private int wallBreakableClassicLevelExplodedSprite1Height = 16;

    private Image wallBreakableClassicLevelExplodedSprite2;
    private int wallBreakableClassicLevelExplodedSprite2PositionX = 512;
    private int wallBreakableClassicLevelExplodedSprite2PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite2Width = 16;
    private int wallBreakableClassicLevelExplodedSprite2Height = 16;

    private Image wallBreakableClassicLevelExplodedSprite3;
    private int wallBreakableClassicLevelExplodedSprite3PositionX = 528;
    private int wallBreakableClassicLevelExplodedSprite3PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite3Width = 16;
    private int wallBreakableClassicLevelExplodedSprite3Height = 16;


    private Image wallBreakableClassicLevelExplodedSprite4;
    private int wallBreakableClassicLevelExplodedSprite4PositionX = 544;
    private int wallBreakableClassicLevelExplodedSprite4PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite4Width = 16;
    private int wallBreakableClassicLevelExplodedSprite4Height = 16;


    private Image wallBreakableClassicLevelExplodedSprite5;
    private int wallBreakableClassicLevelExplodedSprite5PositionX = 560;
    private int wallBreakableClassicLevelExplodedSprite5PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite5Width = 16;
    private int wallBreakableClassicLevelExplodedSprite5Height = 16;

    private Image wallBreakableClassicLevelExplodedSprite6;
    private int wallBreakableClassicLevelExplodedSprite6PositionX = 576;
    private int wallBreakableClassicLevelExplodedSprite6PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite6Width = 16;
    private int wallBreakableClassicLevelExplodedSprite6Height = 16;

    private Image wallBreakableClassicLevelExplodedSprite7;
    private int wallBreakableClassicLevelExplodedSprite7PositionX = 592;
    private int wallBreakableClassicLevelExplodedSprite7PositionY = 126;
    private int wallBreakableClassicLevelExplodedSprite7Width = 16;
    private int wallBreakableClassicLevelExplodedSprite7Height = 16;

    private PixelReader pixelReader;
    private Image baseImage;

    public Sprites() {

        try {
            this.baseImage = new Image(getClass().getClassLoader().getResource("bomberman/sprites.png").toString(), false);
        } catch (Exception ex) {
            System.out.println("cant fint sprites.png");
        }

        if (this.baseImage == null) {
            return;
        }

        this.pixelReader = this.baseImage.getPixelReader();

        this.classicGroundSprite = new WritableImage(this.pixelReader, this.classicGroundSpritePositionx, this.classicGroundSpritePositionY, this.classicGroundSpriteWidth, this.classicGroundSpriteHeight);
        this.wallBlockSprite = new WritableImage(this.pixelReader, this.spritePositionX2, this.spritePositionY2, this.spriteWidth2, this.spriteHeight2);

        this.bombSprite1 = new WritableImage(this.pixelReader, this.bombSprite1PositionX, this.bombSprite1PositionY, this.bombSprite1Width, this.bombSprite1Height);
        this.bombSprite2 = new WritableImage(this.pixelReader, this.bombSprite2PositionX, this.bombSprite2PositionY, this.bombSprite2Width, this.bombSprite2Height);
        this.bombSprite3 = new WritableImage(this.pixelReader, this.bombSprite3PositionX, this.bombSprite3PositionY, this.bombSprite3Width, this.bombSprite3Height);

        this.bombPowerUpSprite = new WritableImage(this.pixelReader, this.bombPowerUpSpritePositionX, this.bombPowerUpSpritePositionY, this.bombPowerUpSpriteWidth, this.bombPowerUpSpriteHeight);
        this.flamePowerUpSprite = new WritableImage(this.pixelReader, this.flamePowerUpSpritePositionX, this.flamePowerUpSpritePositionY, this.flamePowerUpSpriteWidth, this.flamePowerUpSpriteHeight);
        this.speedPowerUpSprite = new WritableImage(this.pixelReader, this.speedPowerUpSpritePositionX, this.speedPowerUpSpritePositionY, this.speedPowerUpSpriteWidth, this.speedPowerUpSpriteHeight);

        this.flameEndDownSprite1 = new WritableImage(this.pixelReader, this.flameEndDownSprite1PositionX, this.flameEndDownSprite1PositionY, this.flameEndDownSprite1Width, this.flameEndDownSprite1Height);
        this.flameEndDownSprite2 = new WritableImage(this.pixelReader, this.flameEndDownSprite2PositionX, this.flameEndDownSprite2PositionY, this.flameEndDownSprite2Width, this.flameEndDownSprite2Height);
        this.flameEndDownSprite3 = new WritableImage(this.pixelReader, this.flameEndDownSprite3PositionX, this.flameEndDownSprite3PositionY, this.flameEndDownSprite3Width, this.flameEndDownSprite3Height);
        this.flameEndDownSprite4 = new WritableImage(this.pixelReader, this.flameEndDownSprite4PositionX, this.flameEndDownSprite4PositionY, this.flameEndDownSprite4Width, this.flameEndDownSprite4Height);

        this.flameEndUpSprite1 = new WritableImage(this.pixelReader, this.flameEndUpSprite1PositionX, this.flameEndUpSprite1PositionY, this.flameEndUpSprite1Width, this.flameEndUpSprite1Height);
        this.flameEndUpSprite2 = new WritableImage(this.pixelReader, this.flameEndUpSprite2PositionX, this.flameEndUpSprite2PositionY, this.flameEndUpSprite2Width, this.flameEndUpSprite2Height);
        this.flameEndUpSprite3 = new WritableImage(this.pixelReader, this.flameEndUpSprite3PositionX, this.flameEndUpSprite3PositionY, this.flameEndUpSprite3Width, this.flameEndUpSprite3Height);
        this.flameEndUpSprite4 = new WritableImage(this.pixelReader, this.flameEndUpSprite4PositionX, this.flameEndUpSprite4PositionY, this.flameEndUpSprite4Width, this.flameEndUpSprite4Height);


        this.flameEndRightSprite1 = new WritableImage(this.pixelReader, this.flameEndRightSprite1PositionX, this.flameEndRightSprite1PositionY, this.flameEndRightSprite1Width, this.flameEndRightSprite1Height);
        this.flameEndRightSprite2 = new WritableImage(this.pixelReader, this.flameEndRightSprite2PositionX, this.flameEndRightSprite2PositionY, this.flameEndRightSprite2Width, this.flameEndRightSprite2Height);
        this.flameEndRightSprite3 = new WritableImage(this.pixelReader, this.flameEndRightSprite3PositionX, this.flameEndRightSprite3PositionY, this.flameEndRightSprite3Width, this.flameEndRightSprite3Height);
        this.flameEndRightSprite4 = new WritableImage(this.pixelReader, this.flameEndRightSprite4PositionX, this.flameEndRightSprite4PositionY, this.flameEndRightSprite4Width, this.flameEndRightSprite4Height);

        this.flameEndLeftSprite1 = new WritableImage(this.pixelReader, this.flameEndLeftSprite1PositionX, this.flameEndLeftSprite1PositionY, this.flameEndLeftSprite1Width, this.flameEndLeftSprite1Height);
        this.flameEndLeftSprite2 = new WritableImage(this.pixelReader, this.flameEndLeftSprite2PositionX, this.flameEndLeftSprite2PositionY, this.flameEndLeftSprite2Width, this.flameEndLeftSprite2Height);
        this.flameEndLeftSprite3 = new WritableImage(this.pixelReader, this.flameEndLeftSprite3PositionX, this.flameEndLeftSprite3PositionY, this.flameEndLeftSprite3Width, this.flameEndLeftSprite3Height);
        this.flameEndLeftSprite4 = new WritableImage(this.pixelReader, this.flameEndLeftSprite4PositionX, this.flameEndLeftSprite4PositionY, this.flameEndLeftSprite4Width, this.flameEndLeftSprite4Height);
        this.flameEndLeftSprite4 = new WritableImage(this.pixelReader, this.flameEndLeftSprite4PositionX, this.flameEndLeftSprite4PositionY, this.flameEndLeftSprite4Width, this.flameEndLeftSprite4Height);

        this.horizontalFlameSprite1 = new WritableImage(this.pixelReader, this.horizontalFlameSprite1PositionX, this.horizontalFlameSprite1PositionY, this.horizontalFlameSprite1Width, this.horizontalFlameSprite1Height);
        this.horizontalFlameSprite2 = new WritableImage(this.pixelReader, this.horizontalFlameSprite2PositionX, this.horizontalFlameSprite2PositionY, this.horizontalFlameSprite2Width, this.horizontalFlameSprite2Height);
        this.horizontalFlameSprite3 = new WritableImage(this.pixelReader, this.horizontalFlameSprite3PositionX, this.horizontalFlameSprite3PositionY, this.horizontalFlameSprite3Width, this.horizontalFlameSprite3Height);
        this.horizontalFlameSprite4 = new WritableImage(this.pixelReader, this.horizontalFlameSprite4PositionX, this.horizontalFlameSprite4PositionY, this.horizontalFlameSprite4Width, this.horizontalFlameSprite4Height);

        this.verticalFlameSprite1 = new WritableImage(this.pixelReader, this.verticalFlameSprite1PositionX, this.verticalFlameSprite1PositionY, this.verticalFlameSprite1Width, this.verticalFlameSprite1Height);
        this.verticalFlameSprite2 = new WritableImage(this.pixelReader, this.verticalFlameSprite2PositionX, this.verticalFlameSprite2PositionY, this.verticalFlameSprite2Width, this.verticalFlameSprite2Height);
        this.verticalFlameSprite3 = new WritableImage(this.pixelReader, this.verticalFlameSprite3PositionX, this.verticalFlameSprite3PositionY, this.verticalFlameSprite3Width, this.verticalFlameSprite3Height);
        this.verticalFlameSprite4 = new WritableImage(this.pixelReader, this.verticalFlameSprite4PositionX, this.verticalFlameSprite4PositionY, this.verticalFlameSprite4Width, this.verticalFlameSprite4Height);

        this.explosionFlameSprite1 = new WritableImage(this.pixelReader, this.explosionFlameSprite1PositionX, this.explosionFlameSprite1PositionY, this.explosionFlameSprite1Width, this.explosionFlameSprite1Height);
        this.explosionFlameSprite2 = new WritableImage(this.pixelReader, this.explosionFlameSprite2PositionX, this.explosionFlameSprite2PositionY, this.explosionFlameSprite2Width, this.explosionFlameSprite2Height);
        this.explosionFlameSprite3 = new WritableImage(this.pixelReader, this.explosionFlameSprite3PositionX, this.explosionFlameSprite3PositionY, this.explosionFlameSprite3Width, this.explosionFlameSprite3Height);
        this.explosionFlameSprite4 = new WritableImage(this.pixelReader, this.explosionFlameSprite4PositionX, this.explosionFlameSprite4PositionY, this.explosionFlameSprite4Width, this.explosionFlameSprite4Height);
        this.explosionFlameSprite5 = new WritableImage(this.pixelReader, this.explosionFlameSprite5PositionX, this.explosionFlameSprite5PositionY, this.explosionFlameSprite5Width, this.explosionFlameSprite5Height);

        this.whitePlayerSpriteOne = new WritableImage(this.pixelReader, this.whitePlayerSprite1PositionX, this.whitePlayerSprite1PositionY, this.whitePlayerSprite1Width, this.whitePlayerSprite1Height);
        this.whitePlayerSprite2 = new WritableImage(this.pixelReader, this.whitePlayerSprite2PositionX, this.whitePlayerSprite2PositionY, this.whitePlayerSprite2Width, this.whitePlayerSprite2Height);
        this.whitePlayerSprite3 = new WritableImage(this.pixelReader, this.whitePlayerSprite3PositionX, this.whitePlayerSprite3PositionY, this.whitePlayerSprite3Width, this.whitePlayerSprite3Height);
        this.whitePlayerSprite4 = new WritableImage(this.pixelReader, this.whitePlayerSprite4PositionX, this.whitePlayerSprite4PositionY, this.whitePlayerSprite4Width, this.whitePlayerSprite4Height);
        this.whitePlayerSprite5 = new WritableImage(this.pixelReader, this.whitePlayerSprite5PositionX, this.whitePlayerSprite5PositionY, this.whitePlayerSprite5Width, this.whitePlayerSprite5Height);
        this.whitePlayerSprite6 = new WritableImage(this.pixelReader, this.whitePlayerSprite6PositionX, this.whitePlayerSprite6PositionY, this.whitePlayerSprite6Width, this.whitePlayerSprite6Height);
        this.whitePlayerSprite7 = new WritableImage(this.pixelReader, this.whitePlayerSprite7PositionX, this.whitePlayerSprite7PositionY, this.whitePlayerSprite7Width, this.whitePlayerSprite7Height);
        this.whitePlayerSprite8 = new WritableImage(this.pixelReader, this.whitePlayerSprite8PositionX, this.whitePlayerSprite8PositionY, this.whitePlayerSprite8Width, this.whitePlayerSprite8Height);
        this.whitePlayerSprite9 = new WritableImage(this.pixelReader, this.whitePlayerSprite9PositionX, this.whitePlayerSprite9PositionY, this.whitePlayerSprite9Width, this.whitePlayerSprite9Height);
        this.whitePlayerSprite10 = new WritableImage(this.pixelReader, this.whitePlayerSprite10PositionX, this.whitePlayerSprite10PositionY, this.whitePlayerSprite10Width, this.whitePlayerSprite10Height);
        this.whitePlayerSprite11 = new WritableImage(this.pixelReader, this.whitePlayerSprite11PositionX, this.whitePlayerSprite11PositionY, this.whitePlayerSprite11Width, this.whitePlayerSprite11Height);
        this.whitePlayerSprite12 = new WritableImage(this.pixelReader, this.whitePlayerSprite12PositionX, this.whitePlayerSprite12PositionY, this.whitePlayerSprite12Width, this.whitePlayerSprite12Height);
        this.whitePlayerSprite13 = new WritableImage(this.pixelReader, this.whitePlayerSprite13PositionX, this.whitePlayerSprite13PositionY, this.whitePlayerSprite13Width, this.whitePlayerSprite13Height);
        this.whitePlayerSprite14 = new WritableImage(this.pixelReader, this.whitePlayerSprite14PositionX, this.whitePlayerSprite14PositionY, this.whitePlayerSprite14Width, this.whitePlayerSprite14Height);
        this.whitePlayerSprite15 = new WritableImage(this.pixelReader, this.whitePlayerSprite15PositionX, this.whitePlayerSprite15PositionY, this.whitePlayerSprite15Width, this.whitePlayerSprite15Height);
        this.whitePlayerSprite16 = new WritableImage(this.pixelReader, this.whitePlayerSprite16PositionX, this.whitePlayerSprite16PositionY, this.whitePlayerSprite16Width, this.whitePlayerSprite16Height);
        this.whitePlayerSprite17 = new WritableImage(this.pixelReader, this.whitePlayerSprite17PositionX, this.whitePlayerSprite17PositionY, this.whitePlayerSprite17Width, this.whitePlayerSprite17Height);
        this.whitePlayerSprite18 = new WritableImage(this.pixelReader, this.whitePlayerSprite18PositionX, this.whitePlayerSprite18PositionY, this.whitePlayerSprite18Width, this.whitePlayerSprite18Height);
        this.whitePlayerSprite19 = new WritableImage(this.pixelReader, this.whitePlayerSprite19PositionX, this.whitePlayerSprite19PositionY, this.whitePlayerSprite19Width, this.whitePlayerSprite19Height);
        this.whitePlayerSprite20 = new WritableImage(this.pixelReader, this.whitePlayerSprite20PositionX, this.whitePlayerSprite20PositionY, this.whitePlayerSprite20Width, this.whitePlayerSprite20Height);

        this.bluePlayerSprite1 = new WritableImage(this.pixelReader, this.bluePlayerSprite1PositionX, this.bluePlayerSprite1PositionY, this.bluePlayerSprite1Width, this.bluePlayerSprite1Height);
        this.bluePlayerSprite2 = new WritableImage(this.pixelReader, this.bluePlayerSprite2PositionX, this.bluePlayerSprite2PositionY, this.bluePlayerSprite2Width, this.bluePlayerSprite2Height);
        this.bluePlayerSprite3 = new WritableImage(this.pixelReader, this.bluePlayerSprite3PositionX, this.bluePlayerSprite3PositionY, this.bluePlayerSprite3Width, this.bluePlayerSprite3Height);
        this.bluePlayerSprite4 = new WritableImage(this.pixelReader, this.bluePlayerSprite4PositionX, this.bluePlayerSprite4PositionY, this.bluePlayerSprite4Width, this.bluePlayerSprite4Height);
        this.bluePlayerSprite5 = new WritableImage(this.pixelReader, this.bluePlayerSprite5PositionX, this.bluePlayerSprite5PositionY, this.bluePlayerSprite5Width, this.bluePlayerSprite5Height);
        this.bluePlayerSprite6 = new WritableImage(this.pixelReader, this.bluePlayerSprite6PositionX, this.bluePlayerSprite6PositionY, this.bluePlayerSprite6Width, this.bluePlayerSprite6Height);
        this.bluePlayerSprite7 = new WritableImage(this.pixelReader, this.bluePlayerSprite7PositionX, this.bluePlayerSprite7PositionY, this.bluePlayerSprite7Width, this.bluePlayerSprite7Height);
        this.bluePlayerSprite8 = new WritableImage(this.pixelReader, this.bluePlayerSprite8PositionX, this.bluePlayerSprite8PositionY, this.bluePlayerSprite8Width, this.bluePlayerSprite8Height);
        this.bluePlayerSprite9 = new WritableImage(this.pixelReader, this.bluePlayerSprite9PositionX, this.bluePlayerSprite9PositionY, this.bluePlayerSprite9Width, this.bluePlayerSprite9Height);
        this.bluePlayerSprite10 = new WritableImage(this.pixelReader, this.bluePlayerSprite10PositionX, this.bluePlayerSprite10PositionY, this.bluePlayerSprite10Width, this.bluePlayerSprite10Height);
        this.bluePlayerSprite11 = new WritableImage(this.pixelReader, this.bluePlayerSprite11PositionX, this.bluePlayerSprite11PositionY, this.bluePlayerSprite11Width, this.bluePlayerSprite11Height);
        this.bluePlayerSprite12 = new WritableImage(this.pixelReader, this.bluePlayerSprite12PositionX, this.bluePlayerSprite12PositionY, this.bluePlayerSprite12Width, this.bluePlayerSprite12Height);
        this.bluePlayerSprite13 = new WritableImage(this.pixelReader, this.bluePlayerSprite13PositionX, this.bluePlayerSprite13PositionY, this.bluePlayerSprite13Width, this.bluePlayerSprite13Height);
        this.bluePlayerSprite14 = new WritableImage(this.pixelReader, this.bluePlayerSprite14PositionX, this.bluePlayerSprite14PositionY, this.bluePlayerSprite14Width, this.bluePlayerSprite14Height);
        this.bluePlayerSprite15 = new WritableImage(this.pixelReader, this.bluePlayerSprite15PositionX, this.bluePlayerSprite15PositionY, this.bluePlayerSprite15Width, this.bluePlayerSprite15Height);
        this.bluePlayerSprite16 = new WritableImage(this.pixelReader, this.bluePlayerSprite16PositionX, this.bluePlayerSprite16PositionY, this.bluePlayerSprite16Width, this.bluePlayerSprite16Height);
        this.bluePlayerSprite17 = new WritableImage(this.pixelReader, this.bluePlayerSprite17PositionX, this.bluePlayerSprite17PositionY, this.bluePlayerSprite17Width, this.bluePlayerSprite17Height);
        this.bluePlayerSprite18 = new WritableImage(this.pixelReader, this.bluePlayerSprite18PositionX, this.bluePlayerSprite18PositionY, this.bluePlayerSprite18Width, this.bluePlayerSprite18Height);
        this.bluePlayerSprite19 = new WritableImage(this.pixelReader, this.bluePlayerSprite19PositionX, this.bluePlayerSprite19PositionY, this.bluePlayerSprite19Width, this.bluePlayerSprite19Height);
        this.bluePlayerSprite20 = new WritableImage(this.pixelReader, this.bluePlayerSprite20PositionX, this.bluePlayerSprite20PositionY, this.bluePlayerSprite20Width, this.bluePlayerSprite20Height);

        this.greenPlayerSprite1 = new WritableImage(this.pixelReader, this.greenPlayerSprite1PositionX, this.greenPlayerSprite1PositionY, this.greenPlayerSprite1Width, this.greenPlayerSprite1Height);
        this.greenPlayerSprite2 = new WritableImage(this.pixelReader, this.greenPlayerSprite2PositionX, this.greenPlayerSprite2PositionY, this.greenPlayerSprite2Width, this.greenPlayerSprite2Height);
        this.greenPlayerSprite3 = new WritableImage(this.pixelReader, this.greenPlayerSprite3PositionX, this.greenPlayerSprite3PositionY, this.greenPlayerSprite3Width, this.greenPlayerSprite3Height);
        this.greenPlayerSprite4 = new WritableImage(this.pixelReader, this.greenPlayerSprite4PositionX, this.greenPlayerSprite4PositionY, this.greenPlayerSprite4Width, this.greenPlayerSprite4Height);
        this.greenPlayerSprite5 = new WritableImage(this.pixelReader, this.greenPlayerSprite5PositionX, this.greenPlayerSprite5PositionY, this.greenPlayerSprite5Width, this.greenPlayerSprite5Height);
        this.greenPlayerSprite6 = new WritableImage(this.pixelReader, this.greenPlayerSprite6PositionX, this.greenPlayerSprite6PositionY, this.greenPlayerSprite6Width, this.greenPlayerSprite6Height);
        this.greenPlayerSprite7 = new WritableImage(this.pixelReader, this.greenPlayerSprite7PositionX, this.greenPlayerSprite7PositionY, this.greenPlayerSprite7Width, this.greenPlayerSprite7Height);
        this.greenPlayerSprite8 = new WritableImage(this.pixelReader, this.greenPlayerSprite8PositionX, this.greenPlayerSprite8PositionY, this.greenPlayerSprite8Width, this.greenPlayerSprite8Height);
        this.greenPlayerSprite9 = new WritableImage(this.pixelReader, this.greenPlayerSprite9PositionX, this.greenPlayerSprite9PositionY, this.greenPlayerSprite9Width, this.greenPlayerSprite9Height);
        this.greenPlayerSprite10 = new WritableImage(this.pixelReader, this.greenPlayerSprite10PositionX, this.greenPlayerSprite10PositionY, this.greenPlayerSprite10Width, this.greenPlayerSprite10Height);
        this.greenPlayerSprite11 = new WritableImage(this.pixelReader, this.greenPlayerSprite11PositionX, this.greenPlayerSprite11PositionY, this.greenPlayerSprite11Width, this.greenPlayerSprite11Height);
        this.greenPlayerSprite12 = new WritableImage(this.pixelReader, this.greenPlayerSprite12PositionX, this.greenPlayerSprite12PositionY, this.greenPlayerSprite12Width, this.greenPlayerSprite12Height);
        this.greenPlayerSprite13 = new WritableImage(this.pixelReader, this.greenPlayerSprite13PositionX, this.greenPlayerSprite13PositionY, this.greenPlayerSprite13Width, this.greenPlayerSprite13Height);
        this.greenPlayerSprite14 = new WritableImage(this.pixelReader, this.greenPlayerSprite14PositionX, this.greenPlayerSprite14PositionY, this.greenPlayerSprite14Width, this.greenPlayerSprite14Height);
        this.greenPlayerSprite15 = new WritableImage(this.pixelReader, this.greenPlayerSprite15PositionX, this.greenPlayerSprite15PositionY, this.greenPlayerSprite15Width, this.greenPlayerSprite15Height);
        this.greenPlayerSprite16 = new WritableImage(this.pixelReader, this.greenPlayerSprite16PositionX, this.greenPlayerSprite16PositionY, this.greenPlayerSprite16Width, this.greenPlayerSprite16Height);
        this.greenPlayerSprite17 = new WritableImage(this.pixelReader, this.greenPlayerSprite17PositionX, this.greenPlayerSprite17PositionY, this.greenPlayerSprite17Width, this.greenPlayerSprite17Height);
        this.greenPlayerSprite18 = new WritableImage(this.pixelReader, this.greenPlayerSprite18PositionX, this.greenPlayerSprite18PositionY, this.greenPlayerSprite18Width, this.greenPlayerSprite18Height);
        this.greenPlayerSprite19 = new WritableImage(this.pixelReader, this.greenPlayerSprite19PositionX, this.greenPlayerSprite19PositionY, this.greenPlayerSprite19Width, this.greenPlayerSprite19Height);
        this.greenPlayerSprite20 = new WritableImage(this.pixelReader, this.greenPlayerSprite20PositionX, this.greenPlayerSprite20PositionY, this.greenPlayerSprite20Width, this.greenPlayerSprite20Height);

        this.yellowPlayerSprite1 = new WritableImage(this.pixelReader, this.yellowPlayerSprite1PositionX, this.yellowPlayerSprite1PositionY, this.yellowPlayerSprite1Width, this.yellowPlayerSprite1Height);
        this.yellowPlayerSprite2 = new WritableImage(this.pixelReader, this.yellowPlayerSprite2PositionX, this.yellowPlayerSprite2PositionY, this.yellowPlayerSprite2Width, this.yellowPlayerSprite2Height);
        this.yellowPlayerSprite3 = new WritableImage(this.pixelReader, this.yellowPlayerSprite3PositionX, this.yellowPlayerSprite3PositionY, this.yellowPlayerSprite3Width, this.yellowPlayerSprite3Height);
        this.yellowPlayerSprite4 = new WritableImage(this.pixelReader, this.yellowPlayerSprite4PositionX, this.yellowPlayerSprite4PositionY, this.yellowPlayerSprite4Width, this.yellowPlayerSprite4Height);
        this.yellowPlayerSprite5 = new WritableImage(this.pixelReader, this.yellowPlayerSprite5PositionX, this.yellowPlayerSprite5PositionY, this.yellowPlayerSprite5Width, this.yellowPlayerSprite5Height);
        this.yellowPlayerSprite6 = new WritableImage(this.pixelReader, this.yellowPlayerSprite6PositionX, this.yellowPlayerSprite6PositionY, this.yellowPlayerSprite6Width, this.yellowPlayerSprite6Height);
        this.yellowPlayerSprite7 = new WritableImage(this.pixelReader, this.yellowPlayerSprite7PositionX, this.yellowPlayerSprite7PositionY, this.yellowPlayerSprite7Width, this.yellowPlayerSprite7Height);
        this.yellowPlayerSprite8 = new WritableImage(this.pixelReader, this.yellowPlayerSprite8PositionX, this.yellowPlayerSprite8PositionY, this.yellowPlayerSprite8Width, this.yellowPlayerSprite8Height);
        this.yellowPlayerSprite9 = new WritableImage(this.pixelReader, this.yellowPlayerSprite9PositionX, this.yellowPlayerSprite9PositionY, this.yellowPlayerSprite9Width, this.yellowPlayerSprite9Height);
        this.yellowPlayerSprite10 = new WritableImage(this.pixelReader, this.yellowPlayerSprite10PositionX, this.yellowPlayerSprite10PositionY, this.yellowPlayerSprite10Width, this.yellowPlayerSprite10Height);
        this.yellowPlayerSprite11 = new WritableImage(this.pixelReader, this.yellowPlayerSprite11PositionX, this.yellowPlayerSprite11PositionY, this.yellowPlayerSprite11Width, this.yellowPlayerSprite11Height);
        this.yellowPlayerSprite12 = new WritableImage(this.pixelReader, this.yellowPlayerSprite12PositionX, this.yellowPlayerSprite12PositionY, this.yellowPlayerSprite12Width, this.yellowPlayerSprite12Height);
        this.yellowPlayerSprite13 = new WritableImage(this.pixelReader, this.yellowPlayerSprite13PositionX, this.yellowPlayerSprite13PositionY, this.yellowPlayerSprite13Width, this.yellowPlayerSprite13Height);
        this.yellowPlayerSprite14 = new WritableImage(this.pixelReader, this.yellowPlayerSprite14PositionX, this.yellowPlayerSprite14PositionY, this.yellowPlayerSprite14Width, this.yellowPlayerSprite14Height);
        this.yellowPlayerSprite15 = new WritableImage(this.pixelReader, this.yellowPlayerSprite15PositionX, this.yellowPlayerSprite15PositionY, this.yellowPlayerSprite15Width, this.yellowPlayerSprite15Height);
        this.yellowPlayerSprite16 = new WritableImage(this.pixelReader, this.yellowPlayerSprite16PositionX, this.yellowPlayerSprite16PositionY, this.yellowPlayerSprite16Width, this.yellowPlayerSprite16Height);
        this.yellowPlayerSprite17 = new WritableImage(this.pixelReader, this.yellowPlayerSprite17PositionX, this.yellowPlayerSprite17PositionY, this.yellowPlayerSprite17Width, this.yellowPlayerSprite17Height);
        this.yellowPlayerSprite18 = new WritableImage(this.pixelReader, this.yellowPlayerSprite18PositionX, this.yellowPlayerSprite18PositionY, this.yellowPlayerSprite18Width, this.yellowPlayerSprite18Height);
        this.yellowPlayerSprite19 = new WritableImage(this.pixelReader, this.yellowPlayerSprite19PositionX, this.yellowPlayerSprite19PositionY, this.yellowPlayerSprite19Width, this.yellowPlayerSprite19Height);
        this.yellowPlayerSprite20 = new WritableImage(this.pixelReader, this.yellowPlayerSprite20PositionX, this.yellowPlayerSprite20PositionY, this.yellowPlayerSprite20Width, this.yellowPlayerSprite20Height);

        this.arenaUpperLeftCornerSprite = new WritableImage(this.pixelReader, this.arenaUpperLeftCornerSpritePositionX, this.arenaUpperLeftCornerSpritePositionY, this.arenaUpperLeftCornerSpriteWidth, this.arenaUpperLeftCornerSpriteHeight);
        this.arenaUpperRightCornerSprite = new WritableImage(this.pixelReader, this.arenaUpperRightCornerSpritePositionX, this.arenaUpperRightCornerSpritePositionY, this.arenaUpperRightCornerSpriteWidth, this.arenaUpperRightCornerSpriteHeight);
        this.arenaDownRightCornerSprite = new WritableImage(this.pixelReader, this.arenaDownRightCornerSpritePositionX, this.arenaDownRightCornerSpritePositionY, this.arenaDownRightCornerSpriteWidth, this.arenaDownRightCornerSpriteHeight);
        this.arenaDownLeftCornerSprite = new WritableImage(this.pixelReader, this.arenaDownLeftCornerSpritePositionX, this.arenaDownLeftCornerSpritePositionY, this.arenaDownLeftCornerSpriteWidth, this.arenaDownLeftCornerSpriteHeight);

        this.arenaLeftWallSprite = new WritableImage(this.pixelReader, this.arenaLeftWallSpritePositionX, this.arenaLeftWallSpritePositionY, this.arenaLeftWallSpriteWidth, this.arenaLeftWallSpriteHeight);
        this.arenaRightWallSprite = new WritableImage(this.pixelReader, this.arenaRightWallSpritePositionX, this.arenaRightWallSpritePositionY, this.arenaRightWallSpriteWidth, this.arenaRightWallSpriteHeight);
        this.arenaDownWallSprite = new WritableImage(this.pixelReader, this.arenaDownWallSpritePositionX, this.arenaDownWallSpritePositionY, this.arenaDownWallSpriteWidth, this.arenaDownWallSpriteHeight);
        this.arenaUpperWallSprite = new WritableImage(this.pixelReader, this.arenaUpperWallSpritePositionX, this.arenaUpperWallSpritePositionY, this.arenaUpperWallSpriteWidth, this.arenaUpperWallSpriteHeight);

        this.flamePowerUpSprite2 = new WritableImage(this.pixelReader, this.flamePowerUpSprite2PositionX, this.flamePowerUpSprite2PositionY, this.flamePowerUpSprite2Width, this.flamePowerUpSprite2Height);
        this.bombPowerUpSprite2 = new WritableImage(this.pixelReader, this.bombPowerUpSprite2PositionX, this.bombPowerUpSprite2PositionY, this.bombPowerUpSprite2Width, this.bombPowerUpSprite2Height);

        this.groundBlueSprite = new WritableImage(this.pixelReader, this.groundBlueSprite4PositionX, this.groundBlueSprite4PositionY, this.groundBlueSprite4Width, this.groundBlueSprite4Height);

        this.wallBreakableWaterLevelSprite = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpritePositionX, this.wallBreakableWaterLevelSpritePositionY, this.wallBreakableWaterLevelSpriteWidth, this.wallBreakableWaterLevelSpriteHeight);

        this.wallBreakableWaterLevelExplodedSprite1 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded1PositionX, this.wallBreakableWaterLevelSpriteExploded1PositionY, this.wallBreakableWaterLevelSpriteExploded1Width, this.wallBreakableWaterLevelSpriteExploded1Height);
        this.wallBreakableWaterLevelExplodedSprite2 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded2PositionX, this.wallBreakableWaterLevelSpriteExploded2PositionY, this.wallBreakableWaterLevelSpriteExploded2Width, this.wallBreakableWaterLevelSpriteExploded2Height);
        this.wallBreakableWaterLevelExplodedSprite3 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded3PositionX, this.wallBreakableWaterLevelSpriteExploded3PositionY, this.wallBreakableWaterLevelSpriteExploded3Width, this.wallBreakableWaterLevelSpriteExploded3Height);
        this.wallBreakableWaterLevelExplodedSprite4 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded4PositionX, this.wallBreakableWaterLevelSpriteExploded4PositionY, this.wallBreakableWaterLevelSpriteExploded4Width, this.wallBreakableWaterLevelSpriteExploded4Height);
        this.wallBreakableWaterLevelExplodedSprite5 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded5PositionX, this.wallBreakableWaterLevelSpriteExploded5PositionY, this.wallBreakableWaterLevelSpriteExploded5Width, this.wallBreakableWaterLevelSpriteExploded5Height);
        this.wallBreakableWaterLevelExplodedSprite6 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded6PositionX, this.wallBreakableWaterLevelSpriteExploded6PositionY, this.wallBreakableWaterLevelSpriteExploded6Width, this.wallBreakableWaterLevelSpriteExploded6Height);
        this.wallBreakableWaterLevelExplodedSprite7 = new WritableImage(this.pixelReader, this.wallBreakableWaterLevelSpriteExploded7PositionX, this.wallBreakableWaterLevelSpriteExploded7PositionY, this.wallBreakableWaterLevelSpriteExploded7Width, this.wallBreakableWaterLevelSpriteExploded7Height);
        this.groundWaterSprite1 = new WritableImage(this.pixelReader, this.groundWaterSprite1PositionX, this.groundWaterSprite1PositionY, this.groundWaterSprite1Width, this.groundWaterSprite1Height);

        this.waterLevelWallSprite = new WritableImage(this.pixelReader, this.waterLevelWallSpritePositionX, this.waterLevelWallSpritePositionY, this.waterLevelWallSpriteWidth, this.waterLevelWallSpriteHeight);

        this.playerRunningInWaterSprite1 = new WritableImage(this.pixelReader, this.playerRunningInWaterSprite1PositionX, this.playerRunningInWaterSprite1PositionY, this.playerRunningInWaterSprite1Width, this.playerRunningInWaterSprite1Height);
        this.playerRunningInWaterSprite2 = new WritableImage(this.pixelReader, this.playerRunningInWaterSprite2PositionX, this.playerRunningInWaterSprite2PositionY, this.playerRunningInWaterSprite2Width, this.playerRunningInWaterSprite2Height);
        this.playerRunningInWaterSprite3 = new WritableImage(this.pixelReader, this.playerRunningInWaterSprite3PositionX, this.playerRunningInWaterSprite3PositionY, this.playerRunningInWaterSprite3Width, this.playerRunningInWaterSprite3Height);
        this.playerStandingInWaterSprite1 = new WritableImage(this.pixelReader, this.playerStandingInWaterSprite1PositionX, this.playerStandingInWaterSprite1PositionY, this.playerStandingInWaterSprite1Width, this.playerStandingInWaterSprite1Height);
        this.playerStandingInWaterSprite2 = new WritableImage(this.pixelReader, this.playerStandingInWaterSprite2PositionX, this.playerStandingInWaterSprite2PositionY, this.playerStandingInWaterSprite2Width, this.playerStandingInWaterSprite2Height);

        this.wallBreakableClassicLevelSprite = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelSprite1PositionX, this.wallBreakableClassicLevelSprite1PositionY, this.wallBreakableClassicLevelSprite1Width, this.wallBreakableClassicLevelSprite1Height);

        this.wallBreakableClassicLevelExplodedSprite1 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite1PositionX, this.wallBreakableClassicLevelExplodedSprite1PositionY, this.wallBreakableClassicLevelExplodedSprite1Width, this.wallBreakableClassicLevelExplodedSprite1Height);
        this.wallBreakableClassicLevelExplodedSprite2 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite2PositionX, this.wallBreakableClassicLevelExplodedSprite2PositionY, this.wallBreakableClassicLevelExplodedSprite2Width, this.wallBreakableClassicLevelExplodedSprite2Height);
        this.wallBreakableClassicLevelExplodedSprite3 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite3PositionX, this.wallBreakableClassicLevelExplodedSprite3PositionY, this.wallBreakableClassicLevelExplodedSprite3Width, this.wallBreakableClassicLevelExplodedSprite3Height);
        this.wallBreakableClassicLevelExplodedSprite4 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite4PositionX, this.wallBreakableClassicLevelExplodedSprite4PositionY, this.wallBreakableClassicLevelExplodedSprite4Width, this.wallBreakableClassicLevelExplodedSprite4Height);
        this.wallBreakableClassicLevelExplodedSprite5 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite5PositionX, this.wallBreakableClassicLevelExplodedSprite5PositionY, this.wallBreakableClassicLevelExplodedSprite5Width, this.wallBreakableClassicLevelExplodedSprite5Height);
        this.wallBreakableClassicLevelExplodedSprite6 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite6PositionX, this.wallBreakableClassicLevelExplodedSprite6PositionY, this.wallBreakableClassicLevelExplodedSprite6Width, this.wallBreakableClassicLevelExplodedSprite6Height);
        this.wallBreakableClassicLevelExplodedSprite7 = new WritableImage(this.pixelReader, this.wallBreakableClassicLevelExplodedSprite7PositionX, this.wallBreakableClassicLevelExplodedSprite7PositionY, this.wallBreakableClassicLevelExplodedSprite7Width, this.wallBreakableClassicLevelExplodedSprite7Height);
        this.groundWaterSprite1 = new WritableImage(this.pixelReader, this.groundWaterSprite1PositionX, this.groundWaterSprite1PositionY, this.groundWaterSprite1Width, this.groundWaterSprite1Height);
    }
}
