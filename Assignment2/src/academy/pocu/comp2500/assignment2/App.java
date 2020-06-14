package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        registry.registerRedStampCreator("Stamp");
        registry.registerBlueStampCreator("Stamp");
        registry.registerGreenStampCreator("Stamp");

        registry.registerWallCalendarCreator("Calendar");
        registry.registerMagnetCalendarCreator("Calendar");
        registry.registerDeskCalendarCreator("Calendar");

        registry.registerLandscapeBannerCreator("Banner");
        registry.registerPortraitBannerCreator("Banner");

        registry.registerGlossBannerCreator("Banner");
        registry.registerScrimBannerCreator("Banner");
        registry.registerMeshBannerCreator("Banner");

        registry.registerLandscapeBusinessCardCreator("BusinessCard");
        registry.registerPortraitBusinessCardCreator("BusinessCard");
        registry.registerIvoryBusinessCardCreator("BusinessCard");
        registry.registerGrayBusinessCardCreator("BusinessCard");
        registry.registerWhiteBusinessCardCreator("BusinessCard");

        registry.registerLaidBusinessCardCreator("BusinessCard");
        registry.registerLinenBusinessCardCreator("BusinessCard");
        registry.registerSmoothBusinessCardCreator("BusinessCard");

        registry.registerSingleSidedBusinessCardCreator("BusinessCard");
        registry.registerDoubleSidedBusinessCardCreator("BusinessCard");

        registry.registerCartCreator("Cart");
        registry.registerProductAdder("Cart", "addCartItem");
        registry.registerProductRemover("Cart", "removeCartItem");
        registry.registerTotalPriceGetter("Cart", "getTotalPrice");

        registry.registerLandscapeBannerTextApertureAdder("Product", "addTextElement");
        registry.registerLandscapeBannerImageApertureAdder("Product", "addImageElement");
        registry.registerPortraitBannerTextApertureAdder("Product", "addTextElement");
        registry.registerPortraitBannerImageApertureAdder("Product", "addImageElement");

        registry.registerGlossBannerTextApertureAdder("Product", "addTextElement");
        registry.registerGlossBannerImageApertureAdder("Product", "addImageElement");
        registry.registerScrimBannerTextApertureAdder("Product", "addTextElement");
        registry.registerScrimBannerImageApertureAdder("Product", "addImageElement");
        registry.registerMeshBannerTextApertureAdder("Product", "addTextElement");
        registry.registerMeshBannerImageApertureAdder("Product", "addImageElement");

        registry.registerLandscapeBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerLandscapeBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerPortraitBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerPortraitBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerIvoryBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerIvoryBusinnessCardImageApertureAdder("Product", "addImageElement");

        registry.registerGrayBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerGrayBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerWhiteBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerWhiteBusinnessCardImageApertureAdder("Product", "addImageElement");

        registry.registerLaidBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerLaidBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerLinenBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerLinenBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerSmoothBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerSmoothBusinnessCardImageApertureAdder("Product", "addImageElement");

        registry.registerSingleSidedBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("Product", "addImageElement");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("Product", "addTextElement");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("Product", "addImageElement");

    }
}