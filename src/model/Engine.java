package model;

/**
 * See the notes in the Car class as they are essentially identical to this class.
 * We are not including setters here because we set the values via the construcdtor
 */
public class Engine {

    private String engineSize;
    private String engineType;

    public Engine(String engineSize, String engineType) {
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }


    public String getEngineSize() {
        return engineSize;
    }



    @Override
    public String toString() {
        return "Engine{" +
                "engineSize='" + engineSize + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
