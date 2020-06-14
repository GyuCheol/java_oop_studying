package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        registry.registerRedStampCreator("RedStamp");
        registry.registerBlueStampCreator("BlueStamp");
        registry.registerGreenStampCreator("GreenStamp");

        registry.registerWallCalendarCreator("WallCalendar");
        registry.registerMagnetCalendarCreator("MagnetCalendar");
        registry.registerDeskCalendarCreator("DeskCalendar");

        registry.registerLandscapeBannerCreator("Banner", "createBanner");
        registry.registerPortraitBannerCreator("Banner", "createBanner");

        registry.registerGlossBannerCreator("GlossBanner");
        registry.registerScrimBannerCreator("ScrimBanner");
        registry.registerMeshBannerCreator("MeshBanner");

        registry.registerLandscapeBusinessCardCreator("BusinessCard", "createBusinessCard");
        registry.registerPortraitBusinessCardCreator("BusinessCard", "createBusinessCard");
        registry.registerIvoryBusinessCardCreator("BusinessCard", "createBusinessCard");
        registry.registerGrayBusinessCardCreator("BusinessCard", "createBusinessCard");
        registry.registerWhiteBusinessCardCreator("BusinessCard", "createBusinessCard");

        registry.registerLaidBusinessCardCreator("LaidBusinessCard");
        registry.registerLinenBusinessCardCreator("LinenBusinessCard");
        registry.registerSmoothBusinessCardCreator("SmoothBusinessCard");

        registry.registerSingleSidedBusinessCardCreator("BusinessCard", "createBusinessCard");
        registry.registerDoubleSidedBusinessCardCreator("BusinessCard", "createBusinessCard");

        registry.registerCartCreator("Cart");
        registry.registerProductAdder("Cart", "addCartItem");
        registry.registerProductRemover("Cart", "removeCartItem");
        registry.registerTotalPriceGetter("Cart", "getTotalPrice");

        registry.registerLandscapeBannerTextApertureAdder("HQProduct", "addTextElement");
        registry.registerLandscapeBannerImageApertureAdder("HQProduct", "addImageElement");
        registry.registerPortraitBannerTextApertureAdder("HQProduct", "addTextElement");
        registry.registerPortraitBannerImageApertureAdder("HQProduct", "addImageElement");

        registry.registerGlossBannerTextApertureAdder("HQProduct", "addTextElement");
        registry.registerGlossBannerImageApertureAdder("HQProduct", "addImageElement");
        registry.registerScrimBannerTextApertureAdder("HQProduct", "addTextElement");
        registry.registerScrimBannerImageApertureAdder("HQProduct", "addImageElement");
        registry.registerMeshBannerTextApertureAdder("HQProduct", "addTextElement");
        registry.registerMeshBannerImageApertureAdder("HQProduct", "addImageElement");

        registry.registerLandscapeBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerLandscapeBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerPortraitBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerPortraitBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerIvoryBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerIvoryBusinnessCardImageApertureAdder("HQProduct", "addImageElement");

        registry.registerGrayBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerGrayBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerWhiteBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerWhiteBusinnessCardImageApertureAdder("HQProduct", "addImageElement");

        registry.registerLaidBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerLaidBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerLinenBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerLinenBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerSmoothBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerSmoothBusinnessCardImageApertureAdder("HQProduct", "addImageElement");

        registry.registerSingleSidedBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("HQProduct", "addImageElement");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("HQProduct", "addTextElement");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("HQProduct", "addImageElement");

    }
}