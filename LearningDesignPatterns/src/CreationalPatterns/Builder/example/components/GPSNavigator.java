package CreationalPatterns.Builder.example.components;

public class GPSNavigator {
    private String route;
    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
