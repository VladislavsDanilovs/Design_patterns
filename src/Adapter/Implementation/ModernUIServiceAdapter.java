package Adapter.Implementation;

public class ModernUIServiceAdapter implements IModernApp {

    private final ModernUIService modernUIService;

    public ModernUIServiceAdapter() {
        modernUIService = new ModernUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        modernUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Recommendations using converted JSON data...");
        modernUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }

}

