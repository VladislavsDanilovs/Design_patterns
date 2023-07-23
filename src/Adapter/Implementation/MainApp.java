package Adapter.Implementation;

public class MainApp {

    public static void main(String[] args) {

        XmlData myData = new XmlData();

        // Old UI
        IModernApp modernApp = new ModernApp();
        modernApp.displayMenus(myData);
        modernApp.displayRecommendations(myData);

        System.out.println("==========================================");

        // New UI
        IModernApp adapter = new ModernUIServiceAdapter();
        adapter.displayMenus(myData);
        adapter.displayRecommendations(myData);

    }

}
