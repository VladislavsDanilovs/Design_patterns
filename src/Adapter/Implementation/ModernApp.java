package Adapter.Implementation;

public class ModernApp implements IModernApp {

    @Override
    public void displayMenus(XmlData xmlData) {
        // Displays menus using XML data
        System.out.println("Displaying Menus using XML data...");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        // Displays recommendations using XML data
        System.out.println("Displaying Recommendations using XML data...");
    }

}

