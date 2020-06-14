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

        registry.registerLandscapeBannerTextApertureAdder("ApertureProduct", "addElement");
        registry.registerLandscapeBannerImageApertureAdder("ApertureProduct", "addElement");
        registry.registerPortraitBannerTextApertureAdder("ApertureProduct", "addElement");
        registry.registerPortraitBannerImageApertureAdder("ApertureProduct", "addElement");

        registry.registerGlossBannerTextApertureAdder("ApertureProduct", "addElement");
        registry.registerGlossBannerImageApertureAdder("ApertureProduct", "addElement");
        registry.registerScrimBannerTextApertureAdder("ApertureProduct", "addElement");
        registry.registerScrimBannerImageApertureAdder("ApertureProduct", "addElement");
        registry.registerMeshBannerTextApertureAdder("ApertureProduct", "addElement");
        registry.registerMeshBannerImageApertureAdder("ApertureProduct", "addElement");

        registry.registerLandscapeBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerLandscapeBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerPortraitBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerPortraitBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerIvoryBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerIvoryBusinnessCardImageApertureAdder("ApertureProduct", "addElement");

        registry.registerGrayBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerGrayBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerWhiteBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerWhiteBusinnessCardImageApertureAdder("ApertureProduct", "addElement");

        registry.registerLaidBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerLaidBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerLinenBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerLinenBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerSmoothBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerSmoothBusinnessCardImageApertureAdder("ApertureProduct", "addElement");

        registry.registerSingleSidedBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("ApertureProduct", "addElement");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("ApertureProduct", "addElement");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("ApertureProduct", "addElement");

    }
}